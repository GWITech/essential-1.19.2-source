package gg.essential.gui.friends.message;

import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.friends.previews.*;
import gg.essential.gui.friends.message.v2.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020	H&J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020	H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010	0\b¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/friends/message/MessageScreen;", "Lgg/essential/elementa/components/UIContainer;", "()V", "preview", "Lgg/essential/gui/friends/previews/ChannelPreview;", "getPreview", "()Lgg/essential/gui/friends/previews/ChannelPreview;", "replyingTo", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "getReplyingTo", "()Lgg/essential/elementa/state/BasicState;", "markedManuallyUnread", "", "messageWrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "onClose", "retrySend", "message", "scrollToMessage", "essential" })
public abstract class MessageScreen extends UIContainer
{
    @NotNull
    private final BasicState<ClientMessage> replyingTo;
    
    public MessageScreen() {
        super();
        this.replyingTo = new BasicState<ClientMessage>(null);
    }
    
    @NotNull
    public final BasicState<ClientMessage> getReplyingTo() {
        return this.replyingTo;
    }
    
    @NotNull
    public abstract ChannelPreview getPreview();
    
    public abstract void onClose();
    
    public abstract void scrollToMessage(@NotNull final ClientMessage p0);
    
    public abstract void retrySend(@NotNull final ClientMessage p0);
    
    public abstract void markedManuallyUnread(@NotNull final MessageWrapper p0);
}
