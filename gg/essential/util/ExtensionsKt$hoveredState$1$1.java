package gg.essential.util;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class ExtensionsKt$hoveredState$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref$BooleanRef $registerHitTest;
    final /* synthetic */ UIComponent $this_hoveredState;
    final /* synthetic */ BasicState<Boolean> $unsafeHovered;
    
    ExtensionsKt$hoveredState$1$1(final Ref$BooleanRef $registerHitTest, final UIComponent $receiver, final BasicState<Boolean> $unsafeHovered) {
        this.$registerHitTest = $registerHitTest;
        this.$this_hoveredState = $receiver;
        this.$unsafeHovered = $unsafeHovered;
        super(0);
    }
    
    public final void invoke() {
        this.$registerHitTest.element = true;
        if (!ExtensionsKt.isInComponentTree(this.$this_hoveredState)) {
            this.$unsafeHovered.set(false);
            return;
        }
        this.$unsafeHovered.set(ExtensionsKt.access$hoveredState$hitTestHovered(this.$this_hoveredState));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}