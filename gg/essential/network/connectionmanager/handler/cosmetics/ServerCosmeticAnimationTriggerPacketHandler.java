package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import org.jetbrains.annotations.*;
import gg.essential.network.cosmetics.*;
import gg.essential.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerCosmeticAnimationTriggerPacketHandler extends PacketHandler<ServerCosmeticAnimationTriggerPacket>
{
    public ServerCosmeticAnimationTriggerPacketHandler() {
        super();
    }
    
    protected void onHandle$1567d626(@NotNull final ServerCosmeticAnimationTriggerPacket packet) {
        final UUID userId = packet.getUserId();
        final CosmeticSlot slot = ConversionsKt.toMod(packet.getCosmeticSlot());
        final String triggerName = packet.getTriggerName();
        Essential.getInstance().getAnimationEffectHandler().triggerEvent(userId, slot, triggerName);
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$1567d626((ServerCosmeticAnimationTriggerPacket)packet);
    }
}
