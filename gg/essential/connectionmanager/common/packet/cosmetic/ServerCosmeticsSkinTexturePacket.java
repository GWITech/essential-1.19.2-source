package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerCosmeticsSkinTexturePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @Nullable
    private final String skinTexture;
    
    public ServerCosmeticsSkinTexturePacket(@NotNull final UUID uuid, @Nullable final String skinTexture) {
        super();
        this.uuid = uuid;
        this.skinTexture = skinTexture;
    }
    
    @NotNull
    public UUID getUuid() {
        return this.uuid;
    }
    
    @Nullable
    public String getSkinTexture() {
        return this.skinTexture;
    }
}
