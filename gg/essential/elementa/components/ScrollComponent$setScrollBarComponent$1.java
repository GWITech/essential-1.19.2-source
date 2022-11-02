package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIScrollEvent;", "invoke" })
static final class ScrollComponent$setScrollBarComponent$1 extends Lambda implements Function2<UIComponent, UIScrollEvent, Unit> {
    final /* synthetic */ boolean $isHorizontal;
    final /* synthetic */ ScrollComponent this$0;
    
    ScrollComponent$setScrollBarComponent$1(final boolean $isHorizontal, final ScrollComponent $receiver) {
        this.$isHorizontal = $isHorizontal;
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseScroll, @NotNull final UIScrollEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseScroll, "$this$onMouseScroll");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (this.$isHorizontal && ScrollComponent.access$getHorizontalScrollEnabled$p(this.this$0) && UKeyboard.isShiftKeyDown()) {
            ScrollComponent.access$onScroll(this.this$0, (float)it.getDelta(), true);
        }
        else if (!this.$isHorizontal && ScrollComponent.access$getVerticalScrollEnabled$p(this.this$0)) {
            ScrollComponent.access$onScroll(this.this$0, (float)it.getDelta(), false);
        }
        it.stopPropagation();
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIScrollEvent)p2);
        return Unit.INSTANCE;
    }
}