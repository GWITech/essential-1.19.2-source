package gg.essential.event.sps;

import com.mojang.authlib.*;

public class PlayerJoinSessionEvent
{
    private final GameProfile profile;
    
    public PlayerJoinSessionEvent(final GameProfile profile) {
        super();
        this.profile = profile;
    }
    
    public GameProfile getProfile() {
        return this.profile;
    }
}
