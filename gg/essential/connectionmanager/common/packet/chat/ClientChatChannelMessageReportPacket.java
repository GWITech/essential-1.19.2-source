package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientChatChannelMessageReportPacket extends Packet
{
    @SerializedName("a")
    private final long channelId;
    @SerializedName("b")
    private final long messageId;
    @SerializedName("c")
    @NotNull
    private final String reason;
    
    public ClientChatChannelMessageReportPacket(final long channelId, final long messageId, @NotNull final String reason) {
        super();
        this.channelId = channelId;
        this.messageId = messageId;
        this.reason = reason;
    }
}
