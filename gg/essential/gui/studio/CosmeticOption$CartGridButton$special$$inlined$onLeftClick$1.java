package gg.essential.gui.studio;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    final /* synthetic */ State $hovered$inlined;
    
    public CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1(final CosmeticOption this$0, final State $hovered$inlined) {
        this.this$0 = this$0;
        this.$hovered$inlined = $hovered$inlined;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final UIClickEvent it2 = it;
            it2.stopPropagation();
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            if (this.this$0.getCosmeticStudio().getImplicitCartItems().get().contains(this.this$0.getCosmetic().getId())) {
                final CosmeticSlot access$getShopCategory$p = CosmeticOption.access$getShopCategory$p(this.this$0);
                if (access$getShopCategory$p == null) {
                    return;
                }
                final CosmeticSlot shopCategory = access$getShopCategory$p;
                this.this$0.getCosmeticStudio().updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new CosmeticOption$CartGridButton$7$1(shopCategory));
                this.this$0.getCosmeticStudio().getExplicitCartItems().set((kotlin.jvm.functions.Function1<? super Object, ?>)new CosmeticOption$CartGridButton$7$2(this.this$0));
            }
            else {
                this.this$0.getCosmeticStudio().getExplicitCartItems().set((kotlin.jvm.functions.Function1<? super Object, ?>)new CosmeticOption$CartGridButton$7$3(this.this$0));
            }
            this.$hovered$inlined.set(false);
            this.$hovered$inlined.set(true);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}