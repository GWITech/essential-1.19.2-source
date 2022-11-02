package gg.essential.gui.friends;

import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "invoke" })
static final class SocialMenu$3 extends Lambda implements Function1<Channel, Unit> {
    final /* synthetic */ SocialMenu this$0;
    
    SocialMenu$3(final SocialMenu $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Channel it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final long id = it.getId();
        final Long access$getChannelToRestore$p = SocialMenu.access$getChannelToRestore$p(this.this$0);
        if (access$getChannelToRestore$p != null) {
            if (id == access$getChannelToRestore$p) {
                SocialMenu.access$setChannelToRestore$p(this.this$0, null);
                Window.Companion.enqueueRenderOperation((Function0<Unit>)new SocialMenu$3.SocialMenu$3$1(this.this$0, it));
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Channel)p1);
        return Unit.INSTANCE;
    }
}