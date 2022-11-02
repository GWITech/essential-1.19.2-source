package gg.essential.serverdiscovery.model;

import gg.essential.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerDiscoveryAssets
{
    @SerializedName("a")
    @Nullable
    private final EssentialAsset logo;
    @SerializedName("b")
    @Nullable
    private final EssentialAsset background;
    
    public ServerDiscoveryAssets(@Nullable final EssentialAsset logo, @Nullable final EssentialAsset background) {
        super();
        this.logo = logo;
        this.background = background;
    }
}
