package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class StateExtensionsKt$bindEffect$1$1$update$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ boolean $it;
    final /* synthetic */  $this_apply;
    final /* synthetic */ Effect $effect;
    
    StateExtensionsKt$bindEffect$1$1$update$1(final boolean $it, final UIComponent $receiver, final Effect $effect) {
        this.$it = $it;
        this.$this_apply = $receiver;
        this.$effect = $effect;
        super(0);
    }
    
    @NotNull
    public final Object invoke() {
        Object o;
        if (this.$it) {
            o = ComponentsKt.effect(this.$this_apply, this.$effect);
        }
        else {
            this.$this_apply.removeEffect(this.$effect);
            o = Unit.INSTANCE;
        }
        return o;
    }
}