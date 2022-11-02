package gg.essential.network.connectionmanager.handler.connection;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ConnectionRegisterPacketTypeIdPacketHandler extends PacketHandler<ConnectionRegisterPacketTypeIdPacket>
{
    public ConnectionRegisterPacketTypeIdPacketHandler() {
        super(false);
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ConnectionRegisterPacketTypeIdPacket packet) {
        connectionManager.getConnection().registerIncomingPacketTypeId(packet.getClassName(), packet.getPacketId());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ConnectionRegisterPacketTypeIdPacket)packet);
    }
}
