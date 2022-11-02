package gg.essential.elementa.constraints;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"" }, d2 = { "Lgg/essential/elementa/constraints/CopyConstraintFloat;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "textScale", "", "(Z)V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "getRecalculate", "()Z", "setRecalculate", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class CopyConstraintFloat implements PositionConstraint, SizeConstraint
{
    private final boolean textScale;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public CopyConstraintFloat(final boolean textScale) {
        super();
        this.textScale = textScale;
        this.recalculate = true;
    }
    
    public CopyConstraintFloat(boolean textScale, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            textScale = false;
        }
        this(textScale);
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
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        Float n;
        if (constrainTo == null) {
            n = null;
        }
        else {
            final UIConstraints constraints = constrainTo.getConstraints();
            n = ((constraints == null) ? null : Float.valueOf(constraints.getX()));
        }
        final Float n2 = n;
        if (n2 == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        return n2;
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        Float n;
        if (constrainTo == null) {
            n = null;
        }
        else {
            final UIConstraints constraints = constrainTo.getConstraints();
            n = ((constraints == null) ? null : Float.valueOf(constraints.getY()));
        }
        final Float n2 = n;
        if (n2 == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        return n2;
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        Float n;
        if (constrainTo == null) {
            n = null;
        }
        else {
            final UIConstraints constraints = constrainTo.getConstraints();
            n = ((constraints == null) ? null : Float.valueOf(constraints.getWidth()));
        }
        final Float n2 = n;
        if (n2 == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        return n2;
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final UIComponent constrainTo = this.getConstrainTo();
        if (constrainTo == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        final UIComponent to = constrainTo;
        switch (CopyConstraintFloat.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                to.getConstraints().getX().visitImpl(visitor, type);
                break;
            }
            case 2: {
                to.getConstraints().getY().visitImpl(visitor, type);
                break;
            }
            case 3: {
                to.getConstraints().getWidth().visitImpl(visitor, type);
                break;
            }
            case 4: {
                to.getConstraints().getHeight().visitImpl(visitor, type);
                break;
            }
            case 5: {
                to.getConstraints().getRadius().visitImpl(visitor, type);
                break;
            }
            case 6: {
                to.getConstraints().getTextScale().visitImpl(visitor, type);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        float n3;
        if (this.textScale) {
            final UIComponent constrainTo = this.getConstrainTo();
            Float n;
            if (constrainTo == null) {
                n = null;
            }
            else {
                final UIConstraints constraints = constrainTo.getConstraints();
                n = ((constraints == null) ? null : Float.valueOf(constraints.getTextScale()));
            }
            final Float n2 = n;
            if (n2 == null) {
                throw new IllegalStateException("CopyConstraint must be applied to another component.");
            }
            n3 = n2;
        }
        else {
            final UIComponent constrainTo2 = this.getConstrainTo();
            Float n4;
            if (constrainTo2 == null) {
                n4 = null;
            }
            else {
                final UIConstraints constraints2 = constrainTo2.getConstraints();
                n4 = ((constraints2 == null) ? null : Float.valueOf(constraints2.getHeight()));
            }
            final Float n5 = n4;
            if (n5 == null) {
                throw new IllegalStateException("CopyConstraint must be applied to another component.");
            }
            n3 = n5;
        }
        return n3;
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        Float n;
        if (constrainTo == null) {
            n = null;
        }
        else {
            final UIConstraints constraints = constrainTo.getConstraints();
            n = ((constraints == null) ? null : Float.valueOf(constraints.getRadius()));
        }
        final Float n2 = n;
        if (n2 == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        return n2;
    }
    
    public CopyConstraintFloat() {
        this(false, 1, null);
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
