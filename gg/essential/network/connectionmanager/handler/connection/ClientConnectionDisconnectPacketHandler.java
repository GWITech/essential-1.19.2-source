package gg.essential.network.connectionmanager.handler.connection;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ClientConnectionDisconnectPacketHandler extends PacketHandler<ClientConnectionDisconnectPacket>
{
    public ClientConnectionDisconnectPacketHandler() {
        super();
    }
    
    protected void onHandle$2902e456(@NotNull final ConnectionManager connectionManager) {
        connectionManager.close(CloseReason.SERVER_REQUESTED);
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$2902e456(connectionManager);
    }
}
