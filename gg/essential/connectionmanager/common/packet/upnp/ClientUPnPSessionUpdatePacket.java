package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.upnp.*;

public class ClientUPnPSessionUpdatePacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final String ip;
    @SerializedName("b")
    @Nullable
    private final Integer port;
    @SerializedName("c")
    @Nullable
    private final UPnPPrivacy privacy;
    
    public ClientUPnPSessionUpdatePacket(@Nullable final String ip, @Nullable final Integer port, @Nullable final UPnPPrivacy privacy) {
        super();
        this.ip = ip;
        this.port = port;
        this.privacy = privacy;
    }
}
