package gg.essential.gui.overlay;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIScrollEvent;", "invoke" })
static final class OverlayManagerImpl$handleScroll$finalHandler$1 extends Lambda implements Function2<UIComponent, UIScrollEvent, Unit> {
    final /* synthetic */ Ref$BooleanRef $consumed;
    
    OverlayManagerImpl$handleScroll$finalHandler$1(final Ref$BooleanRef $consumed) {
        this.$consumed = $consumed;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$null, @NotNull final UIScrollEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (!it.getPropagationStopped() && OverlayManagerImpl.access$isPassThrough(OverlayManagerImpl.INSTANCE, it.getTarget())) {
            this.$consumed.element = false;
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIScrollEvent)p2);
        return Unit.INSTANCE;
    }
}