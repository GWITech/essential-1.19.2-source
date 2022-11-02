package gg.essential.gui.common.modal;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class Modal$fadeIn$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Modal this$0;
    final /* synthetic */ Function0<Unit> $callback;
    
    Modal$fadeIn$1(final Modal $receiver, final Function0<Unit> $callback) {
        this.this$0 = $receiver;
        this.$callback = $callback;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.setAnimating$1385ff();
        final Function0 $callback = this.$callback;
        if ($callback != null) {
            $callback.invoke();
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}