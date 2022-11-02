package gg.essential.connectionmanager.common.packet.relationships;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.model.relationships.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerRelationshipDeletePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Relationship relationship;
    
    public ServerRelationshipDeletePacket(@NotNull final Relationship relationship) {
        super();
        this.relationship = relationship;
    }
    
    @NotNull
    public Relationship getRelationship() {
        return this.relationship;
    }
}
