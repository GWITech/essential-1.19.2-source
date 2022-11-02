package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.model.*;
import gg.essential.gui.studio.*;
import gg.essential.elementa.components.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticsPopulatePacketHandler extends PacketHandler<ServerCosmeticsPopulatePacket>
{
    public ServerCosmeticsPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticsPopulatePacket packet) {
        final CosmeticsManager cosmeticsManager = connectionManager.getCosmeticsManager();
        for (final Cosmetic cosmetic : packet.getCosmetics()) {
            if (cosmetic.getType() == null) {
                continue;
            }
            cosmeticsManager.addCosmetic(cosmetic);
        }
        cosmeticsManager.loadDevCosmetics();
        final CosmeticStudio gui = CosmeticStudio.getInstance();
        if (gui != null) {
            final Window.Companion companion = Window.Companion;
            final CosmeticStudio obj = gui;
            Objects.requireNonNull(obj);
            companion.enqueueRenderOperation(obj::populateCosmetics);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticsPopulatePacket)packet);
    }
}
