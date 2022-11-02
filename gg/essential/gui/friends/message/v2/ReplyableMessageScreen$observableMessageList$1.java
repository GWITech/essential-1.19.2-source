package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "it", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "invoke" })
static final class ReplyableMessageScreen$observableMessageList$1 extends Lambda implements Function1<Message, ClientMessage> {
    public static final ReplyableMessageScreen$observableMessageList$1 INSTANCE;
    
    ReplyableMessageScreen$observableMessageList$1() {
        super(1);
    }
    
    @NotNull
    public final ClientMessage invoke(@NotNull final Message it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return ClientMessage.Companion.fromNetwork(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Message)p1);
    }
    
    static {
        ReplyableMessageScreen$observableMessageList$1.INSTANCE = new ReplyableMessageScreen$observableMessageList$1();
    }
}