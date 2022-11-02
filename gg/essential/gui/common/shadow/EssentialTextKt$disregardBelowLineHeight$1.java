package gg.essential.gui.common.shadow;

import kotlin.*;
import gg.essential.elementa.font.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0011
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004""" }, d2 = { "gg/essential/gui/common/shadow/EssentialTextKt$disregardBelowLineHeight$1", "Lgg/essential/gui/common/shadow/FontProviderDelegate;", "getBelowLineHeight", "", "essential" })
public static final class EssentialTextKt$disregardBelowLineHeight$1 extends FontProviderDelegate {
    EssentialTextKt$disregardBelowLineHeight$1(final FontProvider $receiver) {
        super($receiver);
    }
    
    @Override
    public float getBelowLineHeight() {
        return 0.0f;
    }
}