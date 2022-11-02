package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.util.*;

@FunctionalInterface
public interface AsyncCacheLoader<K, V>
{
    CompletableFuture<V> asyncLoad(final K p0, final Executor p1);
    
    default CompletableFuture<Map<K, V>> asyncLoadAll(final Iterable<? extends K> keys, final Executor executor) {
        throw new UnsupportedOperationException();
    }
    
    default CompletableFuture<V> asyncReload(final K key, final V oldValue, final Executor executor) {
        return this.asyncLoad(key, executor);
    }
}
