package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/about/components/Page;", "invoke" })
static final class RightPane$2 extends Lambda implements Function1<Page, Unit> {
    final /* synthetic */ RightPane this$0;
    
    RightPane$2(final RightPane $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Page it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        RightPane.access$getScroller(this.this$0).scrollToTop(false);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Page)p1);
        return Unit.INSTANCE;
    }
}