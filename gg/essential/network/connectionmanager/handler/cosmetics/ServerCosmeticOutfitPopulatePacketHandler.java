package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.outfit.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import gg.essential.cosmetics.model.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticOutfitPopulatePacketHandler extends PacketHandler<ServerCosmeticOutfitPopulatePacket>
{
    public ServerCosmeticOutfitPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticOutfitPopulatePacket packet) {
        final CosmeticsManager cosmeticsManager = connectionManager.getCosmeticsManager();
        final Map<String, gg.essential.mod.cosmetics.CosmeticOutfit> outfits = cosmeticsManager.getOutfits();
        gg.essential.mod.cosmetics.CosmeticOutfit selected = null;
        for (final gg.essential.mod.cosmetics.CosmeticOutfit outfit : ConversionsKt.outfitsToMod(packet.getOutfits())) {
            outfits.put(outfit.getId(), outfit);
            if (outfit.isSelected()) {
                selected = outfit;
            }
        }
        cosmeticsManager.setSelectedOutfit(selected);
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticOutfitPopulatePacket)packet);
    }
}
