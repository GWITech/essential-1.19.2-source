package gg.essential.elementa.effects;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class RecursiveFadeEffect$OverridableAlphaColorConstraint$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OverridableAlphaColorConstraint this$0;
    
    RecursiveFadeEffect$OverridableAlphaColorConstraint$1(final OverridableAlphaColorConstraint $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        this.this$0.setRecalculate(true);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}