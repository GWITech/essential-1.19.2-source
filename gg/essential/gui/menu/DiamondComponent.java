package gg.essential.gui.menu;

import kotlin.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/menu/DiamondComponent;", "Lgg/essential/elementa/UIComponent;", "()V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "essential" })
public final class DiamondComponent extends UIComponent
{
    public DiamondComponent() {
        super();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setHeight(new AspectConstraint(0.0f, 1, null));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        if (this.getWidth() > 0.0f) {
            final float xCenter = this.getLeft() + this.getWidth() / 2.0f;
            final float yCenter = this.getTop() + this.getHeight() / 2.0f;
            final int width = (int)this.getWidth();
            Diamond.drawDiamond(matrixStack, width, xCenter + 1.0f, yCenter + 1.0f, EssentialPalette.TEXT_SHADOW.getRGB());
            Diamond.drawDiamond(matrixStack, width, xCenter, yCenter, this.getColor().getRGB());
        }
        super.draw(matrixStack);
    }
}
