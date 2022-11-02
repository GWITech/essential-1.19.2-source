package gg.essential.elementa.utils;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0004\n\u0002\b\t\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00012\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "<anonymous>", "R", "A", "B", "C", "arg1", "arg2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;" })
static final class BindingKt$bindLast$2 extends Lambda implements Function2<A, B, R> {
    final /* synthetic */ Function3<A, B, C, R> $this_bindLast;
    final /* synthetic */ C $arg3;
    
    BindingKt$bindLast$2(final Function3<? super A, ? super B, ? super C, ? extends R> $receiver, final C $arg3) {
        this.$this_bindLast = $receiver;
        this.$arg3 = $arg3;
        super(2);
    }
    
    public final R invoke(final A arg1, final B arg2) {
        return (R)this.$this_bindLast.invoke((Object)arg1, (Object)arg2, this.$arg3);
    }
}