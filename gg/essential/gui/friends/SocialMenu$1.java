package gg.essential.gui.friends;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.tabs.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "username", "", "invoke" })
static final class SocialMenu$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ SocialMenu this$0;
    
    SocialMenu$1(final SocialMenu $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final String username) {
        Intrinsics.checkNotNullParameter((Object)username, "username");
        final Iterable $this$forEach$iv = SocialMenu.access$getTabs$p(this.this$0);
        for (final Object element$iv : $this$forEach$iv) {
            final TabComponent it = (TabComponent)element$iv;
            it.search(username);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}