package gg.essential.lib.gson.internal;

import java.util.*;

static final class Node<K, V> implements Map.Entry<K, V>
{
    Node<K, V> parent;
    Node<K, V> left;
    Node<K, V> right;
    Node<K, V> next;
    Node<K, V> prev;
    final K key;
    V value;
    int height;
    
    Node() {
        super();
        this.key = null;
        this.prev = this;
        this.next = this;
    }
    
    Node(final Node<K, V> parent, final K key, final Node<K, V> next, final Node<K, V> prev) {
        super();
        this.parent = parent;
        this.key = key;
        this.height = 1;
        this.next = next;
        this.prev = prev;
        prev.next = this;
        next.prev = this;
    }
    
    @Override
    public K getKey() {
        return this.key;
    }
    
    @Override
    public V getValue() {
        return this.value;
    }
    
    @Override
    public V setValue(final V value) {
        final V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Map.Entry) {
            final Map.Entry other = (Map.Entry)o;
            if (this.key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            }
            else if (!this.key.equals(other.getKey())) {
                return false;
            }
            if ((this.value != null) ? this.value.equals(other.getValue()) : (other.getValue() == null)) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.key == null) ? 0 : this.key.hashCode()) ^ ((this.value == null) ? 0 : this.value.hashCode());
    }
    
    @Override
    public String toString() {
        return this.key + "=" + this.value;
    }
    
    public Node<K, V> first() {
        Node<K, V> node = this;
        for (Node<K, V> child = node.left; child != null; child = node.left) {
            node = child;
        }
        return node;
    }
    
    public Node<K, V> last() {
        Node<K, V> node = this;
        for (Node<K, V> child = node.right; child != null; child = node.right) {
            node = child;
        }
        return node;
    }
}
