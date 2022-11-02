package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ClientCosmeticsUserEquippedVisibilityTogglePacket extends Packet
{
    @SerializedName("a")
    private final boolean state;
    
    public ClientCosmeticsUserEquippedVisibilityTogglePacket(final boolean state) {
        super();
        this.state = state;
    }
}
