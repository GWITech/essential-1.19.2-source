package gg.essential.gui.screenshot.components;

import gg.essential.elementa.*;
import kotlin.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0017
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006""" }, d2 = { "gg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2", "Lgg/essential/elementa/UIComponent;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "essential" })
public static final class ScreenshotColorPicker$hueArea$2 extends UIComponent {
    final /* synthetic */ ScreenshotColorPicker this$0;
    
    ScreenshotColorPicker$hueArea$2(final ScreenshotColorPicker $receiver) {
        this.this$0 = $receiver;
        super();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        ScreenshotColorPicker.access$drawHueLine(this.this$0, matrixStack, this);
        super.draw(matrixStack);
    }
}