package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke" })
static final class CosmeticStudio$9 extends Lambda implements Function1<Pair<? extends Integer, ? extends Category>, Unit> {
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$9(final CosmeticStudio $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<Integer, ? extends Category> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final int index = ((Number)pair.component1()).intValue();
        final Category category = (Category)pair.component2();
        EssentialConfig.INSTANCE.setWardrobeSortOption(index);
        EssentialConfig.INSTANCE.markDirty();
        CosmeticStudio.access$sortCosmeticOptions(this.this$0, SortOption.Companion.fromIndex(index), category);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<Integer, ? extends Category>)p1);
        return Unit.INSTANCE;
    }
}