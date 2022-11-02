package gg.essential.lib.caffeine.cache;

import java.util.concurrent.locks.*;
import com.google.errorprone.annotations.concurrent.*;
import gg.essential.lib.caffeine.cache.stats.*;
import java.util.logging.*;
import java.util.*;
import java.util.function.*;
import java.lang.ref.*;
import java.io.*;
import java.util.concurrent.*;

abstract class BoundedLocalCache<K, V> extends BLCHeader.DrainStatusRef<K, V> implements LocalCache<K, V>
{
    static final Logger logger;
    static final int NCPU;
    static final int WRITE_BUFFER_MIN = 4;
    static final int WRITE_BUFFER_MAX;
    static final int WRITE_BUFFER_RETRIES = 100;
    static final long MAXIMUM_CAPACITY = 9223372034707292160L;
    static final double PERCENT_MAIN = 0.99;
    static final double PERCENT_MAIN_PROTECTED = 0.8;
    static final double HILL_CLIMBER_RESTART_THRESHOLD = 0.05;
    static final double HILL_CLIMBER_STEP_PERCENT = 0.0625;
    static final double HILL_CLIMBER_STEP_DECAY_RATE = 0.98;
    static final int QUEUE_TRANSFER_THRESHOLD = 1000;
    static final long EXPIRE_WRITE_TOLERANCE;
    static final long MAXIMUM_EXPIRY = 4611686018427387903L;
    final ConcurrentHashMap<Object, Node<K, V>> data;
    final CacheLoader<K, V> cacheLoader;
    final PerformCleanupTask drainBuffersTask;
    final Consumer<Node<K, V>> accessPolicy;
    final Buffer<Node<K, V>> readBuffer;
    final NodeFactory<K, V> nodeFactory;
    final ReentrantLock evictionLock;
    final CacheWriter<K, V> writer;
    final Weigher<K, V> weigher;
    final Executor executor;
    final boolean isAsync;
    transient Set<K> keySet;
    transient Collection<V> values;
    transient Set<Map.Entry<K, V>> entrySet;
    
    protected BoundedLocalCache(final Caffeine<K, V> builder, final CacheLoader<K, V> cacheLoader, final boolean isAsync) {
        super();
        this.isAsync = isAsync;
        this.cacheLoader = cacheLoader;
        this.executor = builder.getExecutor();
        this.evictionLock = new ReentrantLock();
        this.weigher = builder.getWeigher(isAsync);
        this.writer = builder.getCacheWriter(isAsync);
        this.drainBuffersTask = new PerformCleanupTask(this);
        this.nodeFactory = NodeFactory.newFactory(builder, isAsync);
        this.data = new ConcurrentHashMap<Object, Node<K, V>>(builder.getInitialCapacity());
        this.readBuffer = ((this.evicts() || this.collectKeys() || this.collectValues() || this.expiresAfterAccess()) ? new BoundedBuffer<Node<K, V>>() : Buffer.disabled());
        this.accessPolicy = ((this.evicts() || this.expiresAfterAccess()) ? this::onAccess : (e -> {}));
        if (this.evicts()) {
            this.setMaximumSize(builder.getMaximum());
        }
    }
    
    final boolean isComputingAsync(final Node<?, ?> node) {
        return this.isAsync && !Async.isReady((CompletableFuture<?>)node.getValue());
    }
    
    @GuardedBy("evictionLock")
    protected AccessOrderDeque<Node<K, V>> accessOrderWindowDeque() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected AccessOrderDeque<Node<K, V>> accessOrderProbationDeque() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected AccessOrderDeque<Node<K, V>> accessOrderProtectedDeque() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected WriteOrderDeque<Node<K, V>> writeOrderDeque() {
        throw new UnsupportedOperationException();
    }
    
    protected boolean buffersWrites() {
        return false;
    }
    
    protected MpscGrowableArrayQueue<Runnable> writeBuffer() {
        throw new UnsupportedOperationException();
    }
    
    public final Executor executor() {
        return this.executor;
    }
    
    protected boolean hasWriter() {
        return this.writer != CacheWriter.disabledWriter();
    }
    
    public boolean isRecordingStats() {
        return false;
    }
    
    public StatsCounter statsCounter() {
        return StatsCounter.disabledStatsCounter();
    }
    
    public Ticker statsTicker() {
        return Ticker.disabledTicker();
    }
    
    public RemovalListener<K, V> removalListener() {
        return null;
    }
    
    public boolean hasRemovalListener() {
        return false;
    }
    
    public void notifyRemoval(final K key, final V value, final RemovalCause cause) {
        Caffeine.requireState(this.hasRemovalListener(), "Notification should be guarded with a check", new Object[0]);
        final Runnable task = () -> {
            try {
                this.removalListener().onRemoval((K)key, (V)value, cause);
            }
            catch (final Throwable t2) {
                BoundedLocalCache.logger.log(Level.WARNING, "Exception thrown by removal listener", t2);
            }
            return;
        };
        try {
            this.executor.execute(task);
        }
        catch (final Throwable t) {
            BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when submitting removal listener", t);
            task.run();
        }
    }
    
    protected boolean collectKeys() {
        return false;
    }
    
    protected boolean collectValues() {
        return false;
    }
    
    protected ReferenceQueue<K> keyReferenceQueue() {
        return null;
    }
    
    protected ReferenceQueue<V> valueReferenceQueue() {
        return null;
    }
    
    protected Pacer pacer() {
        return null;
    }
    
    protected boolean expiresVariable() {
        return false;
    }
    
    protected boolean expiresAfterAccess() {
        return false;
    }
    
    protected long expiresAfterAccessNanos() {
        throw new UnsupportedOperationException();
    }
    
    protected void setExpiresAfterAccessNanos(final long expireAfterAccessNanos) {
        throw new UnsupportedOperationException();
    }
    
    protected boolean expiresAfterWrite() {
        return false;
    }
    
    protected long expiresAfterWriteNanos() {
        throw new UnsupportedOperationException();
    }
    
    protected void setExpiresAfterWriteNanos(final long expireAfterWriteNanos) {
        throw new UnsupportedOperationException();
    }
    
    protected boolean refreshAfterWrite() {
        return false;
    }
    
    protected long refreshAfterWriteNanos() {
        throw new UnsupportedOperationException();
    }
    
    protected void setRefreshAfterWriteNanos(final long refreshAfterWriteNanos) {
        throw new UnsupportedOperationException();
    }
    
    public boolean hasWriteTime() {
        return this.expiresAfterWrite() || this.refreshAfterWrite();
    }
    
    protected Expiry<K, V> expiry() {
        return null;
    }
    
    public Ticker expirationTicker() {
        return Ticker.disabledTicker();
    }
    
    protected TimerWheel<K, V> timerWheel() {
        throw new UnsupportedOperationException();
    }
    
    protected boolean evicts() {
        return false;
    }
    
    protected boolean isWeighted() {
        return this.weigher != Weigher.singletonWeigher();
    }
    
    protected FrequencySketch<K> frequencySketch() {
        throw new UnsupportedOperationException();
    }
    
    protected boolean fastpath() {
        return false;
    }
    
    protected long maximum() {
        throw new UnsupportedOperationException();
    }
    
    protected long windowMaximum() {
        throw new UnsupportedOperationException();
    }
    
    protected long mainProtectedMaximum() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setMaximum(final long maximum) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setWindowMaximum(final long maximum) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setMainProtectedMaximum(final long maximum) {
        throw new UnsupportedOperationException();
    }
    
    protected long weightedSize() {
        throw new UnsupportedOperationException();
    }
    
    protected long windowWeightedSize() {
        throw new UnsupportedOperationException();
    }
    
    protected long mainProtectedWeightedSize() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setWeightedSize(final long weightedSize) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setWindowWeightedSize(final long weightedSize) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setMainProtectedWeightedSize(final long weightedSize) {
        throw new UnsupportedOperationException();
    }
    
    protected int hitsInSample() {
        throw new UnsupportedOperationException();
    }
    
    protected int missesInSample() {
        throw new UnsupportedOperationException();
    }
    
    protected int sampleCount() {
        throw new UnsupportedOperationException();
    }
    
    protected double stepSize() {
        throw new UnsupportedOperationException();
    }
    
    protected double previousSampleHitRate() {
        throw new UnsupportedOperationException();
    }
    
    protected long adjustment() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setHitsInSample(final int hitCount) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setMissesInSample(final int missCount) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setSampleCount(final int sampleCount) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setStepSize(final double stepSize) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setPreviousSampleHitRate(final double hitRate) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    protected void setAdjustment(final long amount) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    void setMaximumSize(final long maximum) {
        Caffeine.requireArgument(maximum >= 0L, "maximum must not be negative", new Object[0]);
        if (maximum == this.maximum()) {
            return;
        }
        final long max = Math.min(maximum, 9223372034707292160L);
        final long window = max - (long)(0.99 * max);
        final long mainProtected = (long)(0.8 * (max - window));
        this.setMaximum(max);
        this.setWindowMaximum(window);
        this.setMainProtectedMaximum(mainProtected);
        this.setHitsInSample(0);
        this.setMissesInSample(0);
        this.setStepSize(-0.0625 * max);
        if (this.frequencySketch() != null && !this.isWeighted() && this.weightedSize() >= max >>> 1) {
            this.frequencySketch().ensureCapacity(max);
        }
    }
    
    @GuardedBy("evictionLock")
    void evictEntries() {
        if (!this.evicts()) {
            return;
        }
        final int candidates = this.evictFromWindow();
        this.evictFromMain(candidates);
    }
    
    @GuardedBy("evictionLock")
    int evictFromWindow() {
        int candidates = 0;
        Node<K, V> next;
        for (Node<K, V> node = this.accessOrderWindowDeque().peek(); this.windowWeightedSize() > this.windowMaximum() && node != null; node = next) {
            next = node.getNextInAccessOrder();
            if (node.getPolicyWeight() != 0) {
                node.makeMainProbation();
                this.accessOrderWindowDeque().remove(node);
                this.accessOrderProbationDeque().add(node);
                ++candidates;
                this.setWindowWeightedSize(this.windowWeightedSize() - node.getPolicyWeight());
            }
        }
        return candidates;
    }
    
    @GuardedBy("evictionLock")
    void evictFromMain(int candidates) {
        int victimQueue = 1;
        Node<K, V> victim = this.accessOrderProbationDeque().peekFirst();
        Node<K, V> candidate = this.accessOrderProbationDeque().peekLast();
        while (this.weightedSize() > this.maximum()) {
            if (candidates == 0) {
                candidate = this.accessOrderWindowDeque().peekLast();
            }
            if (candidate == null && victim == null) {
                if (victimQueue == 1) {
                    victim = this.accessOrderProtectedDeque().peekFirst();
                    victimQueue = 2;
                }
                else {
                    if (victimQueue != 2) {
                        break;
                    }
                    victim = this.accessOrderWindowDeque().peekFirst();
                    victimQueue = 0;
                }
            }
            else if (victim != null && victim.getPolicyWeight() == 0) {
                victim = victim.getNextInAccessOrder();
            }
            else if (candidate != null && candidate.getPolicyWeight() == 0) {
                candidate = ((candidates > 0) ? candidate.getPreviousInAccessOrder() : candidate.getNextInAccessOrder());
                --candidates;
            }
            else if (victim == null) {
                final Node<K, V> previous = candidate.getPreviousInAccessOrder();
                final Node<K, V> evict = candidate;
                candidate = previous;
                --candidates;
                this.evictEntry(evict, RemovalCause.SIZE, 0L);
            }
            else if (candidate == null) {
                final Node<K, V> evict2 = victim;
                victim = victim.getNextInAccessOrder();
                this.evictEntry(evict2, RemovalCause.SIZE, 0L);
            }
            else {
                final K victimKey = victim.getKey();
                final K candidateKey = candidate.getKey();
                if (victimKey == null) {
                    final Node<K, V> evict3 = victim;
                    victim = victim.getNextInAccessOrder();
                    this.evictEntry(evict3, RemovalCause.COLLECTED, 0L);
                }
                else if (candidateKey == null) {
                    final Node<K, V> evict3 = candidate;
                    candidate = ((candidates > 0) ? candidate.getPreviousInAccessOrder() : candidate.getNextInAccessOrder());
                    --candidates;
                    this.evictEntry(evict3, RemovalCause.COLLECTED, 0L);
                }
                else if (candidate.getPolicyWeight() > this.maximum()) {
                    final Node<K, V> evict3 = candidate;
                    candidate = ((candidates > 0) ? candidate.getPreviousInAccessOrder() : candidate.getNextInAccessOrder());
                    --candidates;
                    this.evictEntry(evict3, RemovalCause.SIZE, 0L);
                }
                else {
                    --candidates;
                    if (this.admit(candidateKey, victimKey)) {
                        final Node<K, V> evict3 = victim;
                        victim = victim.getNextInAccessOrder();
                        this.evictEntry(evict3, RemovalCause.SIZE, 0L);
                        candidate = candidate.getPreviousInAccessOrder();
                    }
                    else {
                        final Node<K, V> evict3 = candidate;
                        candidate = ((candidates > 0) ? candidate.getPreviousInAccessOrder() : candidate.getNextInAccessOrder());
                        this.evictEntry(evict3, RemovalCause.SIZE, 0L);
                    }
                }
            }
        }
    }
    
