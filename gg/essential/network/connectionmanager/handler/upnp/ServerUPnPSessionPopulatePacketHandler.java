package gg.essential.network.connectionmanager.handler.upnp;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.upnp.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.upnp.model.*;
import gg.essential.network.connectionmanager.sps.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerUPnPSessionPopulatePacketHandler extends PacketHandler<ServerUPnPSessionPopulatePacket>
{
    public ServerUPnPSessionPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerUPnPSessionPopulatePacket packet) {
        final SPSManager spsManager = connectionManager.getSpsManager();
        for (final UPnPSession session : packet.getSessions()) {
            spsManager.addRemoteSession(session);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerUPnPSessionPopulatePacket)packet);
    }
}
