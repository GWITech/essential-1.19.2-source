package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class MenuButton$labelState$1 extends Lambda implements Function1<Pair<? extends String, ? extends Float>, String> {
    final /* synthetic */ MenuButton this$0;
    
    MenuButton$labelState$1(final MenuButton $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Pair<String, Float> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final String text = (String)pair.component1();
        final float width = ((Number)pair.component2()).floatValue();
        final MenuButton this$0 = this.this$0;
        String text2;
        if ((text2 = text) == null) {
            text2 = "";
        }
        return MenuButton.access$truncateLabel(this$0, text2, width);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
}