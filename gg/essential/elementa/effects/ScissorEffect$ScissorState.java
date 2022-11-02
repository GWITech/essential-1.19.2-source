package gg.essential.elementa.effects;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "", "x", "", "y", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Elementa" })
public static final class ScissorState
{
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    
    public ScissorState(final int x, final int y, final int width, final int height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public final int getX() {
        return this.x;
    }
    
    public final int getY() {
        return this.y;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    public final int component1() {
        return this.x;
    }
    
    public final int component2() {
        return this.y;
    }
    
    public final int component3() {
        return this.width;
    }
    
    public final int component4() {
        return this.height;
    }
    
    @NotNull
    public final ScissorState copy(final int x, final int y, final int width, final int height) {
        return new ScissorState(x, y, width, height);
    }
    
    public static /* synthetic */ ScissorState copy$default(final ScissorState scissorState, int x, int y, int width, int height, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = scissorState.x;
        }
        if ((n & 0x2) != 0x0) {
            y = scissorState.y;
        }
        if ((n & 0x4) != 0x0) {
            width = scissorState.width;
        }
        if ((n & 0x8) != 0x0) {
            height = scissorState.height;
        }
        return scissorState.copy(x, y, width, height);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ScissorState(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Integer.hashCode(this.x);
        result = result * 31 + Integer.hashCode(this.y);
        result = result * 31 + Integer.hashCode(this.width);
        result = result * 31 + Integer.hashCode(this.height);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScissorState)) {
            return false;
        }
        final ScissorState scissorState = (ScissorState)other;
        return this.x == scissorState.x && this.y == scissorState.y && this.width == scissorState.width && this.height == scissorState.height;
    }
}
