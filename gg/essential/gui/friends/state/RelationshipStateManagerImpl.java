package gg.essential.gui.friends.state;

import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.jvm.functions.*;
import java.util.concurrent.*;
import gg.essential.network.connectionmanager.relationship.*;
import java.time.*;
import gg.essential.connectionmanager.common.model.relationships.*;
import org.jetbrains.annotations.*;
import gg.essential.util.*;
import kotlin.*;
import gg.essential.network.connectionmanager.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000R
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J:\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0"H\u0002J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010
                                                   \u001a\u0010\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u00062""" }, d2 = { "Lgg/essential/gui/friends/state/RelationshipStateManagerImpl;", "Lgg/essential/gui/friends/state/IRelationshipStates;", "Lgg/essential/gui/friends/state/IRelationshipManager;", "relationshipManager", "Lgg/essential/network/connectionmanager/relationship/RelationshipManager;", "(Lgg/essential/network/connectionmanager/relationship/RelationshipManager;)V", "observableBlockedList", "Lgg/essential/elementa/utils/ObservableList;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "observableFriendList", "observableIncomingList", "observableOutgoingList", "acceptIncomingFriendRequest", "", "uuid", "notification", "", "addFriend", "blockPlayer", "cancelOutgoingFriendRequest", "clearAllIncomingRequests", "clearAllOutgoingRequests", "clearBlocked", "clearFriends", "clearIncomingFriendRequest", "clearOutgoingFriendRequest", "consumeRelationshipFuture", "future", "Ljava/util/concurrent/CompletableFuture;", "Lgg/essential/network/connectionmanager/relationship/RelationshipResponse;", "errorTitle", "", "successMessage", "Lkotlin/Function1;", "declineIncomingFriendRequest", "friendAdded", "friendRemoved", "getObservableBlockedList", "getObservableFriendList", "getObservableIncomingRequests", "getObservableOutgoingRequests", "getPendingRequestTime", "Ljava/time/Instant;", "newIncomingFriendRequest", "newOutgoingFriendRequest", "playerBlocked", "playerUnblocked", "removeFriend", "unblockPlayer", "essential" })
public final class RelationshipStateManagerImpl implements IRelationshipManager, IRelationshipStates
{
    @NotNull
    private final RelationshipManager relationshipManager;
    @NotNull
    private final ObservableList<UUID> observableFriendList;
    @NotNull
    private final ObservableList<UUID> observableBlockedList;
    @NotNull
    private final ObservableList<UUID> observableIncomingList;
    @NotNull
    private final ObservableList<UUID> observableOutgoingList;
    
    public RelationshipStateManagerImpl(@NotNull final RelationshipManager relationshipManager) {
        Intrinsics.checkNotNullParameter((Object)relationshipManager, "relationshipManager");
        super();
        this.relationshipManager = relationshipManager;
        this.observableFriendList = new ObservableList<UUID>(CollectionsKt.toMutableList((Collection)this.relationshipManager.getFriends().keySet()));
        this.observableBlockedList = new ObservableList<UUID>(CollectionsKt.toMutableList((Collection)this.relationshipManager.getBlockedByMe().keySet()));
        this.observableIncomingList = new ObservableList<UUID>(CollectionsKt.toMutableList((Collection)this.relationshipManager.getIncomingFriendRequests().keySet()));
        this.observableOutgoingList = new ObservableList<UUID>(CollectionsKt.toMutableList((Collection)this.relationshipManager.getOutgoingFriendRequests().keySet()));
        ((StateCallbackManager<RelationshipStateManagerImpl>)this.relationshipManager).registerStateManager(this);
    }
    
    @NotNull
    @Override
    public ObservableList<UUID> getObservableFriendList() {
        return this.observableFriendList;
    }
    
    @NotNull
    @Override
    public ObservableList<UUID> getObservableBlockedList() {
        return this.observableBlockedList;
    }
    
    @NotNull
    @Override
    public ObservableList<UUID> getObservableIncomingRequests() {
        return this.observableIncomingList;
    }
    
    @NotNull
    @Override
    public ObservableList<UUID> getObservableOutgoingRequests() {
        return this.observableOutgoingList;
    }
    
    @Override
    public void addFriend(@NotNull final UUID uuid, final boolean notification) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture future = this.relationshipManager.addFriend(uuid);
        if (notification) {
            Intrinsics.checkNotNullExpressionValue((Object)future, "future");
            this.consumeRelationshipFuture(uuid, future, "Error adding player", (Function1<? super String, String>)RelationshipStateManagerImpl$addFriend.RelationshipStateManagerImpl$addFriend$1.INSTANCE);
        }
    }
    
    @Override
    public void removeFriend$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.relationshipManager.removeFriend(uuid);
    }
    
    @Override
    public void acceptIncomingFriendRequest$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.relationshipManager.acceptFriend(uuid);
    }
    
    @Override
    public void blockPlayer$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture future = this.relationshipManager.createBlockedRelationship(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)future, "future");
        this.consumeRelationshipFuture(uuid, future, "Error blocking player", (Function1<? super String, String>)RelationshipStateManagerImpl$blockPlayer.RelationshipStateManagerImpl$blockPlayer$1.INSTANCE);
    }
    
    @Override
    public void unblockPlayer$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture future = this.relationshipManager.unblock(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)future, "future");
        this.consumeRelationshipFuture(uuid, future, "Error unblocking player", (Function1<? super String, String>)RelationshipStateManagerImpl$unblockPlayer.RelationshipStateManagerImpl$unblockPlayer$1.INSTANCE);
    }
    
    @Override
    public void declineIncomingFriendRequest$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.relationshipManager.denyFriend(uuid);
    }
    
    @Override
    public void cancelOutgoingFriendRequest$1816e1ab(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.relationshipManager.cancelFriendRequest(uuid);
    }
    
    @Nullable
    @Override
    public Instant getPendingRequestTime(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        Relationship relationship2;
        if ((relationship2 = this.relationshipManager.getIncomingFriendRequest(uuid)) == null && (relationship2 = this.relationshipManager.getOutgoingFriendRequest(uuid)) == null) {
            return null;
        }
        final Relationship relationship = relationship2;
        return relationship.getSince().toInstant();
    }
    
    private final void consumeRelationshipFuture(final UUID uuid, final CompletableFuture<RelationshipResponse> future, final String errorTitle, final Function1<? super String, String> successMessage) {
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)future, (kotlin.jvm.functions.Function1<? super Object, Unit>)new RelationshipStateManagerImpl$consumeRelationshipFuture.RelationshipStateManagerImpl$consumeRelationshipFuture$1(uuid, errorTitle, (Function1)successMessage));
    }
    
    @Override
    public void friendAdded(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableFriendList.add(uuid);
    }
    
    @Override
    public void friendRemoved(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableFriendList.remove(uuid);
    }
    
    @Override
    public void clearFriends() {
        this.observableFriendList.clear();
    }
    
    @Override
    public void playerBlocked(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableBlockedList.add(uuid);
    }
    
    @Override
    public void playerUnblocked(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableBlockedList.remove(uuid);
    }
    
    @Override
    public void clearBlocked() {
        this.observableBlockedList.clear();
    }
    
    @Override
    public void newIncomingFriendRequest(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableIncomingList.add(uuid);
    }
    
    @Override
    public void clearIncomingFriendRequest(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableIncomingList.remove(uuid);
    }
    
    @Override
    public void clearAllIncomingRequests() {
        this.observableIncomingList.clear();
    }
    
    @Override
    public void newOutgoingFriendRequest(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableOutgoingList.add(uuid);
    }
    
    @Override
    public void clearOutgoingFriendRequest(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.observableOutgoingList.remove(uuid);
    }
    
    @Override
    public void clearAllOutgoingRequests() {
        this.observableOutgoingList.clear();
    }
}
