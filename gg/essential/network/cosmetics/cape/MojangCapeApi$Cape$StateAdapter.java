package gg.essential.network.cosmetics.cape;

import gg.essential.lib.gson.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.stream.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006""" }, d2 = { "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape$StateAdapter;", "Lgg/essential/lib/gson/TypeAdapter;", "", "()V", "read", "reader", "Lgg/essential/lib/gson/stream/JsonReader;", "(Lgg/essential/lib/gson/stream/JsonReader;)Ljava/lang/Boolean;", "write", "", "out", "Lgg/essential/lib/gson/stream/JsonWriter;", "value", "essential" })
private static final class StateAdapter extends TypeAdapter<Boolean>
{
    @NotNull
    @Override
    public Boolean read(@NotNull final JsonReader reader) {
        Intrinsics.checkNotNullParameter((Object)reader, "reader");
        return Intrinsics.areEqual((Object)reader.nextString(), (Object)"ACTIVE");
    }
    
    public void write(@NotNull final JsonWriter out, final boolean value) {
        Intrinsics.checkNotNullParameter((Object)out, "out");
        out.value(value ? "ACTIVE" : "INACTIVE");
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader p0) {
        return this.read(p0);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter p0, final Object p1) {
        this.write(p0, (boolean)p1);
    }
}
