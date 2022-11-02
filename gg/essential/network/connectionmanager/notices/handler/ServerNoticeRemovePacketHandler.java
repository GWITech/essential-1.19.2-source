package gg.essential.network.connectionmanager.notices.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.notices.*;
import gg.essential.network.connectionmanager.notices.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerNoticeRemovePacketHandler extends PacketHandler<ServerNoticeRemovePacket>
{
    @NotNull
    private final NoticesManager noticesManager;
    
    public ServerNoticeRemovePacketHandler(@NotNull final NoticesManager noticesManager) {
        super();
        this.noticesManager = noticesManager;
    }
    
    protected void onHandle$575f4dcd(@NotNull final ServerNoticeRemovePacket packet) {
        this.noticesManager.removeNotices(packet.getIds());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$575f4dcd((ServerNoticeRemovePacket)packet);
    }
}
