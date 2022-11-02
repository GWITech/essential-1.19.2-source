package gg.essential.network.connectionmanager.queue;

import gg.essential.connectionmanager.common.packet.*;
import java.util.function.*;
import java.util.*;

public interface PacketQueue
{
    default void enqueue(final Packet packet) {
        this.enqueue(packet, response -> {});
    }
    
    void enqueue(final Packet p0, final Consumer<Optional<Packet>> p1);
    
    void reset();
    
    default /* synthetic */ void lambda$enqueue$0(final Optional response) {
    }
}
