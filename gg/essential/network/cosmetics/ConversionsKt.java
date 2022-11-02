package gg.essential.network.cosmetics;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.cosmetics.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.model.*;
import gg.essential.cosmetics.model.*;
import java.util.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000X
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010 
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003\u001a
                                                   \u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a
                                                   \u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a
                                                   \u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a
                                                   \u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010	*\b\u0012\u0004\u0012\u00020\u00020	H\u0007¢\u0006\u0002\b
                                                   \u001a)\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\b\r\u001a
                                                   \u0010\u000e\u001a\u00020\u0004*\u00020\u0003\u001a
                                                   \u0010\u000e\u001a\u00020\b*\u00020\u0007\u001a
                                                   \u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a
                                                   \u0010\u000e\u001a\u00020\u0011*\u00020\u0012\u001a
                                                   \u0010\u000e\u001a\u00020\u0002*\u00020\u0001\u001a
                                                   \u0010\u000e\u001a\u00020\u0006*\u00020\u0005\u001a
                                                   \u0010\u000e\u001a\u00020\u0013*\u00020\u0014\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110	*\b\u0012\u0004\u0012\u00020\u00120	H\u0007¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020	*\b\u0012\u0004\u0012\u00020\u00010	H\u0007¢\u0006\u0002\b\u0016\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u000b*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u000bH\u0007¢\u0006\u0002\b\u0018\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000b*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\b\u0019\u001a5\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00020	0\u000b*\u0014\u0012\u0004\u0012\u00020\u0017\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00010	0\u000bH\u0007¢\u0006\u0002\b\u0016¨\u0006\u001a""" }, d2 = { "toInfra", "Lgg/essential/cosmetics/model/CosmeticSetting;", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "Lgg/essential/cosmetics/CosmeticSlot;", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/cosmetics/model/CosmeticType;", "Lgg/essential/mod/cosmetics/CosmeticType;", "Lgg/essential/cosmetics/SkinLayer;", "Lgg/essential/mod/cosmetics/SkinLayer;", "", "settingsToInfra", "", "", "skinLayersToInfra", "toMod", "Lgg/essential/mod/cosmetics/CosmeticAssets;", "Lgg/essential/cosmetics/model/CosmeticAssets;", "Lgg/essential/mod/cosmetics/CosmeticOutfit;", "Lgg/essential/cosmetics/model/CosmeticOutfit;", "Lgg/essential/mod/EssentialAsset;", "Lgg/essential/model/EssentialAsset;", "outfitsToMod", "settingsToMod", "", "slotsToMod", "skinLayersToMod", "essential" })
public final class ConversionsKt
{
    @NotNull
    public static final gg.essential.cosmetics.CosmeticSlot toInfra(@NotNull final CosmeticSlot $this$toInfra) {
        Intrinsics.checkNotNullParameter((Object)$this$toInfra, "<this>");
        return gg.essential.cosmetics.CosmeticSlot.valueOf($this$toInfra.name());
    }
    
    @NotNull
    public static final CosmeticSlot toMod(@NotNull final gg.essential.cosmetics.CosmeticSlot $this$toMod) {
        Intrinsics.checkNotNullParameter((Object)$this$toMod, "<this>");
        return CosmeticSlot.valueOf($this$toMod.name());
    }
    
    @NotNull
    public static final gg.essential.mod.cosmetics.SkinLayer toMod(@NotNull final SkinLayer $this$toMod) {
        Intrinsics.checkNotNullParameter((Object)$this$toMod, "<this>");
        return gg.essential.mod.cosmetics.SkinLayer.valueOf($this$toMod.name());
    }
    
    @NotNull
    public static final gg.essential.cosmetics.model.CosmeticSetting toInfra(@NotNull final CosmeticSetting $this$toInfra) {
        Intrinsics.checkNotNullParameter((Object)$this$toInfra, "<this>");
        return new gg.essential.cosmetics.model.CosmeticSetting($this$toInfra.getId(), $this$toInfra.getType(), $this$toInfra.isEnabled(), $this$toInfra.getData());
    }
    
    @NotNull
    public static final CosmeticSetting toMod(@NotNull final gg.essential.cosmetics.model.CosmeticSetting $this$toMod) {
        Intrinsics.checkNotNullParameter((Object)$this$toMod, "<this>");
        final String id = $this$toMod.getId();
        final String type = $this$toMod.getType();
        Intrinsics.checkNotNullExpressionValue((Object)type, "type");
        final boolean enabled = $this$toMod.isEnabled();
        final Map<String, Object> data = $this$toMod.getData();
        Intrinsics.checkNotNullExpressionValue((Object)data, "data");
        return new CosmeticSetting(id, type, enabled, data);
    }
    
    @NotNull
    public static final gg.essential.mod.cosmetics.CosmeticType toMod(@NotNull final CosmeticType $this$toMod) {
        Intrinsics.checkNotNullParameter((Object)$this$toMod, "<this>");
        final String id = $this$toMod.getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "id");
        final gg.essential.cosmetics.CosmeticSlot slot = $this$toMod.getSlot();
        Intrinsics.checkNotNullExpressionValue((Object)slot, "slot");
        final CosmeticSlot mod = toMod(slot);
        final Map<String, String> displayNames = $this$toMod.getDisplayNames();
        Intrinsics.checkNotNullExpressionValue((Object)displayNames, "displayNames");
        final Map<SkinLayer, Boolean> skinLayers = $this$toMod.getSkinLayers();
        return new gg.essential.mod.cosmetics.CosmeticType(id, mod, displayNames, (skinLayers != null) ? skinLayersToMod(skinLayers) : null);
    }
    
    @NotNull
    public static final gg.essential.mod.EssentialAsset toMod(@NotNull final EssentialAsset $this$toMod) {
        Intrinsics.checkNotNullParameter((Object)$this$toMod, "<this>");
        final String url = $this$toMod.getUrl();
        Intrinsics.checkNotNullExpressionValue((Object)url, "url");
        final String checksum = $this$toMod.getChecksum();
        Intrinsics.checkNotNullExpressionValue((Object)checksum, "checksum");
        return new gg.essential.mod.EssentialAsset(url, checksum);
    }
    
    @NotNull
    public static final gg.essential.mod.cosmetics.CosmeticAssets toMod(@NotNull final CosmeticAssets $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getThumbnail:()Lgg/essential/model/EssentialAsset;
        //    10: dup            
        //    11: ldc             "thumbnail"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //    19: aload_0         /* $this$toMod */
        //    20: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getTexture:()Lgg/essential/model/EssentialAsset;
        //    23: dup            
        //    24: ldc             "texture"
        //    26: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //    32: aload_0         /* $this$toMod */
        //    33: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getGeometry:()Lgg/essential/cosmetics/model/CosmeticGeometry;
        //    36: astore_1       
        //    37: astore          6
        //    39: astore          5
        //    41: new             Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;
        //    44: dup            
        //    45: aload_1         /* $this$toMod_u24lambda_u2d0 */
        //    46: invokevirtual   gg/essential/cosmetics/model/CosmeticGeometry.getSteve:()Lgg/essential/model/EssentialAsset;
        //    49: dup            
        //    50: ldc             "steve"
        //    52: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //    58: aload_1         /* $this$toMod_u24lambda_u2d0 */
        //    59: invokevirtual   gg/essential/cosmetics/model/CosmeticGeometry.getAlex:()Lgg/essential/model/EssentialAsset;
        //    62: astore_3       
        //    63: aload_3        
        //    64: dup            
        //    65: ifnull          80
        //    68: ldc             "alex"
        //    70: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    73: aload_3        
        //    74: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //    77: goto            82
        //    80: pop            
        //    81: aconst_null    
        //    82: invokespecial   gg/essential/mod/cosmetics/CosmeticAssets$Geometry.<init>:(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;)V
        //    85: astore          7
        //    87: aload           5
        //    89: aload           6
        //    91: aload           7
        //    93: aload_0         /* $this$toMod */
        //    94: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getAnimations:()Lgg/essential/model/EssentialAsset;
        //    97: dup            
        //    98: ifnull          107
        //   101: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //   104: goto            109
        //   107: pop            
        //   108: aconst_null    
        //   109: aload_0         /* $this$toMod */
        //   110: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getSkinMask:()Lgg/essential/cosmetics/model/CosmeticSkinMask;
        //   113: dup            
        //   114: ifnull          202
        //   117: astore_2       
        //   118: astore          8
        //   120: astore          7
        //   122: astore          6
        //   124: astore          5
        //   126: new             Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;
        //   129: dup            
        //   130: aload_2         /* $this$toMod_u24lambda_u2d1 */
        //   131: invokevirtual   gg/essential/cosmetics/model/CosmeticSkinMask.getSteve:()Lgg/essential/model/EssentialAsset;
        //   134: astore          4
        //   136: aload           4
        //   138: dup            
        //   139: ifnull          155
        //   142: ldc             "steve"
        //   144: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   147: aload           4
        //   149: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //   152: goto            157
        //   155: pop            
        //   156: aconst_null    
        //   157: aload_2         /* $this$toMod_u24lambda_u2d1 */
        //   158: invokevirtual   gg/essential/cosmetics/model/CosmeticSkinMask.getAlex:()Lgg/essential/model/EssentialAsset;
        //   161: astore          4
        //   163: aload           4
        //   165: dup            
        //   166: ifnull          182
        //   169: ldc             "alex"
        //   171: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   174: aload           4
        //   176: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //   179: goto            184
        //   182: pop            
        //   183: aconst_null    
        //   184: invokespecial   gg/essential/mod/cosmetics/CosmeticAssets$SkinMask.<init>:(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;)V
        //   187: astore          9
        //   189: aload           5
        //   191: aload           6
        //   193: aload           7
        //   195: aload           8
        //   197: aload           9
        //   199: goto            204
        //   202: pop            
        //   203: aconst_null    
        //   204: aload_0         /* $this$toMod */
        //   205: invokevirtual   gg/essential/cosmetics/model/CosmeticAssets.getSettings:()Lgg/essential/model/EssentialAsset;
        //   208: dup            
        //   209: ifnull          218
        //   212: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/model/EssentialAsset;)Lgg/essential/mod/EssentialAsset;
        //   215: goto            220
        //   218: pop            
        //   219: aconst_null    
        //   220: astore          10
        //   222: astore          11
        //   224: astore          12
        //   226: astore          13
        //   228: astore          14
        //   230: astore          15
        //   232: new             Lgg/essential/mod/cosmetics/CosmeticAssets;
        //   235: dup            
        //   236: aload           15
        //   238: aload           14
        //   240: aload           13
        //   242: aload           12
        //   244: aload           11
        //   246: aload           10
        //   248: invokespecial   gg/essential/mod/cosmetics/CosmeticAssets.<init>:(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;Lgg/essential/mod/EssentialAsset;)V
        //   251: areturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 0C FF 00 50 00 07 07 00 AA 00 00 00 00 07 00 98 07 00 98 00 04 08 00 29 08 00 29 07 00 98 07 00 9A FF 00 01 00 07 07 00 AA 00 00 00 00 07 00 98 07 00 98 00 04 08 00 29 08 00 29 07 00 98 07 00 98 FF 00 18 00 01 07 00 AA 00 04 07 00 98 07 00 98 07 00 BD 07 00 9A FF 00 01 00 01 07 00 AA 00 04 07 00 98 07 00 98 07 00 BD 07 00 98 FF 00 2D 00 09 07 00 AA 00 07 00 D7 00 00 07 00 98 07 00 98 07 00 BD 07 00 98 00 03 08 00 7E 08 00 7E 07 00 9A FF 00 01 00 09 07 00 AA 00 07 00 D7 00 00 07 00 98 07 00 98 07 00 BD 07 00 98 00 03 08 00 7E 08 00 7E 07 00 98 FF 00 18 00 09 07 00 AA 00 00 00 00 07 00 98 07 00 98 07 00 BD 07 00 98 00 04 08 00 7E 08 00 7E 07 00 98 07 00 9A FF 00 01 00 09 07 00 AA 00 00 00 00 07 00 98 07 00 98 07 00 BD 07 00 98 00 04 08 00 7E 08 00 7E 07 00 98 07 00 98 FF 00 11 00 01 07 00 AA 00 05 07 00 98 07 00 98 07 00 BD 07 00 98 07 00 D7 FF 00 01 00 01 07 00 AA 00 05 07 00 98 07 00 98 07 00 BD 07 00 98 07 00 D5 FF 00 0D 00 00 00 06 07 00 98 07 00 98 07 00 BD 07 00 98 07 00 D5 07 00 9A FF 00 01 00 00 00 06 07 00 98 07 00 98 07 00 BD 07 00 98 07 00 D5 07 00 98
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final gg.essential.mod.cosmetics.CosmeticOutfit toMod(@NotNull final CosmeticOutfit $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getId:()Ljava/lang/String;
        //    10: dup            
        //    11: ldc             "id"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_0         /* $this$toMod */
        //    17: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getName:()Ljava/lang/String;
        //    20: dup            
        //    21: ldc             "name"
        //    23: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    26: aload_0         /* $this$toMod */
        //    27: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getSkinTexture:()Ljava/lang/String;
        //    30: aload_0         /* $this$toMod */
        //    31: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getEquippedCosmetics:()Ljava/util/Map;
        //    34: dup            
        //    35: ldc             "equippedCosmetics"
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: astore_1       
        //    41: astore          13
        //    43: astore          12
        //    45: astore          11
        //    47: aload_1         /* $this$mapKeys$iv */
        //    48: astore_2       
        //    49: new             Ljava/util/LinkedHashMap;
        //    52: dup            
        //    53: aload_1         /* $this$mapKeys$iv */
        //    54: invokeinterface java/util/Map.size:()I
        //    59: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    62: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    65: checkcast       Ljava/util/Map;
        //    68: astore_3        /* destination$iv$iv */
        //    69: aload_2         /* $this$mapKeysTo$iv$iv */
        //    70: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    75: checkcast       Ljava/lang/Iterable;
        //    78: astore          $this$associateByTo$iv$iv$iv
        //    80: aload           $this$associateByTo$iv$iv$iv
        //    82: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    87: astore          5
        //    89: aload           5
        //    91: invokeinterface java/util/Iterator.hasNext:()Z
        //    96: ifeq            176
        //    99: aload           5
        //   101: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   106: astore          element$iv$iv$iv
        //   108: aload_3         /* destination$iv$iv */
        //   109: aload           element$iv$iv$iv
        //   111: checkcast       Ljava/util/Map$Entry;
        //   114: astore          7
        //   116: astore          14
        //   118: aload           it
        //   120: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   125: dup            
        //   126: ldc_w           "it.key"
        //   129: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   132: checkcast       Lgg/essential/cosmetics/CosmeticSlot;
        //   135: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/cosmetics/CosmeticSlot;)Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   138: aload           14
        //   140: swap           
        //   141: aload           element$iv$iv$iv
        //   143: checkcast       Ljava/util/Map$Entry;
        //   146: astore          8
        //   148: astore          9
        //   150: astore          10
        //   152: aload           it$iv$iv
        //   154: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   159: astore          7
        //   161: aload           10
        //   163: aload           9
        //   165: aload           7
        //   167: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   172: pop            
        //   173: goto            89
        //   176: aload_3         /* destination$iv$iv */
        //   177: astore          14
        //   179: aload           11
        //   181: aload           12
        //   183: aload           13
        //   185: aload           14
        //   187: invokestatic    kotlin/collections/MapsKt.toMutableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   190: aload_0         /* $this$toMod */
        //   191: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getCosmeticSettings:()Ljava/util/Map;
        //   194: dup            
        //   195: ldc_w           "cosmeticSettings"
        //   198: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   201: invokestatic    gg/essential/network/cosmetics/ConversionsKt.settingsToMod:(Ljava/util/Map;)Ljava/util/Map;
        //   204: invokestatic    kotlin/collections/MapsKt.toMutableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   207: aload_0         /* $this$toMod */
        //   208: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.isSelected:()Z
        //   211: aload_0         /* $this$toMod */
        //   212: invokevirtual   gg/essential/cosmetics/model/CosmeticOutfit.getCreatedAt:()Lcom/sparkuniverse/toolbox/util/DateTime;
        //   215: invokevirtual   com/sparkuniverse/toolbox/util/DateTime.toInstant:()Ljava/time/Instant;
        //   218: dup            
        //   219: ldc_w           "createdAt.toInstant()"
        //   222: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   225: astore          15
        //   227: istore          16
        //   229: astore          17
        //   231: astore          18
        //   233: astore          19
        //   235: astore          20
        //   237: astore          21
        //   239: new             Lgg/essential/mod/cosmetics/CosmeticOutfit;
        //   242: dup            
        //   243: aload           21
        //   245: aload           20
        //   247: aload           19
        //   249: aload           18
        //   251: aload           17
        //   253: iload           16
        //   255: aload           15
        //   257: invokespecial   gg/essential/mod/cosmetics/CosmeticOutfit.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZLjava/time/Instant;)V
        //   260: areturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 59 00 0E 07 00 EC 00 00 07 00 92 00 07 01 14 00 00 00 00 00 07 00 90 07 00 90 07 00 90 00 00 FF 00 56 00 0E 07 00 EC 00 00 07 00 92 00 00 00 00 00 00 00 07 00 90 07 00 90 07 00 90 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "settingsToInfra")
    @NotNull
    public static final List<gg.essential.cosmetics.model.CosmeticSetting> settingsToInfra(@NotNull final List<CosmeticSetting> $this$toInfra) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toInfra */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_1        /* $this$map$iv */
        //    11: aload_1         /* $this$map$iv */
        //    12: astore_2       
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: aload_1         /* $this$map$iv */
        //    18: bipush          10
        //    20: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    23: invokespecial   java/util/ArrayList.<init>:(I)V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapTo$iv$iv */
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          4
        //    38: aload           4
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            84
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          item$iv$iv
        //    57: aload_3         /* destination$iv$iv */
        //    58: aload           item$iv$iv
        //    60: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //    63: astore          6
        //    65: astore          7
        //    67: aload           it
        //    69: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toInfra:(Lgg/essential/mod/cosmetics/CosmeticSetting;)Lgg/essential/cosmetics/model/CosmeticSetting;
        //    72: aload           7
        //    74: swap           
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            38
        //    84: aload_3         /* destination$iv$iv */
        //    85: checkcast       Ljava/util/List;
        //    88: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;)Ljava/util/List<Lgg/essential/cosmetics/model/CosmeticSetting;>;
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  $this$toInfra  
        //    StackMapTable: 00 02 FF 00 26 00 05 00 00 00 07 01 60 07 01 14 00 00 FA 00 2D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "settingsToMod")
    @NotNull
    public static final List<CosmeticSetting> settingsToMod(@NotNull final List<? extends gg.essential.cosmetics.model.CosmeticSetting> $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_1        /* $this$map$iv */
        //    11: aload_1         /* $this$map$iv */
        //    12: astore_2       
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: aload_1         /* $this$map$iv */
        //    18: bipush          10
        //    20: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    23: invokespecial   java/util/ArrayList.<init>:(I)V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapTo$iv$iv */
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          4
        //    38: aload           4
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            84
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          item$iv$iv
        //    57: aload_3         /* destination$iv$iv */
        //    58: aload           item$iv$iv
        //    60: checkcast       Lgg/essential/cosmetics/model/CosmeticSetting;
        //    63: astore          6
        //    65: astore          7
        //    67: aload           it
        //    69: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/cosmetics/model/CosmeticSetting;)Lgg/essential/mod/cosmetics/CosmeticSetting;
        //    72: aload           7
        //    74: swap           
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            38
        //    84: aload_3         /* destination$iv$iv */
        //    85: checkcast       Ljava/util/List;
        //    88: areturn        
        //    Signature:
        //  (Ljava/util/List<+Lgg/essential/cosmetics/model/CosmeticSetting;>;)Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 26 00 05 00 00 00 07 01 60 07 01 14 00 00 FA 00 2D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "settingsToMod")
    @NotNull
    public static final Map<String, List<CosmeticSetting>> settingsToMod(@NotNull final Map<String, ? extends List<? extends gg.essential.cosmetics.model.CosmeticSetting>> $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: astore_1        /* $this$mapValues$iv */
        //     8: aload_1         /* $this$mapValues$iv */
        //     9: astore_2       
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: aload_1         /* $this$mapValues$iv */
        //    15: invokeinterface java/util/Map.size:()I
        //    20: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    23: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    26: checkcast       Ljava/util/Map;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapValuesTo$iv$iv */
        //    31: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    36: checkcast       Ljava/lang/Iterable;
        //    39: astore          $this$associateByTo$iv$iv$iv
        //    41: aload           $this$associateByTo$iv$iv$iv
        //    43: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    48: astore          5
        //    50: aload           5
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            130
        //    60: aload           5
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          element$iv$iv$iv
        //    69: aload_3         /* destination$iv$iv */
        //    70: aload           element$iv$iv$iv
        //    72: checkcast       Ljava/util/Map$Entry;
        //    75: astore          7
        //    77: astore          8
        //    79: aload           it$iv$iv
        //    81: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    86: aload           8
        //    88: swap           
        //    89: aload           element$iv$iv$iv
        //    91: checkcast       Ljava/util/Map$Entry;
        //    94: astore          9
        //    96: astore          11
        //    98: astore          10
        //   100: aload           it
        //   102: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   107: checkcast       Ljava/util/List;
        //   110: invokestatic    gg/essential/network/cosmetics/ConversionsKt.settingsToMod:(Ljava/util/List;)Ljava/util/List;
        //   113: astore          12
        //   115: aload           10
        //   117: aload           11
        //   119: aload           12
        //   121: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   126: pop            
        //   127: goto            50
        //   130: aload_3         /* destination$iv$iv */
        //   131: areturn        
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/String;+Ljava/util/List<+Lgg/essential/cosmetics/model/CosmeticSetting;>;>;)Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;>;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 32 00 06 00 00 00 07 00 92 00 07 01 14 00 00 F9 00 4F
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "skinLayersToMod")
    @NotNull
    public static final Map<gg.essential.mod.cosmetics.SkinLayer, Boolean> skinLayersToMod(@NotNull final Map<SkinLayer, Boolean> $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: astore_1        /* $this$mapKeys$iv */
        //     8: aload_1         /* $this$mapKeys$iv */
        //     9: astore_2       
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: aload_1         /* $this$mapKeys$iv */
        //    15: invokeinterface java/util/Map.size:()I
        //    20: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    23: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    26: checkcast       Ljava/util/Map;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapKeysTo$iv$iv */
        //    31: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    36: checkcast       Ljava/lang/Iterable;
        //    39: astore          $this$associateByTo$iv$iv$iv
        //    41: aload           $this$associateByTo$iv$iv$iv
        //    43: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    48: astore          5
        //    50: aload           5
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            130
        //    60: aload           5
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          element$iv$iv$iv
        //    69: aload_3         /* destination$iv$iv */
        //    70: aload           element$iv$iv$iv
        //    72: checkcast       Ljava/util/Map$Entry;
        //    75: astore          7
        //    77: astore          11
        //    79: aload           it
        //    81: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    86: checkcast       Lgg/essential/cosmetics/SkinLayer;
        //    89: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/cosmetics/SkinLayer;)Lgg/essential/mod/cosmetics/SkinLayer;
        //    92: aload           11
        //    94: swap           
        //    95: aload           element$iv$iv$iv
        //    97: checkcast       Ljava/util/Map$Entry;
        //   100: astore          8
        //   102: astore          9
        //   104: astore          10
        //   106: aload           it$iv$iv
        //   108: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   113: astore          7
        //   115: aload           10
        //   117: aload           9
        //   119: aload           7
        //   121: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   126: pop            
        //   127: goto            50
        //   130: aload_3         /* destination$iv$iv */
        //   131: areturn        
        //    Signature:
        //  (Ljava/util/Map<Lgg/essential/cosmetics/SkinLayer;Ljava/lang/Boolean;>;)Ljava/util/Map<Lgg/essential/mod/cosmetics/SkinLayer;Ljava/lang/Boolean;>;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 32 00 06 00 00 00 07 00 92 00 07 01 14 00 00 F9 00 4F
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "outfitsToMod")
    @NotNull
    public static final List<gg.essential.mod.cosmetics.CosmeticOutfit> outfitsToMod(@NotNull final List<? extends CosmeticOutfit> $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_1        /* $this$map$iv */
        //    11: aload_1         /* $this$map$iv */
        //    12: astore_2       
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: aload_1         /* $this$map$iv */
        //    18: bipush          10
        //    20: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    23: invokespecial   java/util/ArrayList.<init>:(I)V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapTo$iv$iv */
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          4
        //    38: aload           4
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            84
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          item$iv$iv
        //    57: aload_3         /* destination$iv$iv */
        //    58: aload           item$iv$iv
        //    60: checkcast       Lgg/essential/cosmetics/model/CosmeticOutfit;
        //    63: astore          6
        //    65: astore          7
        //    67: aload           it
        //    69: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/cosmetics/model/CosmeticOutfit;)Lgg/essential/mod/cosmetics/CosmeticOutfit;
        //    72: aload           7
        //    74: swap           
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            38
        //    84: aload_3         /* destination$iv$iv */
        //    85: checkcast       Ljava/util/List;
        //    88: areturn        
        //    Signature:
        //  (Ljava/util/List<+Lgg/essential/cosmetics/model/CosmeticOutfit;>;)Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticOutfit;>;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 26 00 05 00 00 00 07 01 60 07 01 14 00 00 FA 00 2D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "slotsToMod")
    @NotNull
    public static final Map<CosmeticSlot, String> slotsToMod(@NotNull final Map<gg.essential.cosmetics.CosmeticSlot, String> $this$toMod) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMod */
        //     7: astore_1        /* $this$mapKeys$iv */
        //     8: aload_1         /* $this$mapKeys$iv */
        //     9: astore_2       
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: aload_1         /* $this$mapKeys$iv */
        //    15: invokeinterface java/util/Map.size:()I
        //    20: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    23: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    26: checkcast       Ljava/util/Map;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$mapKeysTo$iv$iv */
        //    31: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    36: checkcast       Ljava/lang/Iterable;
        //    39: astore          $this$associateByTo$iv$iv$iv
        //    41: aload           $this$associateByTo$iv$iv$iv
        //    43: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    48: astore          5
        //    50: aload           5
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            130
        //    60: aload           5
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          element$iv$iv$iv
        //    69: aload_3         /* destination$iv$iv */
        //    70: aload           element$iv$iv$iv
        //    72: checkcast       Ljava/util/Map$Entry;
        //    75: astore          7
        //    77: astore          11
        //    79: aload           it
        //    81: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    86: checkcast       Lgg/essential/cosmetics/CosmeticSlot;
        //    89: invokestatic    gg/essential/network/cosmetics/ConversionsKt.toMod:(Lgg/essential/cosmetics/CosmeticSlot;)Lgg/essential/mod/cosmetics/CosmeticSlot;
        //    92: aload           11
        //    94: swap           
        //    95: aload           element$iv$iv$iv
        //    97: checkcast       Ljava/util/Map$Entry;
        //   100: astore          8
        //   102: astore          9
        //   104: astore          10
        //   106: aload           it$iv$iv
        //   108: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   113: astore          7
        //   115: aload           10
        //   117: aload           9
        //   119: aload           7
        //   121: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   126: pop            
        //   127: goto            50
        //   130: aload_3         /* destination$iv$iv */
        //   131: areturn        
        //    Signature:
        //  (Ljava/util/Map<Lgg/essential/cosmetics/CosmeticSlot;Ljava/lang/String;>;)Ljava/util/Map<Lgg/essential/mod/cosmetics/CosmeticSlot;Ljava/lang/String;>;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toMod  
        //    StackMapTable: 00 02 FF 00 32 00 06 00 00 00 07 00 92 00 07 01 14 00 00 F9 00 4F
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
