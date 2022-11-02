package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.util.*;

enum DisabledScheduler implements Scheduler
{
    INSTANCE;
    
    private static final /* synthetic */ DisabledScheduler[] $VALUES;
    
    public static DisabledScheduler[] values() {
        return DisabledScheduler.$VALUES.clone();
    }
    
    public static DisabledScheduler valueOf(final String name) {
        return Enum.valueOf(DisabledScheduler.class, name);
    }
    
    @Override
    public Future<Void> schedule(final Executor executor, final Runnable command, final long delay, final TimeUnit unit) {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(command);
        Objects.requireNonNull(unit);
        return (Future<Void>)DisabledFuture.INSTANCE;
    }
    
    static {
        $VALUES = new DisabledScheduler[] { DisabledScheduler.INSTANCE };
    }
}
