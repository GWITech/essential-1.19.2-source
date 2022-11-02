package gg.essential.connectionmanager.common.packet.cosmetic.capes;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientCosmeticCapesUnlockedPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Map<String, String> capes;
    
    public ClientCosmeticCapesUnlockedPacket(@NotNull final Map<String, String> capes) {
        super();
        this.capes = capes;
    }
}
