package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientUPnPSessionInvitesAddPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Set<UUID> uuids;
    
    public ClientUPnPSessionInvitesAddPacket(@NotNull final Set<UUID> uuids) {
        super();
        this.uuids = uuids;
    }
}
