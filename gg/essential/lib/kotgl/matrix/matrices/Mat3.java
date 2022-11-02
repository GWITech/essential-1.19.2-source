package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0000H&J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\r\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0012\u0010\u0015\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006¨\u0006 " }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat;", "()V", "m00", "", "getM00", "()F", "m01", "getM01", "m02", "getM02", "m10", "getM10", "m11", "getM11", "m12", "getM12", "m20", "getM20", "m21", "getM21", "m22", "getM22", "copyOf", "equals", "", "other", "", "hashCode", "", "toString", "", "kotgl-matrix" })
public abstract class Mat3
{
    public Mat3() {
        super();
    }
    
    public abstract float getM00();
    
    public abstract float getM01();
    
    public abstract float getM02();
    
    public abstract float getM10();
    
    public abstract float getM11();
    
    public abstract float getM12();
    
    public abstract float getM20();
    
    public abstract float getM21();
    
    public abstract float getM22();
    
    @Override
    public int hashCode() {
        return Float.hashCode(this.getM00()) ^ (Float.hashCode(this.getM01()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM02()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM10()) ^ 0x76969696) ^ (Float.hashCode(this.getM11()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM12()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM20()) ^ 0x76969696) ^ (Float.hashCode(this.getM21()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM22()) ^ 0x5A5A5A5A);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof Mat3 && GlMathJvmKt.epsEquals(this.getM00(), ((Mat3)other).getM00()) && GlMathJvmKt.epsEquals(this.getM01(), ((Mat3)other).getM01()) && GlMathJvmKt.epsEquals(this.getM02(), ((Mat3)other).getM02()) && GlMathJvmKt.epsEquals(this.getM10(), ((Mat3)other).getM10()) && GlMathJvmKt.epsEquals(this.getM11(), ((Mat3)other).getM11()) && GlMathJvmKt.epsEquals(this.getM12(), ((Mat3)other).getM12()) && GlMathJvmKt.epsEquals(this.getM20(), ((Mat3)other).getM20()) && GlMathJvmKt.epsEquals(this.getM21(), ((Mat3)other).getM21()) && GlMathJvmKt.epsEquals(this.getM22(), ((Mat3)other).getM22());
    }
    
    @NotNull
    @Override
    public String toString() {
        return "((" + this.getM00() + ", " + this.getM01() + ", " + this.getM02() + "),\n (" + this.getM10() + ", " + this.getM11() + ", " + this.getM12() + "),\n (" + this.getM20() + ", " + this.getM21() + ", " + this.getM22() + "))";
    }
}
