package gg.essential.gui.screenshot.editor;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006	""" }, d2 = { "gg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$1", "Lgg/essential/elementa/components/UIContainer;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "mouseMove", "window", "Lgg/essential/elementa/components/Window;", "essential" })
public static final class ScreenshotCanvas$screenshotDisplay$1 extends UIContainer {
    final /* synthetic */ ScreenshotCanvas this$0;
    
    ScreenshotCanvas$screenshotDisplay$1(final ScreenshotCanvas $receiver) {
        this.this$0 = $receiver;
        super();
    }
    
    @Override
    public void mouseMove(@NotNull final Window window) {
        Intrinsics.checkNotNullParameter((Object)window, "window");
        if (this.this$0.getMouseButton() != -1) {
            final Pair mousePosition = this.getMousePosition();
            final float x = ((Number)mousePosition.component1()).floatValue();
            final float y = ((Number)mousePosition.component2()).floatValue();
            this.this$0.getOnDraw().invoke((Object)this, (Object)x, (Object)y, (Object)this.this$0.getMouseButton());
        }
        super.mouseMove(window);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.this$0.getVectorEditingOverlay().draw(matrixStack);
        super.draw(matrixStack);
    }
}