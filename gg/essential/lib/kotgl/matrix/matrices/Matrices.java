package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 4, xi = 48, d1 = { "gg/essential/lib/kotgl/matrix/matrices/Matrices__DetKt", "gg/essential/lib/kotgl/matrix/matrices/Matrices__MapReduceKt", "gg/essential/lib/kotgl/matrix/matrices/Matrices__MatricesKt", "gg/essential/lib/kotgl/matrix/matrices/Matrices__ReduceKt" })
public final class Matrices
{
    @NotNull
    public static final Mat2 mat2$41c12b73() {
        return Matrices__MatricesKt.mat2$41c12b73();
    }
    
    @NotNull
    public static final Mat3 mat3(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        return Matrices__MatricesKt.mat3(m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }
    
    @NotNull
    public static final Mat4 mat4(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        return Matrices__MatricesKt.mat4(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
    }
    
    @NotNull
    public static final Mat3 identityMat3() {
        return Matrices__MatricesKt.identityMat3();
    }
    
    @NotNull
    public static final Mat4 identityMat4() {
        return Matrices__MatricesKt.identityMat4();
    }
}
