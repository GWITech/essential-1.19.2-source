package gg.essential.gui.menu.compact;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.modals.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class CompactAccountSwitcher$addAccount$3 extends Lambda implements Function0<Unit> {
    public static final CompactAccountSwitcher$addAccount$3 INSTANCE;
    
    CompactAccountSwitcher$addAccount$3() {
        super(0);
    }
    
    public final void invoke() {
        GuiUtil.INSTANCE.pushModal((Modal)new AddAccountModal());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        CompactAccountSwitcher$addAccount$3.INSTANCE = new CompactAccountSwitcher$addAccount$3();
    }
}