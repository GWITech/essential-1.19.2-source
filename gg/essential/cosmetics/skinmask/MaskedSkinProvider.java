package gg.essential.cosmetics.skinmask;

import net.minecraft.util.*;
import net.minecraft.client.*;
import gg.essential.mixins.ext.client.renderer.*;
import java.util.concurrent.*;
import java.util.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import gg.essential.lib.caffeine.cache.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.texture.*;
import net.minecraft.client.util.*;
import java.io.*;
import net.minecraft.resource.*;

public class MaskedSkinProvider
{
    private static final DynamicTextureManager dynamicTextureManager;
    private Identifier generatingSkin;
    private SkinMaskConfig generatingConfig;
    private CompletableFuture<UImage> generatingSkinFuture;
    private Identifier generatedSkin;
    private SkinMaskConfig generatedConfig;
    private Identifier generatedId;
    
    public MaskedSkinProvider() {
        super();
    }
    
    public Identifier provide(final Identifier skin, final String skinType, final SkinMaskConfig config) {
        if (config == null || !skin.getPath().startsWith("skins/")) {
            this.generatedSkin = null;
            this.generatedConfig = null;
            return null;
        }
        final TextureManager textureManager = MinecraftClient.getInstance().getTextureManager();
        if (skin.equals((Object)this.generatedSkin) && config.equals(this.generatedConfig) && this.generatedId != null) {
            this.generatedConfig = config;
            MaskedSkinProvider.dynamicTextureManager.keepAlive(this);
            return this.generatedId;
        }
        if (this.generatingSkinFuture == null || !skin.equals((Object)this.generatingSkin) || !config.equals(this.generatingConfig)) {
            final AbstractTexture skinTexture = textureManager.getTexture(skin);
            if (skinTexture == null) {
                return null;
            }
            if (!(skinTexture instanceof PlayerSkinTextureExt)) {
                return null;
            }
            final PlayerSkinTextureExt skinTextureExt = (PlayerSkinTextureExt)skinTexture;
            final UImage skinImage = skinTextureExt.essential$getImage();
            if (skinImage == null) {
                return null;
            }
            this.generatingSkin = skin;
            this.generatingConfig = config;
            this.generatingSkinFuture = SkinMasker.generateMaskedSkin(skinImage, skinType, config);
        }
        final UImage generatedTexture = this.generatingSkinFuture.getNow(null);
        if (generatedTexture == null) {
            return (this.generatedSkin != null) ? this.generatedId : null;
        }
        this.generatedSkin = skin;
        this.generatedConfig = config;
        this.generatingSkin = null;
        this.generatingConfig = null;
        this.generatingSkinFuture = null;
        this.generatedId = MaskedSkinProvider.dynamicTextureManager.generateUniqueId(this.generatedSkin.toString().replace(':', '/'));
        MaskedSkinProvider.dynamicTextureManager.register(this, this.generatedId, new MaskedSkinTexture(generatedTexture));
        return this.generatedId;
    }
    
    void expireTexture(final Identifier id) {
        if (id.equals((Object)this.generatedId)) {
            this.generatedId = null;
        }
        MinecraftClient.getInstance().getTextureManager().destroyTexture(id);
    }
    
    static {
        dynamicTextureManager = new DynamicTextureManager();
    }
    
    private static class DynamicTextureManager implements RemovalListener<MaskedSkinProvider, Identifier>
    {
        private final Cache<MaskedSkinProvider, Identifier> loaded;
        private int nextUniqueId;
        
        private DynamicTextureManager() {
            super();
            this.loaded = Caffeine.newBuilder().expireAfterAccess(1L, TimeUnit.MINUTES).executor(Multithreading.POOL).scheduler(Scheduler.forScheduledExecutorService(gg.essential.api.utils.Multithreading.getScheduledPool())).removalListener((RemovalListener<? super Object, ? super Object>)this).build();
        }
        
        public Identifier generateUniqueId(final String name) {
            return new Identifier("essential", String.format(Locale.ROOT, "masked_skins/%s/%d", name, this.nextUniqueId++));
        }
        
        public void register(final MaskedSkinProvider provider, final Identifier id, final MaskedSkinTexture texture) {
            MinecraftClient.getInstance().getTextureManager().registerTexture(id, (AbstractTexture)texture);
            this.loaded.put(provider, id);
        }
        
        public void keepAlive(final MaskedSkinProvider provider) {
            this.loaded.getIfPresent(provider);
        }
        
        public void onRemoval$c6ad518(@Nullable final MaskedSkinProvider provider, @Nullable final Identifier id) {
            if (id == null || provider == null) {
                return;
            }
            ExtensionsKt.getExecutor(UMinecraft.getMinecraft()).execute(() -> provider.expireTexture(id));
        }
        
        @Override
        public /* bridge */ void onRemoval(@Nullable final Object o, @Nullable final Object o2, @NotNull final RemovalCause removalCause) {
            this.onRemoval$c6ad518((MaskedSkinProvider)o, (Identifier)o2);
        }
        
        private static /* synthetic */ void lambda$onRemoval$0(final MaskedSkinProvider provider, final Identifier id) {
            provider.expireTexture(id);
        }
    }
    
    private static class MaskedSkinTexture extends PlayerSkinTexture
    {
        public MaskedSkinTexture(final UImage image) {
            super((File)null, "essential-masked-image", DefaultSkinHelper.getTexture(), false, (Runnable)null);
            ((PlayerSkinTextureExt)this).essential$setImage(image);
        }
        
        public void method_4625(@NotNull final ResourceManager resourceManager) {
        }
    }
}
