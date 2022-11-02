package gg.essential.connectionmanager.common.model.relationships;

import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.relationships.enums.*;
import com.sparkuniverse.toolbox.util.*;

public class Relationship
{
    @SerializedName("a")
    @NotNull
    private final UUID senderUUID;
    @SerializedName("b")
    @NotNull
    private final UUID targetUUID;
    @SerializedName("c")
    @NotNull
    private final RelationshipType type;
    @SerializedName("d")
    @NotNull
    private final RelationshipState state;
    @SerializedName("e")
    @NotNull
    private final DateTime since;
    
    public Relationship(@NotNull final UUID senderUUID, @NotNull final UUID targetUUID, @NotNull final RelationshipType type, @NotNull final RelationshipState state, @NotNull final DateTime since) {
        super();
        this.senderUUID = senderUUID;
        this.targetUUID = targetUUID;
        this.type = type;
        this.state = state;
        this.since = since;
    }
    
    @NotNull
    public UUID getSenderUUID() {
        return this.senderUUID;
    }
    
    @NotNull
    public UUID getTargetUUID() {
        return this.targetUUID;
    }
    
    @NotNull
    public RelationshipType getType() {
        return this.type;
    }
    
    @NotNull
    public RelationshipState getState() {
        return this.state;
    }
    
    @NotNull
    public DateTime getSince() {
        return this.since;
    }
    
    public boolean isPending() {
        return RelationshipState.PENDING == this.state;
    }
    
    @Override
    public String toString() {
        return "Relationship{senderUUID=" + this.senderUUID + ", targetUUID=" + this.targetUUID + ", type=" + this.type + ", state=" + this.state + ", since=" + this.since + '}';
    }
}
