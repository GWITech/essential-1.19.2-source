package gg.essential.lib.caffeine.cache;

import java.util.function.*;
import com.google.errorprone.annotations.*;
import java.time.*;
import java.util.logging.*;
import java.util.*;
import gg.essential.lib.caffeine.cache.stats.*;
import java.io.*;
import java.util.concurrent.*;

public final class Caffeine<K, V>
{
    static final Logger logger;
    static final Supplier<StatsCounter> ENABLED_STATS_COUNTER_SUPPLIER;
    static final int UNSET_INT = -1;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int DEFAULT_EXPIRATION_NANOS = 0;
    static final int DEFAULT_REFRESH_NANOS = 0;
    boolean strictParsing;
    long maximumSize;
    long maximumWeight;
    int initialCapacity;
    long expireAfterWriteNanos;
    long expireAfterAccessNanos;
    long refreshAfterWriteNanos;
    RemovalListener<? super K, ? super V> evictionListener;
    RemovalListener<? super K, ? super V> removalListener;
    Supplier<StatsCounter> statsCounterSupplier;
    CacheWriter<? super K, ? super V> writer;
    Weigher<? super K, ? super V> weigher;
    Expiry<? super K, ? super V> expiry;
    Scheduler scheduler;
    Executor executor;
    Ticker ticker;
    Caffeine.Strength keyStrength;
    Caffeine.Strength valueStrength;
    
    private Caffeine() {
        super();
        this.strictParsing = true;
        this.maximumSize = -1L;
        this.maximumWeight = -1L;
        this.initialCapacity = -1;
        this.expireAfterWriteNanos = -1L;
        this.expireAfterAccessNanos = -1L;
        this.refreshAfterWriteNanos = -1L;
    }
    
