package gg.essential.vigilance.impl.nightconfig.core.file;

import java.nio.channels.*;
import java.io.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;

private final class WriteCompletedHandler implements CompletionHandler<Integer, Object>
{
    final /* synthetic */ WriteAsyncFileConfig this$0;
    
    private WriteCompletedHandler(final WriteAsyncFileConfig this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public void completed(final Integer result, final Object attachment) {
        WriteAsyncFileConfig.access$100(this.this$0).set(false);
        if (WriteAsyncFileConfig.access$200(this.this$0).getAndSet(false)) {
            WriteAsyncFileConfig.access$300(this.this$0, false);
        }
        else {
            synchronized (WriteAsyncFileConfig.access$400(this.this$0)) {
                try {
                    WriteAsyncFileConfig.access$500(this.this$0).close();
                    WriteAsyncFileConfig.access$502(this.this$0, null);
                }
                catch (final IOException e) {
                    this.failed(e, null);
                }
                finally {
                    WriteAsyncFileConfig.access$400(this.this$0).notify();
                }
            }
        }
    }
    
    @Override
    public void failed(final Throwable exc, final Object attachment) {
        throw new WritingException("Error while saving the FileConfig to " + WriteAsyncFileConfig.access$600(this.this$0), exc);
    }
    
    @Override
    public /* bridge */ void completed(final Object o, final Object attachment) {
        this.completed((Integer)o, attachment);
    }
    
    WriteCompletedHandler(final WriteAsyncFileConfig x0, final WriteAsyncFileConfig.WriteAsyncFileConfig$1 x1) {
        this(x0);
    }
}
