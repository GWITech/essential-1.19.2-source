package gg.essential.lib.kotgl.matrix.vectors.mutables;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0001H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013" }, d2 = { "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4$Implementation;", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;", "x", "", "y", "z", "w", "(FFFF)V", "getW", "()F", "setW", "(F)V", "getX", "setX", "getY", "setY", "getZ", "setZ", "copyOf", "kotgl-matrix" })
public static final class Implementation extends MutableVec4
{
    private float x;
    private float y;
    private float z;
    private float w;
    
    public Implementation(final float x, final float y, final float z, final float w) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = 1.0f;
    }
    
    @Override
    public float getX() {
        return this.x;
    }
    
    @Override
    public void setX(final float <set-?>) {
        this.x = <set-?>;
    }
    
    @Override
    public float getY() {
        return this.y;
    }
    
    @Override
    public void setY(final float <set-?>) {
        this.y = <set-?>;
    }
    
    @Override
    public float getZ() {
        return this.z;
    }
    
    @Override
    public void setZ(final float <set-?>) {
        this.z = <set-?>;
    }
    
    @Override
    public float getW() {
        return this.w;
    }
    
    @Override
    public void setW(final float <set-?>) {
        this.w = <set-?>;
    }
}
