package gg.essential.elementa.font.data;

import kotlin.*;
import com.google.gson.annotations.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c2\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d" }, d2 = { "Lgg/essential/elementa/font/data/PlaneBounds;", "", "_left", "", "_bottom", "_right", "_top", "(FFFF)V", "bottom", "getBottom", "()F", "left", "getLeft", "right", "getRight", "top", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public final class PlaneBounds
{
    @SerializedName("left")
    private final float _left;
    @SerializedName("bottom")
    private final float _bottom;
    @SerializedName("right")
    private final float _right;
    @SerializedName("top")
    private final float _top;
    
    public PlaneBounds(final float _left, final float _bottom, final float _right, final float _top) {
        super();
        this._left = _left;
        this._bottom = _bottom;
        this._right = _right;
        this._top = _top;
    }
    
    public final float getLeft() {
        return this._left;
    }
    
    public final float getBottom() {
        return this._bottom + 0.025f;
    }
    
    public final float getRight() {
        return this._right;
    }
    
    public final float getTop() {
        return this._top + 0.025f;
    }
    
    private final float component1() {
        return this._left;
    }
    
    private final float component2() {
        return this._bottom;
    }
    
    private final float component3() {
        return this._right;
    }
    
    private final float component4() {
        return this._top;
    }
    
    @NotNull
    public final PlaneBounds copy(final float _left, final float _bottom, final float _right, final float _top) {
        return new PlaneBounds(_left, _bottom, _right, _top);
    }
    
    public static /* synthetic */ PlaneBounds copy$default(final PlaneBounds planeBounds, float left, float bottom, float right, float top, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            left = planeBounds._left;
        }
        if ((n & 0x2) != 0x0) {
            bottom = planeBounds._bottom;
        }
        if ((n & 0x4) != 0x0) {
            right = planeBounds._right;
        }
        if ((n & 0x8) != 0x0) {
            top = planeBounds._top;
        }
        return planeBounds.copy(left, bottom, right, top);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PlaneBounds(_left=" + this._left + ", _bottom=" + this._bottom + ", _right=" + this._right + ", _top=" + this._top + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this._left);
        result = result * 31 + Float.hashCode(this._bottom);
        result = result * 31 + Float.hashCode(this._right);
        result = result * 31 + Float.hashCode(this._top);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaneBounds)) {
            return false;
        }
        final PlaneBounds planeBounds = (PlaneBounds)other;
        return Intrinsics.areEqual((Object)this._left, (Object)planeBounds._left) && Intrinsics.areEqual((Object)this._bottom, (Object)planeBounds._bottom) && Intrinsics.areEqual((Object)this._right, (Object)planeBounds._right) && Intrinsics.areEqual((Object)this._top, (Object)planeBounds._top);
    }
}
