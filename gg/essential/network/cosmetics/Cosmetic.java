package gg.essential.network.cosmetics;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.time.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import gg.essential.model.util.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\b\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\u0002\u0010\u001dJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\r\u00105\u001a\u00060\u0015j\u0002`\u0016H\u00c6\u0003J\u0011\u00106\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u00c6\u0003J\u0011\u00107\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u00c6\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\bH\u00c6\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\t\u0010?\u001a\u00020\u000fH\u00c6\u0003J\u0015\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\bH\u00c6\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u00c6\u0003J\u00e9\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\b\u0002\u0010\u0014\u001a\u00060\u0015j\u0002`\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u00c6\u0001J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0013\u0010D\u001a\u00020\u001b2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u00032\u0006\u0010G\u001a\u00020\u0003J\u0015\u0010H\u001a\u0004\u0018\u00010\u00112\u0006\u0010I\u001a\u00020\u0003¢\u0006\u0002\u0010JJ\t\u0010K\u001a\u00020\u000fH\u00d6\u0001J\u0006\u0010L\u001a\u00020\u001bJ\u0012\u0010M\u001a\u00020\u001b2\n\u0010N\u001a\u00060\u0015j\u0002`\u0016J\u0006\u0010O\u001a\u00020\u001bJ\t\u0010P\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(¨\u0006Q" }, d2 = { "Lgg/essential/network/cosmetics/Cosmetic;", "", "id", "", "typeId", "type", "Lgg/essential/mod/cosmetics/CosmeticType;", "displayNames", "", "assets", "Lgg/essential/mod/cosmetics/CosmeticAssets;", "settings", "", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "storePackageId", "", "prices", "", "tags", "", "createdAt", "Ljava/time/Instant;", "Lgg/essential/model/util/Instant;", "availableAfter", "availableUntil", "skinLayers", "Lgg/essential/mod/cosmetics/SkinLayer;", "", "categories", "(Ljava/lang/String;Ljava/lang/String;Lgg/essential/mod/cosmetics/CosmeticType;Ljava/util/Map;Lgg/essential/mod/cosmetics/CosmeticAssets;Ljava/util/List;ILjava/util/Map;Ljava/util/Set;Ljava/time/Instant;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/Map;Ljava/util/Map;)V", "getAssets", "()Lgg/essential/mod/cosmetics/CosmeticAssets;", "getAvailableAfter", "()Ljava/time/Instant;", "getAvailableUntil", "getCategories", "()Ljava/util/Map;", "getCreatedAt", "getDisplayNames", "getId", "()Ljava/lang/String;", "getPrices", "getSettings", "()Ljava/util/List;", "getSkinLayers", "getStorePackageId", "()I", "getTags", "()Ljava/util/Set;", "getType", "()Lgg/essential/mod/cosmetics/CosmeticType;", "getTypeId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyWithType", "equals", "other", "getDisplayName", "locale", "getPrice", "currency", "(Ljava/lang/String;)Ljava/lang/Double;", "hashCode", "isAvailable", "isAvailableAt", "dateTime", "requiresUnlockAction", "toString", "cosmetics" })
public final class Cosmetic
{
    @NotNull
    private final String id;
    @NotNull
    private final String typeId;
    @NotNull
    private final CosmeticType type;
    @NotNull
    private final Map<String, String> displayNames;
    @Nullable
    private final CosmeticAssets assets;
    @NotNull
    private final List<CosmeticSetting> settings;
    private final int storePackageId;
    @NotNull
    private final Map<String, Double> prices;
    @NotNull
    private final Set<String> tags;
    @NotNull
    private final Instant createdAt;
    @Nullable
    private final Instant availableAfter;
    @Nullable
    private final Instant availableUntil;
    @NotNull
    private final Map<SkinLayer, Boolean> skinLayers;
    @Nullable
    private final Map<String, Integer> categories;
    
    public Cosmetic(@NotNull final String id, @NotNull final String typeId, @NotNull final CosmeticType type, @NotNull final Map<String, String> displayNames, @Nullable final CosmeticAssets assets, @NotNull final List<CosmeticSetting> settings, final int storePackageId, @NotNull final Map<String, Double> prices, @NotNull final Set<String> tags, @NotNull final Instant createdAt, @Nullable final Instant availableAfter, @Nullable final Instant availableUntil, @NotNull final Map<SkinLayer, Boolean> skinLayers, @Nullable final Map<String, Integer> categories) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        Intrinsics.checkNotNullParameter((Object)typeId, "typeId");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)displayNames, "displayNames");
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        Intrinsics.checkNotNullParameter((Object)prices, "prices");
        Intrinsics.checkNotNullParameter((Object)tags, "tags");
        Intrinsics.checkNotNullParameter((Object)createdAt, "createdAt");
        Intrinsics.checkNotNullParameter((Object)skinLayers, "skinLayers");
        super();
        this.id = id;
        this.typeId = typeId;
        this.type = type;
        this.displayNames = displayNames;
        this.assets = assets;
        this.settings = settings;
        this.storePackageId = storePackageId;
        this.prices = prices;
        this.tags = tags;
        this.createdAt = createdAt;
        this.availableAfter = availableAfter;
        this.availableUntil = availableUntil;
        this.skinLayers = skinLayers;
        this.categories = categories;
    }
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    @NotNull
    public final String getTypeId() {
        return this.typeId;
    }
    
    @NotNull
    public final CosmeticType getType() {
        return this.type;
    }
    
    @NotNull
    public final Map<String, String> getDisplayNames() {
        return this.displayNames;
    }
    
    @Nullable
    public final CosmeticAssets getAssets() {
        return this.assets;
    }
    
    @NotNull
    public final List<CosmeticSetting> getSettings() {
        return this.settings;
    }
    
    public final int getStorePackageId() {
        return this.storePackageId;
    }
    
    @NotNull
    public final Map<String, Double> getPrices() {
        return this.prices;
    }
    
    @NotNull
    public final Set<String> getTags() {
        return this.tags;
    }
    
    @NotNull
    public final Instant getCreatedAt() {
        return this.createdAt;
    }
    
    @Nullable
    public final Instant getAvailableAfter() {
        return this.availableAfter;
    }
    
    @Nullable
    public final Instant getAvailableUntil() {
        return this.availableUntil;
    }
    
    @NotNull
    public final Map<SkinLayer, Boolean> getSkinLayers() {
        return this.skinLayers;
    }
    
    @Nullable
    public final Map<String, Integer> getCategories() {
        return this.categories;
    }
    
    public final boolean isAvailable() {
        return this.availableAfter != null && this.isAvailableAt(InstantKt.now());
    }
    
    public final boolean isAvailableAt(@NotNull final Instant dateTime) {
        Intrinsics.checkNotNullParameter((Object)dateTime, "dateTime");
        return this.availableAfter != null && this.availableAfter.compareTo(dateTime) < 0 && (this.availableUntil == null || this.availableUntil.compareTo(dateTime) > 0);
    }
    
    @Nullable
    public final String getDisplayName(@NotNull final String locale) {
        Intrinsics.checkNotNullParameter((Object)locale, "locale");
        return this.displayNames.get(locale);
    }
    
    @Nullable
    public final Double getPrice(@NotNull final String currency) {
        Intrinsics.checkNotNullParameter((Object)currency, "currency");
        return this.prices.get(currency);
    }
    
    public final boolean requiresUnlockAction() {
        final Iterable $this$any$iv = this.settings;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final CosmeticSetting it = (CosmeticSetting)element$iv;
                if (Intrinsics.areEqual((Object)it.getType(), (Object)"REQUIRES_UNLOCK_ACTION")) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    @NotNull
    public final Cosmetic copyWithType(@NotNull final CosmeticType type) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        return copy$default$1bba9f61$6b28cdfd(this, type);
    }
    
    @NotNull
    public final Cosmetic copy(@NotNull final String id, @NotNull final String typeId, @NotNull final CosmeticType type, @NotNull final Map<String, String> displayNames, @Nullable final CosmeticAssets assets, @NotNull final List<CosmeticSetting> settings, final int storePackageId, @NotNull final Map<String, Double> prices, @NotNull final Set<String> tags, @NotNull final Instant createdAt, @Nullable final Instant availableAfter, @Nullable final Instant availableUntil, @NotNull final Map<SkinLayer, Boolean> skinLayers, @Nullable final Map<String, Integer> categories) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        Intrinsics.checkNotNullParameter((Object)typeId, "typeId");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)displayNames, "displayNames");
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        Intrinsics.checkNotNullParameter((Object)prices, "prices");
        Intrinsics.checkNotNullParameter((Object)tags, "tags");
        Intrinsics.checkNotNullParameter((Object)createdAt, "createdAt");
        Intrinsics.checkNotNullParameter((Object)skinLayers, "skinLayers");
        return new Cosmetic(id, typeId, type, displayNames, assets, settings, storePackageId, prices, tags, createdAt, availableAfter, availableUntil, skinLayers, categories);
    }
    
    public static /* synthetic */ Cosmetic copy$default$1bba9f61$6b28cdfd(final Cosmetic cosmetic, final CosmeticType type) {
        return cosmetic.copy(cosmetic.id, cosmetic.typeId, type, cosmetic.displayNames, cosmetic.assets, cosmetic.settings, cosmetic.storePackageId, cosmetic.prices, cosmetic.tags, cosmetic.createdAt, cosmetic.availableAfter, cosmetic.availableUntil, cosmetic.skinLayers, cosmetic.categories);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Cosmetic(id=").append(this.id).append(", typeId=").append(this.typeId).append(", type=").append(this.type).append(", displayNames=").append(this.displayNames).append(", assets=").append(this.assets).append(", settings=").append(this.settings).append(", storePackageId=").append(this.storePackageId).append(", prices=").append(this.prices).append(", tags=").append(this.tags).append(", createdAt=").append(this.createdAt).append(", availableAfter=").append(this.availableAfter).append(", availableUntil=");
        sb.append(this.availableUntil).append(", skinLayers=").append(this.skinLayers).append(", categories=").append(this.categories).append(')');
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.typeId.hashCode();
        result = result * 31 + this.type.hashCode();
        result = result * 31 + this.displayNames.hashCode();
        result = result * 31 + ((this.assets == null) ? 0 : this.assets.hashCode());
        result = result * 31 + this.settings.hashCode();
        result = result * 31 + Integer.hashCode(this.storePackageId);
        result = result * 31 + this.prices.hashCode();
        result = result * 31 + this.tags.hashCode();
        result = result * 31 + this.createdAt.hashCode();
        result = result * 31 + ((this.availableAfter == null) ? 0 : this.availableAfter.hashCode());
        result = result * 31 + ((this.availableUntil == null) ? 0 : this.availableUntil.hashCode());
        result = result * 31 + this.skinLayers.hashCode();
        result = result * 31 + ((this.categories == null) ? 0 : this.categories.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cosmetic)) {
            return false;
        }
        final Cosmetic cosmetic = (Cosmetic)other;
        return Intrinsics.areEqual((Object)this.id, (Object)cosmetic.id) && Intrinsics.areEqual((Object)this.typeId, (Object)cosmetic.typeId) && Intrinsics.areEqual((Object)this.type, (Object)cosmetic.type) && Intrinsics.areEqual((Object)this.displayNames, (Object)cosmetic.displayNames) && Intrinsics.areEqual((Object)this.assets, (Object)cosmetic.assets) && Intrinsics.areEqual((Object)this.settings, (Object)cosmetic.settings) && this.storePackageId == cosmetic.storePackageId && Intrinsics.areEqual((Object)this.prices, (Object)cosmetic.prices) && Intrinsics.areEqual((Object)this.tags, (Object)cosmetic.tags) && Intrinsics.areEqual((Object)this.createdAt, (Object)cosmetic.createdAt) && Intrinsics.areEqual((Object)this.availableAfter, (Object)cosmetic.availableAfter) && Intrinsics.areEqual((Object)this.availableUntil, (Object)cosmetic.availableUntil) && Intrinsics.areEqual((Object)this.skinLayers, (Object)cosmetic.skinLayers) && Intrinsics.areEqual((Object)this.categories, (Object)cosmetic.categories);
    }
}
