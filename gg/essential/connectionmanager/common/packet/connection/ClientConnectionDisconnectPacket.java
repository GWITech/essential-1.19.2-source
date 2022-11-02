package gg.essential.connectionmanager.common.packet.connection;

import gg.essential.connectionmanager.common.packet.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ClientConnectionDisconnectPacket extends Packet
{
    @NotNull
    private final String message;
    
    public ClientConnectionDisconnectPacket(@NotNull final String message) {
        super();
        this.message = message;
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.message.equals(((ClientConnectionDisconnectPacket)o).message));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.message);
    }
    
    @Override
    public String toString() {
        return "ConnectionDisconnectPacket{message='" + this.message + '\'' + '}';
    }
}
