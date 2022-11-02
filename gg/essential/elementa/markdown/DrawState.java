package gg.essential.elementa.markdown;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/markdown/DrawState;", "", "xShift", "", "yShift", "(FF)V", "getXShift", "()F", "getYShift", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public final class DrawState
{
    private final float xShift;
    private final float yShift;
    
    public DrawState(final float xShift, final float yShift) {
        super();
        this.xShift = xShift;
        this.yShift = yShift;
    }
    
    public final float getXShift() {
        return this.xShift;
    }
    
    public final float getYShift() {
        return this.yShift;
    }
    
    public final float component1() {
        return this.xShift;
    }
    
    public final float component2() {
        return this.yShift;
    }
    
    @NotNull
    public final DrawState copy(final float xShift, final float yShift) {
        return new DrawState(xShift, yShift);
    }
    
    public static /* synthetic */ DrawState copy$default(final DrawState drawState, float xShift, float yShift, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            xShift = drawState.xShift;
        }
        if ((n & 0x2) != 0x0) {
            yShift = drawState.yShift;
        }
        return drawState.copy(xShift, yShift);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "DrawState(xShift=" + this.xShift + ", yShift=" + this.yShift + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.xShift);
        result = result * 31 + Float.hashCode(this.yShift);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawState)) {
            return false;
        }
        final DrawState drawState = (DrawState)other;
        return Intrinsics.areEqual((Object)this.xShift, (Object)drawState.xShift) && Intrinsics.areEqual((Object)this.yShift, (Object)drawState.yShift);
    }
}
