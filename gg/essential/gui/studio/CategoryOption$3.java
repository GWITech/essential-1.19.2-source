package gg.essential.gui.studio;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.cosmetics.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "event", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class CategoryOption$3 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ CategoryOption this$0;
    
    CategoryOption$3(final CategoryOption $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (event.getMouseButton() == 0) {
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            CategoryOption.access$getCosmeticStudio$p(this.this$0).getSelectedCategory().set(CategoryOption.access$getCategory$p(this.this$0));
        }
        else if (CategoryOption.access$getCategory$p(this.this$0) instanceof CosmeticStudio.Category.Slot && event.getMouseButton() == 1 && (boolean)CategoryOption.access$getEquipped$p(this.this$0).get()) {
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            CategoryOption.access$getCosmeticStudio$p(this.this$0).updatePreviewingCosmetics((Function1<? super Map<CosmeticSlot, Cosmetic>, Unit>)new CategoryOption$3.CategoryOption$3$1(this.this$0));
            Essential.getInstance().getConnectionManager().getCosmeticsManager().updateEquippedCosmetic(((CosmeticStudio.Category.Slot)CategoryOption.access$getCategory$p(this.this$0)).getSlot(), null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}