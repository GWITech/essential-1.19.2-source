package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.cosmetics.*;

public class ServerCosmeticsUserEquippedPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @NotNull
    private final Map<CosmeticSlot, String> equipped;
    
    public ServerCosmeticsUserEquippedPacket(@NotNull final UUID uuid, @NotNull final Map<CosmeticSlot, String> equipped) {
        super();
        this.equipped = equipped;
        this.uuid = uuid;
    }
    
    @NotNull
    public Map<CosmeticSlot, String> getEquipped() {
        return this.equipped;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
}
