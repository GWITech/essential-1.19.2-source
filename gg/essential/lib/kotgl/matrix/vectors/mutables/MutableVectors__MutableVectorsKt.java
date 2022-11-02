package gg.essential.lib.kotgl.matrix.vectors.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\n\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005\u001a\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000e\u001a&\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005\u001a\n\u0010\u000f\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\n*\u00020\b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\f\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\n\u001a\n\u0010\u0010\u001a\u00020\f*\u00020\u000e¨\u0006\u0011" }, d2 = { "mutableVec2", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec2;", "v", "Lgg/essential/lib/kotgl/matrix/vectors/Vec2;", "x", "", "y", "mutableVec3", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;", "z", "Lgg/essential/lib/kotgl/matrix/vectors/Vec3;", "mutableVec4", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;", "w", "Lgg/essential/lib/kotgl/matrix/vectors/Vec4;", "toImmutable", "toMutable", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors")
final synthetic class MutableVectors__MutableVectorsKt
{
    @NotNull
    public static final MutableVec3 mutableVec3(final float x, final float y, final float z) {
        return new MutableVec3.Implementation(x, y, z);
    }
    
    @NotNull
    public static final MutableVec4 mutableVec4$44a6ae79(final float x, final float y, final float z) {
        return new MutableVec4.Implementation(x, y, z, 1.0f);
    }
}
