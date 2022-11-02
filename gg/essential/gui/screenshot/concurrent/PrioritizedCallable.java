package gg.essential.gui.screenshot.concurrent;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005\b&\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006	""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;", "T", "Ljava/util/concurrent/Callable;", "windowIndex", "", "providerPriority", "indexInWindow", "(III)V", "Companion", "essential" })
public abstract class PrioritizedCallable<T> implements Callable<T>
{
    @NotNull
    public static final Companion Companion;
    private final int windowIndex;
    private final int providerPriority;
    private final int indexInWindow;
    @NotNull
    private static final Comparator<Runnable> comparator;
    
    public PrioritizedCallable(final int windowIndex, final int providerPriority, final int indexInWindow) {
        super();
        this.windowIndex = windowIndex;
        this.providerPriority = providerPriority;
        this.indexInWindow = indexInWindow;
    }
    
    public static final /* synthetic */ Comparator access$getComparator$cp() {
        return PrioritizedCallable.comparator;
    }
    
    public static final /* synthetic */ int access$getWindowIndex$p(final PrioritizedCallable $this) {
        return $this.windowIndex;
    }
    
    public static final /* synthetic */ int access$getProviderPriority$p(final PrioritizedCallable $this) {
        return $this.providerPriority;
    }
    
    public static final /* synthetic */ int access$getIndexInWindow$p(final PrioritizedCallable $this) {
        return $this.indexInWindow;
    }
    
    static {
        Companion = new Companion((byte)0);
        comparator = new Comparator<Object>(new Comparator(new Comparator() {
            public PrioritizedCallable$special$$inlined$compareBy$1() {
                super();
            }
            
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: checkcast       Ljava/lang/Runnable;
                //     4: astore_3        /* it */
                //     5: aload_3         /* it */
                //     6: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //     9: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    12: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getWindowIndex$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    15: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    18: checkcast       Ljava/lang/Comparable;
                //    21: aload_2         /* b */
                //    22: checkcast       Ljava/lang/Runnable;
                //    25: astore_3       
                //    26: astore          4
                //    28: aload_3         /* it */
                //    29: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //    32: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    35: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getWindowIndex$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    38: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    41: checkcast       Ljava/lang/Comparable;
                //    44: aload           4
                //    46: swap           
                //    47: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    50: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    MethodParameters:
                //  Name  Flags  
                //  ----  -----
                //  a     
                //  b     
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }) {
            final /* synthetic */ Comparator $this_thenByDescending;
            
            public PrioritizedCallable$special$$inlined$thenByDescending$1(final Comparator $receiver) {
                this.$this_thenByDescending = $receiver;
                super();
            }
            
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        gg/essential/gui/screenshot/concurrent/PrioritizedCallable$special$$inlined$thenByDescending$1.$this_thenByDescending:Ljava/util/Comparator;
                //     4: aload_1         /* a */
                //     5: aload_2         /* b */
                //     6: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
                //    11: istore_3        /* previousCompare */
                //    12: iload_3         /* previousCompare */
                //    13: ifeq            20
                //    16: iload_3         /* previousCompare */
                //    17: goto            74
                //    20: aload_2         /* b */
                //    21: checkcast       Ljava/lang/Runnable;
                //    24: astore          it
                //    26: aload           it
                //    28: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //    31: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    34: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getProviderPriority$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    37: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    40: checkcast       Ljava/lang/Comparable;
                //    43: aload_1         /* a */
                //    44: checkcast       Ljava/lang/Runnable;
                //    47: astore          4
                //    49: astore          5
                //    51: aload           it
                //    53: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //    56: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    59: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getProviderPriority$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    65: checkcast       Ljava/lang/Comparable;
                //    68: aload           5
                //    70: swap           
                //    71: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    74: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    MethodParameters:
                //  Name  Flags  
                //  ----  -----
                //  a     
                //  b     
                //    StackMapTable: 00 02 FF 00 14 00 03 00 07 00 05 07 00 05 00 00 FF 00 35 00 00 00 01 01
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }) {
            final /* synthetic */ Comparator $this_thenBy;
            
            public PrioritizedCallable$special$$inlined$thenBy$1(final Comparator $receiver) {
                this.$this_thenBy = $receiver;
                super();
            }
            
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        gg/essential/gui/screenshot/concurrent/PrioritizedCallable$special$$inlined$thenBy$1.$this_thenBy:Ljava/util/Comparator;
                //     4: aload_1         /* a */
                //     5: aload_2         /* b */
                //     6: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
                //    11: istore_3        /* previousCompare */
                //    12: iload_3         /* previousCompare */
                //    13: ifeq            20
                //    16: iload_3         /* previousCompare */
                //    17: goto            74
                //    20: aload_1         /* a */
                //    21: checkcast       Ljava/lang/Runnable;
                //    24: astore          it
                //    26: aload           it
                //    28: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //    31: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    34: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getIndexInWindow$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    37: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    40: checkcast       Ljava/lang/Comparable;
                //    43: aload_2         /* b */
                //    44: checkcast       Ljava/lang/Runnable;
                //    47: astore          4
                //    49: astore          5
                //    51: aload           it
                //    53: checkcast       Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;
                //    56: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedTask.getPrioritizedCallback:()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;
                //    59: invokestatic    gg/essential/gui/screenshot/concurrent/PrioritizedCallable.access$getIndexInWindow$p:(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)I
                //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    65: checkcast       Ljava/lang/Comparable;
                //    68: aload           5
                //    70: swap           
                //    71: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    74: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    MethodParameters:
                //  Name  Flags  
                //  ----  -----
                //  a     
                //  b     
                //    StackMapTable: 00 02 FF 00 14 00 03 00 07 00 05 07 00 05 00 00 FF 00 35 00 00 00 01 01
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000,
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J"\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R!\u0010	\u001a\u0012\u0012\u0004\u0012\u00020\u000b0
                                                       j\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable$Companion;", "", "()V", "CACHE_WRITE", "", "FOCUS", "MIN_RES", "PRECOMPUTE", "REGULAR", "comparator", "Ljava/util/Comparator;", "Ljava/lang/Runnable;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "withPriority", "Ljava/util/concurrent/Executor;", "windowIndex", "providerPriority", "indexInWindow", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Comparator<Runnable> getComparator() {
            return PrioritizedCallable.access$getComparator$cp();
        }
        
        @NotNull
        public final Executor withPriority(@NotNull final Executor $this$withPriority, final int windowIndex, final int providerPriority, final int indexInWindow) {
            Intrinsics.checkNotNullParameter((Object)$this$withPriority, "<this>");
            return Companion::withPriority$lambda-0;
        }
        
        private static final void withPriority$lambda-0(final Executor $this_withPriority, final int $windowIndex, final int $providerPriority, final int $indexInWindow, final Runnable runnable) {
            Intrinsics.checkNotNullParameter((Object)$this_withPriority, "$this_withPriority");
            if (runnable instanceof PrioritizedTask) {
                $this_withPriority.execute(runnable);
            }
            else {
                final PrioritizedCallable$Companion$withPriority$1$callable.PrioritizedCallable$Companion$withPriority$1$callable$1 callable = new PrioritizedCallable$Companion$withPriority$1$callable.PrioritizedCallable$Companion$withPriority$1$callable$1($windowIndex, $providerPriority, $indexInWindow, runnable);
                $this_withPriority.execute(new PrioritizedTask<Object>((PrioritizedCallable<?>)callable));
            }
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
