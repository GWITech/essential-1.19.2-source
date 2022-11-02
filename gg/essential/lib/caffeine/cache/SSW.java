package gg.essential.lib.caffeine.cache;

class SSW<K, V> extends SS<K, V>
{
    final Ticker ticker;
    final WriteOrderDeque<Node<K, V>> writeOrderDeque;
    volatile long expiresAfterWriteNanos;
    final MpscGrowableArrayQueue<Runnable> writeBuffer;
    final Pacer pacer;
    
    SSW(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, cacheLoader, async);
        this.ticker = builder.getTicker();
        this.writeOrderDeque = new WriteOrderDeque<Node<K, V>>();
        this.expiresAfterWriteNanos = builder.getExpiresAfterWriteNanos();
        this.writeBuffer = new MpscGrowableArrayQueue<Runnable>(4, SSW.WRITE_BUFFER_MAX);
        this.pacer = ((builder.getScheduler() == Scheduler.disabledScheduler()) ? null : new Pacer(builder.getScheduler()));
    }
    
    @Override
    public final Ticker expirationTicker() {
        return this.ticker;
    }
    
    @Override
    protected final WriteOrderDeque<Node<K, V>> writeOrderDeque() {
        return this.writeOrderDeque;
    }
    
    @Override
    protected final boolean expiresAfterWrite() {
        return true;
    }
    
    @Override
    protected final long expiresAfterWriteNanos() {
        return this.expiresAfterWriteNanos;
    }
    
    @Override
    protected final void setExpiresAfterWriteNanos(final long expiresAfterWriteNanos) {
        this.expiresAfterWriteNanos = expiresAfterWriteNanos;
    }
    
    @Override
    protected final MpscGrowableArrayQueue<Runnable> writeBuffer() {
        return this.writeBuffer;
    }
    
    @Override
    protected final boolean buffersWrites() {
        return true;
    }
    
    public final Pacer pacer() {
        return this.pacer;
    }
}
