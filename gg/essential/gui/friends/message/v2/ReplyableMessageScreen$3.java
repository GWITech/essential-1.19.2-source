package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.message.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "message", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "invoke" })
static final class ReplyableMessageScreen$3 extends Lambda implements Function1<ClientMessage, UIComponent> {
    final /* synthetic */ ReplyableMessageScreen this$0;
    
    ReplyableMessageScreen$3(final ReplyableMessageScreen $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(@NotNull final ClientMessage message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final MessageWrapperImpl messageWrapperImpl = new MessageWrapperImpl(message, this.this$0);
        final ReplyableMessageScreen this$0 = this.this$0;
        final MessageWrapperImpl $this$invoke_u24lambda_u2d1 = messageWrapperImpl;
        final Iterable $this$forEach$iv = ReplyableMessageScreen.access$parseComponents(this$0, message, $this$invoke_u24lambda_u2d1);
        for (final Object element$iv : $this$forEach$iv) {
            final MessageLine it = (MessageLine)element$iv;
            $this$invoke_u24lambda_u2d1.addComponent(it);
        }
        return messageWrapperImpl;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ClientMessage)p1);
    }
}