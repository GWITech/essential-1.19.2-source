package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ServerChatChannelRemovePacket extends Packet
{
    @SerializedName("a")
    private final long[] channelIds;
    
    public ServerChatChannelRemovePacket(final long channelId) {
        this(new long[] { channelId });
    }
    
    public ServerChatChannelRemovePacket(final long[] channelIds) {
        super();
        this.channelIds = channelIds;
    }
    
    public long[] getChannelIds() {
        return this.channelIds;
    }
}
