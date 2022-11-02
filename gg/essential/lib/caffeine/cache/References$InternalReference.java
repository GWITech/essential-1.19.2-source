package gg.essential.lib.caffeine.cache;

interface InternalReference<E>
{
    E get();
    
    Object getKeyReference();
    
    default boolean referenceEquals(final Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof References.InternalReference) {
            final References.InternalReference<?> referent = (References.InternalReference<?>)object;
            return this.get() == referent.get();
        }
        return false;
    }
}
