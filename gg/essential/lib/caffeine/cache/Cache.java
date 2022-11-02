package gg.essential.lib.caffeine.cache;

import com.google.errorprone.annotations.*;
import java.util.function.*;
import java.util.*;
import gg.essential.lib.caffeine.cache.stats.*;
import java.util.concurrent.*;

public interface Cache<K, V>
{
    V getIfPresent(@CompatibleWith("K") final Object p0);
    
    V get(final K p0, final Function<? super K, ? extends V> p1);
    
    Map<K, V> getAllPresent(final Iterable<?> p0);
    
    default Map<K, V> getAll(final Iterable<? extends K> keys, final Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
        throw new UnsupportedOperationException();
    }
    
    void put(final K p0, final V p1);
    
    void putAll(final Map<? extends K, ? extends V> p0);
    
    void invalidate(@CompatibleWith("K") final Object p0);
    
    void invalidateAll(final Iterable<?> p0);
    
    void invalidateAll();
    
    long estimatedSize();
    
    CacheStats stats();
    
    ConcurrentMap<K, V> asMap();
    
    void cleanUp();
    
    Policy<K, V> policy();
}
