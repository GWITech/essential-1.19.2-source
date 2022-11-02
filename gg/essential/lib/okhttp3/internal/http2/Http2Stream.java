package gg.essential.lib.okhttp3.internal.http2;

import java.util.*;
import java.io.*;
import gg.essential.lib.okio.*;
import java.net.*;

public final class Http2Stream
{
    long unacknowledgedBytesRead;
    long bytesLeftInWriteWindow;
    final int id;
    final Http2Connection connection;
    private List<Header> responseHeaders;
    private boolean hasResponseHeaders;
    private final FramingSource source;
    final FramingSink sink;
    final StreamTimeout readTimeout;
    final StreamTimeout writeTimeout;
    ErrorCode errorCode;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    Http2Stream(final int id, final Http2Connection connection, final boolean outFinished, final boolean inFinished, final List<Header> requestHeaders) {
        super();
        this.unacknowledgedBytesRead = 0L;
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        this.errorCode = null;
        if (connection == null) {
            throw new NullPointerException("connection == null");
        }
        if (requestHeaders == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.id = id;
        this.connection = connection;
        this.bytesLeftInWriteWindow = connection.peerSettings.getInitialWindowSize();
        this.source = new FramingSource(connection.okHttpSettings.getInitialWindowSize());
        this.sink = new FramingSink();
        this.source.finished = inFinished;
        this.sink.finished = outFinished;
    }
    
    public int getId() {
        return this.id;
    }
    
    public synchronized boolean isOpen() {
        return this.errorCode == null && ((!this.source.finished && !this.source.closed) || (!this.sink.finished && !this.sink.closed) || !this.hasResponseHeaders);
    }
    
    public boolean isLocallyInitiated() {
        final boolean streamIsClient = (this.id & 0x1) == 0x1;
        return this.connection.client == streamIsClient;
    }
    
    public synchronized List<Header> takeResponseHeaders() throws IOException {
        if (!this.isLocallyInitiated()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.readTimeout.enter();
        try {
            while (this.responseHeaders == null && this.errorCode == null) {
                this.waitForIo();
            }
        }
        finally {
            this.readTimeout.exitAndThrowIfTimedOut();
        }
        final List<Header> result = this.responseHeaders;
        if (result != null) {
            this.responseHeaders = null;
            return result;
        }
        throw new StreamResetException(this.errorCode);
    }
    
    public Timeout readTimeout() {
        return this.readTimeout;
    }
    
    public Timeout writeTimeout() {
        return this.writeTimeout;
    }
    
    public Source getSource() {
        return this.source;
    }
    
    public Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !this.isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }
    
    public void close(final ErrorCode rstStatusCode) throws IOException {
        if (!this.closeInternal(rstStatusCode)) {
            return;
        }
        this.connection.writeSynReset(this.id, rstStatusCode);
    }
    
    public void closeLater(final ErrorCode errorCode) {
        if (!this.closeInternal(errorCode)) {
            return;
        }
        this.connection.writeSynResetLater(this.id, errorCode);
    }
    
    private boolean closeInternal(final ErrorCode errorCode) {
        assert !Thread.holdsLock(this);
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            this.notifyAll();
        }
        this.connection.removeStream(this.id);
        return true;
    }
    
