package gg.essential.vigilance.gui.common.input;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "event", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class AbstractTextInput$3 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$3(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!this.this$0.getActive() || event.getMouseButton() != 0) {
            return;
        }
        final LinePosition clickedVisualPos = this.this$0.screenPosToVisualPos(event.getRelativeX(), event.getRelativeY());
        int clickCount = event.getClickCount() % 3;
        if (clickCount == 0 && clickedVisualPos.getLine() != this.this$0.getCursor().getLine()) {
            clickCount = 1;
        }
        else if (clickCount == 2 && !Intrinsics.areEqual((Object)this.this$0.getCursor(), (Object)clickedVisualPos)) {
            clickCount = 1;
        }
        switch (clickCount) {
            case 0: {
                this.this$0.setSelectionMode(SelectionMode.Line);
                this.this$0.setOtherSelectionEnd(clickedVisualPos.withColumn(((Line)this.this$0.getVisualLines().get(this.this$0.getCursor().getLine())).getLength()));
                this.this$0.setInitiallySelectedLine(this.this$0.getCursor().getLine());
                break;
            }
            case 1: {
                this.this$0.setSelectionMode(SelectionMode.Character);
                AbstractTextInput.access$setCursorPosition(this.this$0, clickedVisualPos);
                break;
            }
            case 2: {
                this.this$0.setSelectionMode(SelectionMode.Word);
                this.this$0.setCursor(this.this$0.getNearestWordBoundary(clickedVisualPos, AbstractTextInput$Direction.Left));
                this.this$0.setCursorNeedsRefocus(true);
                this.this$0.setOtherSelectionEnd(this.this$0.getNearestWordBoundary(clickedVisualPos, AbstractTextInput$Direction.Right));
                this.this$0.setInitiallySelectedWord((Pair<LinePosition, LinePosition>)TuplesKt.to((Object)this.this$0.getCursor(), (Object)this.this$0.getOtherSelectionEnd()));
                break;
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}