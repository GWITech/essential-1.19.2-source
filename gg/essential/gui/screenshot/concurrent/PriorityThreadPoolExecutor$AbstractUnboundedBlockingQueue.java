package gg.essential.gui.screenshot.concurrent;

import kotlin.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.locks.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000V
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u001f
                                                   \u0002\b\u0002
                                                   \u0002\u0010)
                                                   \u0002\b\u0002
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0005\b"\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a
                                                   \u0012\u0006\b\u0000\u0012\u00028\u00000\u0013H\u0016J \u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a
                                                   \u0012\u0006\b\u0000\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ%\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010"\u001a\u00020\u0011H\u0016J\r\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010	\u001a
                                                    \u000b*\u0004\u0018\u00010
                                                   0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006%""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$AbstractUnboundedBlockingQueue;", "T", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "()V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "notEmpty", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "doOffer", "", "e", "(Ljava/lang/Object;)Z", "drainTo", "", "c", "", "max", "iterator", "", "offer", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "poll", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "put", "", "(Ljava/lang/Object;)V", "remainingCapacity", "take", "()Ljava/lang/Object;", "essential" })
private abstract static class AbstractUnboundedBlockingQueue<T> extends AbstractQueue<T> implements BlockingQueue<T>
{
    @NotNull
    private final ReentrantLock lock;
    private final Condition notEmpty;
    
    public AbstractUnboundedBlockingQueue() {
        super();
        this.lock = new ReentrantLock();
        this.notEmpty = this.lock.newCondition();
    }
    
    @NotNull
    protected final ReentrantLock getLock() {
        return this.lock;
    }
    
    @NotNull
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }
    
    protected abstract boolean doOffer(final T p0);
    
    @Override
    public boolean offer(final T e) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$AbstractUnboundedBlockingQueue.lock:Ljava/util/concurrent/locks/ReentrantLock;
        //     4: checkcast       Ljava/util/concurrent/locks/Lock;
        //     7: astore_2       
        //     8: aload_2        
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* this */
        //    15: aload_1         /* e */
        //    16: invokevirtual   gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$AbstractUnboundedBlockingQueue.doOffer:(Ljava/lang/Object;)Z
        //    19: istore          4
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$AbstractUnboundedBlockingQueue.notEmpty:Ljava/util/concurrent/locks/Condition;
        //    25: invokeinterface java/util/concurrent/locks/Condition.signal:()V
        //    30: iload           4
        //    32: istore_3       
        //    33: aload_2        
        //    34: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    39: iload_3        
        //    40: goto            52
        //    43: astore_3       
        //    44: aload_2        
        //    45: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    50: aload_3        
        //    51: athrow         
        //    52: ireturn        
        //    Signature:
        //  (TT;)Z
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  e     
        //    StackMapTable: 00 02 FF 00 2B 00 03 00 00 07 00 4F 00 01 07 00 5D FF 00 08 00 00 00 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     33     43     52     Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean offer(final T e, final long timeout, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        return this.offer(e);
    }
    
    @Override
    public void put(final T e) {
        this.offer(e);
    }
    
    @Nullable
    @Override
    public T poll(final long timeout, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long nanos = unit.toNanos(timeout);
        final Lock lock = this.lock;
        lock.lock();
        try {
            while (nanos > 0L) {
                final Object result = this.poll();
                if (result != null) {
                    return (T)result;
                }
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            return null;
        }
        finally {
            lock.unlock();
        }
    }
    
    @Override
    public T take() {
        final Lock lock = this.lock;
        lock.lock();
        try {
            Object result;
            while (true) {
                result = this.poll();
                if (result != null) {
                    break;
                }
                this.notEmpty.await();
            }
            return (T)result;
        }
        finally {
            lock.unlock();
        }
    }
    
    @Override
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public int drainTo(@NotNull final Collection<? super T> c) {
        Intrinsics.checkNotNullParameter((Object)c, "c");
        return this.drainTo(c, Integer.MAX_VALUE);
    }
    
    @Override
    public int drainTo(@NotNull final Collection<? super T> c, final int max) {
        Intrinsics.checkNotNullParameter((Object)c, "c");
        int drained;
        for (drained = 0; drained < max; ++drained) {
            final T poll = this.poll();
            if (poll == null) {
                break;
            }
            c.add(poll);
        }
        return drained;
    }
    
    public abstract int getSize();
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
}
