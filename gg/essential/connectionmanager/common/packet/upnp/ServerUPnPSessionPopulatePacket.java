package gg.essential.connectionmanager.common.packet.upnp;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.upnp.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ServerUPnPSessionPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<UPnPSession> sessions;
    
    public ServerUPnPSessionPopulatePacket(@NotNull final UPnPSession session) {
        this(Collections.singletonList(session));
    }
    
    public ServerUPnPSessionPopulatePacket(@NotNull final List<UPnPSession> sessions) {
        super();
        this.sessions = sessions;
    }
    
    @NotNull
    public List<UPnPSession> getSessions() {
        return this.sessions;
    }
}
