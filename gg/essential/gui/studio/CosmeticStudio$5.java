package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "", "", "invoke" })
static final class CosmeticStudio$5 extends Lambda implements Function1<Pair<? extends Category, ? extends Set<? extends String>>, Unit> {
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$5(final CosmeticStudio $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<? extends Category, ? extends Set<String>> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Category category = (Category)pair.component1();
        CosmeticStudio.access$filterAndSortCosmeticOptions(this.this$0, category);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<? extends Category, ? extends Set<String>>)p1);
        return Unit.INSTANCE;
    }
}