package gg.essential.connectionmanager.common.packet.profile.trustedhosts;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerProfileTrustedHostsRemovePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Set<String> ids;
    
    public ServerProfileTrustedHostsRemovePacket(@NotNull final Set<String> ids) {
        super();
        this.ids = ids;
    }
    
    @NotNull
    public Set<String> getIds() {
        return this.ids;
    }
}
