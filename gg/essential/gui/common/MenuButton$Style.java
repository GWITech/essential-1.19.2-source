package gg.essential.gui.common;

import kotlin.*;
import java.awt.*;
import java.util.*;
import gg.essential.elementa.effects.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010	J	\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J	\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Style;", "", "textColor", "Ljava/awt/Color;", "buttonColor", "outlineColor", "sides", "", "Lgg/essential/elementa/effects/OutlineEffect$Side;", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;)V", "getButtonColor", "()Ljava/awt/Color;", "getOutlineColor", "getSides", "()Ljava/util/Set;", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
public static final class Style
{
    @NotNull
    private final Color textColor;
    @NotNull
    private final Color buttonColor;
    @NotNull
    private final Color outlineColor;
    @NotNull
    private final Set<OutlineEffect.Side> sides;
    
    public Style(@NotNull final Color textColor, @NotNull final Color buttonColor, @NotNull final Color outlineColor, @NotNull final Set<? extends OutlineEffect.Side> sides) {
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)buttonColor, "buttonColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        super();
        this.textColor = textColor;
        this.buttonColor = buttonColor;
        this.outlineColor = outlineColor;
        this.sides = (Set<OutlineEffect.Side>)sides;
    }
    
    public Style(final Color textColor, final Color buttonColor, final Color outlineColor) {
        this(textColor, buttonColor, outlineColor, ArraysKt.toSet((Object[])OutlineEffect.Side.values()));
    }
    
    @NotNull
    public final Color getTextColor() {
        return this.textColor;
    }
    
    @NotNull
    public final Color getButtonColor() {
        return this.buttonColor;
    }
    
    @NotNull
    public final Color getOutlineColor() {
        return this.outlineColor;
    }
    
    @NotNull
    public final Set<OutlineEffect.Side> getSides() {
        return this.sides;
    }
    
    @NotNull
    public final Style copy(@NotNull final Color textColor, @NotNull final Color buttonColor, @NotNull final Color outlineColor, @NotNull final Set<? extends OutlineEffect.Side> sides) {
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)buttonColor, "buttonColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        return new Style(textColor, buttonColor, outlineColor, sides);
    }
    
    public static /* synthetic */ Style copy$default$562a9903(final Style style, Color textColor, Color buttonColor, Color outlineColor, Set sides, final int n) {
        if ((n & 0x1) != 0x0) {
            textColor = style.textColor;
        }
        if ((n & 0x2) != 0x0) {
            buttonColor = style.buttonColor;
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = style.outlineColor;
        }
        if ((n & 0x8) != 0x0) {
            sides = style.sides;
        }
        return style.copy(textColor, buttonColor, outlineColor, sides);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Style(textColor=" + this.textColor + ", buttonColor=" + this.buttonColor + ", outlineColor=" + this.outlineColor + ", sides=" + this.sides;
    }
    
    @Override
    public int hashCode() {
        int result = this.textColor.hashCode();
        result = result * 31 + this.buttonColor.hashCode();
        result = result * 31 + this.outlineColor.hashCode();
        result = result * 31 + this.sides.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Style)) {
            return false;
        }
        final Style style = (Style)other;
        return Intrinsics.areEqual((Object)this.textColor, (Object)style.textColor) && Intrinsics.areEqual((Object)this.buttonColor, (Object)style.buttonColor) && Intrinsics.areEqual((Object)this.outlineColor, (Object)style.outlineColor) && Intrinsics.areEqual((Object)this.sides, (Object)style.sides);
    }
}
