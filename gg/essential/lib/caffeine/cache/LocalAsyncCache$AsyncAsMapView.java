package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.util.function.*;
import java.util.*;

public static final class AsyncAsMapView<K, V> implements ConcurrentMap<K, CompletableFuture<V>>
{
    final LocalAsyncCache<K, V> asyncCache;
    
    AsyncAsMapView(final LocalAsyncCache<K, V> asyncCache) {
        super();
        this.asyncCache = Objects.requireNonNull(asyncCache);
    }
    
    @Override
    public boolean isEmpty() {
        return this.asyncCache.cache().isEmpty();
    }
    
    @Override
    public int size() {
        return this.asyncCache.cache().size();
    }
    
    @Override
    public void clear() {
        this.asyncCache.cache().clear();
    }
    
    @Override
    public boolean containsKey(final Object key) {
        return this.asyncCache.cache().containsKey(key);
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return this.asyncCache.cache().containsValue(value);
    }
    
    @Override
    public CompletableFuture<V> get(final Object key) {
        return this.asyncCache.cache().get(key);
    }
    
    @Override
    public CompletableFuture<V> putIfAbsent(final K key, final CompletableFuture<V> value) {
        final CompletableFuture<V> prior = this.asyncCache.cache().putIfAbsent(key, value);
        final long startTime = this.asyncCache.cache().statsTicker().read();
        if (prior == null) {
            this.asyncCache.handleCompletion(key, value, startTime, false);
        }
        return prior;
    }
    
    @Override
    public CompletableFuture<V> put(final K key, final CompletableFuture<V> value) {
        final CompletableFuture<V> prior = this.asyncCache.cache().put(key, value);
        final long startTime = this.asyncCache.cache().statsTicker().read();
        this.asyncCache.handleCompletion(key, value, startTime, false);
        return prior;
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends CompletableFuture<V>> map) {
        map.forEach(this::put);
    }
    
    @Override
    public CompletableFuture<V> replace(final K key, final CompletableFuture<V> value) {
        final CompletableFuture<V> prior = this.asyncCache.cache().replace(key, value);
        final long startTime = this.asyncCache.cache().statsTicker().read();
        if (prior != null) {
            this.asyncCache.handleCompletion(key, value, startTime, false);
        }
        return prior;
    }
    
    @Override
    public boolean replace(final K key, final CompletableFuture<V> oldValue, final CompletableFuture<V> newValue) {
        final boolean replaced = this.asyncCache.cache().replace(key, oldValue, newValue);
        final long startTime = this.asyncCache.cache().statsTicker().read();
        if (replaced) {
            this.asyncCache.handleCompletion(key, newValue, startTime, false);
        }
        return replaced;
    }
    
    @Override
    public CompletableFuture<V> remove(final Object key) {
        return this.asyncCache.cache().remove(key);
    }
    
    @Override
    public boolean remove(final Object key, final Object value) {
        return this.asyncCache.cache().remove(key, value);
    }
    
    @Override
    public CompletableFuture<V> computeIfAbsent(final K key, final Function<? super K, ? extends CompletableFuture<V>> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        final CompletableFuture<V>[] result = { null };
        final long startTime = this.asyncCache.cache().statsTicker().read();
        final CompletableFuture<V> future = this.asyncCache.cache().computeIfAbsent(key, k -> result[0] = mappingFunction.apply(k), false, false);
        if (result[0] == null) {
            if (future != null && this.asyncCache.cache().isRecordingStats()) {
                future.whenComplete((r, e) -> {
                    if (r != null || e == null) {
                        this.asyncCache.cache().statsCounter().recordHits(1);
                    }
                    return;
                });
            }
        }
        else {
            this.asyncCache.handleCompletion(key, result[0], startTime, true);
        }
        return future;
    }
    
