package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ServerUPnPSessionRemovePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Set<UUID> hostUUIDs;
    
    public ServerUPnPSessionRemovePacket(@NotNull final UUID hostUUID) {
        this(Collections.singleton(hostUUID));
    }
    
    public ServerUPnPSessionRemovePacket(@NotNull final Set<UUID> hostUUIDs) {
        super();
        this.hostUUIDs = hostUUIDs;
    }
    
    @NotNull
    public Set<UUID> getHostUUIDs() {
        return this.hostUUIDs;
    }
}
