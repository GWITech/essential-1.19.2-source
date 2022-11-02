package gg.essential.gui.notification;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class Notification$animateTimer$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$animateTimer$1(final Notification $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        Notification.access$animateOut(this.this$0);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}