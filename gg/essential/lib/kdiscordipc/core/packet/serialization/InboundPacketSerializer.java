package gg.essential.lib.kdiscordipc.core.packet.serialization;

import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.impl.*;
import kotlinx.serialization.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0016\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000b" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/serialization/InboundPacketSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "contentOrNull", "", "key", "KDiscordIPC" })
public final class InboundPacketSerializer extends JsonContentPolymorphicSerializer<InboundPacket>
{
    @NotNull
    public static final InboundPacketSerializer INSTANCE;
    
    private InboundPacketSerializer() {
        super(Reflection.getOrCreateKotlinClass((Class)InboundPacket.class));
    }
    
    @NotNull
    protected DeserializationStrategy<? extends InboundPacket> selectDeserializer(@NotNull final JsonElement element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        final String evt = this.contentOrNull(element, "evt");
        if (evt != null) {
            switch (evt) {
                case "READY": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.Ready.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                case "ACTIVITY_JOIN": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.ActivityJoin.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                case "VOICE_SETTINGS_UPDATE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.VoiceSettingsUpdate.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                case "ACTIVITY_INVITE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.ActivityInvite.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                case "CURRENT_USER_UPDATE": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.UserUpdate.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                case "ERROR": {
                    final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)DispatchEventPacket.Error.Companion.serializer();
                    return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
                }
                default:
                    break;
            }
        }
        final String command = this.contentOrNull(element, "cmd");
        if (command != null) {
            final DeserializationStrategy deserializationStrategy = (DeserializationStrategy)switch (command.hashCode()) {
                case -1716715924 -> {
                    if (!command.equals("SET_ACTIVITY")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield SetActivityPacket.Companion.serializer();
                }
                case -256569643 -> {
                    if (!command.equals("AUTHENTICATE")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield AuthenticatePacket.Companion.serializer();
                }
                case 1319270354 -> {
                    if (!command.equals("GET_RELATIONSHIPS")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield GetRelationshipsPacket.Companion.serializer();
                }
                case -32761911 -> {
                    if (!command.equals("AUTHORIZE")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield AuthorizePacket.Companion.serializer();
                }
                case -617911731 -> {
                    if (!command.equals("SET_VOICE_SETTINGS")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield SetVoiceSettingsPacket.Companion.serializer();
                }
                case 320367874 -> {
                    if (!command.equals("ACCEPT_ACTIVITY_INVITE")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield AcceptActivityInvitePacket.Companion.serializer();
                }
                case -1537945383 -> {
                    if (!command.equals("GET_VOICE_SETTINGS")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield GetVoiceSettingsPacket.Companion.serializer();
                }
                case -993530582 -> {
                    if (!command.equals("SUBSCRIBE")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield SubscribePacket.Companion.serializer();
                }
                case -1506075852 -> {
                    if (!command.equals("GET_USER")) {
                        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
                    }
                    yield GetUserPacket.Companion.serializer();
                }
            };
            return (DeserializationStrategy<? extends InboundPacket>)deserializationStrategy;
        }
        throw new IllegalStateException(("Unknown packet command: " + (Object)command + " | Event: " + (Object)evt).toString());
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
        INSTANCE = new InboundPacketSerializer();
    }
}
