package gg.essential.gui.friends.tabs;

import kotlin.jvm.functions.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "invoke" })
static final class ChatTab$populate$5 extends Lambda implements Function1<Message, Unit> {
    final /* synthetic */ ChatTab this$0;
    
    ChatTab$populate$5(final ChatTab $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Message it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        ChatTab.access$getChannelListScroller(this.this$0).sortChildren(ChatTab.access$getChannelSorter$p(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Message)p1);
        return Unit.INSTANCE;
    }
}