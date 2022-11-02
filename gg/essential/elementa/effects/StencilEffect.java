package gg.essential.elementa.effects;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.impl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n" }, d2 = { "Lgg/essential/elementa/effects/StencilEffect;", "Lgg/essential/elementa/effects/Effect;", "()V", "afterDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "beforeChildrenDraw", "beforeDraw", "Companion", "Elementa" })
public final class StencilEffect extends Effect
{
    @NotNull
    public static final Companion Companion;
    
    public StencilEffect() {
        super();
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        GL11.glEnable(2960);
        GL11.glStencilFunc(519, 2, -1);
        GL11.glStencilOp(7681, 7681, 7681);
    }
    
    @Override
    public void beforeChildrenDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        GL11.glStencilFunc(514, 2, -1);
        GL11.glStencilOp(7680, 7680, 7680);
    }
    
    @Override
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        GL11.glDisable(2960);
    }
    
    @JvmStatic
    public static final void enableStencil() {
        StencilEffect.Companion.enableStencil();
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/effects/StencilEffect$Companion;", "", "()V", "enableStencil", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        public final void enableStencil() {
            Platform.Companion.getPlatform$Elementa().enableStencil();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
