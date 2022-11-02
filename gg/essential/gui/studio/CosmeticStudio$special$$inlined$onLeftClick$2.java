package gg.essential.gui.studio;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class CosmeticStudio$special$$inlined$onLeftClick$2 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ CosmeticStudio this$0;
    
    public CosmeticStudio$special$$inlined$onLeftClick$2(final CosmeticStudio this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            if (!this.this$0.getCartItems().get().isEmpty()) {
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
                CosmeticStudio.access$getBuyButtonText$p(this.this$0).set("Redirecting...");
                CosmeticStudio.purchase$default$56acfba4$10dedc8(this.this$0, (Function0)new Function0<Unit>(this.this$0) {
                    final /* synthetic */ CosmeticStudio this$0;
                    
                    CosmeticStudio$buyButton$2$1(final CosmeticStudio $receiver) {
                        this.this$0 = $receiver;
                        super(0);
                    }
                    
                    public final void invoke() {
                        CosmeticStudio.access$getBuyButtonText$p(this.this$0).set("Buy");
                    }
                    
                    public /* bridge */ Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }
                });
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}