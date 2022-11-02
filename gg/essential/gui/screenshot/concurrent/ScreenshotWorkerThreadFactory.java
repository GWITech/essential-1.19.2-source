package gg.essential.gui.screenshot.concurrent;

import java.util.concurrent.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.atomic.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006	""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/ScreenshotWorkerThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "essential" })
public final class ScreenshotWorkerThreadFactory implements ThreadFactory
{
    @NotNull
    public static final ScreenshotWorkerThreadFactory INSTANCE;
    @NotNull
    private static final AtomicInteger counter;
    
    private ScreenshotWorkerThreadFactory() {
        super();
    }
    
    @NotNull
    @Override
    public Thread newThread(@NotNull final Runnable r) {
        Intrinsics.checkNotNullParameter((Object)r, "r");
        final Thread it = new Thread(r, "Screenshot Worker Thread " + ScreenshotWorkerThreadFactory.counter.incrementAndGet());
        it.setPriority(1);
        return it;
    }
    
    static {
        INSTANCE = new ScreenshotWorkerThreadFactory();
        counter = new AtomicInteger(0);
    }
}
