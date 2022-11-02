package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerChatChannelMessageReportReasonsPacketHandler extends PacketHandler<ServerChatChannelMessageReportReasonsPacket>
{
    public ServerChatChannelMessageReportReasonsPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerChatChannelMessageReportReasonsPacket packet) {
        connectionManager.getChatManager().setReportReasons(packet.getReasons());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerChatChannelMessageReportReasonsPacket)packet);
    }
}
