package gg.essential.network.connectionmanager.queue;

import gg.essential.network.connectionmanager.*;
import kotlin.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class SequentialPacketQueue implements PacketQueue
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final TimeoutPolicy timeoutPolicy;
    @NotNull
    private final Queue<Pair<Packet, Consumer<Optional<Packet>>>> queue;
    @Nullable
    private Pair<Packet, Consumer<Optional<Packet>>> waitingFor;
    
    public SequentialPacketQueue(@NotNull final ConnectionManager connectionManager, @NotNull final TimeoutPolicy timeoutPolicy) {
        super();
        this.queue = new ArrayDeque<Pair<Packet, Consumer<Optional<Packet>>>>();
        this.connectionManager = connectionManager;
        this.timeoutPolicy = timeoutPolicy;
    }
    
    @Override
    public synchronized void enqueue(final Packet packet, final Consumer<Optional<Packet>> responseCallback) {
        this.queue.add((Pair<Packet, Consumer<Optional<Packet>>>)new Pair((Object)packet, (Object)responseCallback));
        this.process();
    }
    
    private void process() {
        if (this.waitingFor != null) {
            return;
        }
        final Pair<Packet, Consumer<Optional<Packet>>> next = this.queue.poll();
        if (next == null) {
            return;
        }
        this.waitingFor = next;
        if (this.connectionManager.isOpen() && this.connectionManager.isAuthenticated()) {
            this.connectionManager.send((Packet)next.getFirst(), resp -> this.handleResponse((Pair<Packet, Consumer<Optional<Packet>>>)next, resp));
        }
    }
    
    private synchronized void handleResponse(@NotNull final Pair<Packet, Consumer<Optional<Packet>>> request, final Optional<Packet> response) {
        if (this.waitingFor != request) {
            return;
        }
        if (response.isPresent() || this.timeoutPolicy == TimeoutPolicy.SKIP) {
            this.waitingFor = null;
            final Consumer<Optional<Packet>> responseCallback = (Consumer<Optional<Packet>>)request.getSecond();
            if (responseCallback != null) {
                responseCallback.accept(response);
            }
        }
        else if (this.connectionManager.isOpen() && this.connectionManager.isAuthenticated()) {
            this.connectionManager.send((Packet)request.getFirst(), resp -> this.handleResponse((Pair<Packet, Consumer<Optional<Packet>>>)request, resp));
        }
        this.process();
    }
    
    @Override
    public synchronized void reset() {
        this.queue.clear();
        this.waitingFor = null;
    }
    
    private /* synthetic */ void lambda$handleResponse$1(final Pair request, final Optional resp) {
        this.handleResponse((Pair<Packet, Consumer<Optional<Packet>>>)request, resp);
    }
    
    private /* synthetic */ void lambda$process$0(final Pair next, final Optional resp) {
        this.handleResponse((Pair<Packet, Consumer<Optional<Packet>>>)next, resp);
    }
    
    public enum TimeoutPolicy
    {
        RETRANSMIT, 
        SKIP;
        
        private static final /* synthetic */ TimeoutPolicy[] $VALUES;
        
        public static TimeoutPolicy[] values() {
            return TimeoutPolicy.$VALUES.clone();
        }
        
        public static TimeoutPolicy valueOf(final String name) {
            return Enum.valueOf(TimeoutPolicy.class, name);
        }
        
        private static /* synthetic */ TimeoutPolicy[] $values() {
            return new TimeoutPolicy[] { TimeoutPolicy.RETRANSMIT, TimeoutPolicy.SKIP };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
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
}
