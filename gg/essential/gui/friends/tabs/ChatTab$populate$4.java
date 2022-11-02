package gg.essential.gui.friends.tabs;

import kotlin.jvm.functions.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.previews.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "it", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "invoke" })
static final class ChatTab$populate$4 extends Lambda implements Function1<Channel, UIComponent> {
    final /* synthetic */ ChatTab this$0;
    
    ChatTab$populate$4(final ChatTab $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(@NotNull final Channel it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return new ChannelPreview(this.this$0.getGui(), it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Channel)p1);
    }
}