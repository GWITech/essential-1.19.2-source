package gg.essential.lib.okio;

import java.io.*;

final class RealBufferedSink implements BufferedSink
{
    public final Buffer buffer;
    public final Sink sink;
    boolean closed;
    
    RealBufferedSink(final Sink sink) {
        super();
        this.buffer = new Buffer();
        if (sink == null) {
            throw new NullPointerException("sink == null");
        }
        this.sink = sink;
    }
    
    @Override
    public Buffer buffer() {
        return this.buffer;
    }
    
    @Override
    public void write(final Buffer source, final long byteCount) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(source, byteCount);
        this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink write(final ByteString byteString) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(byteString);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink writeUtf8(final String string) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8(string);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink write(final byte[] source) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(source);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink write(final byte[] source, final int offset, final int byteCount) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(source, offset, byteCount);
        return this.emitCompleteSegments();
    }
    
    @Override
    public long writeAll(final Source source) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long totalBytesRead = 0L;
        long readCount;
        while ((readCount = source.read(this.buffer, 8192L)) != -1L) {
            totalBytesRead += readCount;
            this.emitCompleteSegments();
        }
        return totalBytesRead;
    }
    
    @Override
    public BufferedSink writeByte(final int b) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeByte(b);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink writeShort(final int s) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeShort(s);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink writeInt(final int i) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeInt(i);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink writeDecimalLong(final long v) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeDecimalLong(v);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink writeHexadecimalUnsignedLong(final long v) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeHexadecimalUnsignedLong(v);
        return this.emitCompleteSegments();
    }
    
    @Override
    public BufferedSink emitCompleteSegments() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        final long byteCount = this.buffer.completeSegmentByteCount();
        if (byteCount > 0L) {
            this.sink.write(this.buffer, byteCount);
        }
        return this;
    }
    
    @Override
    public void flush() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.buffer.size > 0L) {
            this.sink.write(this.buffer, this.buffer.size);
        }
        this.sink.flush();
    }
    
    @Override
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        Throwable thrown = null;
        try {
            if (this.buffer.size > 0L) {
                this.sink.write(this.buffer, this.buffer.size);
            }
        }
        catch (final Throwable e) {
            thrown = e;
        }
        try {
            this.sink.close();
        }
        catch (final Throwable e) {
            if (thrown == null) {
                thrown = e;
            }
        }
        this.closed = true;
        if (thrown != null) {
            Util.sneakyRethrow(thrown);
        }
    }
    
    @Override
    public Timeout timeout() {
        return this.sink.timeout();
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.sink + ")";
    }
}
