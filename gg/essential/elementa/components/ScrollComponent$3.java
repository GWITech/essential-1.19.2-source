package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "event", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class ScrollComponent$3 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ ScrollComponent this$0;
    
    ScrollComponent$3(final ScrollComponent $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)event, "event");
        ScrollComponent.access$onClick(this.this$0, event.getRelativeX(), event.getRelativeY(), event.getMouseButton());
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}