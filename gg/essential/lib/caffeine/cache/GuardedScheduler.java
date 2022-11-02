package gg.essential.lib.caffeine.cache;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.*;

final class GuardedScheduler implements Scheduler, Serializable
{
    static final Logger logger;
    static final long serialVersionUID = 1L;
    final Scheduler delegate;
    
    GuardedScheduler(final Scheduler delegate) {
        super();
        this.delegate = Objects.requireNonNull(delegate);
    }
    
    @Override
    public Future<?> schedule(final Executor executor, final Runnable command, final long delay, final TimeUnit unit) {
        try {
            final Future<?> future = this.delegate.schedule(executor, command, delay, unit);
            return (Future<?>)((future == null) ? DisabledFuture.INSTANCE : future);
        }
        catch (final Throwable t) {
            GuardedScheduler.logger.log(Level.WARNING, "Exception thrown by scheduler; discarded task", t);
            return (Future<?>)DisabledFuture.INSTANCE;
        }
    }
    
    static {
        logger = Logger.getLogger(GuardedScheduler.class.getName());
    }
}
