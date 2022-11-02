package gg.essential.gui.friends.state;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010
                                                   \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020	H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0011\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/state/IRelationshipManager;", "", "clearAllIncomingRequests", "", "clearAllOutgoingRequests", "clearBlocked", "clearFriends", "clearIncomingFriendRequest", "uuid", "Ljava/util/UUID;", "clearOutgoingFriendRequest", "friendAdded", "friendRemoved", "newIncomingFriendRequest", "newOutgoingFriendRequest", "playerBlocked", "playerUnblocked", "essential" })
public interface IRelationshipManager
{
    void friendAdded(@NotNull final UUID p0);
    
    void friendRemoved(@NotNull final UUID p0);
    
    void clearFriends();
    
    void playerBlocked(@NotNull final UUID p0);
    
    void playerUnblocked(@NotNull final UUID p0);
    
    void clearBlocked();
    
    void newIncomingFriendRequest(@NotNull final UUID p0);
    
    void clearIncomingFriendRequest(@NotNull final UUID p0);
    
    void clearAllIncomingRequests();
    
    void newOutgoingFriendRequest(@NotNull final UUID p0);
    
    void clearOutgoingFriendRequest(@NotNull final UUID p0);
    
    void clearAllOutgoingRequests();
}
