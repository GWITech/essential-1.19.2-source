package gg.essential.gui.common.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017¨\u0006&""" }, d2 = { "Lgg/essential/gui/common/constraints/MultiplicativeConstraint;", "Lgg/essential/elementa/constraints/MasterConstraint;", "constraint1", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "constraint2", "(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "to", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class MultiplicativeConstraint implements MasterConstraint
{
    @NotNull
    private final SuperConstraint<Float> constraint1;
    @NotNull
    private final SuperConstraint<Float> constraint2;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public MultiplicativeConstraint(@NotNull final SuperConstraint<Float> constraint1, @NotNull final SuperConstraint<Float> constraint2) {
        Intrinsics.checkNotNullParameter((Object)constraint1, "constraint1");
        Intrinsics.checkNotNullParameter((Object)constraint2, "constraint2");
        super();
        this.constraint1 = constraint1;
        this.constraint2 = constraint2;
        this.recalculate = true;
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
        final float base = component.getParent().getLeft();
        final float value1 = ((XConstraint)this.constraint1).getXPosition(component);
        final float value2 = ((XConstraint)this.constraint2).getXPosition(component);
        return (value1 - base) * (value2 - base) + base;
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float base = component.getParent().getTop();
        final float value1 = ((YConstraint)this.constraint1).getYPosition(component);
        final float value2 = ((YConstraint)this.constraint2).getYPosition(component);
        return (value1 - base) * (value2 - base) + base;
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((WidthConstraint)this.constraint1).getWidth(component) * ((WidthConstraint)this.constraint2).getWidth(component);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((HeightConstraint)this.constraint1).getHeight(component) * ((HeightConstraint)this.constraint2).getHeight(component);
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((RadiusConstraint)this.constraint1).getRadius(component) * ((RadiusConstraint)this.constraint2).getRadius(component);
    }
    
    @NotNull
    @Override
    public SuperConstraint<Float> to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
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
}
