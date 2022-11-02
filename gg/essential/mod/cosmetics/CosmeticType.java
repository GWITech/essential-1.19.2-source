package gg.essential.mod.cosmetics;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticType;", "", "id", "", "slot", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "displayNames", "", "skinLayers", "Lgg/essential/mod/cosmetics/SkinLayer;", "", "(Ljava/lang/String;Lgg/essential/mod/cosmetics/CosmeticSlot;Ljava/util/Map;Ljava/util/Map;)V", "getDisplayNames", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getSkinLayers", "getSlot", "()Lgg/essential/mod/cosmetics/CosmeticSlot;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "cosmetics" })
public final class CosmeticType
{
    @NotNull
    private final String id;
    @NotNull
    private final CosmeticSlot slot;
    @NotNull
    private final Map<String, String> displayNames;
    @Nullable
    private final Map<SkinLayer, Boolean> skinLayers;
    
    public CosmeticType(@NotNull final String id, @NotNull final CosmeticSlot slot, @NotNull final Map<String, String> displayNames, @Nullable final Map<SkinLayer, Boolean> skinLayers) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        Intrinsics.checkNotNullParameter((Object)slot, "slot");
        Intrinsics.checkNotNullParameter((Object)displayNames, "displayNames");
        super();
        this.id = id;
        this.slot = slot;
        this.displayNames = displayNames;
        this.skinLayers = skinLayers;
    }
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    @NotNull
    public final CosmeticSlot getSlot() {
        return this.slot;
    }
    
    @Nullable
    public final Map<SkinLayer, Boolean> getSkinLayers() {
        return this.skinLayers;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "CosmeticType(id=" + this.id + ", slot=" + this.slot + ", displayNames=" + this.displayNames + ", skinLayers=" + this.skinLayers + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.slot.hashCode();
        result = result * 31 + this.displayNames.hashCode();
        result = result * 31 + ((this.skinLayers == null) ? 0 : this.skinLayers.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CosmeticType)) {
            return false;
        }
        final CosmeticType cosmeticType = (CosmeticType)other;
        return Intrinsics.areEqual((Object)this.id, (Object)cosmeticType.id) && this.slot == cosmeticType.slot && Intrinsics.areEqual((Object)this.displayNames, (Object)cosmeticType.displayNames) && Intrinsics.areEqual((Object)this.skinLayers, (Object)cosmeticType.skinLayers);
    }
}
