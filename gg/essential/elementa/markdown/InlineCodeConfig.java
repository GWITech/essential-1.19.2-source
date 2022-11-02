package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\fH\u00c6\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020'H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006(" }, d2 = { "Lgg/essential/elementa/markdown/InlineCodeConfig;", "", "fontColor", "Ljava/awt/Color;", "backgroundColor", "outlineColor", "outlineWidth", "", "cornerRadius", "horizontalPadding", "verticalPadding", "enabled", "", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFFZ)V", "getBackgroundColor", "()Ljava/awt/Color;", "getCornerRadius", "()F", "getEnabled", "()Z", "getFontColor", "getHorizontalPadding", "getOutlineColor", "getOutlineWidth", "getVerticalPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class InlineCodeConfig
{
    @NotNull
    private final Color fontColor;
    @NotNull
    private final Color backgroundColor;
    @NotNull
    private final Color outlineColor;
    private final float outlineWidth;
    private final float cornerRadius;
    private final float horizontalPadding;
    private final float verticalPadding;
    private final boolean enabled;
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float horizontalPadding, final float verticalPadding, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        super();
        this.fontColor = fontColor;
        this.backgroundColor = backgroundColor;
        this.outlineColor = outlineColor;
        this.outlineWidth = outlineWidth;
        this.cornerRadius = cornerRadius;
        this.horizontalPadding = horizontalPadding;
        this.verticalPadding = verticalPadding;
        this.enabled = enabled;
    }
    
    public InlineCodeConfig(Color fontColor, Color backgroundColor, Color outlineColor, float outlineWidth, float cornerRadius, float horizontalPadding, float verticalPadding, boolean enabled, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            fontColor = white;
        }
        if ((n & 0x2) != 0x0) {
            backgroundColor = new Color(60, 60, 60, 255);
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = new Color(140, 140, 140, 255);
        }
        if ((n & 0x8) != 0x0) {
            outlineWidth = 0.5f;
        }
        if ((n & 0x10) != 0x0) {
            cornerRadius = 3.0f;
        }
        if ((n & 0x20) != 0x0) {
            horizontalPadding = 0.0f;
        }
        if ((n & 0x40) != 0x0) {
            verticalPadding = 0.0f;
        }
        if ((n & 0x80) != 0x0) {
            enabled = true;
        }
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, horizontalPadding, verticalPadding, enabled);
    }
    
    @NotNull
    public final Color getFontColor() {
        return this.fontColor;
    }
    
    @NotNull
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }
    
    @NotNull
    public final Color getOutlineColor() {
        return this.outlineColor;
    }
    
    public final float getOutlineWidth() {
        return this.outlineWidth;
    }
    
    public final float getCornerRadius() {
        return this.cornerRadius;
    }
    
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }
    
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    @NotNull
    public final Color component1() {
        return this.fontColor;
    }
    
    @NotNull
    public final Color component2() {
        return this.backgroundColor;
    }
    
    @NotNull
    public final Color component3() {
        return this.outlineColor;
    }
    
    public final float component4() {
        return this.outlineWidth;
    }
    
    public final float component5() {
        return this.cornerRadius;
    }
    
    public final float component6() {
        return this.horizontalPadding;
    }
    
    public final float component7() {
        return this.verticalPadding;
    }
    
    public final boolean component8() {
        return this.enabled;
    }
    
    @NotNull
    public final InlineCodeConfig copy(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float horizontalPadding, final float verticalPadding, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        return new InlineCodeConfig(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, horizontalPadding, verticalPadding, enabled);
    }
    
    public static /* synthetic */ InlineCodeConfig copy$default(final InlineCodeConfig inlineCodeConfig, Color fontColor, Color backgroundColor, Color outlineColor, float outlineWidth, float cornerRadius, float horizontalPadding, float verticalPadding, boolean enabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            fontColor = inlineCodeConfig.fontColor;
        }
        if ((n & 0x2) != 0x0) {
            backgroundColor = inlineCodeConfig.backgroundColor;
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = inlineCodeConfig.outlineColor;
        }
        if ((n & 0x8) != 0x0) {
            outlineWidth = inlineCodeConfig.outlineWidth;
        }
        if ((n & 0x10) != 0x0) {
            cornerRadius = inlineCodeConfig.cornerRadius;
        }
        if ((n & 0x20) != 0x0) {
            horizontalPadding = inlineCodeConfig.horizontalPadding;
        }
        if ((n & 0x40) != 0x0) {
            verticalPadding = inlineCodeConfig.verticalPadding;
        }
        if ((n & 0x80) != 0x0) {
            enabled = inlineCodeConfig.enabled;
        }
        return inlineCodeConfig.copy(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, horizontalPadding, verticalPadding, enabled);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "InlineCodeConfig(fontColor=" + this.fontColor + ", backgroundColor=" + this.backgroundColor + ", outlineColor=" + this.outlineColor + ", outlineWidth=" + this.outlineWidth + ", cornerRadius=" + this.cornerRadius + ", horizontalPadding=" + this.horizontalPadding + ", verticalPadding=" + this.verticalPadding + ", enabled=" + this.enabled + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.fontColor.hashCode();
        result = result * 31 + this.backgroundColor.hashCode();
        result = result * 31 + this.outlineColor.hashCode();
        result = result * 31 + Float.hashCode(this.outlineWidth);
        result = result * 31 + Float.hashCode(this.cornerRadius);
        result = result * 31 + Float.hashCode(this.horizontalPadding);
        result = result * 31 + Float.hashCode(this.verticalPadding);
        final int n = result * 31;
        int enabled;
        if ((enabled = (this.enabled ? 1 : 0)) != 0) {
            enabled = 1;
        }
        result = n + enabled;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineCodeConfig)) {
            return false;
        }
        final InlineCodeConfig inlineCodeConfig = (InlineCodeConfig)other;
        return Intrinsics.areEqual((Object)this.fontColor, (Object)inlineCodeConfig.fontColor) && Intrinsics.areEqual((Object)this.backgroundColor, (Object)inlineCodeConfig.backgroundColor) && Intrinsics.areEqual((Object)this.outlineColor, (Object)inlineCodeConfig.outlineColor) && Intrinsics.areEqual((Object)this.outlineWidth, (Object)inlineCodeConfig.outlineWidth) && Intrinsics.areEqual((Object)this.cornerRadius, (Object)inlineCodeConfig.cornerRadius) && Intrinsics.areEqual((Object)this.horizontalPadding, (Object)inlineCodeConfig.horizontalPadding) && Intrinsics.areEqual((Object)this.verticalPadding, (Object)inlineCodeConfig.verticalPadding) && this.enabled == inlineCodeConfig.enabled;
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float horizontalPadding, final float verticalPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, horizontalPadding, verticalPadding, false, 128, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float horizontalPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, horizontalPadding, 0.0f, false, 192, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, 0.0f, 0.0f, false, 224, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, 0.0f, 0.0f, 0.0f, false, 240, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, 0.0f, 0.0f, 0.0f, 0.0f, false, 248, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        this(fontColor, backgroundColor, null, 0.0f, 0.0f, 0.0f, 0.0f, false, 252, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig(@NotNull final Color fontColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, null, null, 0.0f, 0.0f, 0.0f, 0.0f, false, 254, null);
    }
    
    @JvmOverloads
    public InlineCodeConfig() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, false, 255, null);
    }
}
