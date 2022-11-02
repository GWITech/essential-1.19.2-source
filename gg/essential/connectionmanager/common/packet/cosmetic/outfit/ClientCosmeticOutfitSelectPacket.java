package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticOutfitSelectPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String outfitId;
    
    public ClientCosmeticOutfitSelectPacket(@NotNull final String outfitId) {
        super();
        this.outfitId = outfitId;
    }
}
