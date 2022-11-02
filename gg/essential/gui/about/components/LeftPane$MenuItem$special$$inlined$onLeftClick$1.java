package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.modal.*;
import java.net.*;
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
public static final class LeftPane$MenuItem$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ MenuItem this$0;
    final /* synthetic */ Page $page$inlined;
    final /* synthetic */ BasicState $selectedPage$inlined;
    
    public LeftPane$MenuItem$special$$inlined$onLeftClick$1(final MenuItem this$0, final Page $page$inlined, final BasicState $selectedPage$inlined) {
        this.this$0 = this$0;
        this.$page$inlined = $page$inlined;
        this.$selectedPage$inlined = $selectedPage$inlined;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0 && !(boolean)LeftPane.MenuItem.access$getSelected$p(this.this$0).get()) {
            if (this.$page$inlined instanceof final LinkPage linkPage) {
                OpenLinkModal.Companion.openUrl(new URI(linkPage.getLink()));
            }
            else {
                this.$selectedPage$inlined.set(this.$page$inlined);
            }
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}