package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import java.util.concurrent.*;
import java.util.*;

public final class Dispatcher
{
    private int maxRequests;
    private int maxRequestsPerHost;
    @Nullable
    private Runnable idleCallback;
    @Nullable
    private ExecutorService executorService;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls;
    private final Deque<RealCall.AsyncCall> runningAsyncCalls;
    private final Deque<RealCall> runningSyncCalls;
    
    public Dispatcher() {
        super();
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<RealCall.AsyncCall>();
        this.runningAsyncCalls = new ArrayDeque<RealCall.AsyncCall>();
        this.runningSyncCalls = new ArrayDeque<RealCall>();
    }
    
    public synchronized ExecutorService executorService() {
        if (this.executorService == null) {
            this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Util.threadFactory("OkHttp Dispatcher", false));
        }
        return this.executorService;
    }
    
    private void promoteCalls() {
        if (this.runningAsyncCalls.size() >= this.maxRequests) {
            return;
        }
        if (this.readyAsyncCalls.isEmpty()) {
            return;
        }
        final Iterator<RealCall.AsyncCall> i = this.readyAsyncCalls.iterator();
        while (i.hasNext()) {
            final RealCall.AsyncCall call = i.next();
            if (this.runningCallsForHost(call) < this.maxRequestsPerHost) {
                i.remove();
                this.runningAsyncCalls.add(call);
                this.executorService().execute((Runnable)call);
            }
            if (this.runningAsyncCalls.size() >= this.maxRequests) {
                return;
            }
        }
    }
    
    private int runningCallsForHost(final RealCall.AsyncCall call) {
        int result = 0;
        for (final RealCall.AsyncCall c : this.runningAsyncCalls) {
            if (c.host().equals(call.host())) {
                ++result;
            }
        }
        return result;
    }
    
    synchronized void executed(final RealCall call) {
        this.runningSyncCalls.add(call);
    }
    
    void finished(final RealCall.AsyncCall call) {
        this.finished(this.runningAsyncCalls, call, true);
    }
    
    void finished(final RealCall call) {
        this.finished(this.runningSyncCalls, call, false);
    }
    
    private <T> void finished(final Deque<T> calls, final T call, final boolean promoteCalls) {
        final int runningCallsCount;
        final Runnable idleCallback;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError((Object)"Call wasn't in-flight!");
            }
            if (promoteCalls) {
                this.promoteCalls();
            }
            runningCallsCount = this.runningCallsCount();
            idleCallback = this.idleCallback;
        }
        if (runningCallsCount == 0 && idleCallback != null) {
            idleCallback.run();
        }
    }
    
    public synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }
}
