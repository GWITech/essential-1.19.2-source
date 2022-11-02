package gg.essential.lib.okhttp3;

import gg.essential.lib.okhttp3.internal.connection.*;
import javax.annotation.*;
import java.net.*;
import gg.essential.lib.okhttp3.internal.*;
import java.lang.ref.*;
import gg.essential.lib.okhttp3.internal.platform.*;
import java.util.*;
import java.util.concurrent.*;

public final class ConnectionPool
{
    private static final Executor executor;
    private final long keepAliveDurationNs;
    private final Runnable cleanupRunnable;
    private final Deque<RealConnection> connections;
    final RouteDatabase routeDatabase;
    boolean cleanupRunning;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public ConnectionPool() {
        this(TimeUnit.MINUTES);
    }
    
    public ConnectionPool(final TimeUnit timeUnit) {
        super();
        this.cleanupRunnable = new Runnable() {
            final /* synthetic */ ConnectionPool this$0;
            
            ConnectionPool$1() {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public void run() {
                while (true) {
                    long waitNanos = this.this$0.cleanup(System.nanoTime());
                    if (waitNanos == -1L) {
                        break;
                    }
                    if (waitNanos <= 0L) {
                        continue;
                    }
                    final long waitMillis = waitNanos / 1000000L;
                    waitNanos -= waitMillis * 1000000L;
                    synchronized (this.this$0) {
                        try {
                            this.this$0.wait(waitMillis, (int)waitNanos);
                        }
                        catch (final InterruptedException ex) {}
                    }
                }
            }
        };
        this.connections = new ArrayDeque<RealConnection>();
        this.routeDatabase = new RouteDatabase();
        this.keepAliveDurationNs = timeUnit.toNanos(5L);
        if (5L <= 0L) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + 5L);
        }
    }
    
    @Nullable
    RealConnection get(final Address address, final StreamAllocation streamAllocation, final Route route) {
        assert Thread.holdsLock(this);
        for (final RealConnection connection : this.connections) {
            if (connection.isEligible(address, route)) {
                streamAllocation.acquire$31b26ad5(connection);
                return connection;
            }
        }
        return null;
    }
    
    @Nullable
    Socket deduplicate(final Address address, final StreamAllocation streamAllocation) {
        assert Thread.holdsLock(this);
        for (final RealConnection connection : this.connections) {
            if (connection.isEligible(address, null) && connection.isMultiplexed() && connection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(connection);
            }
        }
        return null;
    }
    
    void put(final RealConnection connection) {
        assert Thread.holdsLock(this);
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            ConnectionPool.executor.execute(this.cleanupRunnable);
        }
        this.connections.add(connection);
    }
    
    boolean connectionBecameIdle(final RealConnection connection) {
        assert Thread.holdsLock(this);
        if (!connection.noNewStreams) {
            this.notifyAll();
            return false;
        }
        this.connections.remove(connection);
        return true;
    }
    
    long cleanup(final long now) {
        int inUseConnectionCount = 0;
        int idleConnectionCount = 0;
        RealConnection longestIdleConnection = null;
        long longestIdleDurationNs = Long.MIN_VALUE;
        synchronized (this) {
            for (final RealConnection connection : this.connections) {
                if (this.pruneAndGetAllocationCount(connection, now) > 0) {
                    ++inUseConnectionCount;
                }
                else {
                    ++idleConnectionCount;
                    final long idleDurationNs = now - connection.idleAtNanos;
                    if (idleDurationNs <= longestIdleDurationNs) {
                        continue;
                    }
                    longestIdleDurationNs = idleDurationNs;
                    longestIdleConnection = connection;
                }
            }
            if (longestIdleDurationNs >= this.keepAliveDurationNs || idleConnectionCount > 5) {
                this.connections.remove(longestIdleConnection);
            }
            else {
                if (idleConnectionCount > 0) {
                    return this.keepAliveDurationNs - longestIdleDurationNs;
                }
                if (inUseConnectionCount > 0) {
                    return this.keepAliveDurationNs;
                }
                this.cleanupRunning = false;
                return -1L;
            }
        }
        Util.closeQuietly(longestIdleConnection.socket());
        return 0L;
    }
    
    private int pruneAndGetAllocationCount(final RealConnection connection, final long now) {
        final List<Reference<StreamAllocation>> references = connection.allocations;
        int i = 0;
        while (i < references.size()) {
            final Reference<StreamAllocation> reference = references.get(i);
            if (reference.get() != null) {
                ++i;
            }
            else {
                final StreamAllocation.StreamAllocationReference streamAllocRef = (StreamAllocation.StreamAllocationReference)reference;
                final String message = "A connection to " + connection.route().address().url() + " was leaked. Did you forget to close a response body?";
                Platform.get().logCloseableLeak(message, streamAllocRef.callStackTrace);
                references.remove(i);
                connection.noNewStreams = true;
                if (references.isEmpty()) {
                    connection.idleAtNanos = now - this.keepAliveDurationNs;
                    return 0;
                }
                continue;
            }
        }
        return references.size();
    }
    
    static {
        $assertionsDisabled = !ConnectionPool.class.desiredAssertionStatus();
        executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Util.threadFactory("OkHttp ConnectionPool", true));
    }
}
