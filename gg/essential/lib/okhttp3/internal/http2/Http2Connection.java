package gg.essential.lib.okhttp3.internal.http2;

import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import gg.essential.lib.okhttp3.internal.*;
import gg.essential.lib.okio.*;

public final class Http2Connection implements Closeable
{
    static final ExecutorService executor;
    final boolean client;
    final Listener listener;
    final Map<Integer, Http2Stream> streams;
    final String hostname;
    int lastGoodStreamId;
    int nextStreamId;
    boolean shutdown;
    private final ExecutorService pushExecutor;
    private Map<Integer, Ping> pings;
    final PushObserver pushObserver;
    long unacknowledgedBytesRead;
    long bytesLeftInWriteWindow;
    Settings okHttpSettings;
    final Settings peerSettings;
    boolean receivedInitialPeerSettings;
    final Socket socket;
    final Http2Writer writer;
    final ReaderRunnable readerRunnable;
    final Set<Integer> currentPushRequests;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    Http2Connection(final Builder builder) {
        super();
        this.streams = new LinkedHashMap<Integer, Http2Stream>();
        this.unacknowledgedBytesRead = 0L;
        this.okHttpSettings = new Settings();
        this.peerSettings = new Settings();
        this.receivedInitialPeerSettings = false;
        this.currentPushRequests = new LinkedHashSet<Integer>();
        this.pushObserver = builder.pushObserver;
        this.client = builder.client;
        this.listener = builder.listener;
        this.nextStreamId = (builder.client ? 1 : 2);
        if (builder.client) {
            this.nextStreamId += 2;
        }
        if (builder.client) {
            this.okHttpSettings.set(7, 16777216);
        }
        this.hostname = builder.hostname;
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.hostname), true));
        this.peerSettings.set(7, 65535);
        this.peerSettings.set(5, 16384);
        this.bytesLeftInWriteWindow = this.peerSettings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, this.client);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, this.client));
    }
    
    synchronized Http2Stream getStream(final int id) {
        return this.streams.get(id);
    }
    
    synchronized Http2Stream removeStream(final int streamId) {
        final Http2Stream stream = this.streams.remove(streamId);
        this.notifyAll();
        return stream;
    }
    
    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams$134621();
    }
    
    public Http2Stream newStream(final List<Header> requestHeaders, final boolean out) throws IOException {
        return this.newStream$9238d7d(requestHeaders, out);
    }
    
    private Http2Stream newStream$9238d7d(final List<Header> requestHeaders, final boolean out) throws IOException {
        final boolean outFinished = !out;
        final Http2Stream stream;
        final boolean flushHeaders;
        synchronized (this.writer) {
            final int streamId;
            synchronized (this) {
                if (this.shutdown) {
                    throw new ConnectionShutdownException();
                }
                streamId = this.nextStreamId;
                this.nextStreamId += 2;
                stream = new Http2Stream(streamId, this, outFinished, false, requestHeaders);
                flushHeaders = (!out || this.bytesLeftInWriteWindow == 0L || stream.bytesLeftInWriteWindow == 0L);
                if (stream.isOpen()) {
                    this.streams.put(streamId, stream);
                }
            }
            this.writer.synStream$64c3d190(outFinished, streamId, requestHeaders);
        }
        if (flushHeaders) {
            this.writer.flush();
        }
        return stream;
    }
    
    public void writeData(final int streamId, final boolean outFinished, final Buffer buffer, long byteCount) throws IOException {
        if (byteCount == 0L) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0L) {
            int toWrite;
            synchronized (this) {
                try {
                    while (this.bytesLeftInWriteWindow <= 0L) {
                        if (!this.streams.containsKey(streamId)) {
                            throw new IOException("stream closed");
                        }
                        this.wait();
                    }
                }
                catch (final InterruptedException ex) {
                    throw new InterruptedIOException();
                }
                toWrite = (int)Math.min(byteCount, this.bytesLeftInWriteWindow);
                toWrite = Math.min(toWrite, this.writer.maxDataLength());
                this.bytesLeftInWriteWindow -= toWrite;
            }
            byteCount -= toWrite;
            this.writer.data(outFinished && byteCount == 0L, streamId, buffer, toWrite);
        }
    }
    
    void addBytesToWriteWindow(final long delta) {
        this.bytesLeftInWriteWindow += delta;
        if (delta > 0L) {
            this.notifyAll();
        }
    }
    
    void writeSynResetLater(final int streamId, final ErrorCode errorCode) {
        Http2Connection.executor.execute((Runnable)new Http2Connection.Http2Connection$1(this, "OkHttp %s stream %d", new Object[] { this.hostname, streamId }, streamId, errorCode));
    }
    
    void writeSynReset(final int streamId, final ErrorCode statusCode) throws IOException {
        this.writer.rstStream(streamId, statusCode);
    }
    
    void writeWindowUpdateLater(final int streamId, final long unacknowledgedBytesRead) {
        Http2Connection.executor.execute((Runnable)new Http2Connection.Http2Connection$2(this, "OkHttp Window Update %s stream %d", new Object[] { this.hostname, streamId }, streamId, unacknowledgedBytesRead));
    }
    
    void writePingLater$158b88b9(final int payload1, final int payload2, final Ping ping) {
        Http2Connection.executor.execute((Runnable)new Http2Connection.Http2Connection$3(this, "OkHttp %s ping %08x%08x", new Object[] { this.hostname, payload1, payload2 }, payload1, payload2, ping));
    }
    
    void writePing(final boolean reply, final int payload1, final int payload2, final Ping ping) throws IOException {
        synchronized (this.writer) {
            if (ping != null) {
                ping.send();
            }
            this.writer.ping(reply, payload1, payload2);
        }
    }
    
    synchronized Ping removePing(final int id) {
        return (this.pings != null) ? this.pings.remove(id) : null;
    }
    
    public void flush() throws IOException {
        this.writer.flush();
    }
    
    public void shutdown(final ErrorCode statusCode) throws IOException {
        synchronized (this.writer) {
            final int lastGoodStreamId;
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                lastGoodStreamId = this.lastGoodStreamId;
            }
            this.writer.goAway(lastGoodStreamId, statusCode, Util.EMPTY_BYTE_ARRAY);
        }
    }
    
    @Override
    public void close() throws IOException {
        this.close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }
    
    void close(final ErrorCode connectionCode, final ErrorCode streamCode) throws IOException {
        assert !Thread.holdsLock(this);
        IOException thrown = null;
        try {
            this.shutdown(connectionCode);
        }
        catch (final IOException e) {
            thrown = e;
        }
        Http2Stream[] streamsToClose = null;
        Ping[] pingsToCancel = null;
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                streamsToClose = this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                this.streams.clear();
            }
            if (this.pings != null) {
                pingsToCancel = this.pings.values().toArray(new Ping[this.pings.size()]);
                this.pings = null;
            }
        }
        if (streamsToClose != null) {
            for (final Http2Stream stream : streamsToClose) {
                try {
                    stream.close(streamCode);
                }
                catch (final IOException e2) {
                    if (thrown != null) {
                        thrown = e2;
                    }
                }
            }
        }
        if (pingsToCancel != null) {
            for (final Ping ping : pingsToCancel) {
                ping.cancel();
            }
        }
        try {
            this.writer.close();
        }
        catch (final IOException e3) {
            if (thrown == null) {
                thrown = e3;
            }
        }
        try {
            this.socket.close();
        }
        catch (final IOException e3) {
            thrown = e3;
        }
        if (thrown != null) {
            throw thrown;
        }
    }
    
    public void start() throws IOException {
        this.start$1385ff();
    }
    
    void start$1385ff() throws IOException {
        this.writer.connectionPreface();
        this.writer.settings(this.okHttpSettings);
        final int windowSize = this.okHttpSettings.getInitialWindowSize();
        if (windowSize != 65535) {
            this.writer.windowUpdate(0, windowSize - 65535);
        }
        new Thread(this.readerRunnable).start();
    }
    
    public synchronized boolean isShutdown() {
        return this.shutdown;
    }
    
    boolean pushedStream(final int streamId) {
        return streamId != 0 && (streamId & 0x1) == 0x0;
    }
    
    void pushRequestLater(final int streamId, final List<Header> requestHeaders) {
        synchronized (this) {
            if (this.currentPushRequests.contains(streamId)) {
                this.writeSynResetLater(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(streamId);
        }
        this.pushExecutor.execute((Runnable)new Http2Connection.Http2Connection$4(this, "OkHttp %s Push Request[%s]", new Object[] { this.hostname, streamId }, streamId));
    }
    
    void pushHeadersLater(final int streamId, final List<Header> requestHeaders, final boolean inFinished) {
        this.pushExecutor.execute((Runnable)new Http2Connection.Http2Connection$5(this, "OkHttp %s Push Headers[%s]", new Object[] { this.hostname, streamId }, streamId));
    }
    
    void pushDataLater(final int streamId, final BufferedSource source, final int byteCount, final boolean inFinished) throws IOException {
        final Buffer buffer = new Buffer();
        source.require(byteCount);
        source.read(buffer, byteCount);
        if (buffer.size() != byteCount) {
            throw new IOException(buffer.size() + " != " + byteCount);
        }
        this.pushExecutor.execute((Runnable)new Http2Connection.Http2Connection$6(this, "OkHttp %s Push Data[%s]", new Object[] { this.hostname, streamId }, streamId, buffer, byteCount));
    }
    
    void pushResetLater(final int streamId, final ErrorCode errorCode) {
        this.pushExecutor.execute((Runnable)new Http2Connection.Http2Connection$7(this, "OkHttp %s Push Reset[%s]", new Object[] { this.hostname, streamId }, streamId));
    }
    
    static {
        $assertionsDisabled = !Http2Connection.class.desiredAssertionStatus();
        executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Util.threadFactory("OkHttp Http2Connection", true));
    }
    
    public static class Builder
    {
        Socket socket;
        String hostname;
        BufferedSource source;
        BufferedSink sink;
        Listener listener;
        PushObserver pushObserver;
        boolean client;
        
        public Builder() {
            super();
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.client = true;
        }
        
        public Builder socket(final Socket socket, final String hostname, final BufferedSource source, final BufferedSink sink) {
            this.socket = socket;
            this.hostname = hostname;
            this.source = source;
            this.sink = sink;
            return this;
        }
        
        public Builder listener(final Listener listener) {
            this.listener = listener;
            return this;
        }
        
        public Http2Connection build() {
            return new Http2Connection(this);
        }
    }
    
    class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler
    {
        final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;
        
        ReaderRunnable(final Http2Connection this$0, final Http2Reader reader) {
            this.this$0 = this$0;
            super("OkHttp %s", new Object[] { this$0.hostname });
            this.reader = reader;
        }
        
        @Override
        protected void execute() {
            ErrorCode connectionErrorCode = ErrorCode.INTERNAL_ERROR;
            ErrorCode streamErrorCode = ErrorCode.INTERNAL_ERROR;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {}
                connectionErrorCode = ErrorCode.NO_ERROR;
                streamErrorCode = ErrorCode.CANCEL;
            }
            catch (final IOException ex) {
                connectionErrorCode = ErrorCode.PROTOCOL_ERROR;
                streamErrorCode = ErrorCode.PROTOCOL_ERROR;
            }
            finally {
                try {
                    this.this$0.close(connectionErrorCode, streamErrorCode);
                }
                catch (final IOException ex2) {}
                Util.closeQuietly(this.reader);
            }
        }
        
        @Override
        public void data(final boolean inFinished, final int streamId, final BufferedSource source, final int length) throws IOException {
            if (this.this$0.pushedStream(streamId)) {
                this.this$0.pushDataLater(streamId, source, length, inFinished);
                return;
            }
            final Http2Stream dataStream = this.this$0.getStream(streamId);
            if (dataStream == null) {
                this.this$0.writeSynResetLater(streamId, ErrorCode.PROTOCOL_ERROR);
                source.skip(length);
                return;
            }
            dataStream.receiveData(source, length);
            if (inFinished) {
                dataStream.receiveFin();
            }
        }
        
        @Override
        public void headers$64c3d190(final boolean inFinished, final int streamId, final List<Header> headerBlock) {
            if (this.this$0.pushedStream(streamId)) {
                this.this$0.pushHeadersLater(streamId, headerBlock, inFinished);
                return;
            }
            final Http2Stream stream;
            synchronized (this.this$0) {
                stream = this.this$0.getStream(streamId);
                if (stream == null) {
                    if (this.this$0.shutdown) {
                        return;
                    }
                    if (streamId <= this.this$0.lastGoodStreamId) {
                        return;
                    }
                    if (streamId % 2 == this.this$0.nextStreamId % 2) {
                        return;
                    }
                    final Http2Stream newStream = new Http2Stream(streamId, this.this$0, false, inFinished, headerBlock);
                    this.this$0.lastGoodStreamId = streamId;
                    this.this$0.streams.put(streamId, newStream);
                    Http2Connection.executor.execute((Runnable)new ReaderRunnable.Http2Connection$ReaderRunnable$1(this, "OkHttp %s stream %d", new Object[] { this.this$0.hostname, streamId }, newStream));
                    return;
                }
            }
            stream.receiveHeaders(headerBlock);
            if (inFinished) {
                stream.receiveFin();
            }
        }
        
        @Override
        public void rstStream(final int streamId, final ErrorCode errorCode) {
            if (this.this$0.pushedStream(streamId)) {
                this.this$0.pushResetLater(streamId, errorCode);
                return;
            }
            final Http2Stream rstStream = this.this$0.removeStream(streamId);
            if (rstStream != null) {
                rstStream.receiveRstStream(errorCode);
            }
        }
        
        @Override
        public void settings$14e94388(final Settings newSettings) {
            long delta = 0L;
            Http2Stream[] streamsToNotify = null;
            synchronized (this.this$0) {
                final int priorWriteWindowSize = this.this$0.peerSettings.getInitialWindowSize();
                this.this$0.peerSettings.merge(newSettings);
                this.applyAndAckSettings(newSettings);
                final int peerInitialWindowSize = this.this$0.peerSettings.getInitialWindowSize();
                if (peerInitialWindowSize != -1 && peerInitialWindowSize != priorWriteWindowSize) {
                    delta = peerInitialWindowSize - priorWriteWindowSize;
                    if (!this.this$0.receivedInitialPeerSettings) {
                        this.this$0.addBytesToWriteWindow(delta);
                        this.this$0.receivedInitialPeerSettings = true;
                    }
                    if (!this.this$0.streams.isEmpty()) {
                        streamsToNotify = this.this$0.streams.values().toArray(new Http2Stream[this.this$0.streams.size()]);
                    }
                }
                Http2Connection.executor.execute(new NamedRunnable("OkHttp %s settings", new Object[] { this.this$0.hostname }) {
                    final /* synthetic */ ReaderRunnable this$1;
                    
                    Http2Connection$ReaderRunnable$2(final String format, final Object... args) {
                        this.this$1 = this$1;
                        super(format, args);
                    }
                    
                    public void execute() {
                        this.this$1.this$0.listener.onSettings(this.this$1.this$0);
                    }
                });
            }
            if (streamsToNotify != null && delta != 0L) {
                for (final Http2Stream stream : streamsToNotify) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(delta);
                    }
                }
            }
        }
        
        private void applyAndAckSettings(final Settings peerSettings) {
            Http2Connection.executor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[] { this.this$0.hostname }) {
                final /* synthetic */ Settings val$peerSettings;
                final /* synthetic */ ReaderRunnable this$1;
                
                Http2Connection$ReaderRunnable$3(final String format, final Object[] args) {
                    this.this$1 = this$1;
                    super(format, args);
                }
                
                public void execute() {
                    try {
                        this.this$1.this$0.writer.applyAndAckSettings(peerSettings);
                    }
                    catch (final IOException ex) {}
                }
            });
        }
        
        @Override
        public void ping(final boolean reply, final int payload1, final int payload2) {
            if (reply) {
                final Ping ping = this.this$0.removePing(payload1);
                if (ping != null) {
                    ping.receive();
                }
            }
            else {
                this.this$0.writePingLater$158b88b9(payload1, payload2, null);
            }
        }
        
        @Override
        public void goAway$4b802bc(final int lastGoodStreamId, final ByteString debugData) {
            debugData.size();
            final Http2Stream[] streamsCopy;
            synchronized (this.this$0) {
                streamsCopy = this.this$0.streams.values().toArray(new Http2Stream[this.this$0.streams.size()]);
                this.this$0.shutdown = true;
            }
            for (final Http2Stream http2Stream : streamsCopy) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream(http2Stream.getId());
                }
            }
        }
        
        @Override
        public void windowUpdate(final int streamId, final long windowSizeIncrement) {
            if (streamId == 0) {
                synchronized (this.this$0) {
                    final Http2Connection this$0 = this.this$0;
                    this$0.bytesLeftInWriteWindow += windowSizeIncrement;
                    this.this$0.notifyAll();
                }
            }
            else {
                final Http2Stream stream = this.this$0.getStream(streamId);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(windowSizeIncrement);
                    }
                }
            }
        }
        
        @Override
        public void pushPromise$16014a7a(final int promisedStreamId, final List<Header> requestHeaders) {
            this.this$0.pushRequestLater(promisedStreamId, requestHeaders);
        }
    }
    
    public abstract static class Listener
    {
        public static final Listener REFUSE_INCOMING_STREAMS;
        
        public Listener() {
            super();
        }
        
        public abstract void onStream(final Http2Stream p0) throws IOException;
        
        public void onSettings(final Http2Connection connection) {
        }
        
        static {
            REFUSE_INCOMING_STREAMS = new Listener() {
                Http2Connection$Listener$1() {
                    super();
                }
                
                @Override
                public void onStream(final Http2Stream stream) throws IOException {
                    stream.close(ErrorCode.REFUSED_STREAM);
                }
            };
        }
    }
}
