package gg.essential.gui.friends.state;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import com.sparkuniverse.toolbox.chat.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class MessengerStateManagerImpl$createChannelStates$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ ChannelStates $this_apply;
    final /* synthetic */ MessengerStateManagerImpl this$0;
    final /* synthetic */ Channel $channel;
    
    MessengerStateManagerImpl$createChannelStates$1$1(final ChannelStates $receiver, final MessengerStateManagerImpl $receiver, final Channel $channel) {
        this.$this_apply = $receiver;
        this.this$0 = $receiver;
        this.$channel = $channel;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        if (this.$this_apply.getPropagateUpdatesToInfra()) {
            MessengerStateManagerImpl.access$getChatManager$p(this.this$0).updateMutedState(this.$channel, it);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}