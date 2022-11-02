package gg.essential.model.util;

import kotlin.*;
import java.time.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001*\n\u0010\u0002\"\u00020\u00012\u00020\u0001¨\u0006\u0003" }, d2 = { "now", "Ljava/time/Instant;", "Instant", "cosmetics" })
public final class InstantKt
{
    @NotNull
    public static final Instant now() {
        final Instant now = Instant.now();
        Intrinsics.checkNotNullExpressionValue((Object)now, "now()");
        return now;
    }
}
