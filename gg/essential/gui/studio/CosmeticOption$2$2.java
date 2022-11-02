package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/network/cosmetics/Cosmetic;", "invoke" })
static final class CosmeticOption$2$2 extends Lambda implements Function1<Map<CosmeticSlot, Cosmetic>, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$2$2(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Map<CosmeticSlot, Cosmetic> $this$updatePreviewingCosmetics) {
        Intrinsics.checkNotNullParameter((Object)$this$updatePreviewingCosmetics, "$this$updatePreviewingCosmetics");
        $this$updatePreviewingCosmetics.remove(CosmeticOption.access$getShopCategory$p(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Map)p1);
        return Unit.INSTANCE;
    }
}