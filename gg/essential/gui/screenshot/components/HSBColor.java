package gg.essential.gui.screenshot.components;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0014
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010	\u001a\u00020\b\u0012\u0006\u0010
                                                   \u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ	\u0010\u0017\u001a\u00020\bH\u00c6\u0003J	\u0010\u0018\u001a\u00020\bH\u00c6\u0003J	\u0010\u0019\u001a\u00020\bH\u00c6\u0003J	\u0010\u001a\u001a\u00020\bH\u00c6\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010	\u001a\u00020\b2\b\b\u0002\u0010
                                                   \u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010 \u001a\u00020\u0003J	\u0010!\u001a\u00020"H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R\u001a\u0010
                                                   \u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010\u000e"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u000e"\u0004\b\u0014\u0010\u0010R\u001a\u0010	\u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0015\u0010\u000e"\u0004\b\u0016\u0010\u0010¨\u0006#""" }, d2 = { "Lgg/essential/gui/screenshot/components/HSBColor;", "", "color", "Ljava/awt/Color;", "(Ljava/awt/Color;)V", "", "(I)V", "hue", "", "saturation", "brightness", "alpha", "(FFFF)V", "getAlpha", "()F", "setAlpha", "(F)V", "getBrightness", "setBrightness", "getHue", "setHue", "getSaturation", "setSaturation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toColor", "toString", "", "essential" })
public final class HSBColor
{
    private float hue;
    private float saturation;
    private float brightness;
    private float alpha;
    
    public HSBColor(final float hue, final float saturation, final float brightness, final float alpha) {
        super();
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
        this.alpha = alpha;
    }
    
    public final float getHue() {
        return this.hue;
    }
    
    public final float getSaturation() {
        return this.saturation;
    }
    
    public final float getBrightness() {
        return this.brightness;
    }
    
    public HSBColor(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(0.0f, 0.0f, 0.0f, color.getAlpha() / 255.0f);
        final float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        this.hue = hsb[0];
        this.saturation = hsb[1];
        this.brightness = hsb[2];
    }
    
    public HSBColor(final int color) {
        this(new Color(color));
    }
    
    @NotNull
    public final Color toColor() {
        return ExtensionsKt.withAlpha(new Color(Color.HSBtoRGB(this.hue, this.saturation, this.brightness)), this.alpha);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "HSBColor(hue=" + this.hue + ", saturation=" + this.saturation + ", brightness=" + this.brightness + ", alpha=" + this.alpha;
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.hue);
        result = result * 31 + Float.hashCode(this.saturation);
        result = result * 31 + Float.hashCode(this.brightness);
        result = result * 31 + Float.hashCode(this.alpha);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HSBColor)) {
            return false;
        }
        final HSBColor hsbColor = (HSBColor)other;
        return Intrinsics.areEqual((Object)this.hue, (Object)hsbColor.hue) && Intrinsics.areEqual((Object)this.saturation, (Object)hsbColor.saturation) && Intrinsics.areEqual((Object)this.brightness, (Object)hsbColor.brightness) && Intrinsics.areEqual((Object)this.alpha, (Object)hsbColor.alpha);
    }
}
