package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class Tooltip$showTooltip$onRemoved$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UIComponent $this_onRemoved;
    final /* synthetic */ Observer $observer;
    
    Tooltip$showTooltip$onRemoved$1(final UIComponent $receiver, final Observer $observer) {
        this.$this_onRemoved = $receiver;
        this.$observer = $observer;
        super(0);
    }
    
    public final void invoke() {
        this.$this_onRemoved.getParent().getChildren().deleteObserver(this.$observer);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}