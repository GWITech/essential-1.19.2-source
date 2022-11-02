package gg.essential.network.connectionmanager.ice.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.ice.*;
import gg.essential.network.connectionmanager.ice.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.sps.*;
import java.util.*;
import gg.essential.upnp.model.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class IceSessionPacketHandler extends PacketHandler<IceSessionPacket>
{
    @NotNull
    private final IceManager iceManager;
    @NotNull
    private final SPSManager spsManager;
    
    public IceSessionPacketHandler(@NotNull final IceManager iceManager, @NotNull final SPSManager spsManager) {
        super();
        this.iceManager = iceManager;
        this.spsManager = spsManager;
    }
    
    protected void onHandle$5fb23411(@NotNull final IceSessionPacket packet) {
        final UUID user = packet.getUser();
        final UPnPSession localSession = this.spsManager.getLocalSession();
        if (localSession != null) {
            if (!localSession.getInvites().contains(user)) {
                return;
            }
            this.iceManager.createServerAgent(user, packet.getUfrag(), packet.getPassword());
        }
        else {
            final IceManager.IceConnection connection = this.iceManager.getConnection(user);
            if (connection == null) {
                return;
            }
            connection.setRemoteCredentials(packet.getUfrag(), packet.getPassword());
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$5fb23411((IceSessionPacket)packet);
    }
}
