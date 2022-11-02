package gg.essential.lib.caffeine.cache;

@Deprecated
public interface CacheWriter<K, V>
{
    void write(final K p0, final V p1);
    
    void delete(final K p0, final V p1, final RemovalCause p2);
    
    default <K, V> CacheWriter<K, V> disabledWriter() {
        final CacheWriter<K, V> writer = (CacheWriter<K, V>)DisabledWriter.INSTANCE;
        return writer;
    }
}
