package gg.essential.vigilance.gui;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n�\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class Searchbar$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Searchbar this$0;
    
    Searchbar$3(final Searchbar $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this.this$0.getTextContent().set(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}