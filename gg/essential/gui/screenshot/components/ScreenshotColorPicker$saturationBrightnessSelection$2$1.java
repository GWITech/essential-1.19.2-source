package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0003\u0010\u0004""" }, d2 = { "<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;" })
static final class ScreenshotColorPicker$saturationBrightnessSelection$2$1 extends Lambda implements Function1<Float, Float> {
    public static final ScreenshotColorPicker$saturationBrightnessSelection$2$1 INSTANCE;
    
    ScreenshotColorPicker$saturationBrightnessSelection$2$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(final float it) {
        return 1.0f - it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).floatValue());
    }
    
    static {
        ScreenshotColorPicker$saturationBrightnessSelection$2$1.INSTANCE = new ScreenshotColorPicker$saturationBrightnessSelection$2$1();
    }
}