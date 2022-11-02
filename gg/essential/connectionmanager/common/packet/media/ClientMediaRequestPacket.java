package gg.essential.connectionmanager.common.packet.media;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientMediaRequestPacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final Set<String> mediaIds;
    
    public ClientMediaRequestPacket(@Nullable final Set<String> mediaIds) {
        super();
        this.mediaIds = mediaIds;
    }
}
