package gg.essential.connectionmanager.common.packet.serverdiscovery;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ClientServerDiscoveryRequestPopulatePacket extends Packet
{
    @SerializedName("a")
    private final int protocolVersion;
    
    public ClientServerDiscoveryRequestPopulatePacket(final int protocolVersion) {
        super();
        this.protocolVersion = protocolVersion;
    }
}
