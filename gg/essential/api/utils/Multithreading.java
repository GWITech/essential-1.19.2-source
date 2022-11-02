package gg.essential.api.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.atomic.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000L
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J*\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006"\u0004\b\u0007\u0010\bR\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u000b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012¨\u0006!""" }, d2 = { "Lgg/essential/api/utils/Multithreading;", "", "()V", "POOL", "Ljava/util/concurrent/ThreadPoolExecutor;", "getPOOL", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setPOOL", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "pool", "getPool$annotations", "getPool", "scheduledPool", "Ljava/util/concurrent/ScheduledExecutorService;", "getScheduledPool$annotations", "getScheduledPool", "()Ljava/util/concurrent/ScheduledExecutorService;", "runAsync", "", "runnable", "Ljava/lang/Runnable;", "schedule", "Ljava/util/concurrent/ScheduledFuture;", "r", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "initialDelay", "submit", "Ljava/util/concurrent/Future;", "essential-api" })
public final class Multithreading
{
    @NotNull
    public static final Multithreading INSTANCE;
    @NotNull
    private static final AtomicInteger counter;
    @NotNull
    private static final ScheduledExecutorService scheduledPool;
    @NotNull
    private static ThreadPoolExecutor POOL;
    
    private Multithreading() {
        super();
    }
    
    @NotNull
    public static final ScheduledExecutorService getScheduledPool() {
        return Multithreading.scheduledPool;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getScheduledPool$annotations() {
    }
    
    @NotNull
    public static final ThreadPoolExecutor getPool() {
        return Multithreading.POOL;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getPool$annotations() {
    }
    
    @NotNull
    public final ThreadPoolExecutor getPOOL() {
        return Multithreading.POOL;
    }
    
    public final void setPOOL(@NotNull final ThreadPoolExecutor <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        Multithreading.POOL = <set-?>;
    }
    
    @NotNull
    public final ScheduledFuture<?> schedule(@NotNull final Runnable r, final long initialDelay, final long delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)r, "r");
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final ScheduledFuture<?> scheduleAtFixedRate = Multithreading.scheduledPool.scheduleAtFixedRate(r, initialDelay, delay, unit);
        Intrinsics.checkNotNullExpressionValue((Object)scheduleAtFixedRate, "scheduledPool.scheduleAt\u2026nitialDelay, delay, unit)");
        return scheduleAtFixedRate;
    }
    
    @JvmStatic
    @NotNull
    public static final ScheduledFuture<?> schedule(@NotNull final Runnable r, final long delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)r, "r");
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final ScheduledFuture<?> schedule = Multithreading.scheduledPool.schedule(r, delay, unit);
        Intrinsics.checkNotNullExpressionValue((Object)schedule, "scheduledPool.schedule(r, delay, unit)");
        return schedule;
    }
    
    @JvmStatic
    public static final void runAsync(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter((Object)runnable, "runnable");
        Multithreading.POOL.execute(runnable);
    }
    
    @NotNull
    public final Future<?> submit(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter((Object)runnable, "runnable");
        final Future<?> submit = Multithreading.POOL.submit(runnable);
        Intrinsics.checkNotNullExpressionValue((Object)submit, "POOL.submit(runnable)");
        return submit;
    }
    
    private static final Thread scheduledPool$lambda-0(final Runnable target) {
        return new Thread(target, "Essential Thread " + Multithreading.counter.incrementAndGet());
    }
    
    private static final Thread POOL$lambda-1(final Runnable target) {
        return new Thread(target, "Essential " + Multithreading.counter.incrementAndGet());
    }
    
    static {
        INSTANCE = new Multithreading();
        counter = new AtomicInteger(0);
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10, Multithreading::scheduledPool$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)scheduledThreadPool, "newScheduledThreadPool(1\u2026.incrementAndGet())\n    }");
        scheduledPool = scheduledThreadPool;
        Multithreading.POOL = new ThreadPoolExecutor(10, 30, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Multithreading::POOL$lambda-1);
    }
}
