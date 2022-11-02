package gg.essential.lib.kotgl.matrix.matrices;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020\u0000H&J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\r\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0012\u0010\u0015\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0012\u0010\u0017\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0012\u0010\u0019\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0012\u0010\u001b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0012\u0010\u001d\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0012\u0010\u001f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0012\u0010!\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0012\u0010#\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006¨\u0006." }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat;", "()V", "m00", "", "getM00", "()F", "m01", "getM01", "m02", "getM02", "m03", "getM03", "m10", "getM10", "m11", "getM11", "m12", "getM12", "m13", "getM13", "m20", "getM20", "m21", "getM21", "m22", "getM22", "m23", "getM23", "m30", "getM30", "m31", "getM31", "m32", "getM32", "m33", "getM33", "copyOf", "equals", "", "other", "", "hashCode", "", "toString", "", "kotgl-matrix" })
public abstract class Mat4
{
    public Mat4() {
        super();
    }
    
    public abstract float getM00();
    
    public abstract float getM01();
    
    public abstract float getM02();
    
    public abstract float getM03();
    
    public abstract float getM10();
    
    public abstract float getM11();
    
    public abstract float getM12();
    
    public abstract float getM13();
    
    public abstract float getM20();
    
    public abstract float getM21();
    
    public abstract float getM22();
    
    public abstract float getM23();
    
    public abstract float getM30();
    
    public abstract float getM31();
    
    public abstract float getM32();
    
    public abstract float getM33();
    
    @Override
    public int hashCode() {
        return Float.hashCode(this.getM00()) ^ (Float.hashCode(this.getM01()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM02()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM03()) ^ 0x76969696) ^ (Float.hashCode(this.getM10()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM11()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM12()) ^ 0x76969696) ^ (Float.hashCode(this.getM13()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM20()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM21()) ^ 0x76969696) ^ (Float.hashCode(this.getM22()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM23()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM30()) ^ 0x76969696) ^ (Float.hashCode(this.getM31()) ^ 0x75A5A5A5) ^ (Float.hashCode(this.getM32()) ^ 0x5A5A5A5A) ^ (Float.hashCode(this.getM33()) ^ 0x76969696);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof Mat4 && GlMathJvmKt.epsEquals(this.getM00(), ((Mat4)other).getM00()) && GlMathJvmKt.epsEquals(this.getM01(), ((Mat4)other).getM01()) && GlMathJvmKt.epsEquals(this.getM02(), ((Mat4)other).getM02()) && GlMathJvmKt.epsEquals(this.getM03(), ((Mat4)other).getM03()) && GlMathJvmKt.epsEquals(this.getM10(), ((Mat4)other).getM10()) && GlMathJvmKt.epsEquals(this.getM11(), ((Mat4)other).getM11()) && GlMathJvmKt.epsEquals(this.getM12(), ((Mat4)other).getM12()) && GlMathJvmKt.epsEquals(this.getM13(), ((Mat4)other).getM13()) && GlMathJvmKt.epsEquals(this.getM20(), ((Mat4)other).getM20()) && GlMathJvmKt.epsEquals(this.getM21(), ((Mat4)other).getM21()) && GlMathJvmKt.epsEquals(this.getM22(), ((Mat4)other).getM22()) && GlMathJvmKt.epsEquals(this.getM23(), ((Mat4)other).getM23()) && GlMathJvmKt.epsEquals(this.getM30(), ((Mat4)other).getM30()) && GlMathJvmKt.epsEquals(this.getM31(), ((Mat4)other).getM31()) && GlMathJvmKt.epsEquals(this.getM32(), ((Mat4)other).getM32()) && GlMathJvmKt.epsEquals(this.getM33(), ((Mat4)other).getM33());
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("((").append(this.getM00()).append(", ").append(this.getM01()).append(", ").append(this.getM02()).append(", ").append(this.getM03()).append("),\n (").append(this.getM10()).append(", ").append(this.getM11()).append(", ").append(this.getM12()).append(", ").append(this.getM13()).append("),\n (").append(this.getM20()).append(", ").append(this.getM21()).append(", ").append(this.getM22()).append(", ");
        sb.append(this.getM23()).append("),\n (").append(this.getM30()).append(", ").append(this.getM31()).append(", ").append(this.getM32()).append(", ").append(this.getM33()).append("))");
        return sb.toString();
    }
}
