package gg.essential.gui.common.shadow;

import kotlin.*;
import gg.essential.elementa.font.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006	""" }, d2 = { "gg/essential/gui/common/shadow/EssentialTextKt$disregardShadows$1", "Lgg/essential/gui/common/shadow/FontProviderDelegate;", "getShadowHeight", "", "getStringHeight", "string", "", "pointSize", "getStringWidth", "essential" })
public static final class EssentialTextKt$disregardShadows$1 extends FontProviderDelegate {
    EssentialTextKt$disregardShadows$1(final FontProvider $receiver) {
        super($receiver);
    }
    
    @Override
    public float getStringWidth(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return super.getStringWidth(string, pointSize) - pointSize / 10.0f;
    }
    
    @Override
    public float getStringHeight(@NotNull final String string, final float pointSize) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return super.getStringHeight(string, pointSize) - pointSize / 10.0f;
    }
    
    @Override
    public float getShadowHeight() {
        return 0.0f;
    }
}