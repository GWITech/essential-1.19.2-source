package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.gui.sps.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class RightSideBar$worldSettings$2 extends Lambda implements Function0<Unit> {
    public static final RightSideBar$worldSettings$2 INSTANCE;
    
    RightSideBar$worldSettings$2() {
        super(0);
    }
    
    public final void invoke() {
        GuiUtil.INSTANCE.openScreen((Screen)new WorldShareSettingsGui());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        RightSideBar$worldSettings$2.INSTANCE = new RightSideBar$worldSettings$2();
    }
}