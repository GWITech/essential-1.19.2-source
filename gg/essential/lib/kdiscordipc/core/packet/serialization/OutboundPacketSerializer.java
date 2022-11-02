package gg.essential.lib.kdiscordipc.core.packet.serialization;

import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.impl.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0016\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000b" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/serialization/OutboundPacketSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "contentOrNull", "", "key", "KDiscordIPC" })
public final class OutboundPacketSerializer extends JsonContentPolymorphicSerializer<OutboundPacket>
{
    @NotNull
    public static final OutboundPacketSerializer INSTANCE;
    
    private OutboundPacketSerializer() {
        super(Reflection.getOrCreateKotlinClass((Class)OutboundPacket.class));
    }
    
    @NotNull
    protected DeserializationStrategy<? extends OutboundPacket> selectDeserializer(@NotNull final JsonElement element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        final String contentOrNull = this.contentOrNull(element, "command");
        if (contentOrNull != null) {
            switch (contentOrNull) {
                case "SET_ACTIVITY": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)SetActivityPacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                case "AUTHENTICATE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)AuthenticatePacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                case "GET_RELATIONSHIPS": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)GetRelationshipsPacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                case "ACCEPT_ACTIVITY_INVITE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)AcceptActivityInvitePacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                case "SUBSCRIBE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)SubscribePacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                case "GET_USER": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)GetUserPacket.Companion.serializer();
                    return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
                }
                default:
                    break;
            }
        }
        final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)HandshakePacket.Companion.serializer();
        return (DeserializationStrategy<? extends OutboundPacket>)deserializationStrategy;
    }
    
    private final String contentOrNull(final JsonElement $this$contentOrNull, final String key) {
        final JsonElement jsonElement = (JsonElement)JsonElementKt.getJsonObject($this$contentOrNull).get((Object)key);
        String s;
        if (jsonElement == null) {
            s = null;
        }
        else {
            final JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
            s = ((jsonPrimitive == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
        }
        return s;
    }
    
    static {
        INSTANCE = new OutboundPacketSerializer();
    }
}
