package gg.essential.gui.friends.message;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class MessageTitleBar$Member$2 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ Member this$0;
    final /* synthetic */ MessageTitleBar this$1;
    
    MessageTitleBar$Member$2(final Member $receiver, final MessageTitleBar $receiver) {
        this.this$0 = $receiver;
        this.this$1 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() > 1) {
            return;
        }
        if (!Intrinsics.areEqual((Object)Member.access$getMember$p(this.this$0), (Object)UUIDUtil.getClientUUID())) {
            final List options = new ArrayList();
            if (Intrinsics.areEqual((Object)MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getCreatedInfo().getBy(), (Object)UUIDUtil.getClientUUID()) && MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getType() == ChannelType.GROUP_DIRECT_MESSAGE) {
                options.add(new OptionMenu.Option("Remove from group", null, EssentialPalette.CANCEL_5X, null, null, null, null, (Function0)new MessageTitleBar$Member$2.MessageTitleBar$Member$2$1(this.this$1, this.this$0), 122));
            }
            MessageTitleBar.access$getGui$p(this.this$1).showUserDropdown(Member.access$getMember$p(this.this$0), new OptionMenu.Position($this$onMouseClick, true), options, (Function0<Unit>)MessageTitleBar$Member$2.MessageTitleBar$Member$2$2.INSTANCE);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}