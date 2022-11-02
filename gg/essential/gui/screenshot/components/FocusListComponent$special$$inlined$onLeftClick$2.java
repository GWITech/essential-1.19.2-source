package gg.essential.gui.screenshot.components;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   �\u0006\u0002\b\u0005�\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class FocusListComponent$special$$inlined$onLeftClick$2 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ FocusListComponent this$0;
    
    public FocusListComponent$special$$inlined$onLeftClick$2(final FocusListComponent this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final State favState = FocusListComponent.access$getScreenshotBrowser$p(this.this$0).getStateManager().getFavoriteState(this.this$0.getPreviewing());
            favState.set((Function1)FocusListComponent$2$1.INSTANCE);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}