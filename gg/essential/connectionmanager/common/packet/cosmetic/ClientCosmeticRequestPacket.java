package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticRequestPacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final Set<String> cosmeticIds;
    @SerializedName("b")
    @Nullable
    private final Set<Integer> packageIds;
    
    public ClientCosmeticRequestPacket(@Nullable final Set<String> cosmeticIds, @Nullable final Set<Integer> packageIds) {
        super();
        this.cosmeticIds = cosmeticIds;
        this.packageIds = packageIds;
    }
}
