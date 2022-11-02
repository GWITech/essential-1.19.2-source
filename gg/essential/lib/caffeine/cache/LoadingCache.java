package gg.essential.lib.caffeine.cache;

import java.util.*;

public interface LoadingCache<K, V> extends Cache<K, V>
{
    V get(final K p0);
    
    Map<K, V> getAll(final Iterable<? extends K> p0);
    
    void refresh(final K p0);
}
