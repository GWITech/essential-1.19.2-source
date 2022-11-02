package gg.essential.gui.common;

import gg.essential.mod.cosmetics.*;
import gg.essential.model.*;
import kotlin.*;

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
