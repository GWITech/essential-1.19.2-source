package gg.essential.lib.caffeine.cache;

abstract static class ReadAndWriteCounterRef extends BBHeader.PadWriteCounter
{
    static final long WRITE_OFFSET;
    volatile long writeCounter;
    
    ReadAndWriteCounterRef() {
        super();
        UnsafeAccess.UNSAFE.putOrderedLong(this, ReadAndWriteCounterRef.WRITE_OFFSET, 1L);
    }
    
    long relaxedWriteCounter() {
        return UnsafeAccess.UNSAFE.getLong(this, ReadAndWriteCounterRef.WRITE_OFFSET);
    }
    
    boolean casWriteCounter(final long expect, final long update) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, ReadAndWriteCounterRef.WRITE_OFFSET, expect, update);
    }
    
    static {
        ReadAndWriteCounterRef.WRITE_OFFSET = UnsafeAccess.objectFieldOffset(ReadAndWriteCounterRef.class, "writeCounter");
    }
}
