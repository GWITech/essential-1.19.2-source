package gg.essential.lib.caffeine.cache;

final class MpscGrowableArrayQueue<E> extends MpscChunkedArrayQueue<E>
{
    MpscGrowableArrayQueue(final int initialCapacity, final int maxCapacity) {
        super(initialCapacity, maxCapacity);
    }
    
    @Override
    protected int getNextBufferSize(final E[] buffer) {
        final long maxSize = this.maxQueueCapacity / 2L;
        if (buffer.length > maxSize) {
            throw new IllegalStateException();
        }
        final int newSize = 2 * (buffer.length - 1);
        return newSize + 1;
    }
    
    @Override
    protected long getCurrentBufferCapacity(final long mask) {
        return (mask + 2L == this.maxQueueCapacity) ? this.maxQueueCapacity : mask;
    }
}
