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
static final class ConfirmDenyModal$cancelButton$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConfirmDenyModal this$0;
    
    ConfirmDenyModal$cancelButton$2(final ConfirmDenyModal $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.hides();
        ConfirmDenyModal.access$fireCancel(this.this$0, true);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}