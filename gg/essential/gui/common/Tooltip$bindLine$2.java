package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class Tooltip$bindLine$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Tooltip this$0;
    final /* synthetic */ Float $wrapAtWidth;
    final /* synthetic */ Function1<UIText, Unit> $configure;
    
    Tooltip$bindLine$2(final Tooltip $receiver, final Float $wrapAtWidth, final Function1<? super UIText, Unit> $configure) {
        this.this$0 = $receiver;
        this.$wrapAtWidth = $wrapAtWidth;
        this.$configure = $configure;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this.this$0.clearLines();
        this.this$0.addLine(it, this.$wrapAtWidth, (Function1<? super UIText, Unit>)this.$configure);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}