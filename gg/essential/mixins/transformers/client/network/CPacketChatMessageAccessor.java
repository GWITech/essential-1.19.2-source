package gg.essential.mixins.transformers.client.network;

import net.minecraft.network.packet.c2s.play.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ChatMessageC2SPacket.class })
public interface CPacketChatMessageAccessor
{
    @Accessor("chatMessage")
    @Mutable
    void setMessage(final String p0);
}
