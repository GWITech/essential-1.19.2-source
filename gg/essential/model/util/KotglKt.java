package gg.essential.model.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kotgl.matrix.vectors.mutables.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kotgl.matrix.vectors.*;
import gg.essential.lib.kotgl.matrix.matrices.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001aC\u0010\u0003\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00060\bH\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u0003\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002\u001aI\u0010\u0003\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00060\fH\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u000e\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u0002*\u00020\u0005\u001a\n\u0010\u0014\u001a\u00020\u0002*\u00020\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015" }, d2 = { "getRotationEulerZYX", "Lgg/essential/lib/kotgl/matrix/vectors/Vec3;", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "times", "mat", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "T", "out", "Lkotlin/Function3;", "", "(Ldev/folomeev/kotgl/matrix/vectors/Vec3;Ldev/folomeev/kotgl/matrix/matrices/Mat3;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec4;", "Lkotlin/Function4;", "(Ldev/folomeev/kotgl/matrix/vectors/Vec4;Ldev/folomeev/kotgl/matrix/matrices/Mat4;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "timesSelf", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;", "toFloatArray", "", "toMat3", "toMat4", "cosmetics" })
public final class KotglKt
{
    @NotNull
    public static final Vec4 times(@NotNull final Vec4 $this$times, @NotNull final Mat4 mat) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* mat */
        //     7: ldc             "mat"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$times */
        //    13: astore_2        /* $this$times$iv */
        //    14: aload_2         /* $this$times$iv */
        //    15: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    18: aload_1         /* mat */
        //    19: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM00:()F
        //    22: fmul           
        //    23: aload_2         /* $this$times$iv */
        //    24: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //    27: aload_1         /* mat */
        //    28: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM01:()F
        //    31: fmul           
        //    32: fadd           
        //    33: aload_2         /* $this$times$iv */
        //    34: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //    37: aload_1         /* mat */
        //    38: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM02:()F
        //    41: fmul           
        //    42: fadd           
        //    43: aload_2         /* $this$times$iv */
        //    44: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //    47: aload_1         /* mat */
        //    48: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM03:()F
        //    51: fmul           
        //    52: fadd           
        //    53: aload_2         /* $this$times$iv */
        //    54: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    57: aload_1         /* mat */
        //    58: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM10:()F
        //    61: fmul           
        //    62: aload_2         /* $this$times$iv */
        //    63: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //    66: aload_1         /* mat */
        //    67: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM11:()F
        //    70: fmul           
        //    71: fadd           
        //    72: aload_2         /* $this$times$iv */
        //    73: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //    76: aload_1         /* mat */
        //    77: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM12:()F
        //    80: fmul           
        //    81: fadd           
        //    82: aload_2         /* $this$times$iv */
        //    83: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //    86: aload_1         /* mat */
        //    87: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM13:()F
        //    90: fmul           
        //    91: fadd           
        //    92: aload_2         /* $this$times$iv */
        //    93: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    96: aload_1         /* mat */
        //    97: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM20:()F
        //   100: fmul           
        //   101: aload_2         /* $this$times$iv */
        //   102: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //   105: aload_1         /* mat */
        //   106: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM21:()F
        //   109: fmul           
        //   110: fadd           
        //   111: aload_2         /* $this$times$iv */
        //   112: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //   115: aload_1         /* mat */
        //   116: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM22:()F
        //   119: fmul           
        //   120: fadd           
        //   121: aload_2         /* $this$times$iv */
        //   122: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //   125: aload_1         /* mat */
        //   126: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM23:()F
        //   129: fmul           
        //   130: fadd           
        //   131: aload_2         /* $this$times$iv */
        //   132: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //   135: aload_1         /* mat */
        //   136: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM30:()F
        //   139: fmul           
        //   140: aload_2         /* $this$times$iv */
        //   141: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //   144: aload_1         /* mat */
        //   145: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM31:()F
        //   148: fmul           
        //   149: fadd           
        //   150: aload_2         /* $this$times$iv */
        //   151: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //   154: aload_1         /* mat */
        //   155: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM32:()F
        //   158: fmul           
        //   159: fadd           
        //   160: aload_2         /* $this$times$iv */
        //   161: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //   164: aload_1         /* mat */
        //   165: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM33:()F
        //   168: fmul           
        //   169: fadd           
        //   170: fstore_3       
        //   171: fstore          4
        //   173: fstore          5
        //   175: fstore          p0
        //   177: fload           p0
        //   179: fload           p1
        //   181: fload           p2
        //   183: fload_3         /* p3 */
        //   184: invokestatic    gg/essential/lib/kotgl/matrix/vectors/Vectors.vec4:(FFFF)Lgg/essential/lib/kotgl/matrix/vectors/Vec4;
        //   187: areturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$times  
        //  mat          
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final MutableVec3 timesSelf(@NotNull final MutableVec3 $this$timesSelf, @NotNull final Mat3 mat) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* mat */
        //     7: ldc             "mat"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$timesSelf */
        //    13: checkcast       Lgg/essential/lib/kotgl/matrix/vectors/Vec3;
        //    16: astore_2        /* $this$times$iv */
        //    17: aload_2         /* $this$times$iv */
        //    18: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getX:()F
        //    21: aload_1         /* mat */
        //    22: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM00:()F
        //    25: fmul           
        //    26: aload_2         /* $this$times$iv */
        //    27: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getY:()F
        //    30: aload_1         /* mat */
        //    31: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM01:()F
        //    34: fmul           
        //    35: fadd           
        //    36: aload_2         /* $this$times$iv */
        //    37: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getZ:()F
        //    40: aload_1         /* mat */
        //    41: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM02:()F
        //    44: fmul           
        //    45: fadd           
        //    46: aload_2         /* $this$times$iv */
        //    47: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getX:()F
        //    50: aload_1         /* mat */
        //    51: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM10:()F
        //    54: fmul           
        //    55: aload_2         /* $this$times$iv */
        //    56: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getY:()F
        //    59: aload_1         /* mat */
        //    60: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM11:()F
        //    63: fmul           
        //    64: fadd           
        //    65: aload_2         /* $this$times$iv */
        //    66: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getZ:()F
        //    69: aload_1         /* mat */
        //    70: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM12:()F
        //    73: fmul           
        //    74: fadd           
        //    75: aload_2         /* $this$times$iv */
        //    76: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getX:()F
        //    79: aload_1         /* mat */
        //    80: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM20:()F
        //    83: fmul           
        //    84: aload_2         /* $this$times$iv */
        //    85: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getY:()F
        //    88: aload_1         /* mat */
        //    89: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM21:()F
        //    92: fmul           
        //    93: fadd           
        //    94: aload_2         /* $this$times$iv */
        //    95: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec3.getZ:()F
        //    98: aload_1         /* mat */
        //    99: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat3.getM22:()F
        //   102: fmul           
        //   103: fadd           
        //   104: fstore_3       
        //   105: fstore          4
        //   107: fstore          p0
        //   109: aload_0         /* $this$timesSelf */
        //   110: fload           p0
        //   112: fload           p1
        //   114: fload_3         /* p2 */
        //   115: invokestatic    gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors.set:(Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;FFF)Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;
        //   118: areturn        
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$timesSelf  
        //  mat              
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final MutableVec4 timesSelf(@NotNull final MutableVec4 $this$timesSelf, @NotNull final Mat4 mat) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* mat */
        //     7: ldc             "mat"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$timesSelf */
        //    13: checkcast       Lgg/essential/lib/kotgl/matrix/vectors/Vec4;
        //    16: astore_2        /* $this$times$iv */
        //    17: aload_2         /* $this$times$iv */
        //    18: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    21: aload_1         /* mat */
        //    22: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM00:()F
        //    25: fmul           
        //    26: aload_2         /* $this$times$iv */
        //    27: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //    30: aload_1         /* mat */
        //    31: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM01:()F
        //    34: fmul           
        //    35: fadd           
        //    36: aload_2         /* $this$times$iv */
        //    37: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //    40: aload_1         /* mat */
        //    41: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM02:()F
        //    44: fmul           
        //    45: fadd           
        //    46: aload_2         /* $this$times$iv */
        //    47: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //    50: aload_1         /* mat */
        //    51: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM03:()F
        //    54: fmul           
        //    55: fadd           
        //    56: aload_2         /* $this$times$iv */
        //    57: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    60: aload_1         /* mat */
        //    61: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM10:()F
        //    64: fmul           
        //    65: aload_2         /* $this$times$iv */
        //    66: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //    69: aload_1         /* mat */
        //    70: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM11:()F
        //    73: fmul           
        //    74: fadd           
        //    75: aload_2         /* $this$times$iv */
        //    76: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //    79: aload_1         /* mat */
        //    80: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM12:()F
        //    83: fmul           
        //    84: fadd           
        //    85: aload_2         /* $this$times$iv */
        //    86: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //    89: aload_1         /* mat */
        //    90: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM13:()F
        //    93: fmul           
        //    94: fadd           
        //    95: aload_2         /* $this$times$iv */
        //    96: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //    99: aload_1         /* mat */
        //   100: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM20:()F
        //   103: fmul           
        //   104: aload_2         /* $this$times$iv */
        //   105: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //   108: aload_1         /* mat */
        //   109: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM21:()F
        //   112: fmul           
        //   113: fadd           
        //   114: aload_2         /* $this$times$iv */
        //   115: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //   118: aload_1         /* mat */
        //   119: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM22:()F
        //   122: fmul           
        //   123: fadd           
        //   124: aload_2         /* $this$times$iv */
        //   125: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //   128: aload_1         /* mat */
        //   129: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM23:()F
        //   132: fmul           
        //   133: fadd           
        //   134: aload_2         /* $this$times$iv */
        //   135: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getX:()F
        //   138: aload_1         /* mat */
        //   139: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM30:()F
        //   142: fmul           
        //   143: aload_2         /* $this$times$iv */
        //   144: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getY:()F
        //   147: aload_1         /* mat */
        //   148: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM31:()F
        //   151: fmul           
        //   152: fadd           
        //   153: aload_2         /* $this$times$iv */
        //   154: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getZ:()F
        //   157: aload_1         /* mat */
        //   158: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM32:()F
        //   161: fmul           
        //   162: fadd           
        //   163: aload_2         /* $this$times$iv */
        //   164: invokevirtual   gg/essential/lib/kotgl/matrix/vectors/Vec4.getW:()F
        //   167: aload_1         /* mat */
        //   168: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/Mat4.getM33:()F
        //   171: fmul           
        //   172: fadd           
        //   173: fstore_3       
        //   174: fstore          4
        //   176: fstore          5
        //   178: fstore          p0
        //   180: aload_0         /* $this$timesSelf */
        //   181: fload           p0
        //   183: fload           p1
        //   185: fload           p2
        //   187: fload_3         /* p3 */
        //   188: invokestatic    gg/essential/lib/kotgl/matrix/vectors/mutables/MutableVectors.set:(Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;FFFF)Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec4;
        //   191: areturn        
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$timesSelf  
        //  mat              
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Vec3 getRotationEulerZYX(@NotNull final Mat4 $this$getRotationEulerZYX) {
        Intrinsics.checkNotNullParameter((Object)$this$getRotationEulerZYX, "<this>");
        return Vectors.vec3((float)Math.atan2($this$getRotationEulerZYX.getM21(), $this$getRotationEulerZYX.getM22()), (float)Math.asin(-$this$getRotationEulerZYX.getM20()), (float)Math.atan2($this$getRotationEulerZYX.getM10(), $this$getRotationEulerZYX.getM00()));
    }
    
    @NotNull
    public static final Mat4 toMat4(@NotNull final Mat3 $this$toMat4) {
        Intrinsics.checkNotNullParameter((Object)$this$toMat4, "<this>");
        return Matrices.mat4($this$toMat4.getM00(), $this$toMat4.getM01(), $this$toMat4.getM02(), 0.0f, $this$toMat4.getM10(), $this$toMat4.getM11(), $this$toMat4.getM12(), 0.0f, $this$toMat4.getM20(), $this$toMat4.getM21(), $this$toMat4.getM22(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }
}
