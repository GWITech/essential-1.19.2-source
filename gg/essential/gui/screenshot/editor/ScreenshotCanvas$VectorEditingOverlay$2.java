package gg.essential.gui.screenshot.editor;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.image.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "invoke" })
static final class ScreenshotCanvas$VectorEditingOverlay$2 extends Lambda implements Function1<PixelBufferTexture, Unit> {
    final /* synthetic */ VectorEditingOverlay this$0;
    
    ScreenshotCanvas$VectorEditingOverlay$2(final VectorEditingOverlay $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke$29222cb6() {
        this.this$0.markDirty();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke$29222cb6();
        return Unit.INSTANCE;
    }
}