    @Override
    public CompletableFuture<V> computeIfPresent(final K key, final BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        final CompletableFuture<V>[] result = { null };
        final long startTime = this.asyncCache.cache().statsTicker().read();
        this.asyncCache.cache().compute(key, (k, oldValue) -> result[0] = ((oldValue == null) ? null : remappingFunction.apply(k, oldValue)), false, false, false);
        if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
        }
        return result[0];
    }
    
    @Override
    public CompletableFuture<V> compute(final K key, final BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        final CompletableFuture<V>[] result = { null };
        final long startTime = this.asyncCache.cache().statsTicker().read();
        this.asyncCache.cache().compute(key, (k, oldValue) -> result[0] = remappingFunction.apply(k, oldValue), false, false, false);
        if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
        }
        return result[0];
    }
    
    @Override
    public CompletableFuture<V> merge(final K key, final CompletableFuture<V> value, final BiFunction<? super CompletableFuture<V>, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction) {
        Objects.requireNonNull(value);
        Objects.requireNonNull(remappingFunction);
        final CompletableFuture<V>[] result = { null };
        final long startTime = this.asyncCache.cache().statsTicker().read();
        this.asyncCache.cache().compute(key, (k, oldValue) -> result[0] = ((oldValue == null) ? value : remappingFunction.apply(oldValue, value)), false, false, false);
        if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
        }
        return result[0];
    }
    
    @Override
    public Set<K> keySet() {
        return this.asyncCache.cache().keySet();
    }
    
    @Override
    public Collection<CompletableFuture<V>> values() {
        return this.asyncCache.cache().values();
    }
    
    @Override
    public Set<Map.Entry<K, CompletableFuture<V>>> entrySet() {
        return this.asyncCache.cache().entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.asyncCache.cache().equals(o);
    }
    
    @Override
    public int hashCode() {
        return this.asyncCache.cache().hashCode();
    }
    
    @Override
    public String toString() {
        return this.asyncCache.cache().toString();
    }
    
    @Override
    public /* bridge */ Object merge(final Object key, final Object o, final BiFunction remappingFunction) {
        return this.merge(key, (CompletableFuture<V>)o, (BiFunction<? super CompletableFuture<V>, ? super CompletableFuture<V>, ? extends CompletableFuture<V>>)remappingFunction);
    }
    
    @Override
    public /* bridge */ Object compute(final Object key, final BiFunction remappingFunction) {
        return this.compute(key, (BiFunction<? super Object, ? super CompletableFuture<V>, ? extends CompletableFuture<V>>)remappingFunction);
    }
    
    @Override
    public /* bridge */ Object computeIfPresent(final Object key, final BiFunction remappingFunction) {
        return this.computeIfPresent(key, (BiFunction<? super Object, ? super CompletableFuture<V>, ? extends CompletableFuture<V>>)remappingFunction);
    }
    
    @Override
    public /* bridge */ Object computeIfAbsent(final Object key, final Function mappingFunction) {
        return this.computeIfAbsent(key, (Function<? super Object, ? extends CompletableFuture<V>>)mappingFunction);
    }
    
    @Override
    public /* bridge */ Object replace(final Object key, final Object o) {
        return this.replace(key, (CompletableFuture<V>)o);
    }
    
    @Override
    public /* bridge */ boolean replace(final Object key, final Object o, final Object o2) {
        return this.replace(key, (CompletableFuture<V>)o, (CompletableFuture<V>)o2);
    }
    
    @Override
    public /* bridge */ Object putIfAbsent(final Object key, final Object o) {
        return this.putIfAbsent(key, (CompletableFuture<V>)o);
    }
    
    @Override
    public /* bridge */ Object remove(final Object key) {
        return this.remove(key);
    }
    
    @Override
    public /* bridge */ Object put(final Object key, final Object o) {
        return this.put(key, (CompletableFuture<V>)o);
    }
    
    @Override
    public /* bridge */ Object get(final Object key) {
        return this.get(key);
    }
    
    private static /* synthetic */ CompletableFuture lambda$merge$4(final CompletableFuture[] result, final CompletableFuture value, final BiFunction remappingFunction, final Object k, final CompletableFuture oldValue) {
        return result[0] = ((oldValue == null) ? value : remappingFunction.apply(oldValue, value));
    }
    
    private static /* synthetic */ CompletableFuture lambda$compute$3(final CompletableFuture[] result, final BiFunction remappingFunction, final Object k, final CompletableFuture oldValue) {
        return result[0] = remappingFunction.apply(k, oldValue);
    }
    
    private static /* synthetic */ CompletableFuture lambda$computeIfPresent$2(final CompletableFuture[] result, final BiFunction remappingFunction, final Object k, final CompletableFuture oldValue) {
        return result[0] = ((oldValue == null) ? null : remappingFunction.apply(k, oldValue));
    }
    
    private /* synthetic */ void lambda$computeIfAbsent$1(final Object r, final Throwable e) {
        if (r != null || e == null) {
            this.asyncCache.cache().statsCounter().recordHits(1);
        }
    }
    
    private static /* synthetic */ CompletableFuture lambda$computeIfAbsent$0(final CompletableFuture[] result, final Function mappingFunction, final Object k) {
        return result[0] = mappingFunction.apply(k);
    }
}
