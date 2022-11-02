package gg.essential.network.connectionmanager.telemetry;

import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;
import gg.essential.*;
import org.apache.commons.lang3.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import java.util.function.*;

public class TelemetryManager implements NetworkedManager
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final SequentialPacketQueue telemetryQueue;
    @NotNull
    private final List<ClientTelemetryPacket> packetList;
    
    public TelemetryManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.packetList = new ArrayList<ClientTelemetryPacket>();
        this.connectionManager = connectionManager;
        this.telemetryQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutSkip().create();
        Essential.EVENT_BUS.register(this);
        final String bytes = System.getProperty("essential.stage2.downloaded.bytes");
        final String ms = System.getProperty("essential.stage2.downloaded.millis");
        if (StringUtils.isNumeric(bytes) && StringUtils.isNumeric(ms)) {
            try {
                this.enqueue(new ClientTelemetryPacket("UPDATE_DOWNLOAD_SPEED", new HashMap<String, Object>() {
                    final /* synthetic */ String val$bytes;
                    final /* synthetic */ String val$ms;
                    
                    TelemetryManager$1() {
                        super();
                    }
                    
                    {
                        ((HashMap<String, Integer>)this).put("downloadBytes", Integer.parseInt(bytes));
                        ((HashMap<String, Integer>)this).put("downloadMs", Integer.parseInt(ms));
                    }
                }));
            }
            catch (final NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void enqueue(@NotNull final ClientTelemetryPacket packet) {
        if (this.connectionManager.isOpen() && this.connectionManager.isAuthenticated()) {
            this.telemetryQueue.enqueue(packet);
        }
        else {
            this.packetList.add(packet);
        }
    }
    
    @Override
    public void onConnected() {
        final List<ClientTelemetryPacket> packetList = this.packetList;
        final SequentialPacketQueue telemetryQueue = this.telemetryQueue;
        Objects.requireNonNull(telemetryQueue);
        packetList.forEach(telemetryQueue::enqueue);
        this.packetList.clear();
    }
}
