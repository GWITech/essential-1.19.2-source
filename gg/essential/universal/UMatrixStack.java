package gg.essential.universal;

import kotlin.*;
import net.minecraft.client.util.math.*;
import net.minecraft.util.math.*;
import kotlin.jvm.*;
import com.mojang.blaze3d.systems.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import java.nio.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0015\b\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020
                                                   J\u0006\u0010\u0015\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\rJ2\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u0010H\u0007J\u001f\u0010\u001f\u001a\u0002H "\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0"¢\u0006\u0002\u0010#J\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020$J\u001f\u0010%\u001a\u0002H "\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0"¢\u0006\u0002\u0010#J\u000e\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020$J\u001e\u0010&\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020'J\u001e\u0010&\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\u0004J\u001e\u0010)\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020'J\u001e\u0010)\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ"\u0010*\u001a\u0002H "\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0"H\u0082\b¢\u0006\u0002\u0010#R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006.""" }, d2 = { "Lgg/essential/universal/UMatrixStack;", "", "()V", "mc", "Lnet/minecraft/client/util/math/MatrixStack;", "(Lnet/minecraft/client/util/math/MatrixStack;)V", "Lnet/minecraft/client/util/math/MatrixStack$Entry;", "(Lnet/minecraft/client/util/math/MatrixStack$Entry;)V", "stack", "Ljava/util/Deque;", "Lgg/essential/universal/UMatrixStack$Entry;", "(Ljava/util/Deque;)V", "applyToGlobalState", "", "fork", "isEmpty", "", "multiply", "quaternion", "Lnet/minecraft/util/math/Quaternion;", "peek", "pop", "push", "replaceGlobalState", "rotate", "angle", "", "x", "y", "z", "degrees", "runReplacingGlobalState", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "runWithGlobalState", "scale", "", "toMC", "translate", "withGlobalStackPushed", "Companion", "Compat", "Entry", "universalcraft" })
