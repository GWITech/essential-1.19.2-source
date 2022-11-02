package gg.essential.lib.caffeine.cache.stats;

import gg.essential.lib.caffeine.cache.*;

public interface StatsCounter
{
    void recordHits(final int p0);
    
    void recordMisses(final int p0);
    
    void recordLoadSuccess(final long p0);
    
    void recordLoadFailure(final long p0);
    
    @Deprecated
    void recordEviction();
    
    @Deprecated
    default void recordEviction(final int weight) {
        this.recordEviction();
    }
    
    default void recordEviction(final int weight, final RemovalCause cause) {
        this.recordEviction(weight);
    }
    
    CacheStats snapshot();
    
    default StatsCounter disabledStatsCounter() {
        return DisabledStatsCounter.INSTANCE;
    }
    
    default StatsCounter guardedStatsCounter(final StatsCounter statsCounter) {
        return (StatsCounter)((statsCounter instanceof GuardedStatsCounter) ? statsCounter : new GuardedStatsCounter(statsCounter));
    }
}
