package gg.essential.vigilance;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.function.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "T", "obj", "", "invoke" })
static final class Vigilant$registerListener$3 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Consumer<T> $listener;
    
    Vigilant$registerListener$3(final Consumer<T> $listener) {
        this.$listener = $listener;
        super(1);
    }
    
    public final void invoke(@Nullable final Object obj) {
        this.$listener.accept(obj);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}