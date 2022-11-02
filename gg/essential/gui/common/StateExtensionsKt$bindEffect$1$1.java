package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.elementa.effects.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "it", "", "invoke" })
static final class StateExtensionsKt$bindEffect$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ boolean $delayed;
    final /* synthetic */ T $this_apply;
    final /* synthetic */ Effect $effect;
    
    StateExtensionsKt$bindEffect$1$1(final boolean $delayed, final T $receiver, final Effect $effect) {
        this.$delayed = true;
        this.$this_apply = $receiver;
        this.$effect = $effect;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        final Function0 update = (Function0)new StateExtensionsKt$bindEffect$1$1$update.StateExtensionsKt$bindEffect$1$1$update$1(it, this.$this_apply, this.$effect);
        if (this.$delayed) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new StateExtensionsKt$bindEffect$1$1.StateExtensionsKt$bindEffect$1$1$1(update));
        }
        else {
            update.invoke();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}