package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;
import gg.essential.lib.okio.*;
import java.util.logging.*;

static final class ContinuationSource implements Source
{
    private final BufferedSource source;
    int length;
    byte flags;
    int streamId;
    int left;
    short padding;
    
    ContinuationSource(final BufferedSource source) {
        super();
        this.source = source;
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        while (this.left == 0) {
            this.source.skip(this.padding);
            this.padding = 0;
            if ((this.flags & 0x4) != 0x0) {
                return -1L;
            }
            this.readContinuationHeader();
        }
        final long read = this.source.read(sink, Math.min(byteCount, this.left));
        if (read == -1L) {
            return -1L;
        }
        this.left -= (int)read;
        return read;
    }
    
    @Override
    public Timeout timeout() {
        return this.source.timeout();
    }
    
    @Override
    public void close() throws IOException {
    }
    
    private void readContinuationHeader() throws IOException {
        final int previousStreamId = this.streamId;
        final int medium = Http2Reader.readMedium(this.source);
        this.left = medium;
        this.length = medium;
        final byte type = (byte)(this.source.readByte() & 0xFF);
        this.flags = (byte)(this.source.readByte() & 0xFF);
        if (Http2Reader.logger.isLoggable(Level.FINE)) {
            Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, type, this.flags));
        }
        this.streamId = (this.source.readInt() & Integer.MAX_VALUE);
        if (type != 9) {
            throw Http2.ioException("%s != TYPE_CONTINUATION", type);
        }
        if (this.streamId != previousStreamId) {
            throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }
}
