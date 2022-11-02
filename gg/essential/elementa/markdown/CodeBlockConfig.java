package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0010H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u000203H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00064" }, d2 = { "Lgg/essential/elementa/markdown/CodeBlockConfig;", "", "fontColor", "Ljava/awt/Color;", "backgroundColor", "outlineColor", "outlineWidth", "", "cornerRadius", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "topMargin", "bottomMargin", "enabled", "", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFFFFFFFZ)V", "getBackgroundColor", "()Ljava/awt/Color;", "getBottomMargin", "()F", "getBottomPadding", "getCornerRadius", "getEnabled", "()Z", "getFontColor", "getLeftPadding", "getOutlineColor", "getOutlineWidth", "getRightPadding", "getTopMargin", "getTopPadding", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class CodeBlockConfig
{
    @NotNull
    private final Color fontColor;
    @NotNull
    private final Color backgroundColor;
    @NotNull
    private final Color outlineColor;
    private final float outlineWidth;
    private final float cornerRadius;
    private final float leftPadding;
    private final float topPadding;
    private final float rightPadding;
    private final float bottomPadding;
    private final float topMargin;
    private final float bottomMargin;
    private final boolean enabled;
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding, final float bottomPadding, final float topMargin, final float bottomMargin, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        super();
        this.fontColor = fontColor;
        this.backgroundColor = backgroundColor;
        this.outlineColor = outlineColor;
        this.outlineWidth = outlineWidth;
        this.cornerRadius = cornerRadius;
        this.leftPadding = leftPadding;
        this.topPadding = topPadding;
        this.rightPadding = rightPadding;
        this.bottomPadding = bottomPadding;
        this.topMargin = topMargin;
        this.bottomMargin = bottomMargin;
        this.enabled = enabled;
    }
    
    public CodeBlockConfig(Color fontColor, Color backgroundColor, Color outlineColor, float outlineWidth, float cornerRadius, float leftPadding, float topPadding, float rightPadding, float bottomPadding, float topMargin, float bottomMargin, boolean enabled, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            fontColor = white;
        }
        if ((n & 0x2) != 0x0) {
            backgroundColor = new Color(40, 40, 40, 255);
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = new Color(120, 120, 120, 255);
        }
        if ((n & 0x8) != 0x0) {
            outlineWidth = 0.5f;
        }
        if ((n & 0x10) != 0x0) {
            cornerRadius = 3.0f;
        }
        if ((n & 0x20) != 0x0) {
            leftPadding = 5.0f;
        }
        if ((n & 0x40) != 0x0) {
            topPadding = 5.0f;
        }
        if ((n & 0x80) != 0x0) {
            rightPadding = 5.0f;
        }
        if ((n & 0x100) != 0x0) {
            bottomPadding = 5.0f;
        }
        if ((n & 0x200) != 0x0) {
            topMargin = 10.0f;
        }
        if ((n & 0x400) != 0x0) {
            bottomMargin = 10.0f;
        }
        if ((n & 0x800) != 0x0) {
            enabled = true;
        }
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, topMargin, bottomMargin, enabled);
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
    
    public final float getLeftPadding() {
        return this.leftPadding;
    }
    
    public final float getTopPadding() {
        return this.topPadding;
    }
    
    public final float getRightPadding() {
        return this.rightPadding;
    }
    
    public final float getBottomPadding() {
        return this.bottomPadding;
    }
    
    public final float getTopMargin() {
        return this.topMargin;
    }
    
    public final float getBottomMargin() {
        return this.bottomMargin;
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
        return this.leftPadding;
    }
    
    public final float component7() {
        return this.topPadding;
    }
    
    public final float component8() {
        return this.rightPadding;
    }
    
    public final float component9() {
        return this.bottomPadding;
    }
    
    public final float component10() {
        return this.topMargin;
    }
    
    public final float component11() {
        return this.bottomMargin;
    }
    
    public final boolean component12() {
        return this.enabled;
    }
    
    @NotNull
    public final CodeBlockConfig copy(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding, final float bottomPadding, final float topMargin, final float bottomMargin, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        return new CodeBlockConfig(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, topMargin, bottomMargin, enabled);
    }
    
    public static /* synthetic */ CodeBlockConfig copy$default(final CodeBlockConfig codeBlockConfig, Color fontColor, Color backgroundColor, Color outlineColor, float outlineWidth, float cornerRadius, float leftPadding, float topPadding, float rightPadding, float bottomPadding, float topMargin, float bottomMargin, boolean enabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            fontColor = codeBlockConfig.fontColor;
        }
        if ((n & 0x2) != 0x0) {
            backgroundColor = codeBlockConfig.backgroundColor;
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = codeBlockConfig.outlineColor;
        }
        if ((n & 0x8) != 0x0) {
            outlineWidth = codeBlockConfig.outlineWidth;
        }
        if ((n & 0x10) != 0x0) {
            cornerRadius = codeBlockConfig.cornerRadius;
        }
        if ((n & 0x20) != 0x0) {
            leftPadding = codeBlockConfig.leftPadding;
        }
        if ((n & 0x40) != 0x0) {
            topPadding = codeBlockConfig.topPadding;
        }
        if ((n & 0x80) != 0x0) {
            rightPadding = codeBlockConfig.rightPadding;
        }
        if ((n & 0x100) != 0x0) {
            bottomPadding = codeBlockConfig.bottomPadding;
        }
        if ((n & 0x200) != 0x0) {
            topMargin = codeBlockConfig.topMargin;
        }
        if ((n & 0x400) != 0x0) {
            bottomMargin = codeBlockConfig.bottomMargin;
        }
        if ((n & 0x800) != 0x0) {
            enabled = codeBlockConfig.enabled;
        }
        return codeBlockConfig.copy(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, topMargin, bottomMargin, enabled);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CodeBlockConfig(fontColor=").append(this.fontColor).append(", backgroundColor=").append(this.backgroundColor).append(", outlineColor=").append(this.outlineColor).append(", outlineWidth=").append(this.outlineWidth).append(", cornerRadius=").append(this.cornerRadius).append(", leftPadding=").append(this.leftPadding).append(", topPadding=").append(this.topPadding).append(", rightPadding=").append(this.rightPadding).append(", bottomPadding=").append(this.bottomPadding).append(", topMargin=").append(this.topMargin).append(", bottomMargin=").append(this.bottomMargin).append(", enabled=");
        sb.append(this.enabled).append(')');
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int result = this.fontColor.hashCode();
        result = result * 31 + this.backgroundColor.hashCode();
        result = result * 31 + this.outlineColor.hashCode();
        result = result * 31 + Float.hashCode(this.outlineWidth);
        result = result * 31 + Float.hashCode(this.cornerRadius);
        result = result * 31 + Float.hashCode(this.leftPadding);
        result = result * 31 + Float.hashCode(this.topPadding);
        result = result * 31 + Float.hashCode(this.rightPadding);
        result = result * 31 + Float.hashCode(this.bottomPadding);
        result = result * 31 + Float.hashCode(this.topMargin);
        result = result * 31 + Float.hashCode(this.bottomMargin);
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
        if (!(other instanceof CodeBlockConfig)) {
            return false;
        }
        final CodeBlockConfig codeBlockConfig = (CodeBlockConfig)other;
        return Intrinsics.areEqual((Object)this.fontColor, (Object)codeBlockConfig.fontColor) && Intrinsics.areEqual((Object)this.backgroundColor, (Object)codeBlockConfig.backgroundColor) && Intrinsics.areEqual((Object)this.outlineColor, (Object)codeBlockConfig.outlineColor) && Intrinsics.areEqual((Object)this.outlineWidth, (Object)codeBlockConfig.outlineWidth) && Intrinsics.areEqual((Object)this.cornerRadius, (Object)codeBlockConfig.cornerRadius) && Intrinsics.areEqual((Object)this.leftPadding, (Object)codeBlockConfig.leftPadding) && Intrinsics.areEqual((Object)this.topPadding, (Object)codeBlockConfig.topPadding) && Intrinsics.areEqual((Object)this.rightPadding, (Object)codeBlockConfig.rightPadding) && Intrinsics.areEqual((Object)this.bottomPadding, (Object)codeBlockConfig.bottomPadding) && Intrinsics.areEqual((Object)this.topMargin, (Object)codeBlockConfig.topMargin) && Intrinsics.areEqual((Object)this.bottomMargin, (Object)codeBlockConfig.bottomMargin) && this.enabled == codeBlockConfig.enabled;
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding, final float bottomPadding, final float topMargin, final float bottomMargin) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, topMargin, bottomMargin, false, 2048, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding, final float bottomPadding, final float topMargin) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, topMargin, 0.0f, false, 3072, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding, final float bottomPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, bottomPadding, 0.0f, 0.0f, false, 3584, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding, final float rightPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, rightPadding, 0.0f, 0.0f, 0.0f, false, 3840, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding, final float topPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, topPadding, 0.0f, 0.0f, 0.0f, 0.0f, false, 3968, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius, final float leftPadding) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, leftPadding, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4032, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, final float cornerRadius) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, cornerRadius, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4064, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, outlineWidth, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4080, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor, @NotNull final Color outlineColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(fontColor, backgroundColor, outlineColor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4088, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor, @NotNull final Color backgroundColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        this(fontColor, backgroundColor, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4092, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig(@NotNull final Color fontColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4094, null);
    }
    
    @JvmOverloads
    public CodeBlockConfig() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4095, null);
    }
}
