package gg.essential.lib.caffeine.cache.stats;

enum DisabledStatsCounter implements StatsCounter
{
    INSTANCE;
    
    private static final /* synthetic */ DisabledStatsCounter[] $VALUES;
    
    public static DisabledStatsCounter[] values() {
        return DisabledStatsCounter.$VALUES.clone();
    }
    
    public static DisabledStatsCounter valueOf(final String name) {
        return Enum.valueOf(DisabledStatsCounter.class, name);
    }
    
    @Override
    public void recordHits(final int count) {
    }
    
    @Override
    public void recordMisses(final int count) {
    }
    
    @Override
    public void recordLoadSuccess(final long loadTime) {
    }
    
    @Override
    public void recordLoadFailure(final long loadTime) {
    }
    
    @Override
    public void recordEviction() {
    }
    
    @Override
    public CacheStats snapshot() {
        return CacheStats.empty();
    }
    
    @Override
    public String toString() {
        return this.snapshot().toString();
    }
    
    static {
        $VALUES = new DisabledStatsCounter[] { DisabledStatsCounter.INSTANCE };
    }
}
