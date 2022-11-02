package gg.essential.connectionmanager.common.packet.relationships;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerUuidNameMapPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Map<UUID, String> mappedUuids;
    
    public ServerUuidNameMapPacket(@NotNull final Map<UUID, String> mappedUuids) {
        super();
        this.mappedUuids = mappedUuids;
    }
    
    public Map<UUID, String> getMappedUuids() {
        return this.mappedUuids;
    }
    
    @Override
    public String toString() {
        return String.format("ServerUuidNameMapPacket{mappedUuids=%s}", this.mappedUuids);
    }
}
