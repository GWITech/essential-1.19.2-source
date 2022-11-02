package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

class PSW<K, V> extends PS<K, V>
{
    protected static final long WRITE_TIME_OFFSET;
    volatile long writeTime;
    Node<K, V> previousInWriteOrder;
    Node<K, V> nextInWriteOrder;
    
    PSW() {
        super();
    }
    
    PSW(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
        UnsafeAccess.UNSAFE.putLong(this, PSW.WRITE_TIME_OFFSET, now);
    }
    
    PSW(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(keyReference, value, valueReferenceQueue, weight, now);
        UnsafeAccess.UNSAFE.putLong(this, PSW.WRITE_TIME_OFFSET, now);
    }
    
    @Override
    public Node<K, V> getPreviousInVariableOrder() {
        return this.previousInWriteOrder;
    }
    
    @Override
    public void setPreviousInVariableOrder(final Node<K, V> previousInWriteOrder) {
        this.previousInWriteOrder = previousInWriteOrder;
    }
    
    @Override
    public Node<K, V> getNextInVariableOrder() {
        return this.nextInWriteOrder;
    }
    
    @Override
    public void setNextInVariableOrder(final Node<K, V> nextInWriteOrder) {
        this.nextInWriteOrder = nextInWriteOrder;
    }
    
    @Override
    public long getVariableTime() {
        return UnsafeAccess.UNSAFE.getLong(this, PSW.WRITE_TIME_OFFSET);
    }
    
    @Override
    public void setVariableTime(final long writeTime) {
        UnsafeAccess.UNSAFE.putLong(this, PSW.WRITE_TIME_OFFSET, writeTime);
    }
    
    @Override
    public boolean casVariableTime(final long expect, final long update) {
        return this.writeTime == expect && UnsafeAccess.UNSAFE.compareAndSwapLong(this, PSW.WRITE_TIME_OFFSET, expect, update);
    }
    
    @Override
    public final long getWriteTime() {
        return UnsafeAccess.UNSAFE.getLong(this, PSW.WRITE_TIME_OFFSET);
    }
    
    @Override
    public final void setWriteTime(final long writeTime) {
        UnsafeAccess.UNSAFE.putLong(this, PSW.WRITE_TIME_OFFSET, writeTime);
    }
    
    @Override
    public final Node<K, V> getPreviousInWriteOrder() {
        return this.previousInWriteOrder;
    }
    
    @Override
    public final void setPreviousInWriteOrder(final Node<K, V> previousInWriteOrder) {
        this.previousInWriteOrder = previousInWriteOrder;
    }
    
    @Override
    public final Node<K, V> getNextInWriteOrder() {
        return this.nextInWriteOrder;
    }
    
    @Override
    public final void setNextInWriteOrder(final Node<K, V> nextInWriteOrder) {
        this.nextInWriteOrder = nextInWriteOrder;
    }
    
    @Override
    public Node<K, V> newNode(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSW(key, (ReferenceQueue<Object>)keyReferenceQueue, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public Node<K, V> newNode(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSW(keyReference, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public /* bridge */ void setNextInWriteOrder(final WriteOrderDeque.WriteOrder writeOrder) {
        this.setNextInWriteOrder((Node<K, V>)writeOrder);
    }
    
    @Override
    public /* bridge */ WriteOrderDeque.WriteOrder getNextInWriteOrder() {
        return this.getNextInWriteOrder();
    }
    
    @Override
    public /* bridge */ void setPreviousInWriteOrder(final WriteOrderDeque.WriteOrder writeOrder) {
        this.setPreviousInWriteOrder((Node<K, V>)writeOrder);
    }
    
    @Override
    public /* bridge */ WriteOrderDeque.WriteOrder getPreviousInWriteOrder() {
        return this.getPreviousInWriteOrder();
    }
    
    static {
        WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(PSW.class, "writeTime");
    }
}
