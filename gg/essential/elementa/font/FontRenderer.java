package gg.essential.elementa.font;

import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;
import gg.essential.universal.*;
import kotlin.random.*;
import gg.essential.elementa.font.data.*;
import org.lwjgl.opengl.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.utils.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J@\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002JR\u0010-\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J8\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u00100\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\u000e\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020)J\b\u00108\u001a\u00020)H\u0016J\u0018\u00109\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\u0006\u00107\u001a\u00020)H\u0016J$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0;2\u0006\u0010.\u001a\u00020/2\u0006\u00107\u001a\u00020)H\u0002J\u0018\u0010<\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\u0006\u00107\u001a\u00020)H\u0016J\u0010\u0010=\u001a\u00020\"2\u0006\u00107\u001a\u00020)H\u0002J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020@H\u0002J\u0018\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020C2\u0006\u0010?\u001a\u00020DH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F" }, d2 = { "Lgg/essential/elementa/font/FontRenderer;", "Lgg/essential/elementa/font/FontProvider;", "regularFont", "Lgg/essential/elementa/font/data/Font;", "boldFont", "(Lgg/essential/elementa/font/data/Font;Lgg/essential/elementa/font/data/Font;)V", "activeFont", "bold", "", "cachedValue", "getCachedValue", "()Lgg/essential/elementa/font/FontProvider;", "setCachedValue", "(Lgg/essential/elementa/font/FontProvider;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "drawingShadow", "italics", "obfuscated", "recalculate", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "shadowColor", "Ljava/awt/Color;", "strikethrough", "textColor", "underline", "drawGlyph", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "glyph", "Lgg/essential/elementa/font/data/Glyph;", "color", "x", "", "y", "width", "height", "drawString", "string", "", "originalPointSize", "scale", "shadow", "drawStringNow", "getBaseLineHeight", "getBelowLineHeight", "getLineHeight", "pointSize", "getShadowHeight", "getStringHeight", "getStringInformation", "Lkotlin/Pair;", "getStringWidth", "refreshColor", "switchFont", "type", "", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "Lgg/essential/elementa/constraints/ConstraintType;", "Companion", "Elementa" })
public final class FontRenderer implements FontProvider
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Font regularFont;
    @NotNull
    private final Font boldFont;
    private boolean underline;
    private boolean strikethrough;
    private boolean bold;
    private boolean italics;
    private boolean obfuscated;
    @Nullable
    private Color textColor;
    @Nullable
    private Color shadowColor;
    private boolean drawingShadow;
    @NotNull
    private Font activeFont;
    @NotNull
    private FontProvider cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private static final Map<Integer, Color> colors;
    public static UShader shader;
    public static SamplerUniform samplerUniform;
    public static FloatUniform doffsetUniform;
    public static FloatUniform hintAmountUniform;
    public static FloatUniform subpixelAmountUniform;
    public static Float2Uniform sdfTexel;
    public static Float4Uniform fgColorUniform;
    
    public FontRenderer(@NotNull final Font regularFont, @NotNull final Font boldFont) {
        Intrinsics.checkNotNullParameter((Object)regularFont, "regularFont");
        Intrinsics.checkNotNullParameter((Object)boldFont, "boldFont");
        super();
        this.regularFont = regularFont;
        this.boldFont = boldFont;
        this.activeFont = this.regularFont;
        this.cachedValue = this;
    }
    
    public FontRenderer(final Font regularFont, Font boldFont, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            boldFont = regularFont;
        }
        this(regularFont, boldFont);
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
        return ((Number)this.getStringInformation(string, pointSize).getFirst()).floatValue();
    }
    
    @Override
    public float getStringHeight(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return ((Number)this.getStringInformation(string, pointSize).getSecond()).floatValue();
    }
    
    private final Pair<Float, Float> getStringInformation(final String string, final float pointSize) {
        float width = 0.0f;
        float height = 0.0f;
        float currentPointSize = pointSize * 1.362306f;
        int i = 0;
        while (i < string.length()) {
            final char char1 = string.charAt(i);
            if (char1 == '§' && i + 1 < string.length()) {
                final int j = StringsKt.indexOf$default((CharSequence)"0123456789abcdefklmnor", string.charAt(i + 1), 0, false, 6, (Object)null);
                if (j == 17) {
                    this.activeFont = this.boldFont;
                }
                else {
                    currentPointSize = pointSize;
                    this.activeFont = this.regularFont;
                }
                i += 2;
            }
            else {
                final Glyph glyph = this.activeFont.getFontInfo().getGlyphs().get((int)char1);
                if (glyph == null) {
                    ++i;
                }
                else {
                    final PlaneBounds planeBounds = glyph.getPlaneBounds();
                    if (planeBounds != null) {
                        height = Math.max((planeBounds.getTop() - planeBounds.getBottom()) * currentPointSize, height);
                    }
                    width += glyph.getAdvance() * currentPointSize;
                    ++i;
                }
            }
        }
        return (Pair<Float, Float>)new Pair((Object)width, (Object)height);
    }
    
    public final float getLineHeight(final float pointSize) {
        return this.activeFont.getFontInfo().getMetrics().getLineHeight() * pointSize;
    }
    
    private final void switchFont(final int type) {
        final Font tmp = this.activeFont;
        switch (type) {
            case 1: {
                this.activeFont = this.regularFont;
                break;
            }
            case 2: {
                this.activeFont = this.boldFont;
                break;
            }
        }
        FontRenderer.Companion.getSamplerUniform$Elementa().setValue(this.activeFont.getTexture().getDynamicGlId());
        if (!Intrinsics.areEqual((Object)this.activeFont, (Object)tmp)) {
            UGraphics.configureTexture(this.activeFont.getTexture().getDynamicGlId(), FontRenderer::switchFont$lambda-0);
            FontRenderer.Companion.getSdfTexel$Elementa().setValue(1.0f / this.activeFont.getFontInfo().getAtlas().getWidth(), 1.0f / this.activeFont.getFontInfo().getAtlas().getHeight());
        }
    }
    
    @Override
    public void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final float effectiveSize = originalPointSize * scale * 1.362306f;
        final float adjustedY = y - effectiveSize / 5;
        if (shadow) {
            this.drawingShadow = true;
            final Color effectiveShadow = shadowColor;
            int baseColor = color.getRGB();
            if (effectiveShadow == null) {
                if ((baseColor & 0xFC000000) == 0x0) {
                    baseColor |= 0xFF000000;
                }
                baseColor = ((baseColor & 0xFCFCFC) >> 2 | (baseColor & 0xFF000000));
            }
            this.shadowColor = new Color(baseColor);
            final float shadowOffset = effectiveSize / 10;
            matrixStack.translate(shadowOffset, shadowOffset, 0.0f);
            this.drawStringNow(matrixStack, string, new Color(baseColor), x, adjustedY, effectiveSize);
            matrixStack.translate(-shadowOffset, -shadowOffset, 0.0f);
        }
        this.drawingShadow = false;
        this.drawStringNow(matrixStack, string, color, x, adjustedY, effectiveSize);
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
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
    
    private final void refreshColor(final float pointSize) {
        final Color color;
        final Color current = color = (this.drawingShadow ? this.shadowColor : this.textColor);
        Intrinsics.checkNotNull((Object)color);
        final float amt = Color.RGBtoHSB(color.getRed(), current.getGreen(), current.getBlue(), null)[2];
        FontRenderer.Companion.getHintAmountUniform$Elementa().setValue(0.0f);
    }
    
    private final void drawStringNow(final UMatrixStack matrixStack, final String string, final Color color, final float x, final float y, final float originalPointSize) {
        if (!FontRenderer.Companion.areShadersInitialized() || !FontRenderer.Companion.getShader$Elementa().getUsable()) {
            return;
        }
        float currentPointSize = originalPointSize;
        FontRenderer.Companion.getShader$Elementa().bind();
        this.switchFont(1);
        FontRenderer.Companion.getDoffsetUniform$Elementa().setValue(3.5f / currentPointSize);
        final float guiScale = (float)UResolution.getScaleFactor();
        this.obfuscated = false;
        this.bold = false;
        this.italics = false;
        this.strikethrough = false;
        this.underline = false;
        this.textColor = color;
        this.refreshColor(originalPointSize);
        float currentX = x;
        int i = 0;
        while (i < string.length()) {
            final char char1 = string.charAt(i);
            if (char1 == '§' && i + 1 < string.length()) {
                final int j = StringsKt.indexOf$default((CharSequence)"0123456789abcdefklmnor", string.charAt(i + 1), 0, false, 6, (Object)null);
                if (j < 16) {
                    this.switchFont(1);
                    this.obfuscated = false;
                    this.bold = false;
                    this.italics = false;
                    this.strikethrough = false;
                    this.underline = false;
                    if (j < 0) {
                        this.textColor = FontRenderer.colors.get(15);
                        this.shadowColor = FontRenderer.colors.get(31);
                    }
                    else {
                        this.textColor = FontRenderer.colors.get(j);
                        this.shadowColor = FontRenderer.colors.get(j + 16);
                    }
                    currentPointSize = originalPointSize;
                    FontRenderer.Companion.getDoffsetUniform$Elementa().setValue(3.5f / currentPointSize);
                    this.refreshColor(originalPointSize);
                }
                else if (j == 16) {
                    this.obfuscated = true;
                }
                else if (j == 17) {
                    this.switchFont(2);
                    FontRenderer.Companion.getDoffsetUniform$Elementa().setValue(3.5f / currentPointSize);
                    this.bold = true;
                }
                else if (j == 18) {
                    this.strikethrough = true;
                }
                else if (j == 19) {
                    this.underline = true;
                }
                else if (j == 20) {
                    this.italics = true;
                }
                else {
                    currentPointSize = originalPointSize;
                    this.switchFont(1);
                    FontRenderer.Companion.getDoffsetUniform$Elementa().setValue(3.5f / currentPointSize);
                    this.obfuscated = false;
                    this.bold = false;
                    this.italics = false;
                    this.strikethrough = false;
                    this.underline = false;
                    this.textColor = color;
                    final Color shadowColor = this.shadowColor;
                    this.refreshColor(originalPointSize);
                }
                i += 2;
            }
            else {
                Glyph glyph = this.activeFont.getFontInfo().getGlyphs().get((int)char1);
                if (glyph == null) {
                    ++i;
                }
                else {
                    if (this.obfuscated && char1 != ' ') {
                        final float advance = glyph.getAdvance();
                        int k = 1;
                        while (k < 101) {
                            final int iter = k;
                            ++k;
                            final char tmp = StringsKt.random((CharSequence)"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", (Random)Random.Default);
                            final float n = advance;
                            final Glyph glyph2 = this.activeFont.getFontInfo().getGlyphs().get((int)tmp);
                            final Float n2 = (glyph2 == null) ? null : Float.valueOf(glyph2.getAdvance());
                            if (n2 == null) {
                                continue;
                            }
                            if (n == n2) {
                                glyph = this.activeFont.getFontInfo().getGlyphs().get((int)tmp);
                                break;
                            }
                        }
                    }
                    if (glyph == null) {
                        ++i;
                    }
                    else {
                        final PlaneBounds planeBounds = glyph.getPlaneBounds();
                        if (planeBounds != null) {
                            final Metrics metrics = this.activeFont.getFontInfo().getMetrics();
                            final float baseline = y + (metrics.getLineHeight() + metrics.getDescender()) * currentPointSize;
                            final float hintedBaseline = (float)Math.floor(baseline * guiScale) / guiScale;
                            final float width = (planeBounds.getRight() - planeBounds.getLeft()) * currentPointSize;
                            final float height = (planeBounds.getTop() - planeBounds.getBottom()) * currentPointSize;
                            final float hintedHeight = (float)Math.ceil(height * guiScale) / guiScale;
                            final float hintedY = hintedBaseline - (float)Math.ceil(planeBounds.getTop() * currentPointSize * guiScale) / guiScale;
                            this.drawGlyph(matrixStack, glyph, color, currentX, hintedY, width, hintedHeight);
                        }
                        currentX += glyph.getAdvance() * currentPointSize;
                        ++i;
                    }
                }
            }
        }
        FontRenderer.Companion.getShader$Elementa().unbind();
        this.activeFont = this.boldFont;
    }
    
    private final void drawGlyph(final UMatrixStack matrixStack, final Glyph glyph, final Color color, final float x, final float y, final float width, final float height) {
        final AtlasBounds atlasBounds2 = glyph.getAtlasBounds();
        if (atlasBounds2 == null) {
            return;
        }
        final AtlasBounds atlasBounds = atlasBounds2;
        final Atlas atlas = this.activeFont.getFontInfo().getAtlas();
        final double textureTop = 1.0 - atlasBounds.getTop() / atlas.getHeight();
        final double textureBottom = 1.0 - atlasBounds.getBottom() / atlas.getHeight();
        final double textureLeft = atlasBounds.getLeft() / atlas.getWidth();
        final double textureRight = atlasBounds.getRight() / atlas.getWidth();
        Color color2;
        if (this.drawingShadow) {
            if ((color2 = this.shadowColor) == null) {
                color2 = color;
            }
        }
        else if ((color2 = this.textColor) == null) {
            color2 = color;
        }
        final Color drawColor = color2;
        FontRenderer.Companion.getFgColorUniform$Elementa().setValue(drawColor.getRed() / 255.0f, drawColor.getGreen() / 255.0f, drawColor.getBlue() / 255.0f, 1.0f);
        final UGraphics worldRenderer = UGraphics.getFromTessellator();
        worldRenderer.beginWithActiveShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_TEXTURE);
        final double doubleX = x;
        final double doubleY = y;
        worldRenderer.pos(matrixStack, doubleX, doubleY + height, 0.0).tex(textureLeft, textureBottom).endVertex();
        worldRenderer.pos(matrixStack, doubleX + width, doubleY + height, 0.0).tex(textureRight, textureBottom).endVertex();
        worldRenderer.pos(matrixStack, doubleX + width, doubleY, 0.0).tex(textureRight, textureTop).endVertex();
        worldRenderer.pos(matrixStack, doubleX, doubleY, 0.0).tex(textureLeft, textureTop).endVertex();
        worldRenderer.drawDirect();
    }
    
    private static final void switchFont$lambda-0() {
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue((FontProvider)<set-?>);
    }
    
    static {
        Companion = new Companion(null);
        colors = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)0, (Object)Color.BLACK), TuplesKt.to((Object)1, (Object)new Color(0, 0, 170)), TuplesKt.to((Object)2, (Object)new Color(0, 170, 0)), TuplesKt.to((Object)3, (Object)new Color(0, 170, 170)), TuplesKt.to((Object)4, (Object)new Color(170, 0, 0)), TuplesKt.to((Object)5, (Object)new Color(170, 0, 170)), TuplesKt.to((Object)6, (Object)new Color(255, 170, 0)), TuplesKt.to((Object)7, (Object)new Color(170, 170, 170)), TuplesKt.to((Object)8, (Object)new Color(85, 85, 85)), TuplesKt.to((Object)9, (Object)new Color(85, 85, 255)), TuplesKt.to((Object)10, (Object)new Color(85, 255, 85)), TuplesKt.to((Object)11, (Object)new Color(85, 255, 255)), TuplesKt.to((Object)12, (Object)new Color(255, 85, 85)), TuplesKt.to((Object)13, (Object)new Color(255, 85, 255)), TuplesKt.to((Object)14, (Object)new Color(255, 255, 85)), TuplesKt.to((Object)15, (Object)new Color(255, 255, 255)), TuplesKt.to((Object)16, (Object)Color.BLACK), TuplesKt.to((Object)17, (Object)new Color(0, 0, 42)), TuplesKt.to((Object)18, (Object)new Color(0, 42, 0)), TuplesKt.to((Object)19, (Object)new Color(0, 42, 42)), TuplesKt.to((Object)20, (Object)new Color(42, 0, 0)), TuplesKt.to((Object)21, (Object)new Color(42, 0, 42)), TuplesKt.to((Object)22, (Object)new Color(42, 42, 0)), TuplesKt.to((Object)23, (Object)new Color(42, 42, 42)), TuplesKt.to((Object)24, (Object)new Color(21, 21, 21)), TuplesKt.to((Object)25, (Object)new Color(21, 21, 63)), TuplesKt.to((Object)26, (Object)new Color(21, 63, 21)), TuplesKt.to((Object)27, (Object)new Color(21, 63, 63)), TuplesKt.to((Object)28, (Object)new Color(63, 21, 21)), TuplesKt.to((Object)29, (Object)new Color(63, 21, 63)), TuplesKt.to((Object)30, (Object)new Color(63, 63, 21)), TuplesKt.to((Object)31, (Object)new Color(63, 63, 63)) });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\f¨\u0006/" }, d2 = { "Lgg/essential/elementa/font/FontRenderer$Companion;", "", "()V", "colors", "", "", "Ljava/awt/Color;", "doffsetUniform", "Lgg/essential/universal/shader/FloatUniform;", "getDoffsetUniform$Elementa", "()Lgg/essential/universal/shader/FloatUniform;", "setDoffsetUniform$Elementa", "(Lgg/essential/universal/shader/FloatUniform;)V", "fgColorUniform", "Lgg/essential/universal/shader/Float4Uniform;", "getFgColorUniform$Elementa", "()Lgg/essential/universal/shader/Float4Uniform;", "setFgColorUniform$Elementa", "(Lgg/essential/universal/shader/Float4Uniform;)V", "hintAmountUniform", "getHintAmountUniform$Elementa", "setHintAmountUniform$Elementa", "samplerUniform", "Lgg/essential/universal/shader/SamplerUniform;", "getSamplerUniform$Elementa", "()Lgg/essential/universal/shader/SamplerUniform;", "setSamplerUniform$Elementa", "(Lgg/essential/universal/shader/SamplerUniform;)V", "sdfTexel", "Lgg/essential/universal/shader/Float2Uniform;", "getSdfTexel$Elementa", "()Lgg/essential/universal/shader/Float2Uniform;", "setSdfTexel$Elementa", "(Lgg/essential/universal/shader/Float2Uniform;)V", "shader", "Lgg/essential/universal/shader/UShader;", "getShader$Elementa", "()Lgg/essential/universal/shader/UShader;", "setShader$Elementa", "(Lgg/essential/universal/shader/UShader;)V", "subpixelAmountUniform", "getSubpixelAmountUniform$Elementa", "setSubpixelAmountUniform$Elementa", "areShadersInitialized", "", "initShaders", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final UShader getShader$Elementa() {
            final UShader shader = FontRenderer.shader;
            if (shader != null) {
                return shader;
            }
            Intrinsics.throwUninitializedPropertyAccessException("shader");
            return null;
        }
        
        public final void setShader$Elementa(@NotNull final UShader <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.shader = <set-?>;
        }
        
        @NotNull
        public final SamplerUniform getSamplerUniform$Elementa() {
            final SamplerUniform samplerUniform = FontRenderer.samplerUniform;
            if (samplerUniform != null) {
                return samplerUniform;
            }
            Intrinsics.throwUninitializedPropertyAccessException("samplerUniform");
            return null;
        }
        
        public final void setSamplerUniform$Elementa(@NotNull final SamplerUniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.samplerUniform = <set-?>;
        }
        
        @NotNull
        public final FloatUniform getDoffsetUniform$Elementa() {
            final FloatUniform doffsetUniform = FontRenderer.doffsetUniform;
            if (doffsetUniform != null) {
                return doffsetUniform;
            }
            Intrinsics.throwUninitializedPropertyAccessException("doffsetUniform");
            return null;
        }
        
        public final void setDoffsetUniform$Elementa(@NotNull final FloatUniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.doffsetUniform = <set-?>;
        }
        
        @NotNull
        public final FloatUniform getHintAmountUniform$Elementa() {
            final FloatUniform hintAmountUniform = FontRenderer.hintAmountUniform;
            if (hintAmountUniform != null) {
                return hintAmountUniform;
            }
            Intrinsics.throwUninitializedPropertyAccessException("hintAmountUniform");
            return null;
        }
        
        public final void setHintAmountUniform$Elementa(@NotNull final FloatUniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.hintAmountUniform = <set-?>;
        }
        
        @NotNull
        public final FloatUniform getSubpixelAmountUniform$Elementa() {
            final FloatUniform subpixelAmountUniform = FontRenderer.subpixelAmountUniform;
            if (subpixelAmountUniform != null) {
                return subpixelAmountUniform;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subpixelAmountUniform");
            return null;
        }
        
        public final void setSubpixelAmountUniform$Elementa(@NotNull final FloatUniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.subpixelAmountUniform = <set-?>;
        }
        
        @NotNull
        public final Float2Uniform getSdfTexel$Elementa() {
            final Float2Uniform sdfTexel = FontRenderer.sdfTexel;
            if (sdfTexel != null) {
                return sdfTexel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sdfTexel");
            return null;
        }
        
        public final void setSdfTexel$Elementa(@NotNull final Float2Uniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.sdfTexel = <set-?>;
        }
        
        @NotNull
        public final Float4Uniform getFgColorUniform$Elementa() {
            final Float4Uniform fgColorUniform = FontRenderer.fgColorUniform;
            if (fgColorUniform != null) {
                return fgColorUniform;
            }
            Intrinsics.throwUninitializedPropertyAccessException("fgColorUniform");
            return null;
        }
        
        public final void setFgColorUniform$Elementa(@NotNull final Float4Uniform <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            FontRenderer.fgColorUniform = <set-?>;
        }
        
        public final boolean areShadersInitialized() {
            return FontRenderer.shader != null;
        }
        
        public final void initShaders() {
            if (this.areShadersInitialized()) {
                return;
            }
            this.setShader$Elementa(ExtensionsKt.readFromLegacyShader(UShader.Companion, "font", "font", BlendState.NORMAL));
            if (!this.getShader$Elementa().getUsable()) {
                System.out.println((Object)"Failed to load Elementa font shader");
                return;
            }
            this.setSamplerUniform$Elementa(this.getShader$Elementa().getSamplerUniform("msdf"));
            this.setDoffsetUniform$Elementa(this.getShader$Elementa().getFloatUniform("doffset"));
            this.setHintAmountUniform$Elementa(this.getShader$Elementa().getFloatUniform("hint_amount"));
            this.setSdfTexel$Elementa(this.getShader$Elementa().getFloat2Uniform("sdf_texel"));
            this.setFgColorUniform$Elementa(this.getShader$Elementa().getFloat4Uniform("fgColor"));
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
