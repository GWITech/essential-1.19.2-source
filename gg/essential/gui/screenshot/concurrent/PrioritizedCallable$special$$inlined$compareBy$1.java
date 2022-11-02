package gg.essential.gui.screenshot.concurrent;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2" })
public static final class PrioritizedCallable$special$$inlined$compareBy$1<T> implements Comparator {
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
}