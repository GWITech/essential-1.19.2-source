package gg.essential.gui.studio;

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
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke" })
static final class CosmeticStudio$4 extends Lambda implements Function1<Category, Unit> {
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$4(final CosmeticStudio $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Category it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        CosmeticStudio.access$getOptionsView(this.this$0).scrollToTop(true);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Category)p1);
        return Unit.INSTANCE;
    }
}