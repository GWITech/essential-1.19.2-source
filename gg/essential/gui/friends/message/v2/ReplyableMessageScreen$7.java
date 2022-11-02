package gg.essential.gui.friends.message.v2;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "invoke" })
static final class ReplyableMessageScreen$7 extends Lambda implements Function1<ClientMessage, Unit> {
    final /* synthetic */ ReplyableMessageScreen this$0;
    
    ReplyableMessageScreen$7(final ReplyableMessageScreen $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@Nullable final ClientMessage it) {
        if (ReplyableMessageScreen.access$getScroller(this.this$0).getVerticalOffset() == 0.0f) {
            return;
        }
        final float scrollAdjust = (it == null) ? -14.0f : 14.0f;
        ScrollComponent.scrollTo$default(ReplyableMessageScreen.access$getScroller(this.this$0), 0.0f, ReplyableMessageScreen.access$getScroller(this.this$0).getVerticalOffset() + scrollAdjust, false, 1, null);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((ClientMessage)p1);
        return Unit.INSTANCE;
    }
}