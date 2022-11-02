package gg.essential.elementa.constraints.animation;

import java.awt.*;
import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.math.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016R\"\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+" }, d2 = { "Lgg/essential/elementa/constraints/animation/ColorAnimationComponent;", "Lgg/essential/elementa/constraints/animation/AnimationComponent;", "Ljava/awt/Color;", "Lgg/essential/elementa/constraints/ColorConstraint;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "totalFrames", "", "oldConstraint", "newConstraint", "delay", "(Lgg/essential/elementa/constraints/animation/AnimationStrategy;ILgg/essential/elementa/constraints/ColorConstraint;Lgg/essential/elementa/constraints/ColorConstraint;I)V", "cachedValue", "kotlin.jvm.PlatformType", "getCachedValue", "()Ljava/awt/Color;", "setCachedValue", "(Ljava/awt/Color;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getNewConstraint", "()Lgg/essential/elementa/constraints/ColorConstraint;", "getOldConstraint", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "getColorImpl", "component", "to", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ColorAnimationComponent extends AnimationComponent<Color> implements ColorConstraint
{
    @NotNull
    private final ColorConstraint oldConstraint;
    @NotNull
    private final ColorConstraint newConstraint;
    private Color cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public ColorAnimationComponent(@NotNull final AnimationStrategy strategy, final int totalFrames, @NotNull final ColorConstraint oldConstraint, @NotNull final ColorConstraint newConstraint, final int delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)oldConstraint, "oldConstraint");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        super(strategy, totalFrames, delay, null);
        this.oldConstraint = oldConstraint;
        this.newConstraint = newConstraint;
        this.cachedValue = Color.WHITE;
        this.recalculate = true;
    }
    
    @NotNull
    public final ColorConstraint getOldConstraint() {
        return this.oldConstraint;
    }
    
    @NotNull
    public final ColorConstraint getNewConstraint() {
        return this.newConstraint;
    }
    
    @Override
    public Color getCachedValue() {
        return this.cachedValue;
    }
    
    @Override
    public void setCachedValue(final Color <set-?>) {
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
    
    @NotNull
    @Override
    public Color getColorImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final Color startColor = this.oldConstraint.getColor(component);
        final Color endColor = this.newConstraint.getColor(component);
        final float percentComplete = this.getPercentComplete();
        final float newR = startColor.getRed() + (endColor.getRed() - startColor.getRed()) * percentComplete;
        final float newG = startColor.getGreen() + (endColor.getGreen() - startColor.getGreen()) * percentComplete;
        final float newB = startColor.getBlue() + (endColor.getBlue() - startColor.getBlue()) * percentComplete;
        final float newA = startColor.getAlpha() + (endColor.getAlpha() - startColor.getAlpha()) * percentComplete;
        return new Color(MathKt.roundToInt(newR), MathKt.roundToInt(newG), MathKt.roundToInt(newB), MathKt.roundToInt(newA));
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        this.oldConstraint.animationFrame();
        this.newConstraint.animationFrame();
    }
    
    @NotNull
    @Override
    public ColorAnimationComponent to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ColorAnimationComponent $this$to_u24lambda_u2d0 = this;
        final int n = 0;
        throw new UnsupportedOperationException("Constraint.to(UIComponent) is not available in this context!");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.oldConstraint.visit(visitor, type, false);
        this.newConstraint.visit(visitor, type, false);
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue((Color)<set-?>);
    }
    
    @Override
    public /* bridge */ SuperConstraint to(final UIComponent component) {
        return this.to(component);
    }
}
