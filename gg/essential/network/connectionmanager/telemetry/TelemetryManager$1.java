package gg.essential.network.connectionmanager.telemetry;

import java.util.*;

class TelemetryManager$1 extends HashMap<String, Object> {
    final /* synthetic */ String val$bytes;
    final /* synthetic */ String val$ms;
    
    TelemetryManager$1(final String val$bytes, final String val$ms) {
        this.val$bytes = val$bytes;
        this.val$ms = val$ms;
        super();
    }
    
    {
        ((HashMap<String, Integer>)this).put("downloadBytes", Integer.parseInt(this.val$bytes));
        ((HashMap<String, Integer>)this).put("downloadMs", Integer.parseInt(this.val$ms));
    }
}