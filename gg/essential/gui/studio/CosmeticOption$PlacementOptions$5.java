package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.util.*;
import kotlin.collections.*;
import java.util.*;
import java.util.function.*;
import com.google.common.collect.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "newValue", "", "invoke" })
static final class CosmeticOption$PlacementOptions$5 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    final /* synthetic */ String $cosmeticId;
    final /* synthetic */ PlacementOptions this$1;
    final /* synthetic */ Map<String, ImmutableList<CosmeticSetting>> $currentSettings;
    final /* synthetic */ int $index;
    
    CosmeticOption$PlacementOptions$5(final CosmeticOption $receiver, final String $cosmeticId, final PlacementOptions $receiver, final Map<String, ImmutableList<CosmeticSetting>> $currentSettings, final int $index) {
        this.this$0 = $receiver;
        this.$cosmeticId = $cosmeticId;
        this.this$1 = $receiver;
        this.$currentSettings = $currentSettings;
        this.$index = $index;
        super(1);
    }
    
    public final void invoke(final int newValue) {
        final ImmutableMap<String, ImmutableList<CosmeticSetting>> cosmeticSettings = CosmeticOption.access$getCosmeticsManager$p(this.this$0).getCosmeticSettings(UUIDUtil.getClientUUID());
        List mutableList = null;
        Label_0052: {
            if (cosmeticSettings != null) {
                final ImmutableList list = cosmeticSettings.get(this.$cosmeticId);
                if (list != null && (mutableList = CollectionsKt.toMutableList((Collection)list)) != null) {
                    break Label_0052;
                }
            }
            mutableList = new ArrayList();
        }
        final List newSettings = mutableList;
        final int[] access$getState = PlacementOptions.access$getState(this.this$1, this.$currentSettings, this.$cosmeticId, newSettings);
        final int $index = this.$index;
        final int[] it = access$getState;
        it[$index] = newValue;
        final int[] array = access$getState;
        final int currentX = array[0];
        final int currentY = array[1];
        final int currentZ = array[2];
        final Map data = new LinkedHashMap();
        data.put("x", currentX);
        data.put("y", currentY);
        data.put("z", currentZ);
        newSettings.removeIf(CosmeticOption$PlacementOptions$5::invoke$lambda-1);
        newSettings.add(new CosmeticSetting(this.$cosmeticId, "PLAYER_POSITION_ADJUSTMENT", true, data));
        CosmeticOption.access$getCosmeticsManager$p(this.this$0).updateCosmeticSettings(this.this$0.getCosmetic().getId(), newSettings);
    }
    
    private static final boolean invoke$lambda-1(final String $cosmeticId, final CosmeticSetting it) {
        Intrinsics.checkNotNullParameter((Object)$cosmeticId, "$cosmeticId");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.getId(), (Object)$cosmeticId) && Intrinsics.areEqual((Object)it.getType(), (Object)"PLAYER_POSITION_ADJUSTMENT");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
}