package gg.essential.network.connectionmanager.handler.profile;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.profile.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerProfileActivityPacketHandler extends PacketHandler<ServerProfileActivityPacket>
{
    public ServerProfileActivityPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerProfileActivityPacket packet) {
        connectionManager.getProfileManager().setPlayerActivity(packet.getUUID(), packet.getType(), packet.getMetadata());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerProfileActivityPacket)packet);
    }
}
