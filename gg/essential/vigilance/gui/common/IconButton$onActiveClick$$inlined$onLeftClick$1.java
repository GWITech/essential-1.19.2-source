package gg.essential.vigilance.gui.common;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n�\u0006\u0002\b\u0005�\u0006\u0006" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class IconButton$onActiveClick$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ IconButton this$0;
    final /* synthetic */ Function0 $action$inlined;
    
    public IconButton$onActiveClick$$inlined$onLeftClick$1(final IconButton this$0, final Function0 $action$inlined) {
        this.this$0 = this$0;
        this.$action$inlined = $action$inlined;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final UIComponent $this$onActiveClick_u24lambda_u2d5 = $this$onMouseClick;
            final int n = 0;
            if (IconButton.access$getEnabledState$p(this.this$0).get()) {
                this.$action$inlined.invoke();
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}