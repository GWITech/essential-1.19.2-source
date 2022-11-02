package gg.essential.gui.about.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "specific", "", "invoke" })
static final class TopMenu$1 extends Lambda implements Function1<Boolean, String> {
    public static final TopMenu$1 INSTANCE;
    
    TopMenu$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final boolean specific) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifne            126
        //     4: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //     7: invokevirtual   gg/essential/data/VersionData.getMinecraftPlatform$essential:()Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform;
        //    10: invokevirtual   gg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform.name:()Ljava/lang/String;
        //    13: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    16: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    19: dup            
        //    20: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: astore_2       
        //    26: aload_2        
        //    27: checkcast       Ljava/lang/CharSequence;
        //    30: invokeinterface java/lang/CharSequence.length:()I
        //    35: ifle            42
        //    38: iconst_1       
        //    39: goto            43
        //    42: iconst_0       
        //    43: ifeq            111
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: aload_2        
        //    54: iconst_0       
        //    55: invokevirtual   java/lang/String.charAt:(I)C
        //    58: istore_3       
        //    59: astore          4
        //    61: iload_3        
        //    62: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
        //    65: dup            
        //    66: ldc             "null cannot be cast to non-null type java.lang.String"
        //    68: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    71: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    74: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    77: dup            
        //    78: ldc             "this as java.lang.String).toUpperCase(Locale.ROOT)"
        //    80: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    83: aload           4
        //    85: swap           
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    89: aload_2        
        //    90: astore_3       
        //    91: aload_3        
        //    92: iconst_1       
        //    93: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    96: dup            
        //    97: ldc             "this as java.lang.String).substring(startIndex)"
        //    99: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: goto            112
        //   111: aload_2        
        //   112: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //   115: invokevirtual   gg/essential/data/VersionData.getMinecraftVersion$essential:()Ljava/lang/String;
        //   118: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   123: goto            128
        //   126: ldc             "Show full changelog"
        //   128: areturn        
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  specific  
        //    StackMapTable: 00 06 FF 00 2A 00 03 00 00 07 00 3D 00 00 40 01 FB 00 43 FF 00 00 00 00 00 01 07 00 3D 0D 41 07 00 3D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        INSTANCE = new Function1<Boolean, String>() {
            public static final TopMenu$1 INSTANCE;
            
            TopMenu$1() {
                super(1);
            }
            
            @NotNull
            public final String invoke(final boolean specific) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: ifne            126
                //     4: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
                //     7: invokevirtual   gg/essential/data/VersionData.getMinecraftPlatform$essential:()Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform;
                //    10: invokevirtual   gg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform.name:()Ljava/lang/String;
                //    13: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
                //    16: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
                //    19: dup            
                //    20: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
                //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
                //    25: astore_2       
                //    26: aload_2        
                //    27: checkcast       Ljava/lang/CharSequence;
                //    30: invokeinterface java/lang/CharSequence.length:()I
                //    35: ifle            42
                //    38: iconst_1       
                //    39: goto            43
                //    42: iconst_0       
                //    43: ifeq            111
                //    46: new             Ljava/lang/StringBuilder;
                //    49: dup            
                //    50: invokespecial   java/lang/StringBuilder.<init>:()V
                //    53: aload_2        
                //    54: iconst_0       
                //    55: invokevirtual   java/lang/String.charAt:(I)C
                //    58: istore_3       
                //    59: astore          4
                //    61: iload_3        
                //    62: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
                //    65: dup            
                //    66: ldc             "null cannot be cast to non-null type java.lang.String"
                //    68: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
                //    71: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
                //    74: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
                //    77: dup            
                //    78: ldc             "this as java.lang.String).toUpperCase(Locale.ROOT)"
                //    80: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
                //    83: aload           4
                //    85: swap           
                //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //    89: aload_2        
                //    90: astore_3       
                //    91: aload_3        
                //    92: iconst_1       
                //    93: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
                //    96: dup            
                //    97: ldc             "this as java.lang.String).substring(startIndex)"
                //    99: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
                //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   108: goto            112
                //   111: aload_2        
                //   112: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
                //   115: invokevirtual   gg/essential/data/VersionData.getMinecraftVersion$essential:()Ljava/lang/String;
                //   118: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                //   123: goto            128
                //   126: ldc             "Show full changelog"
                //   128: areturn        
                //    MethodParameters:
                //  Name      Flags  
                //  --------  -----
                //  specific  
                //    StackMapTable: 00 06 FF 00 2A 00 03 00 00 07 00 3D 00 00 40 01 FB 00 43 FF 00 00 00 00 00 01 07 00 3D 0D 41 07 00 3D
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((boolean)p1);
            }
        };
    }
}