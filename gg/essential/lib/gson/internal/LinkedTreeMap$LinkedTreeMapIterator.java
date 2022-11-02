package gg.essential.lib.gson.internal;

import java.util.*;

private abstract class LinkedTreeMapIterator<T> implements Iterator<T>
{
    Node<K, V> next;
    Node<K, V> lastReturned;
    int expectedModCount;
    final /* synthetic */ LinkedTreeMap this$0;
    
    LinkedTreeMapIterator(final LinkedTreeMap this$0) {
        this.this$0 = this$0;
        super();
        this.next = this.this$0.header.next;
        this.lastReturned = null;
        this.expectedModCount = this.this$0.modCount;
    }
    
    @Override
    public final boolean hasNext() {
        return this.next != this.this$0.header;
    }
    
    final Node<K, V> nextNode() {
        final Node<K, V> e = this.next;
        if (e == this.this$0.header) {
            throw new NoSuchElementException();
        }
        if (this.this$0.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
        this.next = e.next;
        return this.lastReturned = e;
    }
    
    @Override
    public final void remove() {
        if (this.lastReturned == null) {
            throw new IllegalStateException();
        }
        this.this$0.removeInternal(this.lastReturned, true);
        this.lastReturned = null;
        this.expectedModCount = this.this$0.modCount;
    }
}
