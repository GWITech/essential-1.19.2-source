package gg.essential.media.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import com.sparkuniverse.toolbox.util.*;

public class Media
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @Nullable
    private final String title;
    @SerializedName("c")
    @Nullable
    private final String description;
    @SerializedName("d")
    @NotNull
    private final Map<String, MediaVariant> variants;
    @SerializedName("e")
    @NotNull
    private final MediaMetadata metadata;
    @SerializedName("f")
    @NotNull
    private final DateTime createdAt;
    
    public Media(@NotNull final String id, @Nullable final String title, @Nullable final String description, @NotNull final Map<String, MediaVariant> variants, @NotNull final MediaMetadata metadata, @NotNull final DateTime at) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.variants = variants;
        this.metadata = metadata;
        this.createdAt = at;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public Map<String, MediaVariant> getVariants() {
        return this.variants;
    }
    
    @Override
    public String toString() {
        return "Media{id='" + this.id + '\'' + ", title='" + this.title + '\'' + ", description='" + this.description + '\'' + ", variants=" + this.variants + ", metadata=" + this.metadata + ", createdAt=" + this.createdAt + '}';
    }
}
