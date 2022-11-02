package gg.essential.connectionmanager.common.packet.ice;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class IceCandidatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID user;
    @SerializedName("b")
    @Nullable
    private final String candidate;
    
    public IceCandidatePacket(@NotNull final UUID user, @Nullable final String candidate) {
        super();
        this.user = user;
        this.candidate = candidate;
    }
    
    @NotNull
    public UUID getUser() {
        return this.user;
    }
    
    @Nullable
    public String getCandidate() {
        return this.candidate;
    }
}
