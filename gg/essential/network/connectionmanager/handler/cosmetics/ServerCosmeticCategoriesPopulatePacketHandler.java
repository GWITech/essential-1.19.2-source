package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.categories.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.model.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticCategoriesPopulatePacketHandler extends PacketHandler<ServerCosmeticCategoriesPopulatePacket>
{
    private final CosmeticsManager cosmeticsManager;
    
    public ServerCosmeticCategoriesPopulatePacketHandler(final CosmeticsManager cosmeticsManager) {
        super();
        this.cosmeticsManager = cosmeticsManager;
    }
    
    protected void onHandle$2f7c2ed5(@NotNull final ServerCosmeticCategoriesPopulatePacket packet) {
        for (final CosmeticCategory category : packet.getCategories()) {
            this.cosmeticsManager.registerCategory(category);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$2f7c2ed5((ServerCosmeticCategoriesPopulatePacket)packet);
    }
}
