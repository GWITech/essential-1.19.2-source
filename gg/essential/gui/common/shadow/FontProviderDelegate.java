package gg.essential.gui.common.shadow;

import gg.essential.elementa.font.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import java.awt.*;
import kotlin.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000T
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J	\u0010\u0014\u001a\u00020\u0015H\u0096\u0001JW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010"\u001a\u00020\u000f2
                                                   \b\u0002\u0010#\u001a\u0004\u0018\u00010\u001cH\u0096\u0001JO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010"\u001a\u00020\u000f2
                                                   \b\u0002\u0010#\u001a\u0004\u0018\u00010\u001cH\u0097\u0001J	\u0010$\u001a\u00020\u001eH\u0096\u0001J	\u0010%\u001a\u00020\u001eH\u0096\u0001J	\u0010&\u001a\u00020\u001eH\u0096\u0001J\u0019\u0010'\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001eH\u0096\u0001J\u0019\u0010)\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001eH\u0096\u0001J	\u0010*\u001a\u00020\u0015H\u0096\u0001J	\u0010+\u001a\u00020\u0015H\u0096\u0001J	\u0010,\u001a\u00020\u0015H\u0096\u0001J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010.2\u0006\u0010/\u001a\u00020	H\u0096\u0001J!\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000fH\u0096\u0001J\u0019\u00106\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0096\u0001R\u0018\u0010\u0004\u001a\u00020\u0001X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006"\u0004\b\u0007\u0010\u0003R\u001a\u0010\b\u001a\u0004\u0018\u00010	X\u0096\u000f¢\u0006\f\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010R\u0018\u0010\u000e\u001a\u00020\u000fX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011"\u0004\b\u0012\u0010\u0013¨\u00067""" }, d2 = { "Lgg/essential/gui/common/shadow/FontProviderDelegate;", "Lgg/essential/elementa/font/FontProvider;", "delegate", "(Lgg/essential/elementa/font/FontProvider;)V", "cachedValue", "getCachedValue", "()Lgg/essential/elementa/font/FontProvider;", "setCachedValue", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "drawString", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "string", "", "color", "Ljava/awt/Color;", "x", "", "y", "originalPointSize", "scale", "shadow", "shadowColor", "getBaseLineHeight", "getBelowLineHeight", "getShadowHeight", "getStringHeight", "pointSize", "getStringWidth", "pauseIfSupported", "resumeIfSupported", "stopIfSupported", "to", "Lgg/essential/elementa/constraints/SuperConstraint;", "component", "visit", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "setNewConstraint", "visitImpl", "essential" })
abstract class FontProviderDelegate implements FontProvider
{
    private final /* synthetic */ FontProvider $$delegate_0;
    
    public FontProviderDelegate(@NotNull final FontProvider delegate) {
        Intrinsics.checkNotNullParameter((Object)delegate, "delegate");
        super();
        this.$$delegate_0 = delegate;
    }
    
    @NotNull
    @Override
    public FontProvider getCachedValue() {
        return this.$$delegate_0.getCachedValue();
    }
    
    @Override
    public void setCachedValue(@NotNull final FontProvider <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.$$delegate_0.setCachedValue(<set-?>);
    }
    
    @Nullable
    @Override
    public UIComponent getConstrainTo() {
        return this.$$delegate_0.getConstrainTo();
    }
    
    @Override
    public void setConstrainTo(@Nullable final UIComponent <set-?>) {
        this.$$delegate_0.setConstrainTo(<set-?>);
    }
    
    @Override
    public boolean getRecalculate() {
        return this.$$delegate_0.getRecalculate();
    }
    
    @Override
    public void setRecalculate(final boolean <set-?>) {
        this.$$delegate_0.setRecalculate(<set-?>);
    }
    
    @Override
    public void animationFrame() {
        this.$$delegate_0.animationFrame();
    }
    
    @Override
    public void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.$$delegate_0.drawString(matrixStack, string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    @Deprecated(message = """
                          For 1.17 this method requires you pass a UMatrixStack as the first argument.
                          
                          If you are currently extending this method, you should instead extend the method with the added argument.
                          Note however for this to be non-breaking, your parent class needs to transition before you do.
                          
                          If you are calling this method and you cannot guarantee that your target class has been fully updated (such as when
                          calling an open method on an open class), you should instead call the method with the "Compat" suffix, which will
                          call both methods, the new and the deprecated one.
                          If you are sure that your target class has been updated (such as when calling the super method), you should
                          (for super calls you must!) instead just call the method with the original name and added argument.""", replaceWith = @ReplaceWith(expression = "drawString(matrixStack, string, color, x, y, originalPointSize, scale, shadow, shadowColor)", imports = {}))
    @Override
    @java.lang.Deprecated
    public void drawString(@NotNull final String string, @NotNull final Color color, final float x, final float y, final float originalPointSize, final float scale, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.$$delegate_0.drawString(string, color, x, y, originalPointSize, scale, shadow, shadowColor);
    }
    
    @Override
    public float getBaseLineHeight() {
        return this.$$delegate_0.getBaseLineHeight();
    }
    
    @Override
    public float getBelowLineHeight() {
        return this.$$delegate_0.getBelowLineHeight();
    }
    
    @Override
    public float getShadowHeight() {
        return this.$$delegate_0.getShadowHeight();
    }
    
    @Override
    public float getStringHeight(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return this.$$delegate_0.getStringHeight(string, pointSize);
    }
    
    @Override
    public float getStringWidth(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return this.$$delegate_0.getStringWidth(string, pointSize);
    }
    
    @Override
    public void pauseIfSupported() {
        this.$$delegate_0.pauseIfSupported();
    }
    
    @Override
    public void resumeIfSupported() {
        this.$$delegate_0.resumeIfSupported();
    }
    
    @Override
    public void stopIfSupported() {
        this.$$delegate_0.stopIfSupported();
    }
    
    @NotNull
    @Override
    public SuperConstraint<FontProvider> to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.$$delegate_0.to(component);
    }
    
    @Override
    public void visit(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type, final boolean setNewConstraint) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.$$delegate_0.visit(visitor, type, setNewConstraint);
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.$$delegate_0.visitImpl(visitor, type);
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
