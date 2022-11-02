package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import gg.essential.gui.friends.message.*;
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
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/message/MessageScreen;", "invoke", "(Lgg/essential/gui/friends/message/MessageScreen;)Ljava/lang/Boolean;" })
static final class ChannelPreview$active$1 extends Lambda implements Function1<MessageScreen, Boolean> {
    final /* synthetic */ ChannelPreview this$0;
    
    ChannelPreview$active$1(final ChannelPreview $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@Nullable final MessageScreen it) {
        return Intrinsics.areEqual((Object)((it != null) ? it.getPreview() : null), (Object)this.this$0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((MessageScreen)p1);
    }
}