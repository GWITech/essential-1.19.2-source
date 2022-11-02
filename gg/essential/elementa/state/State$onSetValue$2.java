package gg.essential.elementa.state;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.function.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)V" })
static final class State$onSetValue$2 extends Lambda implements Function1<T, Unit> {
    final /* synthetic */ Consumer<T> $listener;
    
    State$onSetValue$2(final Consumer<T> $listener) {
        this.$listener = $listener;
        super(1);
    }
    
    public final void invoke(final T it) {
        this.$listener.accept(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}