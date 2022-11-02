package gg.essential.lib.kdiscordipc.data.user;

import kotlinx.serialization.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlinx.serialization.encoding.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/user/PremiumType$Companion$PremiumTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/data/user/PremiumType;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
public static class PremiumTypeSerializer implements KSerializer<PremiumType>
{
    @NotNull
    private final SerialDescriptor descriptor;
    
    public PremiumTypeSerializer() {
        super();
        this.descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("gg.essential.lib.kdiscordipc.data.user", (PrimitiveKind)PrimitiveKind$INT.INSTANCE);
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    @NotNull
    public PremiumType deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        final int value = decoder.decodeInt();
        final PremiumType[] values;
        final Object[] $this$first$iv = values = PremiumType.values();
        int i = 0;
        while (i < values.length) {
            final Object element$iv = values[i];
            ++i;
            final PremiumType it = (PremiumType)element$iv;
            if (it.getIndex() == value) {
                return (PremiumType)element$iv;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final PremiumType value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        encoder.encodeInt(value.getIndex());
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (PremiumType)value);
    }
}
