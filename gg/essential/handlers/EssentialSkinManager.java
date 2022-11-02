package gg.essential.handlers;

import net.minecraft.client.*;
import java.util.function.*;
import com.mojang.authlib.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.gui.notification.*;
import gg.essential.api.utils.mojang.*;
import java.util.*;
import gg.essential.util.*;

public class EssentialSkinManager
{
    private final GameProfileManager gameProfileManager;
    private final BooleanSupplier delayChanges;
    private SkinUpdate queuedSkinChange;
    @NotNull
    private Skin activeSkin;
    
    public EssentialSkinManager(final GameProfileManager gameProfileManager, final BooleanSupplier delayChanges) {
        super();
        this.gameProfileManager = gameProfileManager;
        this.delayChanges = delayChanges;
        this.activeSkin = MinecraftClient.getInstance().getSessionProperties().get((Object)"textures").stream().findFirst().map((Function<? super Object, ? extends Skin>)Skin::fromProperty).orElse(new Skin("", Model.STEVE));
    }
    
    @NotNull
    public Skin getActiveSkin() {
        return this.activeSkin;
    }
    
    @Nullable
    public synchronized Skin fetchActiveSkin() {
        final Property textures = getTextureProperty(UUIDUtil.getClientUUID());
        if (textures == null) {
            return null;
        }
        return this.activeSkin = Skin.fromProperty(textures);
    }
    
    @Nullable
    public static Property getTextureProperty(final UUID uuid) {
        final JsonHolder jsonHolder = WebUtil.fetchJSON(String.format(Locale.ROOT, "https://sessionserver.mojang.com/session/minecraft/profile/%s?unsigned=false", uuid.toString().replace("-", "")));
        if (jsonHolder.getKeys().isEmpty()) {
            return null;
        }
        final JsonObject properties = jsonHolder.optJSONArray("properties").get$a67836b().getAsJsonObject();
        return new Property("textures", properties.get("value").getAsString(), properties.get("signature").getAsString());
    }
    
    @Nullable
    public Skin uploadSkin(final String accessToken, final Model model, final File file) {
        this.queuedSkinChange = new SkinUpload(accessToken, model, file);
        return this.updateSkinNow$12c843ea(true);
    }
    
    public void changeSkin(final String accessToken, final Model model, final String url) {
        this.queuedSkinChange = new SkinChange(accessToken, model, url);
        if (this.delayChanges.getAsBoolean()) {
            return;
        }
        this.updateSkinNow$12c843ea(false);
    }
    
    public void flushChanges() {
        this.updateSkinNow$12c843ea(true);
    }
    
    @Nullable
    private synchronized Skin updateSkinNow$12c843ea(final boolean notification) {
        final SkinUpdate queuedSkinChange = this.queuedSkinChange;
        this.queuedSkinChange = null;
        if (queuedSkinChange == null) {
            return null;
        }
        if (queuedSkinChange.matches(this.activeSkin)) {
            return null;
        }
        final SkinResponse updateSkinWithMojang = queuedSkinChange.execute();
        final Optional<Skin> maybeSkin = Optional.ofNullable(updateSkinWithMojang).flatMap(response -> Optional.ofNullable(response.getSkins())).flatMap(skins -> skins.stream().filter(it -> "ACTIVE".equals(it.getState())).findFirst()).map((Function<? super Object, ? extends Skin>)Skin::fromApi);
        if (maybeSkin.isPresent()) {
            final Skin skin = maybeSkin.get();
            this.gameProfileManager.updatePlayerSkin(UUIDUtil.getClientUUID(), skin.getHash(), skin.getModel().getType());
            this.activeSkin = skin;
            if (notification) {
                Notifications.INSTANCE.push("Skin", "Skin updated successfully");
            }
            return skin;
        }
        if (notification) {
            Notifications.INSTANCE.push("Skin", "Failed to upload skin, please try again");
        }
        return null;
    }
    
    private static /* synthetic */ Optional lambda$updateSkinNow$2(final List skins) {
        return skins.stream().filter(it -> "ACTIVE".equals(it.getState())).findFirst();
    }
    
    private static /* synthetic */ boolean lambda$updateSkinNow$1(final gg.essential.api.utils.mojang.Skin it) {
        return "ACTIVE".equals(it.getState());
    }
    
    private static /* synthetic */ Optional lambda$updateSkinNow$0(final SkinResponse response) {
        return Optional.ofNullable(response.getSkins());
    }
    
    private abstract static class SkinUpdate
    {
        protected final String accessToken;
        protected final Model model;
        
        protected SkinUpdate(final String accessToken, final Model model) {
            super();
            this.accessToken = accessToken;
            this.model = model;
        }
        
        public abstract boolean matches(final Skin p0);
        
        public abstract SkinResponse execute();
    }
    
    private static class SkinUpload extends SkinUpdate
    {
        private final File file;
        
        protected SkinUpload(final String accessToken, final Model model, final File file) {
            super(accessToken, model);
            this.file = file;
        }
        
        @Override
        public boolean matches(final Skin activeSkin) {
            return false;
        }
        
        @Override
        public SkinResponse execute() {
            return MojangAPI.INSTANCE.uploadSkin(this.accessToken, this.model, this.file);
        }
    }
    
    private static class SkinChange extends SkinUpdate
    {
        private final String url;
        
        protected SkinChange(final String accessToken, final Model model, final String url) {
            super(accessToken, model);
            this.url = url;
        }
        
        @Override
        public boolean matches(final Skin activeSkin) {
            return activeSkin.getHash().equals(Skin.hashFromUrl(this.url)) && activeSkin.getModel() == this.model;
        }
        
        @Override
        public SkinResponse execute() {
            return MojangAPI.INSTANCE.changeSkin(this.accessToken, UUIDUtil.getClientUUID(), this.model, this.url);
        }
    }
}
