package gg.essential.gui.menu.compact;

import kotlin.jvm.functions.*;
import gg.essential.gui.menu.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/gui/menu/AccountManager$AccountInfo;", "invoke" })
static final class CompactAccountSwitcher$2 extends Lambda implements Function1<AccountManager$AccountInfo, UIComponent> {
    final /* synthetic */ CompactAccountSwitcher this$0;
    
    CompactAccountSwitcher$2(final CompactAccountSwitcher $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(@NotNull final AccountManager$AccountInfo it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return (UIComponent)new CompactAccountSwitcher$AccountButton(it, CompactAccountSwitcher.access$getAccountManager$p(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((AccountManager$AccountInfo)p1);
    }
}