package gg.essential.model.backend.minecraft;

import gg.essential.model.backend.*;
import java.io.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.utils.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.model.util.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import gg.essential.lib.kotgl.matrix.vectors.mutables.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0012
                                                   \u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005
                                                   \u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0002\u0010	\u0082\u0002\u0004
                                                   \u0002\b\u0019¨\u0006\u000f""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend;", "Lgg/essential/model/backend/RenderBackend;", "()V", "readTexture", "Lgg/essential/model/backend/RenderBackend$Texture;", "name", "", "bytes", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CapeTexture", "CosmeticTexture", "MinecraftTexture", "SkinTexture", "VertexConsumerProvider", "essential" })
public final class MinecraftRenderBackend implements RenderBackend
{
    @NotNull
    public static final MinecraftRenderBackend INSTANCE;
    
    private MinecraftRenderBackend() {
        super();
    }
    
    @Nullable
    @Override
    public Object readTexture$23cb99da(@NotNull final String name, @NotNull final byte[] bytes) {
        final ReleasedDynamicTexture texture = UGraphics.getTexture(new ByteArrayInputStream(bytes));
        Intrinsics.checkNotNullExpressionValue((Object)texture, "getTexture(ByteArrayInputStream(bytes))");
        return new CosmeticTexture(name, texture);
    }
    
    static {
        INSTANCE = new MinecraftRenderBackend();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000.
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b	
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J	\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0016""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$SkinTexture;", "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "identifier", "Lnet/minecraft/util/Identifier;", "(Lnet/minecraft/util/Identifier;)V", "height", "", "getHeight", "()I", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "width", "getWidth", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "essential" })
    public static final class SkinTexture implements MinecraftTexture
    {
        @NotNull
        private final Identifier identifier;
        
        public SkinTexture(@NotNull final Identifier identifier) {
            Intrinsics.checkNotNullParameter((Object)identifier, "identifier");
            super();
            this.identifier = identifier;
        }
        
        @NotNull
        @Override
        public Identifier getIdentifier() {
            return this.identifier;
        }
        
        @Override
        public int getWidth() {
            return 64;
        }
        
        @Override
        public int getHeight() {
            return 64;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "SkinTexture(identifier=" + this.getIdentifier();
        }
        
        @Override
        public int hashCode() {
            return this.getIdentifier().hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof SkinTexture && Intrinsics.areEqual((Object)this.getIdentifier(), (Object)((SkinTexture)other).getIdentifier()));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00006
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u000e
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J	\u0010\u001e\u001a\u00020\bH\u00d6\u0001J	\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f
                                                       \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0016\u0010
                                                       ¨\u0006 """ }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture;", "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "name", "", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "(Ljava/lang/String;Lgg/essential/universal/utils/ReleasedDynamicTexture;)V", "height", "", "getHeight", "()I", "identifier", "Lnet/minecraft/util/Identifier;", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "identifier$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "getTexture", "()Lgg/essential/universal/utils/ReleasedDynamicTexture;", "width", "getWidth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "essential" })
    public static final class CosmeticTexture implements MinecraftTexture
    {
        @NotNull
        private final String name;
        @NotNull
        private final ReleasedDynamicTexture texture;
        private final int width;
        private final int height;
        @NotNull
        private final Lazy identifier$delegate;
        
        public CosmeticTexture(@NotNull final String name, @NotNull final ReleasedDynamicTexture texture) {
            Intrinsics.checkNotNullParameter((Object)name, "name");
            Intrinsics.checkNotNullParameter((Object)texture, "texture");
            super();
            this.name = name;
            this.texture = texture;
            this.width = this.texture.getWidth();
            this.height = this.texture.getHeight();
            this.identifier$delegate = LazyKt.lazy((Function0)new MinecraftRenderBackend$CosmeticTexture$identifier.MinecraftRenderBackend$CosmeticTexture$identifier$2(this));
        }
        
        @NotNull
        public final String getName() {
            return this.name;
        }
        
        @NotNull
        public final ReleasedDynamicTexture getTexture() {
            return this.texture;
        }
        
        @Override
        public int getWidth() {
            return this.width;
        }
        
        @Override
        public int getHeight() {
            return this.height;
        }
        
        @NotNull
        @Override
        public Identifier getIdentifier() {
            return (Identifier)this.identifier$delegate.getValue();
        }
        
        @NotNull
        @Override
        public String toString() {
            return "CosmeticTexture(name=" + this.name + ", texture=" + this.texture;
        }
        
        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = result * 31 + this.texture.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CosmeticTexture)) {
                return false;
            }
            final CosmeticTexture cosmeticTexture = (CosmeticTexture)other;
            return Intrinsics.areEqual((Object)this.name, (Object)cosmeticTexture.name) && Intrinsics.areEqual((Object)this.texture, (Object)cosmeticTexture.texture);
        }
    }
    
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
                final /* synthetic */ VertexConsumerProvider this$0;
                
                public VertexConsumerAdapter(@NotNull final VertexConsumerProvider $receiver, @NotNull final gg.essential.universal.vertex.UVertexConsumer inner) {
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
                    final VertexConsumerProvider this$0 = this.this$0;
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006
                                                       \u0004\b!0\u0001¨\u0006\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "Lgg/essential/model/backend/RenderBackend$Texture;", "identifier", "Lnet/minecraft/util/Identifier;", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "essential" })
    public interface MinecraftTexture extends Texture
    {
        @NotNull
        Identifier getIdentifier();
    }
}
