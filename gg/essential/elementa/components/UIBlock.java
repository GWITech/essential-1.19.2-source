package gg.essential.elementa.components;

import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import gg.essential.universal.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007B\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J5\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0015¨\u0006\u0017" }, d2 = { "Lgg/essential/elementa/components/UIBlock;", "Lgg/essential/elementa/UIComponent;", "color", "Ljava/awt/Color;", "(Ljava/awt/Color;)V", "colorState", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;)V", "colorConstraint", "Lgg/essential/elementa/constraints/ColorConstraint;", "(Lgg/essential/elementa/constraints/ColorConstraint;)V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawBlock", "x", "", "y", "x2", "y2", "drawBlock$Elementa", "Companion", "Elementa" })
public class UIBlock extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    
    public UIBlock(@NotNull final ColorConstraint colorConstraint) {
        Intrinsics.checkNotNullParameter((Object)colorConstraint, "colorConstraint");
        super();
        this.setColor(colorConstraint);
    }
    
    public UIBlock(ColorConstraint colorConstraint, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            colorConstraint = UtilitiesKt.toConstraint(white);
        }
        this(colorConstraint);
    }
    
    public UIBlock(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(UtilitiesKt.toConstraint(color));
    }
    
    public UIBlock(@NotNull final State<Color> colorState) {
        Intrinsics.checkNotNullParameter((Object)colorState, "colorState");
        this(ExtensionsKt.toConstraint(colorState));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        final double x = this.getLeft();
        final double y = this.getTop();
        final double x2 = this.getRight();
        final double y2 = this.getBottom();
        this.drawBlock$Elementa(matrixStack, x, y, x2, y2);
        super.draw(matrixStack);
    }
    
    public void drawBlock$Elementa(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double x2, final double y2) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final Color color = this.getColor();
        if (color.getAlpha() == 0) {
            return;
        }
        UIBlock.Companion.drawBlock(matrixStack, color, x, y, x2, y2);
    }
    
    public UIBlock() {
        this(null, 1, null);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007J6\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fJ0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J6\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0016" }, d2 = { "Lgg/essential/elementa/components/UIBlock$Companion;", "", "()V", "drawBlock", "", "worldRenderer", "Lgg/essential/universal/UGraphics;", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "color", "Ljava/awt/Color;", "x1", "", "y1", "x2", "y2", "drawBlockSized", "x", "y", "width", "height", "drawBlockWithActiveShader", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Deprecated(message = "Pass UMatrixStack as first argument, required for 1.17", replaceWith = @ReplaceWith(expression = "drawBlock(matrixStack, color, x1, y1, x2, y2)", imports = {}))
        @java.lang.Deprecated
        public final void drawBlock(@NotNull final Color color, final double x1, final double y1, final double x2, final double y2) {
            Intrinsics.checkNotNullParameter((Object)color, "color");
            this.drawBlock(new UMatrixStack(), color, x1, y1, x2, y2);
        }
        
        public final void drawBlock(@NotNull final UMatrixStack matrixStack, @NotNull final Color color, final double x1, final double y1, final double x2, final double y2) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            UGraphics.enableBlend();
            UGraphics.tryBlendFuncSeparate(770, 771, 1, 0);
            final UGraphics buffer = UGraphics.getFromTessellator();
            buffer.beginWithDefaultShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_COLOR);
            Intrinsics.checkNotNullExpressionValue((Object)buffer, "buffer");
            this.drawBlock(buffer, matrixStack, color, x1, y1, x2, y2);
            UGraphics.disableBlend();
        }
        
        public final void drawBlockWithActiveShader(@NotNull final UMatrixStack matrixStack, @NotNull final Color color, final double x1, final double y1, final double x2, final double y2) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            final UGraphics buffer = UGraphics.getFromTessellator();
            buffer.beginWithActiveShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_COLOR);
            Intrinsics.checkNotNullExpressionValue((Object)buffer, "buffer");
            this.drawBlock(buffer, matrixStack, color, x1, y1, x2, y2);
        }
        
        private final void drawBlock(final UGraphics worldRenderer, final UMatrixStack matrixStack, final Color color, final double x1, final double y1, final double x2, final double y2) {
            final float red = color.getRed() / 255.0f;
            final float green = color.getGreen() / 255.0f;
            final float blue = color.getBlue() / 255.0f;
            final float alpha = color.getAlpha() / 255.0f;
            worldRenderer.pos(matrixStack, x1, y2, 0.0).color(red, green, blue, alpha).endVertex();
            worldRenderer.pos(matrixStack, x2, y2, 0.0).color(red, green, blue, alpha).endVertex();
            worldRenderer.pos(matrixStack, x2, y1, 0.0).color(red, green, blue, alpha).endVertex();
            worldRenderer.pos(matrixStack, x1, y1, 0.0).color(red, green, blue, alpha).endVertex();
            if (ElementaVersion.Companion.getActive().compareTo((ElementaVersion)ElementaVersion.Companion.getV1$Elementa()) >= 0) {
                UGraphics.enableDepth();
                UGraphics.depthFunc(519);
                worldRenderer.drawDirect();
                UGraphics.disableDepth();
                UGraphics.depthFunc(515);
            }
            else {
                worldRenderer.drawDirect();
            }
        }
        
        @Deprecated(message = "Pass UMatrixStack as first argument, required for 1.17", replaceWith = @ReplaceWith(expression = "drawBlock(matrixStack, color, x1, y1, x2, y2)", imports = {}))
        @java.lang.Deprecated
        public final void drawBlockSized(@NotNull final Color color, final double x, final double y, final double width, final double height) {
            Intrinsics.checkNotNullParameter((Object)color, "color");
            this.drawBlockSized(new UMatrixStack(), color, x, y, width, height);
        }
        
        public final void drawBlockSized(@NotNull final UMatrixStack matrixStack, @NotNull final Color color, final double x, final double y, final double width, final double height) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            this.drawBlock(matrixStack, color, x, y, x + width, y + height);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
