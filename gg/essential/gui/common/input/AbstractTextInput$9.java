package gg.essential.gui.common.input;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "invoke" })
static final class AbstractTextInput$9 extends Lambda implements Function1<AnimatingConstraints, Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$9(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final AnimatingConstraints $this$animateAfterUnhide) {
        Intrinsics.checkNotNullParameter((Object)$this$animateAfterUnhide, "$this$animateAfterUnhide");
        AnimatingConstraints.setColorAnimation$default($this$animateAfterUnhide, Animations.OUT_CIRCULAR, 0.5f, UtilitiesKt.toConstraint(this.this$0.getCursorColor()), 0.0f, 8, null);
        $this$animateAfterUnhide.onComplete((Function0<Unit>)new AbstractTextInput$9.AbstractTextInput$9$1(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((AnimatingConstraints)p1);
        return Unit.INSTANCE;
    }
}