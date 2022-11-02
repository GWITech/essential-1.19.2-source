package gg.essential.cosmetics;

import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import gg.essential.cosmetics.skinmask.*;
import kotlin.jvm.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.model.util.*;
import gg.essential.model.backend.*;
import gg.essential.model.*;
import java.util.*;
import kotlin.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\u0018\u0000 N2\u00020\u0001:\u0001NB}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0003j\u0002`\u00070\u0005\u0012\u001c\u0010\b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005\u0012\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\f\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u000e\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u000fJ6\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\"\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010F\u001a\u00060\u0003j\u0002`\u0007JH\u0010G\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002HH0\u00120\u0005\"\u0004\b\u0000\u0010H*\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010I\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002HH0K0JH\u0002J\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u000f2\u0006\u0010M\u001a\u00020\u0003H\u0002R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0003j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR+\u0010 \u001a\u001c\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0003j\u0002`!0\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R'\u0010#\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R$\u0010)\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010*\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010+\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020,0\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018R'\u0010\b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R!\u0010/\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u0002000\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006\u0004" }, d2 = { "Lgg/essential/cosmetics/CosmeticsState;", "", "skinType", "", "cosmetics", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/cosmetics/CosmeticId;", "settings", "", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "cosmeticTypes", "Lgg/essential/cosmetics/CosmeticTypeId;", "Lgg/essential/mod/cosmetics/CosmeticType;", "models", "Lgg/essential/network/cosmetics/Cosmetic;", "Lgg/essential/cosmetics/WearableBedrockModel;", "armor", "", "Lgg/essential/model/EnumPart;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getArmor", "()Ljava/util/Set;", "getCosmetics", "()Ljava/util/Map;", "coveredLayers", "Lgg/essential/mod/cosmetics/SkinLayer;", "getCoveredLayers", "exclusions", "Lgg/essential/model/Box3;", "getExclusions", "()Ljava/util/List;", "hiddenBones", "Lgg/essential/cosmetics/BoneId;", "getHiddenBones", "hiddenParts", "getHiddenParts", "getModels", "partsEquipped", "", "getPartsEquipped", "partsHiddenDueToArmor", "partsHiddenDueToSetting", "positionAdjustments", "Lgg/essential/model/Vector3;", "getPositionAdjustments", "getSettings", "sides", "Lgg/essential/model/Side;", "getSides", "skinMaskConfig", "Lgg/essential/cosmetics/skinmask/SkinMaskConfig;", "getSkinMaskConfig", "()Lgg/essential/cosmetics/skinmask/SkinMaskConfig;", "getSkinType", "()Ljava/lang/String;", "getPositionAdjustment", "cosmetic", "render", "", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "vertexConsumerProvider", "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "pose", "Lgg/essential/model/backend/PlayerPose;", "skin", "Lgg/essential/model/backend/RenderBackend$Texture;", "parts", "filterVisible", "cosmeticId", "groupBySettingTargetId", "T", "valueSelector", "Lkotlin/Function1;", "", "settingsOfType", "type", "Companion" })
public final class CosmeticsState
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String skinType;
    @NotNull
    private final Map<CosmeticSlot, String> cosmetics;
    @NotNull
    private final Map<String, List<CosmeticSetting>> settings;
    @NotNull
    private final Map<Cosmetic, WearableBedrockModel> models;
    @NotNull
    private final Set<EnumPart> armor;
    @NotNull
    private final Set<SkinLayer> coveredLayers;
    @NotNull
    private final Map<String, Set<EnumPart>> partsHiddenDueToSetting;
    @NotNull
    private final Map<String, Set<EnumPart>> partsHiddenDueToArmor;
    @NotNull
    private final Map<String, Set<EnumPart>> hiddenParts;
    @NotNull
    private final Map<String, Set<String>> hiddenBones;
    @NotNull
    private final Map<String, Vector3> positionAdjustments;
    @NotNull
    private final Map<String, Side> sides;
    @NotNull
    private final List<Box3> exclusions;
    @NotNull
    private final SkinMaskConfig skinMaskConfig;
    @NotNull
    private final Set<Integer> partsEquipped;
    @NotNull
    private static final Map<String, List<EnumPart>> BODY_PART_MAP;
    @JvmField
    @NotNull
    public static final CosmeticsState EMPTY;
    
    public CosmeticsState(@NotNull final String skinType, @NotNull final Map<CosmeticSlot, String> cosmetics, @NotNull final Map<String, ? extends List<CosmeticSetting>> settings, @NotNull final Map<String, CosmeticType> cosmeticTypes, @NotNull final Map<Cosmetic, WearableBedrockModel> models, @NotNull final Set<? extends EnumPart> armor) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "skinType"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* cosmetics */
        //     7: ldc             "cosmetics"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* settings */
        //    13: ldc             "settings"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           cosmeticTypes
        //    20: ldc             "cosmeticTypes"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           models
        //    27: ldc             "models"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           armor
        //    34: ldc             "armor"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload_0         /* this */
        //    40: invokespecial   java/lang/Object.<init>:()V
        //    43: aload_0         /* this */
        //    44: aload_1         /* skinType */
        //    45: putfield        gg/essential/cosmetics/CosmeticsState.skinType:Ljava/lang/String;
        //    48: aload_0         /* this */
        //    49: aload_2         /* cosmetics */
        //    50: putfield        gg/essential/cosmetics/CosmeticsState.cosmetics:Ljava/util/Map;
        //    53: aload_0         /* this */
        //    54: aload_3         /* settings */
        //    55: putfield        gg/essential/cosmetics/CosmeticsState.settings:Ljava/util/Map;
        //    58: aload_0         /* this */
        //    59: aload           models
        //    61: putfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //    64: aload_0         /* this */
        //    65: aload           armor
        //    67: putfield        gg/essential/cosmetics/CosmeticsState.armor:Ljava/util/Set;
        //    70: aload_0         /* this */
        //    71: aload_0         /* this */
        //    72: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //    75: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    80: checkcast       Ljava/lang/Iterable;
        //    83: astore          7
        //    85: astore          29
        //    87: aload           $this$flatMap$iv
        //    89: astore          8
        //    91: new             Ljava/util/ArrayList;
        //    94: dup            
        //    95: invokespecial   java/util/ArrayList.<init>:()V
        //    98: checkcast       Ljava/util/Collection;
        //   101: astore          destination$iv$iv
        //   103: aload           $this$flatMapTo$iv$iv
        //   105: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   110: astore          11
        //   112: aload           11
        //   114: invokeinterface java/util/Iterator.hasNext:()Z
        //   119: ifeq            212
        //   122: aload           11
        //   124: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   129: astore          element$iv$iv
        //   131: aload           element$iv$iv
        //   133: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   136: astore          cosmetic
        //   138: new             Ljava/util/LinkedHashSet;
        //   141: dup            
        //   142: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   145: checkcast       Ljava/util/Set;
        //   148: astore          result
        //   150: aload           result
        //   152: aload           cosmeticTypes
        //   154: aload           cosmetic
        //   156: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getTypeId:()Ljava/lang/String;
        //   159: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   164: checkcast       Lgg/essential/mod/cosmetics/CosmeticType;
        //   167: dup            
        //   168: ifnull          177
        //   171: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSkinLayers:()Ljava/util/Map;
        //   174: goto            179
        //   177: pop            
        //   178: aconst_null    
        //   179: invokestatic    gg/essential/cosmetics/CosmeticsState.coveredLayers$lambda-1$putAll:(Ljava/util/Set;Ljava/util/Map;)Lkotlin/Unit;
        //   182: pop            
        //   183: aload           result
        //   185: aload           cosmetic
        //   187: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSkinLayers:()Ljava/util/Map;
        //   190: invokestatic    gg/essential/cosmetics/CosmeticsState.coveredLayers$lambda-1$putAll:(Ljava/util/Set;Ljava/util/Map;)Lkotlin/Unit;
        //   193: pop            
        //   194: aload           result
        //   196: checkcast       Ljava/lang/Iterable;
        //   199: astore          list$iv$iv
        //   201: aload           destination$iv$iv
        //   203: aload           list$iv$iv
        //   205: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   208: pop            
        //   209: goto            112
        //   212: aload           destination$iv$iv
        //   214: checkcast       Ljava/util/List;
        //   217: aload           29
        //   219: swap           
        //   220: checkcast       Ljava/lang/Iterable;
        //   223: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   226: putfield        gg/essential/cosmetics/CosmeticsState.coveredLayers:Ljava/util/Set;
        //   229: aload_0         /* this */
        //   230: aload_0         /* this */
        //   231: aload_0         /* this */
        //   232: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //   235: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   240: checkcast       Ljava/lang/Iterable;
        //   243: astore          7
        //   245: astore          30
        //   247: astore          29
        //   249: aload           $this$flatMap$iv
        //   251: astore          8
        //   253: new             Ljava/util/ArrayList;
        //   256: dup            
        //   257: invokespecial   java/util/ArrayList.<init>:()V
        //   260: checkcast       Ljava/util/Collection;
        //   263: astore          destination$iv$iv
        //   265: aload           $this$flatMapTo$iv$iv
        //   267: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   272: astore          11
        //   274: aload           11
        //   276: invokeinterface java/util/Iterator.hasNext:()Z
        //   281: ifeq            324
        //   284: aload           11
        //   286: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   291: astore          element$iv$iv
        //   293: aload           element$iv$iv
        //   295: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   298: astore          it
        //   300: aload_0         /* this */
        //   301: aload           it
        //   303: ldc             "cosmetic_bone_hiding"
        //   305: invokespecial   gg/essential/cosmetics/CosmeticsState.settingsOfType:(Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;)Ljava/util/List;
        //   308: checkcast       Ljava/lang/Iterable;
        //   311: astore          list$iv$iv
        //   313: aload           destination$iv$iv
        //   315: aload           list$iv$iv
        //   317: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   320: pop            
        //   321: goto            274
        //   324: aload           destination$iv$iv
        //   326: checkcast       Ljava/util/List;
        //   329: astore          31
        //   331: aload           29
        //   333: aload           30
        //   335: aload           31
        //   337: getstatic       gg/essential/cosmetics/CosmeticsState$partsHiddenDueToSetting$2.INSTANCE:Lgg/essential/cosmetics/CosmeticsState$partsHiddenDueToSetting$2;
        //   340: checkcast       Lkotlin/jvm/functions/Function1;
        //   343: invokespecial   gg/essential/cosmetics/CosmeticsState.groupBySettingTargetId:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
        //   346: putfield        gg/essential/cosmetics/CosmeticsState.partsHiddenDueToSetting:Ljava/util/Map;
        //   349: aload_0         /* this */
        //   350: aload_0         /* this */
        //   351: aload_0         /* this */
        //   352: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //   355: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   360: checkcast       Ljava/lang/Iterable;
        //   363: astore          7
        //   365: astore          30
        //   367: astore          29
        //   369: aload           $this$flatMap$iv
        //   371: astore          8
        //   373: new             Ljava/util/ArrayList;
        //   376: dup            
        //   377: invokespecial   java/util/ArrayList.<init>:()V
        //   380: checkcast       Ljava/util/Collection;
        //   383: astore          destination$iv$iv
        //   385: aload           $this$flatMapTo$iv$iv
        //   387: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   392: astore          11
        //   394: aload           11
        //   396: invokeinterface java/util/Iterator.hasNext:()Z
        //   401: ifeq            444
        //   404: aload           11
        //   406: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   411: astore          element$iv$iv
        //   413: aload           element$iv$iv
        //   415: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   418: astore          it
        //   420: aload_0         /* this */
        //   421: aload           it
        //   423: ldc             "armor_handling"
        //   425: invokespecial   gg/essential/cosmetics/CosmeticsState.settingsOfType:(Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;)Ljava/util/List;
        //   428: checkcast       Ljava/lang/Iterable;
        //   431: astore          list$iv$iv
        //   433: aload           destination$iv$iv
        //   435: aload           list$iv$iv
        //   437: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   440: pop            
        //   441: goto            394
        //   444: aload           destination$iv$iv
        //   446: checkcast       Ljava/util/List;
        //   449: astore          31
        //   451: aload           29
        //   453: aload           30
        //   455: aload           31
        //   457: new             Lgg/essential/cosmetics/CosmeticsState$partsHiddenDueToArmor$2;
        //   460: dup            
        //   461: aload_0         /* this */
        //   462: invokespecial   gg/essential/cosmetics/CosmeticsState$partsHiddenDueToArmor$2.<init>:(Lgg/essential/cosmetics/CosmeticsState;)V
        //   465: checkcast       Lkotlin/jvm/functions/Function1;
        //   468: invokespecial   gg/essential/cosmetics/CosmeticsState.groupBySettingTargetId:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
        //   471: putfield        gg/essential/cosmetics/CosmeticsState.partsHiddenDueToArmor:Ljava/util/Map;
        //   474: aload_0         /* this */
        //   475: aload_0         /* this */
        //   476: getfield        gg/essential/cosmetics/CosmeticsState.partsHiddenDueToSetting:Ljava/util/Map;
        //   479: invokestatic    kotlin/collections/MapsKt.asSequence:(Ljava/util/Map;)Lkotlin/sequences/Sequence;
        //   482: aload_0         /* this */
        //   483: getfield        gg/essential/cosmetics/CosmeticsState.partsHiddenDueToArmor:Ljava/util/Map;
        //   486: invokestatic    kotlin/collections/MapsKt.asSequence:(Ljava/util/Map;)Lkotlin/sequences/Sequence;
        //   489: invokestatic    kotlin/sequences/SequencesKt.plus:(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
        //   492: astore          7
        //   494: astore          29
        //   496: aload           $this$groupBy$iv
        //   498: astore          8
        //   500: new             Ljava/util/LinkedHashMap;
        //   503: dup            
        //   504: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   507: checkcast       Ljava/util/Map;
        //   510: astore          destination$iv$iv
        //   512: aload           $this$groupByTo$iv$iv
        //   514: invokeinterface kotlin/sequences/Sequence.iterator:()Ljava/util/Iterator;
        //   519: astore          11
        //   521: aload           11
        //   523: invokeinterface java/util/Iterator.hasNext:()Z
        //   528: ifeq            648
        //   531: aload           11
        //   533: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   538: astore          element$iv$iv
        //   540: aload           element$iv$iv
        //   542: checkcast       Ljava/util/Map$Entry;
        //   545: astore          it
        //   547: aload           it
        //   549: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   554: checkcast       Ljava/lang/String;
        //   557: astore          key$iv$iv
        //   559: aload           destination$iv$iv
        //   561: astore          $this$getOrPut$iv$iv$iv
        //   563: aload           $this$getOrPut$iv$iv$iv
        //   565: aload           key$iv$iv
        //   567: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   572: astore          value$iv$iv$iv
        //   574: aload           value$iv$iv$iv
        //   576: ifnonnull       608
        //   579: new             Ljava/util/ArrayList;
        //   582: dup            
        //   583: invokespecial   java/util/ArrayList.<init>:()V
        //   586: checkcast       Ljava/util/List;
        //   589: astore          answer$iv$iv$iv
        //   591: aload           $this$getOrPut$iv$iv$iv
        //   593: aload           key$iv$iv
        //   595: aload           answer$iv$iv$iv
        //   597: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   602: pop            
        //   603: aload           answer$iv$iv$iv
        //   605: goto            610
        //   608: aload           value$iv$iv$iv
        //   610: checkcast       Ljava/util/List;
        //   613: astore          list$iv$iv
        //   615: aload           list$iv$iv
        //   617: aload           element$iv$iv
        //   619: checkcast       Ljava/util/Map$Entry;
        //   622: astore          14
        //   624: astore          30
        //   626: aload           it
        //   628: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   633: checkcast       Ljava/util/Set;
        //   636: aload           30
        //   638: swap           
        //   639: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   644: pop            
        //   645: goto            521
        //   648: aload           destination$iv$iv
        //   650: aload           29
        //   652: swap           
        //   653: astore          7
        //   655: astore          29
        //   657: aload           $this$mapValues$iv
        //   659: astore          8
        //   661: new             Ljava/util/LinkedHashMap;
        //   664: dup            
        //   665: aload           $this$mapValues$iv
        //   667: invokeinterface java/util/Map.size:()I
        //   672: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   675: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   678: checkcast       Ljava/util/Map;
        //   681: astore          destination$iv$iv
        //   683: aload           $this$mapValuesTo$iv$iv
        //   685: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   690: checkcast       Ljava/lang/Iterable;
        //   693: astore          $this$associateByTo$iv$iv$iv
        //   695: aload           $this$associateByTo$iv$iv$iv
        //   697: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   702: astore          13
        //   704: aload           13
        //   706: invokeinterface java/util/Iterator.hasNext:()Z
        //   711: ifeq            791
        //   714: aload           13
        //   716: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   721: astore          element$iv$iv$iv
        //   723: aload           destination$iv$iv
        //   725: aload           element$iv$iv$iv
        //   727: checkcast       Ljava/util/Map$Entry;
        //   730: astore          15
        //   732: astore          16
        //   734: aload           it$iv$iv
        //   736: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   741: aload           16
        //   743: swap           
        //   744: aload           element$iv$iv$iv
        //   746: checkcast       Ljava/util/Map$Entry;
        //   749: astore          18
        //   751: astore          31
        //   753: astore          30
        //   755: aload           it
        //   757: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   762: checkcast       Ljava/lang/Iterable;
        //   765: invokestatic    kotlin/collections/CollectionsKt.flatten:(Ljava/lang/Iterable;)Ljava/util/List;
        //   768: checkcast       Ljava/lang/Iterable;
        //   771: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   774: astore          32
        //   776: aload           30
        //   778: aload           31
        //   780: aload           32
        //   782: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   787: pop            
        //   788: goto            704
        //   791: aload           destination$iv$iv
        //   793: aload           29
        //   795: swap           
        //   796: putfield        gg/essential/cosmetics/CosmeticsState.hiddenParts:Ljava/util/Map;
        //   799: aload_0         /* this */
        //   800: aload_0         /* this */
        //   801: aload_0         /* this */
        //   802: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //   805: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   810: checkcast       Ljava/lang/Iterable;
        //   813: astore          7
        //   815: astore          30
        //   817: astore          29
        //   819: aload           $this$flatMap$iv
        //   821: astore          8
        //   823: new             Ljava/util/ArrayList;
        //   826: dup            
        //   827: invokespecial   java/util/ArrayList.<init>:()V
        //   830: checkcast       Ljava/util/Collection;
        //   833: astore          destination$iv$iv
        //   835: aload           $this$flatMapTo$iv$iv
        //   837: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   842: astore          11
        //   844: aload           11
        //   846: invokeinterface java/util/Iterator.hasNext:()Z
        //   851: ifeq            895
        //   854: aload           11
        //   856: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   861: astore          element$iv$iv
        //   863: aload           element$iv$iv
        //   865: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   868: astore          it
        //   870: aload_0         /* this */
        //   871: aload           it
        //   873: ldc_w           "external_hidden_bone"
        //   876: invokespecial   gg/essential/cosmetics/CosmeticsState.settingsOfType:(Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;)Ljava/util/List;
        //   879: checkcast       Ljava/lang/Iterable;
        //   882: astore          list$iv$iv
        //   884: aload           destination$iv$iv
        //   886: aload           list$iv$iv
        //   888: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   891: pop            
        //   892: goto            844
        //   895: aload           destination$iv$iv
        //   897: checkcast       Ljava/util/List;
        //   900: astore          31
        //   902: aload           29
        //   904: aload           30
        //   906: aload           31
        //   908: getstatic       gg/essential/cosmetics/CosmeticsState$hiddenBones$2.INSTANCE:Lgg/essential/cosmetics/CosmeticsState$hiddenBones$2;
        //   911: checkcast       Lkotlin/jvm/functions/Function1;
        //   914: invokespecial   gg/essential/cosmetics/CosmeticsState.groupBySettingTargetId:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
        //   917: putfield        gg/essential/cosmetics/CosmeticsState.hiddenBones:Ljava/util/Map;
        //   920: aload_0         /* this */
        //   921: aload_0         /* this */
        //   922: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //   925: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   930: checkcast       Ljava/lang/Iterable;
        //   933: astore          7
        //   935: astore          29
        //   937: aload           $this$associate$iv
        //   939: bipush          10
        //   941: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   944: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   947: bipush          16
        //   949: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //   952: istore          capacity$iv
        //   954: aload           $this$associate$iv
        //   956: astore          9
        //   958: new             Ljava/util/LinkedHashMap;
        //   961: dup            
        //   962: iload           capacity$iv
        //   964: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   967: checkcast       Ljava/util/Map;
        //   970: astore          destination$iv$iv
        //   972: aload           $this$associateTo$iv$iv
        //   974: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   979: astore          12
        //   981: aload           12
        //   983: invokeinterface java/util/Iterator.hasNext:()Z
        //   988: ifeq            1332
        //   991: aload           12
        //   993: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   998: astore          element$iv$iv
        //  1000: aload           destination$iv$iv
        //  1002: astore          14
        //  1004: aload           element$iv$iv
        //  1006: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //  1009: astore          cosmetic
        //  1011: new             Lgg/essential/model/Vector3;
        //  1014: dup            
        //  1015: iconst_0       
        //  1016: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1019: checkcast       Ljava/lang/Number;
        //  1022: iconst_0       
        //  1023: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1026: checkcast       Ljava/lang/Number;
        //  1029: iconst_0       
        //  1030: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1033: checkcast       Ljava/lang/Number;
        //  1036: invokespecial   gg/essential/model/Vector3.<init>:(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
        //  1039: astore          offset
        //  1041: aload_0         /* this */
        //  1042: getfield        gg/essential/cosmetics/CosmeticsState.settings:Ljava/util/Map;
        //  1045: aload           cosmetic
        //  1047: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1050: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1055: checkcast       Ljava/util/List;
        //  1058: dup            
        //  1059: ifnonnull       1066
        //  1062: pop            
        //  1063: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //  1066: checkcast       Ljava/lang/Iterable;
        //  1069: astore          $this$filter$iv
        //  1071: aload           $this$filter$iv
        //  1073: astore          20
        //  1075: new             Ljava/util/ArrayList;
        //  1078: dup            
        //  1079: invokespecial   java/util/ArrayList.<init>:()V
        //  1082: checkcast       Ljava/util/Collection;
        //  1085: astore          destination$iv$iv
        //  1087: aload           $this$filterTo$iv$iv
        //  1089: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1094: astore          23
        //  1096: aload           23
        //  1098: invokeinterface java/util/Iterator.hasNext:()Z
        //  1103: ifeq            1149
        //  1106: aload           23
        //  1108: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1113: astore          element$iv$iv
        //  1115: aload           element$iv$iv
        //  1117: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1120: astore          it
        //  1122: aload           it
        //  1124: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //  1127: ldc_w           "PLAYER_POSITION_ADJUSTMENT"
        //  1130: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1133: ifeq            1096
        //  1136: aload           destination$iv$iv
        //  1138: aload           element$iv$iv
        //  1140: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1145: pop            
        //  1146: goto            1096
        //  1149: aload           destination$iv$iv
        //  1151: checkcast       Ljava/util/List;
        //  1154: checkcast       Ljava/lang/Iterable;
        //  1157: astore          $this$forEach$iv
        //  1159: aload           $this$forEach$iv
        //  1161: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1166: astore          20
        //  1168: aload           20
        //  1170: invokeinterface java/util/Iterator.hasNext:()Z
        //  1175: ifeq            1299
        //  1178: aload           20
        //  1180: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1185: astore          element$iv
        //  1187: aload           element$iv
        //  1189: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1192: astore          it
        //  1194: aload           offset
        //  1196: aload           offset
        //  1198: getfield        gg/essential/model/Vector3.x:F
        //  1201: aload           it
        //  1203: ldc_w           "x"
        //  1206: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //  1209: checkcast       Ljava/lang/Number;
        //  1212: dup            
        //  1213: ifnull          1222
        //  1216: invokevirtual   java/lang/Number.floatValue:()F
        //  1219: goto            1224
        //  1222: pop            
        //  1223: fconst_0       
        //  1224: fadd           
        //  1225: putfield        gg/essential/model/Vector3.x:F
        //  1228: aload           offset
        //  1230: aload           offset
        //  1232: getfield        gg/essential/model/Vector3.y:F
        //  1235: aload           it
        //  1237: ldc_w           "y"
        //  1240: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //  1243: checkcast       Ljava/lang/Number;
        //  1246: dup            
        //  1247: ifnull          1256
        //  1250: invokevirtual   java/lang/Number.floatValue:()F
        //  1253: goto            1258
        //  1256: pop            
        //  1257: fconst_0       
        //  1258: fadd           
        //  1259: putfield        gg/essential/model/Vector3.y:F
        //  1262: aload           offset
        //  1264: aload           offset
        //  1266: getfield        gg/essential/model/Vector3.z:F
        //  1269: aload           it
        //  1271: ldc_w           "z"
        //  1274: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //  1277: checkcast       Ljava/lang/Number;
        //  1280: dup            
        //  1281: ifnull          1290
        //  1284: invokevirtual   java/lang/Number.floatValue:()F
        //  1287: goto            1292
        //  1290: pop            
        //  1291: fconst_0       
        //  1292: fadd           
        //  1293: putfield        gg/essential/model/Vector3.z:F
        //  1296: goto            1168
        //  1299: aload           cosmetic
        //  1301: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1304: aload           offset
        //  1306: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1309: astore          null
        //  1311: aload           14
        //  1313: aload           15
        //  1315: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //  1318: aload           15
        //  1320: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //  1323: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1328: pop            
        //  1329: goto            981
        //  1332: aload           destination$iv$iv
        //  1334: aload           29
        //  1336: swap           
        //  1337: putfield        gg/essential/cosmetics/CosmeticsState.positionAdjustments:Ljava/util/Map;
        //  1340: aload_0         /* this */
        //  1341: aload_0         /* this */
        //  1342: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //  1345: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1350: checkcast       Ljava/lang/Iterable;
        //  1353: astore          7
        //  1355: astore          29
        //  1357: aload           $this$mapNotNull$iv
        //  1359: astore          8
        //  1361: new             Ljava/util/ArrayList;
        //  1364: dup            
        //  1365: invokespecial   java/util/ArrayList.<init>:()V
        //  1368: checkcast       Ljava/util/Collection;
        //  1371: astore          destination$iv$iv
        //  1373: aload           $this$mapNotNullTo$iv$iv
        //  1375: astore          $this$forEach$iv$iv$iv
        //  1377: aload           $this$forEach$iv$iv$iv
        //  1379: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1384: astore          13
        //  1386: aload           13
        //  1388: invokeinterface java/util/Iterator.hasNext:()Z
        //  1393: ifeq            1573
        //  1396: aload           13
        //  1398: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1403: astore          element$iv$iv$iv
        //  1405: aload           element$iv$iv$iv
        //  1407: astore          element$iv$iv
        //  1409: aload           element$iv$iv
        //  1411: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //  1414: astore          cosmetic
        //  1416: aload_0         /* this */
        //  1417: getfield        gg/essential/cosmetics/CosmeticsState.settings:Ljava/util/Map;
        //  1420: aload           cosmetic
        //  1422: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1425: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1430: checkcast       Ljava/util/List;
        //  1433: dup            
        //  1434: ifnonnull       1441
        //  1437: pop            
        //  1438: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //  1441: checkcast       Ljava/lang/Iterable;
        //  1444: astore          19
        //  1446: aload           19
        //  1448: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1453: astore          20
        //  1455: aload           20
        //  1457: invokeinterface java/util/Iterator.hasNext:()Z
        //  1462: ifeq            1500
        //  1465: aload           20
        //  1467: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1472: astore          21
        //  1474: aload           21
        //  1476: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1479: astore          it
        //  1481: aload           it
        //  1483: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //  1486: ldc_w           "SIDE"
        //  1489: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1492: ifeq            1455
        //  1495: aload           21
        //  1497: goto            1501
        //  1500: aconst_null    
        //  1501: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1504: astore          24
        //  1506: aload           24
        //  1508: ifnull          1549
        //  1511: aload           24
        //  1513: ldc_w           "SIDE"
        //  1516: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:(Ljava/lang/String;)Ljava/lang/Object;
        //  1519: checkcast       Ljava/lang/String;
        //  1522: astore          25
        //  1524: aload           25
        //  1526: ifnull          1549
        //  1529: aload           25
        //  1531: astore          it
        //  1533: aload           cosmetic
        //  1535: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1538: aload           it
        //  1540: invokestatic    gg/essential/model/Side.valueOf:(Ljava/lang/String;)Lgg/essential/model/Side;
        //  1543: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1546: goto            1550
        //  1549: aconst_null    
        //  1550: dup            
        //  1551: ifnull          1569
        //  1554: astore          it$iv$iv
        //  1556: aload           destination$iv$iv
        //  1558: aload           it$iv$iv
        //  1560: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1565: pop            
        //  1566: goto            1386
        //  1569: pop            
        //  1570: goto            1386
        //  1573: aload           destination$iv$iv
        //  1575: checkcast       Ljava/util/List;
        //  1578: aload           29
        //  1580: swap           
        //  1581: checkcast       Ljava/lang/Iterable;
        //  1584: invokestatic    kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
        //  1587: putfield        gg/essential/cosmetics/CosmeticsState.sides:Ljava/util/Map;
        //  1590: aload_0         /* this */
        //  1591: aload_0         /* this */
        //  1592: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //  1595: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //  1600: checkcast       Ljava/lang/Iterable;
        //  1603: astore          7
        //  1605: astore          29
        //  1607: aload           $this$flatMap$iv
        //  1609: astore          8
        //  1611: new             Ljava/util/ArrayList;
        //  1614: dup            
        //  1615: invokespecial   java/util/ArrayList.<init>:()V
        //  1618: checkcast       Ljava/util/Collection;
        //  1621: astore          destination$iv$iv
        //  1623: aload           $this$flatMapTo$iv$iv
        //  1625: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1630: astore          11
        //  1632: aload           11
        //  1634: invokeinterface java/util/Iterator.hasNext:()Z
        //  1639: ifeq            1682
        //  1642: aload           11
        //  1644: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1649: astore          element$iv$iv
        //  1651: aload           element$iv$iv
        //  1653: checkcast       Lgg/essential/cosmetics/WearableBedrockModel;
        //  1656: astore          it
        //  1658: aload           it
        //  1660: invokevirtual   gg/essential/cosmetics/WearableBedrockModel.getModel:()Lgg/essential/model/ModelInstance;
        //  1663: invokevirtual   gg/essential/model/ModelInstance.getRenderExclusions:()Ljava/util/List;
        //  1666: checkcast       Ljava/lang/Iterable;
        //  1669: astore          list$iv$iv
        //  1671: aload           destination$iv$iv
        //  1673: aload           list$iv$iv
        //  1675: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //  1678: pop            
        //  1679: goto            1632
        //  1682: aload           destination$iv$iv
        //  1684: checkcast       Ljava/util/List;
        //  1687: aload           29
        //  1689: swap           
        //  1690: putfield        gg/essential/cosmetics/CosmeticsState.exclusions:Ljava/util/List;
        //  1693: aload_0         /* this */
        //  1694: aload_0         /* this */
        //  1695: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //  1698: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1703: checkcast       Ljava/lang/Iterable;
        //  1706: invokestatic    kotlin/collections/CollectionsKt.toList:(Ljava/lang/Iterable;)Ljava/util/List;
        //  1709: aload_0         /* this */
        //  1710: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //  1713: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1718: checkcast       Ljava/lang/Iterable;
        //  1721: astore          7
        //  1723: astore          32
        //  1725: astore          29
        //  1727: new             Ljava/util/LinkedHashMap;
        //  1730: dup            
        //  1731: aload           $this$associateWith$iv
        //  1733: bipush          10
        //  1735: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //  1738: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //  1741: bipush          16
        //  1743: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //  1746: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //  1749: astore          result$iv
        //  1751: aload           $this$associateWith$iv
        //  1753: astore          $this$associateWithTo$iv$iv
        //  1755: aload           $this$associateWithTo$iv$iv
        //  1757: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1762: astore          11
        //  1764: aload           11
        //  1766: invokeinterface java/util/Iterator.hasNext:()Z
        //  1771: ifeq            2029
        //  1774: aload           11
        //  1776: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1781: astore          element$iv$iv
        //  1783: aload           result$iv
        //  1785: checkcast       Ljava/util/Map;
        //  1788: aload           element$iv$iv
        //  1790: aload           element$iv$iv
        //  1792: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //  1795: astore          13
        //  1797: astore          34
        //  1799: astore          33
        //  1801: new             Ljava/util/ArrayList;
        //  1804: dup            
        //  1805: invokespecial   java/util/ArrayList.<init>:()V
        //  1808: checkcast       Ljava/util/List;
        //  1811: astore          partSettings
        //  1813: aload_0         /* this */
        //  1814: getfield        gg/essential/cosmetics/CosmeticsState.hiddenParts:Ljava/util/Map;
        //  1817: aload           cosmetic
        //  1819: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1822: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1827: checkcast       Ljava/util/Set;
        //  1830: dup            
        //  1831: ifnull          1905
        //  1834: checkcast       Ljava/lang/Iterable;
        //  1837: astore          $this$forEach$iv
        //  1839: aload           $this$forEach$iv
        //  1841: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1846: astore          18
        //  1848: aload           18
        //  1850: invokeinterface java/util/Iterator.hasNext:()Z
        //  1855: ifeq            1898
        //  1858: aload           18
        //  1860: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1865: astore          element$iv
        //  1867: aload           element$iv
        //  1869: checkcast       Lgg/essential/model/EnumPart;
        //  1872: astore          hiddenPart
        //  1874: aload           partSettings
        //  1876: new             Lgg/essential/cosmetics/skinmask/SkinPartSetting;
        //  1879: dup            
        //  1880: aload           hiddenPart
        //  1882: iconst_1       
        //  1883: iconst_0       
        //  1884: iconst_0       
        //  1885: iconst_0       
        //  1886: invokespecial   gg/essential/cosmetics/skinmask/SkinPartSetting.<init>:(Lgg/essential/model/EnumPart;ZIII)V
        //  1889: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1894: pop            
        //  1895: goto            1848
        //  1898: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1901: pop            
        //  1902: goto            1906
        //  1905: pop            
        //  1906: aload_0         /* this */
        //  1907: getfield        gg/essential/cosmetics/CosmeticsState.positionAdjustments:Ljava/util/Map;
        //  1910: aload           cosmetic
        //  1912: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1915: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1920: checkcast       Lgg/essential/model/Vector3;
        //  1923: dup            
        //  1924: ifnull          2009
        //  1927: astore          offset
        //  1929: invokestatic    gg/essential/model/EnumPart.values:()[Lgg/essential/model/EnumPart;
        //  1932: astore          19
        //  1934: iconst_0       
        //  1935: istore          20
        //  1937: aload           19
        //  1939: arraylength    
        //  1940: istore          21
        //  1942: iload           20
        //  1944: iload           21
        //  1946: if_icmpge       1998
        //  1949: aload           19
        //  1951: iload           20
        //  1953: aaload         
        //  1954: astore          offsetPart
        //  1956: aload           partSettings
        //  1958: new             Lgg/essential/cosmetics/skinmask/SkinPartSetting;
        //  1961: dup            
        //  1962: aload           offsetPart
        //  1964: iconst_0       
        //  1965: aload           offset
        //  1967: getfield        gg/essential/model/Vector3.x:F
        //  1970: f2i            
        //  1971: aload           offset
        //  1973: getfield        gg/essential/model/Vector3.y:F
        //  1976: f2i            
        //  1977: aload           offset
        //  1979: getfield        gg/essential/model/Vector3.z:F
        //  1982: f2i            
        //  1983: invokespecial   gg/essential/cosmetics/skinmask/SkinPartSetting.<init>:(Lgg/essential/model/EnumPart;ZIII)V
        //  1986: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1991: pop            
        //  1992: iinc            20, 1
        //  1995: goto            1942
        //  1998: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2001: pop            
        //  2002: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2005: pop            
        //  2006: goto            2010
        //  2009: pop            
        //  2010: aload           partSettings
        //  2012: astore          35
        //  2014: aload           33
        //  2016: aload           34
        //  2018: aload           35
        //  2020: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2025: pop            
        //  2026: goto            1764
        //  2029: aload           result$iv
        //  2031: checkcast       Ljava/util/Map;
        //  2034: astore          33
        //  2036: aload           29
        //  2038: aload           32
        //  2040: aload           33
        //  2042: astore          36
        //  2044: astore          37
        //  2046: new             Lgg/essential/cosmetics/skinmask/SkinMaskConfig;
        //  2049: dup            
        //  2050: aload           37
        //  2052: aload           36
        //  2054: invokespecial   gg/essential/cosmetics/skinmask/SkinMaskConfig.<init>:(Ljava/util/List;Ljava/util/Map;)V
        //  2057: putfield        gg/essential/cosmetics/CosmeticsState.skinMaskConfig:Lgg/essential/cosmetics/skinmask/SkinMaskConfig;
        //  2060: aload_0         /* this */
        //  2061: aload_0         /* this */
        //  2062: getfield        gg/essential/cosmetics/CosmeticsState.models:Ljava/util/Map;
        //  2065: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //  2070: checkcast       Ljava/lang/Iterable;
        //  2073: astore          7
        //  2075: astore          29
        //  2077: aload           $this$map$iv
        //  2079: astore          8
        //  2081: new             Ljava/util/ArrayList;
        //  2084: dup            
        //  2085: aload           $this$map$iv
        //  2087: bipush          10
        //  2089: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //  2092: invokespecial   java/util/ArrayList.<init>:(I)V
        //  2095: checkcast       Ljava/util/Collection;
        //  2098: astore          destination$iv$iv
        //  2100: aload           $this$mapTo$iv$iv
        //  2102: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2107: astore          11
        //  2109: aload           11
        //  2111: invokeinterface java/util/Iterator.hasNext:()Z
        //  2116: ifeq            2156
        //  2119: aload           11
        //  2121: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2126: astore          item$iv$iv
        //  2128: aload           destination$iv$iv
        //  2130: aload           item$iv$iv
        //  2132: checkcast       Lgg/essential/cosmetics/WearableBedrockModel;
        //  2135: astore          13
        //  2137: astore          30
        //  2139: aload           it
        //  2141: invokevirtual   gg/essential/cosmetics/WearableBedrockModel.getModel:()Lgg/essential/model/ModelInstance;
        //  2144: aload           30
        //  2146: swap           
        //  2147: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  2152: pop            
        //  2153: goto            2109
        //  2156: aload           destination$iv$iv
        //  2158: checkcast       Ljava/util/List;
        //  2161: aload           29
        //  2163: swap           
        //  2164: checkcast       Ljava/lang/Iterable;
        //  2167: astore          7
        //  2169: astore          29
        //  2171: aload           $this$flatMap$iv
        //  2173: astore          8
        //  2175: new             Ljava/util/ArrayList;
        //  2178: dup            
        //  2179: invokespecial   java/util/ArrayList.<init>:()V
        //  2182: checkcast       Ljava/util/Collection;
        //  2185: astore          destination$iv$iv
        //  2187: aload           $this$flatMapTo$iv$iv
        //  2189: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2194: astore          11
        //  2196: aload           11
        //  2198: invokeinterface java/util/Iterator.hasNext:()Z
        //  2203: ifeq            2528
        //  2206: aload           11
        //  2208: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2213: astore          element$iv$iv
        //  2215: aload           element$iv$iv
        //  2217: checkcast       Lgg/essential/model/ModelInstance;
        //  2220: astore          modelInstance
        //  2222: aload           modelInstance
        //  2224: invokevirtual   gg/essential/model/ModelInstance.getModel:()Lgg/essential/model/BedrockModel;
        //  2227: astore          model
        //  2229: aload           model
        //  2231: aload_0         /* this */
        //  2232: getfield        gg/essential/cosmetics/CosmeticsState.sides:Ljava/util/Map;
        //  2235: aload           model
        //  2237: invokevirtual   gg/essential/model/BedrockModel.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
        //  2240: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  2243: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2248: checkcast       Lgg/essential/model/Side;
        //  2251: aload           modelInstance
        //  2253: aload_0         /* this */
        //  2254: getfield        gg/essential/cosmetics/CosmeticsState.exclusions:Ljava/util/List;
        //  2257: checkcast       Ljava/lang/Iterable;
        //  2260: aload           model
        //  2262: getfield        gg/essential/model/BedrockModel.boundingBoxes:Ljava/util/List;
        //  2265: checkcast       Ljava/lang/Iterable;
        //  2268: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //  2271: checkcast       Ljava/lang/Iterable;
        //  2274: invokestatic    kotlin/collections/CollectionsKt.minus:(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
        //  2277: invokevirtual   gg/essential/model/ModelInstance.getRootBone:(Ljava/util/List;)Lgg/essential/model/Bone;
        //  2280: aload_0         /* this */
        //  2281: getfield        gg/essential/cosmetics/CosmeticsState.hiddenBones:Ljava/util/Map;
        //  2284: aload           model
        //  2286: invokevirtual   gg/essential/model/BedrockModel.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
        //  2289: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  2292: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2297: checkcast       Ljava/util/Set;
        //  2300: dup            
        //  2301: ifnonnull       2308
        //  2304: pop            
        //  2305: invokestatic    kotlin/collections/SetsKt.emptySet:()Ljava/util/Set;
        //  2308: invokestatic    gg/essential/model/EnumPart.values:()[Lgg/essential/model/EnumPart;
        //  2311: invokestatic    kotlin/collections/ArraysKt.toSet:([Ljava/lang/Object;)Ljava/util/Set;
        //  2314: invokevirtual   gg/essential/model/BedrockModel.propagateVisibilityToRootBone:(Lgg/essential/model/Side;Lgg/essential/model/Bone;Ljava/util/Set;Ljava/util/Set;)V
        //  2317: aload           model
        //  2319: aload           model
        //  2321: invokevirtual   gg/essential/model/BedrockModel.getRootBone:()Lgg/essential/model/Bone;
        //  2324: invokevirtual   gg/essential/model/BedrockModel.getBones:(Lgg/essential/model/Bone;)Ljava/util/List;
        //  2327: checkcast       Ljava/lang/Iterable;
        //  2330: astore          $this$filter$iv
        //  2332: aload           $this$filter$iv
        //  2334: astore          18
        //  2336: new             Ljava/util/ArrayList;
        //  2339: dup            
        //  2340: invokespecial   java/util/ArrayList.<init>:()V
        //  2343: checkcast       Ljava/util/Collection;
        //  2346: astore          destination$iv$iv
        //  2348: aload           $this$filterTo$iv$iv
        //  2350: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2355: astore          21
        //  2357: aload           21
        //  2359: invokeinterface java/util/Iterator.hasNext:()Z
        //  2364: ifeq            2404
        //  2367: aload           21
        //  2369: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2374: astore          element$iv$iv
        //  2376: aload           element$iv$iv
        //  2378: checkcast       Lgg/essential/model/Bone;
        //  2381: astore          it
        //  2383: aload           it
        //  2385: invokevirtual   gg/essential/model/Bone.containsVisibleBoxes:()Z
        //  2388: ifeq            2357
        //  2391: aload           destination$iv$iv
        //  2393: aload           element$iv$iv
        //  2395: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  2400: pop            
        //  2401: goto            2357
        //  2404: aload           destination$iv$iv
        //  2406: checkcast       Ljava/util/List;
        //  2409: checkcast       Ljava/lang/Iterable;
        //  2412: astore          $this$mapNotNull$iv
        //  2414: aload           $this$mapNotNull$iv
        //  2416: astore          18
        //  2418: new             Ljava/util/ArrayList;
        //  2421: dup            
        //  2422: invokespecial   java/util/ArrayList.<init>:()V
        //  2425: checkcast       Ljava/util/Collection;
        //  2428: astore          destination$iv$iv
        //  2430: aload           $this$mapNotNullTo$iv$iv
        //  2432: astore          $this$forEach$iv$iv$iv
        //  2434: aload           $this$forEach$iv$iv$iv
        //  2436: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2441: astore          23
        //  2443: aload           23
        //  2445: invokeinterface java/util/Iterator.hasNext:()Z
        //  2450: ifeq            2507
        //  2453: aload           23
        //  2455: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2460: astore          element$iv$iv$iv
        //  2462: aload           element$iv$iv$iv
        //  2464: astore          element$iv$iv
        //  2466: aload           element$iv$iv
        //  2468: checkcast       Lgg/essential/model/Bone;
        //  2471: astore          it
        //  2473: getstatic       gg/essential/model/EnumPart.Companion:Lgg/essential/model/EnumPart$Companion;
        //  2476: aload           it
        //  2478: getfield        gg/essential/model/Bone.boxName:Ljava/lang/String;
        //  2481: invokevirtual   gg/essential/model/EnumPart$Companion.fromBoneName:(Ljava/lang/String;)Lgg/essential/model/EnumPart;
        //  2484: dup            
        //  2485: ifnull          2503
        //  2488: astore          it$iv$iv
        //  2490: aload           destination$iv$iv
        //  2492: aload           it$iv$iv
        //  2494: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  2499: pop            
        //  2500: goto            2443
        //  2503: pop            
        //  2504: goto            2443
        //  2507: aload           destination$iv$iv
        //  2509: checkcast       Ljava/util/List;
        //  2512: checkcast       Ljava/lang/Iterable;
        //  2515: astore          list$iv$iv
        //  2517: aload           destination$iv$iv
        //  2519: aload           list$iv$iv
        //  2521: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //  2524: pop            
        //  2525: goto            2196
        //  2528: aload           destination$iv$iv
        //  2530: checkcast       Ljava/util/List;
        //  2533: aload           29
        //  2535: swap           
        //  2536: checkcast       Ljava/lang/Iterable;
        //  2539: astore          7
        //  2541: astore          29
        //  2543: aload           $this$flatMap$iv
        //  2545: astore          8
        //  2547: new             Ljava/util/ArrayList;
        //  2550: dup            
        //  2551: invokespecial   java/util/ArrayList.<init>:()V
        //  2554: checkcast       Ljava/util/Collection;
        //  2557: astore          destination$iv$iv
        //  2559: aload           $this$flatMapTo$iv$iv
        //  2561: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2566: astore          11
        //  2568: aload           11
        //  2570: invokeinterface java/util/Iterator.hasNext:()Z
        //  2575: ifeq            2615
        //  2578: aload           11
        //  2580: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2585: astore          element$iv$iv
        //  2587: aload           element$iv$iv
        //  2589: checkcast       Lgg/essential/model/EnumPart;
        //  2592: astore          it
        //  2594: aload           it
        //  2596: invokevirtual   gg/essential/model/EnumPart.getArmorSlotIds:()Ljava/util/Set;
        //  2599: checkcast       Ljava/lang/Iterable;
        //  2602: astore          list$iv$iv
        //  2604: aload           destination$iv$iv
        //  2606: aload           list$iv$iv
        //  2608: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //  2611: pop            
        //  2612: goto            2568
        //  2615: aload           destination$iv$iv
        //  2617: checkcast       Ljava/util/List;
        //  2620: aload           29
        //  2622: swap           
        //  2623: checkcast       Ljava/lang/Iterable;
        //  2626: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //  2629: putfield        gg/essential/cosmetics/CosmeticsState.partsEquipped:Ljava/util/Set;
        //  2632: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/util/Map<Lgg/essential/mod/cosmetics/CosmeticSlot;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;+Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;>;Ljava/util/Map<Ljava/lang/String;Lgg/essential/mod/cosmetics/CosmeticType;>;Ljava/util/Map<Lgg/essential/network/cosmetics/Cosmetic;Lgg/essential/cosmetics/WearableBedrockModel;>;Ljava/util/Set<+Lgg/essential/model/EnumPart;>;)V
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  skinType       
        //  cosmetics      
        //  settings       
        //  cosmeticTypes  
        //  models         
        //  armor          
        //    StackMapTable: 00 3E FF 00 70 00 1E 07 00 02 00 00 00 07 00 92 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 40 00 1E 07 00 02 00 00 00 07 00 92 00 00 00 00 07 00 9C 00 07 00 A2 00 07 00 AC 00 07 00 B1 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 07 00 B1 07 00 BA FF 00 01 00 1E 07 00 02 00 00 00 07 00 92 00 00 00 00 07 00 9C 00 07 00 A2 00 07 00 AC 00 07 00 B1 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 07 00 B1 07 00 92 FF 00 20 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 3D 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 31 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 45 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 31 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 4C 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 56 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 07 00 04 00 00 00 00 00 07 00 04 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 01 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 07 00 04 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 04 FF 00 25 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 37 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 00 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 56 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 34 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 32 00 1F 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 02 00 00 FF 00 55 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 54 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 CA FF 00 1D 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 07 00 02 00 00 FF 00 34 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 00 07 00 9C 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 12 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 35 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 07 01 45 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 07 01 3A FF 00 01 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 07 01 45 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 02 FF 00 1F 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 07 01 45 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 07 01 3A FF 00 01 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 07 01 45 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 02 FF 00 1F 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 00 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 07 01 3A FF 00 01 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 07 00 A2 00 00 00 00 00 00 00 00 07 00 02 00 03 07 01 32 02 02 FF 00 06 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 07 00 A2 00 07 00 92 07 00 AC 00 07 01 32 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 20 00 1E 07 00 02 00 00 00 00 00 00 00 00 00 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 35 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 36 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 07 00 AC 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 CA FF 00 0D 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 07 00 AC 00 00 07 00 A2 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2C 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 07 00 AC 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 07 00 04 FF 00 2F 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 07 01 6C 52 07 01 6C FF 00 03 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 3A 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 31 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 51 00 21 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 00 00 FF 00 53 00 23 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 07 00 A2 00 07 00 AC 00 07 00 CA 00 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 07 00 92 07 00 04 00 00 FF 00 31 00 23 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 07 00 A2 00 07 00 AC 00 07 00 CA 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 07 00 92 07 00 04 00 00 46 07 00 B1 00 FF 00 23 00 23 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 07 00 A2 00 00 00 07 00 CA 00 07 01 32 00 07 01 A6 01 01 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 07 00 92 07 00 04 00 00 FF 00 37 00 23 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 07 00 A2 00 00 00 07 00 CA 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 07 00 92 07 00 04 00 00 4A 07 01 32 00 FF 00 12 00 21 07 00 02 00 00 00 00 00 00 00 07 00 F5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 07 00 CA 00 00 FF 00 4F 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2E 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 27 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 6F 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 07 01 B3 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 04 07 01 B3 07 01 78 07 01 C9 07 00 B1 FF 00 30 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2E 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 26 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 07 00 9C 00 00 00 07 00 A2 00 00 00 00 00 07 00 02 00 00 7B 07 01 97 FF 00 03 00 1E 07 00 02 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 14 00 1E 00 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 27 00 1E 00 00 00 00 00 00 00 00 00 07 00 9C 00 07 00 A2 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2E 00 1E 00 00 00 00 00 00 00 00 00 07 00 9C 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final String getSkinType() {
        return this.skinType;
    }
    
    @NotNull
    public final Map<CosmeticSlot, String> getCosmetics() {
        return this.cosmetics;
    }
    
    @NotNull
    public final Map<String, List<CosmeticSetting>> getSettings() {
        return this.settings;
    }
    
    @NotNull
    public final Map<Cosmetic, WearableBedrockModel> getModels() {
        return this.models;
    }
    
    @NotNull
    public final Set<EnumPart> getArmor() {
        return this.armor;
    }
    
    @NotNull
    public final Set<SkinLayer> getCoveredLayers() {
        return this.coveredLayers;
    }
    
    @NotNull
    public final SkinMaskConfig getSkinMaskConfig() {
        return this.skinMaskConfig;
    }
    
    @NotNull
    public final Set<Integer> getPartsEquipped() {
        return this.partsEquipped;
    }
    
    @NotNull
    public final Vector3 getPositionAdjustment(@NotNull final Cosmetic cosmetic) {
        Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
        Vector3 vector3;
        if ((vector3 = this.positionAdjustments.get(cosmetic.getId())) == null) {
            vector3 = new Vector3();
        }
        return vector3;
    }
    
    @NotNull
    public final Set<EnumPart> filterVisible(@NotNull final Set<? extends EnumPart> $this$filterVisible, @NotNull final String cosmeticId) {
        Intrinsics.checkNotNullParameter((Object)$this$filterVisible, "<this>");
        Intrinsics.checkNotNullParameter((Object)cosmeticId, "cosmeticId");
        final Set set = this.hiddenParts.get(cosmeticId);
        return SetsKt.minus((Set)$this$filterVisible, (set != null) ? ((Iterable)set) : ((Iterable)SetsKt.emptySet()));
    }
    
    private final <T> Map<String, Set<T>> groupBySettingTargetId(final List<CosmeticSetting> $this$groupBySettingTargetId, final Function1<? super CosmeticSetting, ? extends Iterable<? extends T>> valueSelector) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/lang/Iterable;
        //     4: astore_3        /* $this$flatMap$iv */
        //     5: aload_3         /* $this$flatMap$iv */
        //     6: astore          4
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: checkcast       Ljava/util/Collection;
        //    18: astore          destination$iv$iv
        //    20: aload           $this$flatMapTo$iv$iv
        //    22: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    27: astore          6
        //    29: aload           6
        //    31: invokeinterface java/util/Iterator.hasNext:()Z
        //    36: ifeq            174
        //    39: aload           6
        //    41: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    46: astore          element$iv$iv
        //    48: aload           element$iv$iv
        //    50: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //    53: astore          setting
        //    55: aload_2         /* valueSelector */
        //    56: aload           setting
        //    58: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    63: checkcast       Ljava/lang/Iterable;
        //    66: astore          $this$map$iv
        //    68: aload           $this$map$iv
        //    70: astore          12
        //    72: new             Ljava/util/ArrayList;
        //    75: dup            
        //    76: aload           $this$map$iv
        //    78: bipush          10
        //    80: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    83: invokespecial   java/util/ArrayList.<init>:(I)V
        //    86: checkcast       Ljava/util/Collection;
        //    89: astore          destination$iv$iv
        //    91: aload           $this$mapTo$iv$iv
        //    93: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    98: astore          15
        //   100: aload           15
        //   102: invokeinterface java/util/Iterator.hasNext:()Z
        //   107: ifeq            153
        //   110: aload           15
        //   112: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   117: astore          item$iv$iv
        //   119: aload           destination$iv$iv
        //   121: aload           item$iv$iv
        //   123: astore          17
        //   125: astore          18
        //   127: aload           setting
        //   129: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getId:()Ljava/lang/String;
        //   132: dup            
        //   133: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   136: aload           it
        //   138: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   141: aload           18
        //   143: swap           
        //   144: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   149: pop            
        //   150: goto            100
        //   153: aload           destination$iv$iv
        //   155: checkcast       Ljava/util/List;
        //   158: checkcast       Ljava/lang/Iterable;
        //   161: astore          list$iv$iv
        //   163: aload           destination$iv$iv
        //   165: aload           list$iv$iv
        //   167: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   170: pop            
        //   171: goto            29
        //   174: aload           destination$iv$iv
        //   176: checkcast       Ljava/util/List;
        //   179: checkcast       Ljava/lang/Iterable;
        //   182: astore_3        /* $this$groupBy$iv */
        //   183: aload_3         /* $this$groupBy$iv */
        //   184: astore          4
        //   186: new             Ljava/util/LinkedHashMap;
        //   189: dup            
        //   190: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   193: checkcast       Ljava/util/Map;
        //   196: astore          destination$iv$iv
        //   198: aload           $this$groupByTo$iv$iv
        //   200: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   205: astore          6
        //   207: aload           6
        //   209: invokeinterface java/util/Iterator.hasNext:()Z
        //   214: ifeq            327
        //   217: aload           6
        //   219: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   224: astore          element$iv$iv
        //   226: aload           element$iv$iv
        //   228: checkcast       Lkotlin/Pair;
        //   231: astore          it
        //   233: aload           it
        //   235: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   238: checkcast       Ljava/lang/String;
        //   241: astore          key$iv$iv
        //   243: aload           destination$iv$iv
        //   245: astore          $this$getOrPut$iv$iv$iv
        //   247: aload           $this$getOrPut$iv$iv$iv
        //   249: aload           key$iv$iv
        //   251: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   256: astore          value$iv$iv$iv
        //   258: aload           value$iv$iv$iv
        //   260: ifnonnull       292
        //   263: new             Ljava/util/ArrayList;
        //   266: dup            
        //   267: invokespecial   java/util/ArrayList.<init>:()V
        //   270: checkcast       Ljava/util/List;
        //   273: astore          answer$iv$iv$iv
        //   275: aload           $this$getOrPut$iv$iv$iv
        //   277: aload           key$iv$iv
        //   279: aload           answer$iv$iv$iv
        //   281: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   286: pop            
        //   287: aload           answer$iv$iv$iv
        //   289: goto            294
        //   292: aload           value$iv$iv$iv
        //   294: checkcast       Ljava/util/List;
        //   297: astore          list$iv$iv
        //   299: aload           list$iv$iv
        //   301: aload           element$iv$iv
        //   303: checkcast       Lkotlin/Pair;
        //   306: astore          9
        //   308: astore          19
        //   310: aload           it
        //   312: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   315: aload           19
        //   317: swap           
        //   318: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   323: pop            
        //   324: goto            207
        //   327: aload           destination$iv$iv
        //   329: astore_3        /* $this$groupBy$iv */
        //   330: aload_3         /* $this$mapValues$iv */
        //   331: astore          4
        //   333: new             Ljava/util/LinkedHashMap;
        //   336: dup            
        //   337: aload_3         /* $this$mapValues$iv */
        //   338: invokeinterface java/util/Map.size:()I
        //   343: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   346: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   349: checkcast       Ljava/util/Map;
        //   352: astore          destination$iv$iv
        //   354: aload           $this$mapValuesTo$iv$iv
        //   356: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   361: checkcast       Ljava/lang/Iterable;
        //   364: astore          $this$associateByTo$iv$iv$iv
        //   366: aload           $this$associateByTo$iv$iv$iv
        //   368: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   373: astore          8
        //   375: aload           8
        //   377: invokeinterface java/util/Iterator.hasNext:()Z
        //   382: ifeq            456
        //   385: aload           8
        //   387: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   392: astore          element$iv$iv$iv
        //   394: aload           destination$iv$iv
        //   396: aload           element$iv$iv$iv
        //   398: checkcast       Ljava/util/Map$Entry;
        //   401: astore          10
        //   403: astore          11
        //   405: aload           it$iv$iv
        //   407: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   412: aload           11
        //   414: swap           
        //   415: aload           element$iv$iv$iv
        //   417: checkcast       Ljava/util/Map$Entry;
        //   420: astore          13
        //   422: astore          20
        //   424: astore          19
        //   426: aload           it
        //   428: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   433: checkcast       Ljava/lang/Iterable;
        //   436: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   439: astore          21
        //   441: aload           19
        //   443: aload           20
        //   445: aload           21
        //   447: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   452: pop            
        //   453: goto            375
        //   456: aload           destination$iv$iv
        //   458: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;Lkotlin/jvm/functions/Function1<-Lgg/essential/mod/cosmetics/CosmeticSetting;+Ljava/lang/Iterable<+TT;>;>;)Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<TT;>;>;
        //    MethodParameters:
        //  Name                          Flags  
        //  ----------------------------  -----
        //  $this$groupBySettingTargetId  
        //  valueSelector                 
        //    StackMapTable: 00 0A FF 00 1D 00 07 00 00 07 00 DB 00 00 07 00 9C 07 00 A2 00 00 FF 00 46 00 10 00 00 07 00 DB 00 00 07 00 9C 07 00 A2 00 07 01 45 00 00 00 00 07 00 9C 00 07 00 A2 00 00 FF 00 34 00 0E 00 00 07 00 DB 00 00 07 00 9C 07 00 A2 00 00 00 00 00 00 07 00 9C 00 00 FF 00 14 00 06 00 00 00 00 00 07 00 9C 00 00 FF 00 20 00 07 00 00 00 00 00 07 00 92 07 00 A2 00 00 FF 00 54 00 0E 00 00 00 00 00 07 00 92 07 00 A2 07 00 04 00 00 00 00 00 07 00 04 00 00 FF 00 01 00 08 00 00 00 00 00 07 00 92 07 00 A2 07 00 04 00 01 07 00 04 F9 00 20 FE 00 2F 00 00 07 00 A2 F8 00 50
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<CosmeticSetting> settingsOfType(final Cosmetic $this$settingsOfType, final String type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_3        /* $this$filter$iv */
        //     8: aload_3         /* $this$filter$iv */
        //     9: astore          4
        //    11: new             Ljava/util/ArrayList;
        //    14: dup            
        //    15: invokespecial   java/util/ArrayList.<init>:()V
        //    18: checkcast       Ljava/util/Collection;
        //    21: astore          destination$iv$iv
        //    23: aload           $this$filterTo$iv$iv
        //    25: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    30: astore          6
        //    32: aload           6
        //    34: invokeinterface java/util/Iterator.hasNext:()Z
        //    39: ifeq            84
        //    42: aload           6
        //    44: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    49: astore          element$iv$iv
        //    51: aload           element$iv$iv
        //    53: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //    56: astore          it
        //    58: aload           it
        //    60: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //    63: aload_2         /* type */
        //    64: iconst_1       
        //    65: invokestatic    kotlin/text/StringsKt.equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
        //    68: ifeq            32
        //    71: aload           destination$iv$iv
        //    73: aload           element$iv$iv
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            32
        //    84: aload           destination$iv$iv
        //    86: checkcast       Ljava/util/List;
        //    89: areturn        
        //    Signature:
        //  (Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;)Ljava/util/List<Lgg/essential/mod/cosmetics/CosmeticSetting;>;
        //    MethodParameters:
        //  Name                  Flags  
        //  --------------------  -----
        //  $this$settingsOfType  
        //  type                  
        //    StackMapTable: 00 02 FF 00 20 00 07 00 00 07 01 00 00 00 07 00 9C 07 00 A2 00 00 FF 00 33 00 06 00 00 00 00 00 07 00 9C 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void render(@NotNull final UMatrixStack matrixStack, @NotNull final RenderBackend.VertexConsumerProvider vertexConsumerProvider, @NotNull final PlayerPose pose, @NotNull final RenderBackend.Texture skin, @NotNull final Set<? extends EnumPart> parts) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)vertexConsumerProvider, "vertexConsumerProvider");
        Intrinsics.checkNotNullParameter((Object)pose, "pose");
        Intrinsics.checkNotNullParameter((Object)skin, "skin");
        Intrinsics.checkNotNullParameter((Object)parts, "parts");
        for (final Map.Entry<Cosmetic, V> entry : this.models.entrySet()) {
            final Cosmetic cosmetic = entry.getKey();
            final WearableBedrockModel model = (WearableBedrockModel)entry.getValue();
            final int light = 0;
            final float scale = 0.0625f;
            final Side side = this.sides.get(cosmetic.getId());
            Set emptySet;
            if ((emptySet = this.hiddenBones.get(cosmetic.getId())) == null) {
                emptySet = SetsKt.emptySet();
            }
            final RenderMetadata renderMetadata = new RenderMetadata(pose, skin, light, scale, side, emptySet, CosmeticsState.Companion.isAffectedByExclusions(cosmetic) ? this.exclusions : CollectionsKt.emptyList(), this.getPositionAdjustment(cosmetic), this.filterVisible(parts, cosmetic.getId()));
            model.render(matrixStack, vertexConsumerProvider, renderMetadata);
        }
    }
    
    public static /* synthetic */ void render$default$7462d1ac$7f419388(final CosmeticsState cosmeticsState, final UMatrixStack matrixStack, final RenderBackend.VertexConsumerProvider vertexConsumerProvider, final PlayerPose pose, final RenderBackend.Texture skin) {
        cosmeticsState.render(matrixStack, vertexConsumerProvider, pose, skin, ArraysKt.toSet((Object[])EnumPart.values()));
    }
    
    private static final <T> Unit coveredLayers$lambda-1$putAll(final Set<T> $this$coveredLayers_u24lambda_u2d1_u24putAll, final Map<T, Boolean> map) {
        Unit instance;
        if (map != null) {
            final Map $this$forEach$iv = map;
            for (final Object o : $this$forEach$iv.entrySet()) {
                final Map.Entry element$iv = (Map.Entry)o;
                final Object key = ((Map.Entry<Object, V>)o).getKey();
                final boolean visible = (boolean)((Map.Entry)o).getValue();
                if (visible) {
                    $this$coveredLayers_u24lambda_u2d1_u24putAll.remove(key);
                }
                else {
                    $this$coveredLayers_u24lambda_u2d1_u24putAll.add((T)key);
                }
            }
            instance = Unit.INSTANCE;
        }
        else {
            instance = null;
        }
        return instance;
    }
    
    public static final /* synthetic */ Map access$getBODY_PART_MAP$cp() {
        return CosmeticsState.BODY_PART_MAP;
    }
    
    static {
        Companion = new Companion((byte)0);
        BODY_PART_MAP = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"head", (Object)CollectionsKt.listOf((Object)EnumPart.HEAD)), TuplesKt.to((Object)"body", (Object)CollectionsKt.listOf((Object)EnumPart.BODY)), TuplesKt.to((Object)"arms", (Object)CollectionsKt.listOf((Object[])new EnumPart[] { EnumPart.LEFT_ARM, EnumPart.RIGHT_ARM })), TuplesKt.to((Object)"legs", (Object)CollectionsKt.listOf((Object[])new EnumPart[] { EnumPart.LEFT_LEG, EnumPart.RIGHT_LEG })) });
        EMPTY = new CosmeticsState("", MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), SetsKt.emptySet());
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000e" }, d2 = { "Lgg/essential/cosmetics/CosmeticsState$Companion;", "", "()V", "BODY_PART_MAP", "", "", "", "Lgg/essential/model/EnumPart;", "EMPTY", "Lgg/essential/cosmetics/CosmeticsState;", "isAffectedByExclusions", "", "Lgg/essential/network/cosmetics/Cosmetic;", "(Lgg/essential/network/cosmetics/Cosmetic;)Z", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final boolean isAffectedByExclusions(final Cosmetic $this$isAffectedByExclusions) {
            return switch (WhenMappings.$EnumSwitchMapping$0[$this$isAffectedByExclusions.getType().getSlot().ordinal()]) {
                case 1,  2 -> true;
                default -> false;
            };
        }
        
        public static final /* synthetic */ boolean access$isAffectedByExclusions(final Companion $this, final Cosmetic $receiver) {
            return $this.isAffectedByExclusions($receiver);
        }
        
        public Companion(final byte b) {
            this();
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
        public final synthetic class WhenMappings
        {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            
            static {
                final int[] $EnumSwitchMapping$ = new int[CosmeticSlot.values().length];
                $EnumSwitchMapping$[CosmeticSlot.FULL_BODY.ordinal()] = 1;
                $EnumSwitchMapping$[CosmeticSlot.SUITS.ordinal()] = 2;
                $EnumSwitchMapping$0 = $EnumSwitchMapping$;
            }
        }
    }
}
