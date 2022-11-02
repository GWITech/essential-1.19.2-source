package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "index", "", "invoke" })
static final class ScreenshotColorPicker$5 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ ScreenshotColorPicker this$0;
    
    ScreenshotColorPicker$5(final ScreenshotColorPicker $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final int index) {
        final ColorChoice colorChoice = ScreenshotColorPicker.access$getColorHistoryContainer(this.this$0).childrenOfType(ColorChoice.class).get(index);
        ScreenshotColorPicker.access$setCurrentColorState$p(this.this$0, colorChoice.getContainedColor());
        State access$getCurrentColorState$p;
        if ((access$getCurrentColorState$p = ScreenshotColorPicker.access$getCurrentColorState$p(this.this$0)) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            access$getCurrentColorState$p = null;
        }
        final HSBColor color = (HSBColor)access$getCurrentColorState$p.get();
        ScreenshotColorPicker.access$getHue$p(this.this$0).set(color.getHue());
        ScreenshotColorPicker.access$getSaturation$p(this.this$0).set(color.getSaturation());
        ScreenshotColorPicker.access$getBrightness$p(this.this$0).set(color.getBrightness());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
}