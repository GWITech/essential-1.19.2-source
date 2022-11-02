package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
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
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "mouseX", "", "mouseY", "<anonymous parameter 2>", "", "invoke" })
static final class ScreenshotScrollComponent$setScrollBarComponent$3 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ boolean $isHorizontal;
    final /* synthetic */ ScreenshotScrollComponent this$0;
    final /* synthetic */ UIComponent $component;
    
    ScreenshotScrollComponent$setScrollBarComponent$3(final ScreenshotScrollComponent $receiver, final UIComponent $component) {
        this.$isHorizontal = false;
        this.this$0 = $receiver;
        this.$component = $component;
        super(4);
    }
    
    public final void invoke$2bfbe426(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (ScreenshotScrollComponent.access$getVerticalDragBeginPos$p(this.this$0) == -1.0f) {
            return;
        }
        ScreenshotScrollComponent.access$updateGrip(this.this$0, this.$component, mouseY, false);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        final UIComponent uiComponent = (UIComponent)p1;
        final float floatValue = ((Number)p2).floatValue();
        final float floatValue2 = ((Number)p3).floatValue();
        ((Number)p4).intValue();
        this.invoke$2bfbe426(uiComponent, floatValue, floatValue2);
        return Unit.INSTANCE;
    }
}