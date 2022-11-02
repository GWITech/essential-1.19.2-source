package gg.essential.lib.kdiscordipc.core.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlinx.serialization.json.*;
import java.lang.management.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "currentPid", "", "getCurrentPid", "()J", "headerLength", "", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "KDiscordIPC" })
public final class ConstantsKt
{
    @NotNull
    private static final Json json;
    private static final long currentPid;
    
    @NotNull
    public static final Json getJson() {
        return ConstantsKt.json;
    }
    
    public static final long getCurrentPid() {
        return ConstantsKt.currentPid;
    }
    
    static {
        json = JsonKt.Json$default((Json)null, (Function1)ConstantsKt$json.ConstantsKt$json$1.INSTANCE, 1, (Object)null);
        final String name = ManagementFactory.getRuntimeMXBean().getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "getRuntimeMXBean().name");
        currentPid = Long.parseLong((String)StringsKt.split$default((CharSequence)name, new String[] { "@" }, false, 0, 6, (Object)null).get(0));
    }
}
