package gg.essential.vigilance.gui.settings;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.vigilance.gui.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.constraints.animation.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n�\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ButtonComponent$3 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ ButtonComponent this$0;
    
    ButtonComponent$3(final ButtonComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseLeave) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseLeave, "$this$onMouseLeave");
        final UIComponent $this$animate$iv = ButtonComponent.access$getContainer(this.this$0);
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n = 0;
        final AnimatingConstraints $this$invoke_u24lambda_u2d0;
        final AnimatingConstraints anim$iv = $this$invoke_u24lambda_u2d0 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        AnimatingConstraints.setColorAnimation$default($this$invoke_u24lambda_u2d0, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(VigilancePalette.INSTANCE.getButton$Vigilance()), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}