package gg.essential.serverdiscovery.model;

import gg.essential.holder.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class ServerDiscovery implements DisplayNameHolder
{
    @SerializedName("a")
    @NotNull
    private final String id;
    @SerializedName("b")
    @NotNull
    private final Map<String, String> displayNames;
    @SerializedName("c")
    @NotNull
    private final List<String> addresses;
    @SerializedName("d")
    @Nullable
    private final ServerDiscoveryAssets assets;
    @SerializedName("e")
    @NotNull
    private final List<Integer> protocolVersions;
    @SerializedName("f")
    @Nullable
    private final List<String> tags;
    
    public ServerDiscovery(@NotNull final String id, @NotNull final Map<String, String> displayNames, @NotNull final List<String> addresses, @Nullable final ServerDiscoveryAssets assets, @NotNull final List<Integer> protocolVersions, @Nullable final List<String> tags) {
        super();
        this.id = id;
        this.displayNames = displayNames;
        this.addresses = addresses;
        this.assets = assets;
        this.protocolVersions = protocolVersions;
        this.tags = tags;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    @Override
    public Map<String, String> getDisplayNames() {
        return this.displayNames;
    }
    
    @NotNull
    public List<String> getAddresses() {
        return this.addresses;
    }
    
    @NotNull
    public List<Integer> getProtocolVersions() {
        return this.protocolVersions;
    }
    
    @Nullable
    public List<String> getTags() {
        return this.tags;
    }
}
