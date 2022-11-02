package gg.essential.lib.caffeine.cache;

import java.util.*;

interface LinkedDeque<E> extends Deque<E>
{
    boolean isFirst(final E p0);
    
    boolean isLast(final E p0);
    
    void moveToFront(final E p0);
    
    void moveToBack(final E p0);
    
    E getPrevious(final E p0);
    
    void setPrevious(final E p0, final E p1);
    
    E getNext(final E p0);
    
    void setNext(final E p0, final E p1);
    
    PeekingIterator<E> iterator();
    
    PeekingIterator<E> descendingIterator();
    
    default /* bridge */ Iterator descendingIterator() {
        return this.descendingIterator();
    }
    
    default /* bridge */ Iterator iterator() {
        return this.iterator();
    }
    
    public interface PeekingIterator<E> extends Iterator<E>
    {
        E peek();
        
        default <E> PeekingIterator<E> concat(final PeekingIterator<E> first, final PeekingIterator<E> second) {
            return (PeekingIterator<E>)new PeekingIterator.LinkedDeque$PeekingIterator$1((PeekingIterator)first, (PeekingIterator)second);
        }
        
        default <E> PeekingIterator<E> comparing(final PeekingIterator<E> first, final PeekingIterator<E> second, final Comparator<E> comparator) {
            return (PeekingIterator<E>)new PeekingIterator.LinkedDeque$PeekingIterator$2((PeekingIterator)first, (PeekingIterator)second, (Comparator)comparator);
        }
    }
}
