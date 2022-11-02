package gg.essential.elementa.state;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "T", "U", "it", "invoke", "(Ljava/lang/Object;)V" })
static final class ZippedState$removeSecondListener$1 extends Lambda implements Function1<U, Unit> {
    final /* synthetic */ ZippedState<T, U> this$0;
    
    ZippedState$removeSecondListener$1(final ZippedState<T, U> $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final U it) {
        this.this$0.set(TuplesKt.to(((Pair)this.this$0.get()).getFirst(), (Object)it));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}