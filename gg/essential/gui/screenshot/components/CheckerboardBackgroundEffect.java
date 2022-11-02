package gg.essential.gui.screenshot.components;

import gg.essential.elementa.effects.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;
import java.awt.*;
import gg.essential.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020	H\u0002J0\u0010
                                                   \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/screenshot/components/CheckerboardBackgroundEffect;", "Lgg/essential/elementa/effects/Effect;", "()V", "beforeDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawCheckerBoard", "component", "Lgg/essential/elementa/UIComponent;", "drawVertex", "graphics", "Lgg/essential/universal/UGraphics;", "x", "", "y", "color", "Ljava/awt/Color;", "essential" })
public final class CheckerboardBackgroundEffect extends Effect
{
    public CheckerboardBackgroundEffect() {
        super();
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.drawCheckerBoard(matrixStack, this.getBoundComponent());
    }
    
    private final void drawCheckerBoard(final UMatrixStack matrixStack, final UIComponent component) {
        final double left = component.getLeft();
        final double top = component.getTop();
        final double right = component.getRight();
        final double bottom = component.getBottom();
        final UGraphics graphics = UGraphics.getFromTessellator();
        graphics.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        for (int x = 0; x < (int)(right - left); ++x) {
            for (int y = 0; y < (int)(bottom - top); ++y) {
                final Color color = ((x + y) % 2 == 0) ? Color.LIGHT_GRAY : EssentialPalette.TEXT_HIGHLIGHT;
                Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
                final UGraphics graphics2 = graphics;
                final double x2 = left + x;
                final double y2 = top + y;
                Intrinsics.checkNotNullExpressionValue((Object)color, "color");
                this.drawVertex(graphics2, matrixStack, x2, y2, color);
                this.drawVertex(graphics, matrixStack, left + x, top + y + 1.0, color);
                this.drawVertex(graphics, matrixStack, left + x + 1.0, top + y + 1.0, color);
                this.drawVertex(graphics, matrixStack, left + x + 1.0, top + y, color);
            }
        }
        graphics.drawDirect();
    }
    
    private final void drawVertex(final UGraphics graphics, final UMatrixStack matrixStack, final double x, final double y, final Color color) {
        graphics.pos(matrixStack, x, y, 0.0).color(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f).endVertex();
    }
}
