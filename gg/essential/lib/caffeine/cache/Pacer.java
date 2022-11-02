package gg.essential.lib.caffeine.cache;

import java.util.*;
import java.util.concurrent.*;

final class Pacer
{
    static final long TOLERANCE;
    final Scheduler scheduler;
    long nextFireTime;
    Future<?> future;
    
    Pacer(final Scheduler scheduler) {
        super();
        this.scheduler = Objects.requireNonNull(scheduler);
    }
    
    public void schedule(final Executor executor, final Runnable command, final long now, final long delay) {
        final long scheduleAt = now + delay;
        if (this.future == null) {
            if (this.nextFireTime != 0L) {
                return;
            }
        }
        else if (this.nextFireTime - now > 0L) {
            if (this.maySkip(scheduleAt)) {
                return;
            }
            this.future.cancel(false);
        }
        final long actualDelay = this.calculateSchedule(now, delay, scheduleAt);
        this.future = this.scheduler.schedule(executor, command, actualDelay, TimeUnit.NANOSECONDS);
    }
    
    boolean maySkip(final long scheduleAt) {
        final long delta = scheduleAt - this.nextFireTime;
        return delta >= 0L || -delta <= Pacer.TOLERANCE;
    }
    
    long calculateSchedule(final long now, final long delay, final long scheduleAt) {
        if (delay <= Pacer.TOLERANCE) {
            this.nextFireTime = now + Pacer.TOLERANCE;
            return Pacer.TOLERANCE;
        }
        this.nextFireTime = scheduleAt;
        return delay;
    }
    
    static {
        TOLERANCE = Caffeine.ceilingPowerOfTwo(TimeUnit.SECONDS.toNanos(1L));
    }
}
