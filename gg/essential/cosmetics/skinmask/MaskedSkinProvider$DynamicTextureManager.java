package gg.essential.cosmetics.skinmask;

import net.minecraft.util.*;
import java.util.concurrent.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.texture.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import gg.essential.lib.caffeine.cache.*;
import org.jetbrains.annotations.*;

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
