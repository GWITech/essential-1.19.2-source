package gg.essential.model.file;

import kotlinx.serialization.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.builtins.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012" }, d2 = { "Lgg/essential/model/file/UvBoxSerializer;", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Uvs$Box;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "inner", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
final class UvBoxSerializer implements KSerializer<ModelFile.Uvs.Box>
{
    @NotNull
    private final KSerializer<float[]> inner;
    @NotNull
    private final SerialDescriptor descriptor;
    
    public UvBoxSerializer() {
        super();
        this.inner = (KSerializer<float[]>)BuiltinSerializersKt.FloatArraySerializer();
        this.descriptor = this.inner.getDescriptor();
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    @NotNull
    public ModelFile.Uvs.Box deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        return new ModelFile.Uvs.Box((float[])this.inner.deserialize(decoder));
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final ModelFile.Uvs.Box value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.inner.serialize(encoder, (Object)value.getUv());
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (ModelFile.Uvs.Box)value);
    }
}
