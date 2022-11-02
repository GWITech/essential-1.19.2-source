package gg.essential.lib.okio;

import java.io.*;

final class Okio$2 implements Source {
    final /* synthetic */ Timeout val$timeout;
    final /* synthetic */ InputStream val$in;
    
    Okio$2(final Timeout val$timeout, final InputStream val$in) {
        this.val$timeout = val$timeout;
        this.val$in = val$in;
        super();
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        if (byteCount < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (byteCount == 0L) {
            return 0L;
        }
        try {
            this.val$timeout.throwIfReached();
            final Segment tail = sink.writableSegment(1);
            final int maxToCopy = (int)Math.min(byteCount, 8192 - tail.limit);
            final int bytesRead = this.val$in.read(tail.data, tail.limit, maxToCopy);
            if (bytesRead == -1) {
                return -1L;
            }
            final Segment segment = tail;
            segment.limit += bytesRead;
            sink.size += bytesRead;
            return bytesRead;
        }
        catch (final AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.val$in.close();
    }
    
    @Override
    public Timeout timeout() {
        return this.val$timeout;
    }
    
    @Override
    public String toString() {
        return "source(" + this.val$in + ")";
    }
}