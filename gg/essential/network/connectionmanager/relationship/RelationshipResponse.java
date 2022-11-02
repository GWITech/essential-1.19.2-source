package gg.essential.network.connectionmanager.relationship;

import org.jetbrains.annotations.*;

public class RelationshipResponse
{
    @NotNull
    private final FriendRequestState friendRequestState;
    @Nullable
    private String message;
    
    public RelationshipResponse(@NotNull final FriendRequestState friendRequestState) {
        super();
        this.friendRequestState = friendRequestState;
    }
    
    public RelationshipResponse(@NotNull final FriendRequestState friendRequestState, @Nullable final String message) {
        super();
        this.friendRequestState = friendRequestState;
        this.message = message;
    }
    
    @NotNull
    public FriendRequestState getFriendRequestState() {
        return this.friendRequestState;
    }
    
    public String getMessage() {
        return this.message;
    }
}
