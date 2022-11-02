package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/components/UIContainer;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "invoke" })
static final class ScreenshotCanvas$onDraw$1 extends Lambda implements Function4<UIContainer, Float, Float, Integer, Unit> {
    public static final ScreenshotCanvas$onDraw$1 INSTANCE;
    
    ScreenshotCanvas$onDraw$1() {
        super(4);
    }
    
    public final void invoke$76a646ed(@NotNull final UIContainer $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        final UIContainer uiContainer = (UIContainer)p1;
        ((Number)p2).floatValue();
        ((Number)p3).floatValue();
        ((Number)p4).intValue();
        this.invoke$76a646ed(uiContainer);
        return Unit.INSTANCE;
    }
    
    static {
        ScreenshotCanvas$onDraw$1.INSTANCE = new ScreenshotCanvas$onDraw$1();
    }
}