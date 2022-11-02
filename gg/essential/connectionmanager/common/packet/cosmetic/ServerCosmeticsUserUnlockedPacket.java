package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class ServerCosmeticsUserUnlockedPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<String> unlocked;
    @SerializedName("b")
    private final boolean occurredFromPurchase;
    @SerializedName("c")
    @Nullable
    private final UUID targetUUID;
    
    public ServerCosmeticsUserUnlockedPacket(@NotNull final List<String> unlocked, @Nullable final UUID targetUUID) {
        this(unlocked, false, targetUUID);
    }
    
    public ServerCosmeticsUserUnlockedPacket(@NotNull final List<String> unlocked, final boolean occurredFromPurchase, @Nullable final UUID targetUUID) {
        super();
        this.unlocked = unlocked;
        this.occurredFromPurchase = occurredFromPurchase;
        this.targetUUID = targetUUID;
    }
    
    @NotNull
    public List<String> getUnlocked() {
        return this.unlocked;
    }
    
    public boolean occurredFromPurchase() {
        return this.occurredFromPurchase;
    }
}
