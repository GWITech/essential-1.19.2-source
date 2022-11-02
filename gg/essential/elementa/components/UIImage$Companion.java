package gg.essential.elementa.components;

import kotlin.*;
import gg.essential.elementa.utils.*;
import org.jetbrains.annotations.*;
import java.io.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import java.awt.image.*;
import kotlin.jvm.*;
import gg.essential.elementa.components.image.*;
import javax.imageio.*;
import java.net.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017" }, d2 = { "Lgg/essential/elementa/components/UIImage$Companion;", "", "()V", "defaultResourceCache", "Lgg/essential/elementa/utils/ResourceCache;", "getDefaultResourceCache", "()Lgg/essential/elementa/utils/ResourceCache;", "get", "Ljava/awt/image/BufferedImage;", "url", "Ljava/net/URL;", "ofFile", "Lgg/essential/elementa/components/UIImage;", "file", "Ljava/io/File;", "ofResource", "path", "", "ofResourceCached", "resourceCache", "ofURL", "cache", "Lgg/essential/elementa/components/image/ImageCache;", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final ResourceCache getDefaultResourceCache() {
        return UIImage.access$getDefaultResourceCache$cp();
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofFile(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofFile$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { ImageIO.read(file) }");
        return new UIImage(supplyAsync, null, null, 6, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofURL(@NotNull final URL url) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofURL$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { get(url) }");
        return new UIImage(supplyAsync, null, null, 6, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofURL(@NotNull final URL url, @NotNull final ImageCache cache) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        Intrinsics.checkNotNullParameter((Object)cache, "cache");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofURL$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026          }\n            }");
        return new UIImage(supplyAsync, null, null, 6, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofResource(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofResource$lambda-4);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026ream(path))\n            }");
        return new UIImage(supplyAsync, null, null, 6, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofResourceCached(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        return this.ofResourceCached(path, this.getDefaultResourceCache());
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofResourceCached(@NotNull final String path, @NotNull final ResourceCache resourceCache) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        Intrinsics.checkNotNullParameter((Object)resourceCache, "resourceCache");
        return (UIImage)resourceCache.getUIImage(path);
    }
    
    @JvmStatic
    @NotNull
    public final BufferedImage get(@NotNull final URL url) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        final URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        final HttpURLConnection connection = (HttpURLConnection)openConnection;
        connection.setRequestMethod("GET");
        connection.setUseCaches(true);
        connection.addRequestProperty("User-Agent", "Mozilla/4.76 (Elementa)");
        connection.setDoOutput(true);
        final BufferedImage read = ImageIO.read(connection.getInputStream());
        Intrinsics.checkNotNullExpressionValue((Object)read, "read(connection.inputStream)");
        return read;
    }
    
    private static final BufferedImage ofFile$lambda-0(final File $file) {
        Intrinsics.checkNotNullParameter((Object)$file, "$file");
        return ImageIO.read($file);
    }
    
    private static final BufferedImage ofURL$lambda-1(final URL $url) {
        Intrinsics.checkNotNullParameter((Object)$url, "$url");
        return UIImage.Companion.get($url);
    }
    
    private static final BufferedImage ofURL$lambda-3(final ImageCache $cache, final URL $url) {
        Intrinsics.checkNotNullParameter((Object)$cache, "$cache");
        Intrinsics.checkNotNullParameter((Object)$url, "$url");
        final BufferedImage value = $cache.get($url);
        BufferedImage bufferedImage;
        if (value == null) {
            final BufferedImage it = UIImage.Companion.get($url);
            final int n = 0;
            $cache.set($url, it);
            bufferedImage = it;
        }
        else {
            bufferedImage = value;
        }
        return bufferedImage;
    }
    
    private static final BufferedImage ofResource$lambda-4(final Companion this$0, final String $path) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$path, "$path");
        return ImageIO.read(this$0.getClass().getResourceAsStream($path));
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
