package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\b\u0010!\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006\"" }, d2 = { "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3$Implementation;", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "m00", "", "m01", "m02", "m10", "m11", "m12", "m20", "m21", "m22", "(FFFFFFFFF)V", "getM00", "()F", "setM00", "(F)V", "getM01", "setM01", "getM02", "setM02", "getM10", "setM10", "getM11", "setM11", "getM12", "setM12", "getM20", "setM20", "getM21", "setM21", "getM22", "setM22", "copyOf", "kotgl-matrix" })
public static final class Implementation extends MutableMat3
{
    private float m00;
    private float m01;
    private float m02;
    private float m10;
    private float m11;
    private float m12;
    private float m20;
    private float m21;
    private float m22;
    
    public Implementation(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        super();
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
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
    
    @NotNull
    @Override
    public MutableMat3 copyOf() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat3;
        //     4: astore_1        /* $this$reduce$iv */
        //     5: aload_1         /* $this$reduce$iv */
        //     6: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM00:()F
        //     9: aload_1         /* $this$reduce$iv */
        //    10: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM01:()F
        //    13: aload_1         /* $this$reduce$iv */
        //    14: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM02:()F
        //    17: aload_1         /* $this$reduce$iv */
        //    18: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM10:()F
        //    21: aload_1         /* $this$reduce$iv */
        //    22: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM11:()F
        //    25: aload_1         /* $this$reduce$iv */
        //    26: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM12:()F
        //    29: aload_1         /* $this$reduce$iv */
        //    30: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM20:()F
        //    33: aload_1         /* $this$reduce$iv */
        //    34: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM21:()F
        //    37: aload_1         /* $this$reduce$iv */
        //    38: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM22:()F
        //    41: fstore_2       
        //    42: fstore_3       
        //    43: fstore          4
        //    45: fstore          5
        //    47: fstore          6
        //    49: fstore          7
        //    51: fstore          8
        //    53: fstore          9
        //    55: fstore          p0
        //    57: new             Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3$Implementation;
        //    60: dup            
        //    61: fload           p0
        //    63: fload           p1
        //    65: fload           p2
        //    67: fload           p3
        //    69: fload           p4
        //    71: fload           p5
        //    73: fload           p6
        //    75: fload_3         /* p7 */
        //    76: fload_2         /* p8 */
        //    77: invokespecial   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3$Implementation.<init>:(FFFFFFFFF)V
        //    80: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //    83: areturn        
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
