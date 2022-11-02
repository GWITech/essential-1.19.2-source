package gg.essential.gui.menu.full;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.menu.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "accountInfo", "Lgg/essential/gui/menu/AccountManager$AccountInfo;", "invoke" })
static final class FullAccountSwitcher$3 extends Lambda implements Function1<AccountManager$AccountInfo, UIComponent> {
    final /* synthetic */ State<Boolean> $collapsed;
    final /* synthetic */ FullAccountSwitcher this$0;
    
    FullAccountSwitcher$3(final State<Boolean> $collapsed, final FullAccountSwitcher $receiver) {
        this.$collapsed = $collapsed;
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(@NotNull final AccountManager$AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter((Object)accountInfo, "accountInfo");
        return (UIComponent)new Account(accountInfo, (State)this.$collapsed, FullAccountSwitcher.access$getAccountManager$p(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((AccountManager$AccountInfo)p1);
    }
}