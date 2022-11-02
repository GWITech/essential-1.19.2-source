package gg.essential.gui.menu.full;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class FullRightSideBar$fullscreenToggleButton$2 extends Lambda implements Function0<Unit> {
    public static final FullRightSideBar$fullscreenToggleButton$2 INSTANCE;
    
    FullRightSideBar$fullscreenToggleButton$2() {
        super(0);
    }
    
    public final void invoke() {
        UMinecraft.getMinecraft().getWindow().toggleFullscreen();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        FullRightSideBar$fullscreenToggleButton$2.INSTANCE = new FullRightSideBar$fullscreenToggleButton$2();
    }
}