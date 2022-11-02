package gg.essential.gui.notification;

import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.ranges.*;

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
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "mouseX", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "invoke" })
static final class Notification$8 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$8(final Notification $receiver) {
        this.this$0 = $receiver;
        super(4);
    }
    
    public final void invoke$2bfbe426(@NotNull final UIComponent $this$onMouseDrag, final float mouseX) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (Notification.access$getDragging$p(this.this$0)) {
            Notification.access$getDraggedPixels$p(this.this$0).set((Function1)new Notification$8.Notification$8$1(mouseX, this.this$0));
            final float draggedPercentage = ((Number)RangesKt.coerceIn((Comparable)(Notification.access$getDraggedPixels$p(this.this$0).get().floatValue() / 170.0f * 100.0f), RangesKt.rangeTo(0.0f, 100.0f))).floatValue();
            if (draggedPercentage > 2.0f) {
                Notification.access$setCouldBeAClick$p(this.this$0, false);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        final UIComponent $this$onMouseDrag = (UIComponent)p1;
        final float floatValue = ((Number)p2).floatValue();
        ((Number)p3).floatValue();
        ((Number)p4).intValue();
        this.invoke$2bfbe426($this$onMouseDrag, floatValue);
        return Unit.INSTANCE;
    }
}