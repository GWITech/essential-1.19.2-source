package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ChatChannelUpdatePacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    @Nullable
    private final String name;
    @SerializedName("c")
    @Nullable
    private final String topic;
    
    public ChatChannelUpdatePacket(final long channelId, @Nullable final String name, @Nullable final String topic) {
        super();
        this.channelId = channelId;
        this.name = name;
        this.topic = topic;
    }
    
    public long getChannelId() {
        return this.channelId;
    }
    
    @Nullable
    public String getName() {
        return this.name;
    }
    
    @Nullable
    public String getTopic() {
        return this.topic;
    }
}
