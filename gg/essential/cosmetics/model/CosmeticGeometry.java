package gg.essential.cosmetics.model;

import gg.essential.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class CosmeticGeometry
{
    @SerializedName("a")
    @NotNull
    private final EssentialAsset steve;
    @SerializedName("b")
    @Nullable
    private final EssentialAsset alex;
    
    public CosmeticGeometry(@NotNull final EssentialAsset steve, @Nullable final EssentialAsset alex) {
        super();
        this.steve = steve;
        this.alex = alex;
    }
    
    @NotNull
    public EssentialAsset getSteve() {
        return this.steve;
    }
    
    @Nullable
    public EssentialAsset getAlex() {
        return this.alex;
    }
}
