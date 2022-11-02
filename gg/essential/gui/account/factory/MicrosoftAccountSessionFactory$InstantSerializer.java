package gg.essential.gui.account.factory;

import java.time.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u0010H\u0016¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$InstantSerializer;", "Lgg/essential/lib/gson/JsonSerializer;", "Ljava/time/Instant;", "Lgg/essential/lib/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lgg/essential/lib/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lgg/essential/lib/gson/JsonDeserializationContext;", "serialize", "Lgg/essential/lib/gson/JsonObject;", "src", "typeOfSrc", "Lgg/essential/lib/gson/JsonSerializationContext;", "essential" })
private static final class InstantSerializer implements JsonDeserializer<Instant>, JsonSerializer<Instant>
{
    public InstantSerializer() {
        super();
    }
    
    @NotNull
    @Override
    public Instant deserialize(@NotNull final JsonElement json, @NotNull final Type typeOfT, @NotNull final JsonDeserializationContext context) {
        Intrinsics.checkNotNullParameter((Object)json, "json");
        Intrinsics.checkNotNullParameter((Object)typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        final long seconds = ((JsonObject)json).get("seconds").getAsLong();
        final long nanos = ((JsonObject)json).get("nanos").getAsLong();
        final Instant ofEpochSecond = Instant.ofEpochSecond(seconds, nanos);
        Intrinsics.checkNotNullExpressionValue((Object)ofEpochSecond, "ofEpochSecond(seconds, nanos)");
        return ofEpochSecond;
    }
    
    @NotNull
    @Override
    public JsonObject serialize(@NotNull final Instant src, @NotNull final Type typeOfSrc, @NotNull final JsonSerializationContext context) {
        Intrinsics.checkNotNullParameter((Object)src, "src");
        Intrinsics.checkNotNullParameter((Object)typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        final JsonObject $this$serialize_u24lambda_u2d0;
        final JsonObject jsonObject = $this$serialize_u24lambda_u2d0 = new JsonObject();
        $this$serialize_u24lambda_u2d0.add("seconds", context.serialize(src.getEpochSecond()));
        $this$serialize_u24lambda_u2d0.add("nanos", context.serialize(src.getNano()));
        return jsonObject;
    }
    
    @Override
    public /* bridge */ Object deserialize(final JsonElement p0, final Type p1, final JsonDeserializationContext p2) {
        return this.deserialize(p0, p1, p2);
    }
    
    @Override
    public /* bridge */ JsonElement serialize(final Object p0, final Type p1, final JsonSerializationContext p2) {
        return this.serialize((Instant)p0, p1, p2);
    }
}
