package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ClientChatChannelMessageReadStatePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    private final long messageId;
    @SerializedName("c")
    private final boolean state;
    
    public ClientChatChannelMessageReadStatePacket(final long channelId, final long messageId, final boolean state) {
        super();
        this.channelId = channelId;
        this.messageId = messageId;
        this.state = state;
    }
}
