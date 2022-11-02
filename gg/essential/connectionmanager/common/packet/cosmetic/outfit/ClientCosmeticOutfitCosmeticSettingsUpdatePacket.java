package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.cosmetics.model.*;

public class ClientCosmeticOutfitCosmeticSettingsUpdatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String outfitId;
    @SerializedName("b")
    @NotNull
    private final String cosmeticId;
    @SerializedName("c")
    @NotNull
    private final List<CosmeticSetting> settings;
    
    public ClientCosmeticOutfitCosmeticSettingsUpdatePacket(@NotNull final String outfitId, @NotNull final String cosmeticId, @NotNull final List<CosmeticSetting> settings) {
        super();
        this.outfitId = outfitId;
        this.cosmeticId = cosmeticId;
        this.settings = settings;
    }
}
