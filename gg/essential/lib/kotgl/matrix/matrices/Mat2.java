package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0000H&J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0016" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat;", "()V", "m00", "", "getM00", "()F", "m01", "getM01", "m10", "getM10", "m11", "getM11", "copyOf", "equals", "", "other", "", "hashCode", "", "toString", "", "kotgl-matrix" })
public abstract class Mat2
{
    public Mat2() {
        super();
    }
    
    public abstract float getM00();
    
    public abstract float getM01();
    
    public abstract float getM10();
    
    public abstract float getM11();
    
    @Override
    public int hashCode() {
        return Float.hashCode(this.getM00()) ^ (Float.hashCode(this.getM01()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM10()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM11()) ^ 0x76969696);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof Mat2 && GlMathJvmKt.epsEquals(this.getM00(), ((Mat2)other).getM00()) && GlMathJvmKt.epsEquals(this.getM01(), ((Mat2)other).getM01()) && GlMathJvmKt.epsEquals(this.getM10(), ((Mat2)other).getM10()) && GlMathJvmKt.epsEquals(this.getM11(), ((Mat2)other).getM11());
    }
    
    @NotNull
    @Override
    public String toString() {
        return "((" + this.getM00() + ", " + this.getM01() + "),\n (" + this.getM10() + ", " + this.getM11() + "))";
    }
}
