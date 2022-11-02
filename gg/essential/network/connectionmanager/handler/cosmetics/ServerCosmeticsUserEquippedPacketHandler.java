package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticsUserEquippedPacketHandler extends PacketHandler<ServerCosmeticsUserEquippedPacket>
{
    public ServerCosmeticsUserEquippedPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticsUserEquippedPacket packet) {
        connectionManager.getCosmeticsManager().setEquippedCosmetics(packet.getUUID(), ConversionsKt.slotsToMod(packet.getEquipped()));
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticsUserEquippedPacket)packet);
    }
}
