package gg.essential.lib.okio;

import java.io.*;

final class Okio$1 implements Sink {
    final /* synthetic */ Timeout val$timeout;
    final /* synthetic */ OutputStream val$out;
    
    Okio$1(final Timeout val$timeout, final OutputStream val$out) {
        this.val$timeout = val$timeout;
        this.val$out = val$out;
        super();
    }
    
    @Override
    public void write(final Buffer source, long byteCount) throws IOException {
        Util.checkOffsetAndCount(source.size, 0L, byteCount);
        while (byteCount > 0L) {
            this.val$timeout.throwIfReached();
            final Segment head = source.head;
            final int toCopy = (int)Math.min(byteCount, head.limit - head.pos);
            this.val$out.write(head.data, head.pos, toCopy);
            final Segment segment = head;
            segment.pos += toCopy;
            byteCount -= toCopy;
            source.size -= toCopy;
            if (head.pos == head.limit) {
                source.head = head.pop();
                SegmentPool.recycle(head);
            }
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.val$out.flush();
    }
    
    @Override
    public void close() throws IOException {
        this.val$out.close();
    }
    
    @Override
    public Timeout timeout() {
        return this.val$timeout;
    }
    
    @Override
    public String toString() {
        return "sink(" + this.val$out + ")";
    }
}