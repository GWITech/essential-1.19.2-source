package gg.essential.elementa.state;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "T", "invoke" })
static final class State$onSetValue$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ State<T> this$0;
    final /* synthetic */ Function1<T, Unit> $listener;
    
    State$onSetValue$1(final State<T> $receiver, final Function1<? super T, Unit> $listener) {
        this.this$0 = $receiver;
        this.$listener = $listener;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.getListeners().remove(this.$listener);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}