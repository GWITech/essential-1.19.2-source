package gg.essential.gui.notification;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class Notification$7 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$7(final Notification $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        if (Notification.access$getDragging$p(this.this$0)) {
            Notification.access$setDragging$p(this.this$0, false);
            final float draggedPercentage = ((Number)RangesKt.coerceIn((Comparable)(Notification.access$getDraggedPixels$p(this.this$0).get().floatValue() / 170.0f * 100.0f), RangesKt.rangeTo(0.0f, 100.0f))).floatValue();
            if (Notification.access$getCouldBeAClick$p(this.this$0)) {
                this.this$0.getOnClick().invoke();
                Notification.access$setClicked(this.this$0, true);
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
                Notification.access$animateCompleteTimerNow(this.this$0);
            }
            else if (draggedPercentage < 25.0f) {
                Notification.access$springBack(this.this$0);
            }
            else {
                Notification.access$animateOutFast(this.this$0);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}