package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;

@FunctionalInterface
public interface Scheduler
{
    Future<?> schedule(final Executor p0, final Runnable p1, final long p2, final TimeUnit p3);
    
    default Scheduler disabledScheduler() {
        return DisabledScheduler.INSTANCE;
    }
    
    default Scheduler systemScheduler() {
        return SystemScheduler.isPresent() ? SystemScheduler.INSTANCE : disabledScheduler();
    }
    
    default Scheduler forScheduledExecutorService(final ScheduledExecutorService scheduledExecutorService) {
        return new ExecutorServiceScheduler(scheduledExecutorService);
    }
    
    default Scheduler guardedScheduler(final Scheduler scheduler) {
        return (scheduler instanceof GuardedScheduler) ? scheduler : new GuardedScheduler(scheduler);
    }
}
