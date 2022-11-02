package gg.essential.gui.friends.message.v2;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ParagraphLine;", "Lgg/essential/gui/friends/message/v2/MessageLine;", "messageContent", "", "wrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "(Ljava/lang/String;Lgg/essential/gui/friends/message/v2/MessageWrapper;)V", "getMessageContent", "()Ljava/lang/String;", "essential" })
public abstract class ParagraphLine extends MessageLine
{
    @NotNull
    private final String messageContent;
    
    public ParagraphLine(@NotNull final String messageContent, @NotNull final MessageWrapper wrapper) {
        Intrinsics.checkNotNullParameter((Object)messageContent, "messageContent");
        Intrinsics.checkNotNullParameter((Object)wrapper, "wrapper");
        super(wrapper, (byte)0);
        this.messageContent = messageContent;
    }
    
    @NotNull
    public final String getMessageContent() {
        return this.messageContent;
    }
}
