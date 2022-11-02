package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class EssentialDropDown$applyExpandedBlockHeight$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $counterInstance;
    final /* synthetic */ EssentialDropDown this$0;
    
    EssentialDropDown$applyExpandedBlockHeight$1$1(final int $counterInstance, final EssentialDropDown $receiver) {
        this.$counterInstance = $counterInstance;
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        if (this.$counterInstance == EssentialDropDown.access$getAnimationCounter$p(this.this$0)) {
            EssentialDropDown.access$getDropdownAnimating$p(this.this$0).set(false);
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}