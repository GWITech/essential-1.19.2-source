package gg.essential.lib.kdiscordipc.core.packet.pipeline;

import kotlin.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.text.*;
import gg.essential.lib.kdiscordipc.*;
import gg.essential.lib.kdiscordipc.core.util.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.error.*;
import kotlinx.serialization.modules.*;
import kotlinx.serialization.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/pipeline/ByteToMessageDecoder;", "", "()V", "decode", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "packet", "Lgg/essential/lib/kdiscordipc/core/socket/RawPacket;", "KDiscordIPC" })
public final class ByteToMessageDecoder
{
    @NotNull
    public static final ByteToMessageDecoder INSTANCE;
    
    private ByteToMessageDecoder() {
        super();
    }
    
    @Nullable
    public final InboundPacket decode(@NotNull final RawPacket packet) {
        Intrinsics.checkNotNullParameter((Object)packet, "packet");
        try {
            final String data = StringsKt.decodeToString(packet.getData());
            KDiscordIPC.Companion.getLogger$KDiscordIPC().debug(Intrinsics.stringPlus("Decoding: ", (Object)data));
            final StringFormat stringFormat;
            final StringFormat $this$decodeFromString$iv = stringFormat = (StringFormat)ConstantsKt.getJson();
            final SerializersModule $this$serializer$iv$iv = $this$decodeFromString$iv.getSerializersModule();
            final KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer($this$serializer$iv$iv, Reflection.typeOf((Class)InboundPacket.class));
            return (InboundPacket)stringFormat.decodeFromString((DeserializationStrategy)$this$cast$iv$iv$iv, data);
        }
        catch (final SerializationException ex) {
            throw DecodeError.InvalidData.INSTANCE;
        }
        catch (final Exception e) {
            KDiscordIPC.Companion.getLogger$KDiscordIPC().debug("Caught error when decoding packet (op: " + packet.getOpcode() + ", length: " + packet.getLength() + ')', e);
            return null;
        }
    }
    
    static {
        INSTANCE = new ByteToMessageDecoder();
    }
}
