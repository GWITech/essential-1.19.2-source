package gg.essential.notices.model;

import gg.essential.lib.gson.annotations.*;
import gg.essential.notices.*;
import java.util.*;
import com.sparkuniverse.toolbox.util.*;
import org.jetbrains.annotations.*;

public class Notice
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final NoticeType type;
    @SerializedName("c")
    @NotNull
    private final Map<String, Object> metadata;
    @SerializedName("d")
    private final boolean dismissible;
    @SerializedName("e")
    @Nullable
    private final DateTime activeAfter;
    @SerializedName("f")
    @Nullable
    private final DateTime expiresAt;
    
    public Notice(@NotNull final String id, @NotNull final NoticeType type, @NotNull final Map<String, Object> metadata, final boolean dismissible, @Nullable final DateTime activeAfter, @Nullable final DateTime expiresAt) {
        super();
        this.id = id;
        this.type = type;
        this.metadata = metadata;
        this.dismissible = dismissible;
        this.activeAfter = activeAfter;
        this.expiresAt = expiresAt;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public NoticeType getType() {
        return this.type;
    }
    
    @NotNull
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    @Nullable
    public DateTime getExpiresAt() {
        return this.expiresAt;
    }
    
    @Override
    public String toString() {
        return "Notice{id=" + this.id + ", type=" + this.type + ", metadata=" + this.metadata + ", dismissible=" + this.dismissible + ", activeAfter=" + this.activeAfter + ", expiresAt=" + this.expiresAt + '}';
    }
}
