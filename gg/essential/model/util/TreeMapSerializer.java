package gg.essential.model.util;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "Lgg/essential/model/util/TreeMapSerializer;", "K", "", "V", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/util/TreeMap;", "kSerializer", "vSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "inner", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
final class TreeMapSerializer<K extends Comparable<? super K>, V> implements KSerializer<TreeMap<K, V>>
{
    @NotNull
    private final KSerializer<Map<K, V>> inner;
    @NotNull
    private final SerialDescriptor descriptor;
    
    public TreeMapSerializer(@NotNull final KSerializer<K> kSerializer, @NotNull final KSerializer<V> vSerializer) {
        Intrinsics.checkNotNullParameter((Object)kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter((Object)vSerializer, "vSerializer");
        super();
        this.inner = (KSerializer<Map<K, V>>)BuiltinSerializersKt.MapSerializer((KSerializer)kSerializer, (KSerializer)vSerializer);
        this.descriptor = this.inner.getDescriptor();
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final TreeMap<K, V> value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        encoder.encodeSerializableValue((SerializationStrategy)this.inner, (Object)value);
    }
    
    @NotNull
    public TreeMap<K, V> deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        return new TreeMap<K, V>((Map<K, ? extends V>)decoder.decodeSerializableValue((DeserializationStrategy)this.inner));
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (TreeMap<K, V>)value);
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
}
