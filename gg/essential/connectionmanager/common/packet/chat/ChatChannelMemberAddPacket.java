package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class ChatChannelMemberAddPacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    @NotNull
    private final UUID[] members;
    
    public ChatChannelMemberAddPacket(final long channelId, @NotNull final UUID[] members) {
        super();
        this.channelId = channelId;
        this.members = members;
    }
    
    public long getChannelId() {
        return this.channelId;
    }
    
    @NotNull
    public UUID[] getMembers() {
        return this.members;
    }
}
