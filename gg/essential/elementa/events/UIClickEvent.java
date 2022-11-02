package gg.essential.elementa.events;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006'" }, d2 = { "Lgg/essential/elementa/events/UIClickEvent;", "Lgg/essential/elementa/events/UIEvent;", "absoluteX", "", "absoluteY", "mouseButton", "", "target", "Lgg/essential/elementa/UIComponent;", "currentTarget", "clickCount", "(FFILgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;I)V", "getAbsoluteX", "()F", "getAbsoluteY", "getClickCount", "()I", "getCurrentTarget", "()Lgg/essential/elementa/UIComponent;", "getMouseButton", "relativeX", "getRelativeX", "relativeY", "getRelativeY", "getTarget", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Elementa" })
public final class UIClickEvent extends UIEvent
{
    private final float absoluteX;
    private final float absoluteY;
    private final int mouseButton;
    @NotNull
    private final UIComponent target;
    @NotNull
    private final UIComponent currentTarget;
    private final int clickCount;
    private final float relativeX;
    private final float relativeY;
    
    public UIClickEvent(final float absoluteX, final float absoluteY, final int mouseButton, @NotNull final UIComponent target, @NotNull final UIComponent currentTarget, final int clickCount) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        Intrinsics.checkNotNullParameter((Object)currentTarget, "currentTarget");
        super();
        this.absoluteX = absoluteX;
        this.absoluteY = absoluteY;
        this.mouseButton = mouseButton;
        this.target = target;
        this.currentTarget = currentTarget;
        this.clickCount = clickCount;
        this.relativeX = this.absoluteX - this.currentTarget.getLeft();
        this.relativeY = this.absoluteY - this.currentTarget.getTop();
    }
    
    public final float getAbsoluteX() {
        return this.absoluteX;
    }
    
    public final float getAbsoluteY() {
        return this.absoluteY;
    }
    
    public final int getMouseButton() {
        return this.mouseButton;
    }
    
    @NotNull
    public final UIComponent getTarget() {
        return this.target;
    }
    
    @NotNull
    public final UIComponent getCurrentTarget() {
        return this.currentTarget;
    }
    
    public final int getClickCount() {
        return this.clickCount;
    }
    
    public final float getRelativeX() {
        return this.relativeX;
    }
    
    public final float getRelativeY() {
        return this.relativeY;
    }
    
    public final float component1() {
        return this.absoluteX;
    }
    
    public final float component2() {
        return this.absoluteY;
    }
    
    public final int component3() {
        return this.mouseButton;
    }
    
    @NotNull
    public final UIComponent component4() {
        return this.target;
    }
    
    @NotNull
    public final UIComponent component5() {
        return this.currentTarget;
    }
    
    public final int component6() {
        return this.clickCount;
    }
    
    @NotNull
    public final UIClickEvent copy(final float absoluteX, final float absoluteY, final int mouseButton, @NotNull final UIComponent target, @NotNull final UIComponent currentTarget, final int clickCount) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        Intrinsics.checkNotNullParameter((Object)currentTarget, "currentTarget");
        return new UIClickEvent(absoluteX, absoluteY, mouseButton, target, currentTarget, clickCount);
    }
    
    public static /* synthetic */ UIClickEvent copy$default(final UIClickEvent uiClickEvent, float absoluteX, float absoluteY, int mouseButton, UIComponent target, UIComponent currentTarget, int clickCount, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            absoluteX = uiClickEvent.absoluteX;
        }
        if ((n & 0x2) != 0x0) {
            absoluteY = uiClickEvent.absoluteY;
        }
        if ((n & 0x4) != 0x0) {
            mouseButton = uiClickEvent.mouseButton;
        }
        if ((n & 0x8) != 0x0) {
            target = uiClickEvent.target;
        }
        if ((n & 0x10) != 0x0) {
            currentTarget = uiClickEvent.currentTarget;
        }
        if ((n & 0x20) != 0x0) {
            clickCount = uiClickEvent.clickCount;
        }
        return uiClickEvent.copy(absoluteX, absoluteY, mouseButton, target, currentTarget, clickCount);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "UIClickEvent(absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ", mouseButton=" + this.mouseButton + ", target=" + this.target + ", currentTarget=" + this.currentTarget + ", clickCount=" + this.clickCount + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.absoluteX);
        result = result * 31 + Float.hashCode(this.absoluteY);
        result = result * 31 + Integer.hashCode(this.mouseButton);
        result = result * 31 + this.target.hashCode();
        result = result * 31 + this.currentTarget.hashCode();
        result = result * 31 + Integer.hashCode(this.clickCount);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIClickEvent)) {
            return false;
        }
        final UIClickEvent uiClickEvent = (UIClickEvent)other;
        return Intrinsics.areEqual((Object)this.absoluteX, (Object)uiClickEvent.absoluteX) && Intrinsics.areEqual((Object)this.absoluteY, (Object)uiClickEvent.absoluteY) && this.mouseButton == uiClickEvent.mouseButton && Intrinsics.areEqual((Object)this.target, (Object)uiClickEvent.target) && Intrinsics.areEqual((Object)this.currentTarget, (Object)uiClickEvent.currentTarget) && this.clickCount == uiClickEvent.clickCount;
    }
}
