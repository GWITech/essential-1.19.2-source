package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okio.*;
import java.io.*;
import gg.essential.lib.okhttp3.internal.http.*;

class StreamFinishingSource extends ForwardingSource
{
    boolean completed;
    long bytesRead;
    final /* synthetic */ Http2Codec this$0;
    
    StreamFinishingSource(final Http2Codec this$0, final Source delegate) {
        this.this$0 = this$0;
        super(delegate);
        this.completed = false;
        this.bytesRead = 0L;
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        try {
            final long read = this.delegate().read(sink, byteCount);
            if (read > 0L) {
                this.bytesRead += read;
            }
            return read;
        }
        catch (final IOException e) {
            this.endOfInput$8ec0fdf();
            throw e;
        }
    }
    
    @Override
    public void close() throws IOException {
        super.close();
        this.endOfInput$8ec0fdf();
    }
    
    private void endOfInput$8ec0fdf() {
        if (this.completed) {
            return;
        }
        this.completed = true;
        this.this$0.streamAllocation.streamFinished$50294127(false, this.this$0);
    }
}
