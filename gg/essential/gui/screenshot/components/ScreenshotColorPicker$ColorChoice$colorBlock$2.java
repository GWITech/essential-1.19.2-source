package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "Lgg/essential/gui/screenshot/components/HSBColor;", "invoke" })
static final class ScreenshotColorPicker$ColorChoice$colorBlock$2 extends Lambda implements Function1<HSBColor, Color> {
    public static final ScreenshotColorPicker$ColorChoice$colorBlock$2 INSTANCE;
    
    ScreenshotColorPicker$ColorChoice$colorBlock$2() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final HSBColor it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.toColor();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((HSBColor)p1);
    }
    
    static {
        ScreenshotColorPicker$ColorChoice$colorBlock$2.INSTANCE = new ScreenshotColorPicker$ColorChoice$colorBlock$2();
    }
}