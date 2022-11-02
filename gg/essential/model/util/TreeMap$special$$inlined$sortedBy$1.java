package gg.essential.model.util;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2" })
public static final class TreeMap$special$$inlined$sortedBy$1<T> implements Comparator {
    public TreeMap$special$$inlined$sortedBy$1() {
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/util/Map$Entry;
        //     4: astore_3        /* it */
        //     5: aload_3         /* it */
        //     6: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    11: checkcast       Ljava/lang/Comparable;
        //    14: aload_2         /* b */
        //    15: checkcast       Ljava/util/Map$Entry;
        //    18: astore_3       
        //    19: astore          4
        //    21: aload_3         /* it */
        //    22: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/Comparable;
        //    30: aload           4
        //    32: swap           
        //    33: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //    36: ireturn        
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