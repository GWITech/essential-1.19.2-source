package gg.essential.network.connectionmanager.handler.connection;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerConnectionKeepAlivePacketHandler extends PacketHandler<ConnectionKeepAlivePacket>
{
    public ServerConnectionKeepAlivePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ConnectionKeepAlivePacket packet) {
        connectionManager.getConnection().setLastReceivedKeepAlive(System.currentTimeMillis());
        connectionManager.respond(packet, new ConnectionKeepAlivePacket());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ConnectionKeepAlivePacket)packet);
    }
}
