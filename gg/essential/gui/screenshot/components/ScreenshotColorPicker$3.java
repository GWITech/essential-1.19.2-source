package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class ScreenshotColorPicker$3 extends Lambda implements Function1<Pair<? extends Float, ? extends Float>, Unit> {
    final /* synthetic */ ScreenshotColorPicker this$0;
    
    ScreenshotColorPicker$3(final ScreenshotColorPicker $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<Float, Float> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final float xPercent = ((Number)pair.component1()).floatValue();
        final float yPercent = ((Number)pair.component2()).floatValue();
        ScreenshotColorPicker.access$getSaturation$p(this.this$0).set(xPercent);
        ScreenshotColorPicker.access$getBrightness$p(this.this$0).set(1.0f - yPercent);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<Float, Float>)p1);
        return Unit.INSTANCE;
    }
}