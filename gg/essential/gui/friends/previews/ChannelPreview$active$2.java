package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import gg.essential.gui.friends.*;
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
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/Tab;", "invoke", "(Lgg/essential/gui/friends/Tab;)Ljava/lang/Boolean;" })
static final class ChannelPreview$active$2 extends Lambda implements Function1<Tab, Boolean> {
    public static final ChannelPreview$active$2 INSTANCE;
    
    ChannelPreview$active$2() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Tab it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it == Tab.CHAT;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Tab)p1);
    }
    
    static {
        ChannelPreview$active$2.INSTANCE = new ChannelPreview$active$2();
    }
}