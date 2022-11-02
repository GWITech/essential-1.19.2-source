package gg.essential.network.cosmetics.cape;

import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.stream.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0013
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ	\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J	\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010¨\u0006\u001c""" }, d2 = { "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "", "id", "", "active", "", "url", "name", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "hash", "getHash", "()Ljava/lang/String;", "getId", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "StateAdapter", "essential" })
public static final class Cape
{
    @NotNull
    private final String id;
    @SerializedName("state")
    @JsonAdapter(StateAdapter.class)
    private final boolean active;
    @NotNull
    private final String url;
    @SerializedName("alias")
    @NotNull
    private final String name;
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    public final boolean getActive() {
        return this.active;
    }
    
    @NotNull
    public final String getUrl() {
        return this.url;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @NotNull
    public final String getHash() {
        return StringsKt.split$default((CharSequence)this.url, new String[] { "/texture/" }, false, 0, 6, (Object)null).get(1);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Cape(id=" + this.id + ", active=" + this.active + ", url=" + this.url + ", name=" + this.name;
    }
    
    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        final int n = result * 31;
        int active;
        if ((active = (this.active ? 1 : 0)) != 0) {
            active = 1;
        }
        result = n + active;
        result = result * 31 + this.url.hashCode();
        result = result * 31 + this.name.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cape)) {
            return false;
        }
        final Cape cape = (Cape)other;
        return Intrinsics.areEqual((Object)this.id, (Object)cape.id) && this.active == cape.active && Intrinsics.areEqual((Object)this.url, (Object)cape.url) && Intrinsics.areEqual((Object)this.name, (Object)cape.name);
    }
    
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
}
