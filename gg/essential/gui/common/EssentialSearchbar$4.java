package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ?\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class EssentialSearchbar$4 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ EssentialSearchbar this$0;
    
    EssentialSearchbar$4(final EssentialSearchbar $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (!Intrinsics.areEqual((Object)it, (Object)this.this$0.getSearchInput().getText())) {
            this.this$0.getSearchInput().setText(it);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}