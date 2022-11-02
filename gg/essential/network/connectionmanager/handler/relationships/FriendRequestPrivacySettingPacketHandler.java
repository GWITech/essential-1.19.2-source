package gg.essential.network.connectionmanager.handler.relationships;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.relationships.privacy.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class FriendRequestPrivacySettingPacketHandler extends PacketHandler<FriendRequestPrivacySettingPacket>
{
    public FriendRequestPrivacySettingPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final FriendRequestPrivacySettingPacket packet) {
        connectionManager.getRelationshipManager();
        packet.getSetting();
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (FriendRequestPrivacySettingPacket)packet);
    }
}
