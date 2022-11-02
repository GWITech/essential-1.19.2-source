package gg.essential.connectionmanager.common.packet.notices;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerNoticeRemovePacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final Set<String> ids;
    
    public ServerNoticeRemovePacket() {
        this(null);
    }
    
    public ServerNoticeRemovePacket(@Nullable final Set<String> ids) {
        super();
        this.ids = ids;
    }
    
    @Nullable
    public Set<String> getIds() {
        return this.ids;
    }
}
