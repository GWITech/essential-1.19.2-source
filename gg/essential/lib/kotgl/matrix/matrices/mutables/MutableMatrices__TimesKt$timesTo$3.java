package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class MutableMatrices__TimesKt$timesTo$3 extends FunctionReferenceImpl implements Function16<Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, MutableMat4> {
    MutableMatrices__TimesKt$timesTo$3(final Object receiver) {
        super(16, receiver, (Class)MutableMatrices__SetKt.class, "set", "set(Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;FFFFFFFFFFFFFFFF)Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;", 1);
    }
    
    @NotNull
    public final MutableMat4 invoke(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float p9, final float p10, final float p11, final float p12, final float p13, final float p14, final float p15) {
        return MutableMatrices.set((MutableMat4)this.receiver, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, final Object p15, final Object p16) {
        return this.invoke(((Number)p1).floatValue(), ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).floatValue(), ((Number)p5).floatValue(), ((Number)p6).floatValue(), ((Number)p7).floatValue(), ((Number)p8).floatValue(), ((Number)p9).floatValue(), ((Number)p10).floatValue(), ((Number)p11).floatValue(), ((Number)p12).floatValue(), ((Number)p13).floatValue(), ((Number)p14).floatValue(), ((Number)p15).floatValue(), ((Number)p16).floatValue());
    }
}