    void receiveHeaders(final List<Header> headers) {
        assert !Thread.holdsLock(this);
        boolean open = true;
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (this.responseHeaders == null) {
                this.responseHeaders = headers;
                open = this.isOpen();
                this.notifyAll();
            }
            else {
                final List<Header> newHeaders = new ArrayList<Header>();
                newHeaders.addAll(this.responseHeaders);
                newHeaders.add(null);
                newHeaders.addAll(headers);
                this.responseHeaders = newHeaders;
            }
        }
        if (!open) {
            this.connection.removeStream(this.id);
        }
    }
    
    void receiveData(final BufferedSource in, final int length) throws IOException {
        assert !Thread.holdsLock(this);
        this.source.receive(in, length);
    }
    
    void receiveFin() {
        assert !Thread.holdsLock(this);
        final boolean open;
        synchronized (this) {
            this.source.finished = true;
            open = this.isOpen();
            this.notifyAll();
        }
        if (!open) {
            this.connection.removeStream(this.id);
        }
    }
    
    synchronized void receiveRstStream(final ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            this.notifyAll();
        }
    }
    
    void cancelStreamIfNecessary() throws IOException {
        assert !Thread.holdsLock(this);
        final boolean cancel;
        final boolean open;
        synchronized (this) {
            cancel = (!this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed));
            open = this.isOpen();
        }
        if (cancel) {
            this.close(ErrorCode.CANCEL);
        }
        else if (!open) {
            this.connection.removeStream(this.id);
        }
    }
    
    void addBytesToWriteWindow(final long delta) {
        this.bytesLeftInWriteWindow += delta;
        if (delta > 0L) {
            this.notifyAll();
        }
    }
    
    void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        }
        if (this.sink.finished) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }
    
    void waitForIo() throws InterruptedIOException {
        try {
            this.wait();
        }
        catch (final InterruptedException ex) {
            throw new InterruptedIOException();
        }
    }
    
    static {
        $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
    }
    
    private final class FramingSource implements Source
    {
        private final Buffer receiveBuffer;
        private final Buffer readBuffer;
        private final long maxByteCount;
        boolean closed;
        boolean finished;
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ Http2Stream this$0;
        
        FramingSource(final Http2Stream this$0, final long maxByteCount) {
            this.this$0 = this$0;
            super();
            this.receiveBuffer = new Buffer();
            this.readBuffer = new Buffer();
            this.maxByteCount = maxByteCount;
        }
        
        @Override
        public long read(final Buffer sink, final long byteCount) throws IOException {
            if (byteCount < 0L) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            final long read;
            synchronized (this.this$0) {
                this.waitUntilReadable();
                this.checkNotClosed();
                if (this.readBuffer.size() == 0L) {
                    return -1L;
                }
                read = this.readBuffer.read(sink, Math.min(byteCount, this.readBuffer.size()));
                final Http2Stream this$0 = this.this$0;
                this$0.unacknowledgedBytesRead += read;
                if (this.this$0.unacknowledgedBytesRead >= this.this$0.connection.okHttpSettings.getInitialWindowSize() / 2) {
                    this.this$0.connection.writeWindowUpdateLater(this.this$0.id, this.this$0.unacknowledgedBytesRead);
                    this.this$0.unacknowledgedBytesRead = 0L;
                }
            }
            synchronized (this.this$0.connection) {
                final Http2Connection connection = this.this$0.connection;
                connection.unacknowledgedBytesRead += read;
                if (this.this$0.connection.unacknowledgedBytesRead >= this.this$0.connection.okHttpSettings.getInitialWindowSize() / 2) {
                    this.this$0.connection.writeWindowUpdateLater(0, this.this$0.connection.unacknowledgedBytesRead);
                    this.this$0.connection.unacknowledgedBytesRead = 0L;
                }
            }
            return read;
        }
        
        private void waitUntilReadable() throws IOException {
            this.this$0.readTimeout.enter();
            try {
                while (this.readBuffer.size() == 0L && !this.finished && !this.closed && this.this$0.errorCode == null) {
                    this.this$0.waitForIo();
                }
            }
            finally {
                this.this$0.readTimeout.exitAndThrowIfTimedOut();
            }
        }
        
        void receive(final BufferedSource in, long byteCount) throws IOException {
            assert !Thread.holdsLock(this.this$0);
            while (byteCount > 0L) {
                final boolean finished;
                final boolean flowControlError;
                synchronized (this.this$0) {
                    finished = this.finished;
                    flowControlError = (byteCount + this.readBuffer.size() > this.maxByteCount);
                }
                if (flowControlError) {
                    in.skip(byteCount);
                    this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished) {
                    in.skip(byteCount);
                    return;
                }
                final long read = in.read(this.receiveBuffer, byteCount);
                if (read == -1L) {
                    throw new EOFException();
                }
                byteCount -= read;
                synchronized (this.this$0) {
                    final boolean wasEmpty = this.readBuffer.size() == 0L;
                    this.readBuffer.writeAll(this.receiveBuffer);
                    if (!wasEmpty) {
                        continue;
                    }
                    this.this$0.notifyAll();
                }
            }
        }
        
        @Override
        public Timeout timeout() {
            return this.this$0.readTimeout;
        }
        
        @Override
        public void close() throws IOException {
            synchronized (this.this$0) {
                this.closed = true;
                this.readBuffer.clear();
                this.this$0.notifyAll();
            }
            this.this$0.cancelStreamIfNecessary();
        }
        
        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            }
            if (this.this$0.errorCode != null) {
                throw new StreamResetException(this.this$0.errorCode);
            }
        }
        
        static {
            $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
        }
    }
    
    final class FramingSink implements Sink
    {
        private final Buffer sendBuffer;
        boolean closed;
        boolean finished;
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ Http2Stream this$0;
        
        FramingSink(final Http2Stream this$0) {
            this.this$0 = this$0;
            super();
            this.sendBuffer = new Buffer();
        }
        
        @Override
        public void write(final Buffer source, final long byteCount) throws IOException {
            assert !Thread.holdsLock(this.this$0);
            this.sendBuffer.write(source, byteCount);
            while (this.sendBuffer.size() >= 16384L) {
                this.emitFrame(false);
            }
        }
        
        private void emitFrame(final boolean outFinished) throws IOException {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //     4: dup            
            //     5: astore          4
            //     7: monitorenter   
            //     8: aload_0         /* this */
            //     9: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    12: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //    15: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.enter:()V
            //    18: aload_0         /* this */
            //    19: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    22: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
            //    25: lconst_0       
            //    26: lcmp           
            //    27: ifgt            64
            //    30: aload_0         /* this */
            //    31: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.finished:Z
            //    34: ifne            64
            //    37: aload_0         /* this */
            //    38: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.closed:Z
            //    41: ifne            64
            //    44: aload_0         /* this */
            //    45: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    48: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.errorCode:Lgg/essential/lib/okhttp3/internal/http2/ErrorCode;
            //    51: ifnonnull       64
            //    54: aload_0         /* this */
            //    55: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    58: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream.waitForIo:()V
            //    61: goto            18
            //    64: aload_0         /* this */
            //    65: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    68: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //    71: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
            //    74: goto            92
            //    77: astore          5
            //    79: aload_0         /* this */
            //    80: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    83: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //    86: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
            //    89: aload           5
            //    91: athrow         
            //    92: aload_0         /* this */
            //    93: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //    96: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream.checkOutNotClosed:()V
            //    99: aload_0         /* this */
            //   100: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   103: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
            //   106: aload_0         /* this */
            //   107: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
            //   110: invokevirtual   gg/essential/lib/okio/Buffer.size:()J
            //   113: invokestatic    java/lang/Math.min:(JJ)J
            //   116: lstore_2        /* toWrite */
            //   117: aload_0         /* this */
            //   118: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   121: dup            
            //   122: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
            //   125: lload_2         /* toWrite */
            //   126: lsub           
            //   127: putfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
            //   130: aload           4
            //   132: monitorexit    
            //   133: goto            144
            //   136: astore          6
            //   138: aload           4
            //   140: monitorexit    
            //   141: aload           6
            //   143: athrow         
            //   144: aload_0         /* this */
            //   145: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   148: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //   151: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.enter:()V
            //   154: aload_0         /* this */
            //   155: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   158: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.connection:Lgg/essential/lib/okhttp3/internal/http2/Http2Connection;
            //   161: aload_0         /* this */
            //   162: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   165: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.id:I
            //   168: iload_1         /* outFinished */
            //   169: ifeq            188
            //   172: lload_2         /* toWrite */
            //   173: aload_0         /* this */
            //   174: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
            //   177: invokevirtual   gg/essential/lib/okio/Buffer.size:()J
            //   180: lcmp           
            //   181: ifne            188
            //   184: iconst_1       
            //   185: goto            189
            //   188: iconst_0       
            //   189: aload_0         /* this */
            //   190: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
            //   193: lload_2         /* toWrite */
            //   194: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Connection.writeData:(IZLgg/essential/lib/okio/Buffer;J)V
            //   197: aload_0         /* this */
            //   198: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   201: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //   204: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
            //   207: goto            225
            //   210: astore          7
            //   212: aload_0         /* this */
            //   213: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
            //   216: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
            //   219: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
            //   222: aload           7
            //   224: athrow         
            //   225: return         
            //    Exceptions:
            //  throws java.io.IOException
            //    MethodParameters:
            //  Name         Flags  
            //  -----------  -----
            //  outFinished  
            //    StackMapTable: 00 0A FE 00 12 00 00 07 00 09 2D FF 00 0C 00 05 07 00 02 00 00 00 07 00 09 00 01 07 00 5C FF 00 0E 00 05 07 00 02 01 00 00 07 00 09 00 00 FF 00 2B 00 05 00 00 00 00 07 00 09 00 01 07 00 5C FF 00 07 00 03 07 00 02 01 04 00 00 FF 00 2B 00 03 07 00 02 00 04 00 02 07 00 6F 01 FF 00 00 00 03 07 00 02 00 04 00 03 07 00 6F 01 01 FF 00 14 00 01 07 00 02 00 01 07 00 5C FA 00 0E
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  18     64     77     92     Any
            //  8      133    136    144    Any
            //  154    197    210    225    Any
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void flush() throws IOException {
            assert !Thread.holdsLock(this.this$0);
            synchronized (this.this$0) {
                this.this$0.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0L) {
                this.emitFrame(false);
                this.this$0.connection.flush();
            }
        }
        
        @Override
        public Timeout timeout() {
            return this.this$0.writeTimeout;
        }
        
        @Override
        public void close() throws IOException {
            assert !Thread.holdsLock(this.this$0);
            synchronized (this.this$0) {
                if (this.closed) {
                    return;
                }
            }
            if (!this.this$0.sink.finished) {
                if (this.sendBuffer.size() > 0L) {
                    while (this.sendBuffer.size() > 0L) {
                        this.emitFrame(true);
                    }
                }
                else {
                    this.this$0.connection.writeData(this.this$0.id, true, null, 0L);
                }
            }
            synchronized (this.this$0) {
                this.closed = true;
            }
            this.this$0.connection.flush();
            this.this$0.cancelStreamIfNecessary();
        }
        
        static {
            $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
        }
    }
    
    class StreamTimeout extends AsyncTimeout
    {
        final /* synthetic */ Http2Stream this$0;
        
        StreamTimeout(final Http2Stream this$0) {
            this.this$0 = this$0;
            super();
        }
        
        @Override
        protected void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
        }
        
        @Override
        protected IOException newTimeoutException(final IOException cause) {
            final SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
        
        public void exitAndThrowIfTimedOut() throws IOException {
            if (this.exit()) {
                throw this.newTimeoutException(null);
            }
        }
    }
}
