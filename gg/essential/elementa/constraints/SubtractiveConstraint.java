package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a?\u0006)" }, d2 = { "Lgg/essential/elementa/constraints/SubtractiveConstraint;", "Lgg/essential/elementa/constraints/MasterConstraint;", "constraint1", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "constraint2", "(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getConstraint1", "()Lgg/essential/elementa/constraints/SuperConstraint;", "getConstraint2", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "to", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class SubtractiveConstraint implements MasterConstraint
{
    @NotNull
    private final SuperConstraint<Float> constraint1;
    @NotNull
    private final SuperConstraint<Float> constraint2;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public SubtractiveConstraint(@NotNull final SuperConstraint<Float> constraint1, @NotNull final SuperConstraint<Float> constraint2) {
        Intrinsics.checkNotNullParameter((Object)constraint1, "constraint1");
        Intrinsics.checkNotNullParameter((Object)constraint2, "constraint2");
        super();
        this.constraint1 = constraint1;
        this.constraint2 = constraint2;
        this.recalculate = true;
    }
    
    @NotNull
    public final SuperConstraint<Float> getConstraint1() {
        return this.constraint1;
    }
    
    @NotNull
    public final SuperConstraint<Float> getConstraint2() {
        return this.constraint2;
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
    public void animationFrame() {
        super.animationFrame();
        this.constraint1.animationFrame();
        this.constraint2.animationFrame();
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float n = ((XConstraint)this.constraint1).getXPosition(component) - ((XConstraint)this.constraint2).getXPosition(component);
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return n + uiComponent.getLeft();
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float n = ((YConstraint)this.constraint1).getYPosition(component) - ((YConstraint)this.constraint2).getYPosition(component);
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return n + uiComponent.getTop();
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((WidthConstraint)this.constraint1).getWidth(component) - ((WidthConstraint)this.constraint2).getWidth(component);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((HeightConstraint)this.constraint1).getHeightImpl(component) - ((HeightConstraint)this.constraint2).getHeightImpl(component);
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((RadiusConstraint)this.constraint1).getRadiusImpl(component) - ((RadiusConstraint)this.constraint2).getRadiusImpl(component);
    }
    
    @NotNull
    @Override
    public SubtractiveConstraint to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final SubtractiveConstraint $this$to_u24lambda_u2d0 = this;
        final int n = 0;
        throw new UnsupportedOperationException("Constraint.to(UIComponent) is not available in this context, please apply this to the components beforehand.");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.constraint1.visit(visitor, type, false);
        this.constraint2.visit(visitor, type, false);
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
