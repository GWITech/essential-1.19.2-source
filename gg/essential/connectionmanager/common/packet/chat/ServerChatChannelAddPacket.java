package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerChatChannelAddPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<Channel> channels;
    
    public ServerChatChannelAddPacket(@NotNull final List<Channel> channels) {
        super();
        this.channels = channels;
    }
    
    @NotNull
    public List<Channel> getChannels() {
        return this.channels;
    }
}
