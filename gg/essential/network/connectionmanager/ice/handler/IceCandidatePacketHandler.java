package gg.essential.network.connectionmanager.ice.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.ice.*;
import gg.essential.network.connectionmanager.ice.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class IceCandidatePacketHandler extends PacketHandler<IceCandidatePacket>
{
    @NotNull
    private final IceManager iceManager;
    
    public IceCandidatePacketHandler(@NotNull final IceManager iceManager) {
        super();
        this.iceManager = iceManager;
    }
    
    protected void onHandle$6472f9fc(@NotNull final IceCandidatePacket packet) {
        this.iceManager.addRemoteCandidate(packet.getUser(), packet.getCandidate());
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$6472f9fc((IceCandidatePacket)packet);
    }
}
