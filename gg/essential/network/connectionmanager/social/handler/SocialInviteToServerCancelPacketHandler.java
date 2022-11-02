package gg.essential.network.connectionmanager.social.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.social.*;
import gg.essential.network.connectionmanager.social.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class SocialInviteToServerCancelPacketHandler extends PacketHandler<SocialInviteToServerCancelPacket>
{
    @NotNull
    private final SocialManager socialManager;
    
    public SocialInviteToServerCancelPacketHandler(@NotNull final SocialManager socialManager) {
        super();
        this.socialManager = socialManager;
    }
    
    protected void onHandle$2f77f930(@NotNull final SocialInviteToServerCancelPacket packet) {
        this.socialManager.removeIncomingServerInvite(packet.getUUID());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$2f77f930((SocialInviteToServerCancelPacket)packet);
    }
}
