package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.chat.*;
import gg.essential.connectionmanager.common.packet.*;

public class ChatChannelMemberAddPacketHandler extends PacketHandler<ChatChannelMemberAddPacket>
{
    public ChatChannelMemberAddPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ChatChannelMemberAddPacket packet) {
        final ChatManager chatManager = connectionManager.getChatManager();
        chatManager.membersAdded(packet.getChannelId(), packet.getMembers());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ChatChannelMemberAddPacket)packet);
    }
}
