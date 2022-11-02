package gg.essential.handlers;

import com.mojang.authlib.*;
import com.mojang.authlib.properties.*;

private static class ManagedTexturesProperty extends TrustedProperty
{
    private final Overwrites overwrites;
    
    private ManagedTexturesProperty(final GameProfile originalProfile, final Overwrites overwrites) {
        super("textures", overwrites.apply(GameProfileManager.getSafeTexturesValue(originalProfile), originalProfile.getId()));
        this.overwrites = overwrites;
    }
    
    public static boolean hasOverwrites(final Property property, final Overwrites overwrites) {
        return property instanceof ManagedTexturesProperty && ((ManagedTexturesProperty)property).overwrites == overwrites;
    }
}
