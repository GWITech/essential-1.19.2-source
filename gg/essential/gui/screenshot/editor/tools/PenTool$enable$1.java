package gg.essential.gui.screenshot.editor.tools;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import kotlin.*;
import gg.essential.elementa.utils.*;

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
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/components/UIContainer;", "mouseX", "", "mouseY", "mouseButton", "", "invoke" })
static final class PenTool$enable$1 extends Lambda implements Function4<UIContainer, Float, Float, Integer, Unit> {
    final /* synthetic */ PenTool this$0;
    
    PenTool$enable$1(final PenTool $receiver) {
        this.this$0 = $receiver;
        super(4);
    }
    
    public final void invoke(@NotNull final UIContainer $this$null, final float mouseX, final float mouseY, final int mouseButton) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
        final float relativeX = RangesKt.coerceIn(mouseX - $this$null.getLeft(), 0.0f, $this$null.getWidth());
        final float relativeY = RangesKt.coerceIn(mouseY - $this$null.getTop(), 0.0f, $this$null.getHeight());
        if (relativeX >= 0.0f && relativeY >= 0.0f && relativeX <= this.this$0.getEditableScreenshot().getWidth() && relativeY <= this.this$0.getEditableScreenshot().getHeight() && mouseButton == 0) {
            if ((this.this$0.getPreviousMouseX() != -1.0f || this.this$0.getPreviousMouseY() != -1.0f) && (relativeX != this.this$0.getPreviousMouseX() || relativeY != this.this$0.getPreviousMouseY())) {
                final PenTool.PenVectorStroke currentVectorStroke = this.this$0.getCurrentVectorStroke();
                if (currentVectorStroke != null) {
                    final ObservableList list = currentVectorStroke.getList();
                    if (list != null) {
                        list.add(TuplesKt.to((Object)(relativeX / $this$null.getWidth()), (Object)(relativeY / $this$null.getHeight())));
                    }
                }
            }
            this.this$0.setPreviousMouseX(relativeX);
            this.this$0.setPreviousMouseY(relativeY);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        this.invoke((UIContainer)p1, ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).intValue());
        return Unit.INSTANCE;
    }
}