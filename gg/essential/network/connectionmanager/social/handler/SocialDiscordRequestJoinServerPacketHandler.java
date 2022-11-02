package gg.essential.network.connectionmanager.social.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.handlers.discord.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.social.*;
import gg.essential.network.connectionmanager.sps.*;

public class SocialDiscordRequestJoinServerPacketHandler extends PacketHandler<SocialDiscordRequestJoinServerPacket>
{
    public SocialDiscordRequestJoinServerPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final SocialDiscordRequestJoinServerPacket packet) {
        final UUID target = packet.getTargetUUID();
        final String address = DiscordIntegration.INSTANCE.getAddress(packet.getSecret());
        if (address != null) {
            DiscordIntegration.INSTANCE.getPartyManager().shouldAllowUserToJoin(target, (Function1<? super Boolean, Unit>)(accepted -> {
                if (accepted) {
                    final SPSManager spsManager = connectionManager.getSpsManager();
                    final HashSet<UUID> users = new HashSet<UUID>(spsManager.getInvitedUsers());
                    users.add(target);
                    spsManager.updateInvitedUsers(users);
                    connectionManager.respond(packet, new ClientSocialDiscordRequestJoinServerResponsePacket(address));
                }
                return null;
            }));
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (SocialDiscordRequestJoinServerPacket)packet);
    }
    
    private static /* synthetic */ Unit lambda$onHandle$0(final ConnectionManager connectionManager, final UUID target, final SocialDiscordRequestJoinServerPacket packet, final String address, final Boolean accepted) {
        if (accepted) {
            final SPSManager spsManager = connectionManager.getSpsManager();
            final HashSet<UUID> users = new HashSet<UUID>(spsManager.getInvitedUsers());
            users.add(target);
            spsManager.updateInvitedUsers(users);
            connectionManager.respond(packet, new ClientSocialDiscordRequestJoinServerResponsePacket(address));
        }
        return null;
    }
}
