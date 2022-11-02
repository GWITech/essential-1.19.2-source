package gg.essential.connectionmanager.common.packet.cosmetic.outfit;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticOutfitSelectedRequestPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    
    public ClientCosmeticOutfitSelectedRequestPacket(@NotNull final UUID uuid) {
        super();
        this.uuid = uuid;
    }
}
