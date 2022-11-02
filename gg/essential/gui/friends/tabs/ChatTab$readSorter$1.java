package gg.essential.gui.friends.tabs;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.previews.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Boolean;" })
static final class ChatTab$readSorter$1 extends Lambda implements Function1<UIComponent, Boolean> {
    public static final ChatTab$readSorter$1 INSTANCE;
    
    ChatTab$readSorter$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return !((ChannelPreview)it).getHasUnreadState().get();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
    
    static {
        ChatTab$readSorter$1.INSTANCE = new ChatTab$readSorter$1();
    }
}