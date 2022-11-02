package gg.essential.handlers.assets;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.mod.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006	""" }, d2 = { "Lgg/essential/handlers/assets/URLAssetDownloader;", "Lgg/essential/handlers/assets/AssetProvider;", "()V", "download", "", "asset", "Lgg/essential/mod/EssentialAsset;", "getAssetBytes", "Ljava/util/concurrent/CompletableFuture;", "essential" })
public final class URLAssetDownloader implements AssetProvider
{
    @NotNull
    public static final URLAssetDownloader INSTANCE;
    
    private URLAssetDownloader() {
        super();
    }
    
    @NotNull
    @Override
    public CompletableFuture<byte[]> getAssetBytes(@NotNull final EssentialAsset asset) {
        Intrinsics.checkNotNullParameter((Object)asset, "asset");
        final CompletableFuture<byte[]> supplyAsync = CompletableFuture.supplyAsync(URLAssetDownloader::getAssetBytes$lambda-0, Multithreading.POOL);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync({\n          \u2026  }, Multithreading.POOL)");
        return supplyAsync;
    }
    
    private final byte[] download(final EssentialAsset asset) {
        final byte[] downloadToBytes = WebUtil.downloadToBytes(asset.getUrl(), "Mozilla/4.76 (Essential Asset Downloader)");
        Intrinsics.checkNotNullExpressionValue((Object)downloadToBytes, "downloadToBytes(asset.ur\u2026ntial Asset Downloader)\")");
        return downloadToBytes;
    }
    
    private static final byte[] getAssetBytes$lambda-0(final EssentialAsset $asset) {
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        return URLAssetDownloader.INSTANCE.download($asset);
    }
    
    static {
        INSTANCE = new URLAssetDownloader();
    }
}
