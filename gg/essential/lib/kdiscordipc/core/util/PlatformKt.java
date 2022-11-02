package gg.essential.lib.kdiscordipc.core.util;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "platform", "Lgg/essential/lib/kdiscordipc/core/util/Platform;", "getPlatform", "()Ldev/cbyrne/kdiscordipc/core/util/Platform;", "KDiscordIPC" })
public final class PlatformKt
{
    @NotNull
    public static final Platform getPlatform() {
        final String property = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue((Object)property, "getProperty(\"os.name\")");
        final String lowerCase = property.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        final String name = lowerCase;
        return StringsKt.contains$default((CharSequence)name, (CharSequence)"win", false, 2, (Object)null) ? Platform.WINDOWS : (StringsKt.contains$default((CharSequence)name, (CharSequence)"mac", false, 2, (Object)null) ? Platform.MACOS : ((StringsKt.contains$default((CharSequence)name, (CharSequence)"nix", false, 2, (Object)null) || StringsKt.contains$default((CharSequence)name, (CharSequence)"nux", false, 2, (Object)null) || StringsKt.contains$default((CharSequence)name, (CharSequence)"aix", false, 2, (Object)null)) ? Platform.LINUX : Platform.UNKNOWN));
    }
}
