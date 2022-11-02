package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.cosmetics.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticOutfitEquippedCosmeticsUpdatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String outfitId;
    @SerializedName("b")
    @NotNull
    private final CosmeticSlot slot;
    @SerializedName("c")
    @Nullable
    private final String cosmeticId;
    
    public ClientCosmeticOutfitEquippedCosmeticsUpdatePacket(@NotNull final String outfitId, @NotNull final CosmeticSlot slot, @Nullable final String cosmeticId) {
        super();
        this.outfitId = outfitId;
        this.slot = slot;
        this.cosmeticId = cosmeticId;
    }
}
