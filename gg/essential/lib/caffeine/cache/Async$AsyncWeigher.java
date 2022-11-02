package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.io.*;
import java.util.*;

static final class AsyncWeigher<K, V> implements Weigher<K, CompletableFuture<V>>, Serializable
{
    private static final long serialVersionUID = 1L;
    final Weigher<K, V> delegate;
    
    AsyncWeigher(final Weigher<K, V> delegate) {
        super();
        this.delegate = Objects.requireNonNull(delegate);
    }
    
    @Override
    public int weigh(final K key, final CompletableFuture<V> future) {
        return Async.isReady(future) ? this.delegate.weigh(key, future.join()) : 0;
    }
    
    Object writeReplace() {
        return this.delegate;
    }
    
    @Override
    public /* bridge */ int weigh(final Object key, final Object o) {
        return this.weigh(key, (CompletableFuture<V>)o);
    }
}
