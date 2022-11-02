package gg.essential.connectionmanager.common.packet.relationships;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.model.relationships.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ServerRelationshipPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Relationship[] relationships;
    
    public ServerRelationshipPopulatePacket(@NotNull final Relationship relationships) {
        this(new Relationship[] { relationships });
    }
    
    public ServerRelationshipPopulatePacket(final Relationship[] relationships) {
        super();
        this.relationships = relationships;
    }
    
    @NotNull
    public Relationship[] getRelationships() {
        return this.relationships;
    }
    
    @Override
    public String toString() {
        return "ServerRelationshipPopulatePacket{relationships=" + Arrays.toString(this.relationships) + '}';
    }
}
