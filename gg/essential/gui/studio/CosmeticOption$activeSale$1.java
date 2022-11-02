package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.gui.state.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0000\u0010\u0000\u001a\u0004\u0018\u00010\u000122\u0010\u0002\u001a.\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0015\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00010\u00010\u0006¢\u0006\u0002\b\u00050\u0003¢\u0006\u0002\b\u0005H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "Lgg/essential/gui/state/Sale;", "set", "", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "", "invoke" })
static final class CosmeticOption$activeSale$1 extends Lambda implements Function1<Set<Sale>, Sale> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$activeSale$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @Nullable
    public final Sale invoke(@NotNull final Set<Sale> set) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "set"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* set */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_2       
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/gui/studio/CosmeticOption$activeSale$1.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //    15: astore_3       
        //    16: aload_2         /* $this$filter$iv */
        //    17: astore          5
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore          destination$iv$iv
        //    31: aload           $this$filterTo$iv$iv
        //    33: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    38: astore          8
        //    40: aload           8
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            94
        //    50: aload           8
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: astore          element$iv$iv
        //    59: aload           element$iv$iv
        //    61: checkcast       Lgg/essential/gui/state/Sale;
        //    64: astore          it
        //    66: aload           it
        //    68: aload_3        
        //    69: invokevirtual   gg/essential/gui/studio/CosmeticOption.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
        //    72: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getStorePackageId:()I
        //    75: invokevirtual   gg/essential/gui/state/Sale.contains:(I)Z
        //    78: ifeq            40
        //    81: aload           destination$iv$iv
        //    83: aload           element$iv$iv
        //    85: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    90: pop            
        //    91: goto            40
        //    94: aload           destination$iv$iv
        //    96: checkcast       Ljava/util/List;
        //    99: checkcast       Ljava/lang/Iterable;
        //   102: astore_2        /* $this$maxByOrNull$iv */
        //   103: aload_2         /* $this$maxByOrNull$iv */
        //   104: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   109: astore          iterator$iv
        //   111: aload           iterator$iv
        //   113: invokeinterface java/util/Iterator.hasNext:()Z
        //   118: ifne            125
        //   121: aconst_null    
        //   122: goto            213
        //   125: aload           iterator$iv
        //   127: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   132: astore          maxElem$iv
        //   134: aload           iterator$iv
        //   136: invokeinterface java/util/Iterator.hasNext:()Z
        //   141: ifne            149
        //   144: aload           maxElem$iv
        //   146: goto            213
        //   149: aload           maxElem$iv
        //   151: checkcast       Lgg/essential/gui/state/Sale;
        //   154: astore          it
        //   156: aload           it
        //   158: invokevirtual   gg/essential/gui/state/Sale.getDiscountPercent:()I
        //   161: istore          maxValue$iv
        //   163: aload           iterator$iv
        //   165: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   170: astore          e$iv
        //   172: aload           e$iv
        //   174: checkcast       Lgg/essential/gui/state/Sale;
        //   177: astore          it
        //   179: aload           it
        //   181: invokevirtual   gg/essential/gui/state/Sale.getDiscountPercent:()I
        //   184: istore          v$iv
        //   186: iload           maxValue$iv
        //   188: iload           v$iv
        //   190: if_icmpge       201
        //   193: aload           e$iv
        //   195: astore          maxElem$iv
        //   197: iload           v$iv
        //   199: istore          maxValue$iv
        //   201: aload           iterator$iv
        //   203: invokeinterface java/util/Iterator.hasNext:()Z
        //   208: ifne            163
        //   211: aload           maxElem$iv
        //   213: checkcast       Lgg/essential/gui/state/Sale;
        //   216: areturn        
        //    Signature:
        //  (Ljava/util/Set<Lgg/essential/gui/state/Sale;>;)Lgg/essential/gui/state/Sale;
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  set   
        //    StackMapTable: 00 07 FF 00 28 00 09 00 00 00 07 00 0A 00 00 07 00 3E 00 07 00 44 00 00 FF 00 35 00 07 00 00 00 00 00 00 07 00 3E 00 00 FF 00 1E 00 05 00 00 00 00 07 00 44 00 00 FC 00 17 07 00 64 FC 00 0D 01 25 FF 00 0B 00 00 00 01 07 00 64
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set)p1);
    }
}