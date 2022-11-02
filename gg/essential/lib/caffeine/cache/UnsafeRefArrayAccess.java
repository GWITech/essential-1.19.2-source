package gg.essential.lib.caffeine.cache;

final class UnsafeRefArrayAccess
{
    public static final long REF_ARRAY_BASE;
    public static final int REF_ELEMENT_SHIFT;
    
    private UnsafeRefArrayAccess() {
        super();
    }
    
    public static <E> void spElement(final E[] buffer, final long offset, final E e) {
        UnsafeAccess.UNSAFE.putObject(buffer, offset, e);
    }
    
    public static <E> void soElement(final E[] buffer, final long offset, final E e) {
        UnsafeAccess.UNSAFE.putOrderedObject(buffer, offset, e);
    }
    
    public static <E> E lpElement(final E[] buffer, final long offset) {
        return (E)UnsafeAccess.UNSAFE.getObject(buffer, offset);
    }
    
    public static <E> E lvElement(final E[] buffer, final long offset) {
        return (E)UnsafeAccess.UNSAFE.getObjectVolatile(buffer, offset);
    }
    
    public static long calcElementOffset(final long index) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + (index << UnsafeRefArrayAccess.REF_ELEMENT_SHIFT);
    }
    
    static {
        final int scale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
        if (4 == scale) {
            REF_ELEMENT_SHIFT = 2;
        }
        else {
            if (8 != scale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = UnsafeAccess.UNSAFE.arrayBaseOffset(Object[].class);
    }
}
