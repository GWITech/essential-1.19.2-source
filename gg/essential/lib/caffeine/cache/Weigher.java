package gg.essential.lib.caffeine.cache;

@FunctionalInterface
public interface Weigher<K, V>
{
    int weigh(final K p0, final V p1);
    
    default <K, V> Weigher<K, V> singletonWeigher() {
        final Weigher<K, V> self = (Weigher<K, V>)SingletonWeigher.INSTANCE;
        return self;
    }
    
    default <K, V> Weigher<K, V> boundedWeigher(final Weigher<K, V> delegate) {
        return (Weigher<K, V>)new BoundedWeigher((Weigher)delegate);
    }
}
