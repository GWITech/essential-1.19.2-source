package gg.essential.lib.kdiscordipc.core.packet.outbound;

import gg.essential.lib.kdiscordipc.core.packet.serialization.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable(with = OutboundPacketSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0005?\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048&X?\u0004?\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8&X?\u0004?\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\tX?\u000e?\u0006\f\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X?\u0004?\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014?\u0006\u0017" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "", "()V", "args", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "getArgs$annotations", "getArgs", "()Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "cmd", "", "getCmd$annotations", "getCmd", "()Ljava/lang/String;", "nonce", "getNonce", "setNonce", "(Ljava/lang/String;)V", "opcode", "", "getOpcode", "()I", "Arguments", "Companion", "KDiscordIPC" })
public abstract class OutboundPacket
{
    @NotNull
    public static final Companion Companion;
    
    public OutboundPacket() {
        super();
    }
    
    public abstract int getOpcode();
    
    public abstract void setNonce(@NotNull final String p0);
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001?\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<OutboundPacket> serializer() {
            return (KSerializer<OutboundPacket>)OutboundPacketSerializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005?\u0006\u0002\u0010\u0006B\u0005?\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00c7\u0001?\u0006\u0011" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
    public static class Arguments
    {
        @NotNull
        public static final Companion Companion;
        
        public Arguments() {
            super();
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Arguments self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Arguments(final int seen1) {
            if ((0x0 & seen1) != 0x0) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
            }
            super();
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001?\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "KDiscordIPC" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Arguments> serializer() {
                return (KSerializer<Arguments>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001?\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005?\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007?\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
        public static final class serializer implements GeneratedSerializer<Arguments>
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
                return (KSerializer<?>[])new KSerializer[0];
            }
            
            @NotNull
            public Arguments deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (!beginStructure.decodeSequentially()) {
                    while (i != 0) {
                        final int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                        if (decodeElementIndex != -1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i = 0;
                    }
                }
                beginStructure.endStructure(descriptor);
                return new Arguments(0);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Arguments value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Arguments.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Arguments)value);
            }
            
            static {
                INSTANCE = new serializer();
                descriptor = (SerialDescriptor)new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.outbound.OutboundPacket.Arguments", (GeneratedSerializer)serializer.INSTANCE, 0);
            }
        }
    }
}
