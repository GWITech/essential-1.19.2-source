package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.*;

static final class BoundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable
{
    private static final long serialVersionUID = 1L;
    final BoundedLocalCache<K, CompletableFuture<V>> cache;
    final boolean isWeighted;
    ConcurrentMap<K, CompletableFuture<V>> mapView;
    Policy<K, V> policy;
    
    BoundedLocalAsyncLoadingCache(final Caffeine<K, V> builder, final AsyncCacheLoader<? super K, V> loader) {
        super((AsyncCacheLoader<? super Object, V>)loader);
        this.isWeighted = builder.isWeighted();
        this.cache = LocalCacheFactory.newBoundedLocalCache((Caffeine<K, CompletableFuture<V>>)builder, new AsyncLoader<Object, CompletableFuture<V>>((AsyncCacheLoader<? super K, CompletableFuture<V>>)loader, builder), true);
    }
    
    @Override
    public BoundedLocalCache<K, CompletableFuture<V>> cache() {
        return this.cache;
    }
    
    @Override
    public ConcurrentMap<K, CompletableFuture<V>> asMap() {
        return (this.mapView == null) ? (this.mapView = new LocalAsyncCache.AsyncAsMapView<K, V>(this)) : this.mapView;
    }
    
    @Override
    public Policy<K, V> policy() {
        if (this.policy == null) {
            final BoundedLocalCache<K, V> castCache = (BoundedLocalCache<K, V>)this.cache;
            final Function<V, V> castTransformer;
            final Function<CompletableFuture<V>, V> transformer = (Function<CompletableFuture<V>, V>)(castTransformer = (Function<V, V>)Async::getIfReady);
            this.policy = (Policy<K, V>)new BoundedLocalCache.BoundedPolicy((BoundedLocalCache)castCache, (Function)castTransformer, this.isWeighted);
        }
        return this.policy;
    }
    
    private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    Object writeReplace() {
        final SerializationProxy<K, V> proxy = BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
        if (this.cache.refreshAfterWrite()) {
            proxy.refreshAfterWriteNanos = this.cache.refreshAfterWriteNanos();
        }
        proxy.loader = this.loader;
        proxy.async = true;
        return proxy;
    }
    
    @Override
    public /* bridge */ LocalCache cache() {
        return this.cache();
    }
    
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
}