public final class UMatrixStack
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Deque<Entry> stack;
    @JvmField
    @NotNull
    public static final UMatrixStack UNIT;
    
    private UMatrixStack(final Deque<Entry> stack) {
        super();
        this.stack = stack;
    }
    
    public UMatrixStack() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             Ljava/util/ArrayDeque;
        //     4: dup            
        //     5: invokespecial   java/util/ArrayDeque.<init>:()V
        //     8: astore_1       
        //     9: aload_1        
        //    10: astore_2       
        //    11: astore          10
        //    13: iconst_0       
        //    14: istore_3        /* $i$a$-apply-UMatrixStack$1 */
        //    15: aload_2         /* $this$_init__u24lambda_u2d2 */
        //    16: new             Lnet/minecraft/util/math/Matrix4f;
        //    19: dup            
        //    20: invokespecial   net/minecraft/util/math/Matrix4f.<init>:()V
        //    23: astore          4
        //    25: aload           4
        //    27: astore          5
        //    29: astore          6
        //    31: iconst_0       
        //    32: istore          $i$a$-apply-UMatrixStack$1$1
        //    34: aload           $this$_init__u24lambda_u2d2_u24lambda_u2d0
        //    36: invokevirtual   net/minecraft/util/math/Matrix4f.loadIdentity:()V
        //    39: aload           6
        //    41: aload           4
        //    43: new             Lnet/minecraft/util/math/Matrix3f;
        //    46: dup            
        //    47: invokespecial   net/minecraft/util/math/Matrix3f.<init>:()V
        //    50: astore          4
        //    52: aload           4
        //    54: astore          5
        //    56: astore          8
        //    58: astore          6
        //    60: iconst_0       
        //    61: istore          $i$a$-apply-UMatrixStack$1$2
        //    63: aload           $this$_init__u24lambda_u2d2_u24lambda_u2d1
        //    65: invokevirtual   net/minecraft/util/math/Matrix3f.loadIdentity:()V
        //    68: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //    71: astore          9
        //    73: aload           6
        //    75: aload           8
        //    77: aload           4
        //    79: astore          11
        //    81: astore          12
        //    83: new             Lgg/essential/universal/UMatrixStack$Entry;
        //    86: dup            
        //    87: aload           12
        //    89: aload           11
        //    91: invokespecial   gg/essential/universal/UMatrixStack$Entry.<init>:(Lnet/minecraft/util/math/Matrix4f;Lnet/minecraft/util/math/Matrix3f;)V
        //    94: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //    97: pop            
        //    98: nop            
        //    99: aload           10
        //   101: aload_1        
        //   102: checkcast       Ljava/util/Deque;
        //   105: invokespecial   gg/essential/universal/UMatrixStack.<init>:(Ljava/util/Deque;)V
        //   108: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public UMatrixStack(@NotNull final MatrixStack mc) {
        Intrinsics.checkNotNullParameter((Object)mc, "mc");
        final MatrixStack$Entry peek = mc.peek();
        Intrinsics.checkNotNullExpressionValue((Object)peek, "mc.peek()");
        this(peek);
    }
    
    public UMatrixStack(@NotNull final MatrixStack$Entry mc) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "mc"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: new             Ljava/util/ArrayDeque;
        //    10: dup            
        //    11: invokespecial   java/util/ArrayDeque.<init>:()V
        //    14: astore_2       
        //    15: aload_2        
        //    16: astore_3       
        //    17: astore          6
        //    19: iconst_0       
        //    20: istore          $i$a$-apply-UMatrixStack$2
        //    22: aload_3         /* $this$_init__u24lambda_u2d3 */
        //    23: new             Lgg/essential/universal/UMatrixStack$Entry;
        //    26: dup            
        //    27: aload_1         /* mc */
        //    28: invokevirtual   net/minecraft/client/util/math/MatrixStack$Entry.getPositionMatrix:()Lnet/minecraft/util/math/Matrix4f;
        //    31: astore          5
        //    33: aload           5
        //    35: ldc             "mc.positionMatrix"
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: aload           5
        //    42: aload_1         /* mc */
        //    43: invokevirtual   net/minecraft/client/util/math/MatrixStack$Entry.getNormalMatrix:()Lnet/minecraft/util/math/Matrix3f;
        //    46: astore          5
        //    48: aload           5
        //    50: ldc             "mc.normalMatrix"
        //    52: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: aload           5
        //    57: invokespecial   gg/essential/universal/UMatrixStack$Entry.<init>:(Lnet/minecraft/util/math/Matrix4f;Lnet/minecraft/util/math/Matrix3f;)V
        //    60: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //    63: pop            
        //    64: nop            
        //    65: aload           6
        //    67: aload_2        
        //    68: checkcast       Ljava/util/Deque;
        //    71: invokespecial   gg/essential/universal/UMatrixStack.<init>:(Ljava/util/Deque;)V
        //    74: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  mc    
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final MatrixStack toMC() {
        return this.peek().toMCStack();
    }
    
    public final void translate(final double x, final double y, final double z) {
        this.translate((float)x, (float)y, (float)z);
    }
    
    public final void translate(final float x, final float y, final float z) {
        if (x == 0.0f && y == 0.0f && z == 0.0f) {
            return;
        }
        final Entry $this$translate_u24lambda_u2d4 = this.stack.getLast();
        final int n = 0;
        $this$translate_u24lambda_u2d4.getModel().multiply(Matrix4f.translate(x, y, z));
    }
    
    public final void scale(final double x, final double y, final double z) {
        this.scale((float)x, (float)y, (float)z);
    }
    
    public final void scale(final float x, final float y, final float z) {
        if (x == 1.0f && y == 1.0f && z == 1.0f) {
            return;
        }
        final Entry $this$scale_u24lambda_u2d5 = this.stack.getLast();
        final int n = 0;
        $this$scale_u24lambda_u2d5.getModel().multiply(Matrix4f.scale(x, y, z));
        if (x == y && y == z) {
            if (x < 0.0f) {
                $this$scale_u24lambda_u2d5.getNormal().multiply(-1.0f);
            }
        }
        else {
            final float ix = 1.0f / x;
            final float iy = 1.0f / y;
            final float iz = 1.0f / z;
            final float rt = MathHelper.fastInverseCbrt(ix * iy * iz);
            $this$scale_u24lambda_u2d5.getNormal().multiply(Matrix3f.scale(rt * ix, rt * iy, rt * iz));
        }
    }
    
    @JvmOverloads
    public final void rotate(final float angle, final float x, final float y, final float z, final boolean degrees) {
        if (angle == 0.0f) {
            return;
        }
        final Entry $this$rotate_u24lambda_u2d6 = this.stack.getLast();
        final int n = 0;
        this.multiply(new Quaternion(new Vec3f(x, y, z), angle, degrees));
    }
    
    public static /* synthetic */ void rotate$default(final UMatrixStack uMatrixStack, final float angle, final float x, final float y, final float z, boolean degrees, final int n, final Object o) {
        if ((n & 0x10) != 0x0) {
            degrees = true;
        }
        uMatrixStack.rotate(angle, x, y, z, degrees);
    }
    
    public final void multiply(@NotNull final Quaternion quaternion) {
        Intrinsics.checkNotNullParameter((Object)quaternion, "quaternion");
        final Entry $this$multiply_u24lambda_u2d7 = this.stack.getLast();
        final int n = 0;
        $this$multiply_u24lambda_u2d7.getModel().multiply(quaternion);
        $this$multiply_u24lambda_u2d7.getNormal().multiply(quaternion);
    }
    
    @NotNull
    public final UMatrixStack fork() {
        final ArrayDeque $this$fork_u24lambda_u2d8 = new ArrayDeque();
        final int n = 0;
        $this$fork_u24lambda_u2d8.add(this.stack.getLast().deepCopy());
        return new UMatrixStack($this$fork_u24lambda_u2d8);
    }
    
    public final void push() {
        this.stack.addLast(this.stack.getLast().deepCopy());
    }
    
    public final void pop() {
        this.stack.removeLast();
    }
    
    @NotNull
    public final Entry peek() {
        final Entry last = this.stack.getLast();
        Intrinsics.checkNotNullExpressionValue((Object)last, "stack.last");
        return last;
    }
    
    public final boolean isEmpty() {
        return this.stack.size() == 1;
    }
    
    public final void applyToGlobalState() {
        RenderSystem.getModelViewStack().multiplyPositionMatrix(this.stack.getLast().getModel());
        RenderSystem.applyModelViewMatrix();
    }
    
    public final void replaceGlobalState() {
        RenderSystem.getModelViewStack().loadIdentity();
        this.applyToGlobalState();
    }
    
    public final void runWithGlobalState(@NotNull final Runnable block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.runWithGlobalState((kotlin.jvm.functions.Function0<?>)new UMatrixStack$runWithGlobalState.UMatrixStack$runWithGlobalState$1(block));
    }
    
    public final <R> R runWithGlobalState(@NotNull final Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final UMatrixStack this_$iv = this;
        final int $i$f$withGlobalStackPushed = 0;
        final MatrixStack stack$iv = RenderSystem.getModelViewStack();
        stack$iv.push();
        final int n = 0;
        this.applyToGlobalState();
        final Object it$iv = block.invoke();
        final int n2 = 0;
        stack$iv.pop();
        RenderSystem.applyModelViewMatrix();
        return (R)it$iv;
    }
    
    public final void runReplacingGlobalState(@NotNull final Runnable block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.runReplacingGlobalState((kotlin.jvm.functions.Function0<?>)new UMatrixStack$runReplacingGlobalState.UMatrixStack$runReplacingGlobalState$1(block));
    }
    
    public final <R> R runReplacingGlobalState(@NotNull final Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final UMatrixStack this_$iv = this;
        final int $i$f$withGlobalStackPushed = 0;
        final MatrixStack stack$iv = RenderSystem.getModelViewStack();
        stack$iv.push();
        final int n = 0;
        this.replaceGlobalState();
        final Object it$iv = block.invoke();
        final int n2 = 0;
        stack$iv.pop();
        RenderSystem.applyModelViewMatrix();
        return (R)it$iv;
    }
    
    private final <R> R withGlobalStackPushed(final Function0<? extends R> block) {
        final int $i$f$withGlobalStackPushed = 0;
        final MatrixStack stack = RenderSystem.getModelViewStack();
        stack.push();
        final Object it = block.invoke();
        final int n = 0;
        stack.pop();
        RenderSystem.applyModelViewMatrix();
        return (R)it;
    }
    
    @JvmOverloads
    public final void rotate(final float angle, final float x, final float y, final float z) {
        rotate$default(this, angle, x, y, z, false, 16, null);
    }
    
    static {
        Companion = new Companion(null);
        UNIT = new UMatrixStack();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000:
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0014
                                                       \u0002\b	
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u0012\u001a\u00020\u0000J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J	\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010	\u001a\u00020
                                                       8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u001c""" }, d2 = { "Lgg/essential/universal/UMatrixStack$Entry;", "", "model", "Lnet/minecraft/util/math/Matrix4f;", "normal", "Lnet/minecraft/util/math/Matrix3f;", "(Lnet/minecraft/util/math/Matrix4f;Lnet/minecraft/util/math/Matrix3f;)V", "getModel", "()Lnet/minecraft/util/math/Matrix4f;", "modelAsArray", "", "getModelAsArray", "()[F", "getNormal", "()Lnet/minecraft/util/math/Matrix3f;", "component1", "component2", "copy", "deepCopy", "equals", "", "other", "hashCode", "", "toMCStack", "Lnet/minecraft/client/util/math/MatrixStack;", "toString", "", "universalcraft" })
    public static final class Entry
    {
        @NotNull
        private final Matrix4f model;
        @NotNull
        private final Matrix3f normal;
        
        public Entry(@NotNull final Matrix4f model, @NotNull final Matrix3f normal) {
            Intrinsics.checkNotNullParameter((Object)model, "model");
            Intrinsics.checkNotNullParameter((Object)normal, "normal");
            super();
            this.model = model;
            this.normal = normal;
        }
        
        @NotNull
        public final Matrix4f getModel() {
            return this.model;
        }
        
        @NotNull
        public final Matrix3f getNormal() {
            return this.normal;
        }
        
        @NotNull
        public final MatrixStack toMCStack() {
            final MatrixStack it;
            final MatrixStack matrixStack = it = new MatrixStack();
            final int n = 0;
            it.peek().getPositionMatrix().multiply(this.getModel());
            it.peek().getNormalMatrix().multiply(this.getNormal());
            return matrixStack;
        }
        
        @NotNull
        public final Entry deepCopy() {
            final Matrix4f copy = this.model.copy();
            Intrinsics.checkNotNullExpressionValue((Object)copy, "model.copy()");
            final Matrix4f model = copy;
            final Matrix3f copy2 = this.normal.copy();
            Intrinsics.checkNotNullExpressionValue((Object)copy2, "normal.copy()");
            return new Entry(model, copy2);
        }
        
        @NotNull
        public final float[] getModelAsArray() {
            final Matrix4f $this$_get_modelAsArray__u24lambda_u2d2 = this.model;
            final int n = 0;
            final float[] it = new float[16];
            final int n2 = 0;
            $this$_get_modelAsArray__u24lambda_u2d2.writeColumnMajor(FloatBuffer.wrap(it));
            return it;
        }
        
        @NotNull
        public final Matrix4f component1() {
            return this.model;
        }
        
        @NotNull
        public final Matrix3f component2() {
            return this.normal;
        }
        
        @NotNull
        public final Entry copy(@NotNull final Matrix4f model, @NotNull final Matrix3f normal) {
            Intrinsics.checkNotNullParameter((Object)model, "model");
            Intrinsics.checkNotNullParameter((Object)normal, "normal");
            return new Entry(model, normal);
        }
        
        public static /* synthetic */ Entry copy$default(final Entry entry, Matrix4f model, Matrix3f normal, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                model = entry.model;
            }
            if ((n & 0x2) != 0x0) {
                normal = entry.normal;
            }
            return entry.copy(model, normal);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Entry(model=" + this.model + ", normal=" + this.normal;
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000&
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010!
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007J'\u0010	\u001a\u0002H
                                                       "\u0004\b\u0000\u0010
                                                       2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H
                                                       0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u000f""" }, d2 = { "Lgg/essential/universal/UMatrixStack$Compat;", "", "()V", "DEPRECATED", "", "stack", "", "Lgg/essential/universal/UMatrixStack;", "get", "runLegacyMethod", "R", "matrixStack", "block", "Lkotlin/Function0;", "(Lgg/essential/universal/UMatrixStack;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "universalcraft" })
    public static final class Compat
    {
        @NotNull
        public static final Compat INSTANCE;
        @NotNull
        public static final String DEPRECATED = """
                                                For 1.17 this method requires you pass a UMatrixStack as the first argument.
                                                
                                                If you are currently extending this method, you should instead extend the method with the added argument.
                                                Note however for this to be non-breaking, your parent class needs to transition before you do.
                                                
                                                If you are calling this method and you cannot guarantee that your target class has been fully updated (such as when
                                                calling an open method on an open class), you should instead call the method with the "Compat" suffix, which will
                                                call both methods, the new and the deprecated one.
                                                If you are sure that your target class has been updated (such as when calling the super method), you should
                                                (for super calls you must!) instead just call the method with the original name and added argument.""";
        @NotNull
        private static final List<UMatrixStack> stack;
        
        private Compat() {
            super();
        }
        
        public final <R> R runLegacyMethod(@NotNull final UMatrixStack matrixStack, @NotNull final Function0<? extends R> block) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)block, "block");
            Compat.stack.add(matrixStack);
            final Object it = block.invoke();
            final int n = 0;
            Compat.stack.remove(CollectionsKt.getLastIndex((List)Compat.stack));
            return (R)it;
        }
        
        @NotNull
        public final UMatrixStack get() {
            UMatrixStack uMatrixStack;
            if ((uMatrixStack = (UMatrixStack)CollectionsKt.lastOrNull((List)Compat.stack)) == null) {
                uMatrixStack = new UMatrixStack();
            }
            return uMatrixStack;
        }
        
        static {
            INSTANCE = new Compat();
            stack = new ArrayList<UMatrixStack>();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0005""" }, d2 = { "Lgg/essential/universal/UMatrixStack$Companion;", "", "()V", "UNIT", "Lgg/essential/universal/UMatrixStack;", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
