package gg.essential.elementa.components;

import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lgg/essential/elementa/components/GradientComponent$GradientDirection;", "", "(Ljava/lang/String;I)V", "getGradientColors", "Lgg/essential/elementa/components/GradientComponent$GradientColors;", "startColor", "Ljava/awt/Color;", "endColor", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "Elementa" })
public enum GradientDirection
{
    TOP_TO_BOTTOM("TOP_TO_BOTTOM", 0), 
    BOTTOM_TO_TOP("BOTTOM_TO_TOP", 1), 
    LEFT_TO_RIGHT("LEFT_TO_RIGHT", 2), 
    RIGHT_TO_LEFT("RIGHT_TO_LEFT", 3);
    
    private static final /* synthetic */ GradientDirection[] $VALUES;
    
    private GradientDirection(final String $enum$name, final int $enum$ordinal) {
    }
    
    @NotNull
    public final GradientColors getGradientColors(@NotNull final Color startColor, @NotNull final Color endColor) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        return switch (WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1 -> new GradientColors(startColor, startColor, endColor, endColor);
            case 2 -> new GradientColors(endColor, endColor, startColor, startColor);
            case 3 -> new GradientColors(startColor, endColor, startColor, endColor);
            case 4 -> new GradientColors(endColor, startColor, endColor, startColor);
            default -> throw new NoWhenBranchMatchedException();
        };
    }
    
    public static GradientDirection[] values() {
        return GradientDirection.$VALUES.clone();
    }
    
    public static GradientDirection valueOf(final String value) {
        return Enum.valueOf(GradientDirection.class, value);
    }
    
    private static final /* synthetic */ GradientDirection[] $values() {
        return new GradientDirection[] { GradientDirection.TOP_TO_BOTTOM, GradientDirection.BOTTOM_TO_TOP, GradientDirection.LEFT_TO_RIGHT, GradientDirection.RIGHT_TO_LEFT };
    }
    
    static {
        $VALUES = $values();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[GradientDirection.values().length];
            $EnumSwitchMapping$[GradientDirection.TOP_TO_BOTTOM.ordinal()] = 1;
            $EnumSwitchMapping$[GradientDirection.BOTTOM_TO_TOP.ordinal()] = 2;
            $EnumSwitchMapping$[GradientDirection.LEFT_TO_RIGHT.ordinal()] = 3;
            $EnumSwitchMapping$[GradientDirection.RIGHT_TO_LEFT.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
