package gg.essential.model.file;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b" }, d2 = { "Lgg/essential/model/file/UvsSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lgg/essential/model/file/ModelFile$Uvs;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "cosmetics" })
final class UvsSerializer extends JsonContentPolymorphicSerializer<ModelFile.Uvs>
{
    public UvsSerializer() {
        super(Reflection.getOrCreateKotlinClass((Class)ModelFile.Uvs.class));
    }
    
    @NotNull
    protected DeserializationStrategy<? extends ModelFile.Uvs> selectDeserializer(@NotNull final JsonElement element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        return (DeserializationStrategy<? extends ModelFile.Uvs>)((element instanceof JsonObject) ? ModelFile.Uvs.PerFace.Companion.serializer() : ((DeserializationStrategy)ModelFile.Uvs.Box.Companion.serializer()));
    }
}
