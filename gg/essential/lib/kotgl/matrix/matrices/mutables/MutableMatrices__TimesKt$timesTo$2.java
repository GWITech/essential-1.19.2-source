package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class MutableMatrices__TimesKt$timesTo$2 extends FunctionReferenceImpl implements Function9<Float, Float, Float, Float, Float, Float, Float, Float, Float, MutableMat3> {
    MutableMatrices__TimesKt$timesTo$2(final Object receiver) {
        super(9, receiver, (Class)MutableMatrices__SetKt.class, "set", "set(Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;FFFFFFFFF)Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;", 1);
    }
    
    @NotNull
    public final MutableMat3 invoke(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8) {
        return MutableMatrices.set((MutableMat3)this.receiver, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
        return this.invoke(((Number)p1).floatValue(), ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).floatValue(), ((Number)p5).floatValue(), ((Number)p6).floatValue(), ((Number)p7).floatValue(), ((Number)p8).floatValue(), ((Number)p9).floatValue());
    }
}