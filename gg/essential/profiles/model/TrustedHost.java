package gg.essential.profiles.model;

import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class TrustedHost
{
    @SerializedName(value = "a", alternate = { "id" })
    @NotNull
    private final String id;
    @SerializedName(value = "b", alternate = { "name" })
    @NotNull
    private final String name;
    @SerializedName(value = "c", alternate = { "domains" })
    @NotNull
    private final Set<String> domains;
    @SerializedName(value = "d", alternate = { "profileId" })
    @Nullable
    private final UUID profileId;
    
    public TrustedHost(@NotNull final String id, @NotNull final String name, @NotNull final Set<String> domains, @Nullable final UUID profileId) {
        super();
        this.id = id;
        this.name = name;
        this.domains = domains;
        this.profileId = profileId;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public String getName() {
        return this.name;
    }
    
    @NotNull
    public Set<String> getDomains() {
        return this.domains;
    }
    
    @Nullable
    public UUID getProfileId() {
        return this.profileId;
    }
}
