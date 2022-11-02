package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class ScreenshotItemsSlider$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ ScreenshotItemsSlider this$0;
    
    ScreenshotItemsSlider$2(final ScreenshotItemsSlider $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final int it) {
        ScreenshotItemsSlider.access$handleUpdateItems(this.this$0, it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
}