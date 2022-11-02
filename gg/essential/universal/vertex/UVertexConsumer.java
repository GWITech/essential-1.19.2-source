package gg.essential.universal.vertex;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.render.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020	2\u0006\u0010\u0006\u001a\u00020	2\u0006\u0010\u0007\u001a\u00020	2\u0006\u0010\b\u001a\u00020	H&J\b\u0010
                                                   \u001a\u00020\u0000H&J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020	2\u0006\u0010\r\u001a\u00020	H&J(\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020	2\u0006\u0010\r\u001a\u00020	H&J(\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0016H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0019\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/universal/vertex/UVertexConsumer;", "", "color", "Ljava/awt/Color;", "red", "", "green", "blue", "alpha", "", "endVertex", "light", "u", "v", "norm", "stack", "Lgg/essential/universal/UMatrixStack;", "x", "y", "z", "overlay", "pos", "", "tex", "Companion", "universalcraft" })
public interface UVertexConsumer
{
    @NotNull
    public static final Companion Companion = UVertexConsumer.Companion.$$INSTANCE;
    
    @NotNull
    UVertexConsumer pos(@NotNull final UMatrixStack p0, final double p1, final double p2, final double p3);
    
    @NotNull
    UVertexConsumer color(final int p0, final int p1, final int p2, final int p3);
    
    @NotNull
    default UVertexConsumer color(final float red, final float green, final float blue, final float alpha) {
        return this.color((int)(red * 255), (int)(green * 255), (int)(blue * 255), (int)(alpha * 255));
    }
    
    @NotNull
    default UVertexConsumer color(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        return this.color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    @NotNull
    UVertexConsumer tex(final double p0, final double p1);
    
    @NotNull
    UVertexConsumer overlay(final int p0, final int p1);
    
    @NotNull
    UVertexConsumer light(final int p0, final int p1);
    
    @NotNull
    UVertexConsumer norm(@NotNull final UMatrixStack p0, final float p1, final float p2, final float p3);
    
    @NotNull
    UVertexConsumer endVertex();
    
    @JvmStatic
    @NotNull
    default UVertexConsumer of(@NotNull final VertexConsumer wrapped) {
        return UVertexConsumer.Companion.of(wrapped);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/vertex/UVertexConsumer$Companion;", "", "()V", "of", "Lgg/essential/universal/vertex/UVertexConsumer;", "wrapped", "Lnet/minecraft/client/render/VertexConsumer;", "universalcraft" })
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final UVertexConsumer of(@NotNull final VertexConsumer wrapped) {
            Intrinsics.checkNotNullParameter((Object)wrapped, "wrapped");
            return new VanillaVertexConsumer(wrapped);
        }
        
        static {
            $$INSTANCE = new Companion();
        }
    }
}
