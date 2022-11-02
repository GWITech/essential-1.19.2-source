package gg.essential.gui.menu.full;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class FullRightSideBar$silentModeToggleButton$2 extends Lambda implements Function0<Unit> {
    public static final FullRightSideBar$silentModeToggleButton$2 INSTANCE;
    
    FullRightSideBar$silentModeToggleButton$2() {
        super(0);
    }
    
    public final void invoke() {
        final EssentialConfig $this$invoke_u24lambda_u2d0 = EssentialConfig.INSTANCE;
        $this$invoke_u24lambda_u2d0.setDisableAllNotifications(!$this$invoke_u24lambda_u2d0.getDisableAllNotifications());
        $this$invoke_u24lambda_u2d0.markDirty();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        FullRightSideBar$silentModeToggleButton$2.INSTANCE = new FullRightSideBar$silentModeToggleButton$2();
    }
}