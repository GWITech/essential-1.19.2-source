package gg.essential.connectionmanager.common.packet.profile;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.connectionmanager.common.enums.*;
import org.jetbrains.annotations.*;

public class ServerProfileActivityPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @Nullable
    private final ActivityType type;
    @SerializedName("c")
    @Nullable
    private final String metadata;
    
    public ServerProfileActivityPacket(@NotNull final UUID uuid, @Nullable final ActivityType type, @Nullable final String metadata) {
        super();
        this.uuid = uuid;
        this.type = type;
        this.metadata = metadata;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
    
    @Nullable
    public ActivityType getType() {
        return this.type;
    }
    
    @Nullable
    public String getMetadata() {
        return this.metadata;
    }
}
