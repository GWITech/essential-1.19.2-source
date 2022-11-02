package gg.essential.event.sps;

import com.mojang.authlib.*;

public class PlayerLeaveSessionEvent
{
    private final GameProfile profile;
    
    public PlayerLeaveSessionEvent(final GameProfile profile) {
        super();
        this.profile = profile;
    }
    
    public GameProfile getProfile() {
        return this.profile;
    }
}
