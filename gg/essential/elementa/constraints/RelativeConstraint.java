package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016R\u001a\u0010\b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0005R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+" }, d2 = { "Lgg/essential/elementa/constraints/RelativeConstraint;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "value", "", "(F)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getValue", "()F", "setValue", "valueState", "Lgg/essential/elementa/state/MappedState;", "bindValue", "newState", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class RelativeConstraint implements PositionConstraint, SizeConstraint
{
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private final MappedState<Float, Float> valueState;
    
    public RelativeConstraint(@NotNull final State<Float> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super();
        this.recalculate = true;
        this.valueState = value.map((kotlin.jvm.functions.Function1<? super Float, ? extends Float>)RelativeConstraint$valueState.RelativeConstraint$valueState$1.INSTANCE);
    }
    
    @JvmOverloads
    public RelativeConstraint(final float value) {
        this(new BasicState<Float>(value));
    }
    
    public RelativeConstraint(float value, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            value = 1.0f;
        }
        this(value);
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
    public final RelativeConstraint bindValue(@NotNull final State<Float> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final RelativeConstraint $this$bindValue_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindValue_u24lambda_u2d0.valueState.rebind(newState);
        return this;
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getLeft() + this.getWidth(component);
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getTop() + this.getHeight(component);
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getWidth() * this.valueState.get().floatValue();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getHeight() * this.valueState.get().floatValue();
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getWidth() * this.valueState.get().floatValue() / 2.0f;
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (RelativeConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitParent(ConstraintType.X);
                visitor.visitParent(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitParent(ConstraintType.Y);
                visitor.visitParent(ConstraintType.HEIGHT);
                break;
            }
            case 3: {
                visitor.visitParent(ConstraintType.WIDTH);
                break;
            }
            case 4: {
                visitor.visitParent(ConstraintType.HEIGHT);
                break;
            }
            case 5: {
                visitor.visitParent(ConstraintType.WIDTH);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @JvmOverloads
    public RelativeConstraint() {
        this(0.0f, 1, null);
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
