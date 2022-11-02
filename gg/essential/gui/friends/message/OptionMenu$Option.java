package gg.essential.gui.friends.message;

import gg.essential.gui.image.*;
import java.awt.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u001b
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012
                                                   \b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010	\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\u000b\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\f\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\r\u001a\u00020
                                                   \u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011Bk\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\u000b\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\f\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\r\u001a\u00020
                                                   \u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0014J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0011\u0010"\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u00c6\u0003J	\u0010#\u001a\u00020
                                                   H\u00c6\u0003J	\u0010$\u001a\u00020
                                                   H\u00c6\u0003J	\u0010%\u001a\u00020
                                                   H\u00c6\u0003J	\u0010&\u001a\u00020
                                                   H\u00c6\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Js\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\b\b\u0002\u0010\u0013\u001a\u00020
                                                   2\b\b\u0002\u0010\u000b\u001a\u00020
                                                   2\b\b\u0002\u0010\f\u001a\u00020
                                                   2\b\b\u0002\u0010\r\u001a\u00020
                                                   2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010+\u001a\u00020,H\u00d6\u0001J	\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u0007\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006.""" }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Option;", "", "text", "", "disabled", "Lgg/essential/elementa/state/State;", "", "image", "Lgg/essential/gui/image/ImageFactory;", "textColor", "Ljava/awt/Color;", "hoveredColor", "shadowColor", "hoveredShadowColor", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/gui/image/ImageFactory;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lkotlin/jvm/functions/Function0;)V", "textState", "color", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getColor", "()Ljava/awt/Color;", "getDisabled", "()Lgg/essential/elementa/state/State;", "getHoveredColor", "getHoveredShadowColor", "getImage", "getShadowColor", "getTextState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "essential" })
public static final class Option
{
    @NotNull
    private final State<String> textState;
    @NotNull
    private final State<Boolean> disabled;
    @NotNull
    private final State<ImageFactory> image;
    @NotNull
    private final Color color;
    @NotNull
    private final Color hoveredColor;
    @NotNull
    private final Color shadowColor;
    @NotNull
    private final Color hoveredShadowColor;
    @NotNull
    private final Function0<Unit> action;
    
    public Option(@NotNull final State<String> textState, @NotNull final State<Boolean> disabled, @NotNull final State<ImageFactory> image, @NotNull final Color color, @NotNull final Color hoveredColor, @NotNull final Color shadowColor, @NotNull final Color hoveredShadowColor, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)textState, "textState");
        Intrinsics.checkNotNullParameter((Object)disabled, "disabled");
        Intrinsics.checkNotNullParameter((Object)image, "image");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)hoveredColor, "hoveredColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)hoveredShadowColor, "hoveredShadowColor");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        super();
        this.textState = textState;
        this.disabled = disabled;
        this.image = image;
        this.color = color;
        this.hoveredColor = hoveredColor;
        this.shadowColor = shadowColor;
        this.hoveredShadowColor = hoveredShadowColor;
        this.action = action;
    }
    
    public Option(final State textState, final State image, final Function0 action) {
        final State disabled = new BasicState(false);
        final Color text = EssentialPalette.TEXT;
        final Color text_HIGHLIGHT = EssentialPalette.TEXT_HIGHLIGHT;
        final Color text_SHADOW_LIGHT = EssentialPalette.TEXT_SHADOW_LIGHT;
        this(textState, disabled, image, text, text_HIGHLIGHT, text_SHADOW_LIGHT, text_SHADOW_LIGHT, (Function0<Unit>)action);
    }
    
    public Option(@NotNull final String text, @NotNull final State<Boolean> disabled, @Nullable final ImageFactory image, @NotNull final Color textColor, @NotNull final Color hoveredColor, @NotNull final Color shadowColor, @NotNull final Color hoveredShadowColor, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)disabled, "disabled");
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)hoveredColor, "hoveredColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)hoveredShadowColor, "hoveredShadowColor");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        this(new BasicState<String>(text), disabled, new BasicState<ImageFactory>(image), textColor, hoveredColor, shadowColor, hoveredShadowColor, action);
    }
    
    public Option(final String text, State disabled, ImageFactory image, Color text2, Color text_HIGHLIGHT, Color text_SHADOW_LIGHT, Color hoveredShadowColor, final Function0 action, final int n) {
        if ((n & 0x2) != 0x0) {
            disabled = new BasicState(false);
        }
        if ((n & 0x4) != 0x0) {
            image = null;
        }
        if ((n & 0x8) != 0x0) {
            text2 = EssentialPalette.TEXT;
        }
        if ((n & 0x10) != 0x0) {
            text_HIGHLIGHT = EssentialPalette.TEXT_HIGHLIGHT;
        }
        if ((n & 0x20) != 0x0) {
            text_SHADOW_LIGHT = EssentialPalette.TEXT_SHADOW_LIGHT;
        }
        if ((n & 0x40) != 0x0) {
            hoveredShadowColor = text_SHADOW_LIGHT;
        }
        this(text, disabled, image, text2, text_HIGHLIGHT, text_SHADOW_LIGHT, hoveredShadowColor, (Function0<Unit>)action);
    }
    
    @NotNull
    public final State<String> component1() {
        return this.textState;
    }
    
    @NotNull
    public final State<Boolean> component2() {
        return this.disabled;
    }
    
    @NotNull
    public final State<ImageFactory> component3() {
        return this.image;
    }
    
    @NotNull
    public final Color component4() {
        return this.color;
    }
    
    @NotNull
    public final Color component5() {
        return this.hoveredColor;
    }
    
    @NotNull
    public final Color component6() {
        return this.shadowColor;
    }
    
    @NotNull
    public final Color component7() {
        return this.hoveredShadowColor;
    }
    
    @NotNull
    public final Function0<Unit> component8() {
        return this.action;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Option(textState=" + this.textState + ", disabled=" + this.disabled + ", image=" + this.image + ", color=" + this.color + ", hoveredColor=" + this.hoveredColor + ", shadowColor=" + this.shadowColor + ", hoveredShadowColor=" + this.hoveredShadowColor + ", action=" + this.action;
    }
    
    @Override
    public int hashCode() {
        int result = this.textState.hashCode();
        result = result * 31 + this.disabled.hashCode();
        result = result * 31 + this.image.hashCode();
        result = result * 31 + this.color.hashCode();
        result = result * 31 + this.hoveredColor.hashCode();
        result = result * 31 + this.shadowColor.hashCode();
        result = result * 31 + this.hoveredShadowColor.hashCode();
        result = result * 31 + this.action.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Option)) {
            return false;
        }
        final Option option = (Option)other;
        return Intrinsics.areEqual((Object)this.textState, (Object)option.textState) && Intrinsics.areEqual((Object)this.disabled, (Object)option.disabled) && Intrinsics.areEqual((Object)this.image, (Object)option.image) && Intrinsics.areEqual((Object)this.color, (Object)option.color) && Intrinsics.areEqual((Object)this.hoveredColor, (Object)option.hoveredColor) && Intrinsics.areEqual((Object)this.shadowColor, (Object)option.shadowColor) && Intrinsics.areEqual((Object)this.hoveredShadowColor, (Object)option.hoveredShadowColor) && Intrinsics.areEqual((Object)this.action, (Object)option.action);
    }
}
