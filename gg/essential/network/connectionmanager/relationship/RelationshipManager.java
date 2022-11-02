package gg.essential.network.connectionmanager.relationship;

import gg.essential.gui.friends.state.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.model.relationships.*;
import com.google.common.collect.*;
import gg.essential.connectionmanager.common.packet.relationships.privacy.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.relationships.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.gui.notification.*;
import gg.essential.util.*;
import gg.essential.network.connectionmanager.sps.*;
import net.minecraft.client.resource.language.*;
import com.sparkuniverse.toolbox.relationships.enums.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.relationships.*;
import gg.essential.connectionmanager.common.packet.response.*;
import java.util.*;

public class RelationshipManager extends StateCallbackManager<IRelationshipManager> implements NetworkedManager
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final SimpleObservableMap<UUID, Relationship> friends;
    @NotNull
    private final SimpleObservableMap<UUID, Relationship> outgoingFriendRequests;
    @NotNull
    private final SimpleObservableMap<UUID, Relationship> incomingFriendRequests;
    @NotNull
    private final SimpleObservableMap<UUID, Relationship> blockedByMe;
    @NotNull
    private final SimpleObservableMap<UUID, Relationship> blockedMe;
    
    public RelationshipManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.friends = new SimpleObservableMap<UUID, Relationship>((Map<UUID, Relationship>)Maps.newConcurrentMap());
        this.outgoingFriendRequests = new SimpleObservableMap<UUID, Relationship>((Map<UUID, Relationship>)Maps.newConcurrentMap());
        this.incomingFriendRequests = new SimpleObservableMap<UUID, Relationship>((Map<UUID, Relationship>)Maps.newConcurrentMap());
        this.blockedByMe = new SimpleObservableMap<UUID, Relationship>((Map<UUID, Relationship>)Maps.newConcurrentMap());
        this.blockedMe = new SimpleObservableMap<UUID, Relationship>((Map<UUID, Relationship>)Maps.newConcurrentMap());
        final FriendRequestPrivacySetting any_ONE = FriendRequestPrivacySetting.ANY_ONE;
        (this.connectionManager = connectionManager).registerPacketHandler(FriendRequestPrivacySettingPacket.class, new FriendRequestPrivacySettingPacketHandler());
        connectionManager.registerPacketHandler(ServerRelationshipDeletePacket.class, new ServerRelationshipDeletePacketHandler());
        connectionManager.registerPacketHandler(ServerRelationshipPopulatePacket.class, new ServerRelationshipPopulatePacketHandler());
        this.friends.addObserver((o, arg) -> {
            this.getCallbacks().iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final IRelationshipManager callback = iterator.next();
                if (arg instanceof ObservableMapEvent.Clear) {
                    callback.clearFriends();
                }
                else if (arg instanceof ObservableMapEvent.Add) {
                    callback.friendAdded((UUID)((ObservableMapEvent.Add)arg).getElement().component1());
                }
                else if (arg instanceof ObservableMapEvent.Remove) {
                    callback.friendRemoved((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
                }
                else {
                    continue;
                }
            }
            return;
        });
        this.blockedByMe.addObserver((o, arg) -> {
            this.getCallbacks().iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final IRelationshipManager callback2 = iterator2.next();
                if (arg instanceof ObservableMapEvent.Clear) {
                    callback2.clearBlocked();
                }
                else if (arg instanceof ObservableMapEvent.Add) {
                    callback2.playerBlocked((UUID)((ObservableMapEvent.Add)arg).getElement().component1());
                }
                else if (arg instanceof ObservableMapEvent.Remove) {
                    callback2.playerUnblocked((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
                }
                else {
                    continue;
                }
            }
            return;
        });
        this.incomingFriendRequests.addObserver((o, arg) -> {
            this.getCallbacks().iterator();
            final Iterator iterator3;
            while (iterator3.hasNext()) {
                final IRelationshipManager callback3 = iterator3.next();
                if (arg instanceof ObservableMapEvent.Clear) {
                    callback3.clearAllIncomingRequests();
                }
                else if (arg instanceof ObservableMapEvent.Add) {
                    callback3.newIncomingFriendRequest((UUID)((ObservableMapEvent.Add)arg).getElement().component1());
                }
                else if (arg instanceof ObservableMapEvent.Remove) {
                    callback3.clearIncomingFriendRequest((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
                }
                else {
                    continue;
                }
            }
            return;
        });
        this.outgoingFriendRequests.addObserver((o, arg) -> {
            this.getCallbacks().iterator();
            final Iterator iterator4;
            while (iterator4.hasNext()) {
                final IRelationshipManager callback4 = iterator4.next();
                if (arg instanceof ObservableMapEvent.Clear) {
                    callback4.clearAllOutgoingRequests();
                }
                else if (arg instanceof ObservableMapEvent.Add) {
                    callback4.newOutgoingFriendRequest((UUID)((ObservableMapEvent.Add)arg).getElement().component1());
                }
                else if (arg instanceof ObservableMapEvent.Remove) {
                    callback4.clearOutgoingFriendRequest((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
                }
                else {
                    continue;
                }
            }
        });
    }
    
    @NotNull
    public Map<UUID, Relationship> getFriends() {
        return this.friends;
    }
    
    @NotNull
    public Map<UUID, Relationship> getOutgoingFriendRequests() {
        return this.outgoingFriendRequests;
    }
    
    @NotNull
    public Map<UUID, Relationship> getIncomingFriendRequests() {
        return this.incomingFriendRequests;
    }
    
    @NotNull
    public Map<UUID, Relationship> getBlockedByMe() {
        return this.blockedByMe;
    }
    
    @Nullable
    public Relationship getOutgoingFriendRequest(@NotNull final UUID uuid) {
        return this.outgoingFriendRequests.get(uuid);
    }
    
    @Nullable
    public Relationship getIncomingFriendRequest(@NotNull final UUID uuid) {
        return this.incomingFriendRequests.get(uuid);
    }
    
    public boolean isFriend(@NotNull final UUID uuid) {
        return this.friends.containsKey(uuid);
    }
    
    public boolean hasOutgoingFriendRequest(@NotNull final UUID uuid) {
        return this.outgoingFriendRequests.containsKey(uuid);
    }
    
    public boolean isBlockedByMe(@NotNull final UUID uuid) {
        return this.blockedByMe.containsKey(uuid);
    }
    
    public boolean hasBlockedMe(@NotNull final UUID uuid) {
        return this.blockedMe.containsKey(uuid);
    }
    
    public CompletableFuture<RelationshipResponse> createFriendRelationship(@NotNull final UUID targetUUID, final boolean acceptingRequest) {
        if (targetUUID.equals(UUIDUtil.getClientUUID())) {
            Notifications.INSTANCE.push("Unable to send request", "You cannot add yourself as a friend.");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        if (this.isFriend(targetUUID)) {
            Notifications.INSTANCE.push("Unable to send request", "This player is already your friend.");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        if (!acceptingRequest && this.hasOutgoingFriendRequest(targetUUID)) {
            Notifications.INSTANCE.push("Unable to send request", "There is already a pending friend request to this player.");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        if (this.isBlockedByMe(targetUUID)) {
            Notifications.INSTANCE.push("Unable to send request", "This player is blocked. Unblock them before adding as a friend.");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        if (this.hasBlockedMe(targetUUID)) {
            Notifications.INSTANCE.push("Unable to send request", "This player has blocked you.");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        return this.createRelationship(targetUUID, RelationshipType.FRIENDS);
    }
    
    public CompletableFuture<RelationshipResponse> createBlockedRelationship(@NotNull final UUID uuid) {
        if (uuid.equals(UUIDUtil.getClientUUID())) {
            Notifications.INSTANCE.push("Unable to block", "You cannot block yourself");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        if (this.isBlockedByMe(uuid)) {
            Notifications.INSTANCE.push("Unable to block", "You already have this player blocked");
            return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
        }
        return this.createRelationship(uuid, RelationshipType.BLOCKED);
    }
    
    public void createRelationship(@NotNull final Relationship relationship) {
        final UUID ourUUID = this.connectionManager.getMinecraftHook().getPlayerUUID();
        final boolean areWeTheSender = relationship.getSenderUUID().equals(ourUUID);
        final UUID targetUUID = areWeTheSender ? relationship.getTargetUUID() : relationship.getSenderUUID();
        switch (RelationshipManager.RelationshipManager$1.$SwitchMap$com$sparkuniverse$toolbox$relationships$enums$RelationshipType[relationship.getType().ordinal()]) {
            case 1: {
                this.friends.remove(targetUUID);
                this.outgoingFriendRequests.remove(targetUUID);
                this.incomingFriendRequests.remove(targetUUID);
                this.blockedMe.remove(targetUUID);
                this.blockedByMe.remove(targetUUID);
                break;
            }
            case 2: {
                switch (RelationshipManager.RelationshipManager$1.$SwitchMap$com$sparkuniverse$toolbox$relationships$enums$RelationshipState[relationship.getState().ordinal()]) {
                    case 1: {
                        this.friends.remove(targetUUID);
                        this.blockedMe.remove(targetUUID);
                        this.blockedByMe.remove(targetUUID);
                        if (areWeTheSender) {
                            this.outgoingFriendRequests.put(targetUUID, relationship);
                            break;
                        }
                        this.incomingFriendRequests.put(targetUUID, relationship);
                        break;
                    }
                    case 2: {
                        this.outgoingFriendRequests.remove(targetUUID);
                        this.incomingFriendRequests.remove(targetUUID);
                        this.blockedMe.remove(targetUUID);
                        this.blockedByMe.remove(targetUUID);
                        this.friends.put(targetUUID, relationship);
                        break;
                    }
                    case 3: {
                        this.friends.remove(targetUUID);
                        this.outgoingFriendRequests.remove(targetUUID);
                        this.incomingFriendRequests.remove(targetUUID);
                        this.blockedMe.remove(targetUUID);
                        this.blockedByMe.remove(targetUUID);
                        break;
                    }
                }
                break;
            }
            case 3: {
                this.friends.remove(targetUUID);
                this.outgoingFriendRequests.remove(targetUUID);
                this.incomingFriendRequests.remove(targetUUID);
                if (areWeTheSender) {
                    this.blockedByMe.put(targetUUID, relationship);
                    break;
                }
                this.blockedMe.put(targetUUID, relationship);
                break;
            }
        }
        final SPSManager spsManager = this.connectionManager.getSpsManager();
        Objects.requireNonNull(spsManager);
        Multithreading.runAsync(spsManager::refreshWhitelist);
    }
    
    public CompletableFuture<RelationshipResponse> createRelationship(@NotNull final UUID targetUUID, @NotNull final RelationshipType type) {
        final CompletableFuture<RelationshipResponse> future = new CompletableFuture<RelationshipResponse>();
        this.connectionManager.send(new ClientRelationshipCreatePacket(targetUUID, type), responseOptional -> {
            if (!responseOptional.isPresent()) {
                Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
            }
            future.complete(responseOptional.map(packet -> {
                if (packet instanceof final ServerRelationshipCreateFailedResponsePacket serverRelationshipCreateFailedResponsePacket) {
                    return (RelationshipResponse)(RelationshipResponse)new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, I18n.translate("connectionmanager.friends." + serverRelationshipCreateFailedResponsePacket.getReason(), new Object[0]));
                }
                else if (!(packet instanceof ServerRelationshipPopulatePacket)) {
                    return (RelationshipResponse)(RelationshipResponse)new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred");
                }
                else {
                    new RelationshipResponse((((ServerRelationshipPopulatePacket)packet).getRelationships()[0].getState() != RelationshipState.DECLINED) ? FriendRequestState.SENT : FriendRequestState.ERROR_UNHANDLED);
                    final RelationshipResponse relationshipResponse;
                    return (RelationshipResponse)(RelationshipResponse)relationshipResponse;
                }
            }).orElse(new RelationshipResponse(FriendRequestState.ERROR_HANDLED, "An unknown error occurred")));
            return;
        });
        return future;
    }
    
    public void removeRelationship(@NotNull final Relationship relationship) {
        final UUID ourUUID = this.connectionManager.getMinecraftHook().getPlayerUUID();
        final boolean areWeTheSender = relationship.getSenderUUID().equals(ourUUID);
        final UUID targetUUID = areWeTheSender ? relationship.getTargetUUID() : relationship.getSenderUUID();
        switch (RelationshipManager.RelationshipManager$1.$SwitchMap$com$sparkuniverse$toolbox$relationships$enums$RelationshipType[relationship.getType().ordinal()]) {
            case 2: {
                if (!relationship.isPending()) {
                    this.friends.remove(targetUUID);
                    break;
                }
                if (areWeTheSender) {
                    this.outgoingFriendRequests.remove(targetUUID);
                    break;
                }
                this.incomingFriendRequests.remove(targetUUID);
                break;
            }
            case 3: {
                if (areWeTheSender) {
                    this.blockedByMe.remove(targetUUID);
                    break;
                }
                this.blockedMe.remove(targetUUID);
                break;
            }
        }
        final SPSManager spsManager = this.connectionManager.getSpsManager();
        Objects.requireNonNull(spsManager);
        Multithreading.runAsync(spsManager::refreshWhitelist);
    }
    
    public CompletableFuture<RelationshipResponse> deleteRelationship(@NotNull final UUID targetUUID, @NotNull final RelationshipType type) {
        final CompletableFuture<RelationshipResponse> future = new CompletableFuture<RelationshipResponse>();
        this.connectionManager.send(new RelationshipDeletePacket(targetUUID, type), responseOptional -> {
            if (!responseOptional.isPresent()) {
                Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
                future.complete(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
                return;
            }
            else {
                final Packet responsePacket = responseOptional.get();
                if (!(responsePacket instanceof ResponseActionPacket)) {
                    if (responsePacket instanceof final ServerRelationshipCreateFailedResponsePacket serverRelationshipCreateFailedResponsePacket) {
                        Notifications.INSTANCE.push("Error", I18n.translate("connectionmanager.friends." + serverRelationshipCreateFailedResponsePacket.getReason(), new Object[0]));
                        future.complete(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
                    }
                    else {
                        future.complete(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred. Please contact support if issues persist."));
                    }
                    return;
                }
                else {
                    final ResponseActionPacket response = (ResponseActionPacket)responsePacket;
                    if (!response.isSuccessful()) {
                        future.complete(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred. Please contact support if issues persist."));
                        return;
                    }
                    else {
                        this.outgoingFriendRequests.remove(targetUUID);
                        this.incomingFriendRequests.remove(targetUUID);
                        this.friends.remove(targetUUID);
                        this.blockedByMe.remove(targetUUID);
                        this.blockedMe.remove(targetUUID);
                        future.complete(new RelationshipResponse(FriendRequestState.SENT));
                        this.connectionManager.getSpsManager();
                        final Object obj;
                        Objects.requireNonNull(obj);
                        Multithreading.runAsync(obj::refreshWhitelist);
                        return;
                    }
                }
            }
        });
        return future;
    }
    
    public CompletableFuture<RelationshipResponse> unblock(@NotNull final UUID user) {
        final Relationship block = this.blockedByMe.get(user);
        if (block != null) {
            return this.deleteRelationship(user, RelationshipType.BLOCKED);
        }
        return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "This player is not blocked"));
    }
    
    public CompletableFuture<RelationshipResponse> removeFriend(@NotNull final UUID otherUser) {
        final Relationship friendRelationship = this.friends.get(otherUser);
        if (friendRelationship != null) {
            return this.deleteRelationship(otherUser, friendRelationship.getType());
        }
        return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "You are not friends with this player"));
    }
    
    public CompletableFuture<RelationshipResponse> acceptFriend(@NotNull final UUID user) {
        return this.createFriendRelationship(user, true);
    }
    
    public CompletableFuture<RelationshipResponse> denyFriend(@NotNull final UUID user) {
        final Relationship request = this.incomingFriendRequests.get(user);
        if (request != null) {
            this.removeRelationship(request);
            return this.deleteRelationship(user, RelationshipType.FRIENDS);
        }
        return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "You do not have a friend request from this player"));
    }
    
    public CompletableFuture<RelationshipResponse> cancelFriendRequest(@NotNull final UUID user) {
        final Relationship request = this.outgoingFriendRequests.get(user);
        if (request != null) {
            this.removeRelationship(request);
            return this.deleteRelationship(user, RelationshipType.FRIENDS);
        }
        return CompletableFuture.completedFuture(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "You do not have a friend request to this player"));
    }
    
    public CompletableFuture<RelationshipResponse> addFriend(@NotNull final UUID uuid) {
        return this.createFriendRelationship(uuid, false);
    }
    
    @Override
    public void onConnected() {
        final FriendRequestPrivacySetting any_ONE = FriendRequestPrivacySetting.ANY_ONE;
        this.resetState();
    }
    
    @Override
    public void resetState() {
        this.blockedMe.clear();
        this.blockedByMe.clear();
        this.incomingFriendRequests.clear();
        this.outgoingFriendRequests.clear();
        this.friends.clear();
    }
    
    private /* synthetic */ void lambda$deleteRelationship$6(final CompletableFuture future, final UUID targetUUID, final Optional responseOptional) {
        if (!responseOptional.isPresent()) {
            Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
            future.complete(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
            return;
        }
        final Packet responsePacket = responseOptional.get();
        if (!(responsePacket instanceof ResponseActionPacket)) {
            if (responsePacket instanceof final ServerRelationshipCreateFailedResponsePacket serverRelationshipCreateFailedResponsePacket) {
                Notifications.INSTANCE.push("Error", I18n.translate("connectionmanager.friends." + serverRelationshipCreateFailedResponsePacket.getReason(), new Object[0]));
                future.complete(new RelationshipResponse(FriendRequestState.ERROR_HANDLED));
            }
            else {
                future.complete(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred. Please contact support if issues persist."));
            }
            return;
        }
        final ResponseActionPacket response = (ResponseActionPacket)responsePacket;
        if (!response.isSuccessful()) {
            future.complete(new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred. Please contact support if issues persist."));
            return;
        }
        this.outgoingFriendRequests.remove(targetUUID);
        this.incomingFriendRequests.remove(targetUUID);
        this.friends.remove(targetUUID);
        this.blockedByMe.remove(targetUUID);
        this.blockedMe.remove(targetUUID);
        future.complete(new RelationshipResponse(FriendRequestState.SENT));
        final SPSManager spsManager = this.connectionManager.getSpsManager();
        Objects.requireNonNull(spsManager);
        Multithreading.runAsync(spsManager::refreshWhitelist);
    }
    
    private static /* synthetic */ void lambda$createRelationship$5(final CompletableFuture future, final Optional responseOptional) {
        if (!responseOptional.isPresent()) {
            Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
        }
        future.complete(responseOptional.map(packet -> {
            if (packet instanceof final ServerRelationshipCreateFailedResponsePacket serverRelationshipCreateFailedResponsePacket) {
                return new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, I18n.translate("connectionmanager.friends." + serverRelationshipCreateFailedResponsePacket.getReason(), new Object[0]));
            }
            else if (!(packet instanceof ServerRelationshipPopulatePacket)) {
                return new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred");
            }
            else {
                new RelationshipResponse((((ServerRelationshipPopulatePacket)packet).getRelationships()[0].getState() != RelationshipState.DECLINED) ? FriendRequestState.SENT : FriendRequestState.ERROR_UNHANDLED);
                return;
            }
        }).orElse(new RelationshipResponse(FriendRequestState.ERROR_HANDLED, "An unknown error occurred")));
    }
    
    private static /* synthetic */ RelationshipResponse lambda$createRelationship$4(final Packet packet) {
        if (packet instanceof final ServerRelationshipCreateFailedResponsePacket serverRelationshipCreateFailedResponsePacket) {
            return new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, I18n.translate("connectionmanager.friends." + serverRelationshipCreateFailedResponsePacket.getReason(), new Object[0]));
        }
        if (!(packet instanceof ServerRelationshipPopulatePacket)) {
            return new RelationshipResponse(FriendRequestState.ERROR_UNHANDLED, "An unknown error occurred");
        }
        return new RelationshipResponse((((ServerRelationshipPopulatePacket)packet).getRelationships()[0].getState() != RelationshipState.DECLINED) ? FriendRequestState.SENT : FriendRequestState.ERROR_UNHANDLED);
    }
    
    private /* synthetic */ void lambda$new$3(final Observable o, final Object arg) {
        for (final IRelationshipManager callback : this.getCallbacks()) {
            if (arg instanceof ObservableMapEvent.Clear) {
                callback.clearAllOutgoingRequests();
            }
            else if (arg instanceof final ObservableMapEvent.Add add) {
                callback.newOutgoingFriendRequest((UUID)add.getElement().component1());
            }
            else {
                if (!(arg instanceof ObservableMapEvent.Remove)) {
                    continue;
                }
                callback.clearOutgoingFriendRequest((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
            }
        }
    }
    
    private /* synthetic */ void lambda$new$2(final Observable o, final Object arg) {
        for (final IRelationshipManager callback : this.getCallbacks()) {
            if (arg instanceof ObservableMapEvent.Clear) {
                callback.clearAllIncomingRequests();
            }
            else if (arg instanceof final ObservableMapEvent.Add add) {
                callback.newIncomingFriendRequest((UUID)add.getElement().component1());
            }
            else {
                if (!(arg instanceof ObservableMapEvent.Remove)) {
                    continue;
                }
                callback.clearIncomingFriendRequest((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
            }
        }
    }
    
    private /* synthetic */ void lambda$new$1(final Observable o, final Object arg) {
        for (final IRelationshipManager callback : this.getCallbacks()) {
            if (arg instanceof ObservableMapEvent.Clear) {
                callback.clearBlocked();
            }
            else if (arg instanceof final ObservableMapEvent.Add add) {
                callback.playerBlocked((UUID)add.getElement().component1());
            }
            else {
                if (!(arg instanceof ObservableMapEvent.Remove)) {
                    continue;
                }
                callback.playerUnblocked((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
            }
        }
    }
    
    private /* synthetic */ void lambda$new$0(final Observable o, final Object arg) {
        for (final IRelationshipManager callback : this.getCallbacks()) {
            if (arg instanceof ObservableMapEvent.Clear) {
                callback.clearFriends();
            }
            else if (arg instanceof final ObservableMapEvent.Add add) {
                callback.friendAdded((UUID)add.getElement().component1());
            }
            else {
                if (!(arg instanceof ObservableMapEvent.Remove)) {
                    continue;
                }
                callback.friendRemoved((UUID)((ObservableMapEvent.Remove)arg).getElement().component1());
            }
        }
    }
}
