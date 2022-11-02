package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.model.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012
                                                   \b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0019\u0010\u000f\u001a
                                                    \u0011*\u0004\u0018\u00010\u00100\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/common/CosmeticPreview;", "Lgg/essential/elementa/components/UIContainer;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "customCape", "", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "(Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;Lgg/essential/gui/studio/CosmeticStudio;)V", "getCosmetic", "()Lgg/essential/network/cosmetics/Cosmetic;", "getCosmeticStudio", "()Lgg/essential/gui/studio/CosmeticStudio;", "emulatedUI3DPlayer", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "uuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getUuid", "()Ljava/util/UUID;", "afterInitialization", "", "Companion", "essential" })
public final class CosmeticPreview extends UIContainer
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Cosmetic cosmetic;
    private final UUID uuid;
    @NotNull
    private final EmulatedUI3DPlayer emulatedUI3DPlayer;
    
    public CosmeticPreview(@NotNull final Cosmetic cosmetic, final byte profile) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cosmetic"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* cosmetic */
        //    12: putfield        gg/essential/gui/common/CosmeticPreview.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //    15: aload_0         /* this */
        //    16: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //    19: putfield        gg/essential/gui/common/CosmeticPreview.uuid:Ljava/util/UUID;
        //    22: aload_0         /* this */
        //    23: checkcast       Lgg/essential/elementa/UIComponent;
        //    26: new             Lgg/essential/elementa/effects/ScissorEffect;
        //    29: dup            
        //    30: aconst_null    
        //    31: iconst_0       
        //    32: iconst_3       
        //    33: aconst_null    
        //    34: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    37: checkcast       Lgg/essential/elementa/effects/Effect;
        //    40: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //    43: pop            
        //    44: new             Lgg/essential/handlers/GameProfileManager$Overwrites;
        //    47: dup            
        //    48: ldc             "f91f0820500c414d308c5678594631b917e51e06a31fedaacac5dad1a44a49d8"
        //    50: ldc             "DEFAULT"
        //    52: aconst_null    
        //    53: invokespecial   gg/essential/handlers/GameProfileManager$Overwrites.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    56: new             Lcom/mojang/authlib/GameProfile;
        //    59: dup            
        //    60: aload_0         /* this */
        //    61: getfield        gg/essential/gui/common/CosmeticPreview.uuid:Ljava/util/UUID;
        //    64: ldc             "EssentialBot"
        //    66: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
        //    69: invokevirtual   gg/essential/handlers/GameProfileManager$Overwrites.apply:(Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
        //    72: astore_2        /* profile */
        //    73: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    76: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    79: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    82: dup            
        //    83: ldc             "getInstance().connectionManager.cosmeticsManager"
        //    85: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: astore_3        /* cosmeticsManager */
        //    89: aload_3         /* cosmeticsManager */
        //    90: aload_0         /* this */
        //    91: getfield        gg/essential/gui/common/CosmeticPreview.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //    94: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticType:(Lgg/essential/network/cosmetics/Cosmetic;)Lgg/essential/mod/cosmetics/CosmeticType;
        //    97: dup            
        //    98: ifnull          107
        //   101: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSlot:()Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   104: goto            109
        //   107: pop            
        //   108: aconst_null    
        //   109: dup            
        //   110: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   113: astore          slot
        //   115: aload_0         /* this */
        //   116: new             Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   119: dup            
        //   120: aconst_null    
        //   121: new             Lgg/essential/elementa/state/BasicState;
        //   124: dup            
        //   125: iconst_0       
        //   126: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   129: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   132: checkcast       Lgg/essential/elementa/state/State;
        //   135: new             Lgg/essential/elementa/state/BasicState;
        //   138: dup            
        //   139: aload_2         /* profile */
        //   140: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   143: checkcast       Lgg/essential/elementa/state/State;
        //   146: aconst_null    
        //   147: bipush          9
        //   149: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;I)V
        //   152: astore          5
        //   154: aload           5
        //   156: astore          6
        //   158: astore          13
        //   160: aload           $this$_init__u24lambda_u2d2
        //   162: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.setRotations$2548a35:()V
        //   165: aload           $this$_init__u24lambda_u2d2
        //   167: checkcast       Lgg/essential/elementa/UIComponent;
        //   170: astore          $this$constrain$iv
        //   172: aload           $this$constrain$iv
        //   174: astore          9
        //   176: aload           9
        //   178: astore          $this$constrain_u24lambda_u2d0$iv
        //   180: aload           $this$constrain_u24lambda_u2d0$iv
        //   182: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   185: astore          $this$lambda_u2d2_u24lambda_u2d0
        //   187: aload           $this$lambda_u2d2_u24lambda_u2d0
        //   189: bipush          100
        //   191: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   194: checkcast       Ljava/lang/Number;
        //   197: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   200: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   203: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   206: aload           $this$lambda_u2d2_u24lambda_u2d0
        //   208: bipush          100
        //   210: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   213: checkcast       Ljava/lang/Number;
        //   216: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   219: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   222: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   225: aload           $this$_init__u24lambda_u2d2
        //   227: getstatic       gg/essential/gui/common/CosmeticPreview.Companion:Lgg/essential/gui/common/CosmeticPreview$Companion;
        //   230: aload           slot
        //   232: invokestatic    gg/essential/gui/common/CosmeticPreview$Companion.access$getCameraConfig:(Lgg/essential/gui/common/CosmeticPreview$Companion;Lgg/essential/mod/cosmetics/CosmeticSlot;)Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;
        //   235: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.setPerspectiveCamera:(Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;)V
        //   238: aload           $this$_init__u24lambda_u2d2
        //   240: new             Lgg/essential/cosmetics/source/ConfigurableCosmeticsSource;
        //   243: dup            
        //   244: invokespecial   gg/essential/cosmetics/source/ConfigurableCosmeticsSource.<init>:()V
        //   247: astore          7
        //   249: aload           7
        //   251: astore          8
        //   253: astore          12
        //   255: aload           $this$lambda_u2d2_u24lambda_u2d1
        //   257: aload           slot
        //   259: aload_0         /* this */
        //   260: getfield        gg/essential/gui/common/CosmeticPreview.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   263: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   266: invokestatic    com/google/common/collect/ImmutableMap.of:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap;
        //   269: invokevirtual   gg/essential/cosmetics/source/ConfigurableCosmeticsSource.setCosmetics:(Lcom/google/common/collect/ImmutableMap;)V
        //   272: aload           12
        //   274: aload           7
        //   276: checkcast       Lgg/essential/cosmetics/source/CosmeticsSource;
        //   279: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.setCosmeticsSource:(Lgg/essential/cosmetics/source/CosmeticsSource;)V
        //   282: aload           13
        //   284: aload           5
        //   286: putfield        gg/essential/gui/common/CosmeticPreview.emulatedUI3DPlayer:Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   289: aload_0         /* this */
        //   290: aload_0         /* this */
        //   291: getfield        gg/essential/gui/common/CosmeticPreview.emulatedUI3DPlayer:Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   294: checkcast       Lgg/essential/elementa/UIComponent;
        //   297: invokevirtual   gg/essential/gui/common/CosmeticPreview.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   300: pop            
        //   301: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  cosmetic  
        //  profile   
        //    StackMapTable: 00 02 FF 00 6B 00 03 07 00 02 00 07 00 5B 00 01 07 00 81 41 07 00 87
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public CosmeticPreview(final Cosmetic cosmetic) {
        this(cosmetic, (byte)0);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/CosmeticPreview$Companion;", "", "()V", "getCameraConfig", "Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;", "slot", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final UI3DPlayer.PerspectiveCamera getCameraConfig(final CosmeticSlot slot) {
            final Pair pair2 = switch (WhenMappings.$EnumSwitchMapping$0[slot.ordinal()]) {
                case 1 -> TuplesKt.to((Object)new Vector3(-30.3, 38.5, 44.6), (Object)new Vector3(0.1, 16.9, 0.1));
                case 2 -> TuplesKt.to((Object)new Vector3(-50.3, 48.5, 60.6), (Object)new Vector3(0.0, 16.9, 0.0));
                case 3 -> TuplesKt.to((Object)new Vector3(34.6, 50.5, -40), (Object)new Vector3(0, 30, (Number)0));
                case 4 -> TuplesKt.to((Object)new Vector3(0, 20, (Number)138), (Object)new Vector3(0, 20, (Number)0));
                case 5 -> TuplesKt.to((Object)new Vector3(29.7, 44, -34.3), (Object)new Vector3(0, 26, (Number)0));
                case 6 -> TuplesKt.to((Object)new Vector3(32.3, 37, -36.8), (Object)new Vector3(2.6, 24, -2.5));
                case 7 -> TuplesKt.to((Object)new Vector3(32.3, 34.9, -36.8), (Object)new Vector3(2.6, 16.9, -2.5));
                case 8 -> TuplesKt.to((Object)new Vector3(34, 29.1, -38.4), (Object)new Vector3(4.3, 11.1, -4.1));
                case 9 -> TuplesKt.to((Object)new Vector3(30.5, 12.4, -29.4), (Object)new Vector3(4.2, 4.8, -3.8));
                case 10 -> TuplesKt.to((Object)new Vector3(73.3, 20.7, -81.3), (Object)new Vector3(3.7, 19.2, -2.8));
                case 11 -> TuplesKt.to((Object)new Vector3(73.3, 20.7, -81.3), (Object)new Vector3(3.7, 19.2, -2.8));
                case 12 -> TuplesKt.to((Object)new Vector3(29.7, 44, -34.3), (Object)new Vector3(0, 26, (Number)0));
                case 13,  14,  15 -> TuplesKt.to((Object)new Vector3(73.3, 20.7, -81.3), (Object)new Vector3(3.7, 19.2, -2.8));
                default -> throw new NoWhenBranchMatchedException();
            };
            final Vector3 camera = (Vector3)pair2.component1();
            final Vector3 target = (Vector3)pair2.component2();
            return new UI3DPlayer.PerspectiveCamera(camera.divideScalar(16.0f), target.divideScalar(16.0f));
        }
        
        public static final /* synthetic */ UI3DPlayer.PerspectiveCamera access$getCameraConfig(final Companion $this, final CosmeticSlot slot) {
            return $this.getCameraConfig(slot);
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
                $EnumSwitchMapping$[CosmeticSlot.CAPE.ordinal()] = 1;
                $EnumSwitchMapping$[CosmeticSlot.BACK.ordinal()] = 2;
                $EnumSwitchMapping$[CosmeticSlot.HAT.ordinal()] = 3;
                $EnumSwitchMapping$[CosmeticSlot.WINGS.ordinal()] = 4;
                $EnumSwitchMapping$[CosmeticSlot.FACE.ordinal()] = 5;
                $EnumSwitchMapping$[CosmeticSlot.SHOULDERS.ordinal()] = 6;
                $EnumSwitchMapping$[CosmeticSlot.ARMS.ordinal()] = 7;
                $EnumSwitchMapping$[CosmeticSlot.PANTS.ordinal()] = 8;
                $EnumSwitchMapping$[CosmeticSlot.SHOES.ordinal()] = 9;
                $EnumSwitchMapping$[CosmeticSlot.SUITS.ordinal()] = 10;
                $EnumSwitchMapping$[CosmeticSlot.EFFECT.ordinal()] = 11;
                $EnumSwitchMapping$[CosmeticSlot.EARS.ordinal()] = 12;
                $EnumSwitchMapping$[CosmeticSlot.FULL_BODY.ordinal()] = 13;
                $EnumSwitchMapping$[CosmeticSlot.PET.ordinal()] = 14;
                $EnumSwitchMapping$[CosmeticSlot.TAIL.ordinal()] = 15;
                $EnumSwitchMapping$0 = $EnumSwitchMapping$;
            }
        }
    }
}
