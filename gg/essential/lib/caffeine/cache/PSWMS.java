package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

final class PSWMS<K, V> extends PSW<K, V>
{
    int queueType;
    Node<K, V> previousInAccessOrder;
    Node<K, V> nextInAccessOrder;
    
    PSWMS() {
        super();
    }
    
    PSWMS(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }
    
    PSWMS(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        super(keyReference, value, valueReferenceQueue, weight, now);
    }
    
    @Override
    public int getQueueType() {
        return this.queueType;
    }
    
    @Override
    public void setQueueType(final int queueType) {
        this.queueType = queueType;
    }
    
    @Override
    public Node<K, V> getPreviousInAccessOrder() {
        return this.previousInAccessOrder;
    }
    
    @Override
    public void setPreviousInAccessOrder(final Node<K, V> previousInAccessOrder) {
        this.previousInAccessOrder = previousInAccessOrder;
    }
    
    @Override
    public Node<K, V> getNextInAccessOrder() {
        return this.nextInAccessOrder;
    }
    
    @Override
    public void setNextInAccessOrder(final Node<K, V> nextInAccessOrder) {
        this.nextInAccessOrder = nextInAccessOrder;
    }
    
    @Override
    public Node<K, V> newNode(final K key, final ReferenceQueue<K> keyReferenceQueue, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSWMS(key, (ReferenceQueue<Object>)keyReferenceQueue, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
    }
    
    @Override
    public Node<K, V> newNode(final Object keyReference, final V value, final ReferenceQueue<V> valueReferenceQueue, final int weight, final long now) {
        return new PSWMS(keyReference, value, (ReferenceQueue<Object>)valueReferenceQueue, weight, now);
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
}
