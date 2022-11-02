package gg.essential.lib.kotgl.matrix.matrices.mutables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 5, xi = 48, d1 = { "\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022.\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062.\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u0007\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a`\u0010\u0000\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2L\u0010\u0004\u001aH\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\f\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u0006\u001a`\u0010\u0000\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u00062L\u0010\u0004\u001aH\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\f\u001a\u0012\u0010\u0000\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e\u001a\u008a\u0001\u0010\u0000\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2v\u0010\u0004\u001ar\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000fj\b\u0012\u0004\u0012\u00020\r`\u0010\u001a\u0012\u0010\u0000\u001a\u00020\r*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0006\u001a\u008a\u0001\u0010\u0000\u001a\u00020\r*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062v\u0010\u0004\u001ar\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000fj\b\u0012\u0004\u0012\u00020\r`\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006\u001a\u0012\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\n\u001a\u0012\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\b\u001a\u00020\u0006\u001a\u0012\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e\u001a\u0012\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u0006\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u001a\u0010\u0012\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\t\u001a\u001a\u0010\u0012\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t\u001a\u001a\u0010\u0012\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\r\u001a\u001a\u0010\u0012\u001a\u00020\r*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r¨\u0006\u0014" }, d2 = { "times", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat2;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat2;", "b", "reducer", "Lkotlin/Function4;", "", "Lgg/essential/lib/kotgl/matrix/FloatMapping4;", "k", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "Lkotlin/Function9;", "Lgg/essential/lib/kotgl/matrix/FloatMapping9;", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "Lkotlin/Function16;", "Lgg/essential/lib/kotgl/matrix/FloatMapping16;", "timesSelf", "timesTo", "out", "kotgl-matrix" }, xs = "gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices")
final synthetic class MutableMatrices__TimesKt
{
    @NotNull
    public static final MutableMat3 times(@NotNull final Mat3 $this$times, @NotNull final Mat3 b, @NotNull final Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3> reducer) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        Intrinsics.checkNotNullParameter((Object)reducer, "reducer");
        return (MutableMat3)reducer.invoke((Object)($this$times.getM00() * b.getM00() + $this$times.getM01() * b.getM10() + $this$times.getM02() * b.getM20()), (Object)($this$times.getM00() * b.getM01() + $this$times.getM01() * b.getM11() + $this$times.getM02() * b.getM21()), (Object)($this$times.getM00() * b.getM02() + $this$times.getM01() * b.getM12() + $this$times.getM02() * b.getM22()), (Object)($this$times.getM10() * b.getM00() + $this$times.getM11() * b.getM10() + $this$times.getM12() * b.getM20()), (Object)($this$times.getM10() * b.getM01() + $this$times.getM11() * b.getM11() + $this$times.getM12() * b.getM21()), (Object)($this$times.getM10() * b.getM02() + $this$times.getM11() * b.getM12() + $this$times.getM12() * b.getM22()), (Object)($this$times.getM20() * b.getM00() + $this$times.getM21() * b.getM10() + $this$times.getM22() * b.getM20()), (Object)($this$times.getM20() * b.getM01() + $this$times.getM21() * b.getM11() + $this$times.getM22() * b.getM21()), (Object)($this$times.getM20() * b.getM02() + $this$times.getM21() * b.getM12() + $this$times.getM22() * b.getM22()));
    }
    
    @NotNull
    public static final MutableMat4 times(@NotNull final Mat4 $this$times, @NotNull final Mat4 b, @NotNull final Function16<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat4> reducer) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        Intrinsics.checkNotNullParameter((Object)reducer, "reducer");
        return (MutableMat4)reducer.invoke((Object)($this$times.getM00() * b.getM00() + $this$times.getM01() * b.getM10() + $this$times.getM02() * b.getM20() + $this$times.getM03() * b.getM30()), (Object)($this$times.getM00() * b.getM01() + $this$times.getM01() * b.getM11() + $this$times.getM02() * b.getM21() + $this$times.getM03() * b.getM31()), (Object)($this$times.getM00() * b.getM02() + $this$times.getM01() * b.getM12() + $this$times.getM02() * b.getM22() + $this$times.getM03() * b.getM32()), (Object)($this$times.getM00() * b.getM03() + $this$times.getM01() * b.getM13() + $this$times.getM02() * b.getM23() + $this$times.getM03() * b.getM33()), (Object)($this$times.getM10() * b.getM00() + $this$times.getM11() * b.getM10() + $this$times.getM12() * b.getM20() + $this$times.getM13() * b.getM30()), (Object)($this$times.getM10() * b.getM01() + $this$times.getM11() * b.getM11() + $this$times.getM12() * b.getM21() + $this$times.getM13() * b.getM31()), (Object)($this$times.getM10() * b.getM02() + $this$times.getM11() * b.getM12() + $this$times.getM12() * b.getM22() + $this$times.getM13() * b.getM32()), (Object)($this$times.getM10() * b.getM03() + $this$times.getM11() * b.getM13() + $this$times.getM12() * b.getM23() + $this$times.getM13() * b.getM33()), (Object)($this$times.getM20() * b.getM00() + $this$times.getM21() * b.getM10() + $this$times.getM22() * b.getM20() + $this$times.getM23() * b.getM30()), (Object)($this$times.getM20() * b.getM01() + $this$times.getM21() * b.getM11() + $this$times.getM22() * b.getM21() + $this$times.getM23() * b.getM31()), (Object)($this$times.getM20() * b.getM02() + $this$times.getM21() * b.getM12() + $this$times.getM22() * b.getM22() + $this$times.getM23() * b.getM32()), (Object)($this$times.getM20() * b.getM03() + $this$times.getM21() * b.getM13() + $this$times.getM22() * b.getM23() + $this$times.getM23() * b.getM33()), (Object)($this$times.getM30() * b.getM00() + $this$times.getM31() * b.getM10() + $this$times.getM32() * b.getM20() + $this$times.getM33() * b.getM30()), (Object)($this$times.getM30() * b.getM01() + $this$times.getM31() * b.getM11() + $this$times.getM32() * b.getM21() + $this$times.getM33() * b.getM31()), (Object)($this$times.getM30() * b.getM02() + $this$times.getM31() * b.getM12() + $this$times.getM32() * b.getM22() + $this$times.getM33() * b.getM32()), (Object)($this$times.getM30() * b.getM03() + $this$times.getM31() * b.getM13() + $this$times.getM32() * b.getM23() + $this$times.getM33() * b.getM33()));
    }
    
    @NotNull
    public static final MutableMat3 times(@NotNull final Mat3 $this$times, final float k, @NotNull final Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3> reducer) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* reducer */
        //     7: ldc             "reducer"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$times */
        //    13: astore_3        /* $this$mapReduce$iv */
        //    14: aload_2         /* reducer */
        //    15: aload_3         /* $this$mapReduce$iv */
        //    16: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM00:()F
        //    19: fstore          4
        //    21: astore          5
        //    23: fload_1         /* k */
        //    24: fload           p0
        //    26: fmul           
        //    27: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    30: aload           5
        //    32: swap           
        //    33: aload_3         /* $this$mapReduce$iv */
        //    34: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM01:()F
        //    37: fstore          4
        //    39: astore          6
        //    41: astore          5
        //    43: fload_1         /* k */
        //    44: fload           p0
        //    46: fmul           
        //    47: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    50: astore          7
        //    52: aload           5
        //    54: aload           6
        //    56: aload           7
        //    58: aload_3         /* $this$mapReduce$iv */
        //    59: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM02:()F
        //    62: fstore          4
        //    64: astore          7
        //    66: astore          6
        //    68: astore          5
        //    70: fload_1         /* k */
        //    71: fload           p0
        //    73: fmul           
        //    74: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    77: astore          8
        //    79: aload           5
        //    81: aload           6
        //    83: aload           7
        //    85: aload           8
        //    87: aload_3         /* $this$mapReduce$iv */
        //    88: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM10:()F
        //    91: fstore          4
        //    93: astore          8
        //    95: astore          7
        //    97: astore          6
        //    99: astore          5
        //   101: fload_1         /* k */
        //   102: fload           p0
        //   104: fmul           
        //   105: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   108: astore          9
        //   110: aload           5
        //   112: aload           6
        //   114: aload           7
        //   116: aload           8
        //   118: aload           9
        //   120: aload_3         /* $this$mapReduce$iv */
        //   121: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM11:()F
        //   124: fstore          4
        //   126: astore          9
        //   128: astore          8
        //   130: astore          7
        //   132: astore          6
        //   134: astore          5
        //   136: fload_1         /* k */
        //   137: fload           p0
        //   139: fmul           
        //   140: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   143: astore          10
        //   145: aload           5
        //   147: aload           6
        //   149: aload           7
        //   151: aload           8
        //   153: aload           9
        //   155: aload           10
        //   157: aload_3         /* $this$mapReduce$iv */
        //   158: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM12:()F
        //   161: fstore          4
        //   163: astore          10
        //   165: astore          9
        //   167: astore          8
        //   169: astore          7
        //   171: astore          6
        //   173: astore          5
        //   175: fload_1         /* k */
        //   176: fload           p0
        //   178: fmul           
        //   179: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   182: astore          11
        //   184: aload           5
        //   186: aload           6
        //   188: aload           7
        //   190: aload           8
        //   192: aload           9
        //   194: aload           10
        //   196: aload           11
        //   198: aload_3         /* $this$mapReduce$iv */
        //   199: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM20:()F
        //   202: fstore          4
        //   204: astore          11
        //   206: astore          10
        //   208: astore          9
        //   210: astore          8
        //   212: astore          7
        //   214: astore          6
        //   216: astore          5
        //   218: fload_1         /* k */
        //   219: fload           p0
        //   221: fmul           
        //   222: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   225: astore          12
        //   227: aload           5
        //   229: aload           6
        //   231: aload           7
        //   233: aload           8
        //   235: aload           9
        //   237: aload           10
        //   239: aload           11
        //   241: aload           12
        //   243: aload_3         /* $this$mapReduce$iv */
        //   244: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM21:()F
        //   247: fstore          4
        //   249: astore          12
        //   251: astore          11
        //   253: astore          10
        //   255: astore          9
        //   257: astore          8
        //   259: astore          7
        //   261: astore          6
        //   263: astore          5
        //   265: fload_1         /* k */
        //   266: fload           p0
        //   268: fmul           
        //   269: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   272: astore          13
        //   274: aload           5
        //   276: aload           6
        //   278: aload           7
        //   280: aload           8
        //   282: aload           9
        //   284: aload           10
        //   286: aload           11
        //   288: aload           12
        //   290: aload           13
        //   292: aload_3         /* $this$mapReduce$iv */
        //   293: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM22:()F
        //   296: fstore          4
        //   298: astore          13
        //   300: astore          12
        //   302: astore          11
        //   304: astore          10
        //   306: astore          9
        //   308: astore          8
        //   310: astore          7
        //   312: astore          6
        //   314: astore          5
        //   316: fload_1         /* k */
        //   317: fload           p0
        //   319: fmul           
        //   320: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   323: astore          14
        //   325: aload           5
        //   327: aload           6
        //   329: aload           7
        //   331: aload           8
        //   333: aload           9
        //   335: aload           10
        //   337: aload           11
        //   339: aload           12
        //   341: aload           13
        //   343: aload           14
        //   345: invokeinterface kotlin/jvm/functions/Function9.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   350: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   353: areturn        
        //    Signature:
        //  (Lgg/essential/lib/kotgl/matrix/matrices/Mat3;FLkotlin/jvm/functions/Function9<-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;-Ljava/lang/Float;+Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;>;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$times  
        //  k            
        //  reducer      
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final MutableMat4 times(@NotNull final Mat4 $this$times, @NotNull final Mat4 b) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        return MutableMatrices.times($this$times, b, (Function16<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat4>)MutableMatrices__TimesKt$times.MutableMatrices__TimesKt$times$6.INSTANCE);
    }
    
    @NotNull
    public static final MutableMat3 timesTo(@NotNull final Mat3 $this$timesTo, @NotNull final Mat3 b, @NotNull final MutableMat3 out) {
        Intrinsics.checkNotNullParameter((Object)$this$timesTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        Intrinsics.checkNotNullParameter((Object)out, "out");
        return MutableMatrices.times($this$timesTo, b, (Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3>)new MutableMatrices__TimesKt$timesTo.MutableMatrices__TimesKt$timesTo$2((Object)out));
    }
    
    @NotNull
    public static final MutableMat4 timesTo(@NotNull final Mat4 $this$timesTo, @NotNull final Mat4 b, @NotNull final MutableMat4 out) {
        Intrinsics.checkNotNullParameter((Object)$this$timesTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        Intrinsics.checkNotNullParameter((Object)out, "out");
        return MutableMatrices.times($this$timesTo, b, (Function16<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat4>)new MutableMatrices__TimesKt$timesTo.MutableMatrices__TimesKt$timesTo$3((Object)out));
    }
    
    @NotNull
    public static final MutableMat3 timesTo(@NotNull final Mat3 $this$timesTo, final float k, @NotNull final MutableMat3 out) {
        Intrinsics.checkNotNullParameter((Object)$this$timesTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)out, "out");
        return MutableMatrices.times($this$timesTo, k, (Function9<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? extends MutableMat3>)new MutableMatrices__TimesKt$timesTo.MutableMatrices__TimesKt$timesTo$5((Object)out));
    }
    
    @NotNull
    public static final MutableMat3 timesSelf(@NotNull final MutableMat3 $this$timesSelf, @NotNull final Mat3 b) {
        Intrinsics.checkNotNullParameter((Object)$this$timesSelf, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        return MutableMatrices.timesTo($this$timesSelf, b, $this$timesSelf);
    }
    
    @NotNull
    public static final MutableMat4 timesSelf(@NotNull final MutableMat4 $this$timesSelf, @NotNull final Mat4 b) {
        Intrinsics.checkNotNullParameter((Object)$this$timesSelf, "<this>");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        return MutableMatrices.timesTo($this$timesSelf, b, $this$timesSelf);
    }
    
    @NotNull
    public static final MutableMat3 timesSelf$467c3b85(@NotNull final MutableMat3 $this$timesSelf) {
        Intrinsics.checkNotNullParameter((Object)$this$timesSelf, "<this>");
        return MutableMatrices.timesTo($this$timesSelf, -1.0f, $this$timesSelf);
    }
}
