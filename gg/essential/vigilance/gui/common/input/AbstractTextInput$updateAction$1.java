package gg.essential.vigilance.gui.common.input;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class AbstractTextInput$updateAction$1 extends Lambda implements Function1<String, Unit> {
    public static final AbstractTextInput$updateAction$1 INSTANCE;
    
    AbstractTextInput$updateAction$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
    
    static {
        AbstractTextInput$updateAction$1.INSTANCE = new AbstractTextInput$updateAction$1();
    }
}