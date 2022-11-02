package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.util.*;
import gg.essential.lib.caffeine.cache.stats.*;
import java.util.concurrent.*;

interface LocalManualCache<K, V> extends Cache<K, V>
{
    LocalCache<K, V> cache();
    
    default long estimatedSize() {
        return this.cache().estimatedSize();
    }
    
    default void cleanUp() {
        this.cache().cleanUp();
    }
    
    default V getIfPresent(final Object key) {
        return this.cache().getIfPresent(key, true);
    }
    
    default V get(final K key, final Function<? super K, ? extends V> mappingFunction) {
        return this.cache().computeIfAbsent(key, mappingFunction);
    }
    
    default Map<K, V> getAllPresent(final Iterable<?> keys) {
        return this.cache().getAllPresent(keys);
    }
    
    default Map<K, V> getAll(final Iterable<? extends K> keys, final Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        final Set<K> keysToLoad = new LinkedHashSet<K>();
        final Map<K, V> found = this.cache().getAllPresent(keys);
        final Map<K, V> result = new LinkedHashMap<K, V>(found.size());
        for (final K key : keys) {
            final V value = found.get(key);
            if (value == null) {
                keysToLoad.add(key);
            }
            result.put(key, value);
        }
        if (keysToLoad.isEmpty()) {
            return found;
        }
        this.bulkLoad(keysToLoad, result, mappingFunction);
        return Collections.unmodifiableMap((Map<? extends K, ? extends V>)result);
    }
    
    default void bulkLoad(final Set<K> keysToLoad, final Map<K, V> result, final Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
        final long startTime = this.cache().statsTicker().read();
        try {
            final Map<K, V> loaded = mappingFunction.apply((Iterable<? extends K>)keysToLoad);
            K key = null;
            V value = null;
            loaded.forEach((key, value) -> this.cache().put((K)key, (V)value, false));
            final Iterator<K> iterator = keysToLoad.iterator();
            while (iterator.hasNext()) {
                key = iterator.next();
                value = loaded.get(key);
                if (value == null) {
                    result.remove(key);
                }
                else {
                    result.put(key, value);
                }
            }
            final boolean success = !loaded.isEmpty();
            final long loadTime = this.cache().statsTicker().read() - startTime;
            if (success) {
                this.cache().statsCounter().recordLoadSuccess(loadTime);
            }
            else {
                this.cache().statsCounter().recordLoadFailure(loadTime);
            }
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final Exception e2) {
            throw new CompletionException(e2);
        }
        finally {
            final long loadTime2 = this.cache().statsTicker().read() - startTime;
            this.cache().statsCounter().recordLoadFailure(loadTime2);
        }
    }
    
    default void put(final K key, final V value) {
        this.cache().put(key, value);
    }
    
    default void putAll(final Map<? extends K, ? extends V> map) {
        this.cache().putAll((Map<?, ?>)map);
    }
    
    default void invalidate(final Object key) {
        this.cache().remove(key);
    }
    
    default void invalidateAll(final Iterable<?> keys) {
        this.cache().invalidateAll(keys);
    }
    
    default void invalidateAll() {
        this.cache().clear();
    }
    
    default CacheStats stats() {
        return this.cache().statsCounter().snapshot();
    }
    
    default ConcurrentMap<K, V> asMap() {
        return this.cache();
    }
    
    default /* synthetic */ void lambda$bulkLoad$0(final Object key, final Object value) {
        this.cache().put((K)key, (V)value, false);
    }
}
