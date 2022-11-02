package gg.essential.cosmetics;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/model/EnumPart;", "setting", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "invoke" })
static final class CosmeticsState$partsHiddenDueToSetting$2 extends Lambda implements Function1<CosmeticSetting, Iterable<? extends EnumPart>> {
    public static final CosmeticsState$partsHiddenDueToSetting$2 INSTANCE;
    
    CosmeticsState$partsHiddenDueToSetting$2() {
        super(1);
    }
    
    @NotNull
    public final Iterable<EnumPart> invoke(@NotNull final CosmeticSetting setting) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "setting"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: invokestatic    gg/essential/cosmetics/CosmeticsState.access$getBODY_PART_MAP$cp:()Ljava/util/Map;
        //     9: astore_2        /* $this$flatMap$iv */
        //    10: aload_2         /* $this$flatMap$iv */
        //    11: astore_3       
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore          destination$iv$iv
        //    24: aload_3         /* $this$flatMapTo$iv$iv */
        //    25: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    30: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    35: astore          5
        //    37: aload           5
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            127
        //    47: aload           5
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: checkcast       Ljava/util/Map$Entry;
        //    57: astore          element$iv$iv
        //    59: aload           element$iv$iv
        //    61: astore          7
        //    63: aload           7
        //    65: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    70: checkcast       Ljava/lang/String;
        //    73: astore          key
        //    75: aload           7
        //    77: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    82: checkcast       Ljava/util/List;
        //    85: astore          hiddenParts
        //    87: aload_1         /* setting */
        //    88: aload           key
        //    90: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //    93: iconst_1       
        //    94: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   100: ifeq            108
        //   103: aload           hiddenParts
        //   105: goto            111
        //   108: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   111: checkcast       Ljava/lang/Iterable;
        //   114: astore          list$iv$iv
        //   116: aload           destination$iv$iv
        //   118: aload           list$iv$iv
        //   120: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   123: pop            
        //   124: goto            37
        //   127: aload           destination$iv$iv
        //   129: checkcast       Ljava/util/List;
        //   132: checkcast       Ljava/lang/Iterable;
        //   135: areturn        
        //    Signature:
        //  (Lgg/essential/mod/cosmetics/CosmeticSetting;)Ljava/lang/Iterable<Lgg/essential/model/EnumPart;>;
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  setting  
        //    StackMapTable: 00 04 FF 00 25 00 06 00 07 00 48 00 00 07 00 3A 07 00 4A 00 00 FB 00 46 42 07 00 5E FF 00 0F 00 05 00 00 00 00 07 00 3A 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((CosmeticSetting)p1);
    }
    
    static {
        CosmeticsState$partsHiddenDueToSetting$2.INSTANCE = new CosmeticsState$partsHiddenDueToSetting$2();
    }
}