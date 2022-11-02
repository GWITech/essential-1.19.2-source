package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;

static final class Sentinel<K, V> extends Node<K, V>
{
    Node<K, V> prev;
    Node<K, V> next;
    
    Sentinel() {
        super();
        this.next = this;
        this.prev = this;
    }
    
    @Override
    public Node<K, V> getPreviousInVariableOrder() {
        return this.prev;
    }
    
    @Override
    public void setPreviousInVariableOrder(final Node<K, V> prev) {
        this.prev = prev;
    }
    
    @Override
    public Node<K, V> getNextInVariableOrder() {
        return this.next;
    }
    
    @Override
    public void setNextInVariableOrder(final Node<K, V> next) {
        this.next = next;
    }
    
    @Override
    public K getKey() {
        return null;
    }
    
    @Override
    public Object getKeyReference() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public V getValue() {
        return null;
    }
    
    @Override
    public Object getValueReference() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void setValue(final V value, final ReferenceQueue<V> referenceQueue) {
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return false;
    }
    
    @Override
    public boolean isAlive() {
        return false;
    }
    
    @Override
    public boolean isRetired() {
        return false;
    }
    
    @Override
    public boolean isDead() {
        return false;
    }
    
    @Override
    public void retire() {
    }
    
    @Override
    public void die() {
    }
}
