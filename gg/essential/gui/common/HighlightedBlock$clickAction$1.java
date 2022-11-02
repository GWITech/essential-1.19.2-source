package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class HighlightedBlock$clickAction$1 extends Lambda implements Function1<UIClickEvent, Unit> {
    public static final HighlightedBlock$clickAction$1 INSTANCE;
    
    HighlightedBlock$clickAction$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIClickEvent)p1);
        return Unit.INSTANCE;
    }
    
    static {
        HighlightedBlock$clickAction$1.INSTANCE = new HighlightedBlock$clickAction$1();
    }
}