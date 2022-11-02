package gg.essential.lib.caffeine.cache.stats;

import java.util.concurrent.atomic.*;
import gg.essential.lib.caffeine.cache.*;

public final class ConcurrentStatsCounter implements StatsCounter
{
    private final LongAdder hitCount;
    private final LongAdder missCount;
    private final LongAdder loadSuccessCount;
    private final LongAdder loadFailureCount;
    private final LongAdder totalLoadTime;
    private final LongAdder evictionCount;
    private final LongAdder evictionWeight;
    
    public ConcurrentStatsCounter() {
        super();
        this.hitCount = new LongAdder();
        this.missCount = new LongAdder();
        this.loadSuccessCount = new LongAdder();
        this.loadFailureCount = new LongAdder();
        this.totalLoadTime = new LongAdder();
        this.evictionCount = new LongAdder();
        this.evictionWeight = new LongAdder();
    }
    
    @Override
    public void recordHits(final int count) {
        this.hitCount.add(count);
    }
    
    @Override
    public void recordMisses(final int count) {
        this.missCount.add(count);
    }
    
    @Override
    public void recordLoadSuccess(final long loadTime) {
        this.loadSuccessCount.increment();
        this.totalLoadTime.add(loadTime);
    }
    
    @Override
    public void recordLoadFailure(final long loadTime) {
        this.loadFailureCount.increment();
        this.totalLoadTime.add(loadTime);
    }
    
    @Deprecated
    @Override
    public void recordEviction() {
        this.evictionCount.increment();
    }
    
    @Deprecated
    @Override
    public void recordEviction(final int weight) {
        this.evictionCount.increment();
        this.evictionWeight.add(weight);
    }
    
    @Override
    public void recordEviction(final int weight, final RemovalCause cause) {
        this.evictionCount.increment();
        this.evictionWeight.add(weight);
    }
    
    @Override
    public CacheStats snapshot() {
        return CacheStats.of(negativeToMaxValue(this.hitCount.sum()), negativeToMaxValue(this.missCount.sum()), negativeToMaxValue(this.loadSuccessCount.sum()), negativeToMaxValue(this.loadFailureCount.sum()), negativeToMaxValue(this.totalLoadTime.sum()), negativeToMaxValue(this.evictionCount.sum()), negativeToMaxValue(this.evictionWeight.sum()));
    }
    
    private static long negativeToMaxValue(final long value) {
        return (value >= 0L) ? value : Long.MAX_VALUE;
    }
    
    public void incrementBy(final StatsCounter other) {
        final CacheStats otherStats = other.snapshot();
        this.hitCount.add(otherStats.hitCount());
        this.missCount.add(otherStats.missCount());
        this.loadSuccessCount.add(otherStats.loadSuccessCount());
        this.loadFailureCount.add(otherStats.loadFailureCount());
        this.totalLoadTime.add(otherStats.totalLoadTime());
        this.evictionCount.add(otherStats.evictionCount());
        this.evictionWeight.add(otherStats.evictionWeight());
    }
    
    @Override
    public String toString() {
        return this.snapshot().toString();
    }
}
