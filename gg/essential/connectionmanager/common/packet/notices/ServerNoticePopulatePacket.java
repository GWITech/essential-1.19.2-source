package gg.essential.connectionmanager.common.packet.notices;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.notices.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerNoticePopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<Notice> notices;
    
    public ServerNoticePopulatePacket(@NotNull final List<Notice> notices) {
        super();
        this.notices = notices;
    }
    
    @NotNull
    public List<Notice> getNotices() {
        return this.notices;
    }
}
