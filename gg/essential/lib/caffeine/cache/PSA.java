package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

class PSA<K, V> extends PS<K, V>
{
    protected static final long ACCESS_TIME_OFFSET;
    volatile long accessTime;
    Node<K, V> previousInAccessOrder;
    Node<K, V> nextInAccessOrder;
    
    PSA() {
        super();
    }
    
    PSA(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
        UnsafeAccess.UNSAFE.putLong(this, PSA.ACCESS_TIME_OFFSET, now);
    }
    
    PSA(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(keyReference, value, valueReferenceQueue, weight, now);
        UnsafeAccess.UNSAFE.putLong(this, PSA.ACCESS_TIME_OFFSET, now);
    }
    
    @Override
    public Node<K, V> getPreviousInVariableOrder() {
        return this.previousInAccessOrder;
    }
    
    @Override
    public void setPreviousInVariableOrder(final Node<K, V> previousInAccessOrder) {
        this.previousInAccessOrder = previousInAccessOrder;
    }
    
    @Override
    public Node<K, V> getNextInVariableOrder() {
        return this.nextInAccessOrder;
    }
    
    @Override
    public void setNextInVariableOrder(final Node<K, V> nextInAccessOrder) {
        this.nextInAccessOrder = nextInAccessOrder;
    }
    
    @Override
    public long getVariableTime() {
        return UnsafeAccess.UNSAFE.getLong(this, PSA.ACCESS_TIME_OFFSET);
    }
    
    @Override
    public void setVariableTime(final long accessTime) {
        UnsafeAccess.UNSAFE.putLong(this, PSA.ACCESS_TIME_OFFSET, accessTime);
    }
    
    @Override
    public boolean casVariableTime(final long expect, final long update) {
        return this.accessTime == expect && UnsafeAccess.UNSAFE.compareAndSwapLong(this, PSA.ACCESS_TIME_OFFSET, expect, update);
    }
    
    @Override
    public final long getAccessTime() {
        return UnsafeAccess.UNSAFE.getLong(this, PSA.ACCESS_TIME_OFFSET);
    }
    
    @Override
    public final void setAccessTime(final long accessTime) {
        UnsafeAccess.UNSAFE.putLong(this, PSA.ACCESS_TIME_OFFSET, accessTime);
    }
    
    @Override
    public final Node<K, V> getPreviousInAccessOrder() {
        return this.previousInAccessOrder;
    }
    
    @Override
    public final void setPreviousInAccessOrder(final Node<K, V> previousInAccessOrder) {
        this.previousInAccessOrder = previousInAccessOrder;
    }
    
    @Override
    public final Node<K, V> getNextInAccessOrder() {
        return this.nextInAccessOrder;
    }
    
    @Override
    public final void setNextInAccessOrder(final Node<K, V> nextInAccessOrder) {
        this.nextInAccessOrder = nextInAccessOrder;
    }
    
    @Override
    public Node<K, V> newNode(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSA(key, (ReferenceQueue<Object>)keyReferenceQueue, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public Node<K, V> newNode(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSA(keyReference, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public /* bridge */ void setNextInAccessOrder(final AccessOrderDeque.AccessOrder accessOrder) {
        this.setNextInAccessOrder((Node<K, V>)accessOrder);
    }
    
    @Override
    public /* bridge */ AccessOrderDeque.AccessOrder getNextInAccessOrder() {
        return this.getNextInAccessOrder();
    }
    
    @Override
    public /* bridge */ void setPreviousInAccessOrder(final AccessOrderDeque.AccessOrder accessOrder) {
        this.setPreviousInAccessOrder((Node<K, V>)accessOrder);
    }
    
    @Override
    public /* bridge */ AccessOrderDeque.AccessOrder getPreviousInAccessOrder() {
        return this.getPreviousInAccessOrder();
    }
    
    static {
        ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(PSA.class, "accessTime");
    }
}
