package gg.essential.gui.common;

import gg.essential.elementa.*;
import gg.essential.elementa.components.image.*;
import kotlin.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;
import java.nio.*;
import com.mojang.blaze3d.systems.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000L
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J8\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\rJ \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001cH$J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010
                                                   \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006!""" }, d2 = { "Lgg/essential/gui/common/UIFrameBuffer;", "Lgg/essential/elementa/UIComponent;", "Lgg/essential/elementa/components/image/ImageProvider;", "()V", "dirty", "", "frameBuffer", "", "frameBufferHeight", "frameBufferWidth", "frameDepthStencil", "frameTexture", "delete", "", "deleteFrameBuffer", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawImage", "x", "", "y", "width", "height", "color", "Ljava/awt/Color;", "markDirty", "render", "", "withFrameBuffer", "glId", "block", "Ljava/lang/Runnable;", "essential" })
public abstract class UIFrameBuffer extends UIComponent implements ImageProvider
{
    private boolean dirty;
    private int frameBuffer;
    private int frameTexture;
    private int frameDepthStencil;
    private int frameBufferWidth;
    private int frameBufferHeight;
    
    public UIFrameBuffer() {
        super();
        this.dirty = true;
        this.frameBuffer = -1;
        this.frameTexture = -1;
        this.frameDepthStencil = -1;
    }
    
    public final void markDirty() {
        this.dirty = true;
    }
    
    public void delete() {
        this.deleteFrameBuffer();
    }
    
    private final void deleteFrameBuffer() {
        if (this.frameDepthStencil != -1) {
            GL11.glDeleteTextures(this.frameDepthStencil);
            this.frameDepthStencil = -1;
        }
        if (this.frameTexture != -1) {
            GL11.glDeleteTextures(this.frameTexture);
            this.frameTexture = -1;
        }
        if (this.frameBuffer != -1) {
            GL30.glDeleteFramebuffers(this.frameBuffer);
            this.frameBuffer = -1;
        }
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        final double x = this.getLeft();
        final double y = this.getTop();
        final double width = this.getWidth();
        final double height = this.getHeight();
        final Color color = this.getColor();
        this.drawImage(matrixStack, x, y, width, height, color);
        super.draw(matrixStack);
    }
    
    @Override
    public void drawImage(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        if (UResolution.getWindowWidth() == 0 || UResolution.getWindowHeight() == 0) {
            return;
        }
        final float mcScale = (float)UResolution.getScaleFactor();
        final int osScale = UResolution.getViewportWidth() / UResolution.getWindowWidth();
        final float realWidth = (float)width * mcScale;
        final float realHeight = (float)height * mcScale;
        final int frameWidth = (int)realWidth * osScale;
        final int frameHeight = (int)realHeight * osScale;
        if (frameWidth != this.frameBufferWidth || frameHeight != this.frameBufferHeight || this.frameBuffer == -1) {
            this.frameBufferWidth = frameWidth;
            this.frameBufferHeight = frameHeight;
            this.dirty = true;
            this.deleteFrameBuffer();
            this.frameBuffer = GL30.glGenFramebuffers();
            this.frameTexture = GL11.glGenTextures();
            this.frameDepthStencil = GL11.glGenTextures();
            UGraphics.configureTexture(this.frameTexture, UIFrameBuffer::drawImage$lambda-0);
            UGraphics.configureTexture(this.frameDepthStencil, UIFrameBuffer::drawImage$lambda-1);
            this.withFrameBuffer(this.frameBuffer, UIFrameBuffer::drawImage$lambda-2);
        }
        if (this.dirty) {
            this.dirty = false;
            this.withFrameBuffer(this.frameBuffer, UIFrameBuffer::drawImage$lambda-3);
        }
        matrixStack.push();
        UGraphics.enableBlend();
        UGraphics.enableAlpha();
        matrixStack.scale(1.0f, 1.0f, 50.0f);
        UGraphics.bindTexture(0, this.frameTexture);
        final float red = color.getRed() / 255.0f;
        final float green = color.getGreen() / 255.0f;
        final float blue = color.getBlue() / 255.0f;
        final float alpha = color.getAlpha() / 255.0f;
        final UGraphics worldRenderer = UGraphics.getFromTessellator();
        worldRenderer.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        worldRenderer.pos(matrixStack, x, y + height, 0.0).tex(0.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x + width, y + height, 0.0).tex(1.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x + width, y, 0.0).tex(1.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x, y, 0.0).tex(0.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.drawDirect();
        UGraphics.bindTexture(0, 0);
        matrixStack.pop();
    }
    
    private final void withFrameBuffer(final int glId, final Runnable block) {
        final int prevReadFrameBufferBinding = GL11.glGetInteger(36010);
        final int prevDrawFrameBufferBinding = GL11.glGetInteger(36006);
        GL30.glBindFramebuffer(36160, glId);
        block.run();
        GL30.glBindFramebuffer(36008, prevReadFrameBufferBinding);
        GL30.glBindFramebuffer(36009, prevDrawFrameBufferBinding);
    }
    
    protected abstract void render(@NotNull final UMatrixStack p0, final float p1, final float p2);
    
    private static final void drawImage$lambda-0(final int $frameWidth, final int $frameHeight) {
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexImage2D(3553, 0, 32856, $frameWidth, $frameHeight, 0, 6408, 5121, (ByteBuffer)null);
    }
    
    private static final void drawImage$lambda-1(final int $frameWidth, final int $frameHeight) {
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexImage2D(3553, 0, 35056, $frameWidth, $frameHeight, 0, 34041, 34042, (ByteBuffer)null);
    }
    
    private static final void drawImage$lambda-2(final UIFrameBuffer this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        GL30.glFramebufferTexture2D(36160, 36064, 3553, this$0.frameTexture, 0);
        GL30.glFramebufferTexture2D(36160, 33306, 3553, this$0.frameDepthStencil, 0);
    }
    
    private static final void drawImage$lambda-3(final int $frameWidth, final int $frameHeight, final UIFrameBuffer this$0, final float $realWidth, final float $realHeight) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final boolean scissorState = GL11.glGetBoolean(3089);
        GL11.glDisable(3089);
        RenderSystem.clearColor(0.0f, 0.0f, 0.0f, 0.0f);
        RenderSystem.clearDepth(1.0);
        GL11.glClearStencil(0);
        GL11.glClear(17664);
        GL11.glViewport(0, 0, $frameWidth, $frameHeight);
        final UMatrixStack stack = new UMatrixStack();
        final double scale = 1.0 / UResolution.getScaleFactor();
        stack.scale(scale * UResolution.getViewportWidth() / $frameWidth, scale * UResolution.getViewportHeight() / $frameHeight, 1.0);
        this$0.render(stack, $realWidth, $realHeight);
        GL11.glViewport(0, 0, UResolution.getViewportWidth(), UResolution.getViewportHeight());
        if (scissorState) {
            GL11.glEnable(3089);
        }
    }
}
