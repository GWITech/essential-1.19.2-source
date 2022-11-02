package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticCheckoutPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Set<String> cosmeticIds;
    
    public ClientCosmeticCheckoutPacket(@NotNull final Set<String> cosmeticIds) {
        super();
        this.cosmeticIds = cosmeticIds;
    }
}
