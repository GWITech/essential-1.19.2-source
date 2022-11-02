package gg.essential.lib.kotgl.matrix.vectors;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\b\u0010\b\u001a\u00020\u0000H&J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011" }, d2 = { "Lgg/essential/lib/kotgl/matrix/vectors/Vec4;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec;", "()V", "component1", "", "component2", "component3", "component4", "copyOf", "equals", "", "other", "", "hashCode", "", "toString", "", "kotgl-matrix" })
public abstract class Vec4 implements Vec
{
    public Vec4() {
        super();
    }
    
    @Override
    public int hashCode() {
        return Float.hashCode(this.getX()) ^ (Float.hashCode(this.getY()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getZ()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getW()) ^ 0x76969696);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof Vec && GlMathJvmKt.epsEquals(this.getX(), ((Vec)other).getX()) && GlMathJvmKt.epsEquals(this.getY(), ((Vec)other).getY()) && GlMathJvmKt.epsEquals(this.getZ(), ((Vec)other).getZ()) && GlMathJvmKt.epsEquals(this.getW(), ((Vec)other).getW());
    }
    
    @NotNull
    @Override
    public String toString() {
        return new StringBuilder().append('(').append(this.getX()).append(", ").append(this.getY()).append(", ").append(this.getZ()).append(", ").append(this.getW()).append(')').toString();
    }
}
