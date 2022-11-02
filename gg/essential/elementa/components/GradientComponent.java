package gg.essential.elementa.components;

import java.awt.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0016\u0018\u0000 $2\u00020\u0001:\u0003$%&B%\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ5\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0010¢\u0006\u0002\b\u001dJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'" }, d2 = { "Lgg/essential/elementa/components/GradientComponent;", "Lgg/essential/elementa/components/UIBlock;", "startColor", "Ljava/awt/Color;", "endColor", "direction", "Lgg/essential/elementa/components/GradientComponent$GradientDirection;", "(Ljava/awt/Color;Ljava/awt/Color;Lgg/essential/elementa/components/GradientComponent$GradientDirection;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "directionState", "Lgg/essential/elementa/state/MappedState;", "endColorState", "startColorState", "bindDirection", "newDirectionState", "bindEndColor", "newEndColorState", "bindStartColor", "newStartColorState", "drawBlock", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "x", "", "y", "x2", "y2", "drawBlock$Elementa", "getDirection", "getEndColor", "getStartColor", "setDirection", "setEndColor", "setStartColor", "Companion", "GradientColors", "GradientDirection", "Elementa" })
public class GradientComponent extends UIBlock
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final MappedState<Color, Color> startColorState;
    @NotNull
    private final MappedState<Color, Color> endColorState;
    @NotNull
    private final MappedState<GradientDirection, GradientDirection> directionState;
    
    public GradientComponent(@NotNull final State<Color> startColor, @NotNull final State<Color> endColor, @NotNull final State<GradientDirection> direction) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        super(new Color(0, 0, 0, 0));
        this.startColorState = startColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)GradientComponent$startColorState.GradientComponent$startColorState$1.INSTANCE);
        this.endColorState = endColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)GradientComponent$endColorState.GradientComponent$endColorState$1.INSTANCE);
        this.directionState = direction.map((kotlin.jvm.functions.Function1<? super GradientDirection, ? extends GradientDirection>)GradientComponent$directionState.GradientComponent$directionState$1.INSTANCE);
    }
    
    @JvmOverloads
    public GradientComponent(@NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        this(new BasicState<Color>(startColor), new BasicState<Color>(endColor), new BasicState<GradientDirection>(direction));
    }
    
    public GradientComponent(Color startColor, Color endColor, GradientDirection top_TO_BOTTOM, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            startColor = white;
        }
        if ((n & 0x2) != 0x0) {
            final Color white2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white2, "WHITE");
            endColor = white2;
        }
        if ((n & 0x4) != 0x0) {
            top_TO_BOTTOM = GradientDirection.TOP_TO_BOTTOM;
        }
        this(startColor, endColor, top_TO_BOTTOM);
    }
    
    @NotNull
    public final Color getStartColor() {
        return this.startColorState.get();
    }
    
    @NotNull
    public final GradientComponent setStartColor(@NotNull final Color startColor) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        final GradientComponent $this$setStartColor_u24lambda_u2d0 = this;
        final int n = 0;
        $this$setStartColor_u24lambda_u2d0.startColorState.set(startColor);
        return this;
    }
    
    @NotNull
    public final GradientComponent bindStartColor(@NotNull final State<Color> newStartColorState) {
        Intrinsics.checkNotNullParameter((Object)newStartColorState, "newStartColorState");
        final GradientComponent $this$bindStartColor_u24lambda_u2d1 = this;
        final int n = 0;
        $this$bindStartColor_u24lambda_u2d1.startColorState.rebind(newStartColorState);
        return this;
    }
    
    @NotNull
    public final Color getEndColor() {
        return this.endColorState.get();
    }
    
    @NotNull
    public final GradientComponent setEndColor(@NotNull final Color endColor) {
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        final GradientComponent $this$setEndColor_u24lambda_u2d2 = this;
        final int n = 0;
        $this$setEndColor_u24lambda_u2d2.endColorState.set(endColor);
        return this;
    }
    
    @NotNull
    public final GradientComponent bindEndColor(@NotNull final State<Color> newEndColorState) {
        Intrinsics.checkNotNullParameter((Object)newEndColorState, "newEndColorState");
        final GradientComponent $this$bindEndColor_u24lambda_u2d3 = this;
        final int n = 0;
        $this$bindEndColor_u24lambda_u2d3.endColorState.rebind(newEndColorState);
        return this;
    }
    
    @NotNull
    public final GradientDirection getDirection() {
        return this.directionState.get();
    }
    
    @NotNull
    public final GradientComponent setDirection(@NotNull final GradientDirection direction) {
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        final GradientComponent $this$setDirection_u24lambda_u2d4 = this;
        final int n = 0;
        $this$setDirection_u24lambda_u2d4.directionState.set(direction);
        return this;
    }
    
    @NotNull
    public final GradientComponent bindDirection(@NotNull final State<GradientDirection> newDirectionState) {
        Intrinsics.checkNotNullParameter((Object)newDirectionState, "newDirectionState");
        final GradientComponent $this$bindDirection_u24lambda_u2d5 = this;
        final int n = 0;
        $this$bindDirection_u24lambda_u2d5.directionState.rebind(newDirectionState);
        return this;
    }
    
    @Override
    public void drawBlock$Elementa(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double x2, final double y2) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        GradientComponent.Companion.drawGradientBlock(matrixStack, x, y, x2, y2, this.startColorState.get(), this.endColorState.get(), this.directionState.get());
    }
    
    @JvmOverloads
    public GradientComponent(@NotNull final Color startColor, @NotNull final Color endColor) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        this(startColor, endColor, null, 4, null);
    }
    
    @JvmOverloads
    public GradientComponent(@NotNull final Color startColor) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        this(startColor, null, null, 6, null);
    }
    
    @JvmOverloads
    public GradientComponent() {
        this(null, null, null, 7, null);
    }
    
    static {
        Companion = new Companion(null);
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019" }, d2 = { "Lgg/essential/elementa/components/GradientComponent$GradientColors;", "", "topLeft", "Ljava/awt/Color;", "topRight", "bottomLeft", "bottomRight", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "getBottomLeft", "()Ljava/awt/Color;", "getBottomRight", "getTopLeft", "getTopRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
    public static final class GradientColors
    {
        @NotNull
        private final Color topLeft;
        @NotNull
        private final Color topRight;
        @NotNull
        private final Color bottomLeft;
        @NotNull
        private final Color bottomRight;
        
        public GradientColors(@NotNull final Color topLeft, @NotNull final Color topRight, @NotNull final Color bottomLeft, @NotNull final Color bottomRight) {
            Intrinsics.checkNotNullParameter((Object)topLeft, "topLeft");
            Intrinsics.checkNotNullParameter((Object)topRight, "topRight");
            Intrinsics.checkNotNullParameter((Object)bottomLeft, "bottomLeft");
            Intrinsics.checkNotNullParameter((Object)bottomRight, "bottomRight");
            super();
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
        
        @NotNull
        public final Color getTopLeft() {
            return this.topLeft;
        }
        
        @NotNull
        public final Color getTopRight() {
            return this.topRight;
        }
        
        @NotNull
        public final Color getBottomLeft() {
            return this.bottomLeft;
        }
        
        @NotNull
        public final Color getBottomRight() {
            return this.bottomRight;
        }
        
        @NotNull
        public final Color component1() {
            return this.topLeft;
        }
        
        @NotNull
        public final Color component2() {
            return this.topRight;
        }
        
        @NotNull
        public final Color component3() {
            return this.bottomLeft;
        }
        
        @NotNull
        public final Color component4() {
            return this.bottomRight;
        }
        
        @NotNull
        public final GradientColors copy(@NotNull final Color topLeft, @NotNull final Color topRight, @NotNull final Color bottomLeft, @NotNull final Color bottomRight) {
            Intrinsics.checkNotNullParameter((Object)topLeft, "topLeft");
            Intrinsics.checkNotNullParameter((Object)topRight, "topRight");
            Intrinsics.checkNotNullParameter((Object)bottomLeft, "bottomLeft");
            Intrinsics.checkNotNullParameter((Object)bottomRight, "bottomRight");
            return new GradientColors(topLeft, topRight, bottomLeft, bottomRight);
        }
        
        public static /* synthetic */ GradientColors copy$default(final GradientColors gradientColors, Color topLeft, Color topRight, Color bottomLeft, Color bottomRight, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                topLeft = gradientColors.topLeft;
            }
            if ((n & 0x2) != 0x0) {
                topRight = gradientColors.topRight;
            }
            if ((n & 0x4) != 0x0) {
                bottomLeft = gradientColors.bottomLeft;
            }
            if ((n & 0x8) != 0x0) {
                bottomRight = gradientColors.bottomRight;
            }
            return gradientColors.copy(topLeft, topRight, bottomLeft, bottomRight);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "GradientColors(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.topLeft.hashCode();
            result = result * 31 + this.topRight.hashCode();
            result = result * 31 + this.bottomLeft.hashCode();
            result = result * 31 + this.bottomRight.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientColors)) {
                return false;
            }
            final GradientColors gradientColors = (GradientColors)other;
            return Intrinsics.areEqual((Object)this.topLeft, (Object)gradientColors.topLeft) && Intrinsics.areEqual((Object)this.topRight, (Object)gradientColors.topRight) && Intrinsics.areEqual((Object)this.bottomLeft, (Object)gradientColors.bottomLeft) && Intrinsics.areEqual((Object)this.bottomRight, (Object)gradientColors.bottomRight);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0012" }, d2 = { "Lgg/essential/elementa/components/GradientComponent$Companion;", "", "()V", "drawGradientBlock", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "x1", "", "y1", "x2", "y2", "startColor", "Ljava/awt/Color;", "endColor", "direction", "Lgg/essential/elementa/components/GradientComponent$GradientDirection;", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Deprecated(message = "This method does not allow for gradients to be rendered at sub-pixel positions. Use the Double variant instead and do not cast to Int.", replaceWith = @ReplaceWith(expression = "drawGradientBlock(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), startColor, endColor, direction)", imports = {}))
        @java.lang.Deprecated
        public final void drawGradientBlock(final int x1, final int y1, final int x2, final int y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
            Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
            Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
            Intrinsics.checkNotNullParameter((Object)direction, "direction");
            this.drawGradientBlock(x1, y1, x2, (double)y2, startColor, endColor, direction);
        }
        
        @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawGradientBlock(matrixStack, x1, y1, x2, y2, startColor, endColor, direction)", imports = {}))
        @java.lang.Deprecated
        public final void drawGradientBlock(final double x1, final double y1, final double x2, final double y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
            Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
            Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
            Intrinsics.checkNotNullParameter((Object)direction, "direction");
            this.drawGradientBlock(new UMatrixStack(), x1, y1, x2, y2, startColor, endColor, direction);
        }
        
        public final void drawGradientBlock(@NotNull final UMatrixStack matrixStack, final double x1, final double y1, final double x2, final double y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
            Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
            Intrinsics.checkNotNullParameter((Object)direction, "direction");
            UGraphics.enableBlend();
            UGraphics.disableAlpha();
            UGraphics.tryBlendFuncSeparate(770, 771, 1, 0);
            UGraphics.shadeModel(7425);
            final GradientColors colours = direction.getGradientColors(startColor, endColor);
            final UGraphics tessellator = UGraphics.getFromTessellator();
            tessellator.beginWithDefaultShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_COLOR);
            tessellator.pos(matrixStack, x2, y1, 0.0).color(colours.getTopRight()).endVertex();
            tessellator.pos(matrixStack, x1, y1, 0.0).color(colours.getTopLeft()).endVertex();
            tessellator.pos(matrixStack, x1, y2, 0.0).color(colours.getBottomLeft()).endVertex();
            tessellator.pos(matrixStack, x2, y2, 0.0).color(colours.getBottomRight()).endVertex();
            tessellator.drawDirect();
            UGraphics.shadeModel(7424);
            UGraphics.disableBlend();
            UGraphics.enableAlpha();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
