package gg.essential.lib.caffeine.cache;

final class AccessOrderDeque<E extends AccessOrder<E>> extends AbstractLinkedDeque<E>
{
    AccessOrderDeque() {
        super();
    }
    
    @Override
    public boolean contains(final Object o) {
        return o instanceof AccessOrder && this.contains((AccessOrder<?>)o);
    }
    
    boolean contains(final AccessOrder<?> e) {
        return e.getPreviousInAccessOrder() != null || e.getNextInAccessOrder() != null || e == this.first;
    }
    
    @Override
    public boolean remove(final Object o) {
        return o instanceof AccessOrder && this.remove((E)o);
    }
    
    boolean remove(final E e) {
        if (this.contains(e)) {
            this.unlink(e);
            return true;
        }
        return false;
    }
    
    @Override
    public E getPrevious(final E e) {
        return e.getPreviousInAccessOrder();
    }
    
    @Override
    public void setPrevious(final E e, final E prev) {
        e.setPreviousInAccessOrder(prev);
    }
    
    @Override
    public E getNext(final E e) {
        return e.getNextInAccessOrder();
    }
    
    @Override
    public void setNext(final E e, final E next) {
        e.setNextInAccessOrder(next);
    }
    
    @Override
    public /* bridge */ void setNext(final Object o, final Object o2) {
        this.setNext((E)o, (E)o2);
    }
    
    @Override
    public /* bridge */ Object getNext(final Object o) {
        return this.getNext(o);
    }
    
    @Override
    public /* bridge */ void setPrevious(final Object o, final Object o2) {
        this.setPrevious((E)o, (E)o2);
    }
    
    @Override
    public /* bridge */ Object getPrevious(final Object o) {
        return this.getPrevious(o);
    }
    
    interface AccessOrder<T extends AccessOrder<T>>
    {
        T getPreviousInAccessOrder();
        
        void setPreviousInAccessOrder(final T p0);
        
        T getNextInAccessOrder();
        
        void setNextInAccessOrder(final T p0);
    }
}
