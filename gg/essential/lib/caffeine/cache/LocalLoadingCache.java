package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.util.*;
import java.util.logging.*;
import java.util.concurrent.*;
import java.lang.reflect.*;

interface LocalLoadingCache<K, V> extends LoadingCache<K, V>, LocalManualCache<K, V>
{
    public static final Logger logger = Logger.getLogger(LocalLoadingCache.class.getName());
    
    CacheLoader<? super K, V> cacheLoader();
    
    Function<K, V> mappingFunction();
    
    Function<Iterable<? extends K>, Map<K, V>> bulkMappingFunction();
    
    default V get(final K key) {
        return this.cache().computeIfAbsent(key, this.mappingFunction());
    }
    
    default Map<K, V> getAll(final Iterable<? extends K> keys) {
        final Function<Iterable<? extends K>, Map<K, V>> mappingFunction = this.bulkMappingFunction();
        return (mappingFunction == null) ? this.loadSequentially(keys) : this.getAll(keys, mappingFunction);
    }
    
    default Map<K, V> loadSequentially(final Iterable<? extends K> keys) {
        final Set<K> uniqueKeys = new LinkedHashSet<K>();
        for (final K key : keys) {
            uniqueKeys.add(key);
        }
        int count = 0;
        final Map<K, V> result = new LinkedHashMap<K, V>(uniqueKeys.size());
        try {
            for (final K key2 : uniqueKeys) {
                ++count;
                final V value = this.get(key2);
                if (value != null) {
                    result.put(key2, value);
                }
            }
        }
        catch (final Throwable t) {
            this.cache().statsCounter().recordMisses(uniqueKeys.size() - count);
            throw t;
        }
        return Collections.unmodifiableMap((Map<? extends K, ? extends V>)result);
    }
    
    default void refresh(final K key) {
        Objects.requireNonNull(key);
        final long[] writeTime = { 0L };
        final long startTime = this.cache().statsTicker().read();
        final V oldValue = this.cache().getIfPresentQuietly(key, writeTime);
        final CompletableFuture<V> refreshFuture = (oldValue == null) ? this.cacheLoader().asyncLoad(key, this.cache().executor()) : this.cacheLoader().asyncReload(key, oldValue, this.cache().executor());
        refreshFuture.whenComplete((newValue, error) -> {
            final long loadTime = this.cache().statsTicker().read() - startTime;
            if (error != null) {
                LocalLoadingCache.logger.log(Level.WARNING, "Exception thrown during refresh", error);
                this.cache().statsCounter().recordLoadFailure(loadTime);
            }
            else {
                final boolean[] discard = { false };
                this.cache().compute((K)key, (k, currentValue) -> {
                    if (currentValue == null) {
                        return (V)(V)newValue;
                    }
                    else {
                        if (currentValue == oldValue) {
                            final long expectedWriteTime = writeTime[0];
                            if (this.cache().hasWriteTime()) {
                                this.cache().getIfPresentQuietly(key, writeTime);
                            }
                            if (writeTime[0] == expectedWriteTime) {
                                return (V)(V)newValue;
                            }
                        }
                        discard[0] = true;
                        return (V)(V)currentValue;
                    }
                }, false, false, true);
                if (discard[0] && this.cache().hasRemovalListener()) {
                    this.cache().notifyRemoval((K)key, (V)newValue, RemovalCause.REPLACED);
                }
                if (newValue == null) {
                    this.cache().statsCounter().recordLoadFailure(loadTime);
                }
                else {
                    this.cache().statsCounter().recordLoadSuccess(loadTime);
                }
            }
        });
    }
    
    default <K, V> Function<K, V> newMappingFunction(final CacheLoader<? super K, V> cacheLoader) {
        return (Function<K, V>)(key -> {
            try {
                return cacheLoader.load(key);
            }
            catch (final RuntimeException e) {
                throw e;
            }
            catch (final InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new CompletionException(e2);
            }
            catch (final Exception e3) {
                throw new CompletionException(e3);
            }
        });
    }
    
