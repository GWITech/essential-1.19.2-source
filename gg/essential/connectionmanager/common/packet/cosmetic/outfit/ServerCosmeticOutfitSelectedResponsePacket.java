package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.*;
import java.util.*;
import gg.essential.cosmetics.model.*;

public class ServerCosmeticOutfitSelectedResponsePacket extends Packet
{
    @NotNull
    private final UUID uuid;
    @Nullable
    private final String skinTexture;
    @Nullable
    private final Map<CosmeticSlot, String> equippedCosmetics;
    @Nullable
    private final Map<String, List<CosmeticSetting>> cosmeticSettings;
    
    public ServerCosmeticOutfitSelectedResponsePacket(@NotNull final UUID uuid, @Nullable final String skinTexture, @Nullable final Map<CosmeticSlot, String> equippedCosmetics, @Nullable final Map<String, List<CosmeticSetting>> cosmeticSettings) {
        super();
        this.uuid = uuid;
        this.skinTexture = skinTexture;
        this.equippedCosmetics = equippedCosmetics;
        this.cosmeticSettings = cosmeticSettings;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
    
    @Nullable
    public String getSkinTexture() {
        return this.skinTexture;
    }
    
    @Nullable
    public Map<CosmeticSlot, String> getEquippedCosmetics() {
        return this.equippedCosmetics;
    }
    
    @Nullable
    public Map<String, List<CosmeticSetting>> getCosmeticSettings() {
        return this.cosmeticSettings;
    }
}
