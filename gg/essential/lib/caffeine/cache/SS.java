package gg.essential.lib.caffeine.cache;

class SS<K, V> extends BoundedLocalCache<K, V>
{
    SS(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, (CacheLoader<K, V>)cacheLoader, async);
    }
}
