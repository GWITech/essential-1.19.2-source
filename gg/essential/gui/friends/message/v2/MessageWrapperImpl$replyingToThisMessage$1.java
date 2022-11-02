package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "invoke", "(Lgg/essential/gui/friends/message/v2/ClientMessage;)Ljava/lang/Boolean;" })
static final class MessageWrapperImpl$replyingToThisMessage$1 extends Lambda implements Function1<ClientMessage, Boolean> {
    final /* synthetic */ ClientMessage $message;
    
    MessageWrapperImpl$replyingToThisMessage$1(final ClientMessage $message) {
        this.$message = $message;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@Nullable final ClientMessage it) {
        return Intrinsics.areEqual((Object)it, (Object)this.$message);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ClientMessage)p1);
    }
}