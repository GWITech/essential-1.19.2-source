package gg.essential.elementa.markdown;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.markdown.selection.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class MarkdownComponent$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ MarkdownComponent this$0;
    
    MarkdownComponent$1(final MarkdownComponent $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final float xShift = $this$onMouseClick.getLeft() - MarkdownComponent.access$getBaseX$p(this.this$0);
        final float yShift = $this$onMouseClick.getTop() - MarkdownComponent.access$getBaseY$p(this.this$0);
        MarkdownComponent.access$setCursor$p(this.this$0, this.this$0.getDrawables().cursorAt(it.getAbsoluteX() - xShift, it.getAbsoluteY() - yShift, false, it.getMouseButton()));
        final Selection access$getSelection$p = MarkdownComponent.access$getSelection$p(this.this$0);
        if (access$getSelection$p != null) {
            access$getSelection$p.remove();
        }
        MarkdownComponent.access$setSelection$p(this.this$0, null);
        $this$onMouseClick.releaseWindowFocus();
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}