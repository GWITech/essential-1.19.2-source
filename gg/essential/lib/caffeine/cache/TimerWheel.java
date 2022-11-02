package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import java.util.*;
import java.util.concurrent.*;
import java.lang.ref.*;

final class TimerWheel<K, V>
{
    static final int[] BUCKETS;
    static final long[] SPANS;
    static final long[] SHIFT;
    final BoundedLocalCache<K, V> cache;
    final Node<K, V>[][] wheel;
    long nanos;
    
    TimerWheel(final BoundedLocalCache<K, V> cache) {
        super();
        this.cache = Objects.requireNonNull(cache);
        this.wheel = new Node[TimerWheel.BUCKETS.length][1];
        for (int i = 0; i < this.wheel.length; ++i) {
            this.wheel[i] = new Node[TimerWheel.BUCKETS[i]];
            for (int j = 0; j < this.wheel[i].length; ++j) {
                this.wheel[i][j] = new Sentinel<K, V>();
            }
        }
    }
    
    public void advance(final long currentTimeNanos) {
        final long previousTimeNanos = this.nanos;
        try {
            this.nanos = currentTimeNanos;
            for (int i = 0; i < TimerWheel.SHIFT.length; ++i) {
                final long previousTicks = previousTimeNanos >>> (int)TimerWheel.SHIFT[i];
                final long currentTicks = currentTimeNanos >>> (int)TimerWheel.SHIFT[i];
                if (currentTicks - previousTicks <= 0L) {
                    break;
                }
                this.expire(i, previousTicks, currentTicks);
            }
        }
        catch (final Throwable t) {
            this.nanos = previousTimeNanos;
            throw t;
        }
    }
    
    void expire(final int index, final long previousTicks, final long currentTicks) {
        final Node<K, V>[] timerWheel = this.wheel[index];
        int end;
        int start;
        if (currentTicks - previousTicks >= timerWheel.length) {
            end = timerWheel.length;
            start = 0;
        }
        else {
            final long mask = TimerWheel.SPANS[index] - 1L;
            start = (int)(previousTicks & mask);
            end = 1 + (int)(currentTicks & mask);
        }
        final int mask2 = timerWheel.length - 1;
        for (int i = start; i < end; ++i) {
            final Node<K, V> sentinel = timerWheel[i & mask2];
            final Node<K, V> prev = sentinel.getPreviousInVariableOrder();
            Node<K, V> node = sentinel.getNextInVariableOrder();
            sentinel.setPreviousInVariableOrder(sentinel);
            sentinel.setNextInVariableOrder(sentinel);
            while (node != sentinel) {
                final Node<K, V> next = node.getNextInVariableOrder();
                node.setPreviousInVariableOrder(null);
                node.setNextInVariableOrder(null);
                try {
                    if (node.getVariableTime() - this.nanos > 0L || !this.cache.evictEntry(node, RemovalCause.EXPIRED, this.nanos)) {
                        this.schedule(node);
                    }
                    node = next;
                }
                catch (final Throwable t) {
                    node.setPreviousInVariableOrder(sentinel.getPreviousInVariableOrder());
                    node.setNextInVariableOrder(next);
                    sentinel.getPreviousInVariableOrder().setNextInVariableOrder(node);
                    sentinel.setPreviousInVariableOrder(prev);
                    throw t;
                }
            }
        }
    }
    
    public void schedule(final Node<K, V> node) {
        final Node<K, V> sentinel = this.findBucket(node.getVariableTime());
        this.link(sentinel, node);
    }
    
    public void reschedule(final Node<K, V> node) {
        if (node.getNextInVariableOrder() != null) {
            this.unlink(node);
            this.schedule(node);
        }
    }
    
    public void deschedule(final Node<K, V> node) {
        this.unlink(node);
        node.setNextInVariableOrder(null);
        node.setPreviousInVariableOrder(null);
    }
    
    Node<K, V> findBucket(final long time) {
        final long duration = time - this.nanos;
        final int length = this.wheel.length - 1;
        for (int i = 0; i < length; ++i) {
            if (duration < TimerWheel.SPANS[i + 1]) {
                final long ticks = time >>> (int)TimerWheel.SHIFT[i];
                final int index = (int)(ticks & (long)(this.wheel[i].length - 1));
                return this.wheel[i][index];
            }
        }
        return this.wheel[length][0];
    }
    
    void link(final Node<K, V> sentinel, final Node<K, V> node) {
        node.setPreviousInVariableOrder(sentinel.getPreviousInVariableOrder());
        node.setNextInVariableOrder(sentinel);
        sentinel.getPreviousInVariableOrder().setNextInVariableOrder(node);
        sentinel.setPreviousInVariableOrder(node);
    }
    
    void unlink(final Node<K, V> node) {
        final Node<K, V> next = node.getNextInVariableOrder();
        if (next != null) {
            final Node<K, V> prev = node.getPreviousInVariableOrder();
            next.setPreviousInVariableOrder(prev);
            prev.setNextInVariableOrder(next);
        }
    }
    
    public long getExpirationDelay() {
        for (int i = 0; i < TimerWheel.SHIFT.length; ++i) {
            final Node<K, V>[] timerWheel = this.wheel[i];
            final long ticks = this.nanos >>> (int)TimerWheel.SHIFT[i];
            final long spanMask = TimerWheel.SPANS[i] - 1L;
            final int start = (int)(ticks & spanMask);
            final int end = start + timerWheel.length;
            final int mask = timerWheel.length - 1;
            for (int j = start; j < end; ++j) {
                final Node<K, V> sentinel = timerWheel[j & mask];
                final Node<K, V> next = sentinel.getNextInVariableOrder();
                if (next != sentinel) {
                    final long buckets = j - start;
                    long delay = (buckets << (int)TimerWheel.SHIFT[i]) - (this.nanos & spanMask);
                    delay = ((delay > 0L) ? delay : TimerWheel.SPANS[i]);
                    for (int k = i + 1; k < TimerWheel.SHIFT.length; ++k) {
                        final long nextDelay = this.peekAhead(k);
                        delay = Math.min(delay, nextDelay);
                    }
                    return delay;
                }
            }
        }
        return Long.MAX_VALUE;
    }
    
