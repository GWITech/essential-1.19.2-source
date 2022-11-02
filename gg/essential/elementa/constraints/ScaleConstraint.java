package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0016J\u0014\u0010#\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016R\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061" }, d2 = { "Lgg/essential/elementa/constraints/ScaleConstraint;", "Lgg/essential/elementa/constraints/MasterConstraint;", "constraint", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "value", "(Lgg/essential/elementa/constraints/SuperConstraint;F)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/state/State;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getConstraint", "()Lgg/essential/elementa/constraints/SuperConstraint;", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getValue", "()F", "setValue", "valueState", "Lgg/essential/elementa/state/MappedState;", "animationFrame", "", "bindValue", "newState", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "to", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ScaleConstraint implements MasterConstraint
{
    @NotNull
    private final SuperConstraint<Float> constraint;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private final MappedState<Float, Float> valueState;
    
    public ScaleConstraint(@NotNull final SuperConstraint<Float> constraint, @NotNull final State<Float> value) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super();
        this.constraint = constraint;
        this.recalculate = true;
        this.valueState = value.map((kotlin.jvm.functions.Function1<? super Float, ? extends Float>)ScaleConstraint$valueState.ScaleConstraint$valueState$1.INSTANCE);
    }
    
    @NotNull
    public final SuperConstraint<Float> getConstraint() {
        return this.constraint;
    }
    
    public ScaleConstraint(@NotNull final SuperConstraint<Float> constraint, final float value) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        this(constraint, new BasicState<Float>(value));
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
    
    public final float getValue() {
        return this.valueState.get().floatValue();
    }
    
    public final void setValue(final float value) {
        this.valueState.set(Float.valueOf(value));
    }
    
    @NotNull
    public final ScaleConstraint bindValue(@NotNull final State<Float> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final ScaleConstraint $this$bindValue_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindValue_u24lambda_u2d0.valueState.rebind(newState);
        return this;
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        this.constraint.animationFrame();
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((XConstraint)this.constraint).getXPosition(component) * this.valueState.get().floatValue();
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((YConstraint)this.constraint).getYPosition(component) * this.valueState.get().floatValue();
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((WidthConstraint)this.constraint).getWidth(component) * this.valueState.get().floatValue();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((HeightConstraint)this.constraint).getHeight(component) * this.valueState.get().floatValue();
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((RadiusConstraint)this.constraint).getRadius(component) * this.valueState.get().floatValue();
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
        this.constraint.visit(visitor, type, false);
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