    @GuardedBy("evictionLock")
    boolean admit(final K candidateKey, final K victimKey) {
        final int victimFreq = this.frequencySketch().frequency(victimKey);
        final int candidateFreq = this.frequencySketch().frequency(candidateKey);
        if (candidateFreq > victimFreq) {
            return true;
        }
        if (candidateFreq <= 5) {
            return false;
        }
        final int random = ThreadLocalRandom.current().nextInt();
        return (random & 0x7F) == 0x0;
    }
    
    @GuardedBy("evictionLock")
    void expireEntries() {
        final long now = this.expirationTicker().read();
        this.expireAfterAccessEntries(now);
        this.expireAfterWriteEntries(now);
        this.expireVariableEntries(now);
        final Pacer pacer = this.pacer();
        if (pacer != null) {
            final long delay = this.getExpirationDelay(now);
            if (delay != Long.MAX_VALUE) {
                pacer.schedule(this.executor, this.drainBuffersTask, now, delay);
            }
        }
    }
    
    @GuardedBy("evictionLock")
    void expireAfterAccessEntries(final long now) {
        if (!this.expiresAfterAccess()) {
            return;
        }
        this.expireAfterAccessEntries(this.accessOrderWindowDeque(), now);
        if (this.evicts()) {
            this.expireAfterAccessEntries(this.accessOrderProbationDeque(), now);
            this.expireAfterAccessEntries(this.accessOrderProtectedDeque(), now);
        }
    }
    
    @GuardedBy("evictionLock")
    void expireAfterAccessEntries(final AccessOrderDeque<Node<K, V>> accessOrderDeque, final long now) {
        final long duration = this.expiresAfterAccessNanos();
        while (true) {
            final Node<K, V> node = accessOrderDeque.peekFirst();
            if (node == null || now - node.getAccessTime() < duration) {
                break;
            }
            this.evictEntry(node, RemovalCause.EXPIRED, now);
        }
    }
    
    @GuardedBy("evictionLock")
    void expireAfterWriteEntries(final long now) {
        if (!this.expiresAfterWrite()) {
            return;
        }
        final long duration = this.expiresAfterWriteNanos();
        while (true) {
            final Node<K, V> node = this.writeOrderDeque().peekFirst();
            if (node == null || now - node.getWriteTime() < duration) {
                break;
            }
            this.evictEntry(node, RemovalCause.EXPIRED, now);
        }
    }
    
    @GuardedBy("evictionLock")
    void expireVariableEntries(final long now) {
        if (this.expiresVariable()) {
            this.timerWheel().advance(now);
        }
    }
    
