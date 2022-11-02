package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.logging.*;
import java.util.concurrent.*;
import java.util.*;

interface LocalAsyncCache<K, V> extends AsyncCache<K, V>
{
    public static final Logger logger = Logger.getLogger(LocalAsyncCache.class.getName());
    
    LocalCache<K, CompletableFuture<V>> cache();
    
    Policy<K, V> policy();
    
    default CompletableFuture<V> getIfPresent(final Object key) {
        return this.cache().getIfPresent(key, true);
    }
    
    default CompletableFuture<V> get(final K key, final Function<? super K, ? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        return (CompletableFuture<V>)this.get(key, (k1, executor) -> CompletableFuture.supplyAsync(() -> mappingFunction.apply(key), executor));
    }
    
    default CompletableFuture<V> get(final K key, final BiFunction<? super K, Executor, CompletableFuture<V>> mappingFunction) {
        return this.get(key, mappingFunction, true);
    }
    
    default CompletableFuture<V> get(final K key, final BiFunction<? super K, Executor, CompletableFuture<V>> mappingFunction, final boolean recordStats) {
        final long startTime = this.cache().statsTicker().read();
        final CompletableFuture<V>[] result = { null };
        final CompletableFuture<V> future = this.cache().computeIfAbsent(key, k -> {
            result[0] = mappingFunction.apply(key, this.cache().executor());
            return Objects.requireNonNull(result[0]);
        }, recordStats, false);
        if (result[0] != null) {
            this.handleCompletion(key, result[0], startTime, false);
        }
        return future;
    }
    
