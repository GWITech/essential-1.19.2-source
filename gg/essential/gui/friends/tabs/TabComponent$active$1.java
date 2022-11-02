package gg.essential.gui.friends.tabs;

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
static final class TabComponent$active$1 extends Lambda implements Function1<Tab, Boolean> {
    final /* synthetic */ TabComponent this$0;
    
    TabComponent$active$1(final TabComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Tab it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it == this.this$0.getTab();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Tab)p1);
    }
}