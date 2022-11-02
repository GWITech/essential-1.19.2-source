package gg.essential.vigilance.gui.common.input;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIScrollEvent;", "invoke" })
static final class AbstractTextInput$2 extends Lambda implements Function2<UIComponent, UIScrollEvent, Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$2(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseScroll, @NotNull final UIScrollEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseScroll, "$this$onMouseScroll");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final float heightDifference = $this$onMouseScroll.getHeight() - this.this$0.getVisualLines().size() * this.this$0.getLineHeight();
        if (heightDifference > 0.0f) {
            return;
        }
        this.this$0.setTargetVerticalScrollingOffset(RangesKt.coerceIn(this.this$0.getTargetVerticalScrollingOffset() + (float)it.getDelta() * this.this$0.getLineHeight(), heightDifference, 0.0f));
        it.stopPropagation();
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIScrollEvent)p2);
        return Unit.INSTANCE;
    }
}