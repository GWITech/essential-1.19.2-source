package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "S", "it", "invoke", "(Ljava/lang/Object;)V" })
static final class StateExtensionsKt$bindConstraints$1$1 extends Lambda implements Function1<S, Unit> {
    final /* synthetic */ Function2<UIConstraints, S, Unit> $config;
    final /* synthetic */ T $this_apply;
    
    StateExtensionsKt$bindConstraints$1$1(final Function2<? super UIConstraints, ? super S, Unit> $config, final T $receiver) {
        this.$config = $config;
        this.$this_apply = $receiver;
        super(1);
    }
    
    public final void invoke(final S it) {
        this.$config.invoke((Object)this.$this_apply.getConstraints(), (Object)it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}