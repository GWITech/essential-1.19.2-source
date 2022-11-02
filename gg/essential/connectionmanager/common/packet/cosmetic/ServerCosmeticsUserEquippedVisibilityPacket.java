package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ServerCosmeticsUserEquippedVisibilityPacket extends Packet
{
    @SerializedName("a")
    private final boolean state;
    
    public ServerCosmeticsUserEquippedVisibilityPacket(final boolean state) {
        super();
        this.state = state;
    }
    
    public boolean getState() {
        return this.state;
    }
}
