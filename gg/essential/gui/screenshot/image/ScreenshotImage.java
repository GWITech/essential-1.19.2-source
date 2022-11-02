package gg.essential.gui.screenshot.image;

import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;
import org.lwjgl.opengl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012
                                                   \b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u0019\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013""" }, d2 = { "Lgg/essential/gui/screenshot/image/ScreenshotImage;", "Lgg/essential/elementa/UIComponent;", "texture", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "(Lgg/essential/gui/screenshot/image/PixelBufferTexture;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;)V", "getTexture", "()Lgg/essential/elementa/state/State;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "renderImage", "color", "Ljava/awt/Color;", "width", "", "height", "essential" })
public class ScreenshotImage extends UIComponent
{
    @NotNull
    private final State<PixelBufferTexture> texture;
    
    public ScreenshotImage(@NotNull final State<PixelBufferTexture> texture) {
        Intrinsics.checkNotNullParameter((Object)texture, "texture");
        super();
        this.texture = texture;
    }
    
    @NotNull
    public final State<PixelBufferTexture> getTexture() {
        return this.texture;
    }
    
    public ScreenshotImage(@Nullable final PixelBufferTexture texture) {
        this(new BasicState<PixelBufferTexture>(texture));
    }
    
    public ScreenshotImage() {
        this((PixelBufferTexture)null);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        final PixelBufferTexture textureInstance = this.texture.get();
        if (textureInstance != null) {
            final double x = this.getLeft();
            final double y = this.getTop();
            final double width = this.getWidth();
            final double height = this.getHeight();
            final Color color = this.getColor();
            if (color.getAlpha() == 0) {
                super.draw(matrixStack);
                return;
            }
            matrixStack.push();
            matrixStack.translate(x, y, 0.0);
            this.renderImage(matrixStack, color, width, height);
            matrixStack.pop();
        }
        super.draw(matrixStack);
    }
    
    public final void renderImage(@NotNull final UMatrixStack matrixStack, @NotNull final Color color, final double width, final double height) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final PixelBufferTexture pixelBufferTexture = this.texture.get();
        if (pixelBufferTexture == null) {
            return;
        }
        final PixelBufferTexture textureInstance = pixelBufferTexture;
        UGraphics.enableBlend();
        UGraphics.enableAlpha();
        final int glId = textureInstance.method_4624();
        UGraphics.bindTexture(0, glId);
        final float red = color.getRed() / 255.0f;
        final float green = color.getGreen() / 255.0f;
        final float blue = color.getBlue() / 255.0f;
        final float alpha = color.getAlpha() / 255.0f;
        final UGraphics worldRenderer = UGraphics.getFromTessellator();
        UGraphics.configureTexture(glId, ScreenshotImage::renderImage$lambda-0);
        worldRenderer.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        worldRenderer.pos(matrixStack, 0.0, height, 0.0).tex(0.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, width, height, 0.0).tex(1.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, width, 0.0, 0.0).tex(1.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, 0.0, 0.0, 0.0).tex(0.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.drawDirect();
    }
    
    private static final void renderImage$lambda-0() {
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
    }
}
