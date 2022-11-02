package gg.essential.elementa.transitions;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH$J\"\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011H\u0007J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lgg/essential/elementa/transitions/Transition;", "", "()V", "parallelTransitions", "", "sequenceTransition", "afterTransition", "", "component", "Lgg/essential/elementa/UIComponent;", "beforeTransition", "chain", "transition", "doTransition", "constraints", "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "callback", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "with", "Elementa" })
public abstract class Transition
{
    @NotNull
    private final List<Transition> parallelTransitions;
    @Nullable
    private Transition sequenceTransition;
    
    public Transition() {
        super();
        this.parallelTransitions = new ArrayList<Transition>();
    }
    
    @NotNull
    public final Transition chain(@NotNull final Transition transition) {
        Intrinsics.checkNotNullParameter((Object)transition, "transition");
        final Transition $this$chain_u24lambda_u2d0 = this;
        final int n = 0;
        if ($this$chain_u24lambda_u2d0.sequenceTransition != null) {
            throw new IllegalStateException("Cannot chain multiple transitions");
        }
        $this$chain_u24lambda_u2d0.sequenceTransition = transition;
        return this;
    }
    
    @NotNull
    public final Transition with(@NotNull final Transition transition) {
        Intrinsics.checkNotNullParameter((Object)transition, "transition");
        final Transition $this$with_u24lambda_u2d1 = this;
        final int n = 0;
        $this$with_u24lambda_u2d1.parallelTransitions.add(transition);
        return this;
    }
    
    @JvmOverloads
    public final void transition(@NotNull final UIComponent component, @Nullable final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.beforeTransition(component);
        final Iterable $this$forEach$iv = this.parallelTransitions;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Transition it = (Transition)element$iv;
            final int n = 0;
            it.beforeTransition(component);
        }
        final UIComponent $this$animate$iv = component;
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n2 = 0;
        final AnimatingConstraints $this$transition_u24lambda_u2d4;
        final AnimatingConstraints anim$iv = $this$transition_u24lambda_u2d4 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n3 = 0;
        this.doTransition(component, $this$transition_u24lambda_u2d4);
        final Iterable $this$forEach$iv2 = this.parallelTransitions;
        final int $i$f$forEach2 = 0;
        for (final Object element$iv2 : $this$forEach$iv2) {
            final Transition transition = (Transition)element$iv2;
            final int n4 = 0;
            transition.doTransition(component, $this$transition_u24lambda_u2d4);
        }
        $this$transition_u24lambda_u2d4.onComplete((Function0<Unit>)new Transition$transition$2.Transition$transition$2$2(this, component, (Function0)callback));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    public static /* synthetic */ void transition$default(final Transition transition, final UIComponent component, Function0 callback, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transition");
        }
        if ((n & 0x2) != 0x0) {
            callback = null;
        }
        transition.transition(component, (Function0<Unit>)callback);
    }
    
    public final void transition(@NotNull final UIComponent component, @NotNull final Runnable callback) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        this.transition(component, (Function0<Unit>)new Transition$transition.Transition$transition$3(callback));
    }
    
    protected void beforeTransition(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
    }
    
    protected abstract void doTransition(@NotNull final UIComponent p0, @NotNull final AnimatingConstraints p1);
    
    protected void afterTransition(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
    }
    
    @JvmOverloads
    public final void transition(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        transition$default(this, component, null, 2, null);
    }
    
    public static final /* synthetic */ List access$getParallelTransitions$p(final Transition $this) {
        return $this.parallelTransitions;
    }
    
    public static final /* synthetic */ Transition access$getSequenceTransition$p(final Transition $this) {
        return $this.sequenceTransition;
    }
}
