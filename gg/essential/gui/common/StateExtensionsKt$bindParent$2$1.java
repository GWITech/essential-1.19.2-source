package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "parent", "invoke" })
static final class StateExtensionsKt$bindParent$2$1 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ boolean $delayed;
    final /* synthetic */ T $this_apply;
    final /* synthetic */ Integer $index;
    
    StateExtensionsKt$bindParent$2$1(final boolean $delayed, final T $receiver, final Integer $index) {
        this.$delayed = $delayed;
        this.$this_apply = $receiver;
        this.$index = $index;
        super(1);
    }
    
    public final void invoke(@Nullable final UIComponent parent) {
        final Function0 handleStateUpdate = (Function0)new StateExtensionsKt$bindParent$2$1$handleStateUpdate.StateExtensionsKt$bindParent$2$1$handleStateUpdate$1(this.$this_apply, parent, this.$index);
        if (this.$delayed) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new StateExtensionsKt$bindParent$2$1.StateExtensionsKt$bindParent$2$1$1(handleStateUpdate));
        }
        else {
            handleStateUpdate.invoke();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}