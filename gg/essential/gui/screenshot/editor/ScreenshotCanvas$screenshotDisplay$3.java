package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ScreenshotCanvas$screenshotDisplay$3 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ ScreenshotCanvas this$0;
    
    ScreenshotCanvas$screenshotDisplay$3(final ScreenshotCanvas $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        this.this$0.setMouseButton(-1);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}