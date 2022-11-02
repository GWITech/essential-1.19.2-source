package gg.essential.config;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.vigilance.data.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\u0007j
                                                   \u0012\u0006\b\u0000\u0012\u00020\b`	H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006
                                                   """ }, d2 = { "Lgg/essential/config/EssentialConfig$ConfigSorting;", "Lgg/essential/vigilance/data/SortingBehavior;", "()V", "order", "", "", "getCategoryComparator", "Ljava/util/Comparator;", "Lgg/essential/vigilance/data/Category;", "Lkotlin/Comparator;", "essential" })
private static final class ConfigSorting extends SortingBehavior
{
    @NotNull
    public static final ConfigSorting INSTANCE;
    @NotNull
    private static final List<String> order;
    
    private ConfigSorting() {
        super();
    }
    
    @NotNull
    @Override
    public Comparator<? super Category> getCategoryComparator() {
        return ConfigSorting::getCategoryComparator$lambda-1;
    }
    
    private static final int getCategoryComparator$lambda-1(final Category o1, final Category o2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //     4: ldc             "General"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //     9: ifeq            16
        //    12: iconst_m1      
        //    13: goto            106
        //    16: aload_1         /* o2 */
        //    17: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    20: ldc             "General"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    25: ifeq            32
        //    28: iconst_1       
        //    29: goto            106
        //    32: aload_0         /* o1 */
        //    33: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    36: ldc             "Notifications"
        //    38: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    41: ifeq            60
        //    44: aload_1         /* o2 */
        //    45: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    48: ldc             "Cosmetics"
        //    50: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    53: ifeq            60
        //    56: iconst_1       
        //    57: goto            106
        //    60: aload_0         /* o1 */
        //    61: astore_2        /* cat */
        //    62: getstatic       gg/essential/config/EssentialConfig$ConfigSorting.order:Ljava/util/List;
        //    65: aload_2         /* cat */
        //    66: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    69: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    74: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    77: checkcast       Ljava/lang/Comparable;
        //    80: aload_1         /* o2 */
        //    81: astore_2       
        //    82: astore_3       
        //    83: getstatic       gg/essential/config/EssentialConfig$ConfigSorting.order:Ljava/util/List;
        //    86: aload_2         /* cat */
        //    87: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    90: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    95: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    98: checkcast       Ljava/lang/Comparable;
        //   101: aload_3        
        //   102: swap           
        //   103: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //   106: ireturn        
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  o1    
        //  o2    
        //    StackMapTable: 00 04 10 0F 1B FF 00 2D 00 00 00 01 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        INSTANCE = new ConfigSorting();
        order = CollectionsKt.listOf((Object[])new String[] { "General", "Notifications", "Cosmetics", "Quality of Life", "Privacy" });
    }
}
