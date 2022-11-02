package gg.essential.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class EssentialAsset
{
    @SerializedName("a")
    @NotNull
    private final String url;
    @SerializedName("b")
    @NotNull
    private final String checksum;
    
    public EssentialAsset(@NotNull final String url, @NotNull final String checksum) {
        super();
        this.url = url;
        this.checksum = checksum;
    }
    
    @NotNull
    public String getUrl() {
        return this.url;
    }
    
    @NotNull
    public String getChecksum() {
        return this.checksum;
    }
}
