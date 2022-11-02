package gg.essential.connectionmanager.common.packet.notices;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ClientNoticeDismissPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String id;
    
    public ClientNoticeDismissPacket(@NotNull final String id) {
        super();
        this.id = id;
    }
}
