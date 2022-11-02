package gg.essential.model.file;

import kotlinx.serialization.*;
import kotlinx.serialization.descriptors.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlin.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010" }, d2 = { "Lgg/essential/model/file/LoopSerializer;", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/AnimationFile$Loop;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
public final class LoopSerializer implements KSerializer<AnimationFile.Loop>
{
    @NotNull
    private final SerialDescriptor descriptor;
    
    public LoopSerializer() {
        super();
        this.descriptor = JsonElement.Companion.serializer().getDescriptor();
    }
    
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    @NotNull
    public AnimationFile.Loop deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        final String json = JsonElementKt.getJsonPrimitive(((JsonDecoder)decoder).decodeJsonElement()).getContent();
        switch (json) {
            case "false": {
                return AnimationFile.Loop.False;
            }
            case "true": {
                return AnimationFile.Loop.True;
            }
            case "hold_on_last_frame": {
                return AnimationFile.Loop.HoldOnLastFrame;
            }
            default:
                break;
        }
        throw new IllegalArgumentException("Unexpected value \"" + json + '\"');
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final AnimationFile.Loop value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        final JsonEncoder jsonEncoder = (JsonEncoder)encoder;
        jsonEncoder.encodeJsonElement((JsonElement)switch (LoopSerializer.WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1 -> JsonElementKt.JsonPrimitive(Boolean.valueOf(false));
            case 2 -> JsonElementKt.JsonPrimitive(Boolean.valueOf(true));
            case 3 -> JsonElementKt.JsonPrimitive("hold_on_last_frame");
            default -> throw new NoWhenBranchMatchedException();
        });
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (AnimationFile.Loop)value);
    }
}
