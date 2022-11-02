package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.gui.screenshot.editor.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class FocusEditComponent$canvas$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ScreenshotCanvas $this_apply;
    
    FocusEditComponent$canvas$3$1(final ScreenshotCanvas $receiver) {
        this.$this_apply = $receiver;
        super(0);
    }
    
    public final void invoke() {
        this.$this_apply.getVectorEditingOverlay().delete();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}