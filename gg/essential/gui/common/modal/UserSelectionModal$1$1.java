package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "filter", "", "invoke" })
static final class UserSelectionModal$1$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ UserSelectionModal this$0;
    
    UserSelectionModal$1$1(final UserSelectionModal $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final String filter) {
        Intrinsics.checkNotNullParameter((Object)filter, "filter");
        UserSelectionModal.access$getScroller(this.this$0).filterChildren((Function1<? super UIComponent, Boolean>)new UserSelectionModal$1$1.UserSelectionModal$1$1$1(filter));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}