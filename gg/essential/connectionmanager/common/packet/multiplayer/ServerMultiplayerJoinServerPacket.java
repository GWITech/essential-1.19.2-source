package gg.essential.connectionmanager.common.packet.multiplayer;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerMultiplayerJoinServerPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String address;
    
    public ServerMultiplayerJoinServerPacket(@NotNull final String address) {
        super();
        this.address = address;
    }
    
    @NotNull
    public String getAddress() {
        return this.address;
    }
}
