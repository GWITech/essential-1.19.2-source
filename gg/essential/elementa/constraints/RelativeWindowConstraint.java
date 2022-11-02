package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'" }, d2 = { "Lgg/essential/elementa/constraints/RelativeWindowConstraint;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "value", "", "(F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getValue", "()F", "ensureConstrainedToWindow", "", "component", "getHeightImpl", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "to", "Lgg/essential/elementa/constraints/SuperConstraint;", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class RelativeWindowConstraint implements PositionConstraint, SizeConstraint
{
    private final float value;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    @JvmOverloads
    public RelativeWindowConstraint(final float value) {
        super();
        this.value = value;
        this.recalculate = true;
    }
    
    public RelativeWindowConstraint(float value, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            value = 1.0f;
        }
        this(value);
    }
    
    public final float getValue() {
        return this.value;
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
        this.ensureConstrainedToWindow(component);
        final UIComponent constrainTo = this.getConstrainTo();
        Intrinsics.checkNotNull((Object)constrainTo);
        return constrainTo.getLeft() + this.getWidth(component);
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.ensureConstrainedToWindow(component);
        final UIComponent constrainTo = this.getConstrainTo();
        Intrinsics.checkNotNull((Object)constrainTo);
        return constrainTo.getTop() + this.getHeight(component);
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.ensureConstrainedToWindow(component);
        final UIComponent constrainTo = this.getConstrainTo();
        Intrinsics.checkNotNull((Object)constrainTo);
        return constrainTo.getWidth() * this.value;
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.ensureConstrainedToWindow(component);
        final UIComponent constrainTo = this.getConstrainTo();
        Intrinsics.checkNotNull((Object)constrainTo);
        return constrainTo.getHeight() * this.value;
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.ensureConstrainedToWindow(component);
        final UIComponent constrainTo = this.getConstrainTo();
        Intrinsics.checkNotNull((Object)constrainTo);
        return constrainTo.getWidth() * this.value / 2.0f;
    }
    
    @NotNull
    @Override
    public SuperConstraint<Float> to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        throw new IllegalStateException("RelativeWindowConstraint cannot be bound to components");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    private final void ensureConstrainedToWindow(final UIComponent component) {
        if (this.getConstrainTo() == null) {
            this.setConstrainTo(Window.Companion.of(component));
        }
    }
    
    @JvmOverloads
    public RelativeWindowConstraint() {
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
