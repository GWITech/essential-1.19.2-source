package gg.essential.util;

import java.util.concurrent.atomic.*;
import java.util.concurrent.*;

public class Multithreading
{
    private static final AtomicInteger counter;
    private static final ScheduledExecutorService RUNNABLE_POOL;
    public static ThreadPoolExecutor POOL;
    
    public static ScheduledFuture<?> schedule(final Runnable r, final long delay, final TimeUnit unit) {
        return Multithreading.RUNNABLE_POOL.schedule(r, 1L, unit);
    }
    
    public static void runAsync(final Runnable runnable) {
        Multithreading.POOL.execute(runnable);
    }
    
    private static /* synthetic */ Thread lambda$static$1(final Runnable r) {
        return new Thread(r, "Thread " + Multithreading.counter.incrementAndGet());
    }
    
    private static /* synthetic */ Thread lambda$static$0(final Runnable r) {
        return new Thread(r, "Essential Thread " + Multithreading.counter.incrementAndGet());
    }
    
    static {
        counter = new AtomicInteger(0);
        RUNNABLE_POOL = Executors.newScheduledThreadPool(10, r -> new Thread(r, "Essential Thread " + Multithreading.counter.incrementAndGet()));
        Multithreading.POOL = new ThreadPoolExecutor(10, 30, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), r -> new Thread(r, "Thread " + Multithreading.counter.incrementAndGet()));
    }
}
