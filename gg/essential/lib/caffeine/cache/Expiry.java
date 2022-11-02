package gg.essential.lib.caffeine.cache;

public interface Expiry<K, V>
{
    long expireAfterCreate(final K p0, final V p1, final long p2);
    
    long expireAfterUpdate(final K p0, final V p1, final long p2, final long p3);
    
    long expireAfterRead(final K p0, final V p1, final long p2, final long p3);
}
