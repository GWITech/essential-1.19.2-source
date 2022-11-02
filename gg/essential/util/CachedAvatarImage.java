package gg.essential.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.image.*;
import javax.imageio.*;
import gg.essential.*;
import java.net.*;
import kotlin.io.*;
import java.io.*;
import java.util.*;
import java.nio.file.attribute.*;
import java.nio.file.*;
import gg.essential.elementa.components.*;
import java.util.function.*;
import gg.essential.elementa.components.image.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import java.util.concurrent.*;
import gg.essential.lib.caffeine.cache.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000?
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004
                                                   \u0002\u0010\bR;\u0010	\u001a/\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u000b0\u000b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u0005*
                                                   \u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0
                                                   ¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000R/\u0010\u0011\u001a#\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u000b0\u000b\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\r0\r0
                                                   ¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0017""" }, d2 = { "Lgg/essential/util/CachedAvatarImage;", "", "()V", "cacheBasePath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "cachePath", "gg/essential/util/CachedAvatarImage$cachePath$1", "Lgg/essential/util/CachedAvatarImage$cachePath$1;", "diskCache", "Lgg/essential/lib/caffeine/cache/AsyncLoadingCache;", "Ljava/util/UUID;", "Ljava/util/Optional;", "Ljava/awt/image/BufferedImage;", "Lorg/checkerframework/checker/nullness/qual/NonNull;", "fallbackImage", "Lgg/essential/elementa/components/image/BlurHashImage;", "freshCache", "loadFromDisk", "uuid", "loadFromWeb", "ofUUID", "Lgg/essential/elementa/components/UIImage;", "essential" })
public final class CachedAvatarImage
{
    @NotNull
    public static final CachedAvatarImage INSTANCE;
    private static final Path cacheBasePath;
    @NotNull
    private static final CachedAvatarImage$cachePath.CachedAvatarImage$cachePath$1 cachePath;
    @NotNull
    private static final AsyncLoadingCache<UUID, BufferedImage> freshCache;
    @NotNull
    private static final AsyncLoadingCache<UUID, Optional<BufferedImage>> diskCache;
    @NotNull
    private static final BlurHashImage fallbackImage;
    
    private CachedAvatarImage() {
        super();
    }
    
    private final BufferedImage loadFromDisk(final UUID uuid) {
        final Path path = CachedAvatarImage.cachePath.get(uuid);
        if (!Files.exists(path, (LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) {
            return null;
        }
        BufferedImage read;
        try {
            read = ImageIO.read(path.toFile());
        }
        catch (final Exception e) {
            Essential.logger.warn("Failed to load avatar " + uuid + " from cache: ", (Throwable)e);
            read = null;
        }
        return read;
    }
    
    private final BufferedImage loadFromWeb(final UUID uuid) {
        final URL url = new URL("https://cravatar.eu/helmavatar/" + ExtensionsKt.toDashlessString(uuid));
        byte[] bytes2;
        try {
            bytes2 = TextStreamsKt.readBytes(url);
        }
        catch (final Exception e) {
            Essential.logger.warn("Failed to fetch " + url + ": ", (Throwable)e);
            return null;
        }
        final byte[] bytes = bytes2;
        BufferedImage read;
        try {
            read = ImageIO.read(new ByteArrayInputStream(bytes));
        }
        catch (final Exception e2) {
            Essential.logger.warn("Failed read avatar " + uuid + " image: ", (Throwable)e2);
            return null;
        }
        final BufferedImage image = read;
        final ConcurrentMap<UUID, CompletableFuture<Optional<BufferedImage>>> map = CachedAvatarImage.diskCache.asMap();
        Intrinsics.checkNotNullExpressionValue((Object)map, "diskCache.asMap()");
        map.put(uuid, CompletableFuture.completedFuture(Optional.of(image)));
        try {
            final Path path = CachedAvatarImage.cachePath.get(uuid);
            final Path parent = path.getParent();
            Intrinsics.checkNotNullExpressionValue((Object)parent, "path.parent");
            Intrinsics.checkNotNullExpressionValue((Object)Files.createDirectories(parent, (FileAttribute<?>[])Arrays.copyOf(new FileAttribute[0], 0)), "createDirectories(this, *attributes)");
            Files.write(path, bytes, (OpenOption[])Arrays.copyOf(new OpenOption[0], 0));
        }
        catch (final Exception e) {
            Essential.logger.warn("Failed to write avatar " + uuid + " cache: ", (Throwable)e);
            return null;
        }
        return image;
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofUUID(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture freshFuture = CachedAvatarImage.freshCache.get(uuid).thenApply((Function<? super BufferedImage, ?>)CachedAvatarImage::ofUUID$lambda-2);
        if (freshFuture.isDone()) {
            final CompletableFuture completableFuture = freshFuture.toCompletableFuture();
            Intrinsics.checkNotNullExpressionValue((Object)completableFuture, "freshFuture.toCompletableFuture()");
            return new UIImage(completableFuture, CachedAvatarImage.fallbackImage, null, 4, null);
        }
        final CompletableFuture diskFuture = CachedAvatarImage.diskCache.get(uuid).thenCompose((Function<? super Optional<BufferedImage>, ? extends CompletionStage<Object>>)CachedAvatarImage::ofUUID$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)freshFuture, "freshFuture");
        final CompletableFuture completableFuture2 = freshFuture;
        Intrinsics.checkNotNullExpressionValue((Object)diskFuture, "diskFuture");
        return new UIImage(completableFuture2, new UIImage(diskFuture, CachedAvatarImage.fallbackImage, null, 4, null), null, 4, null);
    }
    
    private static final BufferedImage freshCache$lambda-0(final UUID it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return CachedAvatarImage.INSTANCE.loadFromWeb(it);
    }
    
    private static final Optional diskCache$lambda-1(final UUID it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Optional.ofNullable(CachedAvatarImage.INSTANCE.loadFromDisk(it));
    }
    
    private static final BufferedImage ofUUID$lambda-2(final BufferedImage it) {
        return it;
    }
    
    private static final CompletionStage ofUUID$lambda-3(final CompletableFuture $freshFuture, final Optional it) {
        return it.map(CompletableFuture::completedFuture).orElse($freshFuture);
    }
    
    public static final /* synthetic */ Path access$getCacheBasePath$p() {
        return CachedAvatarImage.cacheBasePath;
    }
    
    static {
        INSTANCE = new CachedAvatarImage();
        cacheBasePath = Essential.getInstance().getBaseDir().toPath().resolve("avatar-cache");
        cachePath = new CachedAvatarImage$cachePath.CachedAvatarImage$cachePath$1();
        final AsyncLoadingCache<Object, BufferedImage> buildAsync = (AsyncLoadingCache<Object, BufferedImage>)Caffeine.newBuilder().expireAfterWrite(30L, TimeUnit.MINUTES).executor(Multithreading.POOL).buildAsync((CacheLoader<? super UUID, BufferedImage>)CachedAvatarImage::freshCache$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)buildAsync, """
                                                                   newBuilder()
                                                                           .ex\u2026oadFromWeb(it)
                                                                           })""");
        freshCache = buildAsync;
        final AsyncLoadingCache<Object, Optional> buildAsync2 = (AsyncLoadingCache<Object, Optional>)Caffeine.newBuilder().expireAfterAccess(10L, TimeUnit.MINUTES).executor(Multithreading.POOL).buildAsync((CacheLoader<? super UUID, Optional>)CachedAvatarImage::diskCache$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)buildAsync2, """
                                                                    newBuilder()
                                                                            .ex\u2026dFromDisk(it))
                                                                            })""");
        diskCache = buildAsync2;
        fallbackImage = new BlurHashImage("U9QuA+e8vyu48wVsVYkq_~tlP9Z~Y7pIyXVX");
    }
}
