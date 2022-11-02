package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.util.function.*;
import java.io.*;

static final class UnboundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable
{
    private static final long serialVersionUID = 1L;
    final UnboundedLocalCache<K, CompletableFuture<V>> cache;
    ConcurrentMap<K, CompletableFuture<V>> mapView;
    Policy<K, V> policy;
    
    UnboundedLocalAsyncLoadingCache(final Caffeine<K, V> builder, final AsyncCacheLoader<? super K, V> loader) {
        super((AsyncCacheLoader<? super Object, V>)loader);
        this.cache = new UnboundedLocalCache((Caffeine)builder, true);
    }
    
    @Override
    public LocalCache<K, CompletableFuture<V>> cache() {
        return (LocalCache<K, CompletableFuture<V>>)this.cache;
    }
    
    @Override
    public ConcurrentMap<K, CompletableFuture<V>> asMap() {
        return (this.mapView == null) ? (this.mapView = new LocalAsyncCache.AsyncAsMapView(this)) : this.mapView;
    }
    
    @Override
    public Policy<K, V> policy() {
        final UnboundedLocalCache<K, V> castCache = (UnboundedLocalCache<K, V>)this.cache;
        final Function<V, V> castTransformer;
        final Function<CompletableFuture<V>, V> transformer = (Function<CompletableFuture<V>, V>)(castTransformer = (Function<V, V>)Async::getIfReady);
        return (this.policy == null) ? (this.policy = (Policy)new UnboundedLocalCache.UnboundedPolicy((UnboundedLocalCache)castCache, (Function)castTransformer)) : this.policy;
    }
    
    private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    Object writeReplace() {
        final SerializationProxy<K, V> proxy = (SerializationProxy<K, V>)new SerializationProxy();
        proxy.isRecordingStats = this.cache.isRecordingStats();
        proxy.removalListener = this.cache.removalListener();
        proxy.ticker = this.cache.ticker;
        proxy.writer = this.cache.writer;
        proxy.loader = this.loader;
        proxy.async = true;
        return proxy;
    }
}
