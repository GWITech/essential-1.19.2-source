package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "", "previewing", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/network/cosmetics/Cosmetic;", "invoke" })
static final class CosmeticStudio$implicitCartItems$1 extends Lambda implements Function1<Map<CosmeticSlot, ? extends Cosmetic>, Set<? extends String>> {
    public static final CosmeticStudio$implicitCartItems$1 INSTANCE;
    
    CosmeticStudio$implicitCartItems$1() {
        super(1);
    }
    
    @NotNull
    public final Set<String> invoke(@NotNull final Map<CosmeticSlot, Cosmetic> previewing) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "previewing"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* previewing */
        //     7: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    12: checkcast       Ljava/lang/Iterable;
        //    15: astore_2        /* $this$filter$iv */
        //    16: aload_2         /* $this$filter$iv */
        //    17: astore_3       
        //    18: new             Ljava/util/ArrayList;
        //    21: dup            
        //    22: invokespecial   java/util/ArrayList.<init>:()V
        //    25: checkcast       Ljava/util/Collection;
        //    28: astore          destination$iv$iv
        //    30: aload_3         /* $this$filterTo$iv$iv */
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          5
        //    38: aload           5
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            93
        //    48: aload           5
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          element$iv$iv
        //    57: aload           element$iv$iv
        //    59: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //    62: astore          it
        //    64: aload           it
        //    66: invokevirtual   gg/essential/network/cosmetics/Cosmetic.requiresUnlockAction:()Z
        //    69: ifne            76
        //    72: iconst_1       
        //    73: goto            77
        //    76: iconst_0       
        //    77: ifeq            38
        //    80: aload           destination$iv$iv
        //    82: aload           element$iv$iv
        //    84: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: goto            38
        //    93: aload           destination$iv$iv
        //    95: checkcast       Ljava/util/List;
        //    98: checkcast       Ljava/lang/Iterable;
        //   101: astore_2        /* $this$map$iv */
        //   102: aload_2         /* $this$map$iv */
        //   103: astore_3       
        //   104: new             Ljava/util/ArrayList;
        //   107: dup            
        //   108: aload_2         /* $this$map$iv */
        //   109: bipush          10
        //   111: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   114: invokespecial   java/util/ArrayList.<init>:(I)V
        //   117: checkcast       Ljava/util/Collection;
        //   120: astore          destination$iv$iv
        //   122: aload_3         /* $this$mapTo$iv$iv */
        //   123: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   128: astore          5
        //   130: aload           5
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: ifeq            177
        //   140: aload           5
        //   142: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   147: astore          item$iv$iv
        //   149: aload           destination$iv$iv
        //   151: aload           item$iv$iv
        //   153: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   156: astore          7
        //   158: astore          8
        //   160: aload           it
        //   162: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   165: aload           8
        //   167: swap           
        //   168: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   173: pop            
        //   174: goto            130
        //   177: aload           destination$iv$iv
        //   179: checkcast       Ljava/util/List;
        //   182: checkcast       Ljava/lang/Iterable;
        //   185: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   188: areturn        
        //    Signature:
        //  (Ljava/util/Map<Lgg/essential/mod/cosmetics/CosmeticSlot;Lgg/essential/network/cosmetics/Cosmetic;>;)Ljava/util/Set<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  previewing  
        //    StackMapTable: 00 06 FF 00 26 00 06 00 00 00 00 07 00 3C 07 00 42 00 00 FC 00 25 07 00 51 40 01 F9 00 0F FC 00 24 07 00 42 FA 00 2E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Map)p1);
    }
    
    static {
        CosmeticStudio$implicitCartItems$1.INSTANCE = new CosmeticStudio$implicitCartItems$1();
    }
}