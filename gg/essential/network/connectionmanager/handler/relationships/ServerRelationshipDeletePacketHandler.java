package gg.essential.network.connectionmanager.handler.relationships;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.relationships.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerRelationshipDeletePacketHandler extends PacketHandler<ServerRelationshipDeletePacket>
{
    public ServerRelationshipDeletePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerRelationshipDeletePacket packet) {
        connectionManager.getRelationshipManager().removeRelationship(packet.getRelationship());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerRelationshipDeletePacket)packet);
    }
}
