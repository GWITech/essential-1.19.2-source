package gg.essential.model.util;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import gg.essential.lib.kotgl.matrix.matrices.mutables.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ.\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c" }, d2 = { "Lgg/essential/model/util/UMatrixStack;", "", "model", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "normal", "Lgg/essential/lib/kotgl/matrix/matrices/Mat3;", "(Ldev/folomeev/kotgl/matrix/matrices/Mat4;Ldev/folomeev/kotgl/matrix/matrices/Mat3;)V", "stack", "", "Lgg/essential/model/util/UMatrixStack$Entry;", "(Ljava/util/List;)V", "fork", "peek", "pop", "", "push", "rotate", "angle", "", "x", "y", "z", "degrees", "", "scale", "value", "translate", "Entry", "cosmetics" })
public final class UMatrixStack
{
    @NotNull
    private final List<Entry> stack;
    
    public UMatrixStack(@NotNull final List<Entry> stack) {
        Intrinsics.checkNotNullParameter((Object)stack, "stack");
        super();
        this.stack = stack;
    }
    
    public UMatrixStack(@NotNull final Mat4 model, @NotNull final Mat3 normal) {
        Intrinsics.checkNotNullParameter((Object)model, "model");
        Intrinsics.checkNotNullParameter((Object)normal, "normal");
        this(CollectionsKt.mutableListOf((Object[])new Entry[] { new Entry(MutableMatrices.toMutable(model), MutableMatrices.toMutable(normal)) }));
    }
    
    public UMatrixStack() {
        this(Matrices.identityMat4(), Matrices.identityMat3());
    }
    
    public final void translate(final float x, final float y, final float z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: fconst_0       
        //     2: fcmpg          
        //     3: ifne            10
        //     6: iconst_1       
        //     7: goto            11
        //    10: iconst_0       
        //    11: ifeq            43
        //    14: fload_2         /* y */
        //    15: fconst_0       
        //    16: fcmpg          
        //    17: ifne            24
        //    20: iconst_1       
        //    21: goto            25
        //    24: iconst_0       
        //    25: ifeq            43
        //    28: fload_3         /* z */
        //    29: fconst_0       
        //    30: fcmpg          
        //    31: ifne            38
        //    34: iconst_1       
        //    35: goto            39
        //    38: iconst_0       
        //    39: ifeq            43
        //    42: return         
        //    43: aload_0         /* this */
        //    44: getfield        gg/essential/model/util/UMatrixStack.stack:Ljava/util/List;
        //    47: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //    50: checkcast       Lgg/essential/model/util/UMatrixStack$Entry;
        //    53: astore          $this$translate_u24lambda_u2d1
        //    55: aload           $this$translate_u24lambda_u2d1
        //    57: invokevirtual   gg/essential/model/util/UMatrixStack$Entry.getModel:()Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //    60: invokestatic    gg/essential/lib/kotgl/matrix/matrices/Matrices.identityMat4:()Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //    63: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.toMutable:(Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //    66: astore          5
        //    68: aload           5
        //    70: astore          6
        //    72: astore          7
        //    74: aload           $this$translate_u24lambda_u2d1_u24lambda_u2d0
        //    76: fload_1         /* x */
        //    77: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM03:(F)V
        //    80: aload           $this$translate_u24lambda_u2d1_u24lambda_u2d0
        //    82: fload_2         /* y */
        //    83: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM13:(F)V
        //    86: aload           $this$translate_u24lambda_u2d1_u24lambda_u2d0
        //    88: fload_3         /* z */
        //    89: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM23:(F)V
        //    92: aload           7
        //    94: aload           5
        //    96: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //    99: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.timesSelf:(Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   102: pop            
        //   103: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  x     
        //  y     
        //  z     
        //    StackMapTable: 00 07 0A 40 01 0C 40 01 0C 40 01 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void scale$133aeb() {
        this.scale(0.9375f, 0.9375f, 0.9375f);
    }
    
