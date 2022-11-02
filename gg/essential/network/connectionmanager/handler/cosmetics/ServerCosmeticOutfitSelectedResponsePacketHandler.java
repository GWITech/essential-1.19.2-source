package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.outfit.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import gg.essential.cosmetics.model.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.cosmetics.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticOutfitSelectedResponsePacketHandler extends PacketHandler<ServerCosmeticOutfitSelectedResponsePacket>
{
    public ServerCosmeticOutfitSelectedResponsePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticOutfitSelectedResponsePacket packet) {
        final CosmeticsManager cosmeticsManager = connectionManager.getCosmeticsManager();
        final String skinTexture = packet.getSkinTexture();
        if (skinTexture != null && skinTexture.contains(";")) {
            final String[] split = skinTexture.split(";");
            Essential.getInstance().getGameProfileManager().updatePlayerSkin(packet.getUUID(), split[1], split[0].equals("1") ? "slim" : "default");
        }
        final Map<CosmeticSlot, String> equippedCosmetics = packet.getEquippedCosmetics();
        if (equippedCosmetics != null && !equippedCosmetics.isEmpty()) {
            cosmeticsManager.setEquippedCosmetics(packet.getUUID(), ConversionsKt.slotsToMod(equippedCosmetics));
        }
        else {
            cosmeticsManager.removeEquippedCosmetics(packet.getUUID());
        }
        final Map<String, List<CosmeticSetting>> cosmeticSettings = packet.getCosmeticSettings();
        if (cosmeticSettings != null && !cosmeticSettings.isEmpty()) {
            cosmeticsManager.setCosmeticSettings(packet.getUUID(), ConversionsKt.settingsToMod(cosmeticSettings));
        }
        else {
            cosmeticsManager.removeCosmeticSettings(packet.getUUID());
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticOutfitSelectedResponsePacket)packet);
    }
}
