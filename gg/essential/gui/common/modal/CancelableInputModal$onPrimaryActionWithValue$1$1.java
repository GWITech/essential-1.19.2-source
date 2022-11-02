package gg.essential.gui.common.modal;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class CancelableInputModal$onPrimaryActionWithValue$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ CancelableInputModal $this_apply;
    
    CancelableInputModal$onPrimaryActionWithValue$1$1(final Function1<? super String, Unit> $callback, final CancelableInputModal $receiver) {
        this.$callback = $callback;
        this.$this_apply = $receiver;
        super(0);
    }
    
    public final void invoke() {
        this.$callback.invoke((Object)this.$this_apply.getInputTextState().get());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}