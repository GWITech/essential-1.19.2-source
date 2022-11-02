package gg.essential.cosmetics.model;

import gg.essential.holder.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.model.*;
import gg.essential.cosmetics.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.util.*;
import java.util.*;

public class CosmeticCategory implements DisplayNameHolder
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final Map<String, String> displayNames;
    @SerializedName("c")
    @NotNull
    private final EssentialAsset icon;
    @SerializedName("d")
    @Nullable
    private final Set<CosmeticSlot> slots;
    @SerializedName("e")
    @Nullable
    private final Set<String> tags;
    @SerializedName("f")
    private final int order;
    @SerializedName("g")
    @Nullable
    private final DateTime availableAfter;
    @SerializedName("h")
    @Nullable
    private final DateTime availableUntil;
    @SerializedName("i")
    @Nullable
    private Map<String, String> compactNames;
    @SerializedName("j")
    @Nullable
    private Map<String, String> descriptions;
    
    public CosmeticCategory(@NotNull final String id, @NotNull final Map<String, String> displayNames, @NotNull final EssentialAsset icon, @Nullable final Set<CosmeticSlot> slots, @Nullable final Set<String> tags, final int order, @Nullable final DateTime availableAfter, @Nullable final DateTime availableUntil, @Nullable final Map<String, String> compactNames, @Nullable final Map<String, String> descriptions) {
        super();
        this.id = id;
        this.displayNames = displayNames;
        this.icon = icon;
        this.slots = slots;
        this.tags = tags;
        this.order = order;
        this.availableAfter = availableAfter;
        this.availableUntil = availableUntil;
        this.compactNames = compactNames;
        this.descriptions = descriptions;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    @Override
    public Map<String, String> getDisplayNames() {
        return this.displayNames;
    }
    
    @NotNull
    public EssentialAsset getIcon() {
        return this.icon;
    }
    
    public int getOrder() {
        return this.order;
    }
    
    @NotNull
    public Map<String, String> getCompactNames() {
        if (this.compactNames == null) {
            this.compactNames = Collections.emptyMap();
        }
        return this.compactNames;
    }
    
    @Nullable
    public String getCompactName(@NotNull final String key) {
        return this.getCompactNames().get(key);
    }
    
    @NotNull
    public Map<String, String> getDescriptions() {
        if (this.descriptions == null) {
            this.descriptions = Collections.emptyMap();
        }
        return this.descriptions;
    }
}
