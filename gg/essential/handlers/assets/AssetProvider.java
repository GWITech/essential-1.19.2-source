package gg.essential.handlers.assets;

import kotlin.*;
import gg.essential.mod.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006	\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/handlers/assets/AssetProvider;", "", "asSuspendingProvider", "Lgg/essential/mod/asset/AssetProvider;", "getAssetBytes", "Ljava/util/concurrent/CompletableFuture;", "", "asset", "Lgg/essential/mod/EssentialAsset;", "essential" })
public interface AssetProvider
{
    @NotNull
    CompletableFuture<byte[]> getAssetBytes(@NotNull final EssentialAsset p0);
    
    @NotNull
    default gg.essential.mod.asset.AssetProvider asSuspendingProvider() {
        return (gg.essential.mod.asset.AssetProvider)new AssetProvider$asSuspendingProvider.AssetProvider$asSuspendingProvider$1(this);
    }
}
