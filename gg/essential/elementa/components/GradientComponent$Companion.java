package gg.essential.elementa.components;

import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0012" }, d2 = { "Lgg/essential/elementa/components/GradientComponent$Companion;", "", "()V", "drawGradientBlock", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "x1", "", "y1", "x2", "y2", "startColor", "Ljava/awt/Color;", "endColor", "direction", "Lgg/essential/elementa/components/GradientComponent$GradientDirection;", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Deprecated(message = "This method does not allow for gradients to be rendered at sub-pixel positions. Use the Double variant instead and do not cast to Int.", replaceWith = @ReplaceWith(expression = "drawGradientBlock(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), startColor, endColor, direction)", imports = {}))
    @java.lang.Deprecated
    public final void drawGradientBlock(final int x1, final int y1, final int x2, final int y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        this.drawGradientBlock(x1, y1, x2, (double)y2, startColor, endColor, direction);
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawGradientBlock(matrixStack, x1, y1, x2, y2, startColor, endColor, direction)", imports = {}))
    @java.lang.Deprecated
    public final void drawGradientBlock(final double x1, final double y1, final double x2, final double y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        this.drawGradientBlock(new UMatrixStack(), x1, y1, x2, y2, startColor, endColor, direction);
    }
    
    public final void drawGradientBlock(@NotNull final UMatrixStack matrixStack, final double x1, final double y1, final double x2, final double y2, @NotNull final Color startColor, @NotNull final Color endColor, @NotNull final GradientDirection direction) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)startColor, "startColor");
        Intrinsics.checkNotNullParameter((Object)endColor, "endColor");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        UGraphics.enableBlend();
        UGraphics.disableAlpha();
        UGraphics.tryBlendFuncSeparate(770, 771, 1, 0);
        UGraphics.shadeModel(7425);
        final GradientColors colours = direction.getGradientColors(startColor, endColor);
        final UGraphics tessellator = UGraphics.getFromTessellator();
        tessellator.beginWithDefaultShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_COLOR);
        tessellator.pos(matrixStack, x2, y1, 0.0).color(colours.getTopRight()).endVertex();
        tessellator.pos(matrixStack, x1, y1, 0.0).color(colours.getTopLeft()).endVertex();
        tessellator.pos(matrixStack, x1, y2, 0.0).color(colours.getBottomLeft()).endVertex();
        tessellator.pos(matrixStack, x2, y2, 0.0).color(colours.getBottomRight()).endVertex();
        tessellator.drawDirect();
        UGraphics.shadeModel(7424);
        UGraphics.disableBlend();
        UGraphics.enableAlpha();
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
