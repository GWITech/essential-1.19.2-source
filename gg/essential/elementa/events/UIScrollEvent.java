package gg.essential.elementa.events;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019" }, d2 = { "Lgg/essential/elementa/events/UIScrollEvent;", "Lgg/essential/elementa/events/UIEvent;", "delta", "", "target", "Lgg/essential/elementa/UIComponent;", "currentTarget", "(DLgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)V", "getCurrentTarget", "()Lgg/essential/elementa/UIComponent;", "getDelta", "()D", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Elementa" })
public final class UIScrollEvent extends UIEvent
{
    private final double delta;
    @NotNull
    private final UIComponent target;
    @NotNull
    private final UIComponent currentTarget;
    
    public UIScrollEvent(final double delta, @NotNull final UIComponent target, @NotNull final UIComponent currentTarget) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        Intrinsics.checkNotNullParameter((Object)currentTarget, "currentTarget");
        super();
        this.delta = delta;
        this.target = target;
        this.currentTarget = currentTarget;
    }
    
    public final double getDelta() {
        return this.delta;
    }
    
    @NotNull
    public final UIComponent getTarget() {
        return this.target;
    }
    
    @NotNull
    public final UIComponent getCurrentTarget() {
        return this.currentTarget;
    }
    
    public final double component1() {
        return this.delta;
    }
    
    @NotNull
    public final UIComponent component2() {
        return this.target;
    }
    
    @NotNull
    public final UIComponent component3() {
        return this.currentTarget;
    }
    
    @NotNull
    public final UIScrollEvent copy(final double delta, @NotNull final UIComponent target, @NotNull final UIComponent currentTarget) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        Intrinsics.checkNotNullParameter((Object)currentTarget, "currentTarget");
        return new UIScrollEvent(delta, target, currentTarget);
    }
    
    public static /* synthetic */ UIScrollEvent copy$default(final UIScrollEvent uiScrollEvent, double delta, UIComponent target, UIComponent currentTarget, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            delta = uiScrollEvent.delta;
        }
        if ((n & 0x2) != 0x0) {
            target = uiScrollEvent.target;
        }
        if ((n & 0x4) != 0x0) {
            currentTarget = uiScrollEvent.currentTarget;
        }
        return uiScrollEvent.copy(delta, target, currentTarget);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "UIScrollEvent(delta=" + this.delta + ", target=" + this.target + ", currentTarget=" + this.currentTarget + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Double.hashCode(this.delta);
        result = result * 31 + this.target.hashCode();
        result = result * 31 + this.currentTarget.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIScrollEvent)) {
            return false;
        }
        final UIScrollEvent uiScrollEvent = (UIScrollEvent)other;
        return Intrinsics.areEqual((Object)this.delta, (Object)uiScrollEvent.delta) && Intrinsics.areEqual((Object)this.target, (Object)uiScrollEvent.target) && Intrinsics.areEqual((Object)this.currentTarget, (Object)uiScrollEvent.currentTarget);
    }
}
