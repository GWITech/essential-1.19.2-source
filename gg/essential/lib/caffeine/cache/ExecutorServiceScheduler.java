package gg.essential.lib.caffeine.cache;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.*;

final class ExecutorServiceScheduler implements Scheduler, Serializable
{
    static final Logger logger;
    static final long serialVersionUID = 1L;
    final ScheduledExecutorService scheduledExecutorService;
    
    ExecutorServiceScheduler(final ScheduledExecutorService scheduledExecutorService) {
        super();
        this.scheduledExecutorService = Objects.requireNonNull(scheduledExecutorService);
    }
    
    @Override
    public Future<?> schedule(final Executor executor, final Runnable command, final long delay, final TimeUnit unit) {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(command);
        Objects.requireNonNull(unit);
        if (this.scheduledExecutorService.isShutdown()) {
            return (Future<?>)DisabledFuture.INSTANCE;
        }
        return this.scheduledExecutorService.schedule(() -> {
            try {
                executor.execute(command);
            }
            catch (final Throwable t) {
                ExecutorServiceScheduler.logger.log(Level.WARNING, "Exception thrown when submitting scheduled task", t);
                throw t;
            }
        }, delay, unit);
    }
    
    private static /* synthetic */ void lambda$schedule$0(final Executor executor, final Runnable command) {
        try {
            executor.execute(command);
        }
        catch (final Throwable t) {
            ExecutorServiceScheduler.logger.log(Level.WARNING, "Exception thrown when submitting scheduled task", t);
            throw t;
        }
    }
    
    static {
        logger = Logger.getLogger(ExecutorServiceScheduler.class.getName());
    }
}