    @FormatMethod
    static void requireArgument(final boolean expression, final String template, final Object... args) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(template, args));
        }
    }
    
    static void requireArgument(final boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }
    
    static void requireState(final boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }
    
    @FormatMethod
    static void requireState(final boolean expression, final String template, final Object... args) {
        if (!expression) {
            throw new IllegalStateException(String.format(template, args));
        }
    }
    
    static int ceilingPowerOfTwo(final int x) {
        return 1 << -Integer.numberOfLeadingZeros(x - 1);
    }
    
    static long ceilingPowerOfTwo(final long x) {
        return 1L << -Long.numberOfLeadingZeros(x - 1L);
    }
    
    public static Caffeine<Object, Object> newBuilder() {
        return new Caffeine<Object, Object>();
    }
    
    public static Caffeine<Object, Object> from(final CaffeineSpec spec) {
        final Caffeine<Object, Object> builder = spec.toBuilder();
        builder.strictParsing = false;
        return builder;
    }
    
    public static Caffeine<Object, Object> from(final String spec) {
        return from(CaffeineSpec.parse(spec));
    }
    
    public Caffeine<K, V> initialCapacity(final int initialCapacity) {
        requireState(this.initialCapacity == -1, "initial capacity was already set to %s", this.initialCapacity);
        requireArgument(initialCapacity >= 0);
        this.initialCapacity = initialCapacity;
        return this;
    }
    
    boolean hasInitialCapacity() {
        return this.initialCapacity != -1;
    }
    
    int getInitialCapacity() {
        return this.hasInitialCapacity() ? this.initialCapacity : 16;
    }
    
    public Caffeine<K, V> executor(final Executor executor) {
        requireState(this.executor == null, "executor was already set to %s", this.executor);
        this.executor = Objects.requireNonNull(executor);
        return this;
    }
    
    Executor getExecutor() {
        return (this.executor == null) ? ForkJoinPool.commonPool() : this.executor;
    }
    
    public Caffeine<K, V> scheduler(final Scheduler scheduler) {
        requireState(this.scheduler == null, "scheduler was already set to %s", this.scheduler);
        this.scheduler = Objects.requireNonNull(scheduler);
        return this;
    }
    
    Scheduler getScheduler() {
        if (this.scheduler == null || this.scheduler == Scheduler.disabledScheduler()) {
            return Scheduler.disabledScheduler();
        }
        if (this.scheduler == Scheduler.systemScheduler()) {
            return this.scheduler;
        }
        return Scheduler.guardedScheduler(this.scheduler);
    }
    
    public Caffeine<K, V> maximumSize(final long maximumSize) {
        requireState(this.maximumSize == -1L, "maximum size was already set to %s", this.maximumSize);
        requireState(this.maximumWeight == -1L, "maximum weight was already set to %s", this.maximumWeight);
        requireState(this.weigher == null, "maximum size can not be combined with weigher", new Object[0]);
        requireArgument(maximumSize >= 0L, "maximum size must not be negative", new Object[0]);
        this.maximumSize = maximumSize;
        return this;
    }
    
    public Caffeine<K, V> maximumWeight(final long maximumWeight) {
        requireState(this.maximumWeight == -1L, "maximum weight was already set to %s", this.maximumWeight);
        requireState(this.maximumSize == -1L, "maximum size was already set to %s", this.maximumSize);
        requireArgument(maximumWeight >= 0L, "maximum weight must not be negative", new Object[0]);
        this.maximumWeight = maximumWeight;
        return this;
    }
    
    public <K1 extends K, V1 extends V> Caffeine<K1, V1> weigher(final Weigher<? super K1, ? super V1> weigher) {
        Objects.requireNonNull(weigher);
        requireState(this.weigher == null, "weigher was already set to %s", this.weigher);
        requireState(!this.strictParsing || this.maximumSize == -1L, "weigher can not be combined with maximum size", new Object[0]);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        self.weigher = weigher;
        return self;
    }
    
    boolean evicts() {
        return this.getMaximum() != -1L;
    }
    
    boolean isWeighted() {
        return this.weigher != null;
    }
    
    long getMaximum() {
        return this.isWeighted() ? this.maximumWeight : this.maximumSize;
    }
    
     <K1 extends K, V1 extends V> Weigher<K1, V1> getWeigher(final boolean isAsync) {
        final Weigher<K1, V1> delegate = (this.weigher == null || this.weigher == Weigher.singletonWeigher()) ? Weigher.singletonWeigher() : Weigher.boundedWeigher((Weigher<K1, V1>)this.weigher);
        return (Weigher<K1, V1>)(isAsync ? new Async.AsyncWeigher((Weigher<Object, Object>)delegate) : delegate);
    }
    
    public Caffeine<K, V> weakKeys() {
        requireState(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
        requireState(this.writer == null, "Weak keys may not be used with CacheWriter", new Object[0]);
        this.keyStrength = Caffeine.Strength.WEAK;
        return this;
    }
    
    boolean isStrongKeys() {
        return this.keyStrength == null;
    }
    
    public Caffeine<K, V> weakValues() {
        requireState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = Caffeine.Strength.WEAK;
        return this;
    }
    
    boolean isStrongValues() {
        return this.valueStrength == null;
    }
    
    boolean isWeakValues() {
        return this.valueStrength == Caffeine.Strength.WEAK;
    }
    
    public Caffeine<K, V> softValues() {
        requireState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = Caffeine.Strength.SOFT;
        return this;
    }
    
    public Caffeine<K, V> expireAfterWrite(final Duration duration) {
        return this.expireAfterWrite(saturatedToNanos(duration), TimeUnit.NANOSECONDS);
    }
    
    public Caffeine<K, V> expireAfterWrite(final long duration, final TimeUnit unit) {
        requireState(this.expireAfterWriteNanos == -1L, "expireAfterWrite was already set to %s ns", this.expireAfterWriteNanos);
        requireState(this.expiry == null, "expireAfterWrite may not be used with variable expiration", new Object[0]);
        requireArgument(duration >= 0L, "duration cannot be negative: %s %s", duration, unit);
        this.expireAfterWriteNanos = unit.toNanos(duration);
        return this;
    }
    
    long getExpiresAfterWriteNanos() {
        return this.expiresAfterWrite() ? this.expireAfterWriteNanos : 0L;
    }
    
    boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos != -1L;
    }
    
    public Caffeine<K, V> expireAfterAccess(final Duration duration) {
        return this.expireAfterAccess(saturatedToNanos(duration), TimeUnit.NANOSECONDS);
    }
    
    public Caffeine<K, V> expireAfterAccess(final long duration, final TimeUnit unit) {
        requireState(this.expireAfterAccessNanos == -1L, "expireAfterAccess was already set to %s ns", this.expireAfterAccessNanos);
        requireState(this.expiry == null, "expireAfterAccess may not be used with variable expiration", new Object[0]);
        requireArgument(duration >= 0L, "duration cannot be negative: %s %s", duration, unit);
        this.expireAfterAccessNanos = unit.toNanos(duration);
        return this;
    }
    
    long getExpiresAfterAccessNanos() {
        return this.expiresAfterAccess() ? this.expireAfterAccessNanos : 0L;
    }
    
    boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos != -1L;
    }
    
    public <K1 extends K, V1 extends V> Caffeine<K1, V1> expireAfter(final Expiry<? super K1, ? super V1> expiry) {
        Objects.requireNonNull(expiry);
        requireState(this.expiry == null, "Expiry was already set to %s", this.expiry);
        requireState(this.expireAfterAccessNanos == -1L, "Expiry may not be used with expiresAfterAccess", new Object[0]);
        requireState(this.expireAfterWriteNanos == -1L, "Expiry may not be used with expiresAfterWrite", new Object[0]);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        self.expiry = expiry;
        return self;
    }
    
    boolean expiresVariable() {
        return this.expiry != null;
    }
    
    Expiry<K, V> getExpiry(final boolean isAsync) {
        return (Expiry<K, V>)((isAsync && this.expiry != null) ? new Async.AsyncExpiry((Expiry)this.expiry) : this.expiry);
    }
    
    public Caffeine<K, V> refreshAfterWrite(final Duration duration) {
        return this.refreshAfterWrite(saturatedToNanos(duration), TimeUnit.NANOSECONDS);
    }
    
    public Caffeine<K, V> refreshAfterWrite(final long duration, final TimeUnit unit) {
        Objects.requireNonNull(unit);
        requireState(this.refreshAfterWriteNanos == -1L, "refreshAfterWriteNanos was already set to %s ns", this.refreshAfterWriteNanos);
        requireArgument(duration > 0L, "duration must be positive: %s %s", duration, unit);
        this.refreshAfterWriteNanos = unit.toNanos(duration);
        return this;
    }
    
    long getRefreshAfterWriteNanos() {
        return this.refreshAfterWrite() ? this.refreshAfterWriteNanos : 0L;
    }
    
    boolean refreshAfterWrite() {
        return this.refreshAfterWriteNanos != -1L;
    }
    
    public Caffeine<K, V> ticker(final Ticker ticker) {
        requireState(this.ticker == null, "Ticker was already set to %s", this.ticker);
        this.ticker = Objects.requireNonNull(ticker);
        return this;
    }
    
    Ticker getTicker() {
        final boolean useTicker = this.expiresVariable() || this.expiresAfterAccess() || this.expiresAfterWrite() || this.refreshAfterWrite() || this.isRecordingStats();
        return useTicker ? ((this.ticker == null) ? Ticker.systemTicker() : this.ticker) : Ticker.disabledTicker();
    }
    
    public <K1 extends K, V1 extends V> Caffeine<K1, V1> evictionListener(final RemovalListener<? super K1, ? super V1> evictionListener) {
        requireState(this.evictionListener == null, "eviction listener was already set to %s", this.evictionListener);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        self.evictionListener = Objects.requireNonNull(evictionListener);
        return self;
    }
    
    public <K1 extends K, V1 extends V> Caffeine<K1, V1> removalListener(final RemovalListener<? super K1, ? super V1> removalListener) {
        requireState(this.removalListener == null, "removal listener was already set to %s", this.removalListener);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        self.removalListener = Objects.requireNonNull(removalListener);
        return self;
    }
    
     <K1 extends K, V1 extends V> RemovalListener<K1, V1> getRemovalListener(final boolean async) {
        final RemovalListener<K1, V1> castedListener = (RemovalListener<K1, V1>)this.removalListener;
        return (RemovalListener<K1, V1>)((async && castedListener != null) ? new Async.AsyncRemovalListener((RemovalListener)castedListener, this.getExecutor()) : castedListener);
    }
    
    @Deprecated
    public <K1 extends K, V1 extends V> Caffeine<K1, V1> writer(final CacheWriter<? super K1, ? super V1> writer) {
        requireState(this.writer == null, "Writer was already set to %s", this.writer);
        requireState(this.keyStrength == null, "Weak keys may not be used with CacheWriter", new Object[0]);
        requireState(this.evictionListener == null, "Eviction listener may not be used with CacheWriter", new Object[0]);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        self.writer = Objects.requireNonNull(writer);
        return self;
    }
    
     <K1 extends K, V1 extends V> CacheWriter<K1, V1> getCacheWriter(final boolean async) {
        CacheWriter<K1, V1> castedWriter;
        if (this.evictionListener == null) {
            castedWriter = (CacheWriter<K1, V1>)this.writer;
        }
        else {
            castedWriter = new CacheWriterAdapter<K1, V1>(this.evictionListener, async);
        }
        return (castedWriter == null) ? CacheWriter.disabledWriter() : castedWriter;
    }
    
    public Caffeine<K, V> recordStats() {
        requireState(this.statsCounterSupplier == null, "Statistics recording was already set", new Object[0]);
        this.statsCounterSupplier = Caffeine.ENABLED_STATS_COUNTER_SUPPLIER;
        return this;
    }
    
    public Caffeine<K, V> recordStats(final Supplier<? extends StatsCounter> statsCounterSupplier) {
        requireState(this.statsCounterSupplier == null, "Statistics recording was already set", new Object[0]);
        Objects.requireNonNull(statsCounterSupplier);
        this.statsCounterSupplier = (() -> StatsCounter.guardedStatsCounter(statsCounterSupplier.get()));
        return this;
    }
    
    boolean isRecordingStats() {
        return this.statsCounterSupplier != null;
    }
    
    Supplier<StatsCounter> getStatsCounterSupplier() {
        return (this.statsCounterSupplier == null) ? StatsCounter::disabledStatsCounter : this.statsCounterSupplier;
    }
    
    boolean isBounded() {
        return this.maximumSize != -1L || this.maximumWeight != -1L || this.expireAfterAccessNanos != -1L || this.expireAfterWriteNanos != -1L || this.expiry != null || this.keyStrength != null || this.valueStrength != null;
    }
    
    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
        this.requireWeightWithWeigher();
        this.requireNonLoadingCache();
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        return (Cache<K1, V1>)(this.isBounded() ? new BoundedLocalCache.BoundedLocalManualCache<K1, V1>((Caffeine<Object, Object>)self) : new UnboundedLocalCache.UnboundedLocalManualCache((Caffeine)self));
    }
    
    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(final CacheLoader<? super K1, V1> loader) {
        this.requireWeightWithWeigher();
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        return (LoadingCache<K1, V1>)((this.isBounded() || this.refreshAfterWrite()) ? new BoundedLocalCache.BoundedLocalLoadingCache((Caffeine)self, (CacheLoader)loader) : new UnboundedLocalCache.UnboundedLocalLoadingCache((Caffeine)self, (CacheLoader)loader));
    }
    
    public <K1 extends K, V1 extends V> AsyncCache<K1, V1> buildAsync() {
        requireState(this.valueStrength == null, "Weak or soft values can not be combined with AsyncCache", new Object[0]);
        requireState(this.writer == null, "CacheWriter can not be combined with AsyncCache", new Object[0]);
        requireState(this.isStrongKeys() || this.evictionListener == null, "Weak keys cannot be combined eviction listener and with AsyncLoadingCache", new Object[0]);
        this.requireWeightWithWeigher();
        this.requireNonLoadingCache();
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        return (AsyncCache<K1, V1>)(this.isBounded() ? new BoundedLocalCache.BoundedLocalAsyncCache((Caffeine)self) : new UnboundedLocalCache.UnboundedLocalAsyncCache((Caffeine)self));
    }
    
    public <K1 extends K, V1 extends V> AsyncLoadingCache<K1, V1> buildAsync(final CacheLoader<? super K1, V1> loader) {
        return this.buildAsync((AsyncCacheLoader<? super K1, V1>)loader);
    }
    
    public <K1 extends K, V1 extends V> AsyncLoadingCache<K1, V1> buildAsync(final AsyncCacheLoader<? super K1, V1> loader) {
        requireState(this.isStrongValues(), "Weak or soft values cannot be combined with AsyncLoadingCache", new Object[0]);
        requireState(this.writer == null, "CacheWriter cannot be combined with AsyncLoadingCache", new Object[0]);
        requireState(this.isStrongKeys() || this.evictionListener == null, "Weak keys cannot be combined eviction listener and with AsyncLoadingCache", new Object[0]);
        this.requireWeightWithWeigher();
        Objects.requireNonNull(loader);
        final Caffeine<K1, V1> self = (Caffeine<K1, V1>)this;
        return (AsyncLoadingCache<K1, V1>)((this.isBounded() || this.refreshAfterWrite()) ? new BoundedLocalCache.BoundedLocalAsyncLoadingCache<K1, V1>((Caffeine<Object, Object>)self, (AsyncCacheLoader<? super Object, Object>)loader) : new UnboundedLocalCache.UnboundedLocalAsyncLoadingCache((Caffeine)self, (AsyncCacheLoader)loader));
    }
    
    void requireNonLoadingCache() {
        requireState(this.refreshAfterWriteNanos == -1L, "refreshAfterWrite requires a LoadingCache", new Object[0]);
    }
    
    void requireWeightWithWeigher() {
        if (this.weigher == null) {
            requireState(this.maximumWeight == -1L, "maximumWeight requires weigher", new Object[0]);
        }
        else if (this.strictParsing) {
            requireState(this.maximumWeight != -1L, "weigher requires maximumWeight", new Object[0]);
        }
        else if (this.maximumWeight == -1L) {
            Caffeine.logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }
    
    private static long saturatedToNanos(final Duration duration) {
        try {
            return duration.toNanos();
        }
        catch (final ArithmeticException ex) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder(75);
        s.append(this.getClass().getSimpleName()).append('{');
        final int baseLength = s.length();
        if (this.initialCapacity != -1) {
            s.append("initialCapacity=").append(this.initialCapacity).append(", ");
        }
        if (this.maximumSize != -1L) {
            s.append("maximumSize=").append(this.maximumSize).append(", ");
        }
        if (this.maximumWeight != -1L) {
            s.append("maximumWeight=").append(this.maximumWeight).append(", ");
        }
        if (this.expireAfterWriteNanos != -1L) {
            s.append("expireAfterWrite=").append(this.expireAfterWriteNanos).append("ns, ");
        }
        if (this.expireAfterAccessNanos != -1L) {
            s.append("expireAfterAccess=").append(this.expireAfterAccessNanos).append("ns, ");
        }
        if (this.expiry != null) {
            s.append("expiry, ");
        }
        if (this.refreshAfterWriteNanos != -1L) {
            s.append("refreshAfterWriteNanos=").append(this.refreshAfterWriteNanos).append("ns, ");
        }
        if (this.keyStrength != null) {
            s.append("keyStrength=").append(this.keyStrength.toString().toLowerCase(Locale.US)).append(", ");
        }
        if (this.valueStrength != null) {
            s.append("valueStrength=").append(this.valueStrength.toString().toLowerCase(Locale.US)).append(", ");
        }
        if (this.evictionListener != null) {
            s.append("evictionListener, ");
        }
        if (this.removalListener != null) {
            s.append("removalListener, ");
        }
        if (this.writer != null) {
            s.append("writer, ");
        }
        if (s.length() > baseLength) {
            s.deleteCharAt(s.length() - 2);
        }
        return s.append('}').toString();
    }
    
    private static /* synthetic */ StatsCounter lambda$recordStats$0(final Supplier statsCounterSupplier) {
        return StatsCounter.guardedStatsCounter(statsCounterSupplier.get());
    }
    
    static {
        logger = Logger.getLogger(Caffeine.class.getName());
        ENABLED_STATS_COUNTER_SUPPLIER = ConcurrentStatsCounter::new;
    }
    
    static final class CacheWriterAdapter<K, V> implements CacheWriter<K, V>, Serializable
    {
        private static final long serialVersionUID = 1L;
        final RemovalListener<? super K, ? super V> delegate;
        final boolean isAsync;
        
        CacheWriterAdapter(final RemovalListener<? super K, ? super V> delegate, final boolean isAsync) {
            super();
            this.delegate = delegate;
            this.isAsync = isAsync;
        }
        
        @Override
        public void write(final K key, final V value) {
        }
        
        @Override
        public void delete(final K key, V value, final RemovalCause cause) {
            if (cause.wasEvicted()) {
                try {
                    if (this.isAsync && value != null) {
                        final CompletableFuture<V> future = (CompletableFuture<V>)value;
                        value = Async.getIfReady(future);
                    }
                    this.delegate.onRemoval((Object)key, (Object)value, cause);
                }
                catch (final Throwable t) {
                    Caffeine.logger.log(Level.WARNING, "Exception thrown by eviction listener", t);
                }
            }
        }
    }
}
