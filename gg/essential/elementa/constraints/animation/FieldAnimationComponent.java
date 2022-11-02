package gg.essential.elementa.constraints.animation;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0005%&'()¨\u0006*" }, d2 = { "Lgg/essential/elementa/constraints/animation/FieldAnimationComponent;", "T", "Lgg/essential/elementa/constraints/animation/AnimationComponent;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "totalFrames", "", "delay", "(Lgg/essential/elementa/constraints/animation/AnimationStrategy;II)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "field", "Lkotlin/reflect/KMutableProperty0;", "getField", "()Lkotlin/reflect/KMutableProperty0;", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "setValue", "percentComplete", "", "to", "component", "visitImpl", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Lgg/essential/elementa/constraints/animation/FloatFieldAnimationComponent;", "Lgg/essential/elementa/constraints/animation/DoubleFieldAnimationComponent;", "Lgg/essential/elementa/constraints/animation/IntFieldAnimationComponent;", "Lgg/essential/elementa/constraints/animation/LongFieldAnimationComponent;", "Lgg/essential/elementa/constraints/animation/ColorFieldAnimationComponent;", "Elementa" })
public abstract class FieldAnimationComponent<T> extends AnimationComponent<T>
{
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    private FieldAnimationComponent(final AnimationStrategy strategy, final int totalFrames, final int delay) {
        super(strategy, totalFrames, delay, null);
        this.recalculate = true;
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
    public abstract KMutableProperty0<?> getField();
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        if (!this.isComplete()) {
            this.setValue(this.getPercentComplete());
        }
    }
    
    public abstract void setValue(final float p0);
    
    @NotNull
    @Override
    public FieldAnimationComponent<T> to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final FieldAnimationComponent $this$to_u24lambda_u2d0 = this;
        final int n = 0;
        throw new UnsupportedOperationException("Constraint.to(UIComponent) is not available in this context!");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    @Override
    public /* bridge */ SuperConstraint to(final UIComponent component) {
        return this.to(component);
    }
    
    public FieldAnimationComponent(final AnimationStrategy strategy, final int totalFrames, final int delay, final DefaultConstructorMarker $constructor_marker) {
        this(strategy, totalFrames, delay);
    }
}
