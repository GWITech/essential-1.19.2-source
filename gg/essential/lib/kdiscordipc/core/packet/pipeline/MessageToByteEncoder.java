package gg.essential.lib.kdiscordipc.core.packet.pipeline;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/pipeline/MessageToByteEncoder;", "", "()V", "encode", "", "T", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "packet", "nonce", "", "encode$KDiscordIPC", "(Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket;Ljava/lang/String;)[B", "KDiscordIPC" })
public final class MessageToByteEncoder
{
    @NotNull
    public static final MessageToByteEncoder INSTANCE;
    
    private MessageToByteEncoder() {
        super();
    }
    
    static {
        INSTANCE = new MessageToByteEncoder();
    }
}
