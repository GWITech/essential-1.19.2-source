package gg.essential.universal.vertex;

import kotlin.*;
import net.minecraft.client.render.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010	\u001a\u00020\u00072\u0006\u0010
                                                   \u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J(\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001a""" }, d2 = { "Lgg/essential/universal/vertex/VanillaVertexConsumer;", "Lgg/essential/universal/vertex/UVertexConsumer;", "inner", "Lnet/minecraft/client/render/VertexConsumer;", "(Lnet/minecraft/client/render/VertexConsumer;)V", "color", "red", "", "green", "blue", "alpha", "endVertex", "light", "u", "v", "norm", "stack", "Lgg/essential/universal/UMatrixStack;", "x", "", "y", "z", "overlay", "pos", "", "tex", "universalcraft" })
public final class VanillaVertexConsumer implements UVertexConsumer
{
    @NotNull
    private final VertexConsumer inner;
    
    public VanillaVertexConsumer(@NotNull final VertexConsumer inner) {
        Intrinsics.checkNotNullParameter((Object)inner, "inner");
        super();
        this.inner = inner;
    }
    
    @NotNull
    @Override
    public UVertexConsumer pos(@NotNull final UMatrixStack stack, final double x, final double y, final double z) {
        Intrinsics.checkNotNullParameter((Object)stack, "stack");
        final VanillaVertexConsumer $this$pos_u24lambda_u2d0 = this;
        final int n = 0;
        if (stack == UMatrixStack.UNIT) {
            $this$pos_u24lambda_u2d0.inner.vertex(x, y, z);
        }
        else {
            $this$pos_u24lambda_u2d0.inner.vertex(stack.peek().getModel(), (float)x, (float)y, (float)z);
        }
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer color(final int red, final int green, final int blue, final int alpha) {
        final VanillaVertexConsumer $this$color_u24lambda_u2d1 = this;
        final int n = 0;
        $this$color_u24lambda_u2d1.inner.color(red, green, blue, alpha);
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer tex(final double u, final double v) {
        final VanillaVertexConsumer $this$tex_u24lambda_u2d2 = this;
        final int n = 0;
        $this$tex_u24lambda_u2d2.inner.texture((float)u, (float)v);
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer overlay(final int u, final int v) {
        final VanillaVertexConsumer $this$overlay_u24lambda_u2d3 = this;
        final int n = 0;
        $this$overlay_u24lambda_u2d3.inner.overlay(u, v);
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer light(final int u, final int v) {
        final VanillaVertexConsumer $this$light_u24lambda_u2d4 = this;
        final int n = 0;
        $this$light_u24lambda_u2d4.inner.light(u, v);
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer norm(@NotNull final UMatrixStack stack, final float x, final float y, final float z) {
        Intrinsics.checkNotNullParameter((Object)stack, "stack");
        final VanillaVertexConsumer $this$norm_u24lambda_u2d5 = this;
        final int n = 0;
        if (stack == UMatrixStack.UNIT) {
            $this$norm_u24lambda_u2d5.inner.normal(x, y, z);
        }
        else {
            $this$norm_u24lambda_u2d5.inner.normal(stack.peek().getNormal(), x, y, z);
        }
        return this;
    }
    
    @NotNull
    @Override
    public UVertexConsumer endVertex() {
        final VanillaVertexConsumer $this$endVertex_u24lambda_u2d6 = this;
        final int n = 0;
        $this$endVertex_u24lambda_u2d6.inner.next();
        return this;
    }
}
