package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

interface NodeFactory<K, V>
{
    public static final Object RETIRED_STRONG_KEY = new Object();
    public static final Object DEAD_STRONG_KEY = new Object();
    public static final References.WeakKeyReference<Object> RETIRED_WEAK_KEY = new References.WeakKeyReference((Object)null, (ReferenceQueue)null);
    public static final References.WeakKeyReference<Object> DEAD_WEAK_KEY = new References.WeakKeyReference((Object)null, (ReferenceQueue)null);
    
    Node<K, V> newNode(final K p0, final ReferenceQueue<K> p1, final V p2, final ReferenceQueue<V> p3, final int p4, final long p5);
    
    Node<K, V> newNode(final Object p0, final V p1, final ReferenceQueue<V> p2, final int p3, final long p4);
    
    default Object newReferenceKey(final K key, final ReferenceQueue<K> referenceQueue) {
        return key;
    }
    
    default Object newLookupKey(final Object key) {
        return key;
    }
    
    default <K, V> NodeFactory<K, V> newFactory(final Caffeine<K, V> builder, final boolean isAsync) {
        final StringBuilder sb = new StringBuilder("gg.essential.lib.caffeine.cache.");
        if (builder.isStrongKeys()) {
            sb.append('P');
        }
        else {
            sb.append('F');
        }
        if (builder.isStrongValues()) {
            sb.append('S');
        }
        else if (builder.isWeakValues()) {
            sb.append('W');
        }
        else {
            sb.append('D');
        }
        if (builder.expiresVariable()) {
            if (builder.refreshAfterWrite()) {
                sb.append('A');
                if (builder.evicts()) {
                    sb.append('W');
                }
            }
            else {
                sb.append('W');
            }
        }
        else {
            if (builder.expiresAfterAccess()) {
                sb.append('A');
            }
            if (builder.expiresAfterWrite()) {
                sb.append('W');
            }
        }
        if (builder.refreshAfterWrite()) {
            sb.append('R');
        }
        if (builder.evicts()) {
            sb.append('M');
            if (isAsync || (builder.isWeighted() && builder.weigher != Weigher.singletonWeigher())) {
                sb.append('W');
            }
            else {
                sb.append('S');
            }
        }
        try {
            final Class<?> clazz = Class.forName(sb.toString());
            final NodeFactory<K, V> factory = (NodeFactory<K, V>)clazz.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return factory;
        }
        catch (final ReflectiveOperationException e) {
            throw new IllegalStateException(sb.toString(), e);
        }
    }
    
    default boolean weakValues() {
        return false;
    }
    
    default boolean softValues() {
        return false;
    }
}
