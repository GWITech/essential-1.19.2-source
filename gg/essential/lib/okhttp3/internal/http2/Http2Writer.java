package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okio.*;
import java.io.*;
import java.util.logging.*;
import gg.essential.lib.okhttp3.internal.*;
import java.util.*;

final class Http2Writer implements Closeable
{
    private static final Logger logger;
    private final BufferedSink sink;
    private final boolean client;
    private final Buffer hpackBuffer;
    private int maxFrameSize;
    private boolean closed;
    final Hpack.Writer hpackWriter;
    
    Http2Writer(final BufferedSink sink, final boolean client) {
        super();
        this.sink = sink;
        this.client = client;
        this.hpackBuffer = new Buffer();
        this.hpackWriter = new Hpack.Writer(this.hpackBuffer);
        this.maxFrameSize = 16384;
    }
    
    public synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!this.client) {
            return;
        }
        if (Http2Writer.logger.isLoggable(Level.FINE)) {
            Http2Writer.logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
        }
        this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
        this.sink.flush();
    }
    
    public synchronized void applyAndAckSettings(final Settings peerSettings) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.setHeaderTableSizeSetting(peerSettings.getHeaderTableSize());
        }
        this.frameHeader(0, 0, (byte)4, (byte)1);
        this.sink.flush();
    }
    
    public synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }
    
    public synchronized void synStream$64c3d190(final boolean outFinished, final int streamId, final List<Header> headerBlock) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.headers(outFinished, streamId, headerBlock);
    }
    
    public synchronized void rstStream(final int streamId, final ErrorCode errorCode) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        this.frameHeader(streamId, 4, (byte)3, (byte)0);
        this.sink.writeInt(errorCode.httpCode);
        this.sink.flush();
    }
    
    public int maxDataLength() {
        return this.maxFrameSize;
    }
    
    public synchronized void data(final boolean outFinished, final int streamId, final Buffer source, final int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        byte flags = 0;
        if (outFinished) {
            flags = 1;
        }
        this.dataFrame(streamId, flags, source, byteCount);
    }
    
    void dataFrame(final int streamId, final byte flags, final Buffer buffer, final int byteCount) throws IOException {
        this.frameHeader(streamId, byteCount, (byte)0, flags);
        if (byteCount > 0) {
            this.sink.write(buffer, byteCount);
        }
    }
    
    public synchronized void settings(final Settings settings) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        final int length = settings.size() * 6;
        this.frameHeader(0, length, (byte)4, (byte)0);
        for (int i = 0; i < 10; ++i) {
            if (settings.isSet(i)) {
                int id = i;
                if (id == 4) {
                    id = 3;
                }
                else if (id == 7) {
                    id = 4;
                }
                this.sink.writeShort(id);
                this.sink.writeInt(settings.get(i));
            }
        }
        this.sink.flush();
    }
    
    public synchronized void ping(final boolean ack, final int payload1, final int payload2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        final byte flags = (byte)(ack ? 1 : 0);
        this.frameHeader(0, 8, (byte)6, flags);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }
    
    public synchronized void goAway(final int lastGoodStreamId, final ErrorCode errorCode, final byte[] debugData) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
        final int length = 8 + debugData.length;
        this.frameHeader(0, length, (byte)7, (byte)0);
        this.sink.writeInt(lastGoodStreamId);
        this.sink.writeInt(errorCode.httpCode);
        if (debugData.length > 0) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }
    
    public synchronized void windowUpdate(final int streamId, final long windowSizeIncrement) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0L || windowSizeIncrement > 2147483647L) {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", windowSizeIncrement);
        }
        this.frameHeader(streamId, 4, (byte)8, (byte)0);
        this.sink.writeInt((int)windowSizeIncrement);
        this.sink.flush();
    }
    
    public void frameHeader(final int streamId, final int length, final byte type, final byte flags) throws IOException {
        if (Http2Writer.logger.isLoggable(Level.FINE)) {
            Http2Writer.logger.fine(Http2.frameLog(false, streamId, length, type, flags));
        }
        if (length > this.maxFrameSize) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", this.maxFrameSize, length);
        }
        if ((streamId & Integer.MIN_VALUE) != 0x0) {
            throw Http2.illegalArgument("reserved bit set: %s", streamId);
        }
        writeMedium(this.sink, length);
        this.sink.writeByte(type & 0xFF);
        this.sink.writeByte(flags & 0xFF);
        this.sink.writeInt(streamId & Integer.MAX_VALUE);
    }
    
    @Override
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }
    
    private static void writeMedium(final BufferedSink sink, final int i) throws IOException {
        sink.writeByte(i >>> 16 & 0xFF);
        sink.writeByte(i >>> 8 & 0xFF);
        sink.writeByte(i & 0xFF);
    }
    
    private void writeContinuationFrames(final int streamId, long byteCount) throws IOException {
        while (byteCount > 0L) {
            final int length = (int)Math.min(this.maxFrameSize, byteCount);
            byteCount -= length;
            this.frameHeader(streamId, length, (byte)9, (byte)((byteCount == 0L) ? 4 : 0));
            this.sink.write(this.hpackBuffer, length);
        }
    }
    
    void headers(final boolean outFinished, final int streamId, final List<Header> headerBlock) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        final long byteCount = this.hpackBuffer.size();
        final int length = (int)Math.min(this.maxFrameSize, byteCount);
        byte flags = (byte)((byteCount == length) ? 4 : 0);
        if (outFinished) {
            flags |= 0x1;
        }
        this.frameHeader(streamId, length, (byte)1, flags);
        this.sink.write(this.hpackBuffer, length);
        if (byteCount > length) {
            this.writeContinuationFrames(streamId, byteCount - length);
        }
    }
    
    static {
        logger = Logger.getLogger(Http2.class.getName());
    }
}
