package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.network.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "Lkotlin/Pair;", "", "Lgg/essential/network/cosmetics/Cosmetic;", "cartItems", "", "invoke" })
static final class CosmeticStudio$cartCosmetics$1 extends Lambda implements Function1<Set<? extends String>, List<? extends Pair<? extends String, ? extends Cosmetic>>> {
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$cartCosmetics$1(final CosmeticStudio $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final List<Pair<String, Cosmetic>> invoke(@NotNull final Set<String> cartItems) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cartItems"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* cartItems */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_2       
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/gui/studio/CosmeticStudio$cartCosmetics$1.this$0:Lgg/essential/gui/studio/CosmeticStudio;
        //    15: astore_3       
        //    16: aload_2         /* $this$mapNotNull$iv */
        //    17: astore          4
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore          destination$iv$iv
        //    31: aload           $this$mapNotNullTo$iv$iv
        //    33: astore          $this$forEach$iv$iv$iv
        //    35: aload           $this$forEach$iv$iv$iv
        //    37: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    42: astore          7
        //    44: aload           7
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            132
        //    54: aload           7
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: astore          element$iv$iv$iv
        //    63: aload           element$iv$iv$iv
        //    65: astore          element$iv$iv
        //    67: aload           element$iv$iv
        //    69: checkcast       Ljava/lang/String;
        //    72: astore          it
        //    74: aload_3        
        //    75: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    78: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmetics:()Ljava/util/Map;
        //    81: aload           it
        //    83: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    88: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //    91: dup            
        //    92: ifnonnull       100
        //    95: pop            
        //    96: aconst_null    
        //    97: goto            109
        //   100: astore          cosmetic
        //   102: aload           it
        //   104: aload           cosmetic
        //   106: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   109: dup            
        //   110: ifnull          128
        //   113: astore          it$iv$iv
        //   115: aload           destination$iv$iv
        //   117: aload           it$iv$iv
        //   119: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   124: pop            
        //   125: goto            44
        //   128: pop            
        //   129: goto            44
        //   132: aload           destination$iv$iv
        //   134: checkcast       Ljava/util/List;
        //   137: areturn        
        //    Signature:
        //  (Ljava/util/Set<Ljava/lang/String;>;)Ljava/util/List<Lkotlin/Pair<Ljava/lang/String;Lgg/essential/network/cosmetics/Cosmetic;>;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  cartItems  
        //    StackMapTable: 00 05 FF 00 2C 00 08 00 00 00 07 00 0A 00 07 00 3B 00 07 00 41 00 00 FF 00 37 00 0B 00 00 00 07 00 0A 00 07 00 3B 00 07 00 41 00 00 07 00 4B 00 01 07 00 5D FF 00 08 00 08 00 00 00 07 00 0A 00 07 00 3B 00 07 00 41 00 01 07 00 65 52 07 00 65 FF 00 03 00 06 00 00 00 00 00 07 00 3B 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set)p1);
    }
}