    public final void scale(final float x, final float y, final float z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: fconst_1       
        //     2: fcmpg          
        //     3: ifne            10
        //     6: iconst_1       
        //     7: goto            11
        //    10: iconst_0       
        //    11: ifeq            43
        //    14: fload_2         /* y */
        //    15: fconst_1       
        //    16: fcmpg          
        //    17: ifne            24
        //    20: iconst_1       
        //    21: goto            25
        //    24: iconst_0       
        //    25: ifeq            43
        //    28: fload_3         /* z */
        //    29: fconst_1       
        //    30: fcmpg          
        //    31: ifne            38
        //    34: iconst_1       
        //    35: goto            39
        //    38: iconst_0       
        //    39: ifeq            43
        //    42: return         
        //    43: aload_0         /* this */
        //    44: getfield        gg/essential/model/util/UMatrixStack.stack:Ljava/util/List;
        //    47: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //    50: checkcast       Lgg/essential/model/util/UMatrixStack$Entry;
        //    53: astore          $this$scale_u24lambda_u2d4
        //    55: aload           $this$scale_u24lambda_u2d4
        //    57: invokevirtual   gg/essential/model/util/UMatrixStack$Entry.getModel:()Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //    60: invokestatic    gg/essential/lib/kotgl/matrix/matrices/Matrices.identityMat4:()Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //    63: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.toMutable:(Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //    66: astore          5
        //    68: aload           5
        //    70: astore          6
        //    72: astore          7
        //    74: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d2
        //    76: fload_1         /* x */
        //    77: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM00:(F)V
        //    80: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d2
        //    82: fload_2         /* y */
        //    83: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM11:(F)V
        //    86: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d2
        //    88: fload_3         /* z */
        //    89: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM22:(F)V
        //    92: aload           7
        //    94: aload           5
        //    96: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //    99: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.timesSelf:(Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   102: pop            
        //   103: fload_1         /* x */
        //   104: fload_2         /* y */
        //   105: fcmpg          
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: ifeq            149
        //   117: fload_2         /* y */
        //   118: fload_3         /* z */
        //   119: fcmpg          
        //   120: ifne            127
        //   123: iconst_1       
        //   124: goto            128
        //   127: iconst_0       
        //   128: ifeq            149
        //   131: fload_1         /* x */
        //   132: fconst_0       
        //   133: fcmpg          
        //   134: ifge            237
        //   137: aload           $this$scale_u24lambda_u2d4
        //   139: invokevirtual   gg/essential/model/util/UMatrixStack$Entry.getNormal:()Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   142: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.timesSelf$467c3b85:(Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   145: pop            
        //   146: goto            237
        //   149: fconst_1       
        //   150: fload_1         /* x */
        //   151: fdiv           
        //   152: fstore          ix
        //   154: fconst_1       
        //   155: fload_2         /* y */
        //   156: fdiv           
        //   157: fstore          iy
        //   159: fconst_1       
        //   160: fload_3         /* z */
        //   161: fdiv           
        //   162: fstore          iz
        //   164: fload           ix
        //   166: fload           iy
        //   168: fmul           
        //   169: fload           iz
        //   171: fmul           
        //   172: invokestatic    gg/essential/model/util/PlatformMathKt.cbrt:(F)F
        //   175: fstore          rt
        //   177: aload           $this$scale_u24lambda_u2d4
        //   179: invokevirtual   gg/essential/model/util/UMatrixStack$Entry.getNormal:()Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   182: invokestatic    gg/essential/lib/kotgl/matrix/matrices/Matrices.identityMat3:()Lgg/essential/lib/kotgl/matrix/matrices/Mat3;
        //   185: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.toMutable:(Lgg/essential/lib/kotgl/matrix/matrices/Mat3;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   188: astore          10
        //   190: aload           10
        //   192: astore          11
        //   194: astore          7
        //   196: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d3
        //   198: fload           rt
        //   200: fload           ix
        //   202: fmul           
        //   203: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3.setM00:(F)V
        //   206: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d3
        //   208: fload           rt
        //   210: fload           iy
        //   212: fmul           
        //   213: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3.setM11:(F)V
        //   216: aload           $this$scale_u24lambda_u2d4_u24lambda_u2d3
        //   218: fload           rt
        //   220: fload           iz
        //   222: fmul           
        //   223: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3.setM22:(F)V
        //   226: aload           7
        //   228: aload           10
        //   230: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat3;
        //   233: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.timesSelf:(Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;Lgg/essential/lib/kotgl/matrix/matrices/Mat3;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;
        //   236: pop            
        //   237: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  x     
        //  y     
        //  z     
        //    StackMapTable: 00 0D 0A 40 01 0C 40 01 0C 40 01 03 FF 00 45 00 05 00 02 02 02 07 00 2B 00 00 40 01 0C 40 01 14 FF 00 57 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void rotate(final float angle, final float x, final float y, final float z, final boolean degrees) {
        if (angle == 0.0f) {
            return;
        }
        final Entry $this$rotate_u24lambda_u2d5 = (Entry)CollectionsKt.last((List)this.stack);
        final float angleRadians = degrees ? ((float)(angle / 180.0f * 3.141592653589793)) : angle;
        final float c = (float)Math.cos(angleRadians);
        final float s = (float)Math.sin(angleRadians);
        final float oneMinusC = 1.0f - c;
        final float xx = x * x;
        final float xy = x * y;
        final float xz = x * z;
        final float yy = y * y;
        final float yz = y * z;
        final float zz = z * z;
        final float xs = x * s;
        final float ys = y * s;
        final float zs = z * s;
        final Mat3 rotation = Matrices.mat3(xx * oneMinusC + c, xy * oneMinusC - zs, xz * oneMinusC + ys, xy * oneMinusC + zs, yy * oneMinusC + c, yz * oneMinusC - xs, xz * oneMinusC - ys, yz * oneMinusC + xs, zz * oneMinusC + c);
        MutableMatrices.timesSelf($this$rotate_u24lambda_u2d5.getModel(), KotglKt.toMat4(rotation));
        MutableMatrices.timesSelf($this$rotate_u24lambda_u2d5.getNormal(), rotation);
    }
    
