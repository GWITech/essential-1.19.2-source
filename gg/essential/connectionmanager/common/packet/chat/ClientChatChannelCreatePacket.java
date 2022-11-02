package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ClientChatChannelCreatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final ChannelType type;
    @SerializedName("b")
    @Nullable
    private final String name;
    @SerializedName("c")
    @NotNull
    private final UUID[] members;
    
    public ClientChatChannelCreatePacket(@NotNull final ChannelType type, @Nullable final String name, @NotNull final UUID[] members) {
        super();
        this.type = type;
        this.name = name;
        this.members = members;
    }
}
