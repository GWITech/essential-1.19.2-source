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
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1" })
public static final class PrioritizedCallable$special$$inlined$thenBy$1<T> implements Comparator {
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
}