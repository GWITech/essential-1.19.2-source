package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n\u001aR\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0005\u001a\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0005\u001a\u0012\u0010\u0019\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005¨\u0006\u001b" }, d2 = { "set", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat2;", "other", "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "m00", "", "m01", "m10", "m11", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "m02", "m12", "m20", "m21", "m22", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "m03", "m13", "m23", "m30", "m31", "m32", "m33", "setAll", "value", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices")
final synthetic class MutableMatrices__SetKt
{
    @NotNull
    public static final MutableMat3 set(@NotNull final MutableMat3 $this$set, final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        Intrinsics.checkNotNullParameter((Object)$this$set, "<this>");
        $this$set.setM00(m00);
        $this$set.setM01(m01);
        $this$set.setM02(m02);
        $this$set.setM10(m10);
        $this$set.setM11(m11);
        $this$set.setM12(m12);
        $this$set.setM20(m20);
        $this$set.setM21(m21);
        $this$set.setM22(m22);
        return $this$set;
    }
    
    @NotNull
    public static final MutableMat4 set(@NotNull final MutableMat4 $this$set, final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        Intrinsics.checkNotNullParameter((Object)$this$set, "<this>");
        $this$set.setM00(m00);
        $this$set.setM01(m01);
        $this$set.setM02(m02);
        $this$set.setM03(m03);
        $this$set.setM10(m10);
        $this$set.setM11(m11);
        $this$set.setM12(m12);
        $this$set.setM13(m13);
        $this$set.setM20(m20);
        $this$set.setM21(m21);
        $this$set.setM22(m22);
        $this$set.setM23(m23);
        $this$set.setM30(m30);
        $this$set.setM31(m31);
        $this$set.setM32(m32);
        $this$set.setM33(m33);
        return $this$set;
    }
}
