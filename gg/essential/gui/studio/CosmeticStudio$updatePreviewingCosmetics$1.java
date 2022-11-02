package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.function.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0010\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u0001H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/network/cosmetics/Cosmetic;", "outfits", "invoke" })
static final class CosmeticStudio$updatePreviewingCosmetics$1 extends Lambda implements Function1<Map<Integer, ? extends Map<CosmeticSlot, ? extends Cosmetic>>, Map<Integer, ? extends Map<CosmeticSlot, ? extends Cosmetic>>> {
    final /* synthetic */ CosmeticStudio this$0;
    final /* synthetic */ Function1<Map<CosmeticSlot, Cosmetic>, Unit> $update;
    
    CosmeticStudio$updatePreviewingCosmetics$1(final CosmeticStudio $receiver, final Function1<? super Map<CosmeticSlot, Cosmetic>, Unit> $update) {
        this.this$0 = $receiver;
        this.$update = $update;
        super(1);
    }
    
    @NotNull
    public final Map<Integer, Map<CosmeticSlot, Cosmetic>> invoke(@NotNull final Map<Integer, ? extends Map<CosmeticSlot, Cosmetic>> outfits) {
        Intrinsics.checkNotNullParameter((Object)outfits, "outfits");
        final Map mutableMap = MapsKt.toMutableMap((Map)outfits);
        final CosmeticStudio this$0 = this.this$0;
        final Function1 $update = this.$update;
        final Map $this$invoke_u24lambda_u2d1 = mutableMap;
        $this$invoke_u24lambda_u2d1.compute(this$0.getEquippedOutfit().get(), CosmeticStudio$updatePreviewingCosmetics$1::invoke$lambda-1$lambda-0);
        return mutableMap;
    }
    
    private static final Map invoke$lambda-1$lambda-0(final Function1 $update, final Integer n, final Map outfit) {
        Intrinsics.checkNotNullParameter((Object)$update, "$update");
        Intrinsics.checkNotNullParameter((Object)n, "<anonymous parameter 0>");
        Map mutableMap;
        if (outfit == null || (mutableMap = MapsKt.toMutableMap(outfit)) == null) {
            mutableMap = new LinkedHashMap();
        }
        final Map map = mutableMap;
        $update.invoke((Object)map);
        return map;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Map)p1);
    }
}