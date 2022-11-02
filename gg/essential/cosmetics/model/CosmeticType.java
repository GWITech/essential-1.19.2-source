package gg.essential.cosmetics.model;

import gg.essential.holder.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import gg.essential.cosmetics.*;
import org.jetbrains.annotations.*;

public class CosmeticType implements DisplayNameHolder
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final CosmeticSlot slot;
    @SerializedName("c")
    @NotNull
    private final Map<String, String> displayNames;
    @SerializedName("d")
    @Nullable
    private final Map<SkinLayer, Boolean> skinLayers;
    
    public CosmeticType(@NotNull final String id, @NotNull final CosmeticSlot slot, @NotNull final Map<String, String> displayNames, @Nullable final Map<SkinLayer, Boolean> skinLayers) {
        super();
        this.id = id;
        this.slot = slot;
        this.displayNames = displayNames;
        this.skinLayers = skinLayers;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public CosmeticSlot getSlot() {
        return this.slot;
    }
    
    @NotNull
    @Override
    public Map<String, String> getDisplayNames() {
        return this.displayNames;
    }
    
    @Nullable
    public Map<SkinLayer, Boolean> getSkinLayers() {
        return this.skinLayers;
    }
}
