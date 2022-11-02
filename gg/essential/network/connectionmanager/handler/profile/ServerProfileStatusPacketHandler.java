package gg.essential.network.connectionmanager.handler.profile;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.profile.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerProfileStatusPacketHandler extends PacketHandler<ServerProfileStatusPacket>
{
    public ServerProfileStatusPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerProfileStatusPacket packet) {
        connectionManager.getProfileManager().setPlayerStatus(packet.getUUID(), packet.getStatus());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerProfileStatusPacket)packet);
    }
}
