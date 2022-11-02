package gg.essential.util;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0006\u0010\f\u001a\u00020
                                                   R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u0006\u001a
                                                    \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lgg/essential/util/TargetThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "targetThread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "execute", "", "task", "run", "essential" })
public final class TargetThreadExecutor implements Executor
{
    private final Thread targetThread;
    @NotNull
    private final Queue<Runnable> queue;
    
    public TargetThreadExecutor() {
        super();
        this.targetThread = Thread.currentThread();
        this.queue = new ConcurrentLinkedQueue<Runnable>();
    }
    
    @Override
    public void execute(@NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter((Object)task, "task");
        if (Intrinsics.areEqual((Object)Thread.currentThread(), (Object)this.targetThread)) {
            task.run();
        }
        else {
            this.queue.offer(task);
        }
    }
    
    public final void run() {
        while (true) {
            final Runnable runnable2;
            final Runnable runnable = runnable2 = this.queue.poll();
            if (runnable2 == null) {
                break;
            }
            Intrinsics.checkNotNullExpressionValue((Object)runnable2, "queue.poll() ?: return");
            final Runnable task = runnable;
            try {
                task.run();
            }
            catch (final Exception e) {
                Essential.logger.fatal("Error executing task", (Throwable)e);
            }
        }
    }
}
