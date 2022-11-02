package gg.essential.network.connectionmanager.handler.profile.trustedhosts;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.profile.trustedhosts.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.profile.*;
import gg.essential.profiles.model.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerProfileTrustedHostsPopulatePacketHandler extends PacketHandler<ServerProfileTrustedHostsPopulatePacket>
{
    public ServerProfileTrustedHostsPopulatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerProfileTrustedHostsPopulatePacket packet) {
        final ProfileManager profileManager = connectionManager.getProfileManager();
        for (final TrustedHost trustedHost : packet.getTrustedHosts()) {
            profileManager.addTrustedHost(trustedHost);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerProfileTrustedHostsPopulatePacket)packet);
    }
}
