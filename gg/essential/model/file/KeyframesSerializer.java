package gg.essential.model.file;

import kotlin.*;
import kotlinx.serialization.descriptors.*;
import org.jetbrains.annotations.*;
import gg.essential.model.util.*;
import gg.essential.model.*;
import kotlinx.serialization.encoding.*;
import kotlin.reflect.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011" }, d2 = { "Lgg/essential/model/file/KeyframesSerializer;", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/Keyframes;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "InnerSerializer", "cosmetics" })
public final class KeyframesSerializer implements KSerializer<Keyframes>
{
    @NotNull
    private final SerialDescriptor descriptor;
    
    public KeyframesSerializer() {
        super();
        this.descriptor = InnerSerializer.INSTANCE.getDescriptor();
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    @NotNull
    public Keyframes deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        return new Keyframes((TreeMap<Float, Keyframe>)InnerSerializer.INSTANCE.deserialize(decoder));
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final Keyframes value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        InnerSerializer.INSTANCE.serialize(encoder, (Object)value.getFrames());
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (Keyframes)value);
    }
    
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
}
