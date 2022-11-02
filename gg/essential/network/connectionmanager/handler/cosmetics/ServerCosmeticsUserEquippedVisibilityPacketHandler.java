package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticsUserEquippedVisibilityPacketHandler extends PacketHandler<ServerCosmeticsUserEquippedVisibilityPacket>
{
    public ServerCosmeticsUserEquippedVisibilityPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticsUserEquippedVisibilityPacket packet) {
        connectionManager.getCosmeticsManager().setOwnCosmeticsVisible(packet.getState());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticsUserEquippedVisibilityPacket)packet);
    }
}
