package gg.essential.lib.caffeine.cache;

class SSMSA<K, V> extends SSMS<K, V>
{
    final Ticker ticker;
    final Expiry<K, V> expiry;
    final TimerWheel<K, V> timerWheel;
    volatile long expiresAfterAccessNanos;
    final Pacer pacer;
    
    SSMSA(final Caffeine<K, V> builder, final CacheLoader<? super K, V> cacheLoader, final boolean async) {
        super(builder, cacheLoader, async);
        this.ticker = builder.getTicker();
        this.expiry = builder.getExpiry(this.isAsync);
        this.timerWheel = (builder.expiresVariable() ? new TimerWheel<K, V>(this) : null);
        this.expiresAfterAccessNanos = builder.getExpiresAfterAccessNanos();
        this.pacer = ((builder.getScheduler() == Scheduler.disabledScheduler()) ? null : new Pacer(builder.getScheduler()));
    }
    
    @Override
    public final Ticker expirationTicker() {
        return this.ticker;
    }
    
    @Override
    protected boolean fastpath() {
        return false;
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
    
    public final Pacer pacer() {
        return this.pacer;
    }
}
