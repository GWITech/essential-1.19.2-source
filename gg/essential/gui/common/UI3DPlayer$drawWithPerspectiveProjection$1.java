package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class UI3DPlayer$drawWithPerspectiveProjection$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UI3DPlayer this$0;
    
    UI3DPlayer$drawWithPerspectiveProjection$1(final UI3DPlayer $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        UI3DPlayer.access$drawPlayer$4de8d7fa(this.this$0, new UMatrixStack());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}