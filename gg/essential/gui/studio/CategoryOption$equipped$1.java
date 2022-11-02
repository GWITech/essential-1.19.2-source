package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007""" }, d2 = { "<anonymous>", "", "it", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;" })
static final class CategoryOption$equipped$1 extends Lambda implements Function1<Map<CosmeticSlot, ? extends String>, Boolean> {
    final /* synthetic */ CategoryOption this$0;
    
    CategoryOption$equipped$1(final CategoryOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Map<CosmeticSlot, String> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return CategoryOption.access$getCategory$p(this.this$0) instanceof CosmeticStudio.Category.Slot && it.containsKey(((CosmeticStudio.Category.Slot)CategoryOption.access$getCategory$p(this.this$0)).getSlot());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Map)p1);
    }
}