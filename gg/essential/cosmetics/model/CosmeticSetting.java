package gg.essential.cosmetics.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class CosmeticSetting
{
    @SerializedName(value = "a", alternate = { "id" })
    @Nullable
    private final String id;
    @SerializedName(value = "b", alternate = { "type" })
    @NotNull
    private final String type;
    @SerializedName(value = "c", alternate = { "enabled" })
    private final boolean enabled;
    @SerializedName(value = "d", alternate = { "data" })
    @NotNull
    private final Map<String, Object> data;
    
    public CosmeticSetting(@Nullable final String id, @NotNull final String type, final boolean enabled, @NotNull final Map<String, Object> data) {
        super();
        this.id = id;
        this.type = type;
        this.enabled = enabled;
        this.data = data;
    }
    
    @Nullable
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public String getType() {
        return this.type;
    }
    
    @NotNull
    public Map<String, Object> getData() {
        return this.data;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
}
