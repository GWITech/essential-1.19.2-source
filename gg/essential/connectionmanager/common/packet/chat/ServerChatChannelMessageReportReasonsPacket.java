package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerChatChannelMessageReportReasonsPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Map<String, Map<String, String>> reasons;
    
    public ServerChatChannelMessageReportReasonsPacket(@NotNull final Map<String, Map<String, String>> reasons) {
        super();
        this.reasons = reasons;
    }
    
    @NotNull
    public Map<String, Map<String, String>> getReasons() {
        return this.reasons;
    }
}
