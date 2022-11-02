package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.cosmetics.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticAnimationTriggerPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final CosmeticSlot slot;
    @SerializedName("b")
    @NotNull
    private final String triggerName;
    
    public ClientCosmeticAnimationTriggerPacket(@NotNull final CosmeticSlot slot, @NotNull final String triggerName) {
        super();
        this.slot = slot;
        this.triggerName = triggerName;
    }
}
