package gg.essential.model;

import kotlin.*;
import gg.essential.network.cosmetics.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import java.util.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import java.util.function.*;
import net.minecraft.client.*;
import gg.essential.util.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.mod.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006	""" }, d2 = { "Lgg/essential/model/AnimatedCape;", "", "()V", "createFrames", "Ljava/util/concurrent/CompletableFuture;", "", "Lnet/minecraft/util/Identifier;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "essential" })
public final class AnimatedCape
{
    private AnimatedCape() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public static final CompletableFuture<List<Identifier>> createFrames(@NotNull final Cosmetic cosmetic) {
        Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
        final CosmeticsManager cosmeticsManager2 = Essential.getInstance().getConnectionManager().getCosmeticsManager();
        Intrinsics.checkNotNullExpressionValue((Object)cosmeticsManager2, "getInstance().connectionManager.cosmeticsManager");
        final CosmeticsManager cosmeticsManager = cosmeticsManager2;
        final CosmeticAssets assets2 = cosmetic.getAssets();
        if (assets2 == null) {
            throw new IllegalArgumentException("Cosmetic has no assets");
        }
        final CosmeticAssets assets = assets2;
        final EssentialAsset texture2 = assets.getTexture();
        if (texture2 == null) {
            throw new IllegalArgumentException("Cosmetic has no texture");
        }
        final EssentialAsset texture = texture2;
        final CompletableFuture<Object> thenApplyAsync = cosmeticsManager.getAssetBytes(texture).thenApplyAsync((Function<? super byte[], ?>)AnimatedCape::createFrames$lambda-1);
        final Function<List, List> fn = AnimatedCape::createFrames$lambda-3;
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        final CompletableFuture<Object> thenApplyAsync2 = thenApplyAsync.thenApplyAsync((Function<? super Object, ?>)fn, ExtensionsKt.getExecutor(instance));
        Intrinsics.checkNotNullExpressionValue((Object)thenApplyAsync2, "cosmeticsManager.getAsse\u2026t.getInstance().executor)");
        return (CompletableFuture<List<Identifier>>)thenApplyAsync2;
    }
    
    private static final List createFrames$lambda-1(final Cosmetic $cosmetic, final byte[] bytes) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$cosmetic"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/universal/UImage.Companion:Lgg/essential/universal/UImage$Companion;
        //     9: aload_1         /* bytes */
        //    10: ldc             "bytes"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_1         /* bytes */
        //    16: invokestatic    gg/essential/util/ExtensionsKt.read:(Lgg/essential/universal/UImage$Companion;[B)Lgg/essential/universal/UImage;
        //    19: astore_2        /* fullImage */
        //    20: aload_2         /* fullImage */
        //    21: invokevirtual   gg/essential/universal/UImage.getHeight:()I
        //    24: bipush          32
        //    26: idiv           
        //    27: istore_3        /* frameCount */
        //    28: aload_2         /* fullImage */
        //    29: invokevirtual   gg/essential/universal/UImage.getWidth:()I
        //    32: bipush          64
        //    34: if_icmpne       48
        //    37: aload_2         /* fullImage */
        //    38: invokevirtual   gg/essential/universal/UImage.getHeight:()I
        //    41: bipush          32
        //    43: iload_3         /* frameCount */
        //    44: imul           
        //    45: if_icmpeq       99
        //    48: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //    51: aload_0         /* $cosmetic */
        //    52: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //    55: aload_2         /* fullImage */
        //    56: invokevirtual   gg/essential/universal/UImage.getWidth:()I
        //    59: aload_2         /* fullImage */
        //    60: invokevirtual   gg/essential/universal/UImage.getHeight:()I
        //    63: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
        //    68: invokeinterface org/apache/logging/log4j/Logger.warn:(Ljava/lang/String;)V
        //    73: new             Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture;
        //    76: dup            
        //    77: aload_0         /* $cosmetic */
        //    78: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //    81: new             Lgg/essential/universal/utils/ReleasedDynamicTexture;
        //    84: dup            
        //    85: aload_2         /* fullImage */
        //    86: invokevirtual   gg/essential/universal/UImage.getNativeImage:()Lnet/minecraft/client/texture/NativeImage;
        //    89: invokespecial   gg/essential/universal/utils/ReleasedDynamicTexture.<init>:(Lnet/minecraft/client/texture/NativeImage;)V
        //    92: invokespecial   gg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture.<init>:(Ljava/lang/String;Lgg/essential/universal/utils/ReleasedDynamicTexture;)V
        //    95: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //    98: areturn        
        //    99: iconst_0       
        //   100: iload_3         /* frameCount */
        //   101: invokestatic    kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        //   104: checkcast       Ljava/lang/Iterable;
        //   107: astore          $this$map$iv
        //   109: aload           $this$map$iv
        //   111: astore          5
        //   113: new             Ljava/util/ArrayList;
        //   116: dup            
        //   117: aload           $this$map$iv
        //   119: bipush          10
        //   121: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   124: invokespecial   java/util/ArrayList.<init>:(I)V
        //   127: checkcast       Ljava/util/Collection;
        //   130: astore          destination$iv$iv
        //   132: aload           $this$mapTo$iv$iv
        //   134: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   139: astore          7
        //   141: aload           7
        //   143: invokeinterface java/util/Iterator.hasNext:()Z
        //   148: ifeq            279
        //   151: aload           7
        //   153: checkcast       Lkotlin/collections/IntIterator;
        //   156: invokevirtual   kotlin/collections/IntIterator.nextInt:()I
        //   159: istore          item$iv$iv
        //   161: aload           destination$iv$iv
        //   163: astore          13
        //   165: iload           item$iv$iv
        //   167: bipush          32
        //   169: imul           
        //   170: istore          frameY
        //   172: getstatic       gg/essential/universal/UImage.Companion:Lgg/essential/universal/UImage$Companion;
        //   175: bipush          64
        //   177: bipush          32
        //   179: iconst_0       
        //   180: invokevirtual   gg/essential/universal/UImage$Companion.ofSize:(IIZ)Lgg/essential/universal/UImage;
        //   183: astore          frame
        //   185: iconst_0       
        //   186: istore          y
        //   188: iload           y
        //   190: bipush          32
        //   192: if_icmpge       237
        //   195: iconst_0       
        //   196: istore          x
        //   198: iload           x
        //   200: bipush          64
        //   202: if_icmpge       231
        //   205: aload           frame
        //   207: iload           x
        //   209: iload           y
        //   211: aload_2         /* fullImage */
        //   212: iload           x
        //   214: iload           frameY
        //   216: iload           y
        //   218: iadd           
        //   219: invokevirtual   gg/essential/universal/UImage.getPixelRGBA:(II)I
        //   222: invokevirtual   gg/essential/universal/UImage.setPixelRGBA:(III)V
        //   225: iinc            x, 1
        //   228: goto            198
        //   231: iinc            y, 1
        //   234: goto            188
        //   237: new             Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture;
        //   240: dup            
        //   241: aload_0         /* $cosmetic */
        //   242: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   245: iload           item$iv$iv
        //   247: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        //   252: new             Lgg/essential/universal/utils/ReleasedDynamicTexture;
        //   255: dup            
        //   256: aload           frame
        //   258: invokevirtual   gg/essential/universal/UImage.getNativeImage:()Lnet/minecraft/client/texture/NativeImage;
        //   261: invokespecial   gg/essential/universal/utils/ReleasedDynamicTexture.<init>:(Lnet/minecraft/client/texture/NativeImage;)V
        //   264: invokespecial   gg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture.<init>:(Ljava/lang/String;Lgg/essential/universal/utils/ReleasedDynamicTexture;)V
        //   267: aload           13
        //   269: swap           
        //   270: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   275: pop            
        //   276: goto            141
        //   279: aload           destination$iv$iv
        //   281: checkcast       Ljava/util/List;
        //   284: areturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  $cosmetic  
        //  bytes      
        //    StackMapTable: 00 08 FD 00 30 07 00 9A 01 32 FF 00 29 00 08 07 00 3F 07 00 F0 07 00 9A 01 07 00 DF 07 00 DF 07 00 EA 07 00 F2 00 00 FF 00 2E 00 0E 07 00 3F 07 00 F0 07 00 9A 01 07 00 DF 07 00 DF 07 00 EA 07 00 F2 01 01 07 00 9A 01 00 07 00 EA 00 00 FF 00 09 00 0E 07 00 3F 07 00 F0 07 00 9A 01 07 00 DF 07 00 DF 07 00 EA 07 00 F2 01 01 07 00 9A 01 01 07 00 EA 00 00 20 FF 00 05 00 0E 07 00 3F 07 00 F0 07 00 9A 01 07 00 DF 07 00 DF 07 00 EA 07 00 F2 01 01 07 00 9A 01 00 07 00 EA 00 00 FF 00 29 00 08 07 00 3F 07 00 F0 07 00 9A 01 07 00 DF 07 00 DF 07 00 EA 07 00 F2 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final List createFrames$lambda-3(final List frames) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "frames"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* frames */
        //     8: checkcast       Ljava/lang/Iterable;
        //    11: astore_1        /* $this$map$iv */
        //    12: aload_1         /* $this$map$iv */
        //    13: astore_2       
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: aload_1         /* $this$map$iv */
        //    19: bipush          10
        //    21: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    24: invokespecial   java/util/ArrayList.<init>:(I)V
        //    27: checkcast       Ljava/util/Collection;
        //    30: astore_3        /* destination$iv$iv */
        //    31: aload_2         /* $this$mapTo$iv$iv */
        //    32: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    37: astore          4
        //    39: aload           4
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            85
        //    49: aload           4
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: astore          item$iv$iv
        //    58: aload_3         /* destination$iv$iv */
        //    59: aload           item$iv$iv
        //    61: checkcast       Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture;
        //    64: astore          6
        //    66: astore          7
        //    68: aload           it
        //    70: invokevirtual   gg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture.getIdentifier:()Lnet/minecraft/util/Identifier;
        //    73: aload           7
        //    75: swap           
        //    76: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    81: pop            
        //    82: goto            39
        //    85: aload_3         /* destination$iv$iv */
        //    86: checkcast       Ljava/util/List;
        //    89: areturn        
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  frames  
        //    StackMapTable: 00 02 FF 00 27 00 05 07 01 14 07 00 DF 07 00 DF 07 00 EA 07 00 F2 00 00 2D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        new AnimatedCape();
    }
}
