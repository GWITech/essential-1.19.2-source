package gg.essential.lib.kotgl.matrix.vectors.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b\u001a\"\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a*\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0012\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0012\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u000f" }, d2 = { "set", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec2;", "v", "Lgg/essential/lib/kotgl/matrix/vectors/Vec2;", "x", "", "y", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec3;", "z", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec4;", "w", "setAll", "value", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors")
final synthetic class MutableVectors__SetKt
{
    @NotNull
    public static final MutableVec3 set(@NotNull final MutableVec3 $this$set, final float x, final float y, final float z) {
        Intrinsics.checkNotNullParameter((Object)$this$set, "<this>");
        $this$set.setX(x);
        $this$set.setY(y);
        $this$set.setZ(z);
        return $this$set;
    }
    
    @NotNull
    public static final MutableVec4 set(@NotNull final MutableVec4 $this$set, final float x, final float y, final float z, final float w) {
        Intrinsics.checkNotNullParameter((Object)$this$set, "<this>");
        $this$set.setX(x);
        $this$set.setY(y);
        $this$set.setZ(z);
        $this$set.setW(w);
        return $this$set;
    }
}
