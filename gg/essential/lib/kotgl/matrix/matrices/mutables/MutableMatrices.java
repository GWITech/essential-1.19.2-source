package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 4, xi = 48, d1 = { "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__AdjointKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__InverseKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__MinusKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__MutableMatricesKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__PlusKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__PlusScaledKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__ProjectionKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__RotateKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__ScaleKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__SetKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__TimesKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__TranslateKt", "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices__TransposeKt" })
public final class MutableMatrices
{
    public static final <T> T adjoint(@NotNull final Mat4 $this$adjoint, @NotNull final Function16<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends T> reducer) {
        return (T)MutableMatrices__AdjointKt.adjoint($this$adjoint, (Function16)reducer);
    }
    
    @NotNull
    public static final MutableMat4 inverse(@NotNull final Mat4 $this$inverse) {
        return MutableMatrices__InverseKt.inverse($this$inverse);
    }
    
    @NotNull
    public static final MutableMat3 toMutable(@NotNull final Mat3 $this$toMutable) {
        return MutableMatrices__MutableMatricesKt.toMutable($this$toMutable);
    }
    
    @NotNull
    public static final MutableMat4 toMutable(@NotNull final Mat4 $this$toMutable) {
        return MutableMatrices__MutableMatricesKt.toMutable($this$toMutable);
    }
    
    @NotNull
    public static final MutableMat3 mutableMat3(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        return MutableMatrices__MutableMatricesKt.mutableMat3(m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }
    
    @NotNull
    public static final MutableMat4 mutableMat4(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        return MutableMatrices__MutableMatricesKt.mutableMat4(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
    }
    
    @NotNull
    public static final MutableMat3 set(@NotNull final MutableMat3 $this$set, final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        return MutableMatrices__SetKt.set($this$set, m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }
    
    @NotNull
    public static final MutableMat4 set(@NotNull final MutableMat4 $this$set, final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        return MutableMatrices__SetKt.set($this$set, m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
    }
    
    @NotNull
    public static final MutableMat3 times(@NotNull final Mat3 $this$times, @NotNull final Mat3 b, @NotNull final Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3> reducer) {
        return MutableMatrices__TimesKt.times($this$times, b, reducer);
    }
    
    @NotNull
    public static final MutableMat4 times(@NotNull final Mat4 $this$times, @NotNull final Mat4 b, @NotNull final Function16<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat4> reducer) {
        return MutableMatrices__TimesKt.times($this$times, b, reducer);
    }
    
    @NotNull
    public static final MutableMat3 times(@NotNull final Mat3 $this$times, final float k, @NotNull final Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3> reducer) {
        return MutableMatrices__TimesKt.times($this$times, k, reducer);
    }
    
    @NotNull
    public static final MutableMat4 times(@NotNull final Mat4 $this$times, @NotNull final Mat4 b) {
        return MutableMatrices__TimesKt.times($this$times, b);
    }
    
    @NotNull
    public static final MutableMat3 timesTo(@NotNull final Mat3 $this$timesTo, @NotNull final Mat3 b, @NotNull final MutableMat3 out) {
        return MutableMatrices__TimesKt.timesTo($this$timesTo, b, out);
    }
    
    @NotNull
    public static final MutableMat4 timesTo(@NotNull final Mat4 $this$timesTo, @NotNull final Mat4 b, @NotNull final MutableMat4 out) {
        return MutableMatrices__TimesKt.timesTo($this$timesTo, b, out);
    }
    
    @NotNull
    public static final MutableMat3 timesTo(@NotNull final Mat3 $this$timesTo, final float k, @NotNull final MutableMat3 out) {
        return MutableMatrices__TimesKt.timesTo($this$timesTo, -1.0f, out);
    }
    
    @NotNull
    public static final MutableMat3 timesSelf(@NotNull final MutableMat3 $this$timesSelf, @NotNull final Mat3 b) {
        return MutableMatrices__TimesKt.timesSelf($this$timesSelf, b);
    }
    
    @NotNull
    public static final MutableMat4 timesSelf(@NotNull final MutableMat4 $this$timesSelf, @NotNull final Mat4 b) {
        return MutableMatrices__TimesKt.timesSelf($this$timesSelf, b);
    }
    
    @NotNull
    public static final MutableMat3 timesSelf$467c3b85(@NotNull final MutableMat3 $this$timesSelf) {
        return MutableMatrices__TimesKt.timesSelf$467c3b85($this$timesSelf);
    }
}
