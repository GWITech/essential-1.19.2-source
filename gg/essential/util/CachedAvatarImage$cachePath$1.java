package gg.essential.util;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.nio.file.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0017
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0006""" }, d2 = { "gg/essential/util/CachedAvatarImage$cachePath$1", "", "get", "Ljava/nio/file/Path;", "uuid", "Ljava/util/UUID;", "essential" })
public static final class CachedAvatarImage$cachePath$1 {
    CachedAvatarImage$cachePath$1() {
        super();
    }
    
    @NotNull
    public final Path get(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final String it = ExtensionsKt.toDashlessString(uuid);
        final Path resolve = CachedAvatarImage.access$getCacheBasePath$p().resolve(String.valueOf(it.charAt(0))).resolve(String.valueOf(it.charAt(1)));
        final String substring = it.substring(2);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
        final Path resolve2 = resolve.resolve(substring);
        Intrinsics.checkNotNullExpressionValue((Object)resolve2, "uuid.toDashlessString().\u2026t.substring(2))\n        }");
        return resolve2;
    }
}