package gg.essential.elementa.dsl;

import gg.essential.elementa.constraints.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007" }, d2 = { "gg/essential/elementa/dsl/BasicConstraintsKt$basicXConstraint$1", "Lgg/essential/elementa/dsl/BasicConstraint;", "", "Lgg/essential/elementa/constraints/XConstraint;", "getXPositionImpl", "component", "Lgg/essential/elementa/UIComponent;", "Elementa" })
public static final class BasicConstraintsKt$basicXConstraint$1 extends BasicConstraint<Float> implements XConstraint {
    final /* synthetic */ Function1<UIComponent, Float> $calculator;
    
    BasicConstraintsKt$basicXConstraint$1(final Function1<? super UIComponent, Float> $calculator) {
        this.$calculator = $calculator;
        super(0.0f);
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return ((Number)this.$calculator.invoke((Object)component)).floatValue();
    }
}