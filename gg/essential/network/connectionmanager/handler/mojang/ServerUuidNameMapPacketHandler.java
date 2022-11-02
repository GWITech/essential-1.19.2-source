package gg.essential.network.connectionmanager.handler.mojang;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.relationships.*;
import org.jetbrains.annotations.*;
import gg.essential.util.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerUuidNameMapPacketHandler extends PacketHandler<ServerUuidNameMapPacket>
{
    public ServerUuidNameMapPacketHandler() {
        super();
    }
    
    protected void onHandle$6217091f(@NotNull final ServerUuidNameMapPacket packet) {
        for (final Map.Entry<UUID, String> uuidStringEntry : packet.getMappedUuids().entrySet()) {
            UUIDUtil.populate(uuidStringEntry.getValue(), uuidStringEntry.getKey());
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$6217091f((ServerUuidNameMapPacket)packet);
    }
}
