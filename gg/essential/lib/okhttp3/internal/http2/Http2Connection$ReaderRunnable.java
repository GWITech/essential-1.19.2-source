package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okhttp3.internal.*;
import java.io.*;
import java.util.*;
import gg.essential.lib.okio.*;

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