    @NotNull
    public final UMatrixStack fork() {
        return new UMatrixStack(CollectionsKt.mutableListOf((Object[])new Entry[] { ((Entry)CollectionsKt.last((List)this.stack)).deepCopy() }));
    }
    
    public final void push() {
        this.stack.add(((Entry)CollectionsKt.last((List)this.stack)).deepCopy());
    }
    
    public final void pop() {
        CollectionsKt.removeLast((List)this.stack);
    }
    
    @NotNull
    public final Entry peek() {
        return (Entry)CollectionsKt.last((List)this.stack);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u000e\u001a\u00020\u0000J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016" }, d2 = { "Lgg/essential/model/util/UMatrixStack$Entry;", "", "model", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "normal", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "(Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;)V", "getModel", "()Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;", "getNormal", "()Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;", "component1", "component2", "copy", "deepCopy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
    public static final class Entry
    {
        @NotNull
        private final MutableMat4 model;
        @NotNull
        private final MutableMat3 normal;
        
        public Entry(@NotNull final MutableMat4 model, @NotNull final MutableMat3 normal) {
            Intrinsics.checkNotNullParameter((Object)model, "model");
            Intrinsics.checkNotNullParameter((Object)normal, "normal");
            super();
            this.model = model;
            this.normal = normal;
        }
        
        @NotNull
        public final MutableMat4 getModel() {
            return this.model;
        }
        
        @NotNull
        public final MutableMat3 getNormal() {
            return this.normal;
        }
        
        @NotNull
        public final Entry deepCopy() {
            return new Entry(this.model.copyOf(), this.normal.copyOf());
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Entry(model=" + this.model + ", normal=" + this.normal + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.model.hashCode();
            result = result * 31 + this.normal.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)other;
            return Intrinsics.areEqual((Object)this.model, (Object)entry.model) && Intrinsics.areEqual((Object)this.normal, (Object)entry.normal);
        }
    }
}
