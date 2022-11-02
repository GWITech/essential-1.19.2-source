package gg.essential.elementa.constraints.debug;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/debug/ConstraintDebugger;", "", "evaluate", "", "constraint", "Lgg/essential/elementa/constraints/SuperConstraint;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "component", "Lgg/essential/elementa/UIComponent;", "invokeImpl", "Elementa" })
public interface ConstraintDebugger
{
    float evaluate(@NotNull final SuperConstraint<Float> p0, @NotNull final ConstraintType p1, @NotNull final UIComponent p2);
    
    default float invokeImpl(@NotNull final SuperConstraint<Float> constraint, @NotNull final ConstraintType type, @NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return switch (ConstraintDebugger.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1 -> ExtensionsKt.roundToRealPixels(((XConstraint)constraint).getXPositionImpl(component));
            case 2 -> ExtensionsKt.roundToRealPixels(((YConstraint)constraint).getYPositionImpl(component));
            case 3 -> ExtensionsKt.roundToRealPixels(((WidthConstraint)constraint).getWidthImpl(component));
            case 4 -> ExtensionsKt.roundToRealPixels(((HeightConstraint)constraint).getHeightImpl(component));
            case 5 -> ((RadiusConstraint)constraint).getRadiusImpl(component);
            default -> throw new UnsupportedOperationException();
        };
    }
    
    default /* synthetic */ float access$invokeImpl$jd(final ConstraintDebugger $this, final SuperConstraint constraint, final ConstraintType type, final UIComponent component) {
        return $this.invokeImpl(constraint, type, component);
    }
}
