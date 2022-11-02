package gg.essential.lib.caffeine.cache;

interface WriteOrder<T extends WriteOrder<T>>
{
    T getPreviousInWriteOrder();
    
    void setPreviousInWriteOrder(final T p0);
    
    T getNextInWriteOrder();
    
    void setNextInWriteOrder(final T p0);
}
