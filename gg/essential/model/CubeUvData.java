package gg.essential.model;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011" }, d2 = { "Lgg/essential/model/CubeUvData;", "", "north", "", "east", "south", "west", "up", "down", "([F[F[F[F[F[F)V", "getDown", "()[F", "getEast", "getNorth", "getSouth", "getUp", "getWest", "cosmetics" })
public final class CubeUvData
{
    @NotNull
    private final float[] north;
    @NotNull
    private final float[] east;
    @NotNull
    private final float[] south;
    @NotNull
    private final float[] west;
    @NotNull
    private final float[] up;
    @NotNull
    private final float[] down;
    
    public CubeUvData(@NotNull final float[] north, @NotNull final float[] east, @NotNull final float[] south, @NotNull final float[] west, @NotNull final float[] up, @NotNull final float[] down) {
        Intrinsics.checkNotNullParameter((Object)north, "north");
        Intrinsics.checkNotNullParameter((Object)east, "east");
        Intrinsics.checkNotNullParameter((Object)south, "south");
        Intrinsics.checkNotNullParameter((Object)west, "west");
        Intrinsics.checkNotNullParameter((Object)up, "up");
        Intrinsics.checkNotNullParameter((Object)down, "down");
        super();
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.up = up;
        this.down = down;
    }
    
    @NotNull
    public final float[] getNorth() {
        return this.north;
    }
    
    @NotNull
    public final float[] getEast() {
        return this.east;
    }
    
    @NotNull
    public final float[] getSouth() {
        return this.south;
    }
    
    @NotNull
    public final float[] getWest() {
        return this.west;
    }
    
    @NotNull
    public final float[] getUp() {
        return this.up;
    }
    
    @NotNull
    public final float[] getDown() {
        return this.down;
    }
}
