package gg.essential.lib.kotgl.matrix.matrices.mutables;

import gg.essential.lib.kotgl.matrix.matrices.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b4\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B\u0005¢\u0006\u0002\u0010\u0003J\b\u00107\u001a\u00020\u0000H&R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0018\u0010\u0010\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u0018\u0010\u0013\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u0018\u0010\u0016\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u0018\u0010\u0019\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u0018\u0010\u001c\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u0018\u0010\u001f\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u0018\u0010\"\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u0018\u0010%\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u0018\u0010(\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u0018\u0010+\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u0018\u0010.\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u0018\u00101\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u0018\u00104\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\t¨\u00069" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat;", "()V", "m00", "", "getM00", "()F", "setM00", "(F)V", "m01", "getM01", "setM01", "m02", "getM02", "setM02", "m03", "getM03", "setM03", "m10", "getM10", "setM10", "m11", "getM11", "setM11", "m12", "getM12", "setM12", "m13", "getM13", "setM13", "m20", "getM20", "setM20", "m21", "getM21", "setM21", "m22", "getM22", "setM22", "m23", "getM23", "setM23", "m30", "getM30", "setM30", "m31", "getM31", "setM31", "m32", "getM32", "setM32", "m33", "getM33", "setM33", "copyOf", "Implementation", "kotgl-matrix" })
public abstract class MutableMat4 extends Mat4
{
    public MutableMat4() {
        super();
    }
    
    public abstract void setM00(final float p0);
    
    public abstract void setM01(final float p0);
    
    public abstract void setM02(final float p0);
    
    @Override
    public abstract float getM03();
    
    public abstract void setM03(final float p0);
    
    public abstract void setM10(final float p0);
    
    public abstract void setM11(final float p0);
    
    public abstract void setM12(final float p0);
    
    @Override
    public abstract float getM13();
    
    public abstract void setM13(final float p0);
    
    public abstract void setM20(final float p0);
    
    public abstract void setM21(final float p0);
    
    public abstract void setM22(final float p0);
    
    @Override
    public abstract float getM23();
    
    public abstract void setM23(final float p0);
    
    public abstract void setM30(final float p0);
    
    public abstract void setM31(final float p0);
    
    public abstract void setM32(final float p0);
    
    public abstract void setM33(final float p0);
    
