package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerChatChannelAddPacketHandler extends PacketHandler<ServerChatChannelAddPacket>
{
    public ServerChatChannelAddPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerChatChannelAddPacket packet) {
        connectionManager.getChatManager().addChannels(packet.getChannels());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerChatChannelAddPacket)packet);
    }
}
