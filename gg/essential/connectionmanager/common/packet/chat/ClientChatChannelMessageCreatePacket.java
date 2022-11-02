package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientChatChannelMessageCreatePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    @NotNull
    private final String content;
    @SerializedName("c")
    @Nullable
    private final Long replyTargetId;
    
    public ClientChatChannelMessageCreatePacket(final long channelId, @NotNull final String content) {
        super();
        this.channelId = channelId;
        this.content = content;
        this.replyTargetId = null;
    }
    
    public ClientChatChannelMessageCreatePacket(final long channelId, @NotNull final String content, @Nullable final Long replyTargetId) {
        super();
        this.channelId = channelId;
        this.content = content;
        this.replyTargetId = replyTargetId;
    }
}
