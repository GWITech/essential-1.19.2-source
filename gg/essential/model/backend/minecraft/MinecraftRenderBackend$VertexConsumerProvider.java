package gg.essential.model.backend.minecraft;

import gg.essential.model.backend.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.model.util.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import gg.essential.lib.kotgl.matrix.vectors.mutables.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0012""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider;", "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "provider", "Lnet/minecraft/client/render/VertexConsumerProvider;", "light", "", "(Lnet/minecraft/client/render/VertexConsumerProvider;I)V", "getLight", "()I", "getProvider", "()Lnet/minecraft/client/render/VertexConsumerProvider;", "provide", "", "texture", "Lgg/essential/model/backend/RenderBackend$Texture;", "block", "Lkotlin/Function1;", "Lgg/essential/model/util/UVertexConsumer;", "essential" })
public static final class VertexConsumerProvider implements RenderBackend.VertexConsumerProvider
{
    @NotNull
    private final net.minecraft.client.render.VertexConsumerProvider provider;
    private final int light;
    
    public VertexConsumerProvider(@NotNull final net.minecraft.client.render.VertexConsumerProvider provider, final int light) {
        Intrinsics.checkNotNullParameter((Object)provider, "provider");
        super();
        this.provider = provider;
        this.light = light;
    }
    
    public final int getLight() {
        return this.light;
    }
    
    @Override
    public void provide(@NotNull final Texture texture, @NotNull final Function1<? super UVertexConsumer, Unit> block) {
        Intrinsics.checkNotNullParameter((Object)texture, "texture");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        if (!(texture instanceof MinecraftTexture)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final VertexConsumer buffer = this.provider.getBuffer(RenderLayer.getEntityTranslucentCull(((MinecraftTexture)texture).getIdentifier()));
        final gg.essential.universal.vertex.UVertexConsumer.Companion companion = gg.essential.universal.vertex.UVertexConsumer.Companion;
        Intrinsics.checkNotNullExpressionValue((Object)buffer, "buffer");
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000)
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0005
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0010\u0007
                                                           \u0002\b\u0004
                                                           \u0002\u0010\u0006
                                                           \u0002\b\u0006*\u0001\u0000\b
                                                           \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0000H\u0016¢\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                           \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                           \u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                           \u0000¨\u0006\u0016""" }, d2 = { "gg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider$provide$VertexConsumerAdapter", "Lgg/essential/model/util/UVertexConsumer;", "inner", "Lgg/essential/universal/vertex/UVertexConsumer;", "(Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider;Lgg/essential/universal/vertex/UVertexConsumer;)V", "endVertex", "()Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider$provide$VertexConsumerAdapter;", "norm", "stack", "Lgg/essential/model/util/UMatrixStack;", "x", "", "y", "z", "(Lgg/essential/model/util/UMatrixStack;FFF)Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider$provide$VertexConsumerAdapter;", "pos", "", "(Lgg/essential/model/util/UMatrixStack;DDD)Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider$provide$VertexConsumerAdapter;", "tex", "u", "v", "(DD)Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$VertexConsumerProvider$provide$VertexConsumerAdapter;", "essential" })
        public static final class VertexConsumerAdapter implements UVertexConsumer
        {
            @NotNull
            private final gg.essential.universal.vertex.UVertexConsumer inner;
            final /* synthetic */ MinecraftRenderBackend.VertexConsumerProvider this$0;
            
            public VertexConsumerAdapter(@NotNull final MinecraftRenderBackend.VertexConsumerProvider $receiver, @NotNull final gg.essential.universal.vertex.UVertexConsumer inner) {
                Intrinsics.checkNotNullParameter((Object)$receiver, "this$0");
                Intrinsics.checkNotNullParameter((Object)inner, "inner");
                this.this$0 = $receiver;
                super();
                this.inner = inner;
            }
            
            @NotNull
            public VertexConsumerAdapter pos(@NotNull final UMatrixStack stack, final double x, final double y, final double z) {
                Intrinsics.checkNotNullParameter((Object)stack, "stack");
                final VertexConsumerAdapter $this$pos_u24lambda_u2d0 = this;
                final MutableVec4 vec = MutableVectors.mutableVec4$44a6ae79((float)x, (float)y, (float)z);
                KotglKt.timesSelf(vec, stack.peek().getModel());
                $this$pos_u24lambda_u2d0.inner.pos(gg.essential.universal.UMatrixStack.UNIT, vec.getX(), vec.getY(), vec.getZ());
                $this$pos_u24lambda_u2d0.inner.color(1.0f, 1.0f, 1.0f, 1.0f);
                return this;
            }
            
            @NotNull
            public VertexConsumerAdapter tex(final double u, final double v) {
                final MinecraftRenderBackend.VertexConsumerProvider this$0 = this.this$0;
                final VertexConsumerAdapter $this$tex_u24lambda_u2d1 = this;
                $this$tex_u24lambda_u2d1.inner.tex(u, v);
                $this$tex_u24lambda_u2d1.inner.overlay(OverlayTexture.getU(0.0f), OverlayTexture.getV(false));
                $this$tex_u24lambda_u2d1.inner.light(this$0.getLight() & 0xFFFF, this$0.getLight() >> 16 & 0xFFFF);
                return this;
            }
            
            @NotNull
            public VertexConsumerAdapter norm(@NotNull final UMatrixStack stack, final float x, final float y, final float z) {
                Intrinsics.checkNotNullParameter((Object)stack, "stack");
                final VertexConsumerAdapter $this$norm_u24lambda_u2d2 = this;
                final MutableVec3 vec = MutableVectors.mutableVec3(x, y, z);
                KotglKt.timesSelf(vec, stack.peek().getNormal());
                $this$norm_u24lambda_u2d2.inner.norm(gg.essential.universal.UMatrixStack.UNIT, vec.getX(), vec.getY(), vec.getZ());
                return this;
            }
            
            @NotNull
            public VertexConsumerAdapter endVertex() {
                final VertexConsumerAdapter $this$endVertex_u24lambda_u2d3 = this;
                $this$endVertex_u24lambda_u2d3.inner.endVertex();
                return this;
            }
            
            @Override
            public /* bridge */ UVertexConsumer pos(final UMatrixStack stack, final double x, final double y, final double z) {
                return (UVertexConsumer)this.pos(stack, x, y, z);
            }
            
            @Override
            public /* bridge */ UVertexConsumer tex(final double u, final double v) {
                return (UVertexConsumer)this.tex(u, v);
            }
            
            @Override
            public /* bridge */ UVertexConsumer norm(final UMatrixStack stack, final float x, final float y, final float z) {
                return (UVertexConsumer)this.norm(stack, x, y, z);
            }
            
            @Override
            public /* bridge */ UVertexConsumer endVertex() {
                return (UVertexConsumer)this.endVertex();
            }
        }
        block.invoke((Object)new MinecraftRenderBackend$VertexConsumerProvider$provide.VertexConsumerAdapter(this, companion.of(buffer)));
    }
}