    @GuardedBy("evictionLock")
    private long getExpirationDelay(final long now) {
        long delay = Long.MAX_VALUE;
        if (this.expiresAfterAccess()) {
            Node<K, V> node = this.accessOrderWindowDeque().peekFirst();
            if (node != null) {
                delay = Math.min(Long.MAX_VALUE, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
            }
            if (this.evicts()) {
                node = this.accessOrderProbationDeque().peekFirst();
                if (node != null) {
                    delay = Math.min(delay, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
                }
                node = this.accessOrderProtectedDeque().peekFirst();
                if (node != null) {
                    delay = Math.min(delay, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
                }
            }
        }
        if (this.expiresAfterWrite()) {
            final Node<K, V> node = this.writeOrderDeque().peekFirst();
            if (node != null) {
                delay = Math.min(delay, this.expiresAfterWriteNanos() - (now - node.getWriteTime()));
            }
        }
        if (this.expiresVariable()) {
            delay = Math.min(delay, this.timerWheel().getExpirationDelay());
        }
        return delay;
    }
    
    boolean hasExpired(final Node<K, V> node, final long now) {
        return (this.expiresAfterAccess() && now - node.getAccessTime() >= this.expiresAfterAccessNanos()) | (this.expiresAfterWrite() && now - node.getWriteTime() >= this.expiresAfterWriteNanos()) | (this.expiresVariable() && now - node.getVariableTime() >= 0L);
    }
    
    @GuardedBy("evictionLock")
    boolean evictEntry(final Node<K, V> node, final RemovalCause cause, final long now) {
        final K key = node.getKey();
        final V[] value = (V[])new Object[] { null };
        final boolean[] removed = { false };
        final boolean[] resurrect = { false };
        final RemovalCause[] actualCause = { null };
        this.data.computeIfPresent(node.getKeyReference(), (k, n) -> {
            if (n != node) {
                return n;
            }
            else {
                synchronized (n) {
                    value[0] = n.getValue();
                    actualCause[0] = ((key == null || value[0] == null) ? RemovalCause.COLLECTED : cause);
                    if (actualCause[0] == RemovalCause.EXPIRED) {
                        boolean expired = false;
                        if (this.expiresAfterAccess()) {
                            expired = (false | now - n.getAccessTime() >= this.expiresAfterAccessNanos());
                        }
                        if (this.expiresAfterWrite()) {
                            expired |= (now - n.getWriteTime() >= this.expiresAfterWriteNanos());
                        }
                        if (this.expiresVariable()) {
                            expired |= (n.getVariableTime() <= now);
                        }
                        if (!expired) {
                            resurrect[0] = true;
                            return n;
                        }
                    }
                    else if (actualCause[0] == RemovalCause.SIZE) {
                        final int weight = node.getWeight();
                        if (weight == 0) {
                            resurrect[0] = true;
                            return n;
                        }
                    }
                    this.writer.delete((K)key, (V)value[0], actualCause[0]);
                    this.makeDead(n);
                }
                removed[0] = true;
                return null;
            }
        });
        if (resurrect[0]) {
            return false;
        }
        if (node.inWindow() && (this.evicts() || this.expiresAfterAccess())) {
            this.accessOrderWindowDeque().remove(node);
        }
        else if (this.evicts()) {
            if (node.inMainProbation()) {
                this.accessOrderProbationDeque().remove(node);
            }
            else {
                this.accessOrderProtectedDeque().remove(node);
            }
        }
        if (this.expiresAfterWrite()) {
            this.writeOrderDeque().remove(node);
        }
        else if (this.expiresVariable()) {
            this.timerWheel().deschedule(node);
        }
        if (removed[0]) {
            this.statsCounter().recordEviction(node.getWeight(), actualCause[0]);
            if (this.hasRemovalListener()) {
                this.notifyRemoval(key, value[0], actualCause[0]);
            }
        }
        else {
            this.makeDead(node);
        }
        return true;
    }
    
    @GuardedBy("evictionLock")
    void climb() {
        if (!this.evicts()) {
            return;
        }
        this.determineAdjustment();
        this.demoteFromMainProtected();
        final long amount = this.adjustment();
        if (amount == 0L) {
            return;
        }
        if (amount > 0L) {
            this.increaseWindow();
        }
        else {
            this.decreaseWindow();
        }
    }
    
    @GuardedBy("evictionLock")
    void determineAdjustment() {
        if (this.frequencySketch().isNotInitialized()) {
            this.setPreviousSampleHitRate(0.0);
            this.setMissesInSample(0);
            this.setHitsInSample(0);
            return;
        }
        final int requestCount = this.hitsInSample() + this.missesInSample();
        if (requestCount < this.frequencySketch().sampleSize) {
            return;
        }
        final double hitRate = this.hitsInSample() / (double)requestCount;
        final double hitRateChange = hitRate - this.previousSampleHitRate();
        final double amount = (hitRateChange >= 0.0) ? this.stepSize() : (-this.stepSize());
        final double nextStepSize = (Math.abs(hitRateChange) >= 0.05) ? (0.0625 * this.maximum() * ((amount >= 0.0) ? 1 : -1)) : (0.98 * amount);
        this.setPreviousSampleHitRate(hitRate);
        this.setAdjustment((long)amount);
        this.setStepSize(nextStepSize);
        this.setMissesInSample(0);
        this.setHitsInSample(0);
    }
    
    @GuardedBy("evictionLock")
    void increaseWindow() {
        if (this.mainProtectedMaximum() == 0L) {
            return;
        }
        long quota = Math.min(this.adjustment(), this.mainProtectedMaximum());
        this.setMainProtectedMaximum(this.mainProtectedMaximum() - quota);
        this.setWindowMaximum(this.windowMaximum() + quota);
        this.demoteFromMainProtected();
        for (int i = 0; i < 1000; ++i) {
            Node<K, V> candidate = this.accessOrderProbationDeque().peek();
            boolean probation = true;
            if (candidate == null || quota < candidate.getPolicyWeight()) {
                candidate = this.accessOrderProtectedDeque().peek();
                probation = false;
            }
            if (candidate == null) {
                break;
            }
            final int weight = candidate.getPolicyWeight();
            if (quota < weight) {
                break;
            }
            quota -= weight;
            if (probation) {
                this.accessOrderProbationDeque().remove(candidate);
            }
            else {
                this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - weight);
                this.accessOrderProtectedDeque().remove(candidate);
            }
            this.setWindowWeightedSize(this.windowWeightedSize() + weight);
            this.accessOrderWindowDeque().add(candidate);
            candidate.makeWindow();
        }
        this.setMainProtectedMaximum(this.mainProtectedMaximum() + quota);
        this.setWindowMaximum(this.windowMaximum() - quota);
        this.setAdjustment(quota);
    }
    
    @GuardedBy("evictionLock")
    void decreaseWindow() {
        if (this.windowMaximum() <= 1L) {
            return;
        }
        long quota = Math.min(-this.adjustment(), Math.max(0L, this.windowMaximum() - 1L));
        this.setMainProtectedMaximum(this.mainProtectedMaximum() + quota);
        this.setWindowMaximum(this.windowMaximum() - quota);
        for (int i = 0; i < 1000; ++i) {
            final Node<K, V> candidate = this.accessOrderWindowDeque().peek();
            if (candidate == null) {
                break;
            }
            final int weight = candidate.getPolicyWeight();
            if (quota < weight) {
                break;
            }
            quota -= weight;
            this.setWindowWeightedSize(this.windowWeightedSize() - weight);
            this.accessOrderWindowDeque().remove(candidate);
            this.accessOrderProbationDeque().add(candidate);
            candidate.makeMainProbation();
        }
        this.setMainProtectedMaximum(this.mainProtectedMaximum() - quota);
        this.setWindowMaximum(this.windowMaximum() + quota);
        this.setAdjustment(-quota);
    }
    
    @GuardedBy("evictionLock")
    void demoteFromMainProtected() {
        final long mainProtectedMaximum = this.mainProtectedMaximum();
        long mainProtectedWeightedSize = this.mainProtectedWeightedSize();
        if (mainProtectedWeightedSize <= mainProtectedMaximum) {
            return;
        }
        for (int i = 0; i < 1000; ++i) {
            if (mainProtectedWeightedSize <= mainProtectedMaximum) {
                break;
            }
            final Node<K, V> demoted = this.accessOrderProtectedDeque().poll();
            if (demoted == null) {
                break;
            }
            demoted.makeMainProbation();
            this.accessOrderProbationDeque().add(demoted);
            mainProtectedWeightedSize -= demoted.getPolicyWeight();
        }
        this.setMainProtectedWeightedSize(mainProtectedWeightedSize);
    }
    
    void afterRead(final Node<K, V> node, final long now, final boolean recordHit) {
        if (recordHit) {
            this.statsCounter().recordHits(1);
        }
        final boolean delayable = this.skipReadBuffer() || this.readBuffer.offer(node) != 1;
        if (this.shouldDrainBuffers(delayable)) {
            this.scheduleDrainBuffers();
        }
        this.refreshIfNeeded(node, now);
    }
    
    boolean skipReadBuffer() {
        return this.fastpath() && this.frequencySketch().isNotInitialized();
    }
    
    void refreshIfNeeded(final Node<K, V> node, final long now) {
        if (!this.refreshAfterWrite()) {
            return;
        }
        final long oldWriteTime = node.getWriteTime();
        final long refreshWriteTime = now + 6917529027641081854L;
        final K key;
        final V oldValue;
        if (now - oldWriteTime > this.refreshAfterWriteNanos() && (key = node.getKey()) != null && (oldValue = node.getValue()) != null && node.casWriteTime(oldWriteTime, refreshWriteTime)) {
            try {
                final long startTime = this.statsTicker().read();
                CompletableFuture<V> refreshFuture;
                if (this.isAsync) {
                    final CompletableFuture<V> future = (CompletableFuture<V>)oldValue;
                    if (!Async.isReady(future)) {
                        node.casWriteTime(refreshWriteTime, oldWriteTime);
                        return;
                    }
                    final CompletableFuture<V> refresh = refreshFuture = future.thenCompose(value -> this.cacheLoader.asyncReload((K)key, (V)value, this.executor));
                }
                else {
                    final CompletableFuture<V> refresh2 = refreshFuture = this.cacheLoader.asyncReload(key, oldValue, this.executor);
                }
                refreshFuture.whenComplete((newValue, error) -> {
                    final long loadTime = this.statsTicker().read() - startTime;
                    if (error != null) {
                        BoundedLocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", error);
                        node.casWriteTime(refreshWriteTime, oldWriteTime);
                        this.statsCounter().recordLoadFailure(loadTime);
                    }
                    else {
                        final V value2 = (V)((this.isAsync && newValue != null) ? refreshFuture : newValue);
                        final boolean[] discard = { false };
                        this.compute(key, (k, currentValue) -> {
                            if (currentValue == null) {
                                return (V)(V)value;
                            }
                            else if (currentValue == oldValue && node.getWriteTime() == refreshWriteTime) {
                                return (V)(V)value;
                            }
                            else {
                                discard[0] = true;
                                return (V)(V)currentValue;
                            }
                        }, false, false, true);
                        if (discard[0] && this.hasRemovalListener()) {
                            this.notifyRemoval(key, value2, RemovalCause.REPLACED);
                        }
                        if (newValue == null) {
                            this.statsCounter().recordLoadFailure(loadTime);
                        }
                        else {
                            this.statsCounter().recordLoadSuccess(loadTime);
                        }
                    }
                });
            }
            catch (final Throwable t) {
                node.casWriteTime(refreshWriteTime, oldWriteTime);
                BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when submitting refresh task", t);
            }
        }
    }
    
    long expireAfterCreate(final K key, final V value, final Expiry<K, V> expiry, final long now) {
        if (this.expiresVariable() && key != null && value != null) {
            final long duration = expiry.expireAfterCreate(key, value, now);
            return this.isAsync ? (now + duration) : (now + Math.min(duration, 4611686018427387903L));
        }
        return 0L;
    }
    
    long expireAfterUpdate(final Node<K, V> node, final K key, final V value, final Expiry<K, V> expiry, final long now) {
        if (this.expiresVariable() && key != null && value != null) {
            final long currentDuration = Math.max(1L, node.getVariableTime() - now);
            final long duration = expiry.expireAfterUpdate(key, value, now, currentDuration);
            return this.isAsync ? (now + duration) : (now + Math.min(duration, 4611686018427387903L));
        }
        return 0L;
    }
    
    long expireAfterRead(final Node<K, V> node, final K key, final V value, final Expiry<K, V> expiry, final long now) {
        if (this.expiresVariable() && key != null && value != null) {
            final long currentDuration = Math.max(1L, node.getVariableTime() - now);
            final long duration = expiry.expireAfterRead(key, value, now, currentDuration);
            return this.isAsync ? (now + duration) : (now + Math.min(duration, 4611686018427387903L));
        }
        return 0L;
    }
    
    void tryExpireAfterRead(final Node<K, V> node, final K key, final V value, final Expiry<K, V> expiry, final long now) {
        if (!this.expiresVariable() || key == null || value == null) {
            return;
        }
        final long variableTime = node.getVariableTime();
        final long currentDuration = Math.max(1L, variableTime - now);
        if (this.isAsync && currentDuration > 4611686018427387903L) {
            return;
        }
        final long duration = expiry.expireAfterRead(key, value, now, currentDuration);
        if (duration != currentDuration) {
            final long expirationTime = this.isAsync ? (now + duration) : (now + Math.min(duration, 4611686018427387903L));
            node.casVariableTime(variableTime, expirationTime);
        }
    }
    
    void setVariableTime(final Node<K, V> node, final long expirationTime) {
        if (this.expiresVariable()) {
            node.setVariableTime(expirationTime);
        }
    }
    
    void setWriteTime(final Node<K, V> node, final long now) {
        if (this.expiresAfterWrite() || this.refreshAfterWrite()) {
            node.setWriteTime(now);
        }
    }
    
    void setAccessTime(final Node<K, V> node, final long now) {
        if (this.expiresAfterAccess()) {
            node.setAccessTime(now);
        }
    }
    
    void afterWrite(final Runnable task) {
        if (this.buffersWrites()) {
            for (int i = 0; i < 100; ++i) {
                if (this.writeBuffer().offer(task)) {
                    this.scheduleAfterWrite();
                    return;
                }
                this.scheduleDrainBuffers();
            }
            try {
                this.performCleanUp(task);
            }
            catch (final RuntimeException e) {
                BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", e);
            }
        }
        else {
            this.scheduleAfterWrite();
        }
    }
    
    void scheduleAfterWrite() {
        do {
            switch (this.drainStatus()) {
                case 0: {
                    this.casDrainStatus(0, 1);
                    this.scheduleDrainBuffers();
                    return;
                }
                case 1: {
                    this.scheduleDrainBuffers();
                    return;
                }
                case 2: {
                    continue;
                }
                case 3: {
                    return;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        } while (!this.casDrainStatus(2, 3));
    }
    
    void scheduleDrainBuffers() {
        if (this.drainStatus() >= 2) {
            return;
        }
        if (this.evictionLock.tryLock()) {
            try {
                final int drainStatus = this.drainStatus();
                if (drainStatus >= 2) {
                    return;
                }
                this.lazySetDrainStatus(2);
                this.executor.execute(this.drainBuffersTask);
            }
            catch (final Throwable t) {
                BoundedLocalCache.logger.log(Level.WARNING, "Exception thrown when submitting maintenance task", t);
                this.maintenance(null);
            }
            finally {
                this.evictionLock.unlock();
            }
        }
    }
    
    public void cleanUp() {
        try {
            this.performCleanUp(null);
        }
        catch (final RuntimeException e) {
            BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", e);
        }
    }
    
    void performCleanUp(final Runnable task) {
        this.evictionLock.lock();
        try {
            this.maintenance(task);
        }
        finally {
            this.evictionLock.unlock();
        }
        if (this.drainStatus() == 1 && this.executor == ForkJoinPool.commonPool()) {
            this.scheduleDrainBuffers();
        }
    }
    
    @GuardedBy("evictionLock")
    void maintenance(final Runnable task) {
        this.lazySetDrainStatus(2);
        try {
            this.drainReadBuffer();
            this.drainWriteBuffer();
            if (task != null) {
                task.run();
            }
            this.drainKeyReferences();
            this.drainValueReferences();
            this.expireEntries();
            this.evictEntries();
            this.climb();
        }
        finally {
            if (this.drainStatus() != 2 || !this.casDrainStatus(2, 0)) {
                this.lazySetDrainStatus(1);
            }
        }
    }
    
    @GuardedBy("evictionLock")
    void drainKeyReferences() {
        if (!this.collectKeys()) {
            return;
        }
        Reference<? extends K> keyRef;
        while ((keyRef = this.keyReferenceQueue().poll()) != null) {
            final Node<K, V> node = this.data.get(keyRef);
            if (node != null) {
                this.evictEntry(node, RemovalCause.COLLECTED, 0L);
            }
        }
    }
    
    @GuardedBy("evictionLock")
    void drainValueReferences() {
        if (!this.collectValues()) {
            return;
        }
        Reference<? extends V> valueRef;
        while ((valueRef = this.valueReferenceQueue().poll()) != null) {
            final References.InternalReference<V> ref = (References.InternalReference<V>)valueRef;
            final Node<K, V> node = this.data.get(ref.getKeyReference());
            if (node != null && valueRef == node.getValueReference()) {
                this.evictEntry(node, RemovalCause.COLLECTED, 0L);
            }
        }
    }
    
    @GuardedBy("evictionLock")
    void drainReadBuffer() {
        if (!this.skipReadBuffer()) {
            this.readBuffer.drainTo(this.accessPolicy);
        }
    }
    
    @GuardedBy("evictionLock")
    void onAccess(final Node<K, V> node) {
        if (this.evicts()) {
            final K key = node.getKey();
            if (key == null) {
                return;
            }
            this.frequencySketch().increment(key);
            if (node.inWindow()) {
                reorder(this.accessOrderWindowDeque(), node);
            }
            else if (node.inMainProbation()) {
                this.reorderProbation(node);
            }
            else {
                reorder(this.accessOrderProtectedDeque(), node);
            }
            this.setHitsInSample(this.hitsInSample() + 1);
        }
        else if (this.expiresAfterAccess()) {
            reorder(this.accessOrderWindowDeque(), node);
        }
        if (this.expiresVariable()) {
            this.timerWheel().reschedule(node);
        }
    }
    
    @GuardedBy("evictionLock")
    void reorderProbation(final Node<K, V> node) {
        if (!this.accessOrderProbationDeque().contains(node)) {
            return;
        }
        if (node.getPolicyWeight() > this.mainProtectedMaximum()) {
            return;
        }
        this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() + node.getPolicyWeight());
        this.accessOrderProbationDeque().remove(node);
        this.accessOrderProtectedDeque().add(node);
        node.makeMainProtected();
    }
    
    static <K, V> void reorder(final LinkedDeque<Node<K, V>> deque, final Node<K, V> node) {
        if (deque.contains(node)) {
            deque.moveToBack(node);
        }
    }
    
    @GuardedBy("evictionLock")
    void drainWriteBuffer() {
        if (!this.buffersWrites()) {
            return;
        }
        for (int i = 0; i < BoundedLocalCache.WRITE_BUFFER_MAX; ++i) {
            final Runnable task = this.writeBuffer().poll();
            if (task == null) {
                return;
            }
            task.run();
        }
        this.lazySetDrainStatus(3);
    }
    
    @GuardedBy("evictionLock")
    void makeDead(final Node<K, V> node) {
        synchronized (node) {
            if (node.isDead()) {
                return;
            }
            if (this.evicts()) {
                if (node.inWindow()) {
                    this.setWindowWeightedSize(this.windowWeightedSize() - node.getWeight());
                }
                else if (node.inMainProtected()) {
                    this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - node.getWeight());
                }
                this.setWeightedSize(this.weightedSize() - node.getWeight());
            }
            node.die();
        }
    }
    
    public boolean isEmpty() {
        return this.data.isEmpty();
    }
    
    public int size() {
        return this.data.size();
    }
    
    public long estimatedSize() {
        return this.data.mappingCount();
    }
    
    public void clear() {
        this.evictionLock.lock();
        try {
            final long now = this.expirationTicker().read();
            Runnable task;
            while (this.buffersWrites() && (task = this.writeBuffer().poll()) != null) {
                task.run();
            }
            for (final Node<K, V> node : this.data.values()) {
                this.removeNode(node, now);
            }
            this.readBuffer.drainTo(e -> {});
        }
        finally {
            this.evictionLock.unlock();
        }
    }
    
    @GuardedBy("evictionLock")
    void removeNode(final Node<K, V> node, final long now) {
        final K key = node.getKey();
        final V[] value = (V[])new Object[] { null };
        final RemovalCause[] cause = { null };
        this.data.computeIfPresent(node.getKeyReference(), (k, n) -> {
            if (n != node) {
                return n;
            }
            else {
                synchronized (n) {
                    value[0] = n.getValue();
                    if (key == null || value[0] == null) {
                        cause[0] = RemovalCause.COLLECTED;
                    }
                    else if (this.hasExpired(n, now)) {
                        cause[0] = RemovalCause.EXPIRED;
                    }
                    else {
                        cause[0] = RemovalCause.EXPLICIT;
                    }
                    if (key != null) {
                        this.writer.delete((K)key, (V)value[0], cause[0]);
                    }
                    this.makeDead(n);
                    return null;
                }
            }
        });
        if (node.inWindow() && (this.evicts() || this.expiresAfterAccess())) {
            this.accessOrderWindowDeque().remove(node);
        }
        else if (this.evicts()) {
            if (node.inMainProbation()) {
                this.accessOrderProbationDeque().remove(node);
            }
            else {
                this.accessOrderProtectedDeque().remove(node);
            }
        }
        if (this.expiresAfterWrite()) {
            this.writeOrderDeque().remove(node);
        }
        else if (this.expiresVariable()) {
            this.timerWheel().deschedule(node);
        }
        if (cause[0] != null && this.hasRemovalListener()) {
            this.notifyRemoval(key, value[0], cause[0]);
        }
    }
    
    public boolean containsKey(final Object key) {
        final Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
        return node != null && node.getValue() != null && !this.hasExpired(node, this.expirationTicker().read());
    }
    
    public boolean containsValue(final Object value) {
        Objects.requireNonNull(value);
        final long now = this.expirationTicker().read();
        for (final Node<K, V> node : this.data.values()) {
            if (node.containsValue(value) && !this.hasExpired(node, now) && node.getKey() != null) {
                return true;
            }
        }
        return false;
    }
    
    public V get(final Object key) {
        return this.getIfPresent(key, false);
    }
    
    public V getIfPresent(final Object key, final boolean recordStats) {
        final Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
        if (node == null) {
            if (recordStats) {
                this.statsCounter().recordMisses(1);
            }
            if (this.drainStatus() == 1) {
                this.scheduleDrainBuffers();
            }
            return null;
        }
        final V value = node.getValue();
        final long now = this.expirationTicker().read();
        if (this.hasExpired(node, now) || (this.collectValues() && value == null)) {
            if (recordStats) {
                this.statsCounter().recordMisses(1);
            }
            this.scheduleDrainBuffers();
            return null;
        }
        if (!this.isComputingAsync(node)) {
            final K castedKey = (K)key;
            this.setAccessTime(node, now);
            this.tryExpireAfterRead(node, castedKey, value, this.expiry(), now);
        }
        this.afterRead(node, now, recordStats);
        return value;
    }
    
    public V getIfPresentQuietly(final Object key, final long[] writeTime) {
        final Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
        final V value;
        if (node == null || (value = node.getValue()) == null || this.hasExpired(node, this.expirationTicker().read())) {
            return null;
        }
        writeTime[0] = node.getWriteTime();
        return value;
    }
    
    public Map<K, V> getAllPresent(final Iterable<?> keys) {
        final Set<Object> uniqueKeys = new LinkedHashSet<Object>();
        for (final Object key : keys) {
            uniqueKeys.add(key);
        }
        int misses = 0;
        final long now = this.expirationTicker().read();
        final Map<Object, Object> result = new LinkedHashMap<Object, Object>(uniqueKeys.size());
        for (final Object key2 : uniqueKeys) {
            final Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key2));
            final V value;
            if (node == null || (value = node.getValue()) == null || this.hasExpired(node, now)) {
                ++misses;
            }
            else {
                result.put(key2, value);
                if (!this.isComputingAsync(node)) {
                    final K castedKey = (K)key2;
                    this.tryExpireAfterRead(node, castedKey, value, this.expiry(), now);
                    this.setAccessTime(node, now);
                }
                this.afterRead(node, now, false);
            }
        }
        this.statsCounter().recordMisses(misses);
        this.statsCounter().recordHits(result.size());
        final Map<K, V> castedResult = (Map<K, V>)result;
        return Collections.unmodifiableMap((Map<? extends K, ? extends V>)castedResult);
    }
    
