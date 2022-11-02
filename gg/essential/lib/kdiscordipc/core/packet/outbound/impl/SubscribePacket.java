package gg.essential.lib.kdiscordipc.core.packet.outbound.impl;

import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.event.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0003/01B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BI\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B5\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001J\t\u0010'\u001a\u00020\tH\u00d6\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u00c7\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00062" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "name", "Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;", "(Ldev/cbyrne/kdiscordipc/core/event/DiscordEvent;)V", "seen1", "", "opcode", "cmd", "", "args", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "nonce", "evt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ldev/cbyrne/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Ldev/cbyrne/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;Ljava/lang/String;Ljava/lang/String;)V", "getArgs", "()Ldev/cbyrne/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "getCmd", "()Ljava/lang/String;", "getEvt", "getNonce", "setNonce", "(Ljava/lang/String;)V", "getOpcode", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Arguments", "Companion", "KDiscordIPC" })
public final class SubscribePacket extends OutboundPacket
{
    @NotNull
    public static final Companion Companion;
    private final int opcode;
    @NotNull
    private final String cmd;
    @NotNull
    private final Arguments args;
    @NotNull
    private String nonce;
    @NotNull
    private final String evt;
    
    public SubscribePacket(@NotNull final String cmd, @NotNull final Arguments args, @NotNull final String nonce, @NotNull final String evt) {
        Intrinsics.checkNotNullParameter((Object)cmd, "cmd");
        Intrinsics.checkNotNullParameter((Object)args, "args");
        Intrinsics.checkNotNullParameter((Object)nonce, "nonce");
        Intrinsics.checkNotNullParameter((Object)evt, "evt");
        super();
        this.opcode = 1;
        this.cmd = cmd;
        this.args = args;
        this.nonce = nonce;
        this.evt = evt;
    }
    
    public SubscribePacket(final String evt) {
        this("SUBSCRIBE", new Arguments(), "0", evt);
    }
    
    @Override
    public int getOpcode() {
        return this.opcode;
    }
    
    @NotNull
    public String getCmd() {
        return this.cmd;
    }
    
    @NotNull
    public Arguments getArgs() {
        return this.args;
    }
    
    @NotNull
    public String getNonce() {
        return this.nonce;
    }
    
    @Override
    public void setNonce(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.nonce = <set-?>;
    }
    
    public SubscribePacket(@NotNull final DiscordEvent name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        this(name.getEventName());
    }
    
    @NotNull
    @Override
    public String toString() {
        return "SubscribePacket(opcode=" + this.getOpcode() + ", cmd=" + this.getCmd() + ", args=" + this.getArgs() + ", nonce=" + this.getNonce() + ", evt=" + this.evt + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Integer.hashCode(this.getOpcode());
        result = result * 31 + this.getCmd().hashCode();
        result = result * 31 + this.getArgs().hashCode();
        result = result * 31 + this.getNonce().hashCode();
        result = result * 31 + this.evt.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribePacket)) {
            return false;
        }
        final SubscribePacket subscribePacket = (SubscribePacket)other;
        return this.getOpcode() == subscribePacket.getOpcode() && Intrinsics.areEqual((Object)this.getCmd(), (Object)subscribePacket.getCmd()) && Intrinsics.areEqual((Object)this.getArgs(), (Object)subscribePacket.getArgs()) && Intrinsics.areEqual((Object)this.getNonce(), (Object)subscribePacket.getNonce()) && Intrinsics.areEqual((Object)this.evt, (Object)subscribePacket.evt);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final SubscribePacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getOpcode() != 1) {
            output.encodeIntElement(serialDesc, 0, self.getOpcode());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object)self.getCmd(), (Object)"SUBSCRIBE")) {
            output.encodeStringElement(serialDesc, 1, self.getCmd());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual((Object)self.getArgs(), (Object)new Arguments())) {
            output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)Arguments.serializer.INSTANCE, (Object)self.getArgs());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object)self.getNonce(), (Object)"0")) {
            output.encodeStringElement(serialDesc, 3, self.getNonce());
        }
        output.encodeStringElement(serialDesc, 4, self.evt);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public SubscribePacket(final int seen1, final int opcode, final String cmd, final Arguments args, final String nonce, final String evt) {
        if (0x10 != (0x10 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 16, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.opcode = 1;
        }
        else {
            this.opcode = opcode;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.cmd = "SUBSCRIBE";
        }
        else {
            this.cmd = cmd;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.args = new Arguments();
        }
        else {
            this.args = args;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.nonce = "0";
        }
        else {
            this.nonce = nonce;
        }
        this.evt = evt;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
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
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<SubscribePacket>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)IntSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)Arguments.serializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE };
        }
        
        @NotNull
        public SubscribePacket deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            int opcode = 0;
            String cmd = null;
            Object o = null;
            String nonce = null;
            String evt = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                opcode = beginStructure.decodeIntElement(descriptor, 0);
                cmd = beginStructure.decodeStringElement(descriptor, 1);
                o = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)Arguments.serializer.INSTANCE, o);
                nonce = beginStructure.decodeStringElement(descriptor, 3);
                evt = beginStructure.decodeStringElement(descriptor, 4);
                seen1 = 31;
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
                            o = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)Arguments.serializer.INSTANCE, o);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            nonce = beginStructure.decodeStringElement(descriptor, 3);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            evt = beginStructure.decodeStringElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new SubscribePacket(seen1, opcode, cmd, (Arguments)o, nonce, evt);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final SubscribePacket value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            SubscribePacket.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (SubscribePacket)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.outbound.impl.SubscribePacket", (GeneratedSerializer)serializer.INSTANCE, 5);
            pluginGeneratedSerialDescriptor.addElement("opcode", true);
            pluginGeneratedSerialDescriptor.addElement("cmd", true);
            pluginGeneratedSerialDescriptor.addElement("args", true);
            pluginGeneratedSerialDescriptor.addElement("nonce", true);
            pluginGeneratedSerialDescriptor.addElement("evt", false);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00c7\u0001¨\u0006\u0011" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
    public static final class Arguments extends OutboundPacket.Arguments
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
            OutboundPacket.Arguments.write$Self((OutboundPacket.Arguments)self, output, serialDesc);
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Arguments(final byte b) {
            super(0);
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "KDiscordIPC" })
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
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
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
                return new Arguments((byte)0);
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
                descriptor = (SerialDescriptor)new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.outbound.impl.SubscribePacket.Arguments", (GeneratedSerializer)serializer.INSTANCE, 0);
            }
        }
    }
}
