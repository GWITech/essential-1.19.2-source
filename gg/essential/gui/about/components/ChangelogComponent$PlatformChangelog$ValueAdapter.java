package gg.essential.gui.about.components;

import gg.essential.lib.gson.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.stream.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog$ValueAdapter;", "Lgg/essential/lib/gson/TypeAdapter;", "", "()V", "read", "reader", "Lgg/essential/lib/gson/stream/JsonReader;", "write", "", "out", "Lgg/essential/lib/gson/stream/JsonWriter;", "value", "essential" })
private static final class ValueAdapter extends TypeAdapter<String>
{
    @Override
    public void write(@NotNull final JsonWriter out, @Nullable final String value) {
        Intrinsics.checkNotNullParameter((Object)out, "out");
        out.value(value);
    }
    
    @NotNull
    @Override
    public String read(@NotNull final JsonReader reader) {
        Intrinsics.checkNotNullParameter((Object)reader, "reader");
        final String nextString = reader.nextString();
        Intrinsics.checkNotNullExpressionValue((Object)nextString, "reader.nextString()");
        return StringsKt.replace$default(new Regex("```.*?[\\s\\n\\r]").replace((CharSequence)nextString, ""), "`", "", false, 4, (Object)null);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter p0, final Object p1) {
        this.write(p0, (String)p1);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader p0) {
        return this.read(p0);
    }
}
