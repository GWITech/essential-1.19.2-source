package gg.essential.lib.caffeine.cache;

abstract static class ReadCounterRef extends BBHeader.PadReadCounter
{
    static final long READ_OFFSET;
    volatile long readCounter;
    
    ReadCounterRef() {
        super();
    }
    
    void lazySetReadCounter(final long count) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, ReadCounterRef.READ_OFFSET, count);
    }
    
    static {
        ReadCounterRef.READ_OFFSET = UnsafeAccess.objectFieldOffset(ReadCounterRef.class, "readCounter");
    }
}
