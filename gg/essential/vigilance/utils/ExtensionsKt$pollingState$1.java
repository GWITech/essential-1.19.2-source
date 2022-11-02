package gg.essential.vigilance.utils;

import gg.essential.elementa.effects.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004" }, d2 = { "gg/essential/vigilance/utils/ExtensionsKt$pollingState$1", "Lgg/essential/elementa/effects/Effect;", "animationFrame", "", "Vigilance" })
public static final class ExtensionsKt$pollingState$1 extends Effect {
    final /* synthetic */ BasicState<T> $state;
    final /* synthetic */ Function0<T> $getter;
    
    ExtensionsKt$pollingState$1(final BasicState<T> $state, final Function0<? extends T> $getter) {
        this.$state = $state;
        this.$getter = $getter;
        super();
    }
    
    @Override
    public void animationFrame() {
        this.$state.set(this.$getter.invoke());
    }
}