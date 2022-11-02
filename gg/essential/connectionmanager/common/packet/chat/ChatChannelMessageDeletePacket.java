package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ChatChannelMessageDeletePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    private final long messageId;
    
    public ChatChannelMessageDeletePacket(final long channelId, final long messageId) {
        super();
        this.channelId = channelId;
        this.messageId = messageId;
    }
    
    public long getChannelId() {
        return this.channelId;
    }
    
    public long getMessageId() {
        return this.messageId;
    }
}
