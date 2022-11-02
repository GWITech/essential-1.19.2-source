package gg.essential.elementa.markdown;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020'H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006(" }, d2 = { "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "", "fontColor", "Ljava/awt/Color;", "textScale", "", "verticalSpaceBefore", "verticalSpaceAfter", "hasDivider", "", "dividerColor", "dividerWidth", "spaceBeforeDivider", "(Ljava/awt/Color;FFFZLjava/awt/Color;FF)V", "getDividerColor", "()Ljava/awt/Color;", "getDividerWidth", "()F", "getFontColor", "getHasDivider", "()Z", "getSpaceBeforeDivider", "getTextScale", "getVerticalSpaceAfter", "getVerticalSpaceBefore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class HeaderLevelConfig
{
    @NotNull
    private final Color fontColor;
    private final float textScale;
    private final float verticalSpaceBefore;
    private final float verticalSpaceAfter;
    private final boolean hasDivider;
    @NotNull
    private final Color dividerColor;
    private final float dividerWidth;
    private final float spaceBeforeDivider;
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter, final boolean hasDivider, @NotNull final Color dividerColor, final float dividerWidth, final float spaceBeforeDivider) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        super();
        this.fontColor = fontColor;
        this.textScale = textScale;
        this.verticalSpaceBefore = verticalSpaceBefore;
        this.verticalSpaceAfter = verticalSpaceAfter;
        this.hasDivider = hasDivider;
        this.dividerColor = dividerColor;
        this.dividerWidth = dividerWidth;
        this.spaceBeforeDivider = spaceBeforeDivider;
    }
    
    public HeaderLevelConfig(Color fontColor, float textScale, float verticalSpaceBefore, float verticalSpaceAfter, boolean hasDivider, Color dividerColor, float dividerWidth, float spaceBeforeDivider, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            fontColor = white;
        }
        if ((n & 0x2) != 0x0) {
            textScale = 1.0f;
        }
        if ((n & 0x4) != 0x0) {
            verticalSpaceBefore = 0.0f;
        }
        if ((n & 0x8) != 0x0) {
            verticalSpaceAfter = 5.0f;
        }
        if ((n & 0x10) != 0x0) {
            hasDivider = false;
        }
        if ((n & 0x20) != 0x0) {
            dividerColor = new Color(80, 80, 80);
        }
        if ((n & 0x40) != 0x0) {
            dividerWidth = 2.0f;
        }
        if ((n & 0x80) != 0x0) {
            spaceBeforeDivider = 5.0f;
        }
        this(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, dividerColor, dividerWidth, spaceBeforeDivider);
    }
    
    @NotNull
    public final Color getFontColor() {
        return this.fontColor;
    }
    
    public final float getTextScale() {
        return this.textScale;
    }
    
    public final float getVerticalSpaceBefore() {
        return this.verticalSpaceBefore;
    }
    
    public final float getVerticalSpaceAfter() {
        return this.verticalSpaceAfter;
    }
    
    public final boolean getHasDivider() {
        return this.hasDivider;
    }
    
    @NotNull
    public final Color getDividerColor() {
        return this.dividerColor;
    }
    
    public final float getDividerWidth() {
        return this.dividerWidth;
    }
    
    public final float getSpaceBeforeDivider() {
        return this.spaceBeforeDivider;
    }
    
    @NotNull
    public final Color component1() {
        return this.fontColor;
    }
    
    public final float component2() {
        return this.textScale;
    }
    
    public final float component3() {
        return this.verticalSpaceBefore;
    }
    
    public final float component4() {
        return this.verticalSpaceAfter;
    }
    
    public final boolean component5() {
        return this.hasDivider;
    }
    
    @NotNull
    public final Color component6() {
        return this.dividerColor;
    }
    
    public final float component7() {
        return this.dividerWidth;
    }
    
    public final float component8() {
        return this.spaceBeforeDivider;
    }
    
    @NotNull
    public final HeaderLevelConfig copy(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter, final boolean hasDivider, @NotNull final Color dividerColor, final float dividerWidth, final float spaceBeforeDivider) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        return new HeaderLevelConfig(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, dividerColor, dividerWidth, spaceBeforeDivider);
    }
    
    public static /* synthetic */ HeaderLevelConfig copy$default(final HeaderLevelConfig headerLevelConfig, Color fontColor, float textScale, float verticalSpaceBefore, float verticalSpaceAfter, boolean hasDivider, Color dividerColor, float dividerWidth, float spaceBeforeDivider, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            fontColor = headerLevelConfig.fontColor;
        }
        if ((n & 0x2) != 0x0) {
            textScale = headerLevelConfig.textScale;
        }
        if ((n & 0x4) != 0x0) {
            verticalSpaceBefore = headerLevelConfig.verticalSpaceBefore;
        }
        if ((n & 0x8) != 0x0) {
            verticalSpaceAfter = headerLevelConfig.verticalSpaceAfter;
        }
        if ((n & 0x10) != 0x0) {
            hasDivider = headerLevelConfig.hasDivider;
        }
        if ((n & 0x20) != 0x0) {
            dividerColor = headerLevelConfig.dividerColor;
        }
        if ((n & 0x40) != 0x0) {
            dividerWidth = headerLevelConfig.dividerWidth;
        }
        if ((n & 0x80) != 0x0) {
            spaceBeforeDivider = headerLevelConfig.spaceBeforeDivider;
        }
        return headerLevelConfig.copy(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, dividerColor, dividerWidth, spaceBeforeDivider);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "HeaderLevelConfig(fontColor=" + this.fontColor + ", textScale=" + this.textScale + ", verticalSpaceBefore=" + this.verticalSpaceBefore + ", verticalSpaceAfter=" + this.verticalSpaceAfter + ", hasDivider=" + this.hasDivider + ", dividerColor=" + this.dividerColor + ", dividerWidth=" + this.dividerWidth + ", spaceBeforeDivider=" + this.spaceBeforeDivider + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.fontColor.hashCode();
        result = result * 31 + Float.hashCode(this.textScale);
        result = result * 31 + Float.hashCode(this.verticalSpaceBefore);
        result = result * 31 + Float.hashCode(this.verticalSpaceAfter);
        final int n = result * 31;
        int hasDivider;
        if ((hasDivider = (this.hasDivider ? 1 : 0)) != 0) {
            hasDivider = 1;
        }
        result = n + hasDivider;
        result = result * 31 + this.dividerColor.hashCode();
        result = result * 31 + Float.hashCode(this.dividerWidth);
        result = result * 31 + Float.hashCode(this.spaceBeforeDivider);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderLevelConfig)) {
            return false;
        }
        final HeaderLevelConfig headerLevelConfig = (HeaderLevelConfig)other;
        return Intrinsics.areEqual((Object)this.fontColor, (Object)headerLevelConfig.fontColor) && Intrinsics.areEqual((Object)this.textScale, (Object)headerLevelConfig.textScale) && Intrinsics.areEqual((Object)this.verticalSpaceBefore, (Object)headerLevelConfig.verticalSpaceBefore) && Intrinsics.areEqual((Object)this.verticalSpaceAfter, (Object)headerLevelConfig.verticalSpaceAfter) && this.hasDivider == headerLevelConfig.hasDivider && Intrinsics.areEqual((Object)this.dividerColor, (Object)headerLevelConfig.dividerColor) && Intrinsics.areEqual((Object)this.dividerWidth, (Object)headerLevelConfig.dividerWidth) && Intrinsics.areEqual((Object)this.spaceBeforeDivider, (Object)headerLevelConfig.spaceBeforeDivider);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter, final boolean hasDivider, @NotNull final Color dividerColor, final float dividerWidth) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        this(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, dividerColor, dividerWidth, 0.0f, 128, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter, final boolean hasDivider, @NotNull final Color dividerColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        this(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, dividerColor, 0.0f, 0.0f, 192, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter, final boolean hasDivider) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, hasDivider, null, 0.0f, 0.0f, 224, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore, final float verticalSpaceAfter) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, textScale, verticalSpaceBefore, verticalSpaceAfter, false, null, 0.0f, 0.0f, 240, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale, final float verticalSpaceBefore) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, textScale, verticalSpaceBefore, 0.0f, false, null, 0.0f, 0.0f, 248, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor, final float textScale) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, textScale, 0.0f, 0.0f, false, null, 0.0f, 0.0f, 252, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig(@NotNull final Color fontColor) {
        Intrinsics.checkNotNullParameter((Object)fontColor, "fontColor");
        this(fontColor, 0.0f, 0.0f, 0.0f, false, null, 0.0f, 0.0f, 254, null);
    }
    
    @JvmOverloads
    public HeaderLevelConfig() {
        this(null, 0.0f, 0.0f, 0.0f, false, null, 0.0f, 0.0f, 255, null);
    }
}
