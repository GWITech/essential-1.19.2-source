package gg.essential.lib.kdiscordipc.core.packet.inbound.impl;

import gg.essential.lib.kdiscordipc.core.event.data.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0010\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u00c7\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket$Ready;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket;", "seen1", "", "opcode", "cmd", "", "nonce", "data", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData;)V", "getData", "()Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public static final class Ready extends DispatchEventPacket
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final ReadyEventData data = data;
    
    @NotNull
    public ReadyEventData getData() {
        return this.data;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Ready(data=" + this.getData() + ')';
    }
    
    @Override
    public int hashCode() {
        return this.getData().hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Ready && Intrinsics.areEqual((Object)this.getData(), (Object)((Ready)other).getData()));
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Ready self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        DispatchEventPacket.write$Self(self, output, serialDesc);
        output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)ReadyEventData.serializer.INSTANCE, (Object)self.getData());
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Ready(final int seen1, final int opcode, final String cmd, final String nonce, final ReadyEventData data) {
        if (0x8 != (0x8 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 8, serializer.INSTANCE.getDescriptor());
        }
        super(seen1, opcode, cmd, nonce);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket$Ready$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket$Ready;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Ready> serializer() {
            return (KSerializer<Ready>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket.Ready.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket$Ready;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<Ready>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)IntSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), (KSerializer)ReadyEventData.serializer.INSTANCE };
        }
        
        @NotNull
        public Ready deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            int opcode = 0;
            String cmd = null;
            Object o = null;
            Object o2 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                opcode = beginStructure.decodeIntElement(descriptor, 0);
                cmd = beginStructure.decodeStringElement(descriptor, 1);
                o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 3, (DeserializationStrategy)ReadyEventData.serializer.INSTANCE, o2);
                seen1 = 15;
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
                            opcode = beginStructure.decodeIntElement(descriptor, 0);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            cmd = beginStructure.decodeStringElement(descriptor, 1);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 3, (DeserializationStrategy)ReadyEventData.serializer.INSTANCE, o2);
                            seen1 |= 0x8;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Ready(seen1, opcode, cmd, (String)o, (ReadyEventData)o2);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Ready value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Ready.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Ready)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.inbound.impl.DispatchEventPacket.Ready", (GeneratedSerializer)serializer.INSTANCE, 4);
            pluginGeneratedSerialDescriptor.addElement("opcode", true);
            pluginGeneratedSerialDescriptor.addElement("cmd", true);
            pluginGeneratedSerialDescriptor.addElement("nonce", true);
            pluginGeneratedSerialDescriptor.addElement("data", false);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
