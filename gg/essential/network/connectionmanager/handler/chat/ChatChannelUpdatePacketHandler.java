package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ChatChannelUpdatePacketHandler extends PacketHandler<ChatChannelUpdatePacket>
{
    public ChatChannelUpdatePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ChatChannelUpdatePacket packet) {
        connectionManager.getChatManager().setChannelInfo(packet.getChannelId(), packet.getName(), packet.getTopic());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ChatChannelUpdatePacket)packet);
    }
}
