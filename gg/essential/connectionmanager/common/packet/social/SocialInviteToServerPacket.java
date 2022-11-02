package gg.essential.connectionmanager.common.packet.social;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class SocialInviteToServerPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @NotNull
    private final String address;
    
    public SocialInviteToServerPacket(@NotNull final UUID uuid, @NotNull final String address) {
        super();
        this.uuid = uuid;
        this.address = address;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
    
    @NotNull
    public String getAddress() {
        return this.address;
    }
}
