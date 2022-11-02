package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientUPnPSessionPingProxyUpdatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String rawJson;
    
    public ClientUPnPSessionPingProxyUpdatePacket(@NotNull final String rawJson) {
        super();
        this.rawJson = rawJson;
    }
}
