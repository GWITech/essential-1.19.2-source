package gg.essential.lib.caffeine.cache;

import java.lang.reflect.*;

final class LocalCacheFactory
{
    public static final String MAXIMUM = "maximum";
    public static final String WINDOW_MAXIMUM = "windowMaximum";
    public static final String MAIN_PROTECTED_MAXIMUM = "mainProtectedMaximum";
    public static final String WEIGHTED_SIZE = "weightedSize";
    public static final String WINDOW_WEIGHTED_SIZE = "windowWeightedSize";
    public static final String MAIN_PROTECTED_WEIGHTED_SIZE = "mainProtectedWeightedSize";
    public static final String KEY = "key";
    public static final String VALUE = "value";
    public static final String ACCESS_TIME = "accessTime";
    public static final String WRITE_TIME = "writeTime";
    
    private LocalCacheFactory() {
        super();
    }
    
    static <K, V> BoundedLocalCache<K, V> newBoundedLocalCache(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        final StringBuilder sb = new StringBuilder("gg.essential.lib.caffeine.cache.");
        if (builder.isStrongKeys()) {
            sb.append('S');
        }
        else {
            sb.append('W');
        }
        if (builder.isStrongValues()) {
            sb.append('S');
        }
        else {
            sb.append('I');
        }
        if (builder.removalListener != null) {
            sb.append('L');
        }
        if (builder.isRecordingStats()) {
            sb.append('S');
        }
        if (builder.evicts()) {
            sb.append('M');
            if (builder.isWeighted()) {
                sb.append('W');
            }
            else {
                sb.append('S');
            }
        }
        if (builder.expiresAfterAccess() || builder.expiresVariable()) {
            sb.append('A');
        }
        if (builder.expiresAfterWrite()) {
            sb.append('W');
        }
        if (builder.refreshAfterWrite()) {
            sb.append('R');
        }
        try {
            final Class<?> clazz = Class.forName(sb.toString());
            final Constructor<?> ctor = clazz.getDeclaredConstructor(Caffeine.class, CacheLoader.class, Boolean.TYPE);
            final BoundedLocalCache<K, V> factory = (BoundedLocalCache<K, V>)ctor.newInstance(builder, cacheLoader, async);
            return factory;
        }
        catch (final ReflectiveOperationException e) {
            throw new IllegalStateException(sb.toString(), e);
        }
    }
}
