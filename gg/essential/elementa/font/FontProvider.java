package gg.essential.elementa.font;

import gg.essential.universal.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001JV\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016JN\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0017J\b\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u000bH&J\b\u0010\u0014\u001a\u00020\u000bH&J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bH&J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bH&¨\u0006\u0018\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/font/FontProvider;", "Lgg/essential/elementa/constraints/SuperConstraint;", "drawString", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "string", "", "color", "Ljava/awt/Color;", "x", "", "y", "originalPointSize", "scale", "shadow", "", "shadowColor", "getBaseLineHeight", "getBelowLineHeight", "getShadowHeight", "getStringHeight", "pointSize", "getStringWidth", "Elementa" })
public interface FontProvider extends SuperConstraint<FontProvider>
{
    float getStringWidth(@NotNull final String p0, final float p1);
    
    float getStringHeight(@NotNull final String p0, final float p1);
    
    default void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        matrixStack.runWithGlobalState((kotlin.jvm.functions.Function0<?>)new FontProvider$drawString.FontProvider$drawString$1(this, string, color, x, y, originalPointSize, scale, shadow, shadowColor));
    }
    
    default /* synthetic */ void drawString$default(final FontProvider fontProvider, final UMatrixStack matrixStack, final String string, final Color color, final float x, final float y, final float originalPointSize, final float scale, boolean shadow, Color shadowColor, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawString");
        }
        if ((n & 0x80) != 0x0) {
            shadow = true;
        }
        if ((n & 0x100) != 0x0) {
            shadowColor = null;
        }
        fontProvider.drawString(matrixStack, string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawString(matrixStack, string, color, x, y, originalPointSize, scale, shadow, shadowColor)", imports = {}))
    @java.lang.Deprecated
    default void drawString(@NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.drawString(new UMatrixStack(), string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    @java.lang.Deprecated
    default /* synthetic */ void drawString$default(final FontProvider fontProvider, final String string, final Color color, final float x, final float y, final float originalPointSize, final float scale, boolean shadow, Color shadowColor, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawString");
        }
        if ((n & 0x40) != 0x0) {
            shadow = true;
        }
        if ((n & 0x80) != 0x0) {
            shadowColor = null;
        }
        fontProvider.drawString(string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    float getBaseLineHeight();
    
    float getShadowHeight();
    
    float getBelowLineHeight();
    
    default /* synthetic */ void access$drawString$jd(final FontProvider $this, final UMatrixStack matrixStack, final String string, final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, final Color shadowColor) {
        $this.drawString(matrixStack, string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    default /* synthetic */ void access$drawString$jd(final FontProvider $this, final String string, final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, final Color shadowColor) {
        $this.drawString(string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final FontProvider $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final FontProvider $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final FontProvider $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final FontProvider $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final FontProvider $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final FontProvider $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
}
