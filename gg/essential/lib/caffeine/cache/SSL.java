package gg.essential.lib.caffeine.cache;

class SSL<K, V> extends SS<K, V>
{
    final RemovalListener<K, V> removalListener;
    
    SSL(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, cacheLoader, async);
        this.removalListener = builder.getRemovalListener(async);
    }
    
    @Override
    public final RemovalListener<K, V> removalListener() {
        return this.removalListener;
    }
    
    @Override
    public final boolean hasRemovalListener() {
        return true;
    }
}
