package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
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
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007""" }, d2 = { "<anonymous>", "", "it", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/network/cosmetics/Cosmetic;", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;" })
static final class CosmeticOption$isPreviewing$1 extends Lambda implements Function1<Map<CosmeticSlot, ? extends Cosmetic>, Boolean> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$isPreviewing$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Map<CosmeticSlot, Cosmetic> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.get(CosmeticOption.access$getShopCategory$p(this.this$0)), (Object)this.this$0.getCosmetic());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Map)p1);
    }
}