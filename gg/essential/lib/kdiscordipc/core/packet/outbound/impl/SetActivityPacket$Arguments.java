package gg.essential.lib.kdiscordipc.core.packet.outbound.impl;

import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
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
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t�\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007�\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u00c7\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007�\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005�\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f�\u0006#" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket$Arguments;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "seen1", "", "pid", "", "activity", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLdev/cbyrne/kdiscordipc/data/activity/Activity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLdev/cbyrne/kdiscordipc/data/activity/Activity;)V", "getActivity", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity;", "getPid", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public static final class Arguments extends OutboundPacket.Arguments
{
    @NotNull
    public static final Companion Companion;
    private final long pid = pid;
    @Nullable
    private final Activity activity = activity;
    
    public Arguments(final long pid, @Nullable final Activity activity) {
        super();
        this.pid = pid;
        this.activity = activity;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Arguments(pid=" + this.pid + ", activity=" + this.activity + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Long.hashCode(this.pid);
        result = result * 31 + ((this.activity == null) ? 0 : this.activity.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Arguments)) {
            return false;
        }
        final Arguments arguments = (Arguments)other;
        return this.pid == arguments.pid && Intrinsics.areEqual((Object)this.activity, (Object)arguments.activity);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Arguments self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        OutboundPacket.Arguments.write$Self((OutboundPacket.Arguments)self, output, serialDesc);
        output.encodeLongElement(serialDesc, 0, self.pid);
        output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)Activity.serializer.INSTANCE, (Object)self.activity);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Arguments(final int seen1, final long pid, final Activity activity) {
        if (0x3 != (0x3 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 3, serializer.INSTANCE.getDescriptor());
        }
        super(seen1);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001�\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket$Arguments;", "KDiscordIPC" })
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
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001�\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005�\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007�\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)Activity.serializer.INSTANCE) };
        }
        
        @NotNull
        public Arguments deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            long pid = 0L;
            Object o = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                pid = beginStructure.decodeLongElement(descriptor, 0);
                o = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)Activity.serializer.INSTANCE, o);
                seen1 = 3;
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
                            pid = beginStructure.decodeLongElement(descriptor, 0);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)Activity.serializer.INSTANCE, o);
                            seen1 |= 0x2;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Arguments(seen1, pid, (Activity)o);
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
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.packet.outbound.impl.SetActivityPacket.Arguments", (GeneratedSerializer)serializer.INSTANCE, 2);
            pluginGeneratedSerialDescriptor.addElement("pid", false);
            pluginGeneratedSerialDescriptor.addElement("activity", false);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
