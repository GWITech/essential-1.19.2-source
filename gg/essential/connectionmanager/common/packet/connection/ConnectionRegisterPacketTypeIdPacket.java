package gg.essential.connectionmanager.common.packet.connection;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ConnectionRegisterPacketTypeIdPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String className;
    @SerializedName("b")
    private final int packetId;
    
    public ConnectionRegisterPacketTypeIdPacket(@NotNull final String className, final int packetId) {
        super();
        this.className = className;
        this.packetId = packetId;
    }
    
    @NotNull
    public String getClassName() {
        return this.className;
    }
    
    public int getPacketId() {
        return this.packetId;
    }
}
