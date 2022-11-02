package gg.essential.gui.about.components;

import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.stream.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\f\u001a
                                                   \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog;", "", "content", "", "platforms", "", "(Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getPlatforms", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ValueAdapter", "essential" })
public static final class PlatformChangelog
{
    @SerializedName("value")
    @JsonAdapter(ValueAdapter.class)
    @NotNull
    private final String content;
    @Nullable
    private final List<String> platforms;
    
    @NotNull
    public final String getContent() {
        return this.content;
    }
    
    @Nullable
    public final List<String> getPlatforms() {
        return this.platforms;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PlatformChangelog(content=" + this.content + ", platforms=" + this.platforms;
    }
    
    @Override
    public int hashCode() {
        int result = this.content.hashCode();
        result = result * 31 + ((this.platforms == null) ? 0 : this.platforms.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformChangelog)) {
            return false;
        }
        final PlatformChangelog platformChangelog = (PlatformChangelog)other;
        return Intrinsics.areEqual((Object)this.content, (Object)platformChangelog.content) && Intrinsics.areEqual((Object)this.platforms, (Object)platformChangelog.platforms);
    }
    
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
}
