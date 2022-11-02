package gg.essential.lib.caffeine.cache;

import java.util.*;

abstract class AbstractLinkedDeque<E> extends AbstractCollection<E> implements LinkedDeque<E>
{
    E first;
    E last;
    
    AbstractLinkedDeque() {
        super();
    }
    
    void linkFirst(final E e) {
        final E f = this.first;
        this.first = e;
        if (f == null) {
            this.last = e;
        }
        else {
            this.setPrevious(f, e);
            this.setNext(e, f);
        }
    }
    
    void linkLast(final E e) {
        final E l = this.last;
        this.last = e;
        if (l == null) {
            this.first = e;
        }
        else {
            this.setNext(l, e);
            this.setPrevious(e, l);
        }
    }
    
    E unlinkFirst() {
        final E f = this.first;
        final E next = this.getNext(f);
        this.setNext(f, null);
        this.first = next;
        if (next == null) {
            this.last = null;
        }
        else {
            this.setPrevious(next, null);
        }
        return f;
    }
    
    E unlinkLast() {
        final E l = this.last;
        final E prev = this.getPrevious(l);
        this.setPrevious(l, null);
        this.last = prev;
        if (prev == null) {
            this.first = null;
        }
        else {
            this.setNext(prev, null);
        }
        return l;
    }
    
    void unlink(final E e) {
        final E prev = this.getPrevious(e);
        final E next = this.getNext(e);
        if (prev == null) {
            this.first = next;
        }
        else {
            this.setNext(prev, next);
            this.setPrevious(e, null);
        }
        if (next == null) {
            this.last = prev;
        }
        else {
            this.setPrevious(next, prev);
            this.setNext(e, null);
        }
    }
    
    @Override
    public boolean isEmpty() {
        return this.first == null;
    }
    
    void checkNotEmpty() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
    }
    
    @Override
    public int size() {
        int size = 0;
        for (E e = this.first; e != null; e = this.getNext(e)) {
            ++size;
        }
        return size;
    }
    
    @Override
    public void clear() {
        E next;
        for (E e = this.first; e != null; e = next) {
            next = this.getNext(e);
            this.setPrevious(e, null);
            this.setNext(e, null);
        }
        final E e2 = null;
        this.last = e2;
        this.first = e2;
    }
    
    @Override
    public abstract boolean contains(final Object p0);
    
    @Override
    public boolean isFirst(final E e) {
        return e != null && e == this.first;
    }
    
    @Override
    public boolean isLast(final E e) {
        return e != null && e == this.last;
    }
    
    @Override
    public void moveToFront(final E e) {
        if (e != this.first) {
            this.unlink(e);
            this.linkFirst(e);
        }
    }
    
    @Override
    public void moveToBack(final E e) {
        if (e != this.last) {
            this.unlink(e);
            this.linkLast(e);
        }
    }
    
    @Override
    public E peek() {
        return this.peekFirst();
    }
    
    @Override
    public E peekFirst() {
        return this.first;
    }
    
    @Override
    public E peekLast() {
        return this.last;
    }
    
    @Override
    public E getFirst() {
        this.checkNotEmpty();
        return this.peekFirst();
    }
    
    @Override
    public E getLast() {
        this.checkNotEmpty();
        return this.peekLast();
    }
    
    @Override
    public E element() {
        return this.getFirst();
    }
    
    @Override
    public boolean offer(final E e) {
        return this.offerLast(e);
    }
    
    @Override
    public boolean offerFirst(final E e) {
        if (this.contains(e)) {
            return false;
        }
        this.linkFirst(e);
        return true;
    }
    
    @Override
    public boolean offerLast(final E e) {
        if (this.contains(e)) {
            return false;
        }
        this.linkLast(e);
        return true;
    }
    
    @Override
    public boolean add(final E e) {
        return this.offerLast(e);
    }
    
    @Override
    public void addFirst(final E e) {
        if (!this.offerFirst(e)) {
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public void addLast(final E e) {
        if (!this.offerLast(e)) {
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public E poll() {
        return this.pollFirst();
    }
    
    @Override
    public E pollFirst() {
        return this.isEmpty() ? null : this.unlinkFirst();
    }
    
    @Override
    public E pollLast() {
        return this.isEmpty() ? null : this.unlinkLast();
    }
    
    @Override
    public E remove() {
        return this.removeFirst();
    }
    
    @Override
    public E removeFirst() {
        this.checkNotEmpty();
        return this.pollFirst();
    }
    
    @Override
    public boolean removeFirstOccurrence(final Object o) {
        return this.remove(o);
    }
    
    @Override
    public E removeLast() {
        this.checkNotEmpty();
        return this.pollLast();
    }
    
    @Override
    public boolean removeLastOccurrence(final Object o) {
        return this.remove(o);
    }
    
    @Override
    public boolean removeAll(final Collection<?> c) {
        boolean modified = false;
        for (final Object o : c) {
            modified |= this.remove(o);
        }
        return modified;
    }
    
    @Override
    public void push(final E e) {
        this.addFirst(e);
    }
    
    @Override
    public E pop() {
        return this.removeFirst();
    }
    
    @Override
    public PeekingIterator<E> iterator() {
        return (PeekingIterator<E>)new AbstractLinkedDeque.AbstractLinkedDeque$1(this, (Object)this.first);
    }
    
    @Override
    public PeekingIterator<E> descendingIterator() {
        return (PeekingIterator<E>)new AbstractLinkedDeque.AbstractLinkedDeque$2(this, (Object)this.last);
    }
    
    @Override
    public /* bridge */ Iterator iterator() {
        return this.iterator();
    }
    
    @Override
    public /* bridge */ Iterator descendingIterator() {
        return this.descendingIterator();
    }
}
