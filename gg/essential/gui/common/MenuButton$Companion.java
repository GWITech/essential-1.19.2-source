package gg.essential.gui.common;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.shader.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0013
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jn\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010	\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006*""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Companion;", "", "()V", "BLUE", "Lgg/essential/gui/common/MenuButton$Style;", "getBLUE", "()Lgg/essential/gui/common/MenuButton$Style;", "BLUE_DISABLED", "getBLUE_DISABLED", "DARK_GRAY", "getDARK_GRAY", "GRAY", "getGRAY", "GREEN", "getGREEN", "LIGHT_BLUE", "getLIGHT_BLUE", "LIGHT_RED", "getLIGHT_RED", "RED", "getRED", "RED_DISABLED", "getRED_DISABLED", "drawButton", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "left", "", "top", "right", "bottom", "baseColor", "Ljava/awt/Color;", "highlightColor", "shadowColor", "outlineColor", "hasTop", "", "hasBottom", "hasLeft", "hasRight", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    public final void drawButton(@NotNull final UMatrixStack matrixStack, final double left, final double top, final double right, final double bottom, @NotNull final Color baseColor, @NotNull final Color highlightColor, @NotNull final Color shadowColor, @NotNull final Color outlineColor, final boolean hasTop, final boolean hasBottom, final boolean hasLeft, final boolean hasRight) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)baseColor, "baseColor");
        Intrinsics.checkNotNullParameter((Object)highlightColor, "highlightColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        final BlendState prevBlendState = BlendState.Companion.active();
        BlendState.NORMAL.activate();
        UGraphics.enableDepth();
        UGraphics.depthFunc(519);
        final UGraphics $this$drawButton_u24lambda_u2d0 = UGraphics.getFromTessellator();
        $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(baseColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(baseColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(baseColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(baseColor).endVertex();
        $this$drawButton_u24lambda_u2d0.drawDirect();
        $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left + 1.0, bottom, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left + 1.0, top + 1.0, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top + 1.0, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(highlightColor).endVertex();
        $this$drawButton_u24lambda_u2d0.drawDirect();
        $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right - 1.0, top, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, right - 1.0, bottom - 2.0, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom - 2.0, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(shadowColor).endVertex();
        $this$drawButton_u24lambda_u2d0.drawDirect();
        if (hasTop) {
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), top - 1.0, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), top - 1.0, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
        }
        if (hasBottom) {
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), bottom + 1.0, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), bottom + 1.0, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
        }
        if (hasLeft) {
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - 1.0, top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - 1.0, bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
        }
        if (hasRight) {
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + 1.0, bottom, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + 1.0, top, 0.0).color(outlineColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
        }
        UGraphics.disableDepth();
        UGraphics.depthFunc(515);
        prevBlendState.activate();
    }
    
    @NotNull
    public final Style getGRAY() {
        return MenuButton.access$getGRAY$cp();
    }
    
    @NotNull
    public final Style getDARK_GRAY() {
        return MenuButton.access$getDARK_GRAY$cp();
    }
    
    @NotNull
    public final Style getGREEN() {
        return MenuButton.access$getGREEN$cp();
    }
    
    @NotNull
    public final Style getBLUE() {
        return MenuButton.access$getBLUE$cp();
    }
    
    @NotNull
    public final Style getBLUE_DISABLED() {
        return MenuButton.access$getBLUE_DISABLED$cp();
    }
    
    @NotNull
    public final Style getLIGHT_BLUE() {
        return MenuButton.access$getLIGHT_BLUE$cp();
    }
    
    @NotNull
    public final Style getRED() {
        return MenuButton.access$getRED$cp();
    }
    
    @NotNull
    public final Style getLIGHT_RED() {
        return MenuButton.access$getLIGHT_RED$cp();
    }
    
    @NotNull
    public final Style getRED_DISABLED() {
        return MenuButton.access$getRED_DISABLED$cp();
    }
    
    public Companion(final byte b) {
        this();
    }
}
