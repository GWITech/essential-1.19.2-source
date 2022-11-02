package gg.essential.network.connectionmanager.handler.relationships;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.relationships.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.model.relationships.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerRelationshipPopulatePacketHandler extends PacketHandler<ServerRelationshipPopulatePacket>
{
    public ServerRelationshipPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerRelationshipPopulatePacket packet) {
        for (final Relationship relationship : packet.getRelationships()) {
            connectionManager.getRelationshipManager().createRelationship(relationship);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerRelationshipPopulatePacket)packet);
    }
}
