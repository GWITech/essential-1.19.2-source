package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B5\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\tJ\u0014\u0010%\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0014\u0010'\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0014\u0010(\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065" }, d2 = { "Lgg/essential/elementa/constraints/PixelConstraint;", "Lgg/essential/elementa/constraints/MasterConstraint;", "value", "", "alignOpposite", "", "alignOutside", "(FZZ)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "getAlignOpposite", "()Z", "setAlignOpposite", "(Z)V", "alignOppositeState", "Lgg/essential/elementa/state/MappedState;", "getAlignOutside", "setAlignOutside", "alignOutsideState", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "getRecalculate", "setRecalculate", "getValue", "()F", "setValue", "valueState", "bindAlignOpposite", "newState", "bindAlignOutside", "bindValue", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class PixelConstraint implements MasterConstraint
{
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private final MappedState<Float, Float> valueState;
    @NotNull
    private final MappedState<Boolean, Boolean> alignOppositeState;
    @NotNull
    private final MappedState<Boolean, Boolean> alignOutsideState;
    
    @JvmOverloads
    public PixelConstraint(@NotNull final State<Float> value, @NotNull final State<Boolean> alignOpposite, @NotNull final State<Boolean> alignOutside) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Intrinsics.checkNotNullParameter((Object)alignOpposite, "alignOpposite");
        Intrinsics.checkNotNullParameter((Object)alignOutside, "alignOutside");
        super();
        this.recalculate = true;
        this.valueState = value.map((kotlin.jvm.functions.Function1<? super Float, ? extends Float>)PixelConstraint$valueState.PixelConstraint$valueState$1.INSTANCE);
        this.alignOppositeState = alignOpposite.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)PixelConstraint$alignOppositeState.PixelConstraint$alignOppositeState$1.INSTANCE);
        this.alignOutsideState = alignOutside.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)PixelConstraint$alignOutsideState.PixelConstraint$alignOutsideState$1.INSTANCE);
    }
    
    public PixelConstraint(final State value, State alignOpposite, State alignOutside, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            alignOpposite = new BasicState(false);
        }
        if ((n & 0x4) != 0x0) {
            alignOutside = new BasicState(false);
        }
        this(value, alignOpposite, alignOutside);
    }
    
    @JvmOverloads
    public PixelConstraint(final float value, final boolean alignOpposite, final boolean alignOutside) {
        this(new BasicState<Float>(value), new BasicState<Boolean>(alignOpposite), new BasicState<Boolean>(alignOutside));
    }
    
    public PixelConstraint(final float value, boolean alignOpposite, boolean alignOutside, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            alignOpposite = false;
        }
        if ((n & 0x4) != 0x0) {
            alignOutside = false;
        }
        this(value, alignOpposite, alignOutside);
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
    
    public final boolean getAlignOpposite() {
        return this.alignOppositeState.get();
    }
    
    public final void setAlignOpposite(final boolean value) {
        this.alignOppositeState.set(Boolean.valueOf(value));
    }
    
    public final boolean getAlignOutside() {
        return this.alignOutsideState.get();
    }
    
    public final void setAlignOutside(final boolean value) {
        this.alignOutsideState.set(Boolean.valueOf(value));
    }
    
    @NotNull
    public final PixelConstraint bindValue(@NotNull final State<Float> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final PixelConstraint $this$bindValue_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindValue_u24lambda_u2d0.valueState.rebind(newState);
        return this;
    }
    
    @NotNull
    public final PixelConstraint bindAlignOpposite(@NotNull final State<Boolean> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final PixelConstraint $this$bindAlignOpposite_u24lambda_u2d1 = this;
        final int n = 0;
        $this$bindAlignOpposite_u24lambda_u2d1.alignOppositeState.rebind(newState);
        return this;
    }
    
    @NotNull
    public final PixelConstraint bindAlignOutside(@NotNull final State<Boolean> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final PixelConstraint $this$bindAlignOutside_u24lambda_u2d2 = this;
        final int n = 0;
        $this$bindAlignOutside_u24lambda_u2d2.alignOutsideState.rebind(newState);
        return this;
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        final UIComponent target = uiComponent;
        final float value = this.valueState.get().floatValue();
        return this.alignOppositeState.get() ? (this.alignOutsideState.get() ? (target.getRight() + value) : (target.getRight() - value - component.getWidth())) : (this.alignOutsideState.get() ? (target.getLeft() - component.getWidth() - value) : (target.getLeft() + value));
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        final UIComponent target = uiComponent;
        final float value = this.valueState.get().floatValue();
        return this.alignOppositeState.get() ? (this.alignOutsideState.get() ? (target.getBottom() + value) : (target.getBottom() - value - component.getHeight())) : (this.alignOutsideState.get() ? (target.getTop() - component.getHeight() - value) : (target.getTop() + value));
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.valueState.get().floatValue();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.valueState.get().floatValue();
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.valueState.get().floatValue();
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (PixelConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                if (this.alignOppositeState.get()) {
                    visitor.visitParent(ConstraintType.X);
                    visitor.visitParent(ConstraintType.WIDTH);
                    if (this.alignOutsideState.get()) {
                        visitor.visitSelf(ConstraintType.WIDTH);
                        break;
                    }
                    break;
                }
                else {
                    visitor.visitParent(ConstraintType.X);
                    if (this.alignOutsideState.get()) {
                        visitor.visitSelf(ConstraintType.WIDTH);
                        break;
                    }
                    break;
                }
                break;
            }
            case 2: {
                if (this.alignOppositeState.get()) {
                    visitor.visitParent(ConstraintType.Y);
                    visitor.visitParent(ConstraintType.HEIGHT);
                    if (this.alignOutsideState.get()) {
                        visitor.visitSelf(ConstraintType.HEIGHT);
                        break;
                    }
                    break;
                }
                else {
                    visitor.visitParent(ConstraintType.Y);
                    if (this.alignOutsideState.get()) {
                        visitor.visitSelf(ConstraintType.HEIGHT);
                        break;
                    }
                    break;
                }
                break;
            }
            case 3:
            case 4:
            case 5:
            case 6: {
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @JvmOverloads
    public PixelConstraint(@NotNull final State<Float> value, @NotNull final State<Boolean> alignOpposite) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Intrinsics.checkNotNullParameter((Object)alignOpposite, "alignOpposite");
        this(value, alignOpposite, null, 4, null);
    }
    
    @JvmOverloads
    public PixelConstraint(@NotNull final State<Float> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this(value, null, null, 6, null);
    }
    
    @JvmOverloads
    public PixelConstraint(final float value, final boolean alignOpposite) {
        this(value, alignOpposite, false, 4, null);
    }
    
    @JvmOverloads
    public PixelConstraint(final float value) {
        this(value, false, false, 6, null);
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
