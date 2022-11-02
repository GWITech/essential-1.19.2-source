package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class StateExtensionsKt$bindParent$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $handleStateUpdate;
    
    StateExtensionsKt$bindParent$2$1$1(final Function0<Unit> $handleStateUpdate) {
        this.$handleStateUpdate = $handleStateUpdate;
        super(0);
    }
    
    public final void invoke() {
        this.$handleStateUpdate.invoke();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}