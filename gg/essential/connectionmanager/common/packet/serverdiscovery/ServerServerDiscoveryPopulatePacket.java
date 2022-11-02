package gg.essential.connectionmanager.common.packet.serverdiscovery;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.serverdiscovery.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerServerDiscoveryPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<ServerDiscovery> servers;
    
    public ServerServerDiscoveryPopulatePacket(@NotNull final List<ServerDiscovery> servers) {
        super();
        this.servers = servers;
    }
    
    @NotNull
    public List<ServerDiscovery> getServers() {
        return this.servers;
    }
}
