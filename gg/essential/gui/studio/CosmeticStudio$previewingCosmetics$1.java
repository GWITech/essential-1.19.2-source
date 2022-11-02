package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012*\u0010\u0004\u001a&\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0001\u0012\u0004\u0012\u00020\u00060\u0005H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "Lgg/essential/network/cosmetics/Cosmetic;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class CosmeticStudio$previewingCosmetics$1 extends Lambda implements Function1<Pair<? extends Map<Integer, ? extends Map<CosmeticSlot, ? extends Cosmetic>>, ? extends Integer>, Map<CosmeticSlot, ? extends Cosmetic>> {
    public static final CosmeticStudio$previewingCosmetics$1 INSTANCE;
    
    CosmeticStudio$previewingCosmetics$1() {
        super(1);
    }
    
    @NotNull
    public final Map<CosmeticSlot, Cosmetic> invoke(@NotNull final Pair<? extends Map<Integer, ? extends Map<CosmeticSlot, Cosmetic>>, Integer> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Map outfits = (Map)pair.component1();
        final int equipped = ((Number)pair.component2()).intValue();
        Map emptyMap;
        if ((emptyMap = outfits.get(equipped)) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        return emptyMap;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        CosmeticStudio$previewingCosmetics$1.INSTANCE = new CosmeticStudio$previewingCosmetics$1();
    }
}