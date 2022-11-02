package gg.essential.network.connectionmanager.subscription;

import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.util.*;
import gg.essential.connectionmanager.common.packet.subscription.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.*;

public class SubscriptionManager implements NetworkedManager
{
    @NotNull
    private final PacketQueue packetQueue;
    private final List<Listener> listeners;
    private final Set<UUID> subscriptions;
    
    public SubscriptionManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.listeners = new ArrayList<Listener>();
        this.subscriptions = Sets.newConcurrentHashSet();
        this.packetQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutRetransmit().create();
    }
    
    public boolean isSubscribedOrSelf(@NotNull final UUID uuid) {
        return this.isSubscribed(uuid) || uuid.equals(UUIDUtil.getClientUUID());
    }
    
    public boolean isSubscribed(@NotNull final UUID uuid) {
        return this.subscriptions.contains(uuid);
    }
    
    public void subscribeToFeeds(@NotNull final Set<UUID> uuids) {
        uuids.remove(UUIDUtil.getClientUUID());
        this.subscriptions.addAll(uuids);
        this.packetQueue.enqueue(new SubscriptionUpdatePacket(uuids.toArray(new UUID[0]), true), response -> {
            this.listeners.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Listener listener = iterator.next();
                listener.onSubscriptionAdded(uuids);
            }
        });
    }
    
    public void unSubscribeFromFeeds(@NotNull final Set<UUID> uuids) {
        uuids.remove(UUIDUtil.getClientUUID());
        this.subscriptions.removeAll(uuids);
        this.packetQueue.enqueue(new SubscriptionUpdatePacket(uuids.toArray(new UUID[0]), false), response -> {
            this.listeners.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Listener listener = iterator.next();
                listener.onSubscriptionRemoved(uuids);
            }
        });
    }
    
    @Override
    public void onConnected() {
        this.packetQueue.reset();
        final Set<UUID> uuids = new HashSet<UUID>(this.subscriptions);
        this.resetState();
        this.subscribeToFeeds(uuids);
    }
    
    @Override
    public void resetState() {
        final Set<UUID> uuids = new HashSet<UUID>(this.subscriptions);
        this.subscriptions.clear();
        for (final Listener listener : this.listeners) {
            listener.onSubscriptionRemoved(uuids);
        }
    }
    
    public void addListener(@NotNull final Listener listener) {
        this.listeners.add(listener);
    }
    
    private /* synthetic */ void lambda$unSubscribeFromFeeds$1(final Set uuids, final Optional response) {
        for (final Listener listener : this.listeners) {
            listener.onSubscriptionRemoved(uuids);
        }
    }
    
    private /* synthetic */ void lambda$subscribeToFeeds$0(final Set uuids, final Optional response) {
        for (final Listener listener : this.listeners) {
            listener.onSubscriptionAdded(uuids);
        }
    }
    
    public interface Listener
    {
        default void onSubscriptionAdded(@NotNull final Set<UUID> uuids) {
        }
        
        default void onSubscriptionRemoved(@NotNull final Set<UUID> uuids) {
        }
    }
}