    default <K, V> Function<Iterable<? extends K>, Map<K, V>> newBulkMappingFunction(final CacheLoader<? super K, V> cacheLoader) {
        if (!hasLoadAll(cacheLoader)) {
            return null;
        }
        return (Function<Iterable<? extends K>, Map<K, V>>)(keysToLoad -> {
            try {
                final Map<K, V> loaded = cacheLoader.loadAll(keysToLoad);
                return loaded;
            }
            catch (final RuntimeException e) {
                throw e;
            }
            catch (final InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new CompletionException(e2);
            }
            catch (final Exception e3) {
                throw new CompletionException(e3);
            }
        });
    }
    
    default boolean hasLoadAll(final CacheLoader<?, ?> loader) {
        try {
            final Method classLoadAll = loader.getClass().getMethod("loadAll", Iterable.class);
            final Method defaultLoadAll = CacheLoader.class.getMethod("loadAll", Iterable.class);
            return !classLoadAll.equals(defaultLoadAll);
        }
        catch (final NoSuchMethodException | SecurityException e) {
            LocalLoadingCache.logger.log(Level.WARNING, "Cannot determine if CacheLoader can bulk load", e);
            return false;
        }
    }
    
    default /* synthetic */ Map lambda$newBulkMappingFunction$3(final CacheLoader cacheLoader, final Iterable keysToLoad) {
        try {
            final Map<K, V> loaded = cacheLoader.loadAll(keysToLoad);
            return loaded;
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new CompletionException(e2);
        }
        catch (final Exception e3) {
            throw new CompletionException(e3);
        }
    }
    
    default /* synthetic */ Object lambda$newMappingFunction$2(final CacheLoader cacheLoader, final Object key) {
        try {
            return cacheLoader.load(key);
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new CompletionException(e2);
        }
        catch (final Exception e3) {
            throw new CompletionException(e3);
        }
    }
    
    default /* synthetic */ void lambda$refresh$1(final long startTime, final Object key, final Object oldValue, final long[] writeTime, final Object newValue, final Throwable error) {
        final long loadTime = this.cache().statsTicker().read() - startTime;
        if (error != null) {
            LocalLoadingCache.logger.log(Level.WARNING, "Exception thrown during refresh", error);
            this.cache().statsCounter().recordLoadFailure(loadTime);
            return;
        }
        final boolean[] discard = { false };
        this.cache().compute((K)key, (k, currentValue) -> {
            if (currentValue == null) {
                return newValue;
            }
            else {
                if (currentValue == oldValue) {
                    final long expectedWriteTime = writeTime[0];
                    if (this.cache().hasWriteTime()) {
                        this.cache().getIfPresentQuietly(key, writeTime);
                    }
                    if (writeTime[0] == expectedWriteTime) {
                        return newValue;
                    }
                }
                discard[0] = true;
                return currentValue;
            }
        }, false, false, true);
        if (discard[0] && this.cache().hasRemovalListener()) {
            this.cache().notifyRemoval((K)key, (V)newValue, RemovalCause.REPLACED);
        }
        if (newValue == null) {
            this.cache().statsCounter().recordLoadFailure(loadTime);
        }
        else {
            this.cache().statsCounter().recordLoadSuccess(loadTime);
        }
    }
    
    default /* synthetic */ Object lambda$refresh$0(final Object newValue, final Object oldValue, final long[] writeTime, final Object key, final boolean[] discard, final Object k, final Object currentValue) {
        if (currentValue == null) {
            return newValue;
        }
        if (currentValue == oldValue) {
            final long expectedWriteTime = writeTime[0];
            if (this.cache().hasWriteTime()) {
                this.cache().getIfPresentQuietly(key, writeTime);
            }
            if (writeTime[0] == expectedWriteTime) {
                return newValue;
            }
        }
        discard[0] = true;
        return currentValue;
    }
}
