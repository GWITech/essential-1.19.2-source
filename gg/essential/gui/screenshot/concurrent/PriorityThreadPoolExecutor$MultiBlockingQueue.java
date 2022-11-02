package gg.essential.gui.screenshot.concurrent;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J
                                                   \u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J
                                                   \u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012
                                                    \u0006*\u0004\u0018\u00010\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010
                                                   \u001a\u0010\u0012\f\u0012
                                                    \u0006*\u0004\u0018\u00010\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u000e¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue;", "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$AbstractUnboundedBlockingQueue;", "Ljava/lang/Runnable;", "()V", "backgroundQueue", "Ljava/util/PriorityQueue;", "kotlin.jvm.PlatformType", "backgroundTaskDiscriminator", "Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;", "", "regularQueue", "size", "", "getSize", "()I", "doOffer", "", "e", "peek", "poll", "pollBackgroundTask", "essential" })
private static final class MultiBlockingQueue extends AbstractUnboundedBlockingQueue<Runnable>
{
    @NotNull
    private final PriorityQueue<Runnable> regularQueue;
    @NotNull
    private final PriorityQueue<Runnable> backgroundQueue;
    @NotNull
    private final PrioritizedTask<Unit> backgroundTaskDiscriminator;
    
    public MultiBlockingQueue() {
        super();
        this.regularQueue = new PriorityQueue<Runnable>(10, PrioritizedCallable.Companion.getComparator());
        this.backgroundQueue = new PriorityQueue<Runnable>(10, PrioritizedCallable.Companion.getComparator());
        this.backgroundTaskDiscriminator = new PrioritizedTask<Unit>((PrioritizedCallable<Unit>)new PriorityThreadPoolExecutor$MultiBlockingQueue$backgroundTaskDiscriminator.PriorityThreadPoolExecutor$MultiBlockingQueue$backgroundTaskDiscriminator$1());
    }
    
    @Override
    public int getSize() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: checkcast       Ljava/util/concurrent/locks/Lock;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.regularQueue:Ljava/util/PriorityQueue;
        //    18: invokevirtual   java/util/PriorityQueue.size:()I
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.backgroundQueue:Ljava/util/PriorityQueue;
        //    25: invokevirtual   java/util/PriorityQueue.size:()I
        //    28: iadd           
        //    29: istore_2       
        //    30: aload_1        
        //    31: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    36: iload_2        
        //    37: goto            49
        //    40: astore_2       
        //    41: aload_1        
        //    42: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    47: aload_2        
        //    48: athrow         
        //    49: ireturn        
        //    StackMapTable: 00 02 FF 00 28 00 02 00 07 00 54 00 01 07 00 5E FF 00 08 00 00 00 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     30     40     49     Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected boolean doOffer(@NotNull final Runnable e) {
        Intrinsics.checkNotNullParameter((Object)e, "e");
        final PriorityQueue queue = (PrioritizedCallable.Companion.getComparator().compare(e, this.backgroundTaskDiscriminator) >= 0) ? this.backgroundQueue : this.regularQueue;
        return queue.offer(e);
    }
    
    @Nullable
    @Override
    public Runnable poll() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: checkcast       Ljava/util/concurrent/locks/Lock;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.regularQueue:Ljava/util/PriorityQueue;
        //    18: invokevirtual   java/util/PriorityQueue.poll:()Ljava/lang/Object;
        //    21: checkcast       Ljava/lang/Runnable;
        //    24: dup            
        //    25: ifnonnull       39
        //    28: pop            
        //    29: aload_0         /* this */
        //    30: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.backgroundQueue:Ljava/util/PriorityQueue;
        //    33: invokevirtual   java/util/PriorityQueue.poll:()Ljava/lang/Object;
        //    36: checkcast       Ljava/lang/Runnable;
        //    39: astore_2       
        //    40: aload_1        
        //    41: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    46: aload_2        
        //    47: goto            59
        //    50: astore_2       
        //    51: aload_1        
        //    52: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    57: aload_2        
        //    58: athrow         
        //    59: areturn        
        //    StackMapTable: 00 03 FF 00 27 00 02 00 07 00 54 00 01 07 00 70 4A 07 00 5E FF 00 08 00 00 00 01 07 00 70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     40     50     59     Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    @Override
    public Runnable peek() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: checkcast       Ljava/util/concurrent/locks/Lock;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.regularQueue:Ljava/util/PriorityQueue;
        //    18: invokevirtual   java/util/PriorityQueue.peek:()Ljava/lang/Object;
        //    21: checkcast       Ljava/lang/Runnable;
        //    24: dup            
        //    25: ifnonnull       39
        //    28: pop            
        //    29: aload_0         /* this */
        //    30: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.backgroundQueue:Ljava/util/PriorityQueue;
        //    33: invokevirtual   java/util/PriorityQueue.peek:()Ljava/lang/Object;
        //    36: checkcast       Ljava/lang/Runnable;
        //    39: astore_2       
        //    40: aload_1        
        //    41: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    46: aload_2        
        //    47: goto            59
        //    50: astore_2       
        //    51: aload_1        
        //    52: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    57: aload_2        
        //    58: athrow         
        //    59: areturn        
        //    StackMapTable: 00 03 FF 00 27 00 02 00 07 00 54 00 01 07 00 70 4A 07 00 5E FF 00 08 00 00 00 01 07 00 70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     40     50     59     Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public final Runnable pollBackgroundTask() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: checkcast       Ljava/util/concurrent/locks/Lock;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue.backgroundQueue:Ljava/util/PriorityQueue;
        //    18: invokevirtual   java/util/PriorityQueue.poll:()Ljava/lang/Object;
        //    21: checkcast       Ljava/lang/Runnable;
        //    24: astore_2       
        //    25: aload_1        
        //    26: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    31: aload_2        
        //    32: goto            44
        //    35: astore_2       
        //    36: aload_1        
        //    37: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    42: aload_2        
        //    43: athrow         
        //    44: areturn        
        //    StackMapTable: 00 02 FF 00 23 00 02 00 07 00 54 00 01 07 00 5E FF 00 08 00 00 00 01 07 00 70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     25     35     44     Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ boolean doOffer(final Object e) {
        return this.doOffer((Runnable)e);
    }
    
    @Override
    public /* bridge */ Object poll() {
        return this.poll();
    }
    
    @Override
    public /* bridge */ Object peek() {
        return this.peek();
    }
    
    public /* bridge */ boolean remove(final Runnable element) {
        return super.remove(element);
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object element) {
        return (element == null || element instanceof Runnable) && this.remove((Runnable)element);
    }
    
    public /* bridge */ boolean contains(final Runnable element) {
        return super.contains(element);
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object element) {
        return (element == null || element instanceof Runnable) && this.contains((Runnable)element);
    }
}
