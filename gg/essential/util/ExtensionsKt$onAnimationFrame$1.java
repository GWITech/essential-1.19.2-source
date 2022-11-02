package gg.essential.util;

import gg.essential.elementa.effects.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0011
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004""" }, d2 = { "gg/essential/util/ExtensionsKt$onAnimationFrame$1", "Lgg/essential/elementa/effects/Effect;", "animationFrame", "", "essential" })
public static final class ExtensionsKt$onAnimationFrame$1 extends Effect {
    final /* synthetic */ Function0<Unit> $block;
    
    ExtensionsKt$onAnimationFrame$1(final Function0<Unit> $block) {
        this.$block = $block;
        super();
    }
    
    @Override
    public void animationFrame() {
        this.$block.invoke();
    }
}