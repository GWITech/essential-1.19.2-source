package gg.essential.elementa.font;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.awt.*;
import gg.essential.universal.*;
import gg.essential.elementa.font.data.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0002JR\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u001dH\u0016J8\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fJ\b\u0010/\u001a\u00020\u001fH\u0016J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f012\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u001fH\u0002J\u0018\u00102\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u001fH\u0016J\u0018\u00103\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u001fH\u0016J\u0018\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016R\u001a\u0010\u0005\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069" }, d2 = { "Lgg/essential/elementa/font/BasicFontRenderer;", "Lgg/essential/elementa/font/FontProvider;", "regularFont", "Lgg/essential/elementa/font/data/Font;", "(Lgg/essential/elementa/font/data/Font;)V", "cachedValue", "getCachedValue", "()Lgg/essential/elementa/font/FontProvider;", "setCachedValue", "(Lgg/essential/elementa/font/FontProvider;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "drawGlyph", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "glyph", "Lgg/essential/elementa/font/data/Glyph;", "color", "Ljava/awt/Color;", "x", "", "y", "width", "height", "drawString", "string", "", "originalPointSize", "scale", "shadow", "shadowColor", "drawStringNow", "getBaseLineHeight", "getBelowLineHeight", "getLineHeight", "pointSize", "getShadowHeight", "getStringDimensions", "Lkotlin/Pair;", "getStringHeight", "getStringWidth", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class BasicFontRenderer implements FontProvider
{
    @NotNull
    private final Font regularFont;
    @NotNull
    private FontProvider cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public BasicFontRenderer(@NotNull final Font regularFont) {
        Intrinsics.checkNotNullParameter((Object)regularFont, "regularFont");
        super();
        this.regularFont = regularFont;
        this.cachedValue = this;
    }
    
    @NotNull
    @Override
    public FontProvider getCachedValue() {
        return this.cachedValue;
    }
    
    @Override
    public void setCachedValue(@NotNull final FontProvider <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.cachedValue = <set-?>;
    }
    
    @Override
    public boolean getRecalculate() {
        return this.recalculate;
    }
    
    @Override
    public void setRecalculate(final boolean <set-?>) {
        this.recalculate = <set-?>;
    }
    
    @Nullable
    @Override
    public UIComponent getConstrainTo() {
        return this.constrainTo;
    }
    
    @Override
    public void setConstrainTo(@Nullable final UIComponent <set-?>) {
        this.constrainTo = <set-?>;
    }
    
    @Override
    public float getStringWidth(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return ((Number)this.getStringDimensions(string, pointSize).getFirst()).floatValue();
    }
    
    @Override
    public float getStringHeight(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return ((Number)this.getStringDimensions(string, pointSize).getSecond()).floatValue();
    }
    
    private final Pair<Float, Float> getStringDimensions(final String string, final float pointSize) {
        float width = 0.0f;
        float height = 0.0f;
        final float currentPointSize = pointSize / 10 * this.regularFont.getFontInfo().getAtlas().getSize();
        int i = 0;
        while (i < string.length()) {
            final char char1 = string.charAt(i);
            if (char1 == '§' && i + 1 < string.length()) {
                i += 2;
            }
            else {
                final Glyph glyph2;
                final Glyph glyph = glyph2 = this.regularFont.getFontInfo().getGlyphs().get((int)char1);
                if (((glyph2 == null) ? null : glyph2.getAtlasBounds()) == null) {
                    ++i;
                }
                else {
                    final PlaneBounds planeBounds = glyph.getPlaneBounds();
                    if (planeBounds != null) {
                        height = Math.max((planeBounds.getTop() - planeBounds.getBottom()) * currentPointSize, height);
                    }
                    final int lastCorrection = (i >= string.length() - 1) ? 1 : 0;
                    width += (glyph.getAtlasBounds().getRight() - glyph.getAtlasBounds().getLeft() - lastCorrection) / this.regularFont.getFontInfo().getAtlas().getSize() * currentPointSize;
                    ++i;
                }
            }
        }
        return (Pair<Float, Float>)new Pair((Object)width, (Object)height);
    }
    
    public final float getLineHeight(final float pointSize) {
        return this.regularFont.getFontInfo().getMetrics().getLineHeight() * pointSize;
    }
    
    @Override
    public void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final float scaledPointSize = originalPointSize / 10 * this.regularFont.getFontInfo().getAtlas().getSize();
        if (shadow) {
            Color color2;
            if ((color2 = shadowColor) == null) {
                color2 = new Color((color.getRGB() & 0xFCFCFC) >> 2 | (color.getRGB() & 0xFF000000));
            }
            this.drawStringNow(matrixStack, string, color2, x + 1, y, scaledPointSize * scale);
        }
        this.drawStringNow(matrixStack, string, color, x, y - 1, scaledPointSize * scale);
    }
    
    @Override
    public float getBaseLineHeight() {
        return this.regularFont.getFontInfo().getAtlas().getBaseCharHeight();
    }
    
    @Override
    public float getShadowHeight() {
        return this.regularFont.getFontInfo().getAtlas().getShadowHeight();
    }
    
    @Override
    public float getBelowLineHeight() {
        return this.regularFont.getFontInfo().getAtlas().getBelowLineHeight();
    }
    
    private final void drawStringNow(final UMatrixStack matrixStack, final String string, final Color color, final float x, final float y, final float originalPointSize) {
        UGraphics.bindTexture(0, this.regularFont.getTexture().getDynamicGlId());
        float currentX = x;
        int i = 0;
        while (i < string.length()) {
            final char char1 = string.charAt(i);
            if (char1 == '§' && i + 1 < string.length()) {
                i += 2;
            }
            else {
                final Glyph glyph = this.regularFont.getFontInfo().getGlyphs().get((int)char1);
                if (glyph == null) {
                    ++i;
                }
                else {
                    final PlaneBounds planeBounds = glyph.getPlaneBounds();
                    if (planeBounds != null) {
                        final float width = (planeBounds.getRight() - planeBounds.getLeft()) * originalPointSize;
                        final float height = (planeBounds.getTop() - planeBounds.getBottom()) * originalPointSize;
                        this.drawGlyph(matrixStack, glyph, color, currentX, y + planeBounds.getBottom() * originalPointSize, width, height);
                    }
                    if (glyph.getAtlasBounds() != null) {
                        currentX += (glyph.getAtlasBounds().getRight() - glyph.getAtlasBounds().getLeft()) / this.regularFont.getFontInfo().getAtlas().getSize() * originalPointSize;
                    }
                    else {
                        currentX += glyph.getAdvance() * originalPointSize;
                    }
                    ++i;
                }
            }
        }
    }
    
    private final void drawGlyph(final UMatrixStack matrixStack, final Glyph glyph, final Color color, final float x, final float y, final float width, final float height) {
        final AtlasBounds atlasBounds2 = glyph.getAtlasBounds();
        if (atlasBounds2 == null) {
            return;
        }
        final AtlasBounds atlasBounds = atlasBounds2;
        final Atlas atlas = this.regularFont.getFontInfo().getAtlas();
        final double textureTop = 1.0 - atlasBounds.getTop() / atlas.getHeight();
        final double textureBottom = 1.0 - atlasBounds.getBottom() / atlas.getHeight();
        final double textureLeft = atlasBounds.getLeft() / atlas.getWidth();
        final double textureRight = atlasBounds.getRight() / atlas.getWidth();
        final UGraphics worldRenderer = UGraphics.getFromTessellator();
        worldRenderer.beginWithDefaultShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_TEXTURE_COLOR);
        final double doubleX = x;
        final double doubleY = y;
        worldRenderer.pos(matrixStack, doubleX, doubleY + height, 0.0).tex(textureLeft, textureBottom).color(color.getRed(), color.getGreen(), color.getBlue(), 255).endVertex();
        worldRenderer.pos(matrixStack, doubleX + width, doubleY + height, 0.0).tex(textureRight, textureBottom).color(color.getRed(), color.getGreen(), color.getBlue(), 255).endVertex();
        worldRenderer.pos(matrixStack, doubleX + width, doubleY, 0.0).tex(textureRight, textureTop).color(color.getRed(), color.getGreen(), color.getBlue(), 255).endVertex();
        worldRenderer.pos(matrixStack, doubleX, doubleY, 0.0).tex(textureLeft, textureTop).color(color.getRed(), color.getGreen(), color.getBlue(), 255).endVertex();
        worldRenderer.drawDirect();
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue((FontProvider)<set-?>);
    }
}
