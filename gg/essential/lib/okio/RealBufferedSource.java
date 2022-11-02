package gg.essential.lib.okio;

import java.io.*;
import java.nio.charset.*;

final class RealBufferedSource implements BufferedSource
{
    public final Buffer buffer;
    public final Source source;
    boolean closed;
    
    RealBufferedSource(final Source source) {
        super();
        this.buffer = new Buffer();
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.source = source;
    }
    
    @Override
    public Buffer buffer() {
        return this.buffer;
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (byteCount < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.buffer.size == 0L) {
            final long read = this.source.read(this.buffer, 8192L);
            if (read == -1L) {
                return -1L;
            }
        }
        final long toRead = Math.min(byteCount, this.buffer.size);
        return this.buffer.read(sink, toRead);
    }
    
    @Override
    public boolean exhausted() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, 8192L) == -1L;
    }
    
    @Override
    public void require(final long byteCount) throws IOException {
        if (!this.request(byteCount)) {
            throw new EOFException();
        }
    }
    
    public boolean request(final long byteCount) throws IOException {
        if (byteCount < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.buffer.size < byteCount) {
            if (this.source.read(this.buffer, 8192L) == -1L) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public byte readByte() throws IOException {
        this.require(1L);
        return this.buffer.readByte();
    }
    
    @Override
    public ByteString readByteString(final long byteCount) throws IOException {
        this.require(byteCount);
        return this.buffer.readByteString(byteCount);
    }
    
    @Override
    public byte[] readByteArray(final long byteCount) throws IOException {
        this.require(byteCount);
        return this.buffer.readByteArray(byteCount);
    }
    
    @Override
    public void readFully(final byte[] sink) throws IOException {
        try {
            this.require(sink.length);
        }
        catch (final EOFException e) {
            int offset = 0;
            while (this.buffer.size > 0L) {
                final int read = this.buffer.read(sink, offset, (int)this.buffer.size);
                if (read == -1) {
                    throw new AssertionError();
                }
                offset += read;
            }
            throw e;
        }
        this.buffer.readFully(sink);
    }
    
    @Override
    public String readString(final Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }
    
    @Override
    public String readUtf8LineStrict() throws IOException {
        return this.readUtf8LineStrict$2f33e691();
    }
    
    public String readUtf8LineStrict$2f33e691() throws IOException {
        if (Long.MAX_VALUE < 0L) {
            throw new IllegalArgumentException("limit < 0: " + Long.MAX_VALUE);
        }
        final long scanLength = (Long.MAX_VALUE == Long.MAX_VALUE) ? Long.MAX_VALUE : Long.MIN_VALUE;
        final long newline = this.indexOf((byte)10, 0L, scanLength);
        if (newline != -1L) {
            return this.buffer.readUtf8Line(newline);
        }
        if (scanLength < Long.MAX_VALUE && this.request(scanLength) && this.buffer.getByte(scanLength - 1L) == 13 && this.request(scanLength + 1L) && this.buffer.getByte(scanLength) == 10) {
            return this.buffer.readUtf8Line(scanLength);
        }
        final Buffer data = new Buffer();
        this.buffer.copyTo(data, 0L, Math.min(32L, this.buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), Long.MAX_VALUE) + " content=" + data.readByteString().hex() + '\u2026');
    }
    
    @Override
    public short readShort() throws IOException {
        this.require(2L);
        return this.buffer.readShort();
    }
    
    @Override
    public short readShortLe() throws IOException {
        this.require(2L);
        return this.buffer.readShortLe();
    }
    
    @Override
    public int readInt() throws IOException {
        this.require(4L);
        return this.buffer.readInt();
    }
    
    @Override
    public int readIntLe() throws IOException {
        this.require(4L);
        return this.buffer.readIntLe();
    }
    
    @Override
    public long readHexadecimalUnsignedLong() throws IOException {
        this.require(1L);
        int pos = 0;
        while (this.request(pos + 1)) {
            final byte b = this.buffer.getByte(pos);
            if ((b < 48 || b > 57) && (b < 97 || b > 102) && (b < 65 || b > 70)) {
                if (pos == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", b));
                }
                break;
            }
            else {
                ++pos;
            }
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }
    
    @Override
    public void skip(long byteCount) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0L) {
            if (this.buffer.size == 0L && this.source.read(this.buffer, 8192L) == -1L) {
                throw new EOFException();
            }
            final long toSkip = Math.min(byteCount, this.buffer.size());
            this.buffer.skip(toSkip);
            byteCount -= toSkip;
        }
    }
    
    @Override
    public long indexOf$132bdb() throws IOException {
        return this.indexOf((byte)0, 0L, Long.MAX_VALUE);
    }
    
    public long indexOf(final byte b, long fromIndex, final long toIndex) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0L < 0L || toIndex < 0L) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, toIndex));
        }
        while (fromIndex < toIndex) {
            final long result = this.buffer.indexOf(b, fromIndex, toIndex);
            if (result != -1L) {
                return result;
            }
            final long lastBufferSize = this.buffer.size;
            if (lastBufferSize >= toIndex || this.source.read(this.buffer, 8192L) == -1L) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, lastBufferSize);
        }
        return -1L;
    }
    
    @Override
    public boolean rangeEquals$45b61a70(final ByteString bytes) throws IOException {
        return this.rangeEquals$4f587030$710da61b(bytes, bytes.size());
    }
    
    public boolean rangeEquals$4f587030$710da61b(final ByteString bytes, final int byteCount) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0L < 0L || byteCount < 0 || bytes.size() - 0 < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; ++i) {
            final long bufferOffset = 0L + i;
            if (!this.request(bufferOffset + 1L)) {
                return false;
            }
            if (this.buffer.getByte(bufferOffset) != bytes.getByte(0 + i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }
    
    @Override
    public Timeout timeout() {
        return this.source.timeout();
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.source + ")";
    }
}
