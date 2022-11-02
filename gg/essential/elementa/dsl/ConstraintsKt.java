package gg.essential.elementa.dsl;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\"\u0010\u0006\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a0\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\n\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\n0\u0003*\u0002H\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0004¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0004\u001a!\u0010\u0011\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0004\u001a,\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a!\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086\u0002\u001a\u001b\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u001aH\u0086\u0002\u001a!\u0010\u001b\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0002\u001a!\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0002\u001a!\u0010 \u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086\u0002\u001a\u001b\u0010 \u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u001aH\u0086\u0002¨\u0006!" }, d2 = { "max", "Lgg/essential/elementa/constraints/MaxConstraint;", "first", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "second", "min", "Lgg/essential/elementa/constraints/MinConstraint;", "boundTo", "U", "T", "component", "Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;", "coerceAtLeast", "Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;", "minConstraint", "coerceAtMost", "Lgg/essential/elementa/constraints/CoerceAtMostConstraint;", "coerceIn", "Lgg/essential/elementa/constraints/CoerceInConstraint;", "maxConstraint", "div", "Lgg/essential/elementa/constraints/ScaleConstraint;", "factor", "Lgg/essential/elementa/state/State;", "", "minus", "Lgg/essential/elementa/constraints/SubtractiveConstraint;", "other", "plus", "Lgg/essential/elementa/constraints/AdditiveConstraint;", "times", "Elementa" })
public final class ConstraintsKt
{
    @NotNull
    public static final CoerceAtLeastConstraint coerceAtLeast(@NotNull final SuperConstraint<Float> $this$coerceAtLeast, @NotNull final SuperConstraint<Float> minConstraint) {
        Intrinsics.checkNotNullParameter((Object)$this$coerceAtLeast, "<this>");
        Intrinsics.checkNotNullParameter((Object)minConstraint, "minConstraint");
        return new CoerceAtLeastConstraint($this$coerceAtLeast, minConstraint);
    }
    
    @NotNull
    public static final CoerceAtMostConstraint coerceAtMost(@NotNull final SuperConstraint<Float> $this$coerceAtMost, @NotNull final SuperConstraint<Float> minConstraint) {
        Intrinsics.checkNotNullParameter((Object)$this$coerceAtMost, "<this>");
        Intrinsics.checkNotNullParameter((Object)minConstraint, "minConstraint");
        return new CoerceAtMostConstraint($this$coerceAtMost, minConstraint);
    }
    
    @NotNull
    public static final CoerceInConstraint coerceIn(@NotNull final SuperConstraint<Float> $this$coerceIn, @NotNull final SuperConstraint<Float> minConstraint, @NotNull final SuperConstraint<Float> maxConstraint) {
        Intrinsics.checkNotNullParameter((Object)$this$coerceIn, "<this>");
        Intrinsics.checkNotNullParameter((Object)minConstraint, "minConstraint");
        Intrinsics.checkNotNullParameter((Object)maxConstraint, "maxConstraint");
        return new CoerceInConstraint($this$coerceIn, minConstraint, maxConstraint);
    }
    
    @NotNull
    public static final AdditiveConstraint plus(@NotNull final SuperConstraint<Float> $this$plus, @NotNull final SuperConstraint<Float> other) {
        Intrinsics.checkNotNullParameter((Object)$this$plus, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return new AdditiveConstraint($this$plus, other);
    }
    
    @NotNull
    public static final SubtractiveConstraint minus(@NotNull final SuperConstraint<Float> $this$minus, @NotNull final SuperConstraint<Float> other) {
        Intrinsics.checkNotNullParameter((Object)$this$minus, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return new SubtractiveConstraint($this$minus, other);
    }
    
    @NotNull
    public static final ScaleConstraint times(@NotNull final SuperConstraint<Float> $this$times, @NotNull final Number factor) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)factor, "factor");
        return new ScaleConstraint($this$times, factor.floatValue());
    }
    
    @NotNull
    public static final ScaleConstraint times(@NotNull final SuperConstraint<Float> $this$times, @NotNull final State<Number> factor) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)factor, "factor");
        return new ScaleConstraint($this$times, 0.0f).bindValue((State<Float>)factor.map((kotlin.jvm.functions.Function1<? super Number, ?>)ConstraintsKt$times.ConstraintsKt$times$1.INSTANCE));
    }
    
    @NotNull
    public static final ScaleConstraint div(@NotNull final SuperConstraint<Float> $this$div, @NotNull final Number factor) {
        Intrinsics.checkNotNullParameter((Object)$this$div, "<this>");
        Intrinsics.checkNotNullParameter((Object)factor, "factor");
        return new ScaleConstraint($this$div, 1.0f / factor.floatValue());
    }
    
    @NotNull
    public static final ScaleConstraint div(@NotNull final SuperConstraint<Float> $this$div, @NotNull final State<Number> factor) {
        Intrinsics.checkNotNullParameter((Object)$this$div, "<this>");
        Intrinsics.checkNotNullParameter((Object)factor, "factor");
        return new ScaleConstraint($this$div, 0.0f).bindValue((State<Float>)factor.map((kotlin.jvm.functions.Function1<? super Number, ?>)ConstraintsKt$div.ConstraintsKt$div$1.INSTANCE));
    }
    
    @NotNull
    public static final MaxConstraint max(@NotNull final SuperConstraint<Float> first, @NotNull final SuperConstraint<Float> second) {
        Intrinsics.checkNotNullParameter((Object)first, "first");
        Intrinsics.checkNotNullParameter((Object)second, "second");
        return new MaxConstraint((SuperConstraint)first, (SuperConstraint)second);
    }
    
    @NotNull
    public static final MinConstraint min(@NotNull final SuperConstraint<Float> first, @NotNull final SuperConstraint<Float> second) {
        Intrinsics.checkNotNullParameter((Object)first, "first");
        Intrinsics.checkNotNullParameter((Object)second, "second");
        return new MinConstraint(first, second);
    }
    
    @NotNull
    public static final <T, U extends SuperConstraint<T>> U boundTo(@NotNull final U $this$boundTo, @NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)$this$boundTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final SuperConstraint $this$boundTo_u24lambda_u2d0 = $this$boundTo;
        final int n = 0;
        $this$boundTo_u24lambda_u2d0.to(component);
        return $this$boundTo;
    }
}
