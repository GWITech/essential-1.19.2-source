package gg.essential.lib.caffeine.cache;

class SSA<K, V> extends SS<K, V>
{
    final Ticker ticker;
    final AccessOrderDeque<Node<K, V>> accessOrderWindowDeque;
    final Expiry<K, V> expiry;
    final TimerWheel<K, V> timerWheel;
    volatile long expiresAfterAccessNanos;
    final MpscGrowableArrayQueue<Runnable> writeBuffer;
    final Pacer pacer;
    
    SSA(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, cacheLoader, async);
        this.ticker = builder.getTicker();
        this.accessOrderWindowDeque = ((builder.evicts() || builder.expiresAfterAccess()) ? new AccessOrderDeque<Node<K, V>>() : null);
        this.expiry = builder.getExpiry(this.isAsync);
        this.timerWheel = (builder.expiresVariable() ? new TimerWheel<K, V>(this) : null);
        this.expiresAfterAccessNanos = builder.getExpiresAfterAccessNanos();
        this.writeBuffer = new MpscGrowableArrayQueue<Runnable>(4, SSA.WRITE_BUFFER_MAX);
        this.pacer = ((builder.getScheduler() == Scheduler.disabledScheduler()) ? null : new Pacer(builder.getScheduler()));
    }
    
    @Override
    public final Ticker expirationTicker() {
        return this.ticker;
    }
    
    @Override
    protected final AccessOrderDeque<Node<K, V>> accessOrderWindowDeque() {
        return this.accessOrderWindowDeque;
    }
    
    @Override
    protected final boolean expiresVariable() {
        return this.timerWheel != null;
    }
    
    @Override
    protected final Expiry<K, V> expiry() {
        return this.expiry;
    }
    
    @Override
    protected final TimerWheel<K, V> timerWheel() {
        return this.timerWheel;
    }
    
    @Override
    protected final boolean expiresAfterAccess() {
        return this.timerWheel == null;
    }
    
    @Override
    protected final long expiresAfterAccessNanos() {
        return this.expiresAfterAccessNanos;
    }
    
    @Override
    protected final void setExpiresAfterAccessNanos(final long expiresAfterAccessNanos) {
        this.expiresAfterAccessNanos = expiresAfterAccessNanos;
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
