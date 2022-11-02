package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b#\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0002\u0010\u0014J\b\u0010&\u001a\u00020\u0000H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006'" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "Lgg/essential/lib/kotgl/matrix/matrices/ImmutableMat;", "m00", "", "m01", "m02", "m03", "m10", "m11", "m12", "m13", "m20", "m21", "m22", "m23", "m30", "m31", "m32", "m33", "(FFFFFFFFFFFFFFFF)V", "getM00", "()F", "getM01", "getM02", "getM03", "getM10", "getM11", "getM12", "getM13", "getM20", "getM21", "getM22", "getM23", "getM30", "getM31", "getM32", "getM33", "copyOf", "kotgl-matrix" })
public final class ImmutableMat4 extends Mat4
{
    private final float m00;
    private final float m01;
    private final float m02;
    private final float m03;
    private final float m10;
    private final float m11;
    private final float m12;
    private final float m13;
    private final float m20;
    private final float m21;
    private final float m22;
    private final float m23;
    private final float m30;
    private final float m31;
    private final float m32;
    private final float m33;
    
    public ImmutableMat4(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        super();
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m03 = m03;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m30 = m30;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
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
    public float getM03() {
        return this.m03;
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
    public float getM13() {
        return this.m13;
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
    
    @Override
    public float getM23() {
        return this.m23;
    }
    
    @Override
    public float getM30() {
        return this.m30;
    }
    
    @Override
    public float getM31() {
        return this.m31;
    }
    
    @Override
    public float getM32() {
        return this.m32;
    }
    
    @Override
    public float getM33() {
        return this.m33;
    }
}
