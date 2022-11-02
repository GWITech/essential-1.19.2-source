package gg.essential.util.resource;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.io.*;
import gg.essential.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020	H\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b""" }, d2 = { "Lgg/essential/util/resource/Lang3As4Pack$JsonFromProp;", "Lgg/essential/util/resource/ResourcePackAdapter$FileMapper;", "path", "", "(Ljava/lang/String;)V", "parentPath", "getParentPath", "()Ljava/lang/String;", "map", "Ljava/io/InputStream;", "stream", "essential" })
public static final class JsonFromProp implements FileMapper
{
    @NotNull
    private final String parentPath;
    
    public JsonFromProp(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        super();
        final String substring = path.substring(0, path.length() - 4);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        this.parentPath = substring + "lang";
    }
    
    @NotNull
    @Override
    public String getParentPath() {
        return this.parentPath;
    }
    
    @NotNull
    @Override
    public InputStream map(@NotNull final InputStream stream) {
        Intrinsics.checkNotNullParameter((Object)stream, "stream");
        final Map entries = new LinkedHashMap();
        final Closeable closeable = stream;
        Throwable t = null;
        try {
            TextStreamsKt.forEachLine((Reader)new BufferedReader(new InputStreamReader(stream, Charsets.UTF_8), 8192), (Function1)new Lang3As4Pack$JsonFromProp$map$1.Lang3As4Pack$JsonFromProp$map$1$1(entries));
            final Unit instance = Unit.INSTANCE;
        }
        catch (final Throwable t2) {
            t = t2;
            throw t2;
        }
        finally {
            CloseableKt.closeFinally(closeable, t);
        }
        final String json = Essential.GSON.toJson(entries);
        Intrinsics.checkNotNullExpressionValue((Object)json, "GSON.toJson(entries)");
        final byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue((Object)bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
}
