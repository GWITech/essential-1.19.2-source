package gg.essential.gui.friends;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.gui.friends.message.*;
import gg.essential.gui.friends.previews.*;
import com.sparkuniverse.toolbox.chat.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class SocialMenu$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SocialMenu this$0;
    
    SocialMenu$2(final SocialMenu $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        final SocialMenu this$0 = this.this$0;
        final MessageScreen messageScreen = this.this$0.getChatTab().getCurrentMessageView().get();
        Long value = null;
        Label_0049: {
            if (messageScreen != null) {
                final ChannelPreview preview = messageScreen.getPreview();
                if (preview != null) {
                    final Channel channel = preview.getChannel();
                    if (channel != null) {
                        value = channel.getId();
                        break Label_0049;
                    }
                }
            }
            value = null;
        }
        SocialMenu.access$setChannelToRestore$p(this$0, value);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}