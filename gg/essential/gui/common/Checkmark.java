package gg.essential.gui.common;

import kotlin.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b""" }, d2 = { "Lgg/essential/gui/common/Checkmark;", "Lgg/essential/elementa/components/UIContainer;", "scaleOffset", "", "color", "Lgg/essential/elementa/state/State;", "Ljava/awt/Color;", "(FLgg/essential/elementa/state/State;)V", "essential" })
final class Checkmark extends UIContainer
{
    public Checkmark(final float scaleOffset, @NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super();
        for (int i = 0; i < 5; ++i) {
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(color);
            final UIConstraints $this$lambda_u2d1_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$lambda_u2d1_u24lambda_u2d0.setX(new SiblingConstraint(0.0f, true, 1, null));
            $this$lambda_u2d1_u24lambda_u2d0.setY(new SiblingConstraint(0.0f, false, 3, null));
            $this$lambda_u2d1_u24lambda_u2d0.setWidth(new AspectConstraint(0.0f, 1, null));
            $this$lambda_u2d1_u24lambda_u2d0.setHeight(new GuiScaleOffsetConstraint(scaleOffset));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
        }
        for (int j = 0; j < 2; ++j) {
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(color);
            final UIConstraints $this$lambda_u2d3_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$lambda_u2d3_u24lambda_u2d2.setX(new SiblingConstraint(0.0f, true, 1, null));
            $this$lambda_u2d3_u24lambda_u2d2.setY(new SiblingConstraint(0.0f, true, 1, null));
            $this$lambda_u2d3_u24lambda_u2d2.setWidth(new AspectConstraint(0.0f, 1, null));
            $this$lambda_u2d3_u24lambda_u2d2.setHeight(new GuiScaleOffsetConstraint(scaleOffset));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
        }
        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = this;
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d4.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d4.setHeight(ConstraintsKt.times(new ChildBasedMaxSizeConstraint(), 5));
    }
}
