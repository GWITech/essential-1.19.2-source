package gg.essential.model.file;

import gg.essential.model.util.*;
import gg.essential.model.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import kotlinx.serialization.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t" }, d2 = { "Lgg/essential/model/file/KeyframesSerializer$InnerSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "Lgg/essential/model/util/TreeMap;", "", "Lgg/essential/model/Keyframe;", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "cosmetics" })
private static final class InnerSerializer extends JsonTransformingSerializer<TreeMap<Float, Keyframe>>
{
    @NotNull
    public static final InnerSerializer INSTANCE;
    
    private InnerSerializer() {
        final KSerializer $this$cast$iv$iv = SerializersKt.serializer(Reflection.typeOf((Class)TreeMap.class, KTypeProjection.Companion.invariant(Reflection.typeOf((Class)Float.TYPE)), KTypeProjection.Companion.invariant(Reflection.typeOf((Class)Keyframe.class))));
        super($this$cast$iv$iv);
    }
    
    @NotNull
    protected JsonElement transformDeserialize(@NotNull final JsonElement element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        JsonElement jsonElement;
        if (element instanceof JsonObject) {
            jsonElement = element;
        }
        else {
            final JsonObjectBuilder $this$transformDeserialize_u24lambda_u2d0;
            final JsonObjectBuilder builder$iv = $this$transformDeserialize_u24lambda_u2d0 = new JsonObjectBuilder();
            $this$transformDeserialize_u24lambda_u2d0.put("0", element);
            jsonElement = (JsonElement)builder$iv.build();
        }
        return jsonElement;
    }
    
    static {
        INSTANCE = new InnerSerializer();
    }
}
