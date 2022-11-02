package gg.essential.lib.kdiscordipc.core.packet.outbound.impl;

import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u001f\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u00c7\u0001R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0015¨\u0006+" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/HandshakePacket;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/IrregularOutboundPacket;", "seen1", "", "nonce", "", "cmd", "args", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "version", "clientId", "opcode", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;I)V", "getClientId$annotations", "()V", "getClientId", "()Ljava/lang/String;", "getOpcode", "()I", "getVersion$annotations", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public final class HandshakePacket extends IrregularOutboundPacket
{
    @NotNull
    public static final Companion Companion;
    private final int version = version;
    @NotNull
    private final String clientId = clientId;
    private final int opcode;
    
    public HandshakePacket(@NotNull final String clientId, final byte b) {
        Intrinsics.checkNotNullParameter((Object)clientId, "clientId");
        super();
        this.version = 1;
        this.clientId = clientId;
        this.opcode = 0;
    }
    
    public HandshakePacket(final String clientId) {
        this(clientId, (byte)0);
    }
    
    @Override
    public int getOpcode() {
        return this.opcode;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "HandshakePacket(version=" + this.version + ", clientId=" + this.clientId + ", opcode=" + this.getOpcode() + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Integer.hashCode(this.version);
        result = result * 31 + this.clientId.hashCode();
        result = result * 31 + Integer.hashCode(this.getOpcode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandshakePacket)) {
            return false;
        }
        final HandshakePacket handshakePacket = (HandshakePacket)other;
        return this.version == handshakePacket.version && Intrinsics.areEqual((Object)this.clientId, (Object)handshakePacket.clientId) && this.getOpcode() == handshakePacket.getOpcode();
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final HandshakePacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        IrregularOutboundPacket.write$Self(self, output, serialDesc);
        output.encodeIntElement(serialDesc, 3, self.version);
        output.encodeStringElement(serialDesc, 4, self.clientId);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getOpcode() != 0) {
            output.encodeIntElement(serialDesc, 5, self.getOpcode());
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public HandshakePacket(final int seen1, final String nonce, final String cmd, final Arguments args, @SerialName("v") final int version, @SerialName("client_id") final String clientId, final int opcode) {
        if (0x18 != (0x18 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 24, serializer.INSTANCE.getDescriptor());
        }
        super(seen1, nonce, cmd, args);
        if ((seen1 & 0x20) == 0x0) {
            this.opcode = 0;
        }
        else {
            this.opcode = opcode;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/HandshakePacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/HandshakePacket;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<HandshakePacket> serializer() {
            return (KSerializer<HandshakePacket>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/impl/HandshakePacket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/HandshakePacket;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<HandshakePacket>
    {
        @NotNull
        public static final serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        private serializer() {
            super();
        }
        
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])GeneratedSerializer$DefaultImpls.typeParametersSerializers((GeneratedSerializer)this);
        }
        
        @NotNull
        public SerialDescriptor getDescriptor() {
            return serializer.descriptor;
        }
        
        @NotNull
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)Arguments.serializer.INSTANCE), (KSerializer)IntSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE };
        }
        
        @NotNull
        public HandshakePacket deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            String nonce = null;
            String cmd = null;
            Object o = null;
            int version = 0;
            String clientId = null;
            int opcode = 0;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                nonce = beginStructure.decodeStringElement(descriptor, 0);
                cmd = beginStructure.decodeStringElement(descriptor, 1);
                o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Arguments.serializer.INSTANCE, o);
                version = beginStructure.decodeIntElement(descriptor, 3);
                clientId = beginStructure.decodeStringElement(descriptor, 4);
                opcode = beginStructure.decodeIntElement(descriptor, 5);
                seen1 = 63;
            }
            else {
                while (i != 0) {
                    final int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1: {
                            i = 0;
                            continue;
                        }
                        case 0: {
                            nonce = beginStructure.decodeStringElement(descriptor, 0);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            cmd = beginStructure.decodeStringElement(descriptor, 1);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Arguments.serializer.INSTANCE, o);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            version = beginStructure.decodeIntElement(descriptor, 3);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            clientId = beginStructure.decodeStringElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        case 5: {
                            opcode = beginStructure.decodeIntElement(descriptor, 5);
                            seen1 |= 0x20;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new HandshakePacket(seen1, nonce, cmd, (Arguments)o, version, clientId, opcode);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final HandshakePacket value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            HandshakePacket.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (HandshakePacket)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.outbound.impl.HandshakePacket", (GeneratedSerializer)serializer.INSTANCE, 6);
            pluginGeneratedSerialDescriptor.addElement("nonce", true);
            pluginGeneratedSerialDescriptor.addElement("cmd", true);
            pluginGeneratedSerialDescriptor.addElement("args", true);
            pluginGeneratedSerialDescriptor.addElement("v", false);
            pluginGeneratedSerialDescriptor.addElement("client_id", false);
            pluginGeneratedSerialDescriptor.addElement("opcode", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
