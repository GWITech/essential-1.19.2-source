package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class ExtensionsKt$hoveredState$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ BasicState<Boolean> $safeHovered;
    
    ExtensionsKt$hoveredState$4(final BasicState<Boolean> $safeHovered) {
        this.$safeHovered = $safeHovered;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ExtensionsKt$hoveredState$4.ExtensionsKt$hoveredState$4$1(this.$safeHovered, it));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}