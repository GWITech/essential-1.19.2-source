package gg.essential.lib.caffeine.cache;

import java.util.*;
import java.util.concurrent.*;
import java.lang.reflect.*;

enum SystemScheduler implements Scheduler
{
    INSTANCE;
    
    static final Method delayedExecutor;
    private static final /* synthetic */ SystemScheduler[] $VALUES;
    
    public static SystemScheduler[] values() {
        return SystemScheduler.$VALUES.clone();
    }
    
    public static SystemScheduler valueOf(final String name) {
        return Enum.valueOf(SystemScheduler.class, name);
    }
    
    @Override
    public Future<?> schedule(final Executor executor, final Runnable command, final long delay, final TimeUnit unit) {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(command);
        Objects.requireNonNull(unit);
        try {
            final Executor scheduler = (Executor)SystemScheduler.delayedExecutor.invoke(CompletableFuture.class, delay, unit, executor);
            return CompletableFuture.runAsync(command, scheduler);
        }
        catch (final IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    
    static Method getDelayedExecutorMethod() {
        try {
            return CompletableFuture.class.getMethod("delayedExecutor", Long.TYPE, TimeUnit.class, Executor.class);
        }
        catch (final NoSuchMethodException | SecurityException ex) {
            return null;
        }
    }
    
    static boolean isPresent() {
        return SystemScheduler.delayedExecutor != null;
    }
    
    static {
        $VALUES = new SystemScheduler[] { SystemScheduler.INSTANCE };
        delayedExecutor = getDelayedExecutorMethod();
    }
}
