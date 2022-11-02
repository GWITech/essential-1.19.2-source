package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/screenshot/components/View;", "it", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "invoke" })
static final class ScreenshotBrowser$currentView$1 extends Lambda implements Function1<ScreenshotProperties, View> {
    public static final ScreenshotBrowser$currentView$1 INSTANCE;
    
    ScreenshotBrowser$currentView$1() {
        super(1);
    }
    
    @NotNull
    public final View invoke(@Nullable final ScreenshotProperties it) {
        return (it != null) ? View.FOCUS : View.LIST;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ScreenshotProperties)p1);
    }
    
    static {
        ScreenshotBrowser$currentView$1.INSTANCE = new ScreenshotBrowser$currentView$1();
    }
}