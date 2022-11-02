package gg.essential.network.connectionmanager.handler.upnp;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.upnp.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.sps.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerUPnPSessionRemovePacketHandler extends PacketHandler<ServerUPnPSessionRemovePacket>
{
    public ServerUPnPSessionRemovePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerUPnPSessionRemovePacket packet) {
        final SPSManager spsManager = connectionManager.getSpsManager();
        for (final UUID hostUUID : packet.getHostUUIDs()) {
            spsManager.removeRemoteSession(hostUUID);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerUPnPSessionRemovePacket)packet);
    }
}
