package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;
import java.util.*;

class PS<K, V> extends Node<K, V> implements NodeFactory<K, V>
{
    protected static final long KEY_OFFSET;
    protected static final long VALUE_OFFSET;
    volatile K key;
    volatile V value;
    
    PS() {
        super();
    }
    
    PS(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        this(key, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    PS(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super();
        UnsafeAccess.UNSAFE.putObject(this, PS.KEY_OFFSET, keyReference);
        UnsafeAccess.UNSAFE.putObject(this, PS.VALUE_OFFSET, value);
    }
    
    @Override
    public final K getKey() {
        return (K)UnsafeAccess.UNSAFE.getObject(this, PS.KEY_OFFSET);
    }
    
    @Override
    public final Object getKeyReference() {
        return UnsafeAccess.UNSAFE.getObject(this, PS.KEY_OFFSET);
    }
    
    @Override
    public final V getValue() {
        return (V)UnsafeAccess.UNSAFE.getObject(this, PS.VALUE_OFFSET);
    }
    
    @Override
    public final Object getValueReference() {
        return UnsafeAccess.UNSAFE.getObject(this, PS.VALUE_OFFSET);
    }
    
    @Override
    public final void setValue(final V value, final ReferenceQueue<V> referenceQueue) {
        UnsafeAccess.UNSAFE.putObject(this, PS.VALUE_OFFSET, value);
    }
    
    @Override
    public final boolean containsValue(final Object value) {
        return Objects.equals(value, this.getValue());
    }
    
    @Override
    public Node<K, V> newNode(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PS(key, (ReferenceQueue<Object>)keyReferenceQueue, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public Node<K, V> newNode(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PS(keyReference, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public final boolean isAlive() {
        final Object key = this.getKeyReference();
        return key != PS.RETIRED_STRONG_KEY && key != PS.DEAD_STRONG_KEY;
    }
    
    @Override
    public final boolean isRetired() {
        return this.getKeyReference() == PS.RETIRED_STRONG_KEY;
    }
    
    @Override
    public final void retire() {
        UnsafeAccess.UNSAFE.putObject(this, PS.KEY_OFFSET, PS.RETIRED_STRONG_KEY);
    }
    
    @Override
    public final boolean isDead() {
        return this.getKeyReference() == PS.DEAD_STRONG_KEY;
    }
    
    @Override
    public final void die() {
        UnsafeAccess.UNSAFE.putObject(this, PS.VALUE_OFFSET, null);
        UnsafeAccess.UNSAFE.putObject(this, PS.KEY_OFFSET, PS.DEAD_STRONG_KEY);
    }
    
    static {
        KEY_OFFSET = UnsafeAccess.objectFieldOffset(PS.class, "key");
        VALUE_OFFSET = UnsafeAccess.objectFieldOffset(PS.class, "value");
    }
}
