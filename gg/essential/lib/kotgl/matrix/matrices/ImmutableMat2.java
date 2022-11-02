package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0000H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat2;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat;", "m00", "", "m01", "m10", "m11", "(FFFF)V", "getM00", "()F", "getM01", "getM10", "getM11", "copyOf", "kotgl-matrix" })
public final class ImmutableMat2 extends Mat2
{
    private final float m00;
    private final float m01;
    private final float m10;
    private final float m11;
    
    public ImmutableMat2(final float m00, final float m01, final float m10, final float m11) {
        super();
        this.m00 = 1.0f;
        this.m01 = 0.0f;
        this.m10 = 0.0f;
        this.m11 = 1.0f;
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
    public float getM10() {
        return this.m10;
    }
    
    @Override
    public float getM11() {
        return this.m11;
    }
}
