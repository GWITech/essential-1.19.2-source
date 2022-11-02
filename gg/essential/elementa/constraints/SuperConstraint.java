package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0016J\"\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u000fH\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH&R\u0018\u0010\u0003\u001a\u00028\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\"\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/SuperConstraint;", "T", "", "cachedValue", "getCachedValue", "()Ljava/lang/Object;", "setCachedValue", "(Ljava/lang/Object;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "animationFrame", "", "pauseIfSupported", "resumeIfSupported", "stopIfSupported", "to", "component", "visit", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "setNewConstraint", "visitImpl", "Elementa" })
public interface SuperConstraint<T>
{
    T getCachedValue();
    
    void setCachedValue(final T p0);
    
    boolean getRecalculate();
    
    void setRecalculate(final boolean p0);
    
    @Nullable
    UIComponent getConstrainTo();
    
    void setConstrainTo(@Nullable final UIComponent p0);
    
    default void animationFrame() {
        this.setRecalculate(true);
    }
    
    @NotNull
    default SuperConstraint<T> to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final SuperConstraint $this$to_u24lambda_u2d0 = this;
        final int n = 0;
        $this$to_u24lambda_u2d0.setConstrainTo(component);
        return this;
    }
    
    default void pauseIfSupported() {
        final AnimationComponent animationComponent = (this instanceof AnimationComponent) ? ((AnimationComponent)this) : null;
        if (animationComponent != null) {
            animationComponent.pause();
        }
    }
    
    default void resumeIfSupported() {
        final AnimationComponent animationComponent = (this instanceof AnimationComponent) ? ((AnimationComponent)this) : null;
        if (animationComponent != null) {
            animationComponent.resume();
        }
    }
    
    default void stopIfSupported() {
        final AnimationComponent animationComponent = (this instanceof AnimationComponent) ? ((AnimationComponent)this) : null;
        if (animationComponent != null) {
            animationComponent.stop();
        }
    }
    
    default void visit(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type, final boolean setNewConstraint) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        if (this.getConstrainTo() != null) {
            return;
        }
        if (setNewConstraint) {
            visitor.setConstraint(this, type);
        }
        this.visitImpl(visitor, type);
    }
    
    default /* synthetic */ void visit$default(final SuperConstraint superConstraint, final ConstraintVisitor visitor, final ConstraintType type, boolean setNewConstraint, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: visit");
        }
        if ((n & 0x4) != 0x0) {
            setNewConstraint = true;
        }
        superConstraint.visit(visitor, type, setNewConstraint);
    }
    
    void visitImpl(@NotNull final ConstraintVisitor p0, @NotNull final ConstraintType p1);
    
    default /* synthetic */ void access$animationFrame$jd(final SuperConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final SuperConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final SuperConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final SuperConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final SuperConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final SuperConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
}
