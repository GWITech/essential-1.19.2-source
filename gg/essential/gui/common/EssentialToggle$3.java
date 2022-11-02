package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class EssentialToggle$3 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ EssentialToggle this$0;
    
    EssentialToggle$3(final EssentialToggle $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        final PixelConstraint xConstraint = UtilitiesKt.pixel$default(EssentialToggle.access$getBoxOffset$p(this.this$0), it, false, 2, null);
        if (Window.Companion.ofOrNull(this.this$0) != null) {
            final UIComponent $this$animate_u24lambda_u2d0$iv;
            final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.this$0.getSwitchBox();
            final AnimatingConstraints $this$invoke_u24lambda_u2d0;
            final AnimatingConstraints anim$iv = $this$invoke_u24lambda_u2d0 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            AnimatingConstraints.setXAnimation$default($this$invoke_u24lambda_u2d0, Animations.OUT_EXP, 0.25f, xConstraint, 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        }
        else {
            this.this$0.getSwitchBox().setX(xConstraint);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}