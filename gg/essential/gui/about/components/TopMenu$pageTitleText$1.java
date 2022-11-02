package gg.essential.gui.about.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/gui/about/components/Page;", "", "invoke" })
static final class TopMenu$pageTitleText$1 extends Lambda implements Function1<Pair<? extends Page, ? extends Boolean>, String> {
    public static final TopMenu$pageTitleText$1 INSTANCE;
    
    TopMenu$pageTitleText$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Pair<? extends Page, Boolean> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<name for destructuring parameter 0>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1        
        //     7: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //    10: checkcast       Lgg/essential/gui/about/components/Page;
        //    13: astore_2        /* page */
        //    14: aload_1        
        //    15: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //    18: checkcast       Ljava/lang/Boolean;
        //    21: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    24: istore_3        /* platformSpecific */
        //    25: aload_2         /* page */
        //    26: instanceof      Lgg/essential/gui/about/components/ChangelogPage;
        //    29: ifeq            172
        //    32: iload_3         /* platformSpecific */
        //    33: ifeq            167
        //    36: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //    39: invokevirtual   gg/essential/data/VersionData.getMinecraftPlatform$essential:()Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform;
        //    42: invokevirtual   gg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform.name:()Ljava/lang/String;
        //    45: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    48: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    51: dup            
        //    52: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //    54: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    57: astore          4
        //    59: aload           4
        //    61: checkcast       Ljava/lang/CharSequence;
        //    64: invokeinterface java/lang/CharSequence.length:()I
        //    69: ifle            76
        //    72: iconst_1       
        //    73: goto            77
        //    76: iconst_0       
        //    77: ifeq            151
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: aload           4
        //    89: iconst_0       
        //    90: invokevirtual   java/lang/String.charAt:(I)C
        //    93: istore          5
        //    95: astore          6
        //    97: iload           it
        //    99: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
        //   102: dup            
        //   103: ldc             "null cannot be cast to non-null type java.lang.String"
        //   105: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   108: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   111: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   114: dup            
        //   115: ldc             "this as java.lang.String).toUpperCase(Locale.ROOT)"
        //   117: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   120: aload           6
        //   122: swap           
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   126: aload           4
        //   128: astore          5
        //   130: aload           5
        //   132: iconst_1       
        //   133: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   136: dup            
        //   137: ldc             "this as java.lang.String).substring(startIndex)"
        //   139: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: goto            153
        //   151: aload           4
        //   153: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //   156: invokevirtual   gg/essential/data/VersionData.getMinecraftVersion$essential:()Ljava/lang/String;
        //   159: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   164: goto            182
        //   167: ldc             "Full Changelog"
        //   169: goto            182
        //   172: aload_2         /* page */
        //   173: invokevirtual   gg/essential/gui/about/components/Page.getName:()Lgg/essential/elementa/state/BasicState;
        //   176: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   179: checkcast       Ljava/lang/String;
        //   182: areturn        
        //    Signature:
        //  (Lkotlin/Pair<+Lgg/essential/gui/about/components/Page;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 07 FF 00 4C 00 05 00 00 00 00 07 00 5A 00 00 40 01 FB 00 49 FF 00 01 00 00 00 01 07 00 5A 0D FE 00 04 00 00 07 00 38 FF 00 09 00 00 00 01 07 00 5A
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        TopMenu$pageTitleText$1.INSTANCE = new TopMenu$pageTitleText$1();
    }
}