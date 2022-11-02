package gg.essential.lib.caffeine.cache;

abstract static class DrainStatusRef<K, V> extends BLCHeader.PadDrainStatus<K, V>
{
    static final long DRAIN_STATUS_OFFSET;
    static final int IDLE = 0;
    static final int REQUIRED = 1;
    static final int PROCESSING_TO_IDLE = 2;
    static final int PROCESSING_TO_REQUIRED = 3;
    volatile int drainStatus;
    
    DrainStatusRef() {
        super();
        this.drainStatus = 0;
    }
    
    boolean shouldDrainBuffers(final boolean delayable) {
        switch (this.drainStatus()) {
            case 0: {
                return !delayable;
            }
            case 1: {
                return true;
            }
            case 2:
            case 3: {
                return false;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
    
    int drainStatus() {
        return UnsafeAccess.UNSAFE.getInt(this, BLCHeader.DrainStatusRef.DRAIN_STATUS_OFFSET);
    }
    
    void lazySetDrainStatus(final int drainStatus) {
        UnsafeAccess.UNSAFE.putOrderedInt(this, BLCHeader.DrainStatusRef.DRAIN_STATUS_OFFSET, drainStatus);
    }
    
    boolean casDrainStatus(final int expect, final int update) {
        return UnsafeAccess.UNSAFE.compareAndSwapInt(this, BLCHeader.DrainStatusRef.DRAIN_STATUS_OFFSET, expect, update);
    }
    
    static {
        BLCHeader.DrainStatusRef.DRAIN_STATUS_OFFSET = UnsafeAccess.objectFieldOffset(BLCHeader.DrainStatusRef.class, "drainStatus");
    }
}
