package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)V" })
static final class ReadOnlyState$1 extends Lambda implements Function1<T, Unit> {
    final /* synthetic */ ReadOnlyState<T> this$0;
    
    ReadOnlyState$1(final ReadOnlyState<T> $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final T it) {
        ReadOnlyState.access$set$s80204913(this.this$0, it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}