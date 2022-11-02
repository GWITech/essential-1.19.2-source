package gg.essential.elementa.effects;

import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import kotlin.*;
import java.util.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.math.*;
import kotlin.ranges.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lgg/essential/elementa/effects/RecursiveFadeEffect;", "Lgg/essential/elementa/effects/Effect;", "isOverridden", "Lgg/essential/elementa/state/State;", "", "overriddenAlphaPercentage", "", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "Lgg/essential/elementa/state/MappedState;", "rebindIsOverridden", "state", "rebindOverriddenAlphaPercentage", "recurseChildren", "", "component", "Lgg/essential/elementa/UIComponent;", "action", "Lkotlin/Function1;", "remove", "setup", "OverridableAlphaColorConstraint", "Elementa" })
public final class RecursiveFadeEffect extends Effect
{
    @NotNull
    private final MappedState<Boolean, Boolean> isOverridden;
    @NotNull
    private final MappedState<Float, Float> overriddenAlphaPercentage;
    
    public RecursiveFadeEffect(@NotNull final State<Boolean> isOverridden, @NotNull final State<Float> overriddenAlphaPercentage) {
        Intrinsics.checkNotNullParameter((Object)isOverridden, "isOverridden");
        Intrinsics.checkNotNullParameter((Object)overriddenAlphaPercentage, "overriddenAlphaPercentage");
        super();
        this.isOverridden = isOverridden.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)RecursiveFadeEffect$isOverridden.RecursiveFadeEffect$isOverridden$1.INSTANCE);
        this.overriddenAlphaPercentage = overriddenAlphaPercentage.map((kotlin.jvm.functions.Function1<? super Float, ? extends Float>)RecursiveFadeEffect$overriddenAlphaPercentage.RecursiveFadeEffect$overriddenAlphaPercentage$1.INSTANCE);
    }
    
    public RecursiveFadeEffect(State isOverridden, State overriddenAlphaPercentage, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            isOverridden = new BasicState(false);
        }
        if ((n & 0x2) != 0x0) {
            overriddenAlphaPercentage = new BasicState(1.0f);
        }
        this(isOverridden, overriddenAlphaPercentage);
    }
    
    @NotNull
    public final RecursiveFadeEffect rebindIsOverridden(@NotNull final State<Boolean> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final RecursiveFadeEffect $this$rebindIsOverridden_u24lambda_u2d0 = this;
        final int n = 0;
        $this$rebindIsOverridden_u24lambda_u2d0.isOverridden.rebind(state);
        return this;
    }
    
    @NotNull
    public final RecursiveFadeEffect rebindOverriddenAlphaPercentage(@NotNull final State<Float> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final RecursiveFadeEffect $this$rebindOverriddenAlphaPercentage_u24lambda_u2d1 = this;
        final int n = 0;
        $this$rebindOverriddenAlphaPercentage_u24lambda_u2d1.overriddenAlphaPercentage.rebind(state);
        return this;
    }
    
    @Override
    public void setup() {
        this.recurseChildren(this.getBoundComponent(), (Function1<? super UIComponent, Unit>)new RecursiveFadeEffect$setup.RecursiveFadeEffect$setup$1(this));
    }
    
    public final void remove() {
        this.recurseChildren(this.getBoundComponent(), (Function1<? super UIComponent, Unit>)RecursiveFadeEffect$remove.RecursiveFadeEffect$remove$1.INSTANCE);
    }
    
    private final void recurseChildren(final UIComponent component, final Function1<? super UIComponent, Unit> action) {
        action.invoke((Object)component);
        final Iterable $this$forEach$iv = component.getChildren();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent it = (UIComponent)element$iv;
            final int n = 0;
            Intrinsics.checkNotNullExpressionValue((Object)it, "it");
            this.recurseChildren(it, action);
        }
    }
    
    public RecursiveFadeEffect() {
        this(null, null, 3, null);
    }
    
    public static final /* synthetic */ MappedState access$isOverridden$p(final RecursiveFadeEffect $this) {
        return $this.isOverridden;
    }
    
    public static final /* synthetic */ MappedState access$getOverriddenAlphaPercentage$p(final RecursiveFadeEffect $this) {
        return $this.overriddenAlphaPercentage;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'" }, d2 = { "Lgg/essential/elementa/effects/RecursiveFadeEffect$OverridableAlphaColorConstraint;", "Lgg/essential/elementa/constraints/ColorConstraint;", "originalConstraint", "isOverridden", "Lgg/essential/elementa/state/State;", "", "overriddenAlphaPercentage", "", "(Lgg/essential/elementa/constraints/ColorConstraint;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "cachedValue", "Ljava/awt/Color;", "getCachedValue", "()Ljava/awt/Color;", "setCachedValue", "(Ljava/awt/Color;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "originalAlpha", "", "Ljava/lang/Integer;", "getOriginalConstraint", "()Lgg/essential/elementa/constraints/ColorConstraint;", "recalculate", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getColorImpl", "component", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
    private static final class OverridableAlphaColorConstraint implements ColorConstraint
    {
        @NotNull
        private final ColorConstraint originalConstraint;
        @NotNull
        private final State<Boolean> isOverridden;
        @NotNull
        private final State<Float> overriddenAlphaPercentage;
        @NotNull
        private Color cachedValue;
        @Nullable
        private UIComponent constrainTo;
        private boolean recalculate;
        @Nullable
        private Integer originalAlpha;
        
        public OverridableAlphaColorConstraint(@NotNull final ColorConstraint originalConstraint, @NotNull final State<Boolean> isOverridden, @NotNull final State<Float> overriddenAlphaPercentage) {
            Intrinsics.checkNotNullParameter((Object)originalConstraint, "originalConstraint");
            Intrinsics.checkNotNullParameter((Object)isOverridden, "isOverridden");
            Intrinsics.checkNotNullParameter((Object)overriddenAlphaPercentage, "overriddenAlphaPercentage");
            super();
            this.originalConstraint = originalConstraint;
            this.isOverridden = isOverridden;
            this.overriddenAlphaPercentage = overriddenAlphaPercentage;
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            this.cachedValue = white;
            this.recalculate = true;
            this.isOverridden.onSetValue((kotlin.jvm.functions.Function1<? super Boolean, Unit>)new Function1<Boolean, Unit>() {
                final /* synthetic */ OverridableAlphaColorConstraint this$0;
                
                RecursiveFadeEffect$OverridableAlphaColorConstraint$1() {
                    this.this$0 = $receiver;
                    super(1);
                }
                
                public final void invoke(final boolean it) {
                    this.this$0.setRecalculate(true);
                }
                
                public /* bridge */ Object invoke(final Object p1) {
                    this.invoke((boolean)p1);
                    return Unit.INSTANCE;
                }
            });
            this.overriddenAlphaPercentage.onSetValue((kotlin.jvm.functions.Function1<? super Float, Unit>)new Function1<Float, Unit>() {
                final /* synthetic */ OverridableAlphaColorConstraint this$0;
                
                RecursiveFadeEffect$OverridableAlphaColorConstraint$2() {
                    this.this$0 = $receiver;
                    super(1);
                }
                
                public final void invoke(final float it) {
                    this.this$0.setRecalculate(true);
                }
                
                public /* bridge */ Object invoke(final Object p1) {
                    this.invoke(((Number)p1).floatValue());
                    return Unit.INSTANCE;
                }
            });
        }
        
        @NotNull
        public final ColorConstraint getOriginalConstraint() {
            return this.originalConstraint;
        }
        
        @NotNull
        @Override
        public Color getCachedValue() {
            return this.cachedValue;
        }
        
        @Override
        public void setCachedValue(@NotNull final Color <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.cachedValue = <set-?>;
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
        public boolean getRecalculate() {
            return this.recalculate;
        }
        
        @Override
        public void setRecalculate(final boolean <set-?>) {
            this.recalculate = <set-?>;
        }
        
        @NotNull
        @Override
        public Color getColorImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final Color originalColor = this.originalConstraint.getColorImpl(component);
            if (this.originalAlpha == null) {
                this.originalAlpha = originalColor.getAlpha();
            }
            if (this.isOverridden.get()) {
                final Color $this$withAlpha = originalColor;
                final Integer originalAlpha = this.originalAlpha;
                Intrinsics.checkNotNull((Object)originalAlpha);
                return ExtensionsKt.withAlpha($this$withAlpha, RangesKt.coerceIn(MathKt.roundToInt(originalAlpha * this.overriddenAlphaPercentage.get().floatValue()), 0, 255));
            }
            return originalColor;
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
            this.setCachedValue((Color)<set-?>);
        }
    }
}
