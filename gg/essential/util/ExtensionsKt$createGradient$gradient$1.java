package gg.essential.util;

import gg.essential.elementa.components.*;
import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0019
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007""" }, d2 = { "gg/essential/util/ExtensionsKt$createGradient$gradient$1", "Lgg/essential/elementa/components/GradientComponent;", "isPointInside", "", "x", "", "y", "essential" })
public static final class ExtensionsKt$createGradient$gradient$1 extends GradientComponent {
    ExtensionsKt$createGradient$gradient$1(final Color $super_call_param$1, final Color $super_call_param$2) {
        super($super_call_param$1, $super_call_param$2, null, 4, null);
    }
    
    @Override
    public boolean isPointInside(final float x, final float y) {
        return false;
    }
}