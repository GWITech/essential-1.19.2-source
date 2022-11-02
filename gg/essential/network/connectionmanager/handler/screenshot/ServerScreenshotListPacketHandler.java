package gg.essential.network.connectionmanager.handler.screenshot;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.media.*;
import gg.essential.network.connectionmanager.media.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerScreenshotListPacketHandler extends PacketHandler<ServerMediaPopulatePacket>
{
    private final ScreenshotManager screenshotManager;
    
    public ServerScreenshotListPacketHandler(final ScreenshotManager screenshotManager) {
        super();
        this.screenshotManager = screenshotManager;
    }
    
    protected void onHandle$745153c0(@NotNull final ServerMediaPopulatePacket packet) {
        this.screenshotManager.screenshotsReceived(packet.getMedias());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$745153c0((ServerMediaPopulatePacket)packet);
    }
}
