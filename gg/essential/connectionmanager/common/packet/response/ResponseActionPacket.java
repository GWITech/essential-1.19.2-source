package gg.essential.connectionmanager.common.packet.response;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;

public class ResponseActionPacket extends Packet
{
    @SerializedName("a")
    private final boolean successful;
    
    public ResponseActionPacket(final boolean successful) {
        super();
        this.successful = successful;
    }
    
    public boolean isSuccessful() {
        return this.successful;
    }
    
    @Override
    public String toString() {
        return "ResponseActionPacket{successful=" + this.successful + '}';
    }
}
