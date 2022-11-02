package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import gg.essential.gui.friends.state.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/state/PlayerActivity;", "invoke", "(Lgg/essential/gui/friends/state/PlayerActivity;)Ljava/lang/Boolean;" })
static final class ChannelPreview$Description$joinable$1 extends Lambda implements Function1<PlayerActivity, Boolean> {
    public static final ChannelPreview$Description$joinable$1 INSTANCE;
    
    ChannelPreview$Description$joinable$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final PlayerActivity it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.isJoinable();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((PlayerActivity)p1);
    }
    
    static {
        ChannelPreview$Description$joinable$1.INSTANCE = new ChannelPreview$Description$joinable$1();
    }
}