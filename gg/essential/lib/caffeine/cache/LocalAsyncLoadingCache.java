package gg.essential.lib.caffeine.cache;

import java.util.logging.*;
import java.lang.reflect.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.*;

abstract class LocalAsyncLoadingCache<K, V> implements AsyncLoadingCache<K, V>, LocalAsyncCache<K, V>
{
    static final Logger logger;
    final boolean canBulkLoad;
    final AsyncCacheLoader<K, V> loader;
    LocalAsyncLoadingCache.LoadingCacheView<K, V> cacheView;
    
    LocalAsyncLoadingCache(final AsyncCacheLoader<? super K, V> loader) {
        super();
        this.loader = (AsyncCacheLoader<K, V>)loader;
        this.canBulkLoad = canBulkLoad(loader);
    }
    
    private static boolean canBulkLoad(final AsyncCacheLoader<?, ?> loader) {
        try {
            Class<?> defaultLoaderClass = AsyncCacheLoader.class;
            if (loader instanceof CacheLoader) {
                defaultLoaderClass = CacheLoader.class;
                final Method classLoadAll = loader.getClass().getMethod("loadAll", Iterable.class);
                final Method defaultLoadAll = CacheLoader.class.getMethod("loadAll", Iterable.class);
                if (!classLoadAll.equals(defaultLoadAll)) {
                    return true;
                }
            }
            final Method classAsyncLoadAll = loader.getClass().getMethod("asyncLoadAll", Iterable.class, Executor.class);
            final Method defaultAsyncLoadAll = defaultLoaderClass.getMethod("asyncLoadAll", Iterable.class, Executor.class);
            return !classAsyncLoadAll.equals(defaultAsyncLoadAll);
        }
        catch (final NoSuchMethodException | SecurityException e) {
            LocalAsyncLoadingCache.logger.log(Level.WARNING, "Cannot determine if CacheLoader can bulk load", e);
            return false;
        }
    }
    
    @Override
    public CompletableFuture<V> get(final K key) {
        final AsyncCacheLoader<K, V> loader = this.loader;
        Objects.requireNonNull(loader);
        return this.get(key, (BiFunction<? super K, Executor, CompletableFuture<V>>)loader::asyncLoad);
    }
    
    @Override
    public CompletableFuture<Map<K, V>> getAll(final Iterable<? extends K> keys) {
        if (this.canBulkLoad) {
            final AsyncCacheLoader<K, V> loader = this.loader;
            Objects.requireNonNull(loader);
            return this.getAll(keys, (BiFunction<Iterable<? extends K>, Executor, CompletableFuture<Map<K, V>>>)loader::asyncLoadAll);
        }
        final Map<K, CompletableFuture<V>> result = new LinkedHashMap<K, CompletableFuture<V>>();
        final Function<K, CompletableFuture<V>> mappingFunction = this::get;
        for (final K key : keys) {
            final CompletableFuture<V> future = result.computeIfAbsent(key, mappingFunction);
            Objects.requireNonNull(future);
        }
        return this.composeResult(result);
    }
    
    @Override
    public LoadingCache<K, V> synchronous() {
        return (LoadingCache<K, V>)((this.cacheView == null) ? (this.cacheView = (LocalAsyncLoadingCache.LoadingCacheView<K, V>)new LocalAsyncLoadingCache.LoadingCacheView(this)) : this.cacheView);
    }
    
    @Override
    public /* bridge */ Cache synchronous() {
        return this.synchronous();
    }
    
    static {
        logger = Logger.getLogger(LocalAsyncLoadingCache.class.getName());
    }
}
