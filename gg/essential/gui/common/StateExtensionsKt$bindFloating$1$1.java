package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;

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
static final class StateExtensionsKt$bindFloating$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ T $this_apply;
    
    StateExtensionsKt$bindFloating$1$1(final T $receiver) {
        this.$this_apply = $receiver;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        if (ExtensionsKt.getHasWindow(this.$this_apply)) {
            this.$this_apply.setFloating(it);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}