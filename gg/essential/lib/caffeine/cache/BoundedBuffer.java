package gg.essential.lib.caffeine.cache;

import java.util.concurrent.atomic.*;
import java.util.function.*;

final class BoundedBuffer<E> extends StripedBuffer<E>
{
    static final int BUFFER_SIZE = 16;
    static final int MASK = 15;
    
    BoundedBuffer() {
        super();
    }
    
    @Override
    protected Buffer<E> create(final E e) {
        return new RingBuffer<E>(e);
    }
    
    static final class RingBuffer<E> extends BBHeader.ReadAndWriteCounterRef implements Buffer<E>
    {
        final AtomicReferenceArray<E> buffer;
        
        public RingBuffer(final E e) {
            super();
            (this.buffer = new AtomicReferenceArray<E>(16)).lazySet(0, e);
        }
        
        public int offer(final E e) {
            final long head = this.readCounter;
            final long tail = this.relaxedWriteCounter();
            final long size = tail - head;
            if (size >= 16L) {
                return 1;
            }
            if (this.casWriteCounter(tail, tail + 1L)) {
                final int index = (int)(tail & 0xFL);
                this.buffer.lazySet(index, e);
                return 0;
            }
            return -1;
        }
        
        public void drainTo(final Consumer<E> consumer) {
            long head = this.readCounter;
            final long tail = this.relaxedWriteCounter();
            final long size = tail - head;
            if (size == 0L) {
                return;
            }
            do {
                final int index = (int)(head & 0xFL);
                final E e = this.buffer.get(index);
                if (e == null) {
                    break;
                }
                this.buffer.lazySet(index, null);
                consumer.accept(e);
                ++head;
            } while (head != tail);
            this.lazySetReadCounter(head);
        }
        
        public int reads() {
            return (int)this.readCounter;
        }
        
        public int writes() {
            return (int)this.writeCounter;
        }
    }
}
