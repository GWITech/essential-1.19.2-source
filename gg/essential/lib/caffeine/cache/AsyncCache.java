package gg.essential.lib.caffeine.cache;

import com.google.errorprone.annotations.*;
import java.util.function.*;
import java.util.*;
import java.util.concurrent.*;

public interface AsyncCache<K, V>
{
    CompletableFuture<V> getIfPresent(@CompatibleWith("K") final Object p0);
    
    CompletableFuture<V> get(final K p0, final Function<? super K, ? extends V> p1);
    
    CompletableFuture<V> get(final K p0, final BiFunction<? super K, Executor, CompletableFuture<V>> p1);
    
    default CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> keys, final Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
        throw new UnsupportedOperationException();
    }
    
    default CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> keys, final BiFunction<Iterable<? extends K>, Executor, CompletableFuture<Map<K, V>>> mappingFunction) {
        throw new UnsupportedOperationException();
    }
    
    void put(final K p0, final CompletableFuture<V> p1);
    
    ConcurrentMap<K, CompletableFuture<V>> asMap();
    
    Cache<K, V> synchronous();
}
