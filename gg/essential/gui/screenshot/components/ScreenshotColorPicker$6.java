package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class ScreenshotColorPicker$6 extends Lambda implements Function1<Pair<? extends Pair<? extends Pair<? extends Float, ? extends Float>, ? extends Float>, ? extends Float>, Unit> {
    final /* synthetic */ ScreenshotColorPicker this$0;
    
    ScreenshotColorPicker$6(final ScreenshotColorPicker $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<Pair<Pair<Float, Float>, Float>, Float> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Pair hsb = (Pair)pair.component1();
        final float alpha = ((Number)pair.component2()).floatValue();
        final Pair hs = (Pair)hsb.component1();
        final float brightness = ((Number)hsb.component2()).floatValue();
        final float hue = ((Number)hs.component1()).floatValue();
        final float saturation = ((Number)hs.component2()).floatValue();
        final HSBColor color = new HSBColor(hue, saturation, brightness, alpha);
        State access$getCurrentColorState$p;
        if ((access$getCurrentColorState$p = ScreenshotColorPicker.access$getCurrentColorState$p(this.this$0)) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            access$getCurrentColorState$p = null;
        }
        access$getCurrentColorState$p.set(color);
        ScreenshotColorPicker.access$getPenTool$p(this.this$0).setColor(color.toColor());
        ScreenshotColorPicker.access$getCurrentColor(this.this$0).setColor(color.toColor());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<Pair<Pair<Float, Float>, Float>, Float>)p1);
        return Unit.INSTANCE;
    }
}