package gg.essential.lib.kotgl.matrix.vectors.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 4, xi = 48, d1 = { "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__CeilKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__CrossKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__DivKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__FloorKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__InverseKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__LerpKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__MaxKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__MinKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__MinusKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__MutableVectorsKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__NegateKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__NormalizeKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__PlusKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__PlusScaledKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__RandomizeKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__RoundKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__SetKt", "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors__TimesKt" })
public final class MutableVectors
{
    @NotNull
    public static final MutableVec3 mutableVec3(final float x, final float y, final float z) {
        return MutableVectors__MutableVectorsKt.mutableVec3(x, y, z);
    }
    
    @NotNull
    public static final MutableVec4 mutableVec4$44a6ae79(final float x, final float y, final float z) {
        return MutableVectors__MutableVectorsKt.mutableVec4$44a6ae79(x, y, z);
    }
    
    @NotNull
    public static final MutableVec3 set(@NotNull final MutableVec3 $this$set, final float x, final float y, final float z) {
        return MutableVectors__SetKt.set($this$set, x, y, z);
    }
    
    @NotNull
    public static final MutableVec4 set(@NotNull final MutableVec4 $this$set, final float x, final float y, final float z, final float w) {
        return MutableVectors__SetKt.set($this$set, x, y, z, w);
    }
}
