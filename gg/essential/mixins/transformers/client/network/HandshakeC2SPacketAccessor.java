package gg.essential.mixins.transformers.client.network;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.packet.c2s.handshake.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ HandshakeC2SPacket.class })
public interface HandshakeC2SPacketAccessor
{
    @Accessor
    int getProtocolVersion();
    
    @Accessor
    String getAddress();
    
    @Accessor
    int getPort();
}
