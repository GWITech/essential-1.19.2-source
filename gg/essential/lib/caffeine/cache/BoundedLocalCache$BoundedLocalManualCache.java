package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.io.*;

static class BoundedLocalManualCache<K, V> implements LocalManualCache<K, V>, Serializable
{
    private static final long serialVersionUID = 1L;
    final BoundedLocalCache<K, V> cache;
    final boolean isWeighted;
    Policy<K, V> policy;
    
    BoundedLocalManualCache(final Caffeine<K, V> builder) {
        this(builder, null);
    }
    
    BoundedLocalManualCache(final Caffeine<K, V> builder, final CacheLoader<? super K, V> loader) {
        super();
        this.cache = LocalCacheFactory.newBoundedLocalCache(builder, loader, false);
        this.isWeighted = builder.isWeighted();
    }
    
    @Override
    public BoundedLocalCache<K, V> cache() {
        return this.cache;
    }
    
    @Override
    public Policy<K, V> policy() {
        return (this.policy == null) ? (this.policy = (Policy<K, V>)new BoundedLocalCache.BoundedPolicy((BoundedLocalCache)this.cache, (Function)Function.identity(), this.isWeighted)) : this.policy;
    }
    
    private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    Object writeReplace() {
        return BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
    }
    
    @Override
    public /* bridge */ LocalCache cache() {
        return this.cache();
    }
}
