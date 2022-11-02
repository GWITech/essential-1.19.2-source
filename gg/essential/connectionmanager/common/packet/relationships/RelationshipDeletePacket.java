package gg.essential.connectionmanager.common.packet.relationships;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.relationships.enums.*;

public class RelationshipDeletePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @NotNull
    private final RelationshipType type;
    
    public RelationshipDeletePacket(@NotNull final UUID uuid, @NotNull final RelationshipType type) {
        super();
        this.uuid = uuid;
        this.type = type;
    }
}
