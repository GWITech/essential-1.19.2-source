package gg.essential.media.model;

import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.util.*;

public class MediaMetadata
{
    @SerializedName("a")
    @NotNull
    private final UUID authorId;
    @SerializedName("b")
    @NotNull
    private final DateTime time;
    @SerializedName("d")
    @NotNull
    private final MediaLocationMetadata locationMetadata;
    @SerializedName("e")
    private boolean favorite;
    @SerializedName("f")
    private boolean edited;
    
    public MediaMetadata(@NotNull final UUID authorId, @NotNull final DateTime time, @NotNull final MediaLocationMetadata locationMetadata, final boolean favorite, final boolean edited) {
        super();
        this.authorId = authorId;
        this.time = time;
        this.locationMetadata = locationMetadata;
        this.favorite = favorite;
        this.edited = edited;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "MediaMetadata{authorId=" + this.authorId + ", time=" + this.time + ", locationMetadata=" + this.locationMetadata + ", favorite=" + this.favorite + ", edited=" + this.edited + '}';
    }
}
