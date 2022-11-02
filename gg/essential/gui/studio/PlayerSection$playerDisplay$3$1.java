package gg.essential.gui.studio;

import gg.essential.cosmetics.source.*;
import kotlin.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import com.google.common.collect.*;
import gg.essential.mod.cosmetics.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0019
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¨\u0006\u0006""" }, d2 = { "gg/essential/gui/studio/PlayerSection$playerDisplay$3$1", "Lgg/essential/cosmetics/source/LiveCosmeticsSource;", "getCosmetics", "Lcom/google/common/collect/ImmutableMap;", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "", "essential" })
public static final class PlayerSection$playerDisplay$3$1 extends LiveCosmeticsSource {
    final /* synthetic */ PlayerSection this$0;
    
    PlayerSection$playerDisplay$3$1(final PlayerSection $receiver, final CosmeticsManager $super_call_param$1, final UUID $super_call_param$2) {
        this.this$0 = $receiver;
        super($super_call_param$1, $super_call_param$2);
    }
    
    @NotNull
    @Override
    public ImmutableMap<CosmeticSlot, String> getCosmetics() {
        final ImmutableMap<Object, Object> copy = (ImmutableMap<Object, Object>)ImmutableMap.copyOf((Map<? extends CosmeticSlot, ? extends String>)PlayerSection.access$getCosmeticStudio$p(this.this$0).getEquippedCosmetics());
        Intrinsics.checkNotNullExpressionValue((Object)copy, "copyOf(cosmeticStudio.getEquippedCosmetics())");
        return (ImmutableMap<CosmeticSlot, String>)copy;
    }
}