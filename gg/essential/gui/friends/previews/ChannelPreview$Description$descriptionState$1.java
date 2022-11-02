package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.elementa.impl.commonmark.renderer.text.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "message", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "invoke" })
static final class ChannelPreview$Description$descriptionState$1 extends Lambda implements Function1<Message, String> {
    final /* synthetic */ ChannelPreview this$0;
    
    ChannelPreview$Description$descriptionState$1(final ChannelPreview $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final String invoke(@Nullable final Message message) {
        String contents;
        if (message == null || (contents = message.getContents()) == null) {
            contents = (ExtensionsKt.isAnnouncement(this.this$0.getChannel()) ? "There are no announcements" : "Click to send a message!");
        }
        final String msg = contents;
        final String render = new TextContentRenderer.Builder().stripNewlines(false).build().render(Parser.builder().build().parse(msg));
        Intrinsics.checkNotNullExpressionValue((Object)render, "Builder().stripNewlines(\u2026.parse(msg)\n            )");
        return (String)StringsKt.split$default((CharSequence)render, new String[] { "\n" }, false, 0, 6, (Object)null).get(0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Message)p1);
    }
}