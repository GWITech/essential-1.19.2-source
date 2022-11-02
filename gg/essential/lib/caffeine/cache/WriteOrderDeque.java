package gg.essential.lib.caffeine.cache;

final class WriteOrderDeque<E extends WriteOrder<E>> extends AbstractLinkedDeque<E>
{
    WriteOrderDeque() {
        super();
    }
    
    @Override
    public boolean contains(final Object o) {
        return o instanceof WriteOrder && this.contains((WriteOrder<?>)o);
    }
    
    boolean contains(final WriteOrder<?> e) {
        return e.getPreviousInWriteOrder() != null || e.getNextInWriteOrder() != null || e == this.first;
    }
    
    @Override
    public boolean remove(final Object o) {
        return o instanceof WriteOrder && this.remove((E)o);
    }
    
    public boolean remove(final E e) {
        if (this.contains(e)) {
            this.unlink(e);
            return true;
        }
        return false;
    }
    
    @Override
    public E getPrevious(final E e) {
        return e.getPreviousInWriteOrder();
    }
    
    @Override
    public void setPrevious(final E e, final E prev) {
        e.setPreviousInWriteOrder(prev);
    }
    
    @Override
    public E getNext(final E e) {
        return e.getNextInWriteOrder();
    }
    
    @Override
    public void setNext(final E e, final E next) {
        e.setNextInWriteOrder(next);
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
    
    interface WriteOrder<T extends WriteOrder<T>>
    {
        T getPreviousInWriteOrder();
        
        void setPreviousInWriteOrder(final T p0);
        
        T getNextInWriteOrder();
        
        void setNextInWriteOrder(final T p0);
    }
}
