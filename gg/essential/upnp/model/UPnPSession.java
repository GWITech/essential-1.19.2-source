package gg.essential.upnp.model;

import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.upnp.*;
import java.util.*;
import com.sparkuniverse.toolbox.util.*;

public class UPnPSession
{
    @SerializedName("a")
    @NotNull
    private final UUID hostUUID;
    @SerializedName("b")
    @NotNull
    private String ip;
    @SerializedName("c")
    private int port;
    @SerializedName("d")
    @NotNull
    private UPnPPrivacy privacy;
    @SerializedName("e")
    @NotNull
    private final Set<UUID> invites;
    @SerializedName("f")
    @NotNull
    private final DateTime createdAt;
    
    public UPnPSession(@NotNull final UUID hostUUID, @NotNull final String ip, final int port, @NotNull final UPnPPrivacy privacy, @NotNull final Set<UUID> invites, @NotNull final DateTime createdAt) {
        super();
        this.hostUUID = hostUUID;
        this.ip = ip;
        this.port = port;
        this.privacy = privacy;
        this.invites = invites;
        this.createdAt = createdAt;
    }
    
    @NotNull
    public UUID getHostUUID() {
        return this.hostUUID;
    }
    
    @NotNull
    public String getIp() {
        return this.ip;
    }
    
    public int getPort() {
        return this.port;
    }
    
    @NotNull
    public UPnPPrivacy getPrivacy() {
        return this.privacy;
    }
    
    @NotNull
    public Set<UUID> getInvites() {
        return this.invites;
    }
    
    @NotNull
    public DateTime getCreatedAt() {
        return this.createdAt;
    }
}
