package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#" }, d2 = { "Lgg/essential/elementa/markdown/TextConfig;", "", "color", "Ljava/awt/Color;", "hasShadow", "", "shadowColor", "selectionForegroundColor", "selectionBackgroundColor", "linkColor", "underlineHoveredLink", "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Z)V", "getColor", "()Ljava/awt/Color;", "getHasShadow", "()Z", "getLinkColor", "getSelectionBackgroundColor", "getSelectionForegroundColor", "getShadowColor", "getUnderlineHoveredLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class TextConfig
{
    @NotNull
    private final Color color;
    private final boolean hasShadow;
    @NotNull
    private final Color shadowColor;
    @NotNull
    private final Color selectionForegroundColor;
    @NotNull
    private final Color selectionBackgroundColor;
    @NotNull
    private final Color linkColor;
    private final boolean underlineHoveredLink;
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color selectionForegroundColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color linkColor, final boolean underlineHoveredLink) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)linkColor, "linkColor");
        super();
        this.color = color;
        this.hasShadow = hasShadow;
        this.shadowColor = shadowColor;
        this.selectionForegroundColor = selectionForegroundColor;
        this.selectionBackgroundColor = selectionBackgroundColor;
        this.linkColor = linkColor;
        this.underlineHoveredLink = underlineHoveredLink;
    }
    
    public TextConfig(Color color, boolean hasShadow, Color shadowColor, Color selectionForegroundColor, Color selectionBackgroundColor, Color linkColor, boolean underlineHoveredLink, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            color = white;
        }
        if ((n & 0x2) != 0x0) {
            hasShadow = true;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = new Color(63, 63, 63);
        }
        if ((n & 0x8) != 0x0) {
            selectionForegroundColor = new Color(64, 139, 229);
        }
        if ((n & 0x10) != 0x0) {
            final Color white2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white2, "WHITE");
            selectionBackgroundColor = white2;
        }
        if ((n & 0x20) != 0x0) {
            linkColor = new Color(1, 165, 82);
        }
        if ((n & 0x40) != 0x0) {
            underlineHoveredLink = true;
        }
        this(color, hasShadow, shadowColor, selectionForegroundColor, selectionBackgroundColor, linkColor, underlineHoveredLink);
    }
    
    @NotNull
    public final Color getColor() {
        return this.color;
    }
    
    public final boolean getHasShadow() {
        return this.hasShadow;
    }
    
    @NotNull
    public final Color getShadowColor() {
        return this.shadowColor;
    }
    
    @NotNull
    public final Color getSelectionForegroundColor() {
        return this.selectionForegroundColor;
    }
    
    @NotNull
    public final Color getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }
    
    @NotNull
    public final Color getLinkColor() {
        return this.linkColor;
    }
    
    public final boolean getUnderlineHoveredLink() {
        return this.underlineHoveredLink;
    }
    
    @NotNull
    public final Color component1() {
        return this.color;
    }
    
    public final boolean component2() {
        return this.hasShadow;
    }
    
    @NotNull
    public final Color component3() {
        return this.shadowColor;
    }
    
    @NotNull
    public final Color component4() {
        return this.selectionForegroundColor;
    }
    
    @NotNull
    public final Color component5() {
        return this.selectionBackgroundColor;
    }
    
    @NotNull
    public final Color component6() {
        return this.linkColor;
    }
    
    public final boolean component7() {
        return this.underlineHoveredLink;
    }
    
    @NotNull
    public final TextConfig copy(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color selectionForegroundColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color linkColor, final boolean underlineHoveredLink) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)linkColor, "linkColor");
        return new TextConfig(color, hasShadow, shadowColor, selectionForegroundColor, selectionBackgroundColor, linkColor, underlineHoveredLink);
    }
    
    public static /* synthetic */ TextConfig copy$default(final TextConfig textConfig, Color color, boolean hasShadow, Color shadowColor, Color selectionForegroundColor, Color selectionBackgroundColor, Color linkColor, boolean underlineHoveredLink, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            color = textConfig.color;
        }
        if ((n & 0x2) != 0x0) {
            hasShadow = textConfig.hasShadow;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = textConfig.shadowColor;
        }
        if ((n & 0x8) != 0x0) {
            selectionForegroundColor = textConfig.selectionForegroundColor;
        }
        if ((n & 0x10) != 0x0) {
            selectionBackgroundColor = textConfig.selectionBackgroundColor;
        }
        if ((n & 0x20) != 0x0) {
            linkColor = textConfig.linkColor;
        }
        if ((n & 0x40) != 0x0) {
            underlineHoveredLink = textConfig.underlineHoveredLink;
        }
        return textConfig.copy(color, hasShadow, shadowColor, selectionForegroundColor, selectionBackgroundColor, linkColor, underlineHoveredLink);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "TextConfig(color=" + this.color + ", hasShadow=" + this.hasShadow + ", shadowColor=" + this.shadowColor + ", selectionForegroundColor=" + this.selectionForegroundColor + ", selectionBackgroundColor=" + this.selectionBackgroundColor + ", linkColor=" + this.linkColor + ", underlineHoveredLink=" + this.underlineHoveredLink + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.color.hashCode();
        final int n = result * 31;
        int hasShadow;
        if ((hasShadow = (this.hasShadow ? 1 : 0)) != 0) {
            hasShadow = 1;
        }
        result = n + hasShadow;
        result = result * 31 + this.shadowColor.hashCode();
        result = result * 31 + this.selectionForegroundColor.hashCode();
        result = result * 31 + this.selectionBackgroundColor.hashCode();
        result = result * 31 + this.linkColor.hashCode();
        final int n2 = result * 31;
        int underlineHoveredLink;
        if ((underlineHoveredLink = (this.underlineHoveredLink ? 1 : 0)) != 0) {
            underlineHoveredLink = 1;
        }
        result = n2 + underlineHoveredLink;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextConfig)) {
            return false;
        }
        final TextConfig textConfig = (TextConfig)other;
        return Intrinsics.areEqual((Object)this.color, (Object)textConfig.color) && this.hasShadow == textConfig.hasShadow && Intrinsics.areEqual((Object)this.shadowColor, (Object)textConfig.shadowColor) && Intrinsics.areEqual((Object)this.selectionForegroundColor, (Object)textConfig.selectionForegroundColor) && Intrinsics.areEqual((Object)this.selectionBackgroundColor, (Object)textConfig.selectionBackgroundColor) && Intrinsics.areEqual((Object)this.linkColor, (Object)textConfig.linkColor) && this.underlineHoveredLink == textConfig.underlineHoveredLink;
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color selectionForegroundColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color linkColor) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)linkColor, "linkColor");
        this(color, hasShadow, shadowColor, selectionForegroundColor, selectionBackgroundColor, linkColor, false, 64, null);
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color selectionForegroundColor, @NotNull final Color selectionBackgroundColor) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        this(color, hasShadow, shadowColor, selectionForegroundColor, selectionBackgroundColor, null, false, 96, null);
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color selectionForegroundColor) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        this(color, hasShadow, shadowColor, selectionForegroundColor, null, null, false, 112, null);
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow, @NotNull final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        this(color, hasShadow, shadowColor, null, null, null, false, 120, null);
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color, final boolean hasShadow) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, hasShadow, null, null, null, null, false, 124, null);
    }
    
    @JvmOverloads
    public TextConfig(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, false, null, null, null, null, false, 126, null);
    }
    
    @JvmOverloads
    public TextConfig() {
        this(null, false, null, null, null, null, false, 127, null);
    }
}
