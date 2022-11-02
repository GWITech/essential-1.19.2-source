package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticOutfitSkinUpdatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String outfitId;
    @SerializedName("b")
    @NotNull
    private final String skinTexture;
    
    public ClientCosmeticOutfitSkinUpdatePacket(@NotNull final String outfitId, @NotNull final String skinTexture) {
        super();
        this.outfitId = outfitId;
        this.skinTexture = skinTexture;
    }
}
