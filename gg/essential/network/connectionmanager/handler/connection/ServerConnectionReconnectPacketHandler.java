package gg.essential.network.connectionmanager.handler.connection;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import java.util.*;
import gg.essential.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerConnectionReconnectPacketHandler extends PacketHandler<ServerConnectionReconnectPacket>
{
    public ServerConnectionReconnectPacketHandler() {
        super();
    }
    
    protected void onHandle$5a7a7145(@NotNull final ConnectionManager connectionManager) {
        connectionManager.close(CloseReason.SERVER_REQUESTED_RECONNECT);
        Objects.requireNonNull(connectionManager);
        Multithreading.runAsync(connectionManager::connect);
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$5a7a7145(connectionManager);
    }
}
