package gg.essential.connectionmanager.common.packet.social;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class SocialInviteToServerCancelPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    
    public SocialInviteToServerCancelPacket(@NotNull final UUID uuid) {
        super();
        this.uuid = uuid;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
}
