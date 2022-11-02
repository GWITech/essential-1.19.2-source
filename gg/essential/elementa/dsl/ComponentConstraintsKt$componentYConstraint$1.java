package gg.essential.elementa.dsl;

import gg.essential.elementa.constraints.*;
import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007" }, d2 = { "gg/essential/elementa/dsl/ComponentConstraintsKt$componentYConstraint$1", "Lgg/essential/elementa/dsl/ComponentConstraint;", "", "Lgg/essential/elementa/constraints/YConstraint;", "getYPositionImpl", "component", "Lgg/essential/elementa/UIComponent;", "Elementa" })
public static final class ComponentConstraintsKt$componentYConstraint$1 extends ComponentConstraint<Float> implements YConstraint {
    final /* synthetic */ UIComponent $boundComponent;
    
    ComponentConstraintsKt$componentYConstraint$1(final UIComponent $boundComponent) {
        this.$boundComponent = $boundComponent;
        super(0.0f);
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.$boundComponent.getTop() - this.$boundComponent.getParent().getTop();
    }
}