package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke" })
static final class ScreenshotItemsSlider$afterInitialization$1 extends Lambda implements Function2<Float, Float, Unit> {
    final /* synthetic */ ScreenshotScrollComponent $screenshotScrollComponent;
    final /* synthetic */ Ref$FloatRef $previousVerticalOffset;
    final /* synthetic */ ScreenshotItemsSlider this$0;
    
    ScreenshotItemsSlider$afterInitialization$1(final ScreenshotScrollComponent $screenshotScrollComponent, final Ref$FloatRef $previousVerticalOffset, final ScreenshotItemsSlider $receiver) {
        this.$screenshotScrollComponent = $screenshotScrollComponent;
        this.$previousVerticalOffset = $previousVerticalOffset;
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke$2548a35() {
        if (this.$screenshotScrollComponent.getVerticalOffset() != this.$previousVerticalOffset.element) {
            this.$previousVerticalOffset.element = this.$screenshotScrollComponent.getVerticalOffset();
            ScreenshotItemsSlider.access$setScrollTo$p(this.this$0, null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        ((Number)p1).floatValue();
        ((Number)p2).floatValue();
        this.invoke$2548a35();
        return Unit.INSTANCE;
    }
}