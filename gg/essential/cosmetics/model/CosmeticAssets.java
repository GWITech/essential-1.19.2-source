package gg.essential.cosmetics.model;

import gg.essential.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class CosmeticAssets
{
    @SerializedName("a")
    @NotNull
    private final EssentialAsset thumbnail;
    @SerializedName("b")
    @NotNull
    private final EssentialAsset texture;
    @SerializedName("c")
    @NotNull
    private final CosmeticGeometry geometry;
    @SerializedName("d")
    @Nullable
    private final EssentialAsset animations;
    @SerializedName("e")
    @Nullable
    private final CosmeticSkinMask skinMask;
    @SerializedName("f")
    @Nullable
    private final EssentialAsset settings;
    
    public CosmeticAssets(@NotNull final EssentialAsset thumbnail, @NotNull final EssentialAsset texture, @NotNull final CosmeticGeometry geometry, @Nullable final EssentialAsset animations, @Nullable final CosmeticSkinMask skinMask, @Nullable final EssentialAsset settings) {
        super();
        this.thumbnail = thumbnail;
        this.texture = texture;
        this.geometry = geometry;
        this.animations = animations;
        this.skinMask = skinMask;
        this.settings = settings;
    }
    
    @NotNull
    public EssentialAsset getThumbnail() {
        return this.thumbnail;
    }
    
    @NotNull
    public EssentialAsset getTexture() {
        return this.texture;
    }
    
    @NotNull
    public CosmeticGeometry getGeometry() {
        return this.geometry;
    }
    
    @Nullable
    public EssentialAsset getAnimations() {
        return this.animations;
    }
    
    @Nullable
    public CosmeticSkinMask getSkinMask() {
        return this.skinMask;
    }
    
    @Nullable
    public EssentialAsset getSettings() {
        return this.settings;
    }
}
