package gg.essential.mixins.ext.client.multiplayer;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000e
                                                   \u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010	X¦\u000e¢\u0006\f\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0005"\u0004\b\u0015\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0016\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/mixins/ext/client/multiplayer/ServerDataExt;", "", "essential$isTrusted", "", "getEssential$isTrusted", "()Z", "setEssential$isTrusted", "(Z)V", "essential$pingRegion", "", "getEssential$pingRegion", "()Ljava/lang/String;", "setEssential$pingRegion", "(Ljava/lang/String;)V", "essential$shareWithFriends", "getEssential$shareWithFriends", "()Ljava/lang/Boolean;", "setEssential$shareWithFriends", "(Ljava/lang/Boolean;)V", "essential$skipModCompatCheck", "getEssential$skipModCompatCheck", "setEssential$skipModCompatCheck", "essential" })
public interface ServerDataExt
{
    boolean getEssential$isTrusted();
    
    void setEssential$isTrusted(final boolean p0);
    
    @Nullable
    String getEssential$pingRegion();
    
    void setEssential$pingRegion(@Nullable final String p0);
    
    @Nullable
    Boolean getEssential$shareWithFriends();
    
    void setEssential$shareWithFriends(@Nullable final Boolean p0);
}
