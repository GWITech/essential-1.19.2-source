package gg.essential.gui.common.modal;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/modal/VerticalConfirmDenyModal;", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "requiresButtonPress", "", "(Z)V", "essential" })
public class VerticalConfirmDenyModal extends ConfirmDenyModal
{
    public VerticalConfirmDenyModal() {
        super(false);
        this.getCancelButton().setX(new CenterConstraint());
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this.getButtonContainer();
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setX(new CenterConstraint());
        $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(12.0f, false, 2, null));
        $this$_init__u24lambda_u2d0.setWidth(new ChildBasedMaxSizeConstraint());
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this.getPrimaryActionButton());
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d2.setY(new SiblingConstraint(3.0f, false, 2, null));
        $this$_init__u24lambda_u2d2.setX(new CenterConstraint());
    }
}
