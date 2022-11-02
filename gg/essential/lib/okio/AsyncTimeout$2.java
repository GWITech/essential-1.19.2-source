package gg.essential.lib.okio;

import java.io.*;

class AsyncTimeout$2 implements Source {
    final /* synthetic */ Source val$source;
    final /* synthetic */ AsyncTimeout this$0;
    
    AsyncTimeout$2(final AsyncTimeout this$0, final Source val$source) {
        this.this$0 = this$0;
        this.val$source = val$source;
        super();
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        boolean throwOnTimeout = false;
        this.this$0.enter();
        try {
            final long result = this.val$source.read(sink, byteCount);
            throwOnTimeout = true;
            final long n = result;
            this.this$0.exit(true);
            return n;
        }
        catch (final IOException e) {
            throw this.this$0.exit(e);
        }
        finally {
            this.this$0.exit(throwOnTimeout);
        }
    }
    
    @Override
    public void close() throws IOException {
        try {
            this.val$source.close();
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
        return "AsyncTimeout.source(" + this.val$source + ")";
    }
}