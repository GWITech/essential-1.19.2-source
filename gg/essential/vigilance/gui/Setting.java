package gg.essential.vigilance.gui;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/gui/Setting;", "Lgg/essential/elementa/components/UIContainer;", "()V", "closePopups", "", "instantly", "", "Vigilance" })
public abstract class Setting extends UIContainer
{
    public Setting() {
        super();
        final UIComponent $this$constrain$iv = this;
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n = 0;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n2 = 0;
        $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(7.0f, false, 2, null));
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedMaxSizeConstraint());
    }
    
    public void closePopups(final boolean instantly) {
    }
    
    public static /* synthetic */ void closePopups$default(final Setting setting, boolean instantly, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePopups");
        }
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        setting.closePopups(instantly);
    }
}
