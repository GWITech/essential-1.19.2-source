package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002BO\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0000H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0019" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat;", "m00", "", "m01", "m02", "m10", "m11", "m12", "m20", "m21", "m22", "(FFFFFFFFF)V", "getM00", "()F", "getM01", "getM02", "getM10", "getM11", "getM12", "getM20", "getM21", "getM22", "copyOf", "kotgl-matrix" })
public final class ImmutableMat3 extends Mat3
{
    private final float m00;
    private final float m01;
    private final float m02;
    private final float m10;
    private final float m11;
    private final float m12;
    private final float m20;
    private final float m21;
    private final float m22;
    
    public ImmutableMat3(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        super();
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
    }
    
    @Override
    public float getM00() {
        return this.m00;
    }
    
    @Override
    public float getM01() {
        return this.m01;
    }
    
    @Override
    public float getM02() {
        return this.m02;
    }
    
    @Override
    public float getM10() {
        return this.m10;
    }
    
    @Override
    public float getM11() {
        return this.m11;
    }
    
    @Override
    public float getM12() {
        return this.m12;
    }
    
    @Override
    public float getM20() {
        return this.m20;
    }
    
    @Override
    public float getM21() {
        return this.m21;
    }
    
    @Override
    public float getM22() {
        return this.m22;
    }
}
