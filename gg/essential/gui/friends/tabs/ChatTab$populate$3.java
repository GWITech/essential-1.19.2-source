package gg.essential.gui.friends.tabs;

import kotlin.jvm.functions.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.message.*;
import gg.essential.gui.friends.previews.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "invoke" })
static final class ChatTab$populate$3 extends Lambda implements Function1<Channel, Unit> {
    final /* synthetic */ ChatTab this$0;
    
    ChatTab$populate$3(final ChatTab $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Channel it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final MessageScreen messageScreen = this.this$0.getCurrentMessageView().get();
        Object channel = null;
        Label_0038: {
            if (messageScreen != null) {
                final ChannelPreview preview = messageScreen.getPreview();
                if (preview != null) {
                    channel = preview.getChannel();
                    break Label_0038;
                }
            }
            channel = null;
        }
        if (Intrinsics.areEqual(channel, (Object)it)) {
            this.this$0.openTopChannel(it);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Channel)p1);
        return Unit.INSTANCE;
    }
}