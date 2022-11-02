package gg.essential.gui.menu.full;

import kotlin.jvm.functions.*;
import net.minecraft.client.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/client/util/Session;", "invoke" })
static final class FullAccountSwitcher$mainButton$2 extends Lambda implements Function1<Session, String> {
    public static final FullAccountSwitcher$mainButton$2 INSTANCE;
    
    FullAccountSwitcher$mainButton$2() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Session it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final String username = it.getUsername();
        Intrinsics.checkNotNullExpressionValue((Object)username, "it.username");
        return username;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Session)p1);
    }
    
    static {
        FullAccountSwitcher$mainButton$2.INSTANCE = new FullAccountSwitcher$mainButton$2();
    }
}