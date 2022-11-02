package gg.essential.handlers;

import gg.essential.network.connectionmanager.subscription.*;
import java.util.concurrent.*;
import com.mojang.authlib.*;
import org.jetbrains.annotations.*;
import com.mojang.authlib.properties.*;
import net.minecraft.client.*;
import com.mojang.authlib.minecraft.*;
import sun.misc.*;
import com.mojang.authlib.yggdrasil.*;
import java.lang.reflect.*;
import gg.essential.api.utils.*;
import java.util.*;
import java.nio.charset.*;
import gg.essential.util.*;
import java.security.*;

public class GameProfileManager implements SubscriptionManager.Listener
{
    private final Map<UUID, Overwrites> uuidToOverwrites;
    
    public GameProfileManager() {
        super();
        this.uuidToOverwrites = new ConcurrentHashMap<UUID, Overwrites>();
    }
    
    public GameProfile handleGameProfile(final GameProfile profile) {
        final Overwrites overwrites = this.uuidToOverwrites.get(profile.getId());
        if (overwrites == null) {
            return null;
        }
        final Property property = profile.getProperties().get((Object)"textures").stream().findFirst().orElse(null);
        if (property == null || ManagedTexturesProperty.hasOverwrites(property, overwrites)) {
            return null;
        }
        return overwrites.apply(profile);
    }
    
    public void updatePlayerSkin(final UUID uuid, final String hash, final String type) {
        this.updatePlayerSkin(uuid, new Overwrites(hash, type, null));
    }
    
    private void updatePlayerSkin(final UUID uuid, final Overwrites overwrites) {
        this.uuidToOverwrites.put(uuid, overwrites);
    }
    
    @Override
    public void onSubscriptionRemoved(@NotNull final Set<UUID> uuids) {
        for (final UUID uuid : uuids) {
            this.uuidToOverwrites.remove(uuid);
        }
    }
    
    public static void updatePropertyMap(final PropertyMap profileProperties, final Property property) {
        profileProperties.removeAll((Object)"textures");
        profileProperties.put((Object)"textures", (Object)property);
    }
    
    public static String getSafeTexturesValue(final GameProfile profile) {
        final MinecraftClient mc = MinecraftClient.getInstance();
        PropertyMap properties = null;
        try {
            if (!mc.getSessionService().getTextures(profile, true).isEmpty()) {
                properties = profile.getProperties();
            }
        }
        catch (final InsecureTextureException ex) {}
        if (properties == null && UUIDUtil.getClientUUID().equals(profile.getId())) {
            properties = mc.getSessionProperties();
        }
        if (properties != null) {
            final Iterator<Property> textures = properties.get((Object)"textures").iterator();
            if (textures.hasNext()) {
                return textures.next().getValue();
            }
        }
        return "e30=";
    }
    
    public static void register(final YggdrasilAuthenticationService authenticationService) throws ReflectiveOperationException {
        final Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafeField.setAccessible(true);
        final Unsafe unsafe = (Unsafe)theUnsafeField.get(null);
        final Field servicesKeyField = YggdrasilAuthenticationService.class.getDeclaredField("servicesKey");
        final long servicesKeyOffset = unsafe.objectFieldOffset(servicesKeyField);
        final ServicesKeyInfo originalKey = (ServicesKeyInfo)unsafe.getObject(authenticationService, servicesKeyOffset);
        final ServicesKeyInfo wrapperKey = (ServicesKeyInfo)new TrustingServicesKeyInfo(originalKey);
        unsafe.putObject(authenticationService, servicesKeyOffset, wrapperKey);
    }
    
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
    
    private static class TrustedProperty extends Property
    {
        public TrustedProperty(final String name, final String value) {
            super(name, value, "trusted");
        }
        
        public boolean isSignatureValid(final PublicKey publicKey) {
            return true;
        }
    }
    
    record TrustingServicesKeyInfo(ServicesKeyInfo inner) implements ServicesKeyInfo {
        public int keyBitCount() {
            return this.inner.keyBitCount();
        }
        
        public int signatureBitCount() {
            return this.inner.signatureBitCount();
        }
        
        public Signature signature() {
            return this.inner.signature();
        }
        
        public boolean validateProperty(final Property property) {
            return property instanceof TrustedProperty || this.inner.validateProperty(property);
        }
    }
}
