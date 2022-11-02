package gg.essential.mod.cosmetics;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001b\u0010\n\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001e" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticSetting;", "", "id", "", "type", "isEnabled", "", "data", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "getData", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "()Z", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "hasData", "hashCode", "", "toString", "cosmetics" })
public final class CosmeticSetting
{
    @Nullable
    private final String id;
    @NotNull
    private final String type;
    private final boolean isEnabled;
    @NotNull
    private final Map<String, Object> data;
    
    public CosmeticSetting(@Nullable final String id, @NotNull final String type, final boolean isEnabled, @NotNull final Map<String, ?> data) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)data, "data");
        super();
        this.id = id;
        this.type = type;
        this.isEnabled = isEnabled;
        this.data = (Map<String, Object>)data;
    }
    
    @Nullable
    public final String getId() {
        return this.id;
    }
    
    @NotNull
    public final String getType() {
        return this.type;
    }
    
    public final boolean isEnabled() {
        return this.isEnabled;
    }
    
    @NotNull
    public final Map<String, Object> getData() {
        return this.data;
    }
    
    @Nullable
    public final <T> T getData(@NotNull final String key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return (T)this.data.get(key);
    }
    
    public final boolean hasData(@NotNull final String key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.data.containsKey(key);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "CosmeticSetting(id=" + this.id + ", type=" + this.type + ", isEnabled=" + this.isEnabled + ", data=" + this.data + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.id == null) ? 0 : this.id.hashCode();
        result = result * 31 + this.type.hashCode();
        final int n = result * 31;
        int isEnabled;
        if ((isEnabled = (this.isEnabled ? 1 : 0)) != 0) {
            isEnabled = 1;
        }
        result = n + isEnabled;
        result = result * 31 + this.data.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CosmeticSetting)) {
            return false;
        }
        final CosmeticSetting cosmeticSetting = (CosmeticSetting)other;
        return Intrinsics.areEqual((Object)this.id, (Object)cosmeticSetting.id) && Intrinsics.areEqual((Object)this.type, (Object)cosmeticSetting.type) && this.isEnabled == cosmeticSetting.isEnabled && Intrinsics.areEqual((Object)this.data, (Object)cosmeticSetting.data);
    }
}
