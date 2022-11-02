package gg.essential.lib.caffeine.cache;

import java.util.*;
import java.util.concurrent.*;

@FunctionalInterface
public interface CacheLoader<K, V> extends AsyncCacheLoader<K, V>
{
    V load(final K p0) throws Exception;
    
    default Map<K, V> loadAll(final Iterable<? extends K> keys) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    default CompletableFuture<V> asyncLoad(final K key, final Executor executor) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(executor);
        return CompletableFuture.supplyAsync(() -> {
            try {
                return this.load(key);
            }
            catch (final RuntimeException e) {
                throw e;
            }
            catch (final Exception e2) {
                throw new CompletionException(e2);
            }
        }, executor);
    }
    
    default CompletableFuture<Map<K, V>> asyncLoadAll(final Iterable<? extends K> keys, final Executor executor) {
        Objects.requireNonNull(keys);
        Objects.requireNonNull(executor);
        return CompletableFuture.supplyAsync(() -> {
            try {
                return this.loadAll(keys);
            }
            catch (final RuntimeException e) {
                throw e;
            }
            catch (final Exception e2) {
                throw new CompletionException(e2);
            }
        }, executor);
    }
    
    default V reload(final K key, final V oldValue) throws Exception {
        return this.load(key);
    }
    
    default CompletableFuture<V> asyncReload(final K key, final V oldValue, final Executor executor) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(executor);
        return CompletableFuture.supplyAsync(() -> {
            try {
                return this.reload(key, oldValue);
            }
            catch (final RuntimeException e) {
                throw e;
            }
            catch (final Exception e2) {
                throw new CompletionException(e2);
            }
        }, executor);
    }
    
    default /* synthetic */ Object lambda$asyncReload$2(final Object key, final Object oldValue) {
        try {
            return this.reload(key, oldValue);
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final Exception e2) {
            throw new CompletionException(e2);
        }
    }
    
    default /* synthetic */ Map lambda$asyncLoadAll$1(final Iterable keys) {
        try {
            return this.loadAll(keys);
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final Exception e2) {
            throw new CompletionException(e2);
        }
    }
    
    default /* synthetic */ Object lambda$asyncLoad$0(final Object key) {
        try {
            return this.load(key);
        }
        catch (final RuntimeException e) {
            throw e;
        }
        catch (final Exception e2) {
            throw new CompletionException(e2);
        }
    }
}
