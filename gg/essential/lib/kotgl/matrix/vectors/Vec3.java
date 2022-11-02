package gg.essential.lib.kotgl.matrix.vectors;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0000H&J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "Lgg/essential/lib/kotgl/matrix/vectors/Vec3;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec4;", "()V", "w", "", "getW", "()F", "copyOf", "toString", "", "kotgl-matrix" })
public abstract class Vec3 extends Vec4
{
    public Vec3() {
        super();
    }
    
    @Override
    public final float getW() {
        return 0.0f;
    }
    
    @NotNull
    @Override
    public String toString() {
        return new StringBuilder().append('(').append(this.getX()).append(", ").append(this.getY()).append(", ").append(this.getZ()).append(')').toString();
    }
}
