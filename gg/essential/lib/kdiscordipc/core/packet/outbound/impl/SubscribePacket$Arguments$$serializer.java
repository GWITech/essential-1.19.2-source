package gg.essential.lib.kdiscordipc.core.packet.outbound.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001�\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005�\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007�\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
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
