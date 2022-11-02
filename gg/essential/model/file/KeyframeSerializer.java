package gg.essential.model.file;

import kotlinx.serialization.*;
import gg.essential.model.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlin.*;
import kotlinx.serialization.json.*;
import gg.essential.model.molang.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/model/file/KeyframeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/Keyframe;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "parse", "json", "Lkotlinx/serialization/json/JsonElement;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
public final class KeyframeSerializer implements KSerializer<Keyframe>
{
    @NotNull
    public static final KeyframeSerializer INSTANCE;
    @NotNull
    private static final SerialDescriptor descriptor;
    
    private KeyframeSerializer() {
        super();
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return KeyframeSerializer.descriptor;
    }
    
    @NotNull
    public Keyframe deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        return this.parse(((JsonDecoder)decoder).decodeJsonElement());
    }
    
    @NotNull
    public Void serialize(@NotNull final Encoder encoder, @NotNull final Keyframe value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        throw new UnsupportedOperationException();
    }
    
    private final Keyframe parse(final JsonElement json) {
        final JsonElement $this$parse_u24lambda_u2d3 = json;
        Keyframe keyframe;
        if ($this$parse_u24lambda_u2d3 instanceof JsonObject) {
            final JsonElement $this$parse_u24lambda_u2d3_u24parseMolangVector = (JsonElement)((JsonObject)$this$parse_u24lambda_u2d3).get((Object)"pre");
            final Triple pre = ($this$parse_u24lambda_u2d3_u24parseMolangVector != null) ? parse$lambda-3$parseMolangVector($this$parse_u24lambda_u2d3_u24parseMolangVector) : null;
            final Object value = ((JsonObject)$this$parse_u24lambda_u2d3).get((Object)"post");
            Intrinsics.checkNotNull(value);
            final Triple post = parse$lambda-3$parseMolangVector((JsonElement)value);
            final JsonElement jsonElement = (JsonElement)((JsonObject)$this$parse_u24lambda_u2d3).get((Object)"lerp_mode");
            String contentOrNull = null;
            Label_0086: {
                if (jsonElement != null) {
                    final JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
                    if (jsonPrimitive != null) {
                        contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive);
                        break Label_0086;
                    }
                }
                contentOrNull = null;
            }
            final boolean smooth = Intrinsics.areEqual((Object)contentOrNull, (Object)"catmullrom");
            final Keyframe keyframe2;
            keyframe = keyframe2;
            Triple pre2;
            if ((pre2 = pre) == null) {
                pre2 = post;
            }
            keyframe2 = new Keyframe((Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression>)pre2, (Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression>)post, smooth);
        }
        else {
            final Triple it = parse$lambda-3$parseMolangVector($this$parse_u24lambda_u2d3);
            keyframe = new Keyframe((Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression>)it, (Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression>)it, false);
        }
        return keyframe;
    }
    
    private static final Triple<MolangExpression, MolangExpression, MolangExpression> parse$lambda-3$parseMolangVector(final JsonElement $this$parse_u24lambda_u2d3_u24parseMolangVector) {
        Triple triple;
        if ($this$parse_u24lambda_u2d3_u24parseMolangVector instanceof JsonArray) {
            if (((JsonArray)$this$parse_u24lambda_u2d3_u24parseMolangVector).size() == 3) {
                triple = new Triple((Object)MolangExpressionKt.parseMolangExpression((JsonPrimitive)((JsonArray)$this$parse_u24lambda_u2d3_u24parseMolangVector).get(0)), (Object)MolangExpressionKt.parseMolangExpression((JsonPrimitive)((JsonArray)$this$parse_u24lambda_u2d3_u24parseMolangVector).get(1)), (Object)MolangExpressionKt.parseMolangExpression((JsonPrimitive)((JsonArray)$this$parse_u24lambda_u2d3_u24parseMolangVector).get(2)));
            }
            else {
                final MolangExpression it = MolangExpressionKt.parseMolangExpression((JsonPrimitive)((JsonArray)$this$parse_u24lambda_u2d3_u24parseMolangVector).get(0));
                triple = new Triple((Object)it, (Object)it, (Object)it);
            }
        }
        else {
            final MolangExpression it = MolangExpressionKt.parseMolangExpression((JsonPrimitive)$this$parse_u24lambda_u2d3_u24parseMolangVector);
            triple = new Triple((Object)it, (Object)it, (Object)it);
        }
        return (Triple<MolangExpression, MolangExpression, MolangExpression>)triple;
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (Keyframe)value);
    }
    
    static {
        INSTANCE = new KeyframeSerializer();
        descriptor = JsonElement.Companion.serializer().getDescriptor();
    }
}
