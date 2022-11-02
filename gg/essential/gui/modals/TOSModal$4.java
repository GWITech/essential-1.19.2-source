package gg.essential.gui.modals;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class TOSModal$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ boolean $unprompted;
    final /* synthetic */ Function0<Unit> $cancelAction;
    
    TOSModal$4(final boolean $unprompted, final Function0<Unit> $cancelAction) {
        this.$unprompted = false;
        this.$cancelAction = $cancelAction;
        super(1);
    }
    
    public final void invoke$1385ff() {
        if (this.$unprompted) {
            OnboardingData.setDeniedTos();
        }
        this.$cancelAction.invoke();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        ((Boolean)p1).booleanValue();
        this.invoke$1385ff();
        return Unit.INSTANCE;
    }
}