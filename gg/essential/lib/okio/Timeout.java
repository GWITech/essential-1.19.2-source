package gg.essential.lib.okio;

import java.util.concurrent.*;
import java.io.*;

public class Timeout
{
    public static final Timeout NONE;
    private boolean hasDeadline;
    private long deadlineNanoTime;
    private long timeoutNanos;
    
    public Timeout() {
        super();
    }
    
    public Timeout timeout(final long timeout, final TimeUnit unit) {
        if (timeout < 0L) {
            throw new IllegalArgumentException("timeout < 0: " + timeout);
        }
        if (unit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }
    
    public long timeoutNanos() {
        return this.timeoutNanos;
    }
    
    public boolean hasDeadline() {
        return this.hasDeadline;
    }
    
    public long deadlineNanoTime() {
        if (!this.hasDeadline) {
            throw new IllegalStateException("No deadline");
        }
        return this.deadlineNanoTime;
    }
    
    public Timeout deadlineNanoTime(final long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }
    
    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }
    
    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }
    
    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
        }
    }
    
    static {
        NONE = new Timeout() {
            Timeout$1() {
                super();
            }
            
            @Override
            public Timeout timeout(final long timeout, final TimeUnit unit) {
                return this;
            }
            
            @Override
            public Timeout deadlineNanoTime(final long deadlineNanoTime) {
                return this;
            }
            
            @Override
            public void throwIfReached() throws IOException {
            }
        };
    }
}