    long peekAhead(final int i) {
        final long ticks = this.nanos >>> (int)TimerWheel.SHIFT[i];
        final Node<K, V>[] timerWheel = this.wheel[i];
        final long spanMask = TimerWheel.SPANS[i] - 1L;
        final int mask = timerWheel.length - 1;
        final int probe = (int)(ticks + 1L & (long)mask);
        final Node<K, V> sentinel = timerWheel[probe];
        final Node<K, V> next = sentinel.getNextInVariableOrder();
        return (next == sentinel) ? Long.MAX_VALUE : (TimerWheel.SPANS[i] - (this.nanos & spanMask));
    }
    
    public Map<K, V> snapshot(final boolean ascending, final int limit, final Function<V, V> transformer) {
        Caffeine.requireArgument(limit >= 0);
        final Map<K, V> map = new LinkedHashMap<K, V>(Math.min(limit, this.cache.size()));
        final int startLevel = ascending ? 0 : (this.wheel.length - 1);
        for (int i = 0; i < this.wheel.length; ++i) {
            final int indexOffset = ascending ? i : (-i);
            final int index = startLevel + indexOffset;
            final int ticks = (int)(this.nanos >>> (int)TimerWheel.SHIFT[index]);
            final int bucketMask = this.wheel[index].length - 1;
            final int startBucket = (ticks & bucketMask) + (ascending ? 1 : 0);
            for (int j = 0; j < this.wheel[index].length; ++j) {
                final int bucketOffset = ascending ? j : (-j);
                for (Node<K, V> sentinel = this.wheel[index][startBucket + bucketOffset & bucketMask], node = traverse(ascending, sentinel); node != sentinel && map.size() < limit; node = traverse(ascending, node)) {
                    final K key = node.getKey();
                    final V value = transformer.apply(node.getValue());
                    if (key != null && value != null && node.isAlive()) {
                        map.put(key, value);
                    }
                }
            }
        }
        return Collections.unmodifiableMap((Map<? extends K, ? extends V>)map);
    }
    
    static <K, V> Node<K, V> traverse(final boolean ascending, final Node<K, V> node) {
        return ascending ? node.getNextInVariableOrder() : node.getPreviousInVariableOrder();
    }
    
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.wheel.length; ++i) {
            final Map<Integer, List<K>> buckets = new TreeMap<Integer, List<K>>();
            for (int j = 0; j < this.wheel[i].length; ++j) {
                final List<K> events = new ArrayList<K>();
                for (Node<K, V> node = this.wheel[i][j].getNextInVariableOrder(); node != this.wheel[i][j]; node = node.getNextInVariableOrder()) {
                    events.add(node.getKey());
                }
                if (!events.isEmpty()) {
                    buckets.put(j, events);
                }
            }
            builder.append("Wheel #").append(i + 1).append(": ").append(buckets).append('\n');
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }
    
    static {
        BUCKETS = new int[] { 64, 64, 32, 4, 1 };
        SPANS = new long[] { Caffeine.ceilingPowerOfTwo(TimeUnit.SECONDS.toNanos(1L)), Caffeine.ceilingPowerOfTwo(TimeUnit.MINUTES.toNanos(1L)), Caffeine.ceilingPowerOfTwo(TimeUnit.HOURS.toNanos(1L)), Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L)), TimerWheel.BUCKETS[3] * Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L)), TimerWheel.BUCKETS[3] * Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L)) };
        SHIFT = new long[] { Long.numberOfTrailingZeros(TimerWheel.SPANS[0]), Long.numberOfTrailingZeros(TimerWheel.SPANS[1]), Long.numberOfTrailingZeros(TimerWheel.SPANS[2]), Long.numberOfTrailingZeros(TimerWheel.SPANS[3]), Long.numberOfTrailingZeros(TimerWheel.SPANS[4]) };
    }
    
    static final class Sentinel<K, V> extends Node<K, V>
    {
        Node<K, V> prev;
        Node<K, V> next;
        
        Sentinel() {
            super();
            this.next = this;
            this.prev = this;
        }
        
        @Override
        public Node<K, V> getPreviousInVariableOrder() {
            return this.prev;
        }
        
        @Override
        public void setPreviousInVariableOrder(final Node<K, V> prev) {
            this.prev = prev;
        }
        
        @Override
        public Node<K, V> getNextInVariableOrder() {
            return this.next;
        }
        
        @Override
        public void setNextInVariableOrder(final Node<K, V> next) {
            this.next = next;
        }
        
        @Override
        public K getKey() {
            return null;
        }
        
        @Override
        public Object getKeyReference() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public V getValue() {
            return null;
        }
        
        @Override
        public Object getValueReference() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void setValue(final V value, final ReferenceQueue<V> referenceQueue) {
        }
        
        @Override
        public boolean containsValue(final Object value) {
            return false;
        }
        
        @Override
        public boolean isAlive() {
            return false;
        }
        
        @Override
        public boolean isRetired() {
            return false;
        }
        
        @Override
        public boolean isDead() {
            return false;
        }
        
        @Override
        public void retire() {
        }
        
        @Override
        public void die() {
        }
    }
}
