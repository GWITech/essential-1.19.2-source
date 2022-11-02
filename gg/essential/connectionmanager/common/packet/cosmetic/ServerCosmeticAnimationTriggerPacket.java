package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.*;

public class ServerCosmeticAnimationTriggerPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID userId;
    @SerializedName("b")
    @NotNull
    private final CosmeticSlot cosmeticSlot;
    @SerializedName("c")
    @NotNull
    private final String triggerName;
    
    public ServerCosmeticAnimationTriggerPacket(@NotNull final UUID userId, @NotNull final CosmeticSlot cosmeticSlot, @NotNull final String triggerName) {
        super();
        this.userId = userId;
        this.cosmeticSlot = cosmeticSlot;
        this.triggerName = triggerName;
    }
    
    @NotNull
    public UUID getUserId() {
        return this.userId;
    }
    
    @NotNull
    public CosmeticSlot getCosmeticSlot() {
        return this.cosmeticSlot;
    }
    
    @NotNull
    public String getTriggerName() {
        return this.triggerName;
    }
}
