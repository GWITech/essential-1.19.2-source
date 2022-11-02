package gg.essential.network.connectionmanager.handler.profile.trustedhosts;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.profile.trustedhosts.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerProfileTrustedHostsClearPacketHandler extends PacketHandler<ServerProfileTrustedHostsClearPacket>
{
    public ServerProfileTrustedHostsClearPacketHandler() {
        super();
    }
    
    protected void onHandle$1f8a0618(@NotNull final ConnectionManager connectionManager) {
        connectionManager.getProfileManager().clearTrustedHosts();
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$1f8a0618(connectionManager);
    }
}
