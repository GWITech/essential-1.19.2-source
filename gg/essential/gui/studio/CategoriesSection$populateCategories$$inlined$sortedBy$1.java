package gg.essential.gui.studio;

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
public static final class CategoriesSection$populateCategories$$inlined$sortedBy$1<T> implements Comparator {
    public CategoriesSection$populateCategories$$inlined$sortedBy$1() {
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lgg/essential/cosmetics/model/CosmeticCategory;
        //     4: astore_3        /* it */
        //     5: aload_3         /* it */
        //     6: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getOrder:()I
        //     9: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    12: checkcast       Ljava/lang/Comparable;
        //    15: aload_2         /* b */
        //    16: checkcast       Lgg/essential/cosmetics/model/CosmeticCategory;
        //    19: astore_3       
        //    20: astore          4
        //    22: aload_3         /* it */
        //    23: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getOrder:()I
        //    26: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    29: aload           4
        //    31: swap           
        //    32: checkcast       Ljava/lang/Comparable;
        //    35: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //    38: ireturn        
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