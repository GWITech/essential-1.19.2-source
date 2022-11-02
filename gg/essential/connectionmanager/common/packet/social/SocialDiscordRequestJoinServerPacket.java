package gg.essential.connectionmanager.common.packet.social;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class SocialDiscordRequestJoinServerPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID targetUUID;
    @SerializedName("b")
    @NotNull
    private final String secret;
    
    public SocialDiscordRequestJoinServerPacket(@NotNull final UUID targetUUID, @NotNull final String secret) {
        super();
        this.targetUUID = targetUUID;
        this.secret = secret;
    }
    
    @NotNull
    public UUID getTargetUUID() {
        return this.targetUUID;
    }
    
    @NotNull
    public String getSecret() {
        return this.secret;
    }
}
