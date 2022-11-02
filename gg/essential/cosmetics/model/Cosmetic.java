package gg.essential.cosmetics.model;

import gg.essential.holder.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.util.*;
import gg.essential.cosmetics.*;
import java.util.*;

public class Cosmetic implements DisplayNameHolder
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final String type;
    @SerializedName("c")
    @NotNull
    private final Map<String, String> displayNames;
    @SerializedName("d")
    @Nullable
    private final CosmeticAssets assets;
    @Deprecated
    @SerializedName("e")
    @Nullable
    private List<CosmeticSetting> settings;
    @SerializedName("f")
    private final int storePackageId;
    @SerializedName("g")
    @Nullable
    private Map<String, Double> prices;
    @SerializedName("h")
    @Nullable
    private Set<String> tags;
    @SerializedName("i")
    @NotNull
    private final DateTime createdAt;
    @SerializedName("j")
    @Nullable
    private final DateTime availableAfter;
    @SerializedName("k")
    @Nullable
    private final DateTime availableUntil;
    @SerializedName("l")
    @Nullable
    private Map<SkinLayer, Boolean> skinLayers;
    @SerializedName("m")
    @Nullable
    private Map<String, Integer> categories;
    
    public Cosmetic(@NotNull final String id, @NotNull final String type, @NotNull final Map<String, String> displayNames, @Nullable final CosmeticAssets assets, @Deprecated @Nullable final List<CosmeticSetting> settings, final int storePackageId, @Nullable final Map<String, Double> prices, @Nullable final Set<String> tags, @NotNull final DateTime createdAt, @Nullable final DateTime availableAfter, @Nullable final DateTime availableUntil, @Nullable final Map<SkinLayer, Boolean> skinLayers, @Nullable final Map<String, Integer> categories) {
        super();
        this.id = id;
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
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public String getType() {
        return this.type;
    }
    
    @NotNull
    @Override
    public Map<String, String> getDisplayNames() {
        return this.displayNames;
    }
    
    @Nullable
    public CosmeticAssets getAssets() {
        return this.assets;
    }
    
    public int getStorePackageId() {
        return this.storePackageId;
    }
    
    @NotNull
    public Map<String, Double> getPrices() {
        if (this.prices == null) {
            this.prices = Collections.emptyMap();
        }
        return this.prices;
    }
    
    @NotNull
    public Set<String> getTags() {
        if (this.tags == null) {
            this.tags = Collections.emptySet();
        }
        return this.tags;
    }
    
    @NotNull
    public DateTime getCreatedAt() {
        return this.createdAt;
    }
    
    @Nullable
    public DateTime getAvailableAfter() {
        return this.availableAfter;
    }
    
    @Nullable
    public DateTime getAvailableUntil() {
        return this.availableUntil;
    }
    
    @NotNull
    public Map<SkinLayer, Boolean> getSkinLayers() {
        if (this.skinLayers == null) {
            this.skinLayers = Collections.emptyMap();
        }
        return this.skinLayers;
    }
    
    @NotNull
    public Map<String, Integer> getCategories() {
        if (this.categories == null) {
            this.categories = Collections.emptyMap();
        }
        return this.categories;
    }
}
