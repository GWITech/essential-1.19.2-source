package gg.essential.gui.screenshot.constraints;

import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001b2\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020"H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017¨\u0006#""" }, d2 = { "Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "aspect", "Lgg/essential/elementa/state/State;", "", "(Lgg/essential/elementa/state/State;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getSize", "Lkotlin/Pair;", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class AspectPreservingFillConstraint implements HeightConstraint, WidthConstraint
{
    @NotNull
    private final State<Float> aspect;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public AspectPreservingFillConstraint(@NotNull final State<Float> aspect) {
        Intrinsics.checkNotNullParameter((Object)aspect, "aspect");
        super();
        this.aspect = aspect;
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
    
    private final Pair<Float, Float> getSize(final UIComponent component) {
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        final UIComponent target = uiComponent;
        final float inverseAspectRatio = 1.0f / this.aspect.get().floatValue();
        final float containerWidth = target.getWidth();
        final float containerHeight = target.getHeight();
        float proposedWidth = containerWidth;
        float proposedHeight = proposedWidth * inverseAspectRatio;
        if (proposedHeight > containerHeight) {
            proposedHeight = containerHeight;
            proposedWidth = containerHeight / inverseAspectRatio;
        }
        return (Pair<Float, Float>)TuplesKt.to((Object)proposedWidth, (Object)proposedHeight);
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((Number)this.getSize(component).getFirst()).floatValue();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((Number)this.getSize(component).getSecond()).floatValue();
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
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
