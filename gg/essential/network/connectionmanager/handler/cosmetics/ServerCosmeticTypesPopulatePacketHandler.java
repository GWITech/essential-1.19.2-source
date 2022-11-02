package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.model.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticTypesPopulatePacketHandler extends PacketHandler<ServerCosmeticTypesPopulatePacket>
{
    public ServerCosmeticTypesPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticTypesPopulatePacket packet) {
        for (final CosmeticType cosmeticType : packet.getCosmeticTypes()) {
            connectionManager.getCosmeticsManager().addCosmeticType(cosmeticType);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticTypesPopulatePacket)packet);
    }
}
