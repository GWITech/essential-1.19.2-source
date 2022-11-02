package gg.essential.gui.friends.state;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.chat.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0018\u0010
                                                   \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/state/IMessengerManager;", "", "channelDeleted", "", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "channelUpdated", "messageDeleted", "message", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "messageReceived", "newChannel", "reset", "essential" })
public interface IMessengerManager
{
    void messageDeleted(@NotNull final Message p0);
    
    void messageReceived(@NotNull final Channel p0, @NotNull final Message p1);
    
    void channelUpdated(@NotNull final Channel p0);
    
    void newChannel(@NotNull final Channel p0);
    
    void channelDeleted(@NotNull final Channel p0);
    
    void reset();
}
