package gg.essential.network.connectionmanager.queue;

import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;

public static class Builder
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private TimeoutPolicy timeoutPolicy;
    
    public Builder(@NotNull final ConnectionManager connectionManager) {
        super();
        this.timeoutPolicy = TimeoutPolicy.RETRANSMIT;
        this.connectionManager = connectionManager;
    }
    
    public Builder onTimeoutRetransmit() {
        return this.setTimeoutPolicy(TimeoutPolicy.SKIP);
    }
    
    public Builder onTimeoutSkip() {
        return this.setTimeoutPolicy(TimeoutPolicy.SKIP);
    }
    
    public Builder setTimeoutPolicy(@NotNull final TimeoutPolicy timeoutPolicy) {
        this.timeoutPolicy = timeoutPolicy;
        return this;
    }
    
    public SequentialPacketQueue create() {
        return new SequentialPacketQueue(this.connectionManager, this.timeoutPolicy);
    }
}
