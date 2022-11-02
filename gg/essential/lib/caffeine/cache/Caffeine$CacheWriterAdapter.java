package gg.essential.lib.caffeine.cache;

import java.io.*;
import java.util.concurrent.*;
import java.util.logging.*;

static final class CacheWriterAdapter<K, V> implements CacheWriter<K, V>, Serializable
{
    private static final long serialVersionUID = 1L;
    final RemovalListener<? super K, ? super V> delegate;
    final boolean isAsync;
    
    CacheWriterAdapter(final RemovalListener<? super K, ? super V> delegate, final boolean isAsync) {
        super();
        this.delegate = delegate;
        this.isAsync = isAsync;
    }
    
    @Override
    public void write(final K key, final V value) {
    }
    
    @Override
    public void delete(final K key, V value, final RemovalCause cause) {
        if (cause.wasEvicted()) {
            try {
                if (this.isAsync && value != null) {
                    final CompletableFuture<V> future = (CompletableFuture<V>)value;
                    value = Async.getIfReady(future);
                }
                this.delegate.onRemoval((Object)key, (Object)value, cause);
            }
            catch (final Throwable t) {
                Caffeine.logger.log(Level.WARNING, "Exception thrown by eviction listener", t);
            }
        }
    }
}
