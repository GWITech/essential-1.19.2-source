package gg.essential.elementa.dsl;

import kotlin.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;
import net.minecraft.text.*;
import gg.essential.universal.wrappers.message.*;

@Metadata(k = 2, mv = { 1, 6, 0 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\f\u0010\u0004\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0018\u001a\u00020\u0017*\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u0017*\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u0001*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a%\u0010!\u001a\u00020\u0001*\u00020#2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010&\u001a%\u0010!\u001a\u00020\u0001*\u00020'2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010(\"\u0015\u0010*\u001a\u00020\u001c*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u001e\"\u0015\u0010\u000f\u001a\u00020\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0010\"\u0015\u0010\u0012\u001a\u00020\u0011*\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0017*\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010.¨\u00060" }, d2 = { "Lgg/essential/elementa/constraints/SuperConstraint;", "", "Lgg/essential/elementa/constraints/RoundingConstraint;", "ceil", "(Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/RoundingConstraint;", "Ljava/awt/Color;", "", "component1", "(Ljava/awt/Color;)I", "component2", "component3", "component4", "floor", "", "Lgg/essential/elementa/constraints/RelativeConstraint;", "percent", "(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;", "Lgg/essential/elementa/constraints/RelativeWindowConstraint;", "percentOfWindow", "(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;", "", "alignOpposite", "alignOutside", "Lgg/essential/elementa/constraints/PixelConstraint;", "pixel", "(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;", "pixels", "round", "Lgg/essential/elementa/constraints/ConstantColorConstraint;", "toConstraint", "(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;", "", "textScale", "width", "(CF)F", "", "Lgg/essential/elementa/font/FontProvider;", "fontProvider", "(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;)F", "Lnet/minecraft/text/Text;", "(Lnet/minecraft/text/Text;FLgg/essential/elementa/font/FontProvider;)F", "getConstraint", "constraint", "getPercent", "getPercentOfWindow", "getPixel", "(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;", "getPixels", "Elementa" }, xi = 48)
public final class UtilitiesKt
{
    public static final float width(final char $this$width, final float textScale) {
        return UGraphics.getCharWidth($this$width) * textScale;
    }
    
    public static /* synthetic */ float width$default(final char $this$width, float textScale, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            textScale = 1.0f;
        }
        return width($this$width, textScale);
    }
    
    public static final float width(@NotNull final String $this$width, final float textScale, @NotNull final FontProvider fontProvider) {
        Intrinsics.checkNotNullParameter((Object)$this$width, "<this>");
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        return fontProvider.getStringWidth($this$width, 10.0f) * textScale;
    }
    
    public static /* synthetic */ float width$default(final String $this$width, float textScale, FontProvider vanilla_FONT_RENDERER, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            textScale = 1.0f;
        }
        if ((n & 0x2) != 0x0) {
            vanilla_FONT_RENDERER = DefaultFonts.getVANILLA_FONT_RENDERER();
        }
        return width($this$width, textScale, vanilla_FONT_RENDERER);
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixels(@NotNull final Number $this$pixels, final boolean alignOpposite, final boolean alignOutside) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return new PixelConstraint($this$pixels.floatValue(), alignOpposite, alignOutside);
    }
    
    public static /* synthetic */ PixelConstraint pixels$default(final Number $this$pixels, boolean alignOpposite, boolean alignOutside, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            alignOpposite = false;
        }
        if ((n & 0x2) != 0x0) {
            alignOutside = false;
        }
        return pixels($this$pixels, alignOpposite, alignOutside);
    }
    
    @NotNull
    public static final PixelConstraint getPixels(@NotNull final Number $this$pixels) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return pixels($this$pixels, false, false);
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixel(@NotNull final Number $this$pixel, final boolean alignOpposite, final boolean alignOutside) {
        Intrinsics.checkNotNullParameter((Object)$this$pixel, "<this>");
        return pixels($this$pixel, alignOpposite, alignOutside);
    }
    
    public static /* synthetic */ PixelConstraint pixel$default(final Number $this$pixel, boolean alignOpposite, boolean alignOutside, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            alignOpposite = false;
        }
        if ((n & 0x2) != 0x0) {
            alignOutside = false;
        }
        return pixel($this$pixel, alignOpposite, alignOutside);
    }
    
    @NotNull
    public static final PixelConstraint getPixel(@NotNull final Number $this$pixel) {
        Intrinsics.checkNotNullParameter((Object)$this$pixel, "<this>");
        return getPixels($this$pixel);
    }
    
    @NotNull
    public static final RelativeConstraint percent(@NotNull final Number $this$percent) {
        Intrinsics.checkNotNullParameter((Object)$this$percent, "<this>");
        return new RelativeConstraint($this$percent.floatValue() / 100.0f);
    }
    
    @NotNull
    public static final RelativeConstraint getPercent(@NotNull final Number $this$percent) {
        Intrinsics.checkNotNullParameter((Object)$this$percent, "<this>");
        return percent($this$percent);
    }
    
    @NotNull
    public static final RelativeWindowConstraint percentOfWindow(@NotNull final Number $this$percentOfWindow) {
        Intrinsics.checkNotNullParameter((Object)$this$percentOfWindow, "<this>");
        return new RelativeWindowConstraint($this$percentOfWindow.floatValue() / 100.0f);
    }
    
    @NotNull
    public static final RelativeWindowConstraint getPercentOfWindow(@NotNull final Number $this$percentOfWindow) {
        Intrinsics.checkNotNullParameter((Object)$this$percentOfWindow, "<this>");
        return percentOfWindow($this$percentOfWindow);
    }
    
    @NotNull
    public static final RoundingConstraint floor(@NotNull final SuperConstraint<Float> $this$floor) {
        Intrinsics.checkNotNullParameter((Object)$this$floor, "<this>");
        return new RoundingConstraint((SuperConstraint)$this$floor, RoundingConstraint$Mode.Floor);
    }
    
    @NotNull
    public static final RoundingConstraint ceil(@NotNull final SuperConstraint<Float> $this$ceil) {
        Intrinsics.checkNotNullParameter((Object)$this$ceil, "<this>");
        return new RoundingConstraint((SuperConstraint)$this$ceil, RoundingConstraint$Mode.Ceil);
    }
    
    @NotNull
    public static final RoundingConstraint round(@NotNull final SuperConstraint<Float> $this$round) {
        Intrinsics.checkNotNullParameter((Object)$this$round, "<this>");
        return new RoundingConstraint((SuperConstraint)$this$round, RoundingConstraint$Mode.Round);
    }
    
    @NotNull
    public static final ConstantColorConstraint toConstraint(@NotNull final Color $this$toConstraint) {
        Intrinsics.checkNotNullParameter((Object)$this$toConstraint, "<this>");
        return new ConstantColorConstraint($this$toConstraint);
    }
    
    @NotNull
    public static final ConstantColorConstraint getConstraint(@NotNull final Color $this$constraint) {
        Intrinsics.checkNotNullParameter((Object)$this$constraint, "<this>");
        return toConstraint($this$constraint);
    }
    
    public static final int component1(@NotNull final Color $this$component1) {
        Intrinsics.checkNotNullParameter((Object)$this$component1, "<this>");
        return $this$component1.getRed();
    }
    
    public static final int component2(@NotNull final Color $this$component2) {
        Intrinsics.checkNotNullParameter((Object)$this$component2, "<this>");
        return $this$component2.getGreen();
    }
    
    public static final int component3(@NotNull final Color $this$component3) {
        Intrinsics.checkNotNullParameter((Object)$this$component3, "<this>");
        return $this$component3.getBlue();
    }
    
    public static final int component4(@NotNull final Color $this$component4) {
        Intrinsics.checkNotNullParameter((Object)$this$component4, "<this>");
        return $this$component4.getAlpha();
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixels(@NotNull final Number $this$pixels, final boolean alignOpposite) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return pixels$default($this$pixels, alignOpposite, false, 2, null);
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixels(@NotNull final Number $this$pixels) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return pixels$default($this$pixels, false, false, 3, null);
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixel(@NotNull final Number $this$pixel, final boolean alignOpposite) {
        Intrinsics.checkNotNullParameter((Object)$this$pixel, "<this>");
        return pixel$default($this$pixel, alignOpposite, false, 2, null);
    }
    
    @JvmOverloads
    @NotNull
    public static final PixelConstraint pixel(@NotNull final Number $this$pixel) {
        Intrinsics.checkNotNullParameter((Object)$this$pixel, "<this>");
        return pixel$default($this$pixel, false, false, 3, null);
    }
    
    public static final float width(@NotNull final Text $this$width, final float textScale, @NotNull final FontProvider fontProvider) {
        Intrinsics.checkNotNullParameter((Object)$this$width, "<this>");
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        return width(new UTextComponent($this$width).getFormattedText(), textScale, fontProvider);
    }
    
    public static /* synthetic */ float width$default(final Text $this$width, float textScale, FontProvider vanilla_FONT_RENDERER, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            textScale = 1.0f;
        }
        if ((n & 0x2) != 0x0) {
            vanilla_FONT_RENDERER = DefaultFonts.getVANILLA_FONT_RENDERER();
        }
        return width($this$width, textScale, vanilla_FONT_RENDERER);
    }
}
