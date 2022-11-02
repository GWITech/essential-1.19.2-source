package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.chat.*;
import gg.essential.connectionmanager.common.packet.*;

public class ChatChannelMessageDeletePacketHandler extends PacketHandler<ChatChannelMessageDeletePacket>
{
    public ChatChannelMessageDeletePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ChatChannelMessageDeletePacket packet) {
        final ChatManager chatManager = connectionManager.getChatManager();
        chatManager.removeMessage(packet.getChannelId(), packet.getMessageId());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ChatChannelMessageDeletePacket)packet);
    }
}
