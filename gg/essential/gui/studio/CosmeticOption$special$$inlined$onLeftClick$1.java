package gg.essential.gui.studio;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class CosmeticOption$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    
    public CosmeticOption$special$$inlined$onLeftClick$1(final CosmeticOption this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final UIClickEvent event = it;
            final CosmeticSlot access$getShopCategory$p = CosmeticOption.access$getShopCategory$p(this.this$0);
            if (access$getShopCategory$p != null) {
                final CosmeticSlot shopCategory = access$getShopCategory$p;
                this.this$0.getCosmeticStudio().getExplicitCartItems().set((kotlin.jvm.functions.Function1<? super Object, ?>)new Function1<Set<? extends String>, Set<? extends String>>(this.this$0) {
                    final /* synthetic */ CosmeticOption this$0;
                    
                    CosmeticOption$removeCartButton$1$1(final CosmeticOption $receiver) {
                        this.this$0 = $receiver;
                        super(1);
                    }
                    
                    @NotNull
                    public final Set<String> invoke(@NotNull final Set<String> it) {
                        Intrinsics.checkNotNullParameter((Object)it, "it");
                        return SetsKt.minus((Set)it, (Object)this.this$0.getCosmetic().getId());
                    }
                    
                    public /* bridge */ Object invoke(final Object p1) {
                        return this.invoke((Set)p1);
                    }
                });
                this.this$0.getCosmeticStudio().updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new Function1<Map<CosmeticSlot, Cosmetic>, Unit>(shopCategory) {
                    final /* synthetic */ CosmeticSlot $shopCategory;
                    
                    CosmeticOption$removeCartButton$1$2(final CosmeticSlot $shopCategory) {
                        this.$shopCategory = $shopCategory;
                        super(1);
                    }
                    
                    public final void invoke(@NotNull final Map<CosmeticSlot, Cosmetic> $this$updatePreviewingCosmetics) {
                        Intrinsics.checkNotNullParameter((Object)$this$updatePreviewingCosmetics, "$this$updatePreviewingCosmetics");
                        $this$updatePreviewingCosmetics.remove(this.$shopCategory);
                    }
                    
                    public /* bridge */ Object invoke(final Object p1) {
                        this.invoke((Map)p1);
                        return Unit.INSTANCE;
                    }
                });
                event.stopPropagation();
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}