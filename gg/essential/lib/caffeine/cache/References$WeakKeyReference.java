package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

static class WeakKeyReference<K> extends WeakReference<K> implements References.InternalReference<K>
{
    private final int hashCode;
    
    public WeakKeyReference(final K key, final ReferenceQueue<K> queue) {
        super(key, queue);
        this.hashCode = System.identityHashCode(key);
    }
    
    public Object getKeyReference() {
        return this;
    }
    
    public boolean equals(final Object object) {
        return this.referenceEquals(object);
    }
    
    public int hashCode() {
        return this.hashCode;
    }
}
