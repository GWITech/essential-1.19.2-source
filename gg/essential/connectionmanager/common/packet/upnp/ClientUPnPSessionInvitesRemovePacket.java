package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientUPnPSessionInvitesRemovePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Set<UUID> uuids;
    
    public ClientUPnPSessionInvitesRemovePacket(@NotNull final Set<UUID> uuids) {
        super();
        this.uuids = uuids;
    }
}
