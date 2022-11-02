package gg.essential.connectionmanager.common.packet.cosmetic.categories;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.cosmetics.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerCosmeticCategoriesPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<CosmeticCategory> categories;
    
    public ServerCosmeticCategoriesPopulatePacket(@NotNull final List<CosmeticCategory> categories) {
        super();
        this.categories = categories;
    }
    
    @NotNull
    public List<CosmeticCategory> getCategories() {
        return this.categories;
    }
}
