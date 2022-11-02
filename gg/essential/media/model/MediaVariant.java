package gg.essential.media.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class MediaVariant
{
    @SerializedName("a")
    @NotNull
    private final String url;
    
    public MediaVariant(@NotNull final String url) {
        super();
        this.url = url;
    }
    
    @NotNull
    public String getUrl() {
        return this.url;
    }
}
