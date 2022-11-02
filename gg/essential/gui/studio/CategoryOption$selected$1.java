package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke", "(Lgg/essential/gui/studio/CosmeticStudio$Category;)Ljava/lang/Boolean;" })
static final class CategoryOption$selected$1 extends Lambda implements Function1<CosmeticStudio.Category, Boolean> {
    final /* synthetic */ CategoryOption this$0;
    
    CategoryOption$selected$1(final CategoryOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final CosmeticStudio.Category it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it, (Object)CategoryOption.access$getCategory$p(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((CosmeticStudio.Category)p1);
    }
}