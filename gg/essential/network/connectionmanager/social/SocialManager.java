package gg.essential.network.connectionmanager.social;

import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.social.*;
import gg.essential.network.connectionmanager.social.handler.*;
import java.util.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.*;

public class SocialManager implements NetworkedManager
{
    @NotNull
    private final Map<UUID, String> incomingServerInvites;
    @NotNull
    private final Map<String, Set<UUID>> invitedFriends;
    @NotNull
    private final ConnectionManager connectionManager;
    
    public SocialManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.incomingServerInvites = (Map<UUID, String>)Maps.newConcurrentMap();
        this.invitedFriends = (Map<String, Set<UUID>>)Maps.newConcurrentMap();
        connectionManager.registerPacketHandler(SocialInviteToServerPacket.class, new SocialInviteToServerPacketHandler(this));
        connectionManager.registerPacketHandler(SocialInviteToServerCancelPacket.class, new SocialInviteToServerCancelPacketHandler(this));
        connectionManager.registerPacketHandler(SocialDiscordRequestJoinServerPacket.class, new SocialDiscordRequestJoinServerPacketHandler());
        this.connectionManager = connectionManager;
    }
    
    @NotNull
    public Map<UUID, String> getIncomingServerInvites() {
        return this.incomingServerInvites;
    }
    
    @NotNull
    public Optional<String> getIncomingServerInvite(@NotNull final UUID uuid) {
        return Optional.ofNullable(this.incomingServerInvites.get(uuid));
    }
    
    public void addIncomingServerInvite(@NotNull final UUID uuid, @NotNull final String address) {
        this.incomingServerInvites.put(uuid, address);
    }
    
    public void removeIncomingServerInvite(@NotNull final UUID uuid) {
        this.incomingServerInvites.remove(uuid);
    }
    
    public Set<UUID> getInvitesOnServer(final String server) {
        return this.invitedFriends.getOrDefault(server, Collections.emptySet());
    }
    
    public void setInvitedFriendsOnServer(final String server, final Set<UUID> friends) {
        final Set<UUID> previousValue = this.invitedFriends.put(server, friends);
        final Set<UUID> previousInvites = (previousValue != null) ? previousValue : Collections.emptySet();
        final Set<UUID> invitesRemoved = SetsKt.minus((Set)previousInvites, (Iterable)friends);
        invitesRemoved.forEach(uuid -> this.connectionManager.send(new SocialInviteToServerCancelPacket(uuid)));
        final Set<UUID> newInvites = SetsKt.minus((Set)friends, (Iterable)previousInvites);
        newInvites.forEach(uuid -> this.connectionManager.send(new SocialInviteToServerPacket(uuid, server)));
    }
    
    @Override
    public void resetState() {
        this.invitedFriends.clear();
        this.incomingServerInvites.clear();
    }
    
    private /* synthetic */ void lambda$setInvitedFriendsOnServer$1(final String server, final UUID uuid) {
        this.connectionManager.send(new SocialInviteToServerPacket(uuid, server));
    }
    
    private /* synthetic */ void lambda$setInvitedFriendsOnServer$0(final UUID uuid) {
        this.connectionManager.send(new SocialInviteToServerCancelPacket(uuid));
    }
}
