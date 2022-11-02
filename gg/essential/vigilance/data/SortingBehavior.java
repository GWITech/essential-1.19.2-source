package gg.essential.vigilance.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004j\n\u0012\u0006\b\u0000\u0012\u00020\u0005`\u0006H\u0016J\u001c\u0010\u0007\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\u0004j\n\u0012\u0006\b\u0000\u0012\u00020\b`\u0006H\u0016J@\u0010\t\u001a:\u0012\u0018\b\u0000\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\n0\u0004j\u001c\u0012\u0018\b\u0000\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\n`\u0006H\u0016¨\u0006\r" }, d2 = { "Lgg/essential/vigilance/data/SortingBehavior;", "", "()V", "getCategoryComparator", "Ljava/util/Comparator;", "Lgg/essential/vigilance/data/Category;", "Lkotlin/Comparator;", "getPropertyComparator", "Lgg/essential/vigilance/data/PropertyData;", "getSubcategoryComparator", "", "", "", "Vigilance" })
public class SortingBehavior
{
    public SortingBehavior() {
        super();
    }
    
    @NotNull
    public Comparator<? super Category> getCategoryComparator() {
        return (Comparator<? super Category>)new SortingBehavior$getCategoryComparator$$inlined$compareBy$1();
    }
    
    @NotNull
    public Comparator<? super Map.Entry<String, ? extends List<PropertyData>>> getSubcategoryComparator() {
        return (Comparator)new Comparator<Object>() {
            public SortingBehavior$getSubcategoryComparator$$inlined$compareBy$1() {
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
                //     5: iconst_0       
                //     6: istore          $i$a$-compareBy-SortingBehavior$getSubcategoryComparator$1
                //     8: aload_3         /* it */
                //     9: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
                //    14: checkcast       Ljava/lang/Comparable;
                //    17: aload_2         /* b */
                //    18: checkcast       Ljava/util/Map$Entry;
                //    21: astore_3       
                //    22: astore          5
                //    24: iconst_0       
                //    25: istore          $i$a$-compareBy-SortingBehavior$getSubcategoryComparator$1
                //    27: aload_3         /* it */
                //    28: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
                //    33: checkcast       Ljava/lang/Comparable;
                //    36: aload           5
                //    38: swap           
                //    39: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    42: ireturn        
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
        };
    }
    
    @NotNull
    public Comparator<? super PropertyData> getPropertyComparator() {
        return (Comparator)new Comparator<Object>() {
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
        };
    }
}
