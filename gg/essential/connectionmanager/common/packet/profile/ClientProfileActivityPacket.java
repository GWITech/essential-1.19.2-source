package gg.essential.connectionmanager.common.packet.profile;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.enums.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientProfileActivityPacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final ActivityType type;
    @SerializedName("c")
    @Nullable
    private final String metadata;
    
    public ClientProfileActivityPacket(@Nullable final ActivityType type, @Nullable final String metadata) {
        super();
        this.type = type;
        this.metadata = metadata;
    }
}
