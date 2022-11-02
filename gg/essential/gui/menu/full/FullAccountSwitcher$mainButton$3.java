package gg.essential.gui.menu.full;

import kotlin.jvm.functions.*;
import net.minecraft.client.util.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/client/util/Session;", "invoke" })
static final class FullAccountSwitcher$mainButton$3 extends Lambda implements Function1<Session, String> {
    public static final FullAccountSwitcher$mainButton$3 INSTANCE;
    
    FullAccountSwitcher$mainButton$3() {
        super(1);
    }
    
    @Nullable
    public final String invoke(@NotNull final Session it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.getUsername();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Session)p1);
    }
    
    static {
        FullAccountSwitcher$mainButton$3.INSTANCE = new FullAccountSwitcher$mainButton$3();
    }
}