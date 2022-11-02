package gg.essential.lib.kdiscordipc.core.packet.inbound.impl;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.encoding.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
import java.util.*;
import kotlinx.serialization.internal.*;
import kotlinx.serialization.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0004'()*B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u00c7\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006+" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/CommandPacket;", "seen1", "", "data", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;", "cmd", "", "opcode", "nonce", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILdev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ldev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;Ljava/lang/String;ILjava/lang/String;)V", "getCmd", "()Ljava/lang/String;", "getData", "()Ldev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;", "getNonce", "getOpcode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Data", "Metadata", "KDiscordIPC" })
public final class SetActivityPacket extends CommandPacket
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final Data data = data;
    @NotNull
    private final String cmd;
    private final int opcode;
    @NotNull
    private final String nonce;
    
    @Nullable
    public Data getData() {
        return this.data;
    }
    
    @NotNull
    public String getCmd() {
        return this.cmd;
    }
    
    public int getOpcode() {
        return this.opcode;
    }
    
    @NotNull
    @Override
    public String getNonce() {
        return this.nonce;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "SetActivityPacket(data=" + this.getData() + ", cmd=" + this.getCmd() + ", opcode=" + this.getOpcode() + ", nonce=" + this.getNonce() + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.getData() == null) ? 0 : this.getData().hashCode();
        result = result * 31 + this.getCmd().hashCode();
        result = result * 31 + Integer.hashCode(this.getOpcode());
        result = result * 31 + this.getNonce().hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetActivityPacket)) {
            return false;
        }
        final SetActivityPacket setActivityPacket = (SetActivityPacket)other;
        return Intrinsics.areEqual((Object)this.getData(), (Object)setActivityPacket.getData()) && Intrinsics.areEqual((Object)this.getCmd(), (Object)setActivityPacket.getCmd()) && this.getOpcode() == setActivityPacket.getOpcode() && Intrinsics.areEqual((Object)this.getNonce(), (Object)setActivityPacket.getNonce());
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final SetActivityPacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        CommandPacket.write$Self(self, output, serialDesc);
        output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)Data.serializer.INSTANCE, (Object)self.getData());
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object)self.getCmd(), (Object)"SET_ACTIVITY")) {
            output.encodeStringElement(serialDesc, 1, self.getCmd());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getOpcode() != 1) {
            output.encodeIntElement(serialDesc, 2, self.getOpcode());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object)self.getNonce(), (Object)"0")) {
            output.encodeStringElement(serialDesc, 3, self.getNonce());
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public SetActivityPacket(final int seen1, final Data data, final String cmd, final int opcode, final String nonce) {
        if (0x1 != (0x1 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 1, serializer.INSTANCE.getDescriptor());
        }
        super((byte)0);
        if ((seen1 & 0x2) == 0x0) {
            this.cmd = "SET_ACTIVITY";
        }
        else {
            this.cmd = cmd;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.opcode = 1;
        }
        else {
            this.opcode = opcode;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.nonce = "0";
        }
        else {
            this.nonce = nonce;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<SetActivityPacket> serializer() {
            return (KSerializer<SetActivityPacket>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<SetActivityPacket>
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
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)Data.serializer.INSTANCE), (KSerializer)StringSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE };
        }
        
        @NotNull
        public SetActivityPacket deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            String cmd = null;
            int opcode = 0;
            String nonce = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)Data.serializer.INSTANCE, o);
                cmd = beginStructure.decodeStringElement(descriptor, 1);
                opcode = beginStructure.decodeIntElement(descriptor, 2);
                nonce = beginStructure.decodeStringElement(descriptor, 3);
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
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)Data.serializer.INSTANCE, o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            cmd = beginStructure.decodeStringElement(descriptor, 1);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            opcode = beginStructure.decodeIntElement(descriptor, 2);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            nonce = beginStructure.decodeStringElement(descriptor, 3);
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
            return new SetActivityPacket(seen1, (Data)o, cmd, opcode, nonce);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final SetActivityPacket value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            SetActivityPacket.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (SetActivityPacket)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.inbound.impl.SetActivityPacket", (GeneratedSerializer)serializer.INSTANCE, 4);
            pluginGeneratedSerialDescriptor.addElement("data", false);
            pluginGeneratedSerialDescriptor.addElement("cmd", true);
            pluginGeneratedSerialDescriptor.addElement("opcode", true);
            pluginGeneratedSerialDescriptor.addElement("nonce", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002CDB\u0083\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J}\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001J!\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u00c7\u0001R\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006E" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket$Data;", "seen1", "", "details", "", "state", "timestamps", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Timestamps;", "assets", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets;", "party", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Party;", "buttons", "", "name", "applicationId", "type", "metadata", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Metadata;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILdev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Metadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILdev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Metadata;)V", "getApplicationId$annotations", "()V", "getApplicationId", "()Ljava/lang/String;", "getAssets", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;", "getButtons", "()Ljava/util/List;", "getDetails", "getMetadata", "()Ldev/cbyrne/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Metadata;", "getName", "getParty", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;", "getState", "getTimestamps", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;", "getType", "()I", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
    public static final class Data extends InboundPacket.Data
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final String details = details;
        @NotNull
        private final String state = state;
        @Nullable
        private final Activity$Timestamps timestamps;
        @Nullable
        private final Activity.Assets assets;
        @Nullable
        private final Activity$Party party;
        @Nullable
        private final List<String> buttons;
        @NotNull
        private final String name;
        @NotNull
        private final String applicationId;
        private final int type;
        @Nullable
        private final SetActivityPacket$Metadata metadata;
        
        @NotNull
        @Override
        public String toString() {
            return "Data(details=" + this.details + ", state=" + this.state + ", timestamps=" + this.timestamps + ", assets=" + this.assets + ", party=" + this.party + ", buttons=" + this.buttons + ", name=" + this.name + ", applicationId=" + this.applicationId + ", type=" + this.type + ", metadata=" + this.metadata + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.details.hashCode();
            result = result * 31 + this.state.hashCode();
            result = result * 31 + ((this.timestamps == null) ? 0 : this.timestamps.hashCode());
            result = result * 31 + ((this.assets == null) ? 0 : this.assets.hashCode());
            result = result * 31 + ((this.party == null) ? 0 : this.party.hashCode());
            result = result * 31 + ((this.buttons == null) ? 0 : this.buttons.hashCode());
            result = result * 31 + this.name.hashCode();
            result = result * 31 + this.applicationId.hashCode();
            result = result * 31 + Integer.hashCode(this.type);
            result = result * 31 + ((this.metadata == null) ? 0 : this.metadata.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            final Data data = (Data)other;
            return Intrinsics.areEqual((Object)this.details, (Object)data.details) && Intrinsics.areEqual((Object)this.state, (Object)data.state) && Intrinsics.areEqual((Object)this.timestamps, (Object)data.timestamps) && Intrinsics.areEqual((Object)this.assets, (Object)data.assets) && Intrinsics.areEqual((Object)this.party, (Object)data.party) && Intrinsics.areEqual((Object)this.buttons, (Object)data.buttons) && Intrinsics.areEqual((Object)this.name, (Object)data.name) && Intrinsics.areEqual((Object)this.applicationId, (Object)data.applicationId) && this.type == data.type && Intrinsics.areEqual((Object)this.metadata, (Object)data.metadata);
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Data self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            InboundPacket.Data.write$Self((InboundPacket.Data)self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.details);
            output.encodeStringElement(serialDesc, 1, self.state);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timestamps != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)Activity.Timestamps.serializer.INSTANCE, (Object)self.timestamps);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.assets != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)Activity.Assets.serializer.INSTANCE, (Object)self.assets);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.party != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)Activity.Party.serializer.INSTANCE, (Object)self.party);
            }
            output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), (Object)self.buttons);
            output.encodeStringElement(serialDesc, 6, self.name);
            output.encodeStringElement(serialDesc, 7, self.applicationId);
            output.encodeIntElement(serialDesc, 8, self.type);
            output.encodeNullableSerializableElement(serialDesc, 9, (SerializationStrategy)SetActivityPacket.Metadata.serializer.INSTANCE, (Object)self.metadata);
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Data(final int seen1, final String details, final String state, final Activity$Timestamps timestamps, final Activity.Assets assets, final Activity$Party party, final List buttons, final String name, @SerialName("application_id") final String applicationId, final int type, final SetActivityPacket$Metadata metadata) {
            if (0x3E3 != (0x3E3 & seen1)) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 995, serializer.INSTANCE.getDescriptor());
            }
            super(seen1);
            if ((seen1 & 0x4) == 0x0) {
                this.timestamps = null;
            }
            else {
                this.timestamps = timestamps;
            }
            if ((seen1 & 0x8) == 0x0) {
                this.assets = null;
            }
            else {
                this.assets = assets;
            }
            if ((seen1 & 0x10) == 0x0) {
                this.party = null;
            }
            else {
                this.party = party;
            }
            this.buttons = buttons;
            this.name = name;
            this.applicationId = applicationId;
            this.type = type;
            this.metadata = metadata;
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;", "KDiscordIPC" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Data> serializer() {
                return (KSerializer<Data>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket.Data.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/SetActivityPacket$Data;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
        public static final class serializer implements GeneratedSerializer<Data>
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
                return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)Activity.Timestamps.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)Activity.Assets.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)Activity.Party.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE)), (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)SetActivityPacket.Metadata.serializer.INSTANCE) };
            }
            
            @NotNull
            public Data deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                String details = null;
                String state = null;
                Object o = null;
                Object o2 = null;
                Object o3 = null;
                Object o4 = null;
                String name = null;
                String applicationId = null;
                int type = 0;
                Object o5 = null;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    details = beginStructure.decodeStringElement(descriptor, 0);
                    state = beginStructure.decodeStringElement(descriptor, 1);
                    o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Activity.Timestamps.serializer.INSTANCE, o);
                    o2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)Activity.Assets.serializer.INSTANCE, o2);
                    o3 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)Activity.Party.serializer.INSTANCE, o3);
                    o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), o4);
                    name = beginStructure.decodeStringElement(descriptor, 6);
                    applicationId = beginStructure.decodeStringElement(descriptor, 7);
                    type = beginStructure.decodeIntElement(descriptor, 8);
                    o5 = beginStructure.decodeNullableSerializableElement(descriptor, 9, (DeserializationStrategy)SetActivityPacket.Metadata.serializer.INSTANCE, o5);
                    seen1 = 1023;
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
                                details = beginStructure.decodeStringElement(descriptor, 0);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                state = beginStructure.decodeStringElement(descriptor, 1);
                                seen1 |= 0x2;
                                continue;
                            }
                            case 2: {
                                o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Activity.Timestamps.serializer.INSTANCE, o);
                                seen1 |= 0x4;
                                continue;
                            }
                            case 3: {
                                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)Activity.Assets.serializer.INSTANCE, o2);
                                seen1 |= 0x8;
                                continue;
                            }
                            case 4: {
                                o3 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)Activity.Party.serializer.INSTANCE, o3);
                                seen1 |= 0x10;
                                continue;
                            }
                            case 5: {
                                o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), o4);
                                seen1 |= 0x20;
                                continue;
                            }
                            case 6: {
                                name = beginStructure.decodeStringElement(descriptor, 6);
                                seen1 |= 0x40;
                                continue;
                            }
                            case 7: {
                                applicationId = beginStructure.decodeStringElement(descriptor, 7);
                                seen1 |= 0x80;
                                continue;
                            }
                            case 8: {
                                type = beginStructure.decodeIntElement(descriptor, 8);
                                seen1 |= 0x100;
                                continue;
                            }
                            case 9: {
                                o5 = beginStructure.decodeNullableSerializableElement(descriptor, 9, (DeserializationStrategy)SetActivityPacket.Metadata.serializer.INSTANCE, o5);
                                seen1 |= 0x200;
                                continue;
                            }
                            default: {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                        }
                    }
                }
                beginStructure.endStructure(descriptor);
                return new Data(seen1, details, state, (Activity$Timestamps)o, (Activity.Assets)o2, (Activity$Party)o3, (List)o4, name, applicationId, type, (SetActivityPacket$Metadata)o5);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Data value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Data.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Data)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.inbound.impl.SetActivityPacket.Data", (GeneratedSerializer)serializer.INSTANCE, 10);
                pluginGeneratedSerialDescriptor.addElement("details", false);
                pluginGeneratedSerialDescriptor.addElement("state", false);
                pluginGeneratedSerialDescriptor.addElement("timestamps", true);
                pluginGeneratedSerialDescriptor.addElement("assets", true);
                pluginGeneratedSerialDescriptor.addElement("party", true);
                pluginGeneratedSerialDescriptor.addElement("buttons", false);
                pluginGeneratedSerialDescriptor.addElement("name", false);
                pluginGeneratedSerialDescriptor.addElement("application_id", false);
                pluginGeneratedSerialDescriptor.addElement("type", false);
                pluginGeneratedSerialDescriptor.addElement("metadata", false);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
}
