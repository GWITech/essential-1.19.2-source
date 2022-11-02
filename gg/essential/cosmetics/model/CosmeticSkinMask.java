package gg.essential.cosmetics.model;

import gg.essential.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class CosmeticSkinMask
{
    @SerializedName("steve")
    @Nullable
    private final EssentialAsset steve;
    @SerializedName("alex")
    @Nullable
    private final EssentialAsset alex;
    
    public CosmeticSkinMask(@Nullable final EssentialAsset steve, @Nullable final EssentialAsset alex) {
        super();
        this.steve = steve;
        this.alex = alex;
    }
    
    @Nullable
    public EssentialAsset getSteve() {
        return this.steve;
    }
    
    @Nullable
    public EssentialAsset getAlex() {
        return this.alex;
    }
}
