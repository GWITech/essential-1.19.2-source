package gg.essential.cosmetics;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/model/EnumPart;", "setting", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "invoke" })
static final class CosmeticsState$partsHiddenDueToArmor$2 extends Lambda implements Function1<CosmeticSetting, Iterable<? extends EnumPart>> {
    final /* synthetic */ CosmeticsState this$0;
    
    CosmeticsState$partsHiddenDueToArmor$2(final CosmeticsState $receiver) {
        this.this$0 = $receiver;
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
        //     9: astore_2       
        //    10: aload_0         /* this */
        //    11: getfield        gg/essential/cosmetics/CosmeticsState$partsHiddenDueToArmor$2.this$0:Lgg/essential/cosmetics/CosmeticsState;
        //    14: astore_3       
        //    15: aload_2         /* $this$flatMap$iv */
        //    16: astore          4
        //    18: new             Ljava/util/ArrayList;
        //    21: dup            
        //    22: invokespecial   java/util/ArrayList.<init>:()V
        //    25: checkcast       Ljava/util/Collection;
        //    28: astore          destination$iv$iv
        //    30: aload           $this$flatMapTo$iv$iv
        //    32: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    37: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    42: astore          6
        //    44: aload           6
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            222
        //    54: aload           6
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: checkcast       Ljava/util/Map$Entry;
        //    64: astore          element$iv$iv
        //    66: aload           element$iv$iv
        //    68: astore          8
        //    70: aload           8
        //    72: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/String;
        //    80: astore          key
        //    82: aload           8
        //    84: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    89: checkcast       Ljava/util/List;
        //    92: astore          hiddenParts
        //    94: aload_1         /* setting */
        //    95: aload           key
        //    97: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //   100: iconst_1       
        //   101: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   104: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   107: ifeq            203
        //   110: aload           hiddenParts
        //   112: checkcast       Ljava/lang/Iterable;
        //   115: astore          $this$filter$iv
        //   117: aload           $this$filter$iv
        //   119: astore          12
        //   121: new             Ljava/util/ArrayList;
        //   124: dup            
        //   125: invokespecial   java/util/ArrayList.<init>:()V
        //   128: checkcast       Ljava/util/Collection;
        //   131: astore          destination$iv$iv
        //   133: aload           $this$filterTo$iv$iv
        //   135: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   140: astore          14
        //   142: aload           14
        //   144: invokeinterface java/util/Iterator.hasNext:()Z
        //   149: ifeq            195
        //   152: aload           14
        //   154: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   159: astore          element$iv$iv
        //   161: aload           element$iv$iv
        //   163: checkcast       Lgg/essential/model/EnumPart;
        //   166: astore          it
        //   168: aload_3        
        //   169: invokevirtual   gg/essential/cosmetics/CosmeticsState.getArmor:()Ljava/util/Set;
        //   172: aload           it
        //   174: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   179: ifeq            142
        //   182: aload           destination$iv$iv
        //   184: aload           element$iv$iv
        //   186: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   191: pop            
        //   192: goto            142
        //   195: aload           destination$iv$iv
        //   197: checkcast       Ljava/util/List;
        //   200: goto            206
        //   203: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   206: checkcast       Ljava/lang/Iterable;
        //   209: astore          list$iv$iv
        //   211: aload           destination$iv$iv
        //   213: aload           list$iv$iv
        //   215: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   218: pop            
        //   219: goto            44
        //   222: aload           destination$iv$iv
        //   224: checkcast       Ljava/util/List;
        //   227: checkcast       Ljava/lang/Iterable;
        //   230: areturn        
        //    Signature:
        //  (Lgg/essential/mod/cosmetics/CosmeticSetting;)Ljava/lang/Iterable<Lgg/essential/model/EnumPart;>;
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  setting  
        //    StackMapTable: 00 06 FF 00 2C 00 07 00 07 00 4D 00 07 00 0A 00 07 00 3F 07 00 4F 00 00 FF 00 61 00 0F 00 07 00 4D 00 07 00 0A 00 07 00 3F 07 00 4F 00 00 00 00 00 00 07 00 3F 07 00 4F 00 00 FA 00 34 FF 00 07 00 07 00 07 00 4D 00 07 00 0A 00 07 00 3F 07 00 4F 00 00 42 07 00 63 FF 00 0F 00 06 00 00 00 00 00 07 00 3F 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((CosmeticSetting)p1);
    }
}