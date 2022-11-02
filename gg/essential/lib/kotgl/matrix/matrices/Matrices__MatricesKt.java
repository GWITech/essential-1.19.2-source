package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0006\u0010\b\u001a\u00020\u0005\u001a*\u0010\t\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH\u0086\b\u00f8\u0001\u0000\u001a&\u0010\t\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r\u001a*\u0010\u0013\u001a\u00020\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH\u0086\b\u00f8\u0001\u0000\u001aN\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r\u001a*\u0010\u0019\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH\u0086\b\u00f8\u0001\u0000\u001a\u0086\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000*0\b\u0000\u0010!\"\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\"" }, d2 = { "IDENTITY_MAT_2", "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "IDENTITY_MAT_3", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "IDENTITY_MAT_4", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "identityMat2", "identityMat3", "identityMat4", "mat2", "init", "Lkotlin/Function2;", "", "", "Lgg/essential/lib/kotgl/matrix/matrices/MatInitializer;", "m00", "m01", "m10", "m11", "mat3", "m02", "m12", "m20", "m21", "m22", "mat4", "m03", "m13", "m23", "m30", "m31", "m32", "m33", "MatInitializer", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/matrices/Matrices")
final synthetic class Matrices__MatricesKt
{
    @NotNull
    private static final Mat3 IDENTITY_MAT_3;
    @NotNull
    private static final Mat4 IDENTITY_MAT_4;
    
    @NotNull
    public static final Mat2 mat2$41c12b73() {
        return new ImmutableMat2(1.0f, 0.0f, 0.0f, 1.0f);
    }
    
    @NotNull
    public static final Mat3 mat3(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        return new ImmutableMat3(m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }
    
    @NotNull
    public static final Mat4 mat4(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        return new ImmutableMat4(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
    }
    
    @NotNull
    public static final Mat3 identityMat3() {
        return Matrices__MatricesKt.IDENTITY_MAT_3;
    }
    
    @NotNull
    public static final Mat4 identityMat4() {
        return Matrices__MatricesKt.IDENTITY_MAT_4;
    }
    
    static {
        Matrices.mat2$41c12b73();
        IDENTITY_MAT_3 = Matrices.mat3(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        IDENTITY_MAT_4 = Matrices.mat4(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }
}
