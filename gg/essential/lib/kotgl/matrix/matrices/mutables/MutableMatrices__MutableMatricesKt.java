package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kotgl.matrix.matrices.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0086\b\u00f8\u0001\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a*\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0086\b\u00f8\u0001\u0000\u001aN\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017\u001a*\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0086\b\u00f8\u0001\u0000\u001a\u0086\u0001\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007\u001a\n\u0010\u001f\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u001f\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u001f\u001a\u00020\u0017*\u00020\u0016\u001a\n\u0010 \u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010 \u001a\u00020\u000e*\u00020\u000f\u001a\n\u0010 \u001a\u00020\u0016*\u00020\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!" }, d2 = { "mutableMat2", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat2;", "src", "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "init", "Lkotlin/Function2;", "", "", "Lgg/essential/lib/kotgl/matrix/matrices/MatInitializer;", "m00", "m01", "m10", "m11", "mutableMat3", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "m02", "m12", "m20", "m21", "m22", "mutableMat4", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "m03", "m13", "m23", "m30", "m31", "m32", "m33", "toImmutable", "toMutable", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices")
final synthetic class MutableMatrices__MutableMatricesKt
{
    @NotNull
    public static final MutableMat3 toMutable(@NotNull final Mat3 $this$toMutable) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMutable */
        //     7: astore_1        /* $this$reduce$iv */
        //     8: aload_1         /* $this$reduce$iv */
        //     9: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM00:()F
        //    12: aload_1         /* $this$reduce$iv */
        //    13: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM01:()F
        //    16: aload_1         /* $this$reduce$iv */
        //    17: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM02:()F
        //    20: aload_1         /* $this$reduce$iv */
        //    21: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM10:()F
        //    24: aload_1         /* $this$reduce$iv */
        //    25: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM11:()F
        //    28: aload_1         /* $this$reduce$iv */
        //    29: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM12:()F
        //    32: aload_1         /* $this$reduce$iv */
        //    33: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM20:()F
        //    36: aload_1         /* $this$reduce$iv */
        //    37: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM21:()F
        //    40: aload_1         /* $this$reduce$iv */
        //    41: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM22:()F
        //    44: fstore_2       
        //    45: fstore_3       
        //    46: fstore          4
        //    48: fstore          5
        //    50: fstore          6
        //    52: fstore          7
        //    54: fstore          8
        //    56: fstore          9
        //    58: fstore          p0
        //    60: fload           p0
        //    62: fload           p1
        //    64: fload           p2
        //    66: fload           p3
        //    68: fload           p4
        //    70: fload           p5
        //    72: fload           p6
        //    74: fload_3         /* p7 */
        //    75: fload_2         /* p8 */
        //    76: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.mutableMat3:(FFFFFFFFF)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //    79: areturn        
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$toMutable  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final MutableMat4 toMutable(@NotNull final Mat4 $this$toMutable) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toMutable */
        //     7: astore_1        /* $this$reduce$iv */
        //     8: aload_1         /* $this$reduce$iv */
        //     9: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM00:()F
        //    12: aload_1         /* $this$reduce$iv */
        //    13: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM01:()F
        //    16: aload_1         /* $this$reduce$iv */
        //    17: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM02:()F
        //    20: aload_1         /* $this$reduce$iv */
        //    21: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM03:()F
        //    24: aload_1         /* $this$reduce$iv */
        //    25: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM10:()F
        //    28: aload_1         /* $this$reduce$iv */
        //    29: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM11:()F
        //    32: aload_1         /* $this$reduce$iv */
        //    33: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM12:()F
        //    36: aload_1         /* $this$reduce$iv */
        //    37: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM13:()F
        //    40: aload_1         /* $this$reduce$iv */
        //    41: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM20:()F
        //    44: aload_1         /* $this$reduce$iv */
        //    45: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM21:()F
        //    48: aload_1         /* $this$reduce$iv */
        //    49: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM22:()F
        //    52: aload_1         /* $this$reduce$iv */
        //    53: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM23:()F
        //    56: aload_1         /* $this$reduce$iv */
        //    57: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM30:()F
        //    60: aload_1         /* $this$reduce$iv */
        //    61: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM31:()F
        //    64: aload_1         /* $this$reduce$iv */
        //    65: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM32:()F
        //    68: aload_1         /* $this$reduce$iv */
        //    69: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM33:()F
        //    72: fstore_2       
        //    73: fstore_3       
        //    74: fstore          4
        //    76: fstore          5
        //    78: fstore          6
        //    80: fstore          7
        //    82: fstore          8
        //    84: fstore          9
        //    86: fstore          10
        //    88: fstore          11
        //    90: fstore          12
        //    92: fstore          13
        //    94: fstore          14
        //    96: fstore          15
        //    98: fstore          16
        //   100: fstore          p0
        //   102: fload           p0
        //   104: fload           p1
        //   106: fload           p2
        //   108: fload           p3
        //   110: fload           p4
        //   112: fload           p5
        //   114: fload           p6
        //   116: fload           p7
        //   118: fload           p8
        //   120: fload           p9
        //   122: fload           p10
        //   124: fload           p11
        //   126: fload           p12
        //   128: fload           p13
        //   130: fload_3         /* p14 */
        //   131: fload_2         /* p15 */
        //   132: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.mutableMat4:(FFFFFFFFFFFFFFFF)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   135: areturn        
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$toMutable  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final MutableMat3 mutableMat3(final float m00, final float m01, final float m02, final float m10, final float m11, final float m12, final float m20, final float m21, final float m22) {
        return new MutableMat3.Implementation(m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }
    
    @NotNull
    public static final MutableMat4 mutableMat4(final float m00, final float m01, final float m02, final float m03, final float m10, final float m11, final float m12, final float m13, final float m20, final float m21, final float m22, final float m23, final float m30, final float m31, final float m32, final float m33) {
        return new MutableMat4.Implementation(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
    }
}
