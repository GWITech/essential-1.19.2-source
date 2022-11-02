package gg.essential.gui.notification;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Ljava/lang/Void;", "invoke" })
static final class Notification$9 extends Lambda implements Function1<Void, Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$9(final Notification $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke$a83c79c() {
        Notification.access$animateCompleteTimerNow(this.this$0);
        Notification.access$animateOut(this.this$0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke$a83c79c();
        return Unit.INSTANCE;
    }
}