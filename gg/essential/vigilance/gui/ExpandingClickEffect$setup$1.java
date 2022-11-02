package gg.essential.vigilance.gui;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class ExpandingClickEffect$setup$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ExpandingClickEffect this$0;
    
    ExpandingClickEffect$setup$1(final ExpandingClickEffect $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        ComponentsKt.childOf((UIComponent)ExpandingClickEffect.access$getCircle$p(this.this$0), Window.Companion.of(ExpandingClickEffect.access$getBoundComponent(this.this$0)));
        ExpandingClickEffect.access$getCircle$p(this.this$0).hide(true);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}