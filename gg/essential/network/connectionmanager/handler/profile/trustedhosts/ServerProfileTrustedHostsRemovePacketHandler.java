package gg.essential.network.connectionmanager.handler.profile.trustedhosts;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.profile.trustedhosts.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.profile.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerProfileTrustedHostsRemovePacketHandler extends PacketHandler<ServerProfileTrustedHostsRemovePacket>
{
    public ServerProfileTrustedHostsRemovePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerProfileTrustedHostsRemovePacket packet) {
        final ProfileManager profileManager = connectionManager.getProfileManager();
        for (final String trustedHostId : packet.getIds()) {
            profileManager.removeTrustedHost(trustedHostId);
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerProfileTrustedHostsRemovePacket)packet);
    }
}
