package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerUPnPSessionInviteAddPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID hostUUID;
    
    public ServerUPnPSessionInviteAddPacket(@NotNull final UUID hostUUID) {
        super();
        this.hostUUID = hostUUID;
    }
    
    @NotNull
    public UUID getHostUUID() {
        return this.hostUUID;
    }
}
