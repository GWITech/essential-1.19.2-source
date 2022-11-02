package gg.essential.connectionmanager.common.packet.social;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientSocialDiscordRequestJoinServerResponsePacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final String address;
    
    public ClientSocialDiscordRequestJoinServerResponsePacket(@Nullable final String address) {
        super();
        this.address = address;
    }
}
