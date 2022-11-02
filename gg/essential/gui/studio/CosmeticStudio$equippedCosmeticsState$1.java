package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "", "invoke" })
static final class CosmeticStudio$equippedCosmeticsState$1 extends Lambda implements Function0<Map<CosmeticSlot, ? extends String>> {
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$equippedCosmeticsState$1(final CosmeticStudio $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Map<CosmeticSlot, String> invoke() {
        return this.this$0.getEquippedCosmetics();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}