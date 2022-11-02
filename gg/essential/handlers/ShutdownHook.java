package gg.essential.handlers;

import gg.essential.api.utils.*;
import java.util.concurrent.*;
import gg.essential.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class ShutdownHook implements ShutdownHookUtil
{
    public static final ShutdownHook INSTANCE;
    private final Queue<Runnable> hooks;
    
    public ShutdownHook() {
        super();
        this.hooks = new ConcurrentLinkedQueue<Runnable>();
    }
    
    public void execute() {
        for (final Runnable hook : this.hooks) {
            try {
                hook.run();
            }
            catch (final Exception e) {
                Essential.logger.error("Failed to run shutdown hook.", (Throwable)e);
            }
        }
    }
    
    @Override
    public void register(@NotNull final Runnable runnable) {
        this.hooks.add(runnable);
    }
    
    @Override
    public void unregister(@NotNull final Runnable runnable) {
        this.hooks.remove(runnable);
    }
    
    static {
        INSTANCE = new ShutdownHook();
    }
}
