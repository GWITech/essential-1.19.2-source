package gg.essential.network.connectionmanager.notices.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.notices.*;
import gg.essential.network.connectionmanager.notices.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.notices.model.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerNoticePopulatePacketHandler extends PacketHandler<ServerNoticePopulatePacket>
{
    @NotNull
    private final NoticesManager noticesManager;
    
    public ServerNoticePopulatePacketHandler(@NotNull final NoticesManager noticesManager) {
        super();
        this.noticesManager = noticesManager;
    }
    
    protected void onHandle$4eba87e7(@NotNull final ServerNoticePopulatePacket packet) {
        this.noticesManager.populateNotices(packet.getNotices());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$4eba87e7((ServerNoticePopulatePacket)packet);
    }
}
