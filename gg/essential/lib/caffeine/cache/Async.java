package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import java.io.*;
import java.util.*;

final class Async
{
    static final long ASYNC_EXPIRY = 6917529027641081854L;
    
    private Async() {
        super();
    }
    
    static boolean isReady(final CompletableFuture<?> future) {
        return future != null && future.isDone() && !future.isCompletedExceptionally() && future.join() != null;
    }
    
    static <V> V getIfReady(final CompletableFuture<V> future) {
        return isReady(future) ? future.join() : null;
    }
    
    static <V> V getWhenSuccessful(final CompletableFuture<V> future) {
        try {
            return (future == null) ? null : future.join();
        }
        catch (final CancellationException | CompletionException ex) {
            return null;
        }
    }
    
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
}
