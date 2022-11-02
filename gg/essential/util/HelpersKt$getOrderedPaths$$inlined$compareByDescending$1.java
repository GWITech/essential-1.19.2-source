package gg.essential.util;

import java.util.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1" })
public static final class HelpersKt$getOrderedPaths$$inlined$compareByDescending$1<T> implements Comparator {
    final /* synthetic */ Function1 $memoized$inlined;
    
    public HelpersKt$getOrderedPaths$$inlined$compareByDescending$1(final Function1 $memoized$inlined) {
        this.$memoized$inlined = $memoized$inlined;
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/nio/file/Path;
        //     4: astore_3        /* it */
        //     5: aload_0         /* this */
        //     6: getfield        gg/essential/util/HelpersKt$getOrderedPaths$$inlined$compareByDescending$1.$memoized$inlined:Lkotlin/jvm/functions/Function1;
        //     9: aload_3         /* it */
        //    10: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Ljava/lang/Comparable;
        //    18: aload_1         /* a */
        //    19: checkcast       Ljava/nio/file/Path;
        //    22: astore_3       
        //    23: astore          4
        //    25: aload_0         /* this */
        //    26: getfield        gg/essential/util/HelpersKt$getOrderedPaths$$inlined$compareByDescending$1.$memoized$inlined:Lkotlin/jvm/functions/Function1;
        //    29: aload_3         /* it */
        //    30: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    35: checkcast       Ljava/lang/Comparable;
        //    38: aload           4
        //    40: swap           
        //    41: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //    44: ireturn        
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