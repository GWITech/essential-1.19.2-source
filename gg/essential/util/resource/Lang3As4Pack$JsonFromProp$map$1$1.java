package gg.essential.util.resource;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class Lang3As4Pack$JsonFromProp$map$1$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Map<String, String> $entries;
    
    Lang3As4Pack$JsonFromProp$map$1$1(final Map<String, String> $entries) {
        this.$entries = $entries;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final String line = StringsKt.trim((CharSequence)it).toString();
        if (line.length() == 0 || StringsKt.startsWith$default(line, "#", false, 2, (Object)null)) {
            return;
        }
        final List split$default = StringsKt.split$default((CharSequence)line, new char[] { '=' }, false, 2, 2, (Object)null);
        final String key = (String)split$default.get(0);
        final String value = (String)split$default.get(1);
        this.$entries.put(key, value);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}