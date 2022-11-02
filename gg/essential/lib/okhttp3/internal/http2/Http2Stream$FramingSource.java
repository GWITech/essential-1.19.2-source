package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;
import gg.essential.lib.okio.*;

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
