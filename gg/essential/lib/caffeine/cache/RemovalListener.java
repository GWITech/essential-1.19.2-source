package gg.essential.lib.caffeine.cache;

@FunctionalInterface
public interface RemovalListener<K, V>
{
    void onRemoval(final K p0, final V p1, final RemovalCause p2);
}
