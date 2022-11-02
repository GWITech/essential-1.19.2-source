package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ClientChatChannelMutePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    private final boolean muted;
    
    public ClientChatChannelMutePacket(final long channelId, final boolean muted) {
        super();
        this.channelId = channelId;
        this.muted = muted;
    }
}
