package gg.essential.handlers;

import gg.essential.api.utils.*;
import java.util.*;
import java.nio.charset.*;
import com.mojang.authlib.*;
import gg.essential.util.*;
import com.mojang.authlib.properties.*;

public static class Overwrites
{
    private final String skinHash;
    private final String skinType;
    private final String capeHash;
    
    public Overwrites(final String skinHash, final String skinType, final String capeHash) {
        super();
        this.skinHash = skinHash;
        this.skinType = skinType;
        this.capeHash = capeHash;
    }
    
    public String apply(final String originalValue, final UUID id) {
        final JsonHolder root = new JsonHolder(new String(Base64.getDecoder().decode(originalValue)));
        if (!root.optString("profileId").isEmpty() && !id.equals(UUIDUtil.formatWithDashes(root.optString("profileId")))) {
            return originalValue;
        }
        final JsonHolder textures = root.optOrCreateJsonHolder("textures");
        if (this.skinHash != null || this.skinType != null) {
            final JsonHolder skin = textures.optOrCreateJsonHolder("SKIN");
            if (this.skinHash != null) {
                final String url = skin.optString("url");
                if (!url.endsWith(this.skinHash)) {
                    skin.put("url", String.format(Locale.ROOT, "https://textures.minecraft.net/texture/%s", this.skinHash));
                }
            }
            if (this.skinType != null) {
                if (this.skinType.equals("default")) {
                    skin.remove("metadata");
                }
                else {
                    skin.optOrCreateJsonHolder("metadata").put("model", this.skinType);
                }
            }
        }
        if (this.capeHash != null) {
            if (this.capeHash.isEmpty()) {
                textures.remove("CAPE");
            }
            else {
                final JsonHolder cape = textures.optOrCreateJsonHolder("CAPE");
                final String url = cape.optString("url");
                if (!url.endsWith(this.capeHash)) {
                    cape.put("url", String.format(Locale.ROOT, "https://textures.minecraft.net/texture/%s", this.capeHash));
                }
            }
        }
        return Base64.getEncoder().encodeToString(root.toString().getBytes(StandardCharsets.UTF_8));
    }
    
    public GameProfile apply(final GameProfile originalProfile) {
        final GameProfile updatedProfile = ExtensionsKt.copy(originalProfile);
        GameProfileManager.updatePropertyMap(updatedProfile.getProperties(), new ManagedTexturesProperty(originalProfile, this));
        return updatedProfile;
    }
}
