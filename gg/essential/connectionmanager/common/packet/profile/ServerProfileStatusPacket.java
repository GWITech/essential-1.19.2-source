package gg.essential.connectionmanager.common.packet.profile;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.connectionmanager.common.enums.*;
import org.jetbrains.annotations.*;

public class ServerProfileStatusPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @Nullable
    private final ProfileStatus status;
    
    public ServerProfileStatusPacket(@NotNull final UUID uuid, @Nullable final ProfileStatus status) {
        super();
        this.uuid = uuid;
        this.status = status;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
    
    @Nullable
    public ProfileStatus getStatus() {
        return this.status;
    }
}
