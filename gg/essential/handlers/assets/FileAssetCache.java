package gg.essential.handlers.assets;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.mod.*;
import java.util.function.*;
import org.apache.commons.codec.digest.*;
import gg.essential.*;
import kotlin.text.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.concurrent.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010%
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0012
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\rH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u000e""" }, d2 = { "Lgg/essential/handlers/assets/FileAssetCache;", "Lgg/essential/handlers/assets/AssetProvider;", "provider", "(Lgg/essential/handlers/assets/AssetProvider;)V", "assetFutures", "", "", "Ljava/util/concurrent/CompletableFuture;", "", "getProvider", "()Lgg/essential/handlers/assets/AssetProvider;", "getAssetBytes", "asset", "Lgg/essential/mod/EssentialAsset;", "essential" })
public final class FileAssetCache implements AssetProvider
{
    @NotNull
    private final AssetProvider provider;
    @NotNull
    private final Map<String, CompletableFuture<byte[]>> assetFutures;
    
    public FileAssetCache(@NotNull final AssetProvider provider) {
        Intrinsics.checkNotNullParameter((Object)provider, "provider");
        super();
        this.provider = provider;
        this.assetFutures = new ConcurrentHashMap<String, CompletableFuture<byte[]>>();
    }
    
    @NotNull
    @Override
    public CompletableFuture<byte[]> getAssetBytes(@NotNull final EssentialAsset asset) {
        Intrinsics.checkNotNullParameter((Object)asset, "asset");
        final CompletableFuture<byte[]> computeIfAbsent = this.assetFutures.computeIfAbsent(asset.getChecksum(), FileAssetCache::getAssetBytes$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, """
                                                                        assetFutures.computeIfAb\u2026}
                                                                                    }
                                                                                }""");
        return computeIfAbsent;
    }
    
    private static final byte[] getAssetBytes$lambda-3$lambda-0(final Path $cachePath, final EssentialAsset $asset) {
        Intrinsics.checkNotNullParameter((Object)$cachePath, "$cachePath");
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        if (Files.exists($cachePath, new LinkOption[0])) {
            try {
                final byte[] bytes = Files.readAllBytes($cachePath);
                String s = null;
                switch ($asset.getChecksum().length()) {
                    case 64: {
                        s = DigestUtils.sha256Hex(bytes);
                        break;
                    }
                    case 40: {
                        s = DigestUtils.sha1Hex(bytes);
                        break;
                    }
                    case 32: {
                        s = DigestUtils.md5Hex(bytes);
                        break;
                    }
                    default: {
                        Essential.logger.warn("Unknown checksum format for " + $asset.getUrl() + ": " + $asset.getChecksum());
                        return null;
                    }
                }
                final String checksum = s;
                if (StringsKt.equals(checksum, $asset.getChecksum(), true)) {
                    return bytes;
                }
                Essential.logger.warn("Checksum mismatch for {}: {}", (Object)$cachePath, (Object)checksum);
            }
            catch (final IOException e) {
                Essential.logger.warn("Failed to read asset from cache at " + $cachePath + ": ", (Throwable)e);
            }
        }
        return null;
    }
    
    private static final byte[] getAssetBytes$lambda-3$lambda-2$lambda-1(final Path $cachePath, final EssentialAsset $asset, final byte[] it) {
        Intrinsics.checkNotNullParameter((Object)$cachePath, "$cachePath");
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        try {
            Files.createDirectories($cachePath.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
            Files.write($cachePath, it, new OpenOption[0]);
        }
        catch (final IOException e) {
            Essential.logger.error("Failed to cache \"" + $asset.getUrl() + "\" at \"" + $cachePath + "\": ", (Throwable)e);
        }
        return it;
    }
    
    private static final CompletionStage getAssetBytes$lambda-3$lambda-2(final EssentialAsset $asset, final Path $cachePath, final FileAssetCache this$0, final byte[] cachedBytes) {
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        Intrinsics.checkNotNullParameter((Object)$cachePath, "$cachePath");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Future<T> future;
        if (cachedBytes != null) {
            future = (Future<T>)CompletableFuture.completedFuture(cachedBytes);
        }
        else {
            Essential.logger.debug("Downloading asset: {} -> {}", (Object)$asset.getUrl(), (Object)$cachePath);
            future = (Future<T>)this$0.provider.getAssetBytes($asset).thenApplyAsync((Function<? super byte[], ?>)FileAssetCache::getAssetBytes$lambda-3$lambda-2$lambda-1, (Executor)Multithreading.POOL);
        }
        return (CompletionStage)future;
    }
    
    private static final CompletableFuture getAssetBytes$lambda-3(final EssentialAsset $asset, final FileAssetCache this$0, final String it) {
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Path cachePath = ExtensionsKt.getAssetCachePath($asset);
        return CompletableFuture.supplyAsync(FileAssetCache::getAssetBytes$lambda-3$lambda-0, Multithreading.POOL).thenCompose((Function<? super byte[], ? extends CompletionStage<Object>>)FileAssetCache::getAssetBytes$lambda-3$lambda-2);
    }
}
