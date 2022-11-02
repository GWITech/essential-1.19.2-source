package gg.essential.gui.notification;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "enabled", "", "invoke" })
static final class Notification$animateTimer$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$animateTimer$2(final Notification $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final boolean enabled) {
        if (enabled) {
            Notification.access$getTimerAnimation$p(this.this$0).getWidth().resumeIfSupported();
        }
        else {
            Notification.access$getTimerAnimation$p(this.this$0).getWidth().pauseIfSupported();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}