package gg.essential.elementa.constraints.animation;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0018\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016R\u001a\u0010\f\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*" }, d2 = { "Lgg/essential/elementa/constraints/animation/RadiusAnimationComponent;", "Lgg/essential/elementa/constraints/animation/AnimationComponent;", "", "Lgg/essential/elementa/constraints/RadiusConstraint;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "totalFrames", "", "oldConstraint", "newConstraint", "delay", "(Lgg/essential/elementa/constraints/animation/AnimationStrategy;ILgg/essential/elementa/constraints/RadiusConstraint;Lgg/essential/elementa/constraints/RadiusConstraint;I)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getNewConstraint", "()Lgg/essential/elementa/constraints/RadiusConstraint;", "getOldConstraint", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "getRadiusImpl", "component", "to", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class RadiusAnimationComponent extends AnimationComponent<Float> implements RadiusConstraint
{
    @NotNull
    private final RadiusConstraint oldConstraint;
    @NotNull
    private final RadiusConstraint newConstraint;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public RadiusAnimationComponent(@NotNull final AnimationStrategy strategy, final int totalFrames, @NotNull final RadiusConstraint oldConstraint, @NotNull final RadiusConstraint newConstraint, final int delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)oldConstraint, "oldConstraint");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        super(strategy, totalFrames, delay, null);
        this.oldConstraint = oldConstraint;
        this.newConstraint = newConstraint;
        this.recalculate = true;
    }
    
    @NotNull
    public final RadiusConstraint getOldConstraint() {
        return this.oldConstraint;
    }
    
    @NotNull
    public final RadiusConstraint getNewConstraint() {
        return this.newConstraint;
    }
    
    @NotNull
    @Override
    public Float getCachedValue() {
        return this.cachedValue;
    }
    
    public void setCachedValue(final float <set-?>) {
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
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float startX = this.oldConstraint.getRadius(component);
        final float finalX = this.newConstraint.getRadius(component);
        return startX + (finalX - startX) * this.getPercentComplete();
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        this.oldConstraint.animationFrame();
        this.newConstraint.animationFrame();
    }
    
    @NotNull
    @Override
    public RadiusAnimationComponent to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final RadiusAnimationComponent $this$to_u24lambda_u2d0 = this;
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
        this.setCachedValue(((Number)<set-?>).floatValue());
    }
    
    @Override
    public /* bridge */ SuperConstraint to(final UIComponent component) {
        return this.to(component);
    }
}
