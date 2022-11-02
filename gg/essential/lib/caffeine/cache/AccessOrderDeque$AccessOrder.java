package gg.essential.lib.caffeine.cache;

interface AccessOrder<T extends AccessOrder<T>>
{
    T getPreviousInAccessOrder();
    
    void setPreviousInAccessOrder(final T p0);
    
    T getNextInAccessOrder();
    
    void setNextInAccessOrder(final T p0);
}
