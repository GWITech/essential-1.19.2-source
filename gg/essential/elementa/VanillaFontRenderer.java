package gg.essential.elementa;

import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;
import gg.essential.universal.*;
import java.awt.*;
import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002JR\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001dH\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001dH\u0016J\u0018\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016R\u001a\u0010\u0003\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006/" }, d2 = { "Lgg/essential/elementa/VanillaFontRenderer;", "Lgg/essential/elementa/font/FontProvider;", "()V", "cachedValue", "getCachedValue", "()Lgg/essential/elementa/font/FontProvider;", "setCachedValue", "(Lgg/essential/elementa/font/FontProvider;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "drawString", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "string", "", "color", "Ljava/awt/Color;", "x", "", "y", "originalPointSize", "scale", "shadow", "shadowColor", "getBaseLineHeight", "getBelowLineHeight", "getShadowHeight", "getStringHeight", "pointSize", "getStringWidth", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Companion", "Elementa" })
public final class VanillaFontRenderer implements FontProvider
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private FontProvider cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    public static final float BASE_CHAR_HEIGHT = 7.0f;
    public static final float BELOW_LINE_HEIGHT = 1.0f;
    public static final float SHADOW_HEIGHT = 1.0f;
    
    public VanillaFontRenderer() {
        super();
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
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    @Override
    public float getStringWidth(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return (float)UGraphics.getStringWidth(string);
    }
    
    @Override
    public float getStringHeight(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return (float)UGraphics.getFontHeight();
    }
    
    @Override
    public void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final float scaledX = ExtensionsKt.roundToRealPixels(x) / scale;
        final float scaledY = ExtensionsKt.roundToRealPixels(y) / scale;
        matrixStack.scale(scale, scale, 1.0f);
        if (shadowColor == null || !shadow) {
            UGraphics.drawString(matrixStack, string, scaledX, scaledY, color.getRGB(), shadow);
        }
        else {
            UGraphics.drawString(matrixStack, string, scaledX, scaledY, color.getRGB(), shadowColor.getRGB());
        }
        matrixStack.scale(1 / scale, 1 / scale, 1.0f);
    }
    
    @Override
    public float getBaseLineHeight() {
        return 7.0f;
    }
    
    @Override
    public float getShadowHeight() {
        return 1.0f;
    }
    
    @Override
    public float getBelowLineHeight() {
        return 1.0f;
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
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/VanillaFontRenderer$Companion;", "", "()V", "BASE_CHAR_HEIGHT", "", "BELOW_LINE_HEIGHT", "SHADOW_HEIGHT", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
