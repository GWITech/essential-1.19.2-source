package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.lang.ref.*;
import java.util.logging.*;

static final class PerformCleanupTask extends ForkJoinTask<Void> implements Runnable
{
    private static final long serialVersionUID = 1L;
    final WeakReference<BoundedLocalCache<?, ?>> reference;
    
    PerformCleanupTask(final BoundedLocalCache<?, ?> cache) {
        super();
        this.reference = new WeakReference<BoundedLocalCache<?, ?>>(cache);
    }
    
    public boolean exec() {
        try {
            this.run();
        }
        catch (final Throwable t) {
            BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", t);
        }
        return false;
    }
    
    @Override
    public void run() {
        final BoundedLocalCache<?, ?> cache = this.reference.get();
        if (cache != null) {
            cache.performCleanUp(null);
        }
    }
    
    @Override
    public Void getRawResult() {
        return null;
    }
    
    public void setRawResult(final Void v) {
    }
    
    @Override
    public void complete(final Void value) {
    }
    
    @Override
    public void completeExceptionally(final Throwable ex) {
    }
    
    @Override
    public boolean cancel(final boolean mayInterruptIfRunning) {
        return false;
    }
    
    public /* bridge */ void setRawResult(final Object o) {
        this.setRawResult((Void)o);
    }
    
    @Override
    public /* bridge */ Object getRawResult() {
        return this.getRawResult();
    }
    
    @Override
    public /* bridge */ void complete(final Object o) {
        this.complete((Void)o);
    }
}
