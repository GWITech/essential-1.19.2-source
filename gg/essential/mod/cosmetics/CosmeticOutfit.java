package gg.essential.mod.cosmetics;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.time.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J\u001b\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\rH\u00c6\u0003J\r\u0010&\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001f¨\u0006-" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticOutfit;", "", "id", "", "name", "skinTexture", "equippedCosmetics", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "cosmeticSettings", "", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "isSelected", "", "createdAt", "Ljava/time/Instant;", "Lgg/essential/model/util/Instant;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZLjava/time/Instant;)V", "getCosmeticSettings", "()Ljava/util/Map;", "getCreatedAt", "()Ljava/time/Instant;", "getEquippedCosmetics", "getId", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getName", "getSkinTexture", "setSkinTexture", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "cosmetics" })
public final class CosmeticOutfit
{
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @Nullable
    private String skinTexture;
    @NotNull
    private final Map<CosmeticSlot, String> equippedCosmetics;
    @NotNull
    private final Map<String, List<CosmeticSetting>> cosmeticSettings;
    private boolean isSelected;
    @NotNull
    private final Instant createdAt;
    
    public CosmeticOutfit(@NotNull final String id, @NotNull final String name, @Nullable final String skinTexture, @NotNull final Map<CosmeticSlot, String> equippedCosmetics, @NotNull final Map<String, List<CosmeticSetting>> cosmeticSettings, final boolean isSelected, @NotNull final Instant createdAt) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)equippedCosmetics, "equippedCosmetics");
        Intrinsics.checkNotNullParameter((Object)cosmeticSettings, "cosmeticSettings");
        Intrinsics.checkNotNullParameter((Object)createdAt, "createdAt");
        super();
        this.id = id;
        this.name = name;
        this.skinTexture = skinTexture;
        this.equippedCosmetics = equippedCosmetics;
        this.cosmeticSettings = cosmeticSettings;
        this.isSelected = isSelected;
        this.createdAt = createdAt;
    }
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    @Nullable
    public final String getSkinTexture() {
        return this.skinTexture;
    }
    
    public final void setSkinTexture(@Nullable final String <set-?>) {
        this.skinTexture = <set-?>;
    }
    
    @NotNull
    public final Map<CosmeticSlot, String> getEquippedCosmetics() {
        return this.equippedCosmetics;
    }
    
    @NotNull
    public final Map<String, List<CosmeticSetting>> getCosmeticSettings() {
        return this.cosmeticSettings;
    }
    
    public final boolean isSelected() {
        return this.isSelected;
    }
    
    public final void setSelected(final boolean <set-?>) {
        this.isSelected = <set-?>;
    }
    
    @NotNull
    public final Instant getCreatedAt() {
        return this.createdAt;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "CosmeticOutfit(id=" + this.id + ", name=" + this.name + ", skinTexture=" + this.skinTexture + ", equippedCosmetics=" + this.equippedCosmetics + ", cosmeticSettings=" + this.cosmeticSettings + ", isSelected=" + this.isSelected + ", createdAt=" + this.createdAt + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + ((this.skinTexture == null) ? 0 : this.skinTexture.hashCode());
        result = result * 31 + this.equippedCosmetics.hashCode();
        result = result * 31 + this.cosmeticSettings.hashCode();
        final int n = result * 31;
        int isSelected;
        if ((isSelected = (this.isSelected ? 1 : 0)) != 0) {
            isSelected = 1;
        }
        result = n + isSelected;
        result = result * 31 + this.createdAt.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CosmeticOutfit)) {
            return false;
        }
        final CosmeticOutfit cosmeticOutfit = (CosmeticOutfit)other;
        return Intrinsics.areEqual((Object)this.id, (Object)cosmeticOutfit.id) && Intrinsics.areEqual((Object)this.name, (Object)cosmeticOutfit.name) && Intrinsics.areEqual((Object)this.skinTexture, (Object)cosmeticOutfit.skinTexture) && Intrinsics.areEqual((Object)this.equippedCosmetics, (Object)cosmeticOutfit.equippedCosmetics) && Intrinsics.areEqual((Object)this.cosmeticSettings, (Object)cosmeticOutfit.cosmeticSettings) && this.isSelected == cosmeticOutfit.isSelected && Intrinsics.areEqual((Object)this.createdAt, (Object)cosmeticOutfit.createdAt);
    }
}
