package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ClientChatChannelMessagesRetrievePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    private final Long before;
    @SerializedName("c")
    private final Long after;
    @SerializedName("d")
    private final int limit;
    
    public ClientChatChannelMessagesRetrievePacket(final long channelId, final Long before, final Long after, final int limit) {
        super();
        this.channelId = channelId;
        this.before = before;
        this.after = after;
        this.limit = limit;
    }
}
