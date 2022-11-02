package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\"" }, d2 = { "Lgg/essential/elementa/markdown/URLConfig;", "", "fontColor", "Ljava/awt/Color;", "showBarOnHover", "", "barColor", "barWidth", "", "spaceBeforeBar", "enabled", "(Ljava/awt/Color;ZLjava/awt/Color;FFZ)V", "getBarColor", "()Ljava/awt/Color;", "getBarWidth", "()F", "getEnabled", "()Z", "getFontColor", "getShowBarOnHover", "getSpaceBeforeBar", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class URLConfig
{
    @NotNull
    private final Color fontColor;
    private final boolean showBarOnHover;
    @NotNull
    private final Color barColor;
    private final float barWidth;
    private final float spaceBeforeBar;
    private final boolean enabled;
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor, final boolean showBarOnHover, @NotNull final Color barColor, final float barWidth, final float spaceBeforeBar, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)barColor, "barColor");
        super();
        this.fontColor = fontColor;
        this.showBarOnHover = showBarOnHover;
        this.barColor = barColor;
        this.barWidth = barWidth;
        this.spaceBeforeBar = spaceBeforeBar;
        this.enabled = enabled;
    }
    
    public URLConfig(Color fontColor, boolean showBarOnHover, Color barColor, float barWidth, float spaceBeforeBar, boolean enabled, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            fontColor = new Color(6, 217, 210);
        }
        if ((n & 0x2) != 0x0) {
            showBarOnHover = true;
        }
        if ((n & 0x4) != 0x0) {
            barColor = new Color(6, 217, 210);
        }
        if ((n & 0x8) != 0x0) {
            barWidth = 1.0f;
        }
        if ((n & 0x10) != 0x0) {
            spaceBeforeBar = 1.0f;
        }
        if ((n & 0x20) != 0x0) {
            enabled = true;
        }
        this(fontColor, showBarOnHover, barColor, barWidth, spaceBeforeBar, enabled);
    }
    
    @NotNull
    public final Color getFontColor() {
        return this.fontColor;
    }
    
    public final boolean getShowBarOnHover() {
        return this.showBarOnHover;
    }
    
    @NotNull
    public final Color getBarColor() {
        return this.barColor;
    }
    
    public final float getBarWidth() {
        return this.barWidth;
    }
    
    public final float getSpaceBeforeBar() {
        return this.spaceBeforeBar;
    }
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    @NotNull
    public final Color component1() {
        return this.fontColor;
    }
    
    public final boolean component2() {
        return this.showBarOnHover;
    }
    
    @NotNull
    public final Color component3() {
        return this.barColor;
    }
    
    public final float component4() {
        return this.barWidth;
    }
    
    public final float component5() {
        return this.spaceBeforeBar;
    }
    
    public final boolean component6() {
        return this.enabled;
    }
    
    @NotNull
    public final URLConfig copy(@NotNull final Color fontColor, final boolean showBarOnHover, @NotNull final Color barColor, final float barWidth, final float spaceBeforeBar, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)barColor, "barColor");
        return new URLConfig(fontColor, showBarOnHover, barColor, barWidth, spaceBeforeBar, enabled);
    }
    
    public static /* synthetic */ URLConfig copy$default(final URLConfig urlConfig, Color fontColor, boolean showBarOnHover, Color barColor, float barWidth, float spaceBeforeBar, boolean enabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            fontColor = urlConfig.fontColor;
        }
        if ((n & 0x2) != 0x0) {
            showBarOnHover = urlConfig.showBarOnHover;
        }
        if ((n & 0x4) != 0x0) {
            barColor = urlConfig.barColor;
        }
        if ((n & 0x8) != 0x0) {
            barWidth = urlConfig.barWidth;
        }
        if ((n & 0x10) != 0x0) {
            spaceBeforeBar = urlConfig.spaceBeforeBar;
        }
        if ((n & 0x20) != 0x0) {
            enabled = urlConfig.enabled;
        }
        return urlConfig.copy(fontColor, showBarOnHover, barColor, barWidth, spaceBeforeBar, enabled);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "URLConfig(fontColor=" + this.fontColor + ", showBarOnHover=" + this.showBarOnHover + ", barColor=" + this.barColor + ", barWidth=" + this.barWidth + ", spaceBeforeBar=" + this.spaceBeforeBar + ", enabled=" + this.enabled + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.fontColor.hashCode();
        final int n = result * 31;
        int showBarOnHover;
        if ((showBarOnHover = (this.showBarOnHover ? 1 : 0)) != 0) {
            showBarOnHover = 1;
        }
        result = n + showBarOnHover;
        result = result * 31 + this.barColor.hashCode();
        result = result * 31 + Float.hashCode(this.barWidth);
        result = result * 31 + Float.hashCode(this.spaceBeforeBar);
        final int n2 = result * 31;
        int enabled;
        if ((enabled = (this.enabled ? 1 : 0)) != 0) {
            enabled = 1;
        }
        result = n2 + enabled;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof URLConfig)) {
            return false;
        }
        final URLConfig urlConfig = (URLConfig)other;
        return Intrinsics.areEqual((Object)this.fontColor, (Object)urlConfig.fontColor) && this.showBarOnHover == urlConfig.showBarOnHover && Intrinsics.areEqual((Object)this.barColor, (Object)urlConfig.barColor) && Intrinsics.areEqual((Object)this.barWidth, (Object)urlConfig.barWidth) && Intrinsics.areEqual((Object)this.spaceBeforeBar, (Object)urlConfig.spaceBeforeBar) && this.enabled == urlConfig.enabled;
    }
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor, final boolean showBarOnHover, @NotNull final Color barColor, final float barWidth, final float spaceBeforeBar) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)barColor, "barColor");
        this(fontColor, showBarOnHover, barColor, barWidth, spaceBeforeBar, false, 32, null);
    }
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor, final boolean showBarOnHover, @NotNull final Color barColor, final float barWidth) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)barColor, "barColor");
        this(fontColor, showBarOnHover, barColor, barWidth, 0.0f, false, 48, null);
    }
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor, final boolean showBarOnHover, @NotNull final Color barColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)barColor, "barColor");
        this(fontColor, showBarOnHover, barColor, 0.0f, 0.0f, false, 56, null);
    }
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor, final boolean showBarOnHover) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, showBarOnHover, null, 0.0f, 0.0f, false, 60, null);
    }
    
    @JvmOverloads
    public URLConfig(@NotNull final Color fontColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, false, null, 0.0f, 0.0f, false, 62, null);
    }
    
    @JvmOverloads
    public URLConfig() {
        this(null, false, null, 0.0f, 0.0f, false, 63, null);
    }
}
