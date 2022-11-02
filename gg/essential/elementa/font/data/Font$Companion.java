package gg.essential.elementa.font.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.text.*;
import java.io.*;
import com.google.gson.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/font/data/Font$Companion;", "", "()V", "fromResource", "Lgg/essential/elementa/font/data/Font;", "path", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final Font fromResource(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        final InputStream json = this.getClass().getResourceAsStream(Intrinsics.stringPlus(path, (Object)".json"));
        final FontInfo.Companion companion = FontInfo.Companion;
        final JsonParser jsonParser = new JsonParser();
        Intrinsics.checkNotNullExpressionValue((Object)json, "json");
        final JsonObject asJsonObject = jsonParser.parse(new InputStreamReader(json, Charsets.UTF_8)).getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue((Object)asJsonObject, "JsonParser().parse(json.reader()).asJsonObject");
        final FontInfo fromJson;
        final FontInfo fontInfo = fromJson = companion.fromJson(asJsonObject);
        final InputStream resourceAsStream = this.getClass().getResourceAsStream(Intrinsics.stringPlus(path, (Object)".png"));
        Intrinsics.checkNotNullExpressionValue((Object)resourceAsStream, "this::class.java.getResourceAsStream(\"$path.png\")");
        return new Font(fromJson, resourceAsStream);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
