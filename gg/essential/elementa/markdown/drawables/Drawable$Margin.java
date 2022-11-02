package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001e" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public static final class Margin
{
    private float left;
    private float top;
    private float right;
    private float bottom;
    
    public Margin(final float left, final float top, final float right, final float bottom) {
        super();
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
    
    public Margin(float left, float top, float right, float bottom, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            left = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            top = 0.0f;
        }
        if ((n & 0x4) != 0x0) {
            right = 0.0f;
        }
        if ((n & 0x8) != 0x0) {
            bottom = 0.0f;
        }
        this(left, top, right, bottom);
    }
    
    public final float getLeft() {
        return this.left;
    }
    
    public final void setLeft(final float <set-?>) {
        this.left = <set-?>;
    }
    
    public final float getTop() {
        return this.top;
    }
    
    public final void setTop(final float <set-?>) {
        this.top = <set-?>;
    }
    
    public final float getRight() {
        return this.right;
    }
    
    public final void setRight(final float <set-?>) {
        this.right = <set-?>;
    }
    
    public final float getBottom() {
        return this.bottom;
    }
    
    public final void setBottom(final float <set-?>) {
        this.bottom = <set-?>;
    }
    
    public final float component1() {
        return this.left;
    }
    
    public final float component2() {
        return this.top;
    }
    
    public final float component3() {
        return this.right;
    }
    
    public final float component4() {
        return this.bottom;
    }
    
    @NotNull
    public final Margin copy(final float left, final float top, final float right, final float bottom) {
        return new Margin(left, top, right, bottom);
    }
    
    public static /* synthetic */ Margin copy$default(final Margin margin, float left, float top, float right, float bottom, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            left = margin.left;
        }
        if ((n & 0x2) != 0x0) {
            top = margin.top;
        }
        if ((n & 0x4) != 0x0) {
            right = margin.right;
        }
        if ((n & 0x8) != 0x0) {
            bottom = margin.bottom;
        }
        return margin.copy(left, top, right, bottom);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Margin(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.left);
        result = result * 31 + Float.hashCode(this.top);
        result = result * 31 + Float.hashCode(this.right);
        result = result * 31 + Float.hashCode(this.bottom);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Margin)) {
            return false;
        }
        final Margin margin = (Margin)other;
        return Intrinsics.areEqual((Object)this.left, (Object)margin.left) && Intrinsics.areEqual((Object)this.top, (Object)margin.top) && Intrinsics.areEqual((Object)this.right, (Object)margin.right) && Intrinsics.areEqual((Object)this.bottom, (Object)margin.bottom);
    }
    
    public Margin() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
}
