package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import gg.essential.cosmetics.model.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticPlayerSettingsPacketHandler extends PacketHandler<ServerCosmeticPlayerSettingsPacket>
{
    public ServerCosmeticPlayerSettingsPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticPlayerSettingsPacket packet) {
        connectionManager.getCosmeticsManager().setCosmeticSettings(packet.getUUID(), ConversionsKt.settingsToMod(packet.getSettings()));
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticPlayerSettingsPacket)packet);
    }
}
