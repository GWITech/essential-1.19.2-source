package gg.essential.gui.common.modal;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class UserSelectionModal$onPrimaryActionWithValue$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Set<UUID>, Unit> $callback;
    final /* synthetic */ UserSelectionModal $this_apply;
    
    UserSelectionModal$onPrimaryActionWithValue$1$1(final Function1<? super Set<UUID>, Unit> $callback, final UserSelectionModal $receiver) {
        this.$callback = $callback;
        this.$this_apply = $receiver;
        super(0);
    }
    
    public final void invoke() {
        this.$callback.invoke(UserSelectionModal.access$getSelectedUsers$p(this.$this_apply).get());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}