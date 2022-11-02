package gg.essential.connectionmanager.common.packet.cosmetic.categories;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.*;

public class ClientCosmeticCategoriesRequestPacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final Set<String> identifiers;
    @SerializedName("b")
    @Nullable
    private final Set<CosmeticSlot> slots;
    @SerializedName("c")
    @Nullable
    private final Set<String> tags;
    
    public ClientCosmeticCategoriesRequestPacket(@Nullable final Set<String> identifiers, @Nullable final Set<CosmeticSlot> slots, @Nullable final Set<String> tags) {
        super();
        this.identifiers = identifiers;
        this.slots = slots;
        this.tags = tags;
    }
}
