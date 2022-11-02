package gg.essential.cosmetics.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.*;
import com.sparkuniverse.toolbox.util.*;
import java.util.*;

public class CosmeticOutfit
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final String name;
    @SerializedName("c")
    @Nullable
    private String skinTexture;
    @SerializedName("d")
    @Nullable
    private Map<CosmeticSlot, String> equippedCosmetics;
    @SerializedName("e")
    @Nullable
    private Map<String, List<CosmeticSetting>> cosmeticSettings;
    @SerializedName("f")
    private boolean selected;
    @SerializedName("g")
    @NotNull
    private final DateTime createdAt;
    
    public CosmeticOutfit(@NotNull final String id, @NotNull final String name, @Nullable final String skinTexture, @Nullable final Map<CosmeticSlot, String> equippedCosmetics, @Nullable final Map<String, List<CosmeticSetting>> cosmeticSettings, final boolean selected, @NotNull final DateTime createdAt) {
        super();
        this.id = id;
        this.name = name;
        this.skinTexture = skinTexture;
        this.equippedCosmetics = equippedCosmetics;
        this.cosmeticSettings = cosmeticSettings;
        this.selected = selected;
        this.createdAt = createdAt;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @Nullable
    public String getSkinTexture() {
        return this.skinTexture;
    }
    
    @NotNull
    public Map<CosmeticSlot, String> getEquippedCosmetics() {
        if (this.equippedCosmetics == null) {
            this.equippedCosmetics = new HashMap<CosmeticSlot, String>();
        }
        return this.equippedCosmetics;
    }
    
    @NotNull
    public Map<String, List<CosmeticSetting>> getCosmeticSettings() {
        if (this.cosmeticSettings == null) {
            this.cosmeticSettings = new HashMap<String, List<CosmeticSetting>>();
        }
        return this.cosmeticSettings;
    }
    
    @NotNull
    public DateTime getCreatedAt() {
        return this.createdAt;
    }
    
    public boolean isSelected() {
        return this.selected;
    }
}
