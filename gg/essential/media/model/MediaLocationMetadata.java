package gg.essential.media.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class MediaLocationMetadata
{
    @SerializedName("a")
    @NotNull
    private final MediaLocationType type;
    @SerializedName("b")
    @Nullable
    private final String identifier;
    @SerializedName("c")
    @Nullable
    private final UUID spsHost;
    
    public MediaLocationMetadata(@NotNull final MediaLocationType type, @Nullable final String identifier, @Nullable final UUID spsHost) {
        super();
        this.type = type;
        this.identifier = identifier;
        this.spsHost = spsHost;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "MediaLocationMetadata{type=" + this.type + ", identifier='" + this.identifier + '\'' + ", spsHost=" + this.spsHost + '}';
    }
}
