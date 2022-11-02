package gg.essential.connectionmanager.common.packet.ice;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class IceSessionPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID user;
    @SerializedName("b")
    @NotNull
    private final String ufrag;
    @SerializedName("c")
    @NotNull
    private final String password;
    
    public IceSessionPacket(@NotNull final UUID user, @NotNull final String ufrag, @NotNull final String password) {
        super();
        this.user = user;
        this.ufrag = ufrag;
        this.password = password;
    }
    
    @NotNull
    public UUID getUser() {
        return this.user;
    }
    
    @NotNull
    public String getUfrag() {
        return this.ufrag;
    }
    
    @NotNull
    public String getPassword() {
        return this.password;
    }
}
