package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\fH\u00c6\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020'H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006(" }, d2 = { "Lgg/essential/elementa/markdown/HeaderConfig;", "", "fontColor", "Ljava/awt/Color;", "level1", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "level2", "level3", "level4", "level5", "level6", "enabled", "", "(Ljava/awt/Color;Lgg/essential/elementa/markdown/HeaderLevelConfig;Lgg/essential/elementa/markdown/HeaderLevelConfig;Lgg/essential/elementa/markdown/HeaderLevelConfig;Lgg/essential/elementa/markdown/HeaderLevelConfig;Lgg/essential/elementa/markdown/HeaderLevelConfig;Lgg/essential/elementa/markdown/HeaderLevelConfig;Z)V", "getEnabled", "()Z", "getFontColor", "()Ljava/awt/Color;", "getLevel1", "()Lgg/essential/elementa/markdown/HeaderLevelConfig;", "getLevel2", "getLevel3", "getLevel4", "getLevel5", "getLevel6", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class HeaderConfig
{
    @NotNull
    private final Color fontColor;
    @NotNull
    private final HeaderLevelConfig level1;
    @NotNull
    private final HeaderLevelConfig level2;
    @NotNull
    private final HeaderLevelConfig level3;
    @NotNull
    private final HeaderLevelConfig level4;
    @NotNull
    private final HeaderLevelConfig level5;
    @NotNull
    private final HeaderLevelConfig level6;
    private final boolean enabled;
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3, @NotNull final HeaderLevelConfig level4, @NotNull final HeaderLevelConfig level5, @NotNull final HeaderLevelConfig level6, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        Intrinsics.checkNotNullParameter((Object)level4, "level4");
        Intrinsics.checkNotNullParameter((Object)level5, "level5");
        Intrinsics.checkNotNullParameter((Object)level6, "level6");
        super();
        this.fontColor = fontColor;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.level4 = level4;
        this.level5 = level5;
        this.level6 = level6;
        this.enabled = enabled;
    }
    
    public HeaderConfig(Color fontColor, HeaderLevelConfig level1, HeaderLevelConfig level2, HeaderLevelConfig level3, HeaderLevelConfig level4, HeaderLevelConfig level5, HeaderLevelConfig level6, boolean enabled, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            fontColor = white;
        }
        if ((n & 0x2) != 0x0) {
            level1 = new HeaderLevelConfig(fontColor, 2.0f, 12.0f, 12.0f, true, null, 0.0f, 0.0f, 224, null);
        }
        if ((n & 0x4) != 0x0) {
            level2 = new HeaderLevelConfig(fontColor, 1.66f, 10.0f, 10.0f, true, null, 0.0f, 0.0f, 224, null);
        }
        if ((n & 0x8) != 0x0) {
            level3 = new HeaderLevelConfig(fontColor, 1.33f, 8.0f, 8.0f, false, null, 0.0f, 0.0f, 240, null);
        }
        if ((n & 0x10) != 0x0) {
            level4 = new HeaderLevelConfig(fontColor, 1.0f, 6.0f, 6.0f, false, null, 0.0f, 0.0f, 240, null);
        }
        if ((n & 0x20) != 0x0) {
            level5 = new HeaderLevelConfig(fontColor, 0.7f, 4.0f, 4.0f, false, null, 0.0f, 0.0f, 240, null);
        }
        if ((n & 0x40) != 0x0) {
            level6 = new HeaderLevelConfig(new Color(155, 155, 155), 0.7f, 4.0f, 4.0f, false, null, 0.0f, 0.0f, 240, null);
        }
        if ((n & 0x80) != 0x0) {
            enabled = true;
        }
        this(fontColor, level1, level2, level3, level4, level5, level6, enabled);
    }
    
    @NotNull
    public final Color getFontColor() {
        return this.fontColor;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel1() {
        return this.level1;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel2() {
        return this.level2;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel3() {
        return this.level3;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel4() {
        return this.level4;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel5() {
        return this.level5;
    }
    
    @NotNull
    public final HeaderLevelConfig getLevel6() {
        return this.level6;
    }
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    @NotNull
    public final Color component1() {
        return this.fontColor;
    }
    
    @NotNull
    public final HeaderLevelConfig component2() {
        return this.level1;
    }
    
    @NotNull
    public final HeaderLevelConfig component3() {
        return this.level2;
    }
    
    @NotNull
    public final HeaderLevelConfig component4() {
        return this.level3;
    }
    
    @NotNull
    public final HeaderLevelConfig component5() {
        return this.level4;
    }
    
    @NotNull
    public final HeaderLevelConfig component6() {
        return this.level5;
    }
    
    @NotNull
    public final HeaderLevelConfig component7() {
        return this.level6;
    }
    
    public final boolean component8() {
        return this.enabled;
    }
    
    @NotNull
    public final HeaderConfig copy(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3, @NotNull final HeaderLevelConfig level4, @NotNull final HeaderLevelConfig level5, @NotNull final HeaderLevelConfig level6, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        Intrinsics.checkNotNullParameter((Object)level4, "level4");
        Intrinsics.checkNotNullParameter((Object)level5, "level5");
        Intrinsics.checkNotNullParameter((Object)level6, "level6");
        return new HeaderConfig(fontColor, level1, level2, level3, level4, level5, level6, enabled);
    }
    
    public static /* synthetic */ HeaderConfig copy$default(final HeaderConfig headerConfig, Color fontColor, HeaderLevelConfig level1, HeaderLevelConfig level2, HeaderLevelConfig level3, HeaderLevelConfig level4, HeaderLevelConfig level5, HeaderLevelConfig level6, boolean enabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            fontColor = headerConfig.fontColor;
        }
        if ((n & 0x2) != 0x0) {
            level1 = headerConfig.level1;
        }
        if ((n & 0x4) != 0x0) {
            level2 = headerConfig.level2;
        }
        if ((n & 0x8) != 0x0) {
            level3 = headerConfig.level3;
        }
        if ((n & 0x10) != 0x0) {
            level4 = headerConfig.level4;
        }
        if ((n & 0x20) != 0x0) {
            level5 = headerConfig.level5;
        }
        if ((n & 0x40) != 0x0) {
            level6 = headerConfig.level6;
        }
        if ((n & 0x80) != 0x0) {
            enabled = headerConfig.enabled;
        }
        return headerConfig.copy(fontColor, level1, level2, level3, level4, level5, level6, enabled);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "HeaderConfig(fontColor=" + this.fontColor + ", level1=" + this.level1 + ", level2=" + this.level2 + ", level3=" + this.level3 + ", level4=" + this.level4 + ", level5=" + this.level5 + ", level6=" + this.level6 + ", enabled=" + this.enabled + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.fontColor.hashCode();
        result = result * 31 + this.level1.hashCode();
        result = result * 31 + this.level2.hashCode();
        result = result * 31 + this.level3.hashCode();
        result = result * 31 + this.level4.hashCode();
        result = result * 31 + this.level5.hashCode();
        result = result * 31 + this.level6.hashCode();
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
        if (!(other instanceof HeaderConfig)) {
            return false;
        }
        final HeaderConfig headerConfig = (HeaderConfig)other;
        return Intrinsics.areEqual((Object)this.fontColor, (Object)headerConfig.fontColor) && Intrinsics.areEqual((Object)this.level1, (Object)headerConfig.level1) && Intrinsics.areEqual((Object)this.level2, (Object)headerConfig.level2) && Intrinsics.areEqual((Object)this.level3, (Object)headerConfig.level3) && Intrinsics.areEqual((Object)this.level4, (Object)headerConfig.level4) && Intrinsics.areEqual((Object)this.level5, (Object)headerConfig.level5) && Intrinsics.areEqual((Object)this.level6, (Object)headerConfig.level6) && this.enabled == headerConfig.enabled;
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3, @NotNull final HeaderLevelConfig level4, @NotNull final HeaderLevelConfig level5, @NotNull final HeaderLevelConfig level6) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        Intrinsics.checkNotNullParameter((Object)level4, "level4");
        Intrinsics.checkNotNullParameter((Object)level5, "level5");
        Intrinsics.checkNotNullParameter((Object)level6, "level6");
        this(fontColor, level1, level2, level3, level4, level5, level6, false, 128, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3, @NotNull final HeaderLevelConfig level4, @NotNull final HeaderLevelConfig level5) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        Intrinsics.checkNotNullParameter((Object)level4, "level4");
        Intrinsics.checkNotNullParameter((Object)level5, "level5");
        this(fontColor, level1, level2, level3, level4, level5, null, false, 192, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3, @NotNull final HeaderLevelConfig level4) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        Intrinsics.checkNotNullParameter((Object)level4, "level4");
        this(fontColor, level1, level2, level3, level4, null, null, false, 224, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2, @NotNull final HeaderLevelConfig level3) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        Intrinsics.checkNotNullParameter((Object)level3, "level3");
        this(fontColor, level1, level2, level3, null, null, null, false, 240, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1, @NotNull final HeaderLevelConfig level2) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        Intrinsics.checkNotNullParameter((Object)level2, "level2");
        this(fontColor, level1, level2, null, null, null, null, false, 248, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor, @NotNull final HeaderLevelConfig level1) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)level1, "level1");
        this(fontColor, level1, null, null, null, null, null, false, 252, null);
    }
    
    @JvmOverloads
    public HeaderConfig(@NotNull final Color fontColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, null, null, null, null, null, null, false, 254, null);
    }
    
    @JvmOverloads
    public HeaderConfig() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }
}
