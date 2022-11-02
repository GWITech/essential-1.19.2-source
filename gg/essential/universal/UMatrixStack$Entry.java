package gg.essential.universal;

import kotlin.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.util.math.*;
import java.nio.*;
import org.jetbrains.annotations.*;

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
