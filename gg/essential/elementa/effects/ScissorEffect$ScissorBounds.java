package gg.essential.elementa.effects;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$ScissorBounds;", "", "x1", "", "y1", "x2", "y2", "(FFFF)V", "height", "getHeight", "()F", "width", "getWidth", "getX1", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
private static final class ScissorBounds
{
    private final float x1;
    private final float y1;
    private final float x2;
    private final float y2;
    
    public ScissorBounds(final float x1, final float y1, final float x2, final float y2) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public final float getX1() {
        return this.x1;
    }
    
    public final float getY1() {
        return this.y1;
    }
    
    public final float getX2() {
        return this.x2;
    }
    
    public final float getY2() {
        return this.y2;
    }
    
    public final float getWidth() {
        return this.x2 - this.x1;
    }
    
    public final float getHeight() {
        return this.y2 - this.y1;
    }
    
    public final float component1() {
        return this.x1;
    }
    
    public final float component2() {
        return this.y1;
    }
    
    public final float component3() {
        return this.x2;
    }
    
    public final float component4() {
        return this.y2;
    }
    
    @NotNull
    public final ScissorBounds copy(final float x1, final float y1, final float x2, final float y2) {
        return new ScissorBounds(x1, y1, x2, y2);
    }
    
    public static /* synthetic */ ScissorBounds copy$default(final ScissorBounds scissorBounds, float x1, float y1, float x2, float y2, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x1 = scissorBounds.x1;
        }
        if ((n & 0x2) != 0x0) {
            y1 = scissorBounds.y1;
        }
        if ((n & 0x4) != 0x0) {
            x2 = scissorBounds.x2;
        }
        if ((n & 0x8) != 0x0) {
            y2 = scissorBounds.y2;
        }
        return scissorBounds.copy(x1, y1, x2, y2);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ScissorBounds(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.x1);
        result = result * 31 + Float.hashCode(this.y1);
        result = result * 31 + Float.hashCode(this.x2);
        result = result * 31 + Float.hashCode(this.y2);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScissorBounds)) {
            return false;
        }
        final ScissorBounds scissorBounds = (ScissorBounds)other;
        return Intrinsics.areEqual((Object)this.x1, (Object)scissorBounds.x1) && Intrinsics.areEqual((Object)this.y1, (Object)scissorBounds.y1) && Intrinsics.areEqual((Object)this.x2, (Object)scissorBounds.x2) && Intrinsics.areEqual((Object)this.y2, (Object)scissorBounds.y2);
    }
}
