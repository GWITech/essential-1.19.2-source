package gg.essential.gui.studio;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import gg.essential.*;
import gg.essential.connectionmanager.common.packet.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class CosmeticOption$special$$inlined$onLeftClick$3 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    
    public CosmeticOption$special$$inlined$onLeftClick$3(final CosmeticOption this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            if ((!CosmeticOption.access$getSettingsImage$p(this.this$0).getHasParent() || !CosmeticOption.access$getSettingsImage$p(this.this$0).isHovered()) && !this.this$0.getEditingPlacement().get()) {
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
                if (CosmeticOption.access$getShopCategory$p(this.this$0) != null) {
                    this.this$0.getCosmeticStudio().queueNoticeClear(this.this$0.getCosmetic().getId());
                    if (CosmeticOption.access$getView$p(this.this$0).get() != View.Cart && CosmeticOption.access$isPurchased(this.this$0)) {
                        if (Intrinsics.areEqual((Object)CosmeticOption.access$getCosmeticsManager$p(this.this$0).getEquippedCosmetics().get(CosmeticOption.access$getShopCategory$p(this.this$0)), (Object)this.this$0.getCosmetic().getId())) {
                            CosmeticOption.access$getCosmeticsManager$p(this.this$0).updateEquippedCosmetic(CosmeticOption.access$getShopCategory$p(this.this$0), null);
                        }
                        else {
                            this.this$0.getCosmeticStudio().updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new CosmeticOption$2$1(this.this$0));
                            CosmeticOption.access$getCosmeticsManager$p(this.this$0).updateEquippedCosmetic(CosmeticOption.access$getShopCategory$p(this.this$0), this.this$0.getCosmetic().getId());
                        }
                    }
                    else if (!CosmeticOption.access$isPurchased(this.this$0)) {
                        if (CosmeticOption.access$isPreviewing$p(this.this$0).get()) {
                            this.this$0.getCosmeticStudio().updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new Function1<Map<CosmeticSlot, Cosmetic>, Unit>(this.this$0) {
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
                            });
                        }
                        else {
                            this.this$0.getCosmeticStudio().updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new Function1<Map<CosmeticSlot, Cosmetic>, Unit>(this.this$0) {
                                final /* synthetic */ CosmeticOption this$0;
                                
                                CosmeticOption$2$3(final CosmeticOption $receiver) {
                                    this.this$0 = $receiver;
                                    super(1);
                                }
                                
                                public final void invoke(@NotNull final Map<CosmeticSlot, Cosmetic> $this$updatePreviewingCosmetics) {
                                    Intrinsics.checkNotNullParameter((Object)$this$updatePreviewingCosmetics, "$this$updatePreviewingCosmetics");
                                    $this$updatePreviewingCosmetics.put(CosmeticOption.access$getShopCategory$p(this.this$0), this.this$0.getCosmetic());
                                }
                                
                                public /* bridge */ Object invoke(final Object p1) {
                                    this.invoke((Map)p1);
                                    return Unit.INSTANCE;
                                }
                            });
                            CosmeticOption.access$getCosmeticsManager$p(this.this$0).updateEquippedCosmetic(CosmeticOption.access$getShopCategory$p(this.this$0), null);
                            Essential.getInstance().getConnectionManager().send(new ClientTelemetryPacket("COSMETIC_PREVIEW", MapsKt.mapOf(new Pair((Object)"id", (Object)this.this$0.getCosmetic().getId()))));
                        }
                    }
                }
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}