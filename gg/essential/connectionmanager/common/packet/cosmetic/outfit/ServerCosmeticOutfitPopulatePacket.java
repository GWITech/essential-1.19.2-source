package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.cosmetics.model.*;
import org.jetbrains.annotations.*;

public class ServerCosmeticOutfitPopulatePacket extends Packet
{
    @NotNull
    private final List<CosmeticOutfit> outfits;
    
    public ServerCosmeticOutfitPopulatePacket(@NotNull final List<CosmeticOutfit> outfits) {
        super();
        this.outfits = outfits;
    }
    
    @NotNull
    public List<CosmeticOutfit> getOutfits() {
        return this.outfits;
    }
}
