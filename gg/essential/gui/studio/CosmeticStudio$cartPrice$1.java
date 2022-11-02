package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import gg.essential.gui.state.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010#
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012P\u0010\u0002\u001aL\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u00120\u0012.\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b 	*\u0015\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u000b¢\u0006\u0002\b
                                                   0\u0007¢\u0006\u0002\b
                                                   0\u0003H
                                                   ¢\u0006\u0004\b\f\u0010""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lgg/essential/network/cosmetics/Cosmetic;", "", "Lgg/essential/gui/state/Sale;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Double;" })
static final class CosmeticStudio$cartPrice$1 extends Lambda implements Function1<Pair<? extends List<? extends Pair<? extends String, ? extends Cosmetic>>, ? extends Set<Sale>>, Double> {
    public static final CosmeticStudio$cartPrice$1 INSTANCE;
    
    CosmeticStudio$cartPrice$1() {
        super(1);
    }
    
    @NotNull
    public final Double invoke(@NotNull final Pair<? extends List<Pair<String, Cosmetic>>, ? extends Set<Sale>> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<name for destructuring parameter 0>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1        
        //     7: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //    10: checkcast       Ljava/util/List;
        //    13: astore_2        /* items */
        //    14: aload_1        
        //    15: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //    18: checkcast       Ljava/util/Set;
        //    21: astore_3        /* sale */
        //    22: aload_2         /* items */
        //    23: checkcast       Ljava/lang/Iterable;
        //    26: astore          $this$map$iv
        //    28: aload           $this$map$iv
        //    30: astore          6
        //    32: new             Ljava/util/ArrayList;
        //    35: dup            
        //    36: aload           $this$map$iv
        //    38: bipush          10
        //    40: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    43: invokespecial   java/util/ArrayList.<init>:(I)V
        //    46: checkcast       Ljava/util/Collection;
        //    49: astore          destination$iv$iv
        //    51: aload           $this$mapTo$iv$iv
        //    53: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    58: astore          9
        //    60: aload           9
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            145
        //    70: aload           9
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: astore          item$iv$iv
        //    79: aload           destination$iv$iv
        //    81: aload           item$iv$iv
        //    83: checkcast       Lkotlin/Pair;
        //    86: astore          11
        //    88: astore          22
        //    90: aload           11
        //    92: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //    95: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //    98: astore          cosmetic
        //   100: aload           cosmetic
        //   102: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getStorePackageId:()I
        //   105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   108: aload           cosmetic
        //   110: ldc             "USD"
        //   112: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getPrice:(Ljava/lang/String;)Ljava/lang/Double;
        //   115: dup            
        //   116: ifnull          125
        //   119: invokevirtual   java/lang/Double.doubleValue:()D
        //   122: goto            127
        //   125: pop            
        //   126: dconst_0       
        //   127: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   130: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   133: aload           22
        //   135: swap           
        //   136: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   141: pop            
        //   142: goto            60
        //   145: aload           destination$iv$iv
        //   147: checkcast       Ljava/util/List;
        //   150: checkcast       Ljava/lang/Iterable;
        //   153: astore          4
        //   155: dconst_0       
        //   156: dstore          5
        //   158: aload           4
        //   160: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   165: astore          7
        //   167: aload           7
        //   169: invokeinterface java/util/Iterator.hasNext:()Z
        //   174: ifeq            461
        //   177: aload           7
        //   179: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   184: astore          8
        //   186: dload           5
        //   188: aload           8
        //   190: checkcast       Lkotlin/Pair;
        //   193: astore          9
        //   195: dstore          22
        //   197: aload           9
        //   199: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   202: checkcast       Ljava/lang/Number;
        //   205: invokevirtual   java/lang/Number.intValue:()I
        //   208: istore          id
        //   210: aload           9
        //   212: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   215: checkcast       Ljava/lang/Number;
        //   218: invokevirtual   java/lang/Number.doubleValue:()D
        //   221: dstore          price
        //   223: aload_3         /* sale */
        //   224: ldc             "sale"
        //   226: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   229: aload_3         /* sale */
        //   230: checkcast       Ljava/lang/Iterable;
        //   233: astore          $this$filter$iv
        //   235: aload           $this$filter$iv
        //   237: astore          16
        //   239: new             Ljava/util/ArrayList;
        //   242: dup            
        //   243: invokespecial   java/util/ArrayList.<init>:()V
        //   246: checkcast       Ljava/util/Collection;
        //   249: astore          destination$iv$iv
        //   251: aload           $this$filterTo$iv$iv
        //   253: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   258: astore          18
        //   260: aload           18
        //   262: invokeinterface java/util/Iterator.hasNext:()Z
        //   267: ifeq            309
        //   270: aload           18
        //   272: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   277: astore          element$iv$iv
        //   279: aload           element$iv$iv
        //   281: checkcast       Lgg/essential/gui/state/Sale;
        //   284: astore          it
        //   286: aload           it
        //   288: iload           id
        //   290: invokevirtual   gg/essential/gui/state/Sale.contains:(I)Z
        //   293: ifeq            260
        //   296: aload           destination$iv$iv
        //   298: aload           element$iv$iv
        //   300: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   305: pop            
        //   306: goto            260
        //   309: aload           destination$iv$iv
        //   311: checkcast       Ljava/util/List;
        //   314: checkcast       Ljava/lang/Iterable;
        //   317: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   322: astore          15
        //   324: aload           15
        //   326: invokeinterface java/util/Iterator.hasNext:()Z
        //   331: ifne            338
        //   334: aconst_null    
        //   335: goto            419
        //   338: aload           15
        //   340: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   345: checkcast       Lgg/essential/gui/state/Sale;
        //   348: astore          it
        //   350: aload           it
        //   352: invokevirtual   gg/essential/gui/state/Sale.getDiscountPercent:()I
        //   355: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   358: checkcast       Ljava/lang/Comparable;
        //   361: astore          16
        //   363: aload           15
        //   365: invokeinterface java/util/Iterator.hasNext:()Z
        //   370: ifeq            417
        //   373: aload           15
        //   375: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   380: checkcast       Lgg/essential/gui/state/Sale;
        //   383: astore          it
        //   385: aload           it
        //   387: invokevirtual   gg/essential/gui/state/Sale.getDiscountPercent:()I
        //   390: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   393: checkcast       Ljava/lang/Comparable;
        //   396: astore          17
        //   398: aload           16
        //   400: aload           17
        //   402: invokeinterface java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
        //   407: ifge            363
        //   410: aload           17
        //   412: astore          16
        //   414: goto            363
        //   417: aload           16
        //   419: checkcast       Ljava/lang/Integer;
        //   422: dup            
        //   423: ifnull          432
        //   426: invokevirtual   java/lang/Integer.intValue:()I
        //   429: goto            434
        //   432: pop            
        //   433: iconst_0       
        //   434: istore          discount
        //   436: bipush          100
        //   438: iload           discount
        //   440: isub           
        //   441: i2d            
        //   442: ldc2_w          100.0
        //   445: ddiv           
        //   446: dload           price
        //   448: dmul           
        //   449: dstore          24
        //   451: dload           22
        //   453: dload           24
        //   455: dadd           
        //   456: dstore          5
        //   458: goto            167
        //   461: dload           5
        //   463: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   466: areturn        
        //    Signature:
        //  (Lkotlin/Pair<+Ljava/util/List<Lkotlin/Pair<Ljava/lang/String;Lgg/essential/network/cosmetics/Cosmetic;>;>;+Ljava/util/Set<Lgg/essential/gui/state/Sale;>;>;)Ljava/lang/Double;
        //    StackMapTable: 00 0E FF 00 3C 00 0A 00 00 00 07 00 3E 00 00 00 07 00 4B 00 07 00 51 00 00 FF 00 40 00 17 00 00 00 07 00 3E 00 00 00 07 00 4B 00 07 00 51 00 00 00 00 00 00 00 00 00 00 00 00 07 00 4B 00 02 07 00 60 07 00 6C FF 00 01 00 17 00 00 00 07 00 3E 00 00 00 07 00 4B 00 07 00 51 00 00 00 00 00 00 00 00 00 00 00 00 07 00 4B 00 02 07 00 60 03 FF 00 11 00 08 00 00 00 07 00 3E 00 00 00 07 00 4B 00 00 FF 00 15 00 07 00 00 00 07 00 3E 00 03 07 00 51 00 00 FF 00 5C 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 01 03 00 00 00 07 00 4B 07 00 51 00 00 00 03 00 00 FF 00 30 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 00 03 00 00 00 07 00 4B 00 00 00 00 03 00 00 FF 00 1C 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 00 03 00 07 00 51 00 00 00 00 00 00 03 00 00 FF 00 18 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 00 03 00 07 00 51 07 00 94 00 00 00 00 00 03 00 00 FF 00 35 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 00 03 00 00 07 00 94 00 00 00 00 00 03 00 00 FF 00 01 00 16 00 00 00 07 00 3E 00 00 00 07 00 51 00 00 00 00 03 00 00 00 00 00 00 00 00 03 00 01 07 00 94 4C 07 00 60 41 01 FF 00 1A 00 06 00 00 00 00 00 03 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        CosmeticStudio$cartPrice$1.INSTANCE = new CosmeticStudio$cartPrice$1();
    }
}