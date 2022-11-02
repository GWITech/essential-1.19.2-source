package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.gui.screenshot.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class RightSideBar$pictures$2 extends Lambda implements Function0<Unit> {
    public static final RightSideBar$pictures$2 INSTANCE;
    
    RightSideBar$pictures$2() {
        super(0);
    }
    
    public final void invoke() {
        GuiUtil.INSTANCE.openScreen(new ScreenshotBrowser((byte)0));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        RightSideBar$pictures$2.INSTANCE = new RightSideBar$pictures$2();
    }
}