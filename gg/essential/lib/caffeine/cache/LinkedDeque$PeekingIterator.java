package gg.essential.lib.caffeine.cache;

import java.util.*;

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
