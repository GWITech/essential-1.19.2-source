package gg.essential.connectionmanager.common.packet.connection;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ClientConnectionLoginPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String username;
    @SerializedName("b")
    private final byte[] sharedSecret;
    
    public ClientConnectionLoginPacket(@NotNull final String username, final byte[] sharedSecret) {
        super();
        this.username = username;
        this.sharedSecret = sharedSecret;
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ClientConnectionLoginPacket that = (ClientConnectionLoginPacket)o;
        return this.username.equals(that.username) && Arrays.equals(this.sharedSecret, that.sharedSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.sharedSecret);
    }
    
    @Override
    public String toString() {
        return "LoginPacket{username='" + this.username + '\'' + ", sharedSecret=" + Arrays.toString(this.sharedSecret) + '}';
    }
}
