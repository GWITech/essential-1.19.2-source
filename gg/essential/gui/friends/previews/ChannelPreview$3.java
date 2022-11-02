package gg.essential.gui.friends.previews;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.message.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.friends.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class ChannelPreview$3 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ ChannelPreview this$0;
    
    ChannelPreview$3(final ChannelPreview $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() != 1) {
            return;
        }
        ChannelPreview.access$getDropdownOpen$p(this.this$0).set(true);
        SocialMenu.showManagementDropdown$default$af9a4a5$3af8509(this.this$0.getGui(), this.this$0, new OptionMenu.Position(it.getAbsoluteX(), it.getAbsoluteY()), (Function0)new ChannelPreview$3.ChannelPreview$3$1(this.this$0));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}