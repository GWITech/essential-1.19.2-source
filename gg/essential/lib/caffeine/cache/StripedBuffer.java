package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.util.concurrent.*;
import java.util.*;

abstract class StripedBuffer<E> implements Buffer<E>
{
    static final long TABLE_BUSY;
    static final long PROBE;
    static final int NCPU;
    static final int MAXIMUM_TABLE_SIZE;
    static final int ATTEMPTS = 3;
    transient volatile Buffer<E>[] table;
    transient volatile int tableBusy;
    
    StripedBuffer() {
        super();
    }
    
    final boolean casTableBusy() {
        return UnsafeAccess.UNSAFE.compareAndSwapInt(this, StripedBuffer.TABLE_BUSY, 0, 1);
    }
    
    static final int getProbe() {
        return UnsafeAccess.UNSAFE.getInt(Thread.currentThread(), StripedBuffer.PROBE);
    }
    
    static final int advanceProbe(int probe) {
        probe ^= probe << 13;
        probe ^= probe >>> 17;
        probe ^= probe << 5;
        UnsafeAccess.UNSAFE.putInt(Thread.currentThread(), StripedBuffer.PROBE, probe);
        return probe;
    }
    
    protected abstract Buffer<E> create(final E p0);
    
    @Override
    public int offer(final E e) {
        int result = 0;
        boolean uncontended = true;
        final Buffer<E>[] buffers = this.table;
        final int mask;
        final Buffer<E> buffer;
        if (buffers == null || (mask = buffers.length - 1) < 0 || (buffer = buffers[getProbe() & mask]) == null || !(uncontended = ((result = buffer.offer(e)) != -1))) {
            this.expandOrRetry(e, uncontended);
        }
        return result;
    }
    
    @Override
    public void drainTo(final Consumer<E> consumer) {
        final Buffer<E>[] buffers = this.table;
        if (buffers == null) {
            return;
        }
        for (final Buffer<E> buffer : buffers) {
            if (buffer != null) {
                buffer.drainTo(consumer);
            }
        }
    }
    
    @Override
    public int reads() {
        final Buffer<E>[] buffers = this.table;
        if (buffers == null) {
            return 0;
        }
        int reads = 0;
        for (final Buffer<E> buffer : buffers) {
            if (buffer != null) {
                reads += buffer.reads();
            }
        }
        return reads;
    }
    
    @Override
    public int writes() {
        final Buffer<E>[] buffers = this.table;
        if (buffers == null) {
            return 0;
        }
        int writes = 0;
        for (final Buffer<E> buffer : buffers) {
            if (buffer != null) {
                writes += buffer.writes();
            }
        }
        return writes;
    }
    
    final void expandOrRetry(final E e, boolean wasUncontended) {
        int h;
        if ((h = getProbe()) == 0) {
            ThreadLocalRandom.current();
            h = getProbe();
            wasUncontended = true;
        }
        boolean collide = false;
        for (int attempt = 0; attempt < 3; ++attempt) {
            final Buffer<E>[] buffers;
            final int n;
            if ((buffers = this.table) != null && (n = buffers.length) > 0) {
                final Buffer<E> buffer;
                if ((buffer = buffers[n - 1 & h]) == null) {
                    if (this.tableBusy == 0 && this.casTableBusy()) {
                        boolean created = false;
                        try {
                            final Buffer<E>[] rs;
                            final int mask;
                            final int j;
                            if ((rs = this.table) != null && (mask = rs.length) > 0 && rs[j = (mask - 1 & h)] == null) {
                                rs[j] = this.create(e);
                                created = true;
                            }
                        }
                        finally {
                            this.tableBusy = 0;
                        }
                        if (created) {
                            break;
                        }
                        continue;
                    }
                    else {
                        collide = false;
                    }
                }
                else if (!wasUncontended) {
                    wasUncontended = true;
                }
                else {
                    if (buffer.offer(e) != -1) {
                        break;
                    }
                    if (n >= StripedBuffer.MAXIMUM_TABLE_SIZE || this.table != buffers) {
                        collide = false;
                    }
                    else if (!collide) {
                        collide = true;
                    }
                    else if (this.tableBusy == 0 && this.casTableBusy()) {
                        try {
                            if (this.table == buffers) {
                                this.table = Arrays.copyOf(buffers, n << 1);
                            }
                        }
                        finally {
                            this.tableBusy = 0;
                        }
                        collide = false;
                        continue;
                    }
                }
                h = advanceProbe(h);
            }
            else if (this.tableBusy == 0 && this.table == buffers && this.casTableBusy()) {
                boolean init = false;
                try {
                    if (this.table == buffers) {
                        final Buffer<E>[] rs = { this.create(e) };
                        this.table = rs;
                        init = true;
                    }
                }
                finally {
                    this.tableBusy = 0;
                }
                if (init) {
                    break;
                }
            }
        }
    }
    
    static {
        TABLE_BUSY = UnsafeAccess.objectFieldOffset(StripedBuffer.class, "tableBusy");
        PROBE = UnsafeAccess.objectFieldOffset(Thread.class, "threadLocalRandomProbe");
        NCPU = Runtime.getRuntime().availableProcessors();
        MAXIMUM_TABLE_SIZE = 4 * Caffeine.ceilingPowerOfTwo(StripedBuffer.NCPU);
    }
}
