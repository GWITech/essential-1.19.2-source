package gg.essential.lib.caffeine.cache;

import java.util.*;
import java.util.concurrent.*;

public interface AsyncLoadingCache<K, V> extends AsyncCache<K, V>
{
    CompletableFuture<V> get(final K p0);
    
    CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> p0);
    
    default ConcurrentMap<K, CompletableFuture<V>> asMap() {
        throw new UnsupportedOperationException();
    }
    
    LoadingCache<K, V> synchronous();
    
    default /* bridge */ Cache synchronous() {
        return this.synchronous();
    }
}
