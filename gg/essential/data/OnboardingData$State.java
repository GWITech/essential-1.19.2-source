package gg.essential.data;

import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010
                                                   \u0002\u0010	\u001a\u0004\b\u0005\u0010\u0006"\u0004\b\u0007\u0010\bR\u001e\u0010
                                                   \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000b\u0010\f"\u0004\b\u0010\u000e¨\u0006\u000f""" }, d2 = { "Lgg/essential/data/OnboardingData$State;", "", "()V", "acceptedTos", "", "getAcceptedTos", "()Ljava/lang/Boolean;", "setAcceptedTos", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "seenFriendsOption", "getSeenFriendsOption", "()Z", "setSeenFriendsOption", "(Z)V", "essential" })
private static final class State
{
    @SerializedName("accepted_tos")
    @Nullable
    private Boolean acceptedTos;
    @SerializedName("seen_share_server_with_friends_option")
    private boolean seenFriendsOption;
    
    public State() {
        super();
    }
    
    @Nullable
    public final Boolean getAcceptedTos() {
        return this.acceptedTos;
    }
    
    public final void setAcceptedTos(@Nullable final Boolean <set-?>) {
        this.acceptedTos = <set-?>;
    }
    
    public final boolean getSeenFriendsOption() {
        return this.seenFriendsOption;
    }
    
    public final void setSeenFriendsOption$1385ff() {
        this.seenFriendsOption = true;
    }
}
