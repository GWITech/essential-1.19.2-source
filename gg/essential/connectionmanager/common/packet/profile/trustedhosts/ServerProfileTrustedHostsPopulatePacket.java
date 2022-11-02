package gg.essential.connectionmanager.common.packet.profile.trustedhosts;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.profiles.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerProfileTrustedHostsPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final TrustedHost[] trustedHosts;
    
    public ServerProfileTrustedHostsPopulatePacket(@NotNull final TrustedHost trustedHost) {
        this(new TrustedHost[] { trustedHost });
    }
    
    public ServerProfileTrustedHostsPopulatePacket(@NotNull final TrustedHost[] trustedHosts) {
        super();
        this.trustedHosts = trustedHosts;
    }
    
    @NotNull
    public TrustedHost[] getTrustedHosts() {
        return this.trustedHosts;
    }
}
