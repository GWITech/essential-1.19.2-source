package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.config.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.modals.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.gui.studio.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class LeftSideBar$wardrobeButton$2 extends Lambda implements Function0<Unit> {
    public static final LeftSideBar$wardrobeButton$2 INSTANCE;
    
    LeftSideBar$wardrobeButton$2() {
        super(0);
    }
    
    public final void invoke() {
        if (EssentialConfig.INSTANCE.getDisableCosmetics()) {
            GuiUtil.INSTANCE.pushModal(CosmeticsDisabledModalBuilder.INSTANCE.create());
        }
        else {
            GuiUtil.INSTANCE.openScreen(new CosmeticStudio());
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        LeftSideBar$wardrobeButton$2.INSTANCE = new LeftSideBar$wardrobeButton$2();
    }
}