    public V put(final K key, final V value) {
        return this.put(key, value, this.expiry(), true, false);
    }
    
    public V put(final K key, final V value, final boolean notifyWriter) {
        return this.put(key, value, this.expiry(), notifyWriter, false);
    }
    
    public V putIfAbsent(final K key, final V value) {
        return this.put(key, value, this.expiry(), true, true);
    }
    
    V put(final K key, final V value, final Expiry<K, V> expiry, final boolean notifyWriter, final boolean onlyIfAbsent) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        Node<K, V> node = null;
        final long now = this.expirationTicker().read();
        final int newWeight = this.weigher.weigh(key, value);
        while (true) {
            Node<K, V> prior = this.data.get(this.nodeFactory.newLookupKey(key));
            if (prior == null) {
                if (node == null) {
                    node = this.nodeFactory.newNode(key, this.keyReferenceQueue(), value, this.valueReferenceQueue(), newWeight, now);
                    this.setVariableTime(node, this.expireAfterCreate(key, value, expiry, now));
                }
                if (notifyWriter && this.hasWriter()) {
                    final Node<K, V> computed = node;
                    prior = this.data.computeIfAbsent(node.getKeyReference(), k -> {
                        this.writer.write((K)key, (V)value);
                        return computed;
                    });
                    if (prior == node) {
                        this.afterWrite(new AddTask(node, newWeight));
                        return null;
                    }
                }
                else {
                    prior = this.data.putIfAbsent(node.getKeyReference(), node);
                    if (prior == null) {
                        this.afterWrite(new AddTask(node, newWeight));
                        return null;
                    }
                }
            }
            else if (onlyIfAbsent) {
                final V currentValue = prior.getValue();
                if (currentValue != null && !this.hasExpired(prior, now)) {
                    if (!this.isComputingAsync(prior)) {
                        this.tryExpireAfterRead(prior, key, currentValue, this.expiry(), now);
                        this.setAccessTime(prior, now);
                    }
                    this.afterRead(prior, now, false);
                    return currentValue;
                }
            }
            boolean expired = false;
            boolean mayUpdate = true;
            boolean exceedsTolerance = false;
            final V oldValue;
            final int oldWeight;
            synchronized (prior) {
                if (!prior.isAlive()) {
                    continue;
                }
                oldValue = prior.getValue();
                oldWeight = prior.getWeight();
                long varTime;
                if (oldValue == null) {
                    varTime = this.expireAfterCreate(key, value, expiry, now);
                    this.writer.delete(key, null, RemovalCause.COLLECTED);
                }
                else if (this.hasExpired(prior, now)) {
                    expired = true;
                    varTime = this.expireAfterCreate(key, value, expiry, now);
                    this.writer.delete(key, oldValue, RemovalCause.EXPIRED);
                }
                else if (onlyIfAbsent) {
                    mayUpdate = false;
                    varTime = this.expireAfterRead(prior, key, value, expiry, now);
                }
                else {
                    varTime = this.expireAfterUpdate(prior, key, value, expiry, now);
                }
                if (notifyWriter && (expired || (mayUpdate && value != oldValue))) {
                    this.writer.write(key, value);
                }
                if (mayUpdate) {
                    exceedsTolerance = ((this.expiresAfterWrite() && now - prior.getWriteTime() > BoundedLocalCache.EXPIRE_WRITE_TOLERANCE) || (this.expiresVariable() && Math.abs(varTime - prior.getVariableTime()) > BoundedLocalCache.EXPIRE_WRITE_TOLERANCE));
                    this.setWriteTime(prior, now);
                    prior.setWeight(newWeight);
                    prior.setValue(value, this.valueReferenceQueue());
                }
                this.setVariableTime(prior, varTime);
                this.setAccessTime(prior, now);
            }
            if (this.hasRemovalListener()) {
                if (expired) {
                    this.notifyRemoval(key, oldValue, RemovalCause.EXPIRED);
                }
                else if (oldValue == null) {
                    this.notifyRemoval(key, null, RemovalCause.COLLECTED);
                }
                else if (mayUpdate && value != oldValue) {
                    this.notifyRemoval(key, oldValue, RemovalCause.REPLACED);
                }
            }
            final int weightedDifference = mayUpdate ? (newWeight - oldWeight) : 0;
            if (oldValue == null || weightedDifference != 0 || expired) {
                this.afterWrite(new UpdateTask(prior, weightedDifference));
            }
            else if (!onlyIfAbsent && exceedsTolerance) {
                this.afterWrite(new UpdateTask(prior, weightedDifference));
            }
            else {
                if (mayUpdate) {
                    this.setWriteTime(prior, now);
                }
                this.afterRead(prior, now, false);
            }
            return expired ? null : oldValue;
        }
    }
    
    public V remove(final Object key) {
        final K castKey = (K)key;
        final Node<K, V>[] node = { null };
        final V[] oldValue = (V[])new Object[] { null };
        final RemovalCause[] cause = { null };
        this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (k, n) -> {
            synchronized (n) {
                oldValue[0] = n.getValue();
                if (oldValue[0] == null) {
                    cause[0] = RemovalCause.COLLECTED;
                }
                else if (this.hasExpired(n, this.expirationTicker().read())) {
                    cause[0] = RemovalCause.EXPIRED;
                }
                else {
                    cause[0] = RemovalCause.EXPLICIT;
                }
                this.writer.delete((K)castKey, (V)oldValue[0], cause[0]);
                n.retire();
            }
            node[0] = n;
            return null;
        });
        if (cause[0] != null) {
            this.afterWrite(new RemovalTask(node[0]));
            if (this.hasRemovalListener()) {
                this.notifyRemoval(castKey, oldValue[0], cause[0]);
            }
        }
        return (cause[0] == RemovalCause.EXPLICIT) ? oldValue[0] : null;
    }
    
    public boolean remove(final Object key, final Object value) {
        Objects.requireNonNull(key);
        if (value == null) {
            return false;
        }
        final Node<K, V>[] removed = { null };
        final K[] oldKey = (K[])new Object[] { null };
        final V[] oldValue = (V[])new Object[] { null };
        final RemovalCause[] cause = { null };
        this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (kR, node) -> {
            synchronized (node) {
                oldKey[0] = node.getKey();
                oldValue[0] = node.getValue();
                if (oldKey[0] == null) {
                    cause[0] = RemovalCause.COLLECTED;
                }
                else if (this.hasExpired(node, this.expirationTicker().read())) {
                    cause[0] = RemovalCause.EXPIRED;
                }
                else if (node.containsValue(value)) {
                    cause[0] = RemovalCause.EXPLICIT;
                }
                else {
                    return node;
                }
                this.writer.delete((K)oldKey[0], (V)oldValue[0], cause[0]);
                (removed[0] = node).retire();
                return null;
            }
        });
        if (removed[0] == null) {
            return false;
        }
        if (this.hasRemovalListener()) {
            this.notifyRemoval(oldKey[0], oldValue[0], cause[0]);
        }
        this.afterWrite(new RemovalTask(removed[0]));
        return cause[0] == RemovalCause.EXPLICIT;
    }
    
    public V replace(final K key, final V value) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        final int[] oldWeight = { 0 };
        final K[] nodeKey = (K[])new Object[] { null };
        final V[] oldValue = (V[])new Object[] { null };
        final long[] now = { 0L };
        final int weight = this.weigher.weigh(key, value);
        final Node<K, V> node = this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (k, n) -> {
            synchronized (n) {
                nodeKey[0] = n.getKey();
                oldValue[0] = n.getValue();
                oldWeight[0] = n.getWeight();
                if (nodeKey[0] != null && oldValue[0] != null) {
                    this.expirationTicker().read();
                    final Object o;
                    final long now2;
                    now[o] = now2;
                    if (!this.hasExpired(n, now2)) {
                        final long varTime = this.expireAfterUpdate(n, key, value, this.expiry(), now[0]);
                        if (value != oldValue[0]) {
                            this.writer.write((K)nodeKey[0], (V)value);
                        }
                        n.setValue(value, this.valueReferenceQueue());
                        n.setWeight(weight);
                        this.setVariableTime(n, varTime);
                        this.setAccessTime(n, now[0]);
                        this.setWriteTime(n, now[0]);
                        return n;
                    }
                }
                oldValue[0] = null;
                return n;
            }
        });
        if (oldValue[0] == null) {
            return null;
        }
        final int weightedDifference = weight - oldWeight[0];
        if (this.expiresAfterWrite() || weightedDifference != 0) {
            this.afterWrite(new UpdateTask(node, weightedDifference));
        }
        else {
            this.afterRead(node, now[0], false);
        }
        if (this.hasRemovalListener() && value != oldValue[0]) {
            this.notifyRemoval(nodeKey[0], oldValue[0], RemovalCause.REPLACED);
        }
        return oldValue[0];
    }
    
    public boolean replace(final K key, final V oldValue, final V newValue) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(oldValue);
        Objects.requireNonNull(newValue);
        final int weight = this.weigher.weigh(key, newValue);
        final boolean[] replaced = { false };
        final K[] nodeKey = (K[])new Object[] { null };
        final V[] prevValue = (V[])new Object[] { null };
        final int[] oldWeight = { 0 };
        final long[] now = { 0L };
        final Node<K, V> node = this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (k, n) -> {
            synchronized (n) {
                nodeKey[0] = n.getKey();
                prevValue[0] = n.getValue();
                oldWeight[0] = n.getWeight();
                if (nodeKey[0] != null && prevValue[0] != null && n.containsValue(oldValue)) {
                    this.expirationTicker().read();
                    final Object o;
                    final long now2;
                    now[o] = now2;
                    if (!this.hasExpired(n, now2)) {
                        final long varTime = this.expireAfterUpdate(n, key, newValue, this.expiry(), now[0]);
                        if (newValue != prevValue[0]) {
                            this.writer.write((K)key, (V)newValue);
                        }
                        n.setValue(newValue, this.valueReferenceQueue());
                        n.setWeight(weight);
                        this.setVariableTime(n, varTime);
                        this.setAccessTime(n, now[0]);
                        this.setWriteTime(n, now[0]);
                        replaced[0] = true;
                        return n;
                    }
                }
                return n;
            }
            return n;
        });
        if (!replaced[0]) {
            return false;
        }
        final int weightedDifference = weight - oldWeight[0];
        if (this.expiresAfterWrite() || weightedDifference != 0) {
            this.afterWrite(new UpdateTask(node, weightedDifference));
        }
        else {
            this.afterRead(node, now[0], false);
        }
        if (this.hasRemovalListener() && oldValue != newValue) {
            this.notifyRemoval(nodeKey[0], prevValue[0], RemovalCause.REPLACED);
        }
        return true;
    }
    
    public void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
        Objects.requireNonNull(function);
        K key = null;
        final BiFunction<K, V, V> remappingFunction = (BiFunction<K, V, V>)((key, oldValue) -> {
            final V newValue = Objects.requireNonNull(function.apply(key, oldValue));
            if (oldValue != newValue) {
                this.writer.write((K)key, newValue);
            }
            return newValue;
        });
        final Iterator<K> iterator = this.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            final long[] now = { this.expirationTicker().read() };
            final Object lookupKey = this.nodeFactory.newLookupKey(key);
            this.remap(key, lookupKey, (BiFunction<? super K, ? super V, ? extends V>)remappingFunction, now, false);
        }
    }
    
    public V computeIfAbsent(final K key, Function<? super K, ? extends V> mappingFunction, final boolean recordStats, final boolean recordLoad) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(mappingFunction);
        final long now = this.expirationTicker().read();
        final Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
        if (node != null) {
            final V value = node.getValue();
            if (value != null && !this.hasExpired(node, now)) {
                if (!this.isComputingAsync(node)) {
                    this.tryExpireAfterRead(node, key, value, this.expiry(), now);
                    this.setAccessTime(node, now);
                }
                this.afterRead(node, now, recordStats);
                return value;
            }
        }
        if (recordStats) {
            mappingFunction = (Function<? super K, ? extends V>)this.statsAware((Function<? super Object, ?>)mappingFunction, recordLoad);
        }
        final Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
        return this.doComputeIfAbsent(key, keyRef, mappingFunction, new long[] { now }, recordStats);
    }
    
    V doComputeIfAbsent(final K key, final Object keyRef, final Function<? super K, ? extends V> mappingFunction, final long[] now, final boolean recordStats) {
        final V[] oldValue = (V[])new Object[] { null };
        final V[] newValue = (V[])new Object[] { null };
        final K[] nodeKey = (K[])new Object[] { null };
        final Node<K, V>[] removed = { null };
        final int[] weight = new int[2];
        final RemovalCause[] cause = { null };
        final Node<K, V> node = this.data.compute(keyRef, (k, n) -> {
            if (n == null) {
                newValue[0] = mappingFunction.apply(key);
                if (newValue[0] == null) {
                    return null;
                }
                else {
                    now[0] = this.expirationTicker().read();
                    weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                    n = this.nodeFactory.newNode((K)key, this.keyReferenceQueue(), (V)newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
                    this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                    return n;
                }
            }
            else {
                synchronized (n) {
                    nodeKey[0] = n.getKey();
                    weight[0] = n.getWeight();
                    oldValue[0] = n.getValue();
                    if (nodeKey[0] == null || oldValue[0] == null) {
                        cause[0] = RemovalCause.COLLECTED;
                    }
                    else if (this.hasExpired(n, now[0])) {
                        cause[0] = RemovalCause.EXPIRED;
                    }
                    else {
                        return n;
                    }
                    this.writer.delete((K)nodeKey[0], (V)oldValue[0], cause[0]);
                    newValue[0] = mappingFunction.apply(key);
                    if (newValue[0] == null) {
                        (removed[0] = n).retire();
                        return null;
                    }
                    else {
                        weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                        n.setValue(newValue[0], this.valueReferenceQueue());
                        n.setWeight(weight[1]);
                        now[0] = this.expirationTicker().read();
                        this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                        this.setAccessTime(n, now[0]);
                        this.setWriteTime(n, now[0]);
                        return n;
                    }
                }
            }
        });
        if (node == null) {
            if (removed[0] != null) {
                this.afterWrite(new RemovalTask(removed[0]));
            }
            return null;
        }
        if (cause[0] != null) {
            if (this.hasRemovalListener()) {
                this.notifyRemoval(nodeKey[0], oldValue[0], cause[0]);
            }
            this.statsCounter().recordEviction(weight[0], cause[0]);
        }
        if (newValue[0] == null) {
            if (!this.isComputingAsync(node)) {
                this.tryExpireAfterRead(node, key, oldValue[0], this.expiry(), now[0]);
                this.setAccessTime(node, now[0]);
            }
            this.afterRead(node, now[0], recordStats);
            return oldValue[0];
        }
        if (oldValue[0] == null && cause[0] == null) {
            this.afterWrite(new AddTask(node, weight[1]));
        }
        else {
            final int weightedDifference = weight[1] - weight[0];
            this.afterWrite(new UpdateTask(node, weightedDifference));
        }
        return newValue[0];
    }
    
    public V computeIfPresent(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(remappingFunction);
        final Object lookupKey = this.nodeFactory.newLookupKey(key);
        final Node<K, V> node = this.data.get(lookupKey);
        if (node == null) {
            return null;
        }
        final long now;
        if (node.getValue() == null || this.hasExpired(node, now = this.expirationTicker().read())) {
            this.scheduleDrainBuffers();
            return null;
        }
        final BiFunction<? super K, ? super V, ? extends V> statsAwareRemappingFunction = (BiFunction<? super K, ? super V, ? extends V>)this.statsAware((BiFunction<? super Object, ? super Object, ?>)remappingFunction, false, true, true);
        return this.remap(key, lookupKey, statsAwareRemappingFunction, new long[] { now }, false);
    }
    
    public V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction, final boolean recordMiss, final boolean recordLoad, final boolean recordLoadFailure) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(remappingFunction);
        final long[] now = { this.expirationTicker().read() };
        final Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
        final BiFunction<? super K, ? super V, ? extends V> statsAwareRemappingFunction = (BiFunction<? super K, ? super V, ? extends V>)this.statsAware((BiFunction<? super Object, ? super Object, ?>)remappingFunction, recordMiss, recordLoad, recordLoadFailure);
        return this.remap(key, keyRef, statsAwareRemappingFunction, now, true);
    }
    
    public V merge(final K key, final V value, final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        Objects.requireNonNull(remappingFunction);
        final long[] now = { this.expirationTicker().read() };
        final Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
        final BiFunction<? super K, ? super V, ? extends V> mergeFunction = (BiFunction<? super K, ? super V, ? extends V>)((k, oldValue) -> (oldValue == null) ? value : this.statsAware((BiFunction<? super Object, ? super Object, ?>)remappingFunction).apply(oldValue, value));
        return this.remap(key, keyRef, mergeFunction, now, true);
    }
    
    V remap(final K key, final Object keyRef, final BiFunction<? super K, ? super V, ? extends V> remappingFunction, final long[] now, final boolean computeIfAbsent) {
        final K[] nodeKey = (K[])new Object[] { null };
        final V[] oldValue = (V[])new Object[] { null };
        final V[] newValue = (V[])new Object[] { null };
        final Node<K, V>[] removed = { null };
        final int[] weight = new int[2];
        final RemovalCause[] cause = { null };
        final Node<K, V> node = this.data.compute(keyRef, (kr, n) -> {
            if (n == null) {
                if (!computeIfAbsent) {
                    return null;
                }
                else {
                    newValue[0] = remappingFunction.apply(key, null);
                    if (newValue[0] == null) {
                        return null;
                    }
                    else {
                        now[0] = this.expirationTicker().read();
                        weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                        n = this.nodeFactory.newNode(keyRef, (V)newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
                        this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                        return n;
                    }
                }
            }
            else {
                synchronized (n) {
                    nodeKey[0] = n.getKey();
                    oldValue[0] = n.getValue();
                    if (nodeKey[0] == null || oldValue[0] == null) {
                        cause[0] = RemovalCause.COLLECTED;
                    }
                    else if (this.hasExpired(n, now[0])) {
                        cause[0] = RemovalCause.EXPIRED;
                    }
                    if (cause[0] != null) {
                        this.writer.delete((K)nodeKey[0], (V)oldValue[0], cause[0]);
                        if (!computeIfAbsent) {
                            (removed[0] = n).retire();
                            return null;
                        }
                    }
                    newValue[0] = remappingFunction.apply(nodeKey[0], (cause[0] == null) ? oldValue[0] : null);
                    if (newValue[0] == null) {
                        if (cause[0] == null) {
                            cause[0] = RemovalCause.EXPLICIT;
                        }
                        (removed[0] = n).retire();
                        return null;
                    }
                    else {
                        weight[0] = n.getWeight();
                        weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                        now[0] = this.expirationTicker().read();
                        if (cause[0] == null) {
                            if (newValue[0] != oldValue[0]) {
                                cause[0] = RemovalCause.REPLACED;
                            }
                            this.setVariableTime(n, this.expireAfterUpdate(n, key, newValue[0], this.expiry(), now[0]));
                        }
                        else {
                            this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                        }
                        n.setValue(newValue[0], this.valueReferenceQueue());
                        n.setWeight(weight[1]);
                        this.setAccessTime(n, now[0]);
                        this.setWriteTime(n, now[0]);
                        return n;
                    }
                }
            }
        });
        if (cause[0] != null) {
            if (cause[0].wasEvicted()) {
                this.statsCounter().recordEviction(weight[0], cause[0]);
            }
            if (this.hasRemovalListener()) {
                this.notifyRemoval(nodeKey[0], oldValue[0], cause[0]);
            }
        }
        if (removed[0] != null) {
            this.afterWrite(new RemovalTask(removed[0]));
        }
        else if (node != null) {
            if (oldValue[0] == null && cause[0] == null) {
                this.afterWrite(new AddTask(node, weight[1]));
            }
            else {
                final int weightedDifference = weight[1] - weight[0];
                if (this.expiresAfterWrite() || weightedDifference != 0) {
                    this.afterWrite(new UpdateTask(node, weightedDifference));
                }
                else {
                    if (cause[0] == null) {
                        if (!this.isComputingAsync(node)) {
                            this.tryExpireAfterRead(node, key, newValue[0], this.expiry(), now[0]);
                            this.setAccessTime(node, now[0]);
                        }
                    }
                    else if (cause[0] == RemovalCause.COLLECTED) {
                        this.scheduleDrainBuffers();
                    }
                    this.afterRead(node, now[0], false);
                }
            }
        }
        return newValue[0];
    }
    
    public Set<K> keySet() {
        final Set<K> ks = this.keySet;
        return (ks == null) ? (this.keySet = (Set<K>)new BoundedLocalCache.KeySetView(this)) : ks;
    }
    
    public Collection<V> values() {
        final Collection<V> vs = this.values;
        return (vs == null) ? (this.values = (Collection<V>)new BoundedLocalCache.ValuesView(this)) : vs;
    }
    
    public Set<Map.Entry<K, V>> entrySet() {
        final Set<Map.Entry<K, V>> es = this.entrySet;
        return (es == null) ? (this.entrySet = (Set<Map.Entry<K, V>>)new BoundedLocalCache.EntrySetView(this)) : es;
    }
    
    Map<K, V> evictionOrder(final int limit, final Function<V, V> transformer, final boolean hottest) {
        final Supplier<Iterator<Node<K, V>>> iteratorSupplier = (Supplier<Iterator<Node<K, V>>>)(() -> {
            final Comparator<Node<K, V>> comparator = Comparator.comparingInt(node -> {
                final K key = node.getKey();
                return (key == null) ? 0 : this.frequencySketch().frequency(key);
            });
            if (hottest) {
                final LinkedDeque.PeekingIterator<Node<K, V>> secondary = LinkedDeque.PeekingIterator.comparing(this.accessOrderProbationDeque().descendingIterator(), this.accessOrderWindowDeque().descendingIterator(), comparator);
                return LinkedDeque.PeekingIterator.concat(this.accessOrderProtectedDeque().descendingIterator(), secondary);
            }
            else {
                final LinkedDeque.PeekingIterator<Node<K, V>> primary = LinkedDeque.PeekingIterator.comparing(this.accessOrderWindowDeque().iterator(), this.accessOrderProbationDeque().iterator(), comparator.reversed());
                return LinkedDeque.PeekingIterator.concat(primary, this.accessOrderProtectedDeque().iterator());
            }
        });
        return this.fixedSnapshot(iteratorSupplier, limit, transformer);
    }
    
    Map<K, V> expireAfterAccessOrder(final int limit, final Function<V, V> transformer, final boolean oldest) {
        if (!this.evicts()) {
            final Supplier<Iterator<Node<K, V>>> iteratorSupplier = (Supplier<Iterator<Node<K, V>>>)(() -> oldest ? this.accessOrderWindowDeque().iterator() : this.accessOrderWindowDeque().descendingIterator());
            return this.fixedSnapshot(iteratorSupplier, limit, transformer);
        }
        final Supplier<Iterator<Node<K, V>>> iteratorSupplier = (Supplier<Iterator<Node<K, V>>>)(() -> {
            Comparator<Node<K, V>> comparator = Comparator.comparingLong(Node::getAccessTime);
            LinkedDeque.PeekingIterator<Node<K, V>> first;
            LinkedDeque.PeekingIterator<Node<K, V>> second;
            LinkedDeque.PeekingIterator<Node<K, V>> third;
            if (oldest) {
                first = this.accessOrderWindowDeque().iterator();
                second = this.accessOrderProbationDeque().iterator();
                third = this.accessOrderProtectedDeque().iterator();
            }
            else {
                comparator = comparator.reversed();
                first = this.accessOrderWindowDeque().descendingIterator();
                second = this.accessOrderProbationDeque().descendingIterator();
                third = this.accessOrderProtectedDeque().descendingIterator();
            }
            return LinkedDeque.PeekingIterator.comparing(LinkedDeque.PeekingIterator.comparing(first, second, comparator), third, comparator);
        });
        return this.fixedSnapshot(iteratorSupplier, limit, transformer);
    }
    
    Map<K, V> expireAfterWriteOrder(final int limit, final Function<V, V> transformer, final boolean oldest) {
        final Supplier<Iterator<Node<K, V>>> iteratorSupplier = (Supplier<Iterator<Node<K, V>>>)(() -> oldest ? this.writeOrderDeque().iterator() : this.writeOrderDeque().descendingIterator());
        return this.fixedSnapshot(iteratorSupplier, limit, transformer);
    }
    
    Map<K, V> fixedSnapshot(final Supplier<Iterator<Node<K, V>>> iteratorSupplier, final int limit, final Function<V, V> transformer) {
        Caffeine.requireArgument(limit >= 0);
        this.evictionLock.lock();
        try {
            this.maintenance(null);
            final int initialCapacity = Math.min(limit, this.size());
            final Iterator<Node<K, V>> iterator = iteratorSupplier.get();
            final Map<K, V> map = new LinkedHashMap<K, V>(initialCapacity);
            while (map.size() < limit && iterator.hasNext()) {
                final Node<K, V> node = iterator.next();
                final K key = node.getKey();
                final V value = transformer.apply(node.getValue());
                if (key != null && value != null && node.isAlive()) {
                    map.put(key, value);
                }
            }
            return Collections.unmodifiableMap((Map<? extends K, ? extends V>)map);
        }
        finally {
            this.evictionLock.unlock();
        }
    }
    
    Map<K, V> variableSnapshot(final boolean ascending, final int limit, final Function<V, V> transformer) {
        this.evictionLock.lock();
        try {
            this.maintenance(null);
            return this.timerWheel().snapshot(ascending, limit, transformer);
        }
        finally {
            this.evictionLock.unlock();
        }
    }
    
    static <K, V> SerializationProxy<K, V> makeSerializationProxy(final BoundedLocalCache<?, ?> cache, final boolean isWeighted) {
        final SerializationProxy<K, V> proxy = (SerializationProxy<K, V>)new SerializationProxy();
        proxy.weakKeys = cache.collectKeys();
        proxy.weakValues = cache.nodeFactory.weakValues();
        proxy.softValues = cache.nodeFactory.softValues();
        proxy.isRecordingStats = cache.isRecordingStats();
        proxy.removalListener = cache.removalListener();
        proxy.ticker = cache.expirationTicker();
        proxy.writer = cache.writer;
        if (cache.expiresAfterAccess()) {
            proxy.expiresAfterAccessNanos = cache.expiresAfterAccessNanos();
        }
        if (cache.expiresAfterWrite()) {
            proxy.expiresAfterWriteNanos = cache.expiresAfterWriteNanos();
        }
        if (cache.expiresVariable()) {
            proxy.expiry = cache.expiry();
        }
        if (cache.evicts()) {
            if (isWeighted) {
                proxy.weigher = cache.weigher;
                proxy.maximumWeight = cache.maximum();
            }
            else {
                proxy.maximumSize = cache.maximum();
            }
        }
        return proxy;
    }
    
    private /* synthetic */ Iterator lambda$expireAfterWriteOrder$21(final boolean oldest) {
        return oldest ? this.writeOrderDeque().iterator() : this.writeOrderDeque().descendingIterator();
    }
    
    private /* synthetic */ Iterator lambda$expireAfterAccessOrder$20(final boolean oldest) {
        Comparator<Node<K, V>> comparator = Comparator.comparingLong(Node::getAccessTime);
        LinkedDeque.PeekingIterator<Node<K, V>> first;
        LinkedDeque.PeekingIterator<Node<K, V>> second;
        LinkedDeque.PeekingIterator<Node<K, V>> third;
        if (oldest) {
            first = this.accessOrderWindowDeque().iterator();
            second = this.accessOrderProbationDeque().iterator();
            third = this.accessOrderProtectedDeque().iterator();
        }
        else {
            comparator = comparator.reversed();
            first = this.accessOrderWindowDeque().descendingIterator();
            second = this.accessOrderProbationDeque().descendingIterator();
            third = this.accessOrderProtectedDeque().descendingIterator();
        }
        return LinkedDeque.PeekingIterator.comparing(LinkedDeque.PeekingIterator.comparing(first, second, comparator), third, comparator);
    }
    
    private /* synthetic */ Iterator lambda$expireAfterAccessOrder$19(final boolean oldest) {
        return oldest ? this.accessOrderWindowDeque().iterator() : this.accessOrderWindowDeque().descendingIterator();
    }
    
    private /* synthetic */ Iterator lambda$evictionOrder$18(final boolean hottest) {
        final Comparator<Node<K, V>> comparator = Comparator.comparingInt(node -> {
            final K key = node.getKey();
            return (key == null) ? 0 : this.frequencySketch().frequency(key);
        });
        if (hottest) {
            final LinkedDeque.PeekingIterator<Node<K, V>> secondary = LinkedDeque.PeekingIterator.comparing(this.accessOrderProbationDeque().descendingIterator(), this.accessOrderWindowDeque().descendingIterator(), comparator);
            return LinkedDeque.PeekingIterator.concat(this.accessOrderProtectedDeque().descendingIterator(), secondary);
        }
        final LinkedDeque.PeekingIterator<Node<K, V>> primary = LinkedDeque.PeekingIterator.comparing(this.accessOrderWindowDeque().iterator(), this.accessOrderProbationDeque().iterator(), comparator.reversed());
        return LinkedDeque.PeekingIterator.concat(primary, this.accessOrderProtectedDeque().iterator());
    }
    
    private /* synthetic */ int lambda$evictionOrder$17(final Node node) {
        final K key = node.getKey();
        return (key == null) ? 0 : this.frequencySketch().frequency(key);
    }
    
    private /* synthetic */ Node lambda$remap$16(final boolean computeIfAbsent, final Object[] newValue, final BiFunction remappingFunction, final Object key, final long[] now, final int[] weight, final Object keyRef, final Object[] nodeKey, final Object[] oldValue, final RemovalCause[] cause, final Node[] removed, final Object kr, Node n) {
        if (n == null) {
            if (!computeIfAbsent) {
                return null;
            }
            newValue[0] = remappingFunction.apply(key, null);
            if (newValue[0] == null) {
                return null;
            }
            now[0] = this.expirationTicker().read();
            weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
            n = this.nodeFactory.newNode(keyRef, (V)newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
            this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
            return n;
        }
        else {
            synchronized (n) {
                nodeKey[0] = n.getKey();
                oldValue[0] = n.getValue();
                if (nodeKey[0] == null || oldValue[0] == null) {
                    cause[0] = RemovalCause.COLLECTED;
                }
                else if (this.hasExpired(n, now[0])) {
                    cause[0] = RemovalCause.EXPIRED;
                }
                if (cause[0] != null) {
                    this.writer.delete((K)nodeKey[0], (V)oldValue[0], cause[0]);
                    if (!computeIfAbsent) {
                        (removed[0] = n).retire();
                        return null;
                    }
                }
                newValue[0] = remappingFunction.apply(nodeKey[0], (cause[0] == null) ? oldValue[0] : null);
                if (newValue[0] == null) {
                    if (cause[0] == null) {
                        cause[0] = RemovalCause.EXPLICIT;
                    }
                    (removed[0] = n).retire();
                    return null;
                }
                weight[0] = n.getWeight();
                weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                now[0] = this.expirationTicker().read();
                if (cause[0] == null) {
                    if (newValue[0] != oldValue[0]) {
                        cause[0] = RemovalCause.REPLACED;
                    }
                    this.setVariableTime(n, this.expireAfterUpdate(n, key, newValue[0], this.expiry(), now[0]));
                }
                else {
                    this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                }
                n.setValue(newValue[0], this.valueReferenceQueue());
                n.setWeight(weight[1]);
                this.setAccessTime(n, now[0]);
                this.setWriteTime(n, now[0]);
                return n;
            }
        }
    }
    
    private /* synthetic */ Object lambda$merge$15(final Object value, final BiFunction remappingFunction, final Object k, final Object oldValue) {
        return (oldValue == null) ? value : this.statsAware((BiFunction<? super Object, ? super Object, ?>)remappingFunction).apply(oldValue, value);
    }
    
    private /* synthetic */ Node lambda$doComputeIfAbsent$14(final Object[] newValue, final Function mappingFunction, final Object key, final long[] now, final int[] weight, final Object[] nodeKey, final Object[] oldValue, final RemovalCause[] cause, final Node[] removed, final Object k, Node n) {
        if (n == null) {
            newValue[0] = mappingFunction.apply(key);
            if (newValue[0] == null) {
                return null;
            }
            now[0] = this.expirationTicker().read();
            weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
            n = this.nodeFactory.newNode((K)key, this.keyReferenceQueue(), (V)newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
            this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
            return n;
        }
        else {
            synchronized (n) {
                nodeKey[0] = n.getKey();
                weight[0] = n.getWeight();
                oldValue[0] = n.getValue();
                if (nodeKey[0] == null || oldValue[0] == null) {
                    cause[0] = RemovalCause.COLLECTED;
                }
                else {
                    if (!this.hasExpired(n, now[0])) {
                        return n;
                    }
                    cause[0] = RemovalCause.EXPIRED;
                }
                this.writer.delete((K)nodeKey[0], (V)oldValue[0], cause[0]);
                newValue[0] = mappingFunction.apply(key);
                if (newValue[0] == null) {
                    (removed[0] = n).retire();
                    return null;
                }
                weight[1] = this.weigher.weigh((K)key, (V)newValue[0]);
                n.setValue(newValue[0], this.valueReferenceQueue());
                n.setWeight(weight[1]);
                now[0] = this.expirationTicker().read();
                this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                this.setAccessTime(n, now[0]);
                this.setWriteTime(n, now[0]);
                return n;
            }
        }
    }
    
    private /* synthetic */ Object lambda$replaceAll$13(final BiFunction function, final Object key, final Object oldValue) {
        final V newValue = Objects.requireNonNull(function.apply(key, oldValue));
        if (oldValue != newValue) {
            this.writer.write((K)key, newValue);
        }
        return newValue;
    }
    
    private /* synthetic */ Node lambda$replace$12(final Object[] nodeKey, final Object[] prevValue, final int[] oldWeight, final Object oldValue, final long[] now, final Object key, final Object newValue, final int weight, final boolean[] replaced, final Object k, final Node n) {
        synchronized (n) {
            nodeKey[0] = n.getKey();
            prevValue[0] = n.getValue();
            oldWeight[0] = n.getWeight();
            if (nodeKey[0] != null && prevValue[0] != null && n.containsValue(oldValue)) {
                final int n2 = 0;
                final long read = this.expirationTicker().read();
                now[n2] = read;
                if (!this.hasExpired(n, read)) {
                    final long varTime = this.expireAfterUpdate(n, key, newValue, this.expiry(), now[0]);
                    if (newValue != prevValue[0]) {
                        this.writer.write((K)key, (V)newValue);
                    }
                    n.setValue(newValue, this.valueReferenceQueue());
                    n.setWeight(weight);
                    this.setVariableTime(n, varTime);
                    this.setAccessTime(n, now[0]);
                    this.setWriteTime(n, now[0]);
                    replaced[0] = true;
                    return n;
                }
            }
            return n;
        }
        return n;
    }
    
    private /* synthetic */ Node lambda$replace$11(final Object[] nodeKey, final Object[] oldValue, final int[] oldWeight, final long[] now, final Object key, final Object value, final int weight, final Object k, final Node n) {
        synchronized (n) {
            nodeKey[0] = n.getKey();
            oldValue[0] = n.getValue();
            oldWeight[0] = n.getWeight();
            if (nodeKey[0] != null && oldValue[0] != null) {
                final int n2 = 0;
                final long read = this.expirationTicker().read();
                now[n2] = read;
                if (!this.hasExpired(n, read)) {
                    final long varTime = this.expireAfterUpdate(n, key, value, this.expiry(), now[0]);
                    if (value != oldValue[0]) {
                        this.writer.write((K)nodeKey[0], (V)value);
                    }
                    n.setValue(value, this.valueReferenceQueue());
                    n.setWeight(weight);
                    this.setVariableTime(n, varTime);
                    this.setAccessTime(n, now[0]);
                    this.setWriteTime(n, now[0]);
                    return n;
                }
            }
            oldValue[0] = null;
            return n;
        }
    }
    
    private /* synthetic */ Node lambda$remove$10(final Object[] oldKey, final Object[] oldValue, final RemovalCause[] cause, final Object value, final Node[] removed, final Object kR, final Node node) {
        synchronized (node) {
            oldKey[0] = node.getKey();
            oldValue[0] = node.getValue();
            if (oldKey[0] == null) {
                cause[0] = RemovalCause.COLLECTED;
            }
            else if (this.hasExpired(node, this.expirationTicker().read())) {
                cause[0] = RemovalCause.EXPIRED;
            }
            else {
                if (!node.containsValue(value)) {
                    return node;
                }
                cause[0] = RemovalCause.EXPLICIT;
            }
            this.writer.delete((K)oldKey[0], (V)oldValue[0], cause[0]);
            (removed[0] = node).retire();
            return null;
        }
    }
    
    private /* synthetic */ Node lambda$remove$9(final Object[] oldValue, final RemovalCause[] cause, final Object castKey, final Node[] node, final Object k, final Node n) {
        synchronized (n) {
            oldValue[0] = n.getValue();
            if (oldValue[0] == null) {
                cause[0] = RemovalCause.COLLECTED;
            }
            else if (this.hasExpired(n, this.expirationTicker().read())) {
                cause[0] = RemovalCause.EXPIRED;
            }
            else {
                cause[0] = RemovalCause.EXPLICIT;
            }
            this.writer.delete((K)castKey, (V)oldValue[0], cause[0]);
            n.retire();
        }
        node[0] = n;
        return null;
    }
    
    private /* synthetic */ Node lambda$put$8(final Object key, final Object value, final Node computed, final Object k) {
        this.writer.write((K)key, (V)value);
        return computed;
    }
    
    private /* synthetic */ Node lambda$removeNode$7(final Node node, final Object[] value, final Object key, final RemovalCause[] cause, final long now, final Object k, final Node n) {
        if (n != node) {
            return n;
        }
        synchronized (n) {
            value[0] = n.getValue();
            if (key == null || value[0] == null) {
                cause[0] = RemovalCause.COLLECTED;
            }
            else if (this.hasExpired(n, now)) {
                cause[0] = RemovalCause.EXPIRED;
            }
            else {
                cause[0] = RemovalCause.EXPLICIT;
            }
            if (key != null) {
                this.writer.delete((K)key, (V)value[0], cause[0]);
            }
            this.makeDead(n);
            return null;
        }
    }
    
    private static /* synthetic */ void lambda$clear$6(final Node e) {
    }
    
    private /* synthetic */ void lambda$refreshIfNeeded$5(final long startTime, final Node node, final long refreshWriteTime, final long oldWriteTime, final CompletableFuture refreshFuture, final Object key, final Object oldValue, final Object newValue, final Throwable error) {
        final long loadTime = this.statsTicker().read() - startTime;
        if (error != null) {
            BoundedLocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", error);
            node.casWriteTime(refreshWriteTime, oldWriteTime);
            this.statsCounter().recordLoadFailure(loadTime);
            return;
        }
        final V value = (V)((this.isAsync && newValue != null) ? refreshFuture : newValue);
        final boolean[] discard = { false };
        this.compute(key, (k, currentValue) -> {
            if (currentValue == null) {
                return value;
            }
            else if (currentValue == oldValue && node.getWriteTime() == refreshWriteTime) {
                return value;
            }
            else {
                discard[0] = true;
                return currentValue;
            }
        }, false, false, true);
        if (discard[0] && this.hasRemovalListener()) {
            this.notifyRemoval(key, value, RemovalCause.REPLACED);
        }
        if (newValue == null) {
            this.statsCounter().recordLoadFailure(loadTime);
        }
        else {
            this.statsCounter().recordLoadSuccess(loadTime);
        }
    }
    
    private static /* synthetic */ Object lambda$refreshIfNeeded$4(final Object value, final Object oldValue, final Node node, final long refreshWriteTime, final boolean[] discard, final Object k, final Object currentValue) {
        if (currentValue == null) {
            return value;
        }
        if (currentValue == oldValue && node.getWriteTime() == refreshWriteTime) {
            return value;
        }
        discard[0] = true;
        return currentValue;
    }
    
    private /* synthetic */ CompletionStage lambda$refreshIfNeeded$3(final Object key, final Object value) {
        return this.cacheLoader.asyncReload((K)key, (V)value, this.executor);
    }
    
    private /* synthetic */ Node lambda$evictEntry$2(final Node node, final Object[] value, final RemovalCause[] actualCause, final Object key, final RemovalCause cause, final long now, final boolean[] resurrect, final boolean[] removed, final Object k, final Node n) {
        if (n != node) {
            return n;
        }
        synchronized (n) {
            value[0] = n.getValue();
            actualCause[0] = ((key == null || value[0] == null) ? RemovalCause.COLLECTED : cause);
            if (actualCause[0] == RemovalCause.EXPIRED) {
                boolean expired = false;
                if (this.expiresAfterAccess()) {
                    expired = (false | now - n.getAccessTime() >= this.expiresAfterAccessNanos());
                }
                if (this.expiresAfterWrite()) {
                    expired |= (now - n.getWriteTime() >= this.expiresAfterWriteNanos());
                }
                if (this.expiresVariable()) {
                    expired |= (n.getVariableTime() <= now);
                }
                if (!expired) {
                    resurrect[0] = true;
                    return n;
                }
            }
            else if (actualCause[0] == RemovalCause.SIZE) {
                final int weight = node.getWeight();
                if (weight == 0) {
                    resurrect[0] = true;
                    return n;
                }
            }
            this.writer.delete((K)key, (V)value[0], actualCause[0]);
            this.makeDead(n);
        }
        removed[0] = true;
        return null;
    }
    
    private /* synthetic */ void lambda$notifyRemoval$1(final Object key, final Object value, final RemovalCause cause) {
        try {
            this.removalListener().onRemoval((K)key, (V)value, cause);
        }
        catch (final Throwable t) {
            BoundedLocalCache.logger.log(Level.WARNING, "Exception thrown by removal listener", t);
        }
    }
    
    private static /* synthetic */ void lambda$new$0(final Node e) {
    }
    
    static {
        logger = Logger.getLogger(BoundedLocalCache.class.getName());
        NCPU = Runtime.getRuntime().availableProcessors();
        WRITE_BUFFER_MAX = 128 * Caffeine.ceilingPowerOfTwo(BoundedLocalCache.NCPU);
        EXPIRE_WRITE_TOLERANCE = TimeUnit.SECONDS.toNanos(1L);
    }
    
    final class AddTask implements Runnable
    {
        final Node<K, V> node;
        final int weight;
        final /* synthetic */ BoundedLocalCache this$0;
        
        AddTask(final BoundedLocalCache this$0, final Node<K, V> node, final int weight) {
            this.this$0 = this$0;
            super();
            this.weight = weight;
            this.node = node;
        }
        
        @GuardedBy("evictionLock")
        @Override
        public void run() {
            if (this.this$0.evicts()) {
                final long weightedSize = this.this$0.weightedSize();
                this.this$0.setWeightedSize(weightedSize + this.weight);
                this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.weight);
                this.node.setPolicyWeight(this.node.getPolicyWeight() + this.weight);
                final long maximum = this.this$0.maximum();
                if (weightedSize >= maximum >>> 1) {
                    final long capacity = this.this$0.isWeighted() ? this.this$0.data.mappingCount() : maximum;
                    this.this$0.frequencySketch().ensureCapacity(capacity);
                }
                final K key = this.node.getKey();
                if (key != null) {
                    this.this$0.frequencySketch().increment(key);
                }
                this.this$0.setMissesInSample(this.this$0.missesInSample() + 1);
            }
            final boolean isAlive;
            synchronized (this.node) {
                isAlive = this.node.isAlive();
            }
            if (isAlive) {
                if (this.this$0.expiresAfterWrite()) {
                    this.this$0.writeOrderDeque().add(this.node);
                }
                if (this.this$0.evicts() && this.weight > this.this$0.windowMaximum()) {
                    this.this$0.accessOrderWindowDeque().offerFirst(this.node);
                }
                else if (this.this$0.evicts() || this.this$0.expiresAfterAccess()) {
                    this.this$0.accessOrderWindowDeque().offerLast(this.node);
                }
                if (this.this$0.expiresVariable()) {
                    this.this$0.timerWheel().schedule(this.node);
                }
            }
            if (this.this$0.isComputingAsync(this.node)) {
                synchronized (this.node) {
                    if (!Async.isReady((CompletableFuture<?>)this.node.getValue())) {
                        final long expirationTime = this.this$0.expirationTicker().read() + 6917529027641081854L;
                        this.this$0.setVariableTime(this.node, expirationTime);
                        this.this$0.setAccessTime(this.node, expirationTime);
                        this.this$0.setWriteTime(this.node, expirationTime);
                    }
                }
            }
        }
    }
    
    final class RemovalTask implements Runnable
    {
        final Node<K, V> node;
        final /* synthetic */ BoundedLocalCache this$0;
        
        RemovalTask(final BoundedLocalCache this$0, final Node<K, V> node) {
            this.this$0 = this$0;
            super();
            this.node = node;
        }
        
        @GuardedBy("evictionLock")
        @Override
        public void run() {
            if (this.node.inWindow() && (this.this$0.evicts() || this.this$0.expiresAfterAccess())) {
                this.this$0.accessOrderWindowDeque().remove(this.node);
            }
            else if (this.this$0.evicts()) {
                if (this.node.inMainProbation()) {
                    this.this$0.accessOrderProbationDeque().remove(this.node);
                }
                else {
                    this.this$0.accessOrderProtectedDeque().remove(this.node);
                }
            }
            if (this.this$0.expiresAfterWrite()) {
                this.this$0.writeOrderDeque().remove(this.node);
            }
            else if (this.this$0.expiresVariable()) {
                this.this$0.timerWheel().deschedule(this.node);
            }
            this.this$0.makeDead(this.node);
        }
    }
    
    final class UpdateTask implements Runnable
    {
        final int weightDifference;
        final Node<K, V> node;
        final /* synthetic */ BoundedLocalCache this$0;
        
        public UpdateTask(final BoundedLocalCache this$0, final Node<K, V> node, final int weightDifference) {
            this.this$0 = this$0;
            super();
            this.weightDifference = weightDifference;
            this.node = node;
        }
        
        @GuardedBy("evictionLock")
        @Override
        public void run() {
            if (this.this$0.evicts()) {
                final int oldWeightedSize = this.node.getPolicyWeight();
                this.node.setPolicyWeight(oldWeightedSize + this.weightDifference);
                if (this.node.inWindow()) {
                    if (this.node.getPolicyWeight() <= this.this$0.windowMaximum()) {
                        this.this$0.onAccess(this.node);
                    }
                    else if (this.this$0.accessOrderWindowDeque().contains(this.node)) {
                        this.this$0.accessOrderWindowDeque().moveToFront(this.node);
                    }
                    this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.weightDifference);
                }
                else if (this.node.inMainProbation()) {
                    if (this.node.getPolicyWeight() <= this.this$0.maximum()) {
                        this.this$0.onAccess(this.node);
                    }
                    else if (this.this$0.accessOrderProbationDeque().remove(this.node)) {
                        this.this$0.accessOrderWindowDeque().addFirst(this.node);
                        this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.node.getPolicyWeight());
                    }
                }
                else if (this.node.inMainProtected()) {
                    if (this.node.getPolicyWeight() <= this.this$0.maximum()) {
                        this.this$0.onAccess(this.node);
                        this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() + this.weightDifference);
                    }
                    else if (this.this$0.accessOrderProtectedDeque().remove(this.node)) {
                        this.this$0.accessOrderWindowDeque().addFirst(this.node);
                        this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.node.getPolicyWeight());
                        this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() - oldWeightedSize);
                    }
                    else {
                        this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() - oldWeightedSize);
                    }
                }
                this.this$0.setWeightedSize(this.this$0.weightedSize() + this.weightDifference);
            }
            else if (this.this$0.expiresAfterAccess()) {
                this.this$0.onAccess(this.node);
            }
            if (this.this$0.expiresAfterWrite()) {
                BoundedLocalCache.reorder(this.this$0.writeOrderDeque(), this.node);
            }
            else if (this.this$0.expiresVariable()) {
                this.this$0.timerWheel().reschedule(this.node);
            }
        }
    }
    
    static final class PerformCleanupTask extends ForkJoinTask<Void> implements Runnable
    {
        private static final long serialVersionUID = 1L;
        final WeakReference<BoundedLocalCache<?, ?>> reference;
        
        PerformCleanupTask(final BoundedLocalCache<?, ?> cache) {
            super();
            this.reference = new WeakReference<BoundedLocalCache<?, ?>>(cache);
        }
        
        public boolean exec() {
            try {
                this.run();
            }
            catch (final Throwable t) {
                BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", t);
            }
            return false;
        }
        
        @Override
        public void run() {
            final BoundedLocalCache<?, ?> cache = this.reference.get();
            if (cache != null) {
                cache.performCleanUp(null);
            }
        }
        
        @Override
        public Void getRawResult() {
            return null;
        }
        
        public void setRawResult(final Void v) {
        }
        
        @Override
        public void complete(final Void value) {
        }
        
        @Override
        public void completeExceptionally(final Throwable ex) {
        }
        
        @Override
        public boolean cancel(final boolean mayInterruptIfRunning) {
            return false;
        }
        
        public /* bridge */ void setRawResult(final Object o) {
            this.setRawResult((Void)o);
        }
        
        @Override
        public /* bridge */ Object getRawResult() {
            return this.getRawResult();
        }
        
        @Override
        public /* bridge */ void complete(final Object o) {
            this.complete((Void)o);
        }
    }
    
    static class BoundedLocalManualCache<K, V> implements LocalManualCache<K, V>, Serializable
    {
        private static final long serialVersionUID = 1L;
        final BoundedLocalCache<K, V> cache;
        final boolean isWeighted;
        Policy<K, V> policy;
        
        BoundedLocalManualCache(final Caffeine<K, V> builder) {
            this(builder, null);
        }
        
        BoundedLocalManualCache(final Caffeine<K, V> builder, final CacheLoader<? super K, V> loader) {
            super();
            this.cache = LocalCacheFactory.newBoundedLocalCache(builder, loader, false);
            this.isWeighted = builder.isWeighted();
        }
        
        @Override
        public BoundedLocalCache<K, V> cache() {
            return this.cache;
        }
        
        @Override
        public Policy<K, V> policy() {
            return (this.policy == null) ? (this.policy = (Policy<K, V>)new BoundedLocalCache.BoundedPolicy((BoundedLocalCache)this.cache, (Function)Function.identity(), this.isWeighted)) : this.policy;
        }
        
        private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Proxy required");
        }
        
        Object writeReplace() {
            return BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
        }
        
        @Override
        public /* bridge */ LocalCache cache() {
            return this.cache();
        }
    }
    
    static final class BoundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable
    {
        private static final long serialVersionUID = 1L;
        final BoundedLocalCache<K, CompletableFuture<V>> cache;
        final boolean isWeighted;
        ConcurrentMap<K, CompletableFuture<V>> mapView;
        Policy<K, V> policy;
        
        BoundedLocalAsyncLoadingCache(final Caffeine<K, V> builder, final AsyncCacheLoader<? super K, V> loader) {
            super((AsyncCacheLoader<? super Object, V>)loader);
            this.isWeighted = builder.isWeighted();
            this.cache = LocalCacheFactory.newBoundedLocalCache((Caffeine<K, CompletableFuture<V>>)builder, new AsyncLoader<Object, CompletableFuture<V>>((AsyncCacheLoader<? super K, CompletableFuture<V>>)loader, builder), true);
        }
        
        @Override
        public BoundedLocalCache<K, CompletableFuture<V>> cache() {
            return this.cache;
        }
        
        @Override
        public ConcurrentMap<K, CompletableFuture<V>> asMap() {
            return (this.mapView == null) ? (this.mapView = new LocalAsyncCache.AsyncAsMapView<K, V>(this)) : this.mapView;
        }
        
        @Override
        public Policy<K, V> policy() {
            if (this.policy == null) {
                final BoundedLocalCache<K, V> castCache = (BoundedLocalCache<K, V>)this.cache;
                final Function<V, V> castTransformer;
                final Function<CompletableFuture<V>, V> transformer = (Function<CompletableFuture<V>, V>)(castTransformer = (Function<V, V>)Async::getIfReady);
                this.policy = (Policy<K, V>)new BoundedLocalCache.BoundedPolicy((BoundedLocalCache)castCache, (Function)castTransformer, this.isWeighted);
            }
            return this.policy;
        }
        
        private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Proxy required");
        }
        
        Object writeReplace() {
            final SerializationProxy<K, V> proxy = BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
            if (this.cache.refreshAfterWrite()) {
                proxy.refreshAfterWriteNanos = this.cache.refreshAfterWriteNanos();
            }
            proxy.loader = this.loader;
            proxy.async = true;
            return proxy;
        }
        
        @Override
        public /* bridge */ LocalCache cache() {
            return this.cache();
        }
        
        static final class AsyncLoader<K, V> implements CacheLoader<K, V>
        {
            final AsyncCacheLoader<? super K, V> loader;
            final Executor executor;
            
            AsyncLoader(final AsyncCacheLoader<? super K, V> loader, final Caffeine<?, ?> builder) {
                super();
                this.executor = Objects.requireNonNull(builder.getExecutor());
                this.loader = Objects.requireNonNull(loader);
            }
            
            @Override
            public V load(final K key) {
                final V newValue = (V)this.loader.asyncLoad(key, this.executor);
                return newValue;
            }
            
            @Override
            public V reload(final K key, final V oldValue) {
                final V newValue = (V)this.loader.asyncReload(key, oldValue, this.executor);
                return newValue;
            }
            
            @Override
            public CompletableFuture<V> asyncReload(final K key, final V oldValue, final Executor executor) {
                return this.loader.asyncReload(key, oldValue, executor);
            }
        }
    }
}