    @NotNull
    public abstract MutableMat4 copyOf();
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b4\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\b\u00106\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\r\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017¨\u00067" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4$Implementation;", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "m00", "", "m01", "m02", "m03", "m10", "m11", "m12", "m13", "m20", "m21", "m22", "m23", "m30", "m31", "m32", "m33", "(FFFFFFFFFFFFFFFF)V", "getM00", "()F", "setM00", "(F)V", "getM01", "setM01", "getM02", "setM02", "getM03", "setM03", "getM10", "setM10", "getM11", "setM11", "getM12", "setM12", "getM13", "setM13", "getM20", "setM20", "getM21", "setM21", "getM22", "setM22", "getM23", "setM23", "getM30", "setM30", "getM31", "setM31", "getM32", "setM32", "getM33", "setM33", "copyOf", "kotgl-matrix" })
    public static final class Implementation extends MutableMat4
    {
        private float m00;
        private float m01;
        private float m02;
        private float m03;
        private float m10;
        private float m11;
        private float m12;
        private float m13;
        private float m20;
        private float m21;
        private float m22;
        private float m23;
        private float m30;
        private float m31;
        private float m32;
        private float m33;
        
        public Implementation(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
            super();
            this.m00 = m00;
            this.m01 = m01;
            this.m02 = m02;
            this.m03 = m03;
            this.m10 = m10;
            this.m11 = m11;
            this.m12 = m12;
            this.m13 = m13;
            this.m20 = m20;
            this.m21 = m21;
            this.m22 = m22;
            this.m23 = m23;
            this.m30 = m30;
            this.m31 = m31;
            this.m32 = m32;
            this.m33 = m33;
        }
        
        @Override
        public float getM00() {
            return this.m00;
        }
        
        @Override
        public void setM00(final float <set-?>) {
            this.m00 = <set-?>;
        }
        
        @Override
        public float getM01() {
            return this.m01;
        }
        
        @Override
        public void setM01(final float <set-?>) {
            this.m01 = <set-?>;
        }
        
        @Override
        public float getM02() {
            return this.m02;
        }
        
        @Override
        public void setM02(final float <set-?>) {
            this.m02 = <set-?>;
        }
        
        @Override
        public float getM03() {
            return this.m03;
        }
        
        @Override
        public void setM03(final float <set-?>) {
            this.m03 = <set-?>;
        }
        
        @Override
        public float getM10() {
            return this.m10;
        }
        
        @Override
        public void setM10(final float <set-?>) {
            this.m10 = <set-?>;
        }
        
        @Override
        public float getM11() {
            return this.m11;
        }
        
        @Override
        public void setM11(final float <set-?>) {
            this.m11 = <set-?>;
        }
        
        @Override
        public float getM12() {
            return this.m12;
        }
        
        @Override
        public void setM12(final float <set-?>) {
            this.m12 = <set-?>;
        }
        
        @Override
        public float getM13() {
            return this.m13;
        }
        
        @Override
        public void setM13(final float <set-?>) {
            this.m13 = <set-?>;
        }
        
        @Override
        public float getM20() {
            return this.m20;
        }
        
        @Override
        public void setM20(final float <set-?>) {
            this.m20 = <set-?>;
        }
        
        @Override
        public float getM21() {
            return this.m21;
        }
        
        @Override
        public void setM21(final float <set-?>) {
            this.m21 = <set-?>;
        }
        
        @Override
        public float getM22() {
            return this.m22;
        }
        
        @Override
        public void setM22(final float <set-?>) {
            this.m22 = <set-?>;
        }
        
        @Override
        public float getM23() {
            return this.m23;
        }
        
        @Override
        public void setM23(final float <set-?>) {
            this.m23 = <set-?>;
        }
        
        @Override
        public float getM30() {
            return this.m30;
        }
        
        @Override
        public void setM30(final float <set-?>) {
            this.m30 = <set-?>;
        }
        
        @Override
        public float getM31() {
            return this.m31;
        }
        
        @Override
        public void setM31(final float <set-?>) {
            this.m31 = <set-?>;
        }
        
        @Override
        public float getM32() {
            return this.m32;
        }
        
        @Override
        public void setM32(final float <set-?>) {
            this.m32 = <set-?>;
        }
        
        @Override
        public float getM33() {
            return this.m33;
        }
        
        @Override
        public void setM33(final float <set-?>) {
            this.m33 = <set-?>;
        }
        
        @NotNull
        @Override
        public MutableMat4 copyOf() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
            //     4: astore_1        /* $this$reduce$iv */
            //     5: aload_1         /* $this$reduce$iv */
            //     6: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM00:()F
            //     9: aload_1         /* $this$reduce$iv */
            //    10: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM01:()F
            //    13: aload_1         /* $this$reduce$iv */
            //    14: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM02:()F
            //    17: aload_1         /* $this$reduce$iv */
            //    18: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM03:()F
            //    21: aload_1         /* $this$reduce$iv */
            //    22: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM10:()F
            //    25: aload_1         /* $this$reduce$iv */
            //    26: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM11:()F
            //    29: aload_1         /* $this$reduce$iv */
            //    30: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM12:()F
            //    33: aload_1         /* $this$reduce$iv */
            //    34: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM13:()F
            //    37: aload_1         /* $this$reduce$iv */
            //    38: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM20:()F
            //    41: aload_1         /* $this$reduce$iv */
            //    42: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM21:()F
            //    45: aload_1         /* $this$reduce$iv */
            //    46: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM22:()F
            //    49: aload_1         /* $this$reduce$iv */
            //    50: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM23:()F
            //    53: aload_1         /* $this$reduce$iv */
            //    54: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM30:()F
            //    57: aload_1         /* $this$reduce$iv */
            //    58: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM31:()F
            //    61: aload_1         /* $this$reduce$iv */
            //    62: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM32:()F
            //    65: aload_1         /* $this$reduce$iv */
            //    66: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM33:()F
            //    69: fstore_2       
            //    70: fstore_3       
            //    71: fstore          4
            //    73: fstore          5
            //    75: fstore          6
            //    77: fstore          7
            //    79: fstore          8
            //    81: fstore          9
            //    83: fstore          10
            //    85: fstore          11
            //    87: fstore          12
            //    89: fstore          13
            //    91: fstore          14
            //    93: fstore          15
            //    95: fstore          16
            //    97: fstore          p0
            //    99: new             Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4$Implementation;
            //   102: dup            
            //   103: fload           p0
            //   105: fload           p1
            //   107: fload           p2
            //   109: fload           p3
            //   111: fload           p4
            //   113: fload           p5
            //   115: fload           p6
            //   117: fload           p7
            //   119: fload           p8
            //   121: fload           p9
            //   123: fload           p10
            //   125: fload           p11
            //   127: fload           p12
            //   129: fload           p13
            //   131: fload_3         /* p14 */
            //   132: fload_2         /* p15 */
            //   133: invokespecial   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4$Implementation.<init>:(FFFFFFFFFFFFFFFF)V
            //   136: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
            //   139: areturn        
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
}
