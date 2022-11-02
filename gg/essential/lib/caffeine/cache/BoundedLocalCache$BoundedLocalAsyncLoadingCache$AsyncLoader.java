package gg.essential.lib.caffeine.cache;

import java.util.*;
import java.util.concurrent.*;

static final class AsyncLoader<K, V> implements CacheLoader<K, V>
{
    final AsyncCacheLoader<? super K, V> loader;
    final Executor executor;
    
    AsyncLoader(final AsyncCacheLoader<? super K, V> loader, final Caffeine<?, ?> builder) {
        super();
        this.executor = Objects.requireNonNull(builder.getExecutor());
        this.loader = Objects.requireNonNull(loader);
    }
    
    @Override
    public V load(final K key) {
        final V newValue = (V)this.loader.asyncLoad(key, this.executor);
        return newValue;
    }
    
    @Override
    public V reload(final K key, final V oldValue) {
        final V newValue = (V)this.loader.asyncReload(key, oldValue, this.executor);
        return newValue;
    }
    
    @Override
    public CompletableFuture<V> asyncReload(final K key, final V oldValue, final Executor executor) {
        return this.loader.asyncReload(key, oldValue, executor);
    }
}
