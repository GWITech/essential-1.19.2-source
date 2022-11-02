package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerChatChannelClearPacketHandler extends PacketHandler<ServerChatChannelClearPacket>
{
    public ServerChatChannelClearPacketHandler() {
        super();
    }
    
    protected void onHandle$61fb7a44(@NotNull final ConnectionManager connectionManager) {
        connectionManager.getChatManager().clearChannels();
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$61fb7a44(connectionManager);
    }
}
