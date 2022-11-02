package gg.essential.gui.studio;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$CosmeticDivider;", "Lgg/essential/elementa/components/UIContainer;", "()V", "essential" })
public static final class CosmeticDivider extends UIContainer
{
    public CosmeticDivider() {
        super();
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(0.0f, false, 3, null));
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d0.setHeight(UtilitiesKt.getPixels(16));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.COMPONENT_BACKGROUND));
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d2.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d2.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d2.setHeight(UtilitiesKt.getPixel(1));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
    }
}
