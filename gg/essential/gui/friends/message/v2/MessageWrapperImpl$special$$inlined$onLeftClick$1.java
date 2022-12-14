package gg.essential.gui.friends.message.v2;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ?\u0006\u0002\b\u0005?\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class MessageWrapperImpl$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ MessageWrapperImpl this$0;
    
    public MessageWrapperImpl$special$$inlined$onLeftClick$1(final MessageWrapperImpl this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0 && MessageWrapperImpl.access$getReplyToWeakState$p(this.this$0) != null) {
            final ClientMessage messageRef = MessageWrapperImpl.access$getReplyToWeakState$p(this.this$0).get();
            if (messageRef == null) {
                MessageWrapperImpl.access$getReplyToWeakState$p(this.this$0).onSetValue((Function1)new MessageWrapperImpl$replyContextContainer$4$1(this.this$0));
            }
            else if (!Intrinsics.areEqual((Object)messageRef, (Object)MessageRef.Companion.getDELETED())) {
                MessageWrapperImpl.access$getMessageScreen$p(this.this$0).scrollToMessage(messageRef);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}