    default CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> keys, final Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        return (CompletableFuture<Map<K, V>>)this.getAll((Iterable<?>)keys, (keysToLoad, executor) -> CompletableFuture.supplyAsync(() -> mappingFunction.apply(keysToLoad), executor));
    }
    
    default CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> keys, final BiFunction<Iterable<? extends K>, Executor, CompletableFuture<Map<K, V>>> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        Objects.requireNonNull(keys);
        final Map<K, CompletableFuture<V>> futures = new LinkedHashMap<K, CompletableFuture<V>>();
        final Map<K, CompletableFuture<V>> proxies = new HashMap<K, CompletableFuture<V>>();
        for (final K key : keys) {
            if (futures.containsKey(key)) {
                continue;
            }
            CompletableFuture<V> future = this.cache().getIfPresent(key, false);
            if (future == null) {
                final CompletableFuture<V> proxy = new CompletableFuture<V>();
                future = this.cache().putIfAbsent(key, proxy);
                if (future == null) {
                    future = proxy;
                    proxies.put(key, proxy);
                }
            }
            futures.put(key, future);
        }
        this.cache().statsCounter().recordMisses(proxies.size());
        this.cache().statsCounter().recordHits(futures.size() - proxies.size());
        if (proxies.isEmpty()) {
            return this.composeResult(futures);
        }
        final LocalAsyncCache.AsyncBulkCompleter<K, V> completer = (LocalAsyncCache.AsyncBulkCompleter<K, V>)new LocalAsyncCache.AsyncBulkCompleter((LocalCache)this.cache(), (Map)proxies);
        try {
            mappingFunction.apply((Iterable<? extends K>)proxies.keySet(), this.cache().executor()).whenComplete((BiConsumer)completer);
            return this.composeResult(futures);
        }
        catch (final Throwable t) {
            completer.accept((Map)null, t);
            throw t;
        }
    }
    
    default CompletableFuture<Map<K, V>> composeResult(final Map<K, CompletableFuture<V>> futures) {
        if (futures.isEmpty()) {
            return CompletableFuture.completedFuture(Collections.emptyMap());
        }
        final CompletableFuture<?>[] array = futures.values().toArray(new CompletableFuture[0]);
        return CompletableFuture.allOf(array).thenApply(ignored -> {
            final Map<K, V> result = new LinkedHashMap<K, V>(futures.size());
            futures.forEach((key, future) -> {
                final V value = future.getNow(null);
                if (value != null) {
                    result.put(key, value);
                }
                return;
            });
            return Collections.unmodifiableMap((Map<?, ?>)result);
        });
    }
    
    default void put(final K key, final CompletableFuture<V> valueFuture) {
        if (valueFuture.isCompletedExceptionally() || (valueFuture.isDone() && valueFuture.join() == null)) {
            this.cache().statsCounter().recordLoadFailure(0L);
            this.cache().remove(key);
            return;
        }
        final long startTime = this.cache().statsTicker().read();
        this.cache().put(key, valueFuture);
        this.handleCompletion(key, valueFuture, startTime, false);
    }
    
    default void handleCompletion(final K key, final CompletableFuture<V> valueFuture, final long startTime, final boolean recordMiss) {
        final AtomicBoolean completed = new AtomicBoolean();
        valueFuture.whenComplete((value, error) -> {
            if (!(!completed.compareAndSet(false, true))) {
                final long loadTime = this.cache().statsTicker().read() - startTime;
                if (value == null) {
                    if (error != null) {
                        LocalAsyncCache.logger.log(Level.WARNING, "Exception thrown during asynchronous load", error);
                    }
                    this.cache().remove(key, valueFuture);
                    this.cache().statsCounter().recordLoadFailure(loadTime);
                    if (recordMiss) {
                        this.cache().statsCounter().recordMisses(1);
                    }
                }
                else {
                    this.cache().replace((K)key, valueFuture, valueFuture);
                    this.cache().statsCounter().recordLoadSuccess(loadTime);
                    if (recordMiss) {
                        this.cache().statsCounter().recordMisses(1);
                    }
                }
            }
        });
    }
    
    default /* synthetic */ void lambda$handleCompletion$7(final AtomicBoolean completed, final long startTime, final Object key, final CompletableFuture valueFuture, final boolean recordMiss, final Object value, final Throwable error) {
        if (!completed.compareAndSet(false, true)) {
            return;
        }
        final long loadTime = this.cache().statsTicker().read() - startTime;
        if (value == null) {
            if (error != null) {
                LocalAsyncCache.logger.log(Level.WARNING, "Exception thrown during asynchronous load", error);
            }
            this.cache().remove(key, valueFuture);
            this.cache().statsCounter().recordLoadFailure(loadTime);
            if (recordMiss) {
                this.cache().statsCounter().recordMisses(1);
            }
        }
        else {
            this.cache().replace((K)key, valueFuture, valueFuture);
            this.cache().statsCounter().recordLoadSuccess(loadTime);
            if (recordMiss) {
                this.cache().statsCounter().recordMisses(1);
            }
        }
    }
    
    default /* synthetic */ Map lambda$composeResult$6(final Map futures, final Void ignored) {
        final Map<K, V> result = new LinkedHashMap<K, V>(futures.size());
        futures.forEach((key, future) -> {
            final V value = future.getNow(null);
            if (value != null) {
                result.put(key, value);
            }
            return;
        });
        return Collections.unmodifiableMap((Map<?, ?>)result);
    }
    
    default /* synthetic */ void lambda$composeResult$5(final Map result, final Object key, final CompletableFuture future) {
        final V value = future.getNow(null);
        if (value != null) {
            result.put(key, value);
        }
    }
    
    default /* synthetic */ CompletableFuture lambda$getAll$4(final Function mappingFunction, final Iterable keysToLoad, final Executor executor) {
        return CompletableFuture.supplyAsync(() -> mappingFunction.apply(keysToLoad), executor);
    }
    
    default /* synthetic */ Map lambda$getAll$3(final Function mappingFunction, final Iterable keysToLoad) {
        return mappingFunction.apply(keysToLoad);
    }
    
    default /* synthetic */ CompletableFuture lambda$get$2(final CompletableFuture[] result, final BiFunction mappingFunction, final Object key, final Object k) {
        result[0] = mappingFunction.apply(key, this.cache().executor());
        return Objects.requireNonNull(result[0]);
    }
    
    default /* synthetic */ CompletableFuture lambda$get$1(final Function mappingFunction, final Object key, final Object k1, final Executor executor) {
        return CompletableFuture.supplyAsync(() -> mappingFunction.apply(key), executor);
    }
    
    default /* synthetic */ Object lambda$get$0(final Function mappingFunction, final Object key) {
        return mappingFunction.apply(key);
    }
    
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
}
