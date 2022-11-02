package gg.essential.vigilance.data;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2" })
public static final class SortingBehavior$getPropertyComparator$$inlined$compareBy$1<T> implements Comparator<T> {
    public SortingBehavior$getPropertyComparator$$inlined$compareBy$1() {
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //     4: astore_3        /* it */
        //     5: iconst_0       
        //     6: istore          $i$a$-compareBy-SortingBehavior$getPropertyComparator$1
        //     8: aload_3         /* it */
        //     9: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    12: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getSubcategory:()Ljava/lang/String;
        //    15: checkcast       Ljava/lang/Comparable;
        //    18: aload_2         /* b */
        //    19: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    22: astore_3       
        //    23: astore          5
        //    25: iconst_0       
        //    26: istore          $i$a$-compareBy-SortingBehavior$getPropertyComparator$1
        //    28: aload_3         /* it */
        //    29: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    32: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getSubcategory:()Ljava/lang/String;
        //    35: checkcast       Ljava/lang/Comparable;
        //    38: aload           5
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