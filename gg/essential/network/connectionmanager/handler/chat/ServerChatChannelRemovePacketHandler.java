package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerChatChannelRemovePacketHandler extends PacketHandler<ServerChatChannelRemovePacket>
{
    public ServerChatChannelRemovePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerChatChannelRemovePacket packet) {
        connectionManager.getChatManager().removeChannels(packet.getChannelIds());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerChatChannelRemovePacket)packet);
    }
}
