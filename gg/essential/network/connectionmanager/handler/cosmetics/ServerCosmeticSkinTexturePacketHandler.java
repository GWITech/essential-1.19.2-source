package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import org.jetbrains.annotations.*;
import gg.essential.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticSkinTexturePacketHandler extends PacketHandler<ServerCosmeticsSkinTexturePacket>
{
    public ServerCosmeticSkinTexturePacketHandler() {
        super();
    }
    
    protected void onHandle$755b4603(@NotNull final ServerCosmeticsSkinTexturePacket packet) {
        final String skinTexture = packet.getSkinTexture();
        if (skinTexture != null && skinTexture.contains(";")) {
            final String[] split = skinTexture.split(";");
            Essential.getInstance().getGameProfileManager().updatePlayerSkin(packet.getUuid(), split[1], split[0].equals("1") ? "slim" : "default");
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$755b4603((ServerCosmeticsSkinTexturePacket)packet);
    }
}
