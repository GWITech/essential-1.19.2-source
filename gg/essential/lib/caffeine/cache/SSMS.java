package gg.essential.lib.caffeine.cache;

class SSMS<K, V> extends SS<K, V>
{
    long maximum;
    long weightedSize;
    long windowMaximum;
    long windowWeightedSize;
    long mainProtectedMaximum;
    long mainProtectedWeightedSize;
    double stepSize;
    long adjustment;
    int hitsInSample;
    int missesInSample;
    double previousSampleHitRate;
    final FrequencySketch<K> sketch;
    final AccessOrderDeque<Node<K, V>> accessOrderWindowDeque;
    final AccessOrderDeque<Node<K, V>> accessOrderProbationDeque;
    final AccessOrderDeque<Node<K, V>> accessOrderProtectedDeque;
    final MpscGrowableArrayQueue<Runnable> writeBuffer;
    
    SSMS(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, cacheLoader, async);
        this.sketch = new FrequencySketch<K>();
        if (builder.hasInitialCapacity()) {
            final long capacity = Math.min(builder.getMaximum(), builder.getInitialCapacity());
            this.sketch.ensureCapacity(capacity);
        }
        this.accessOrderWindowDeque = ((builder.evicts() || builder.expiresAfterAccess()) ? new AccessOrderDeque<Node<K, V>>() : null);
        this.accessOrderProbationDeque = new AccessOrderDeque<Node<K, V>>();
        this.accessOrderProtectedDeque = new AccessOrderDeque<Node<K, V>>();
        this.writeBuffer = new MpscGrowableArrayQueue<Runnable>(4, SSMS.WRITE_BUFFER_MAX);
    }
    
    @Override
    protected final boolean evicts() {
        return true;
    }
    
    @Override
    protected final long maximum() {
        return this.maximum;
    }
    
    @Override
    protected final void setMaximum(final long maximum) {
        this.maximum = maximum;
    }
    
    @Override
    protected final long weightedSize() {
        return this.weightedSize;
    }
    
    @Override
    protected final void setWeightedSize(final long weightedSize) {
        this.weightedSize = weightedSize;
    }
    
    @Override
    protected final long windowMaximum() {
        return this.windowMaximum;
    }
    
    @Override
    protected final void setWindowMaximum(final long windowMaximum) {
        this.windowMaximum = windowMaximum;
    }
    
    @Override
    protected final long windowWeightedSize() {
        return this.windowWeightedSize;
    }
    
    @Override
    protected final void setWindowWeightedSize(final long windowWeightedSize) {
        this.windowWeightedSize = windowWeightedSize;
    }
    
    @Override
    protected final long mainProtectedMaximum() {
        return this.mainProtectedMaximum;
    }
    
    @Override
    protected final void setMainProtectedMaximum(final long mainProtectedMaximum) {
        this.mainProtectedMaximum = mainProtectedMaximum;
    }
    
    @Override
    protected final long mainProtectedWeightedSize() {
        return this.mainProtectedWeightedSize;
    }
    
    @Override
    protected final void setMainProtectedWeightedSize(final long mainProtectedWeightedSize) {
        this.mainProtectedWeightedSize = mainProtectedWeightedSize;
    }
    
    @Override
    protected final double stepSize() {
        return this.stepSize;
    }
    
    @Override
    protected final void setStepSize(final double stepSize) {
        this.stepSize = stepSize;
    }
    
    @Override
    protected final long adjustment() {
        return this.adjustment;
    }
    
    @Override
    protected final void setAdjustment(final long adjustment) {
        this.adjustment = adjustment;
    }
    
    @Override
    protected final int hitsInSample() {
        return this.hitsInSample;
    }
    
    @Override
    protected final void setHitsInSample(final int hitsInSample) {
        this.hitsInSample = hitsInSample;
    }
    
    @Override
    protected final int missesInSample() {
        return this.missesInSample;
    }
    
    @Override
    protected final void setMissesInSample(final int missesInSample) {
        this.missesInSample = missesInSample;
    }
    
    @Override
    protected final double previousSampleHitRate() {
        return this.previousSampleHitRate;
    }
    
    @Override
    protected final void setPreviousSampleHitRate(final double previousSampleHitRate) {
        this.previousSampleHitRate = previousSampleHitRate;
    }
    
    @Override
    protected final FrequencySketch<K> frequencySketch() {
        return this.sketch;
    }
    
    @Override
    protected boolean fastpath() {
        return true;
    }
    
    @Override
    protected final AccessOrderDeque<Node<K, V>> accessOrderWindowDeque() {
        return this.accessOrderWindowDeque;
    }
    
    @Override
    protected final AccessOrderDeque<Node<K, V>> accessOrderProbationDeque() {
        return this.accessOrderProbationDeque;
    }
    
    @Override
    protected final AccessOrderDeque<Node<K, V>> accessOrderProtectedDeque() {
        return this.accessOrderProtectedDeque;
    }
    
    @Override
    protected final MpscGrowableArrayQueue<Runnable> writeBuffer() {
        return this.writeBuffer;
    }
    
    @Override
    protected final boolean buffersWrites() {
        return true;
    }
}
