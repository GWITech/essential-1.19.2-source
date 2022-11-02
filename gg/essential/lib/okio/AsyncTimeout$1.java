package gg.essential.lib.okio;

import java.io.*;

class AsyncTimeout$1 implements Sink {
    final /* synthetic */ Sink val$sink;
    final /* synthetic */ AsyncTimeout this$0;
    
    AsyncTimeout$1(final AsyncTimeout this$0, final Sink val$sink) {
        this.this$0 = this$0;
        this.val$sink = val$sink;
        super();
    }
    
    @Override
    public void write(final Buffer source, long byteCount) throws IOException {
        Util.checkOffsetAndCount(source.size, 0L, byteCount);
        while (byteCount > 0L) {
            long toWrite = 0L;
            while (toWrite < 65536L) {
                final int segmentSize = source.head.limit - source.head.pos;
                toWrite += segmentSize;
                if (toWrite >= byteCount) {
                    toWrite = byteCount;
                    break;
                }
            }
            this.this$0.enter();
            try {
                this.val$sink.write(source, toWrite);
                byteCount -= toWrite;
                this.this$0.exit(true);
            }
            catch (final IOException e) {
                throw this.this$0.exit(e);
            }
            finally {
                this.this$0.exit(false);
            }
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.this$0.enter();
        try {
            this.val$sink.flush();
            this.this$0.exit(true);
        }
        catch (final IOException e) {
            throw this.this$0.exit(e);
        }
        finally {
            this.this$0.exit(false);
        }
    }
    
    @Override
    public void close() throws IOException {
        this.this$0.enter();
        try {
            this.val$sink.close();
            this.this$0.exit(true);
        }
        catch (final IOException e) {
            throw this.this$0.exit(e);
        }
        finally {
            this.this$0.exit(false);
        }
    }
    
    @Override
    public Timeout timeout() {
        return this.this$0;
    }
    
    @Override
    public String toString() {
        return "AsyncTimeout.sink(" + this.val$sink + ")";
    }
}