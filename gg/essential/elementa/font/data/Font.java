package gg.essential.elementa.font.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.utils.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.io.*;
import com.google.gson.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lgg/essential/elementa/font/data/Font;", "", "fontInfo", "Lgg/essential/elementa/font/data/FontInfo;", "atlas", "Ljava/io/InputStream;", "(Lgg/essential/elementa/font/data/FontInfo;Ljava/io/InputStream;)V", "getFontInfo", "()Lgg/essential/elementa/font/data/FontInfo;", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "getTexture", "Companion", "Elementa" })
public final class Font
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final FontInfo fontInfo;
    @NotNull
    private final InputStream atlas;
    private ReleasedDynamicTexture texture;
    
    public Font(@NotNull final FontInfo fontInfo, @NotNull final InputStream atlas) {
        Intrinsics.checkNotNullParameter((Object)fontInfo, "fontInfo");
        Intrinsics.checkNotNullParameter((Object)atlas, "atlas");
        super();
        this.fontInfo = fontInfo;
        this.atlas = atlas;
    }
    
    @NotNull
    public final FontInfo getFontInfo() {
        return this.fontInfo;
    }
    
    @NotNull
    public final ReleasedDynamicTexture getTexture() {
        if (this.texture == null) {
            final ReleasedDynamicTexture texture = UGraphics.getTexture(this.atlas);
            Intrinsics.checkNotNullExpressionValue((Object)texture, "getTexture(atlas)");
            this.texture = texture;
        }
        ReleasedDynamicTexture texture2;
        if ((texture2 = this.texture) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("texture");
            texture2 = null;
        }
        return texture2;
    }
    
    static {
        Companion = new Companion(null);
    }
    
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
}
