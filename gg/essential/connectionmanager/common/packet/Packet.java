package gg.essential.connectionmanager.common.packet;

import java.util.*;
import org.jetbrains.annotations.*;

public abstract class Packet
{
    protected transient UUID uniqueId;
    protected transient long receivedAt;
    
    public Packet() {
        super();
    }
    
    @Nullable
    public UUID getPacketUniqueId() {
        return this.uniqueId;
    }
    
    public void setUniqueId(@Nullable final UUID uniqueId) {
        this.uniqueId = uniqueId;
    }
}
