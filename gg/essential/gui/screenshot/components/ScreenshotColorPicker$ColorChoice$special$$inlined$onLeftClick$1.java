package gg.essential.gui.screenshot.components;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ ScreenshotColorPicker this$0;
    final /* synthetic */ ColorChoice this$1$inlined;
    
    public ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1(final ScreenshotColorPicker this$0, final ColorChoice this$1$inlined) {
        this.this$0 = this$0;
        this.this$1$inlined = this$1$inlined;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            if (ScreenshotColorPicker.access$getActiveColorIndex$p(this.this$0).get().intValue() != this.this$1$inlined.getIndex()) {
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            }
            ScreenshotColorPicker.access$getActiveColorIndex$p(this.this$0).set((Function1)new ScreenshotColorPicker$ColorChoice$3$1(this.this$1$inlined));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}