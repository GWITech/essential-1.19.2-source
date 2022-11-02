package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.upnp.*;

public class ClientUPnPSessionCreatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String ip;
    @SerializedName("b")
    private final int port;
    @SerializedName("c")
    @NotNull
    private final UPnPPrivacy privacy;
    
    public ClientUPnPSessionCreatePacket(@NotNull final String ip, final int port, @NotNull final UPnPPrivacy privacy) {
        super();
        this.ip = ip;
        this.port = port;
        this.privacy = privacy;
    }
}
