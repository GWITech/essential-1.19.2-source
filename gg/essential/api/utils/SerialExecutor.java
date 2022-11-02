package gg.essential.api.utils;

import java.util.concurrent.*;
import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u000e""" }, d2 = { "Lgg/essential/api/utils/SerialExecutor;", "Ljava/util/concurrent/Executor;", "executor", "(Ljava/util/concurrent/Executor;)V", "active", "Ljava/lang/Runnable;", "getExecutor", "()Ljava/util/concurrent/Executor;", "queue", "Lkotlin/collections/ArrayDeque;", "execute", "", "r", "submitNext", "essential-api" })
public final class SerialExecutor implements Executor
{
    @NotNull
    private final Executor executor;
    @NotNull
    private final ArrayDeque<Runnable> queue;
    @Nullable
    private Runnable active;
    
    public SerialExecutor(@NotNull final Executor executor) {
        Intrinsics.checkNotNullParameter((Object)executor, "executor");
        super();
        this.executor = executor;
        this.queue = (ArrayDeque<Runnable>)new ArrayDeque();
    }
    
    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }
    
    @Override
    public synchronized void execute(@NotNull final Runnable r) {
        Intrinsics.checkNotNullParameter((Object)r, "r");
        this.queue.addLast((Object)SerialExecutor::execute$lambda-0);
        if (this.active == null) {
            this.submitNext();
        }
    }
    
    private final synchronized void submitNext() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this */
        //     2: getfield        gg/essential/api/utils/SerialExecutor.queue:Lkotlin/collections/ArrayDeque;
        //     5: invokevirtual   kotlin/collections/ArrayDeque.removeFirstOrNull:()Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/Runnable;
        //    11: dup            
        //    12: ifnull          34
        //    15: astore_1       
        //    16: aload_1        
        //    17: astore_2       
        //    18: astore_3       
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/api/utils/SerialExecutor.executor:Ljava/util/concurrent/Executor;
        //    23: aload_2        
        //    24: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //    29: aload_3        
        //    30: aload_1        
        //    31: goto            36
        //    34: pop            
        //    35: aconst_null    
        //    36: putfield        gg/essential/api/utils/SerialExecutor.active:Ljava/lang/Runnable;
        //    39: return         
        //    StackMapTable: 00 02 FF 00 22 00 00 00 02 07 00 02 07 00 58 FF 00 01 00 00 00 02 07 00 02 07 00 58
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void execute$lambda-0(final Runnable $r, final SerialExecutor this$0) {
        Intrinsics.checkNotNullParameter((Object)$r, "$r");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        try {
            $r.run();
        }
        finally {
            this$0.submitNext();
        }
    }
}
