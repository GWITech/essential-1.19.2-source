package gg.essential.lib.kdiscordipc.core.packet.outbound.impl;

import kotlin.*;
import kotlinx.serialization.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket;", "KDiscordIPC" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final KSerializer<SubscribePacket> serializer() {
        return (KSerializer<SubscribePacket>)serializer.INSTANCE;
    }
    
    public Companion(final byte b) {
        this();
    }
}
