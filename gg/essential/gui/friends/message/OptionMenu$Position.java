package gg.essential.gui.friends.message;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.events.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000B
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   B\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J	\u0010\u0017\u001a\u00020\u000fH\u00c6\u0003J	\u0010\u0018\u001a\u00020\u0011H\u00c6\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020	2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J	\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 """ }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Position;", "", "x", "", "y", "(FF)V", "component", "Lgg/essential/elementa/UIComponent;", "alignOppositeX", "", "(Lgg/essential/elementa/UIComponent;Z)V", "event", "Lgg/essential/elementa/events/UIClickEvent;", "(Lgg/essential/elementa/events/UIClickEvent;)V", "xConstraint", "Lgg/essential/elementa/constraints/XConstraint;", "yConstraint", "Lgg/essential/elementa/constraints/YConstraint;", "(Lgg/essential/elementa/constraints/XConstraint;Lgg/essential/elementa/constraints/YConstraint;)V", "getXConstraint", "()Lgg/essential/elementa/constraints/XConstraint;", "getYConstraint", "()Lgg/essential/elementa/constraints/YConstraint;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "essential" })
public static final class Position
{
    @NotNull
    private final XConstraint xConstraint;
    @NotNull
    private final YConstraint yConstraint;
    
    public Position(@NotNull final XConstraint xConstraint, @NotNull final YConstraint yConstraint) {
        Intrinsics.checkNotNullParameter((Object)xConstraint, "xConstraint");
        Intrinsics.checkNotNullParameter((Object)yConstraint, "yConstraint");
        super();
        this.xConstraint = xConstraint;
        this.yConstraint = yConstraint;
    }
    
    @NotNull
    public final XConstraint getXConstraint() {
        return this.xConstraint;
    }
    
    @NotNull
    public final YConstraint getYConstraint() {
        return this.yConstraint;
    }
    
    public Position(final float x, final float y) {
        this(UtilitiesKt.getPixels(x), UtilitiesKt.getPixels(y));
    }
    
    public Position(@NotNull final UIComponent component, final boolean alignOppositeX) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this(ConstraintsKt.boundTo((XConstraint)UtilitiesKt.pixels$default(0, alignOppositeX, false, 2, null), component), ConstraintsKt.boundTo((YConstraint)UtilitiesKt.pixels(0, true, true), component));
    }
    
    public Position(@NotNull final UIClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        this(event.getAbsoluteX(), event.getAbsoluteY());
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Position(xConstraint=" + this.xConstraint + ", yConstraint=" + this.yConstraint;
    }
    
    @Override
    public int hashCode() {
        int result = this.xConstraint.hashCode();
        result = result * 31 + this.yConstraint.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Position)) {
            return false;
        }
        final Position position = (Position)other;
        return Intrinsics.areEqual((Object)this.xConstraint, (Object)position.xConstraint) && Intrinsics.areEqual((Object)this.yConstraint, (Object)position.yConstraint);
    }
}
