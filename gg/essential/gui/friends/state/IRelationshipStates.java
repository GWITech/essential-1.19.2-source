package gg.essential.gui.friends.state;

import kotlin.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import java.time.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010	\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010
                                                   \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0015\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/state/IRelationshipStates;", "", "acceptIncomingFriendRequest", "", "uuid", "Ljava/util/UUID;", "notification", "", "addFriend", "blockPlayer", "cancelOutgoingFriendRequest", "declineIncomingFriendRequest", "getObservableBlockedList", "Lgg/essential/elementa/utils/ObservableList;", "getObservableFriendList", "getObservableIncomingRequests", "getObservableOutgoingRequests", "getPendingRequestTime", "Ljava/time/Instant;", "removeFriend", "unblockPlayer", "essential" })
public interface IRelationshipStates
{
    @NotNull
    ObservableList<UUID> getObservableFriendList();
    
    @NotNull
    ObservableList<UUID> getObservableBlockedList();
    
    @NotNull
    ObservableList<UUID> getObservableIncomingRequests();
    
    @NotNull
    ObservableList<UUID> getObservableOutgoingRequests();
    
    void addFriend(@NotNull final UUID p0, final boolean p1);
    
    void removeFriend$1816e1ab(@NotNull final UUID p0);
    
    void acceptIncomingFriendRequest$1816e1ab(@NotNull final UUID p0);
    
    void declineIncomingFriendRequest$1816e1ab(@NotNull final UUID p0);
    
    void cancelOutgoingFriendRequest$1816e1ab(@NotNull final UUID p0);
    
    @Nullable
    Instant getPendingRequestTime(@NotNull final UUID p0);
    
    void blockPlayer$1816e1ab(@NotNull final UUID p0);
    
    void unblockPlayer$1816e1ab(@NotNull final UUID p0);
}
