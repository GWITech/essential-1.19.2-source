package gg.essential.network.connectionmanager.serverdiscovery.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.serverdiscovery.*;
import gg.essential.network.connectionmanager.serverdiscovery.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.serverdiscovery.model.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerServerDiscoveryPopulatePacketHandler extends PacketHandler<ServerServerDiscoveryPopulatePacket>
{
    @NotNull
    private final ServerDiscoveryManager serverDiscoveryManager;
    
    public ServerServerDiscoveryPopulatePacketHandler(@NotNull final ServerDiscoveryManager serverDiscoveryManager) {
        super();
        this.serverDiscoveryManager = serverDiscoveryManager;
    }
    
    protected void onHandle$329a7d8e(@NotNull final ServerServerDiscoveryPopulatePacket packet) {
        this.serverDiscoveryManager.resetState();
        this.serverDiscoveryManager.addServers(packet.getServers());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$329a7d8e((ServerServerDiscoveryPopulatePacket)packet);
    }
}
