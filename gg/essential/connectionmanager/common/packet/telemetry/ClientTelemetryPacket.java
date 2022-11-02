package gg.essential.connectionmanager.common.packet.telemetry;

import gg.essential.connectionmanager.common.packet.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ClientTelemetryPacket extends Packet
{
    @NotNull
    private final String key;
    @NotNull
    private final Map<String, Object> metadata;
    
    public ClientTelemetryPacket(@NotNull final String key) {
        this(key, Collections.emptyMap());
    }
    
    public ClientTelemetryPacket(@NotNull final String key, @NotNull final Map<String, Object> metadata) {
        super();
        this.key = key;
        this.metadata = metadata;
